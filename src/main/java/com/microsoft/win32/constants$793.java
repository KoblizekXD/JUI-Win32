// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$793 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$793() {}
    static final FunctionDescriptor CryptCreateKeyIdentifierFromCSP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptCreateKeyIdentifierFromCSP$MH = RuntimeHelper.downcallHandle(
        "CryptCreateKeyIdentifierFromCSP",
        constants$793.CryptCreateKeyIdentifierFromCSP$FUNC
    );
    static final FunctionDescriptor CertCreateCertificateChainEngine$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertCreateCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertCreateCertificateChainEngine",
        constants$793.CertCreateCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateChainEngine$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChainEngine",
        constants$793.CertFreeCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertResyncCertificateChainEngine$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertResyncCertificateChainEngine$MH = RuntimeHelper.downcallHandle(
        "CertResyncCertificateChainEngine",
        constants$793.CertResyncCertificateChainEngine$FUNC
    );
    static final FunctionDescriptor CertGetCertificateChain$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertGetCertificateChain$MH = RuntimeHelper.downcallHandle(
        "CertGetCertificateChain",
        constants$793.CertGetCertificateChain$FUNC
    );
    static final FunctionDescriptor CertFreeCertificateChain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFreeCertificateChain$MH = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChain",
        constants$793.CertFreeCertificateChain$FUNC
    );
}

