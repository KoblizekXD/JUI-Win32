// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$771 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$771() {}
    static final FunctionDescriptor PFN_CERT_ENUM_PHYSICAL_STORE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_ENUM_PHYSICAL_STORE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$771.PFN_CERT_ENUM_PHYSICAL_STORE_DOWN$FUNC
    );
    static final FunctionDescriptor CertEnumSystemStoreLocation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumSystemStoreLocation$MH = RuntimeHelper.downcallHandle(
        "CertEnumSystemStoreLocation",
        constants$771.CertEnumSystemStoreLocation$FUNC
    );
    static final FunctionDescriptor CertEnumSystemStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumSystemStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumSystemStore",
        constants$771.CertEnumSystemStore$FUNC
    );
    static final FunctionDescriptor CertEnumPhysicalStore$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertEnumPhysicalStore$MH = RuntimeHelper.downcallHandle(
        "CertEnumPhysicalStore",
        constants$771.CertEnumPhysicalStore$FUNC
    );
    static final FunctionDescriptor CertGetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        "CertGetEnhancedKeyUsage",
        constants$771.CertGetEnhancedKeyUsage$FUNC
    );
    static final FunctionDescriptor CertSetEnhancedKeyUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertSetEnhancedKeyUsage$MH = RuntimeHelper.downcallHandle(
        "CertSetEnhancedKeyUsage",
        constants$771.CertSetEnhancedKeyUsage$FUNC
    );
}


