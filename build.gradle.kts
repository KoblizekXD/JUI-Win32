plugins {
    id("java")
    `maven-publish`
    `java-library`
}

group = "lol.koblizek"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    val ENABLE_PREVIEW = "--enable-preview"
    withType<JavaCompile> {
        options.compilerArgs.add(ENABLE_PREVIEW)
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        repositories.maven {
            url = uri("https://repo.jopga.me/releases")

            credentials(PasswordCredentials::class)
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
        groupId = "lol.koblizek"
        artifactId = project.name
        version = project.version as String
        from(components["java"])
    }
}