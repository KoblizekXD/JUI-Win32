// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$794 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$794() {}
    static final FunctionDescriptor CertDuplicateCertificateChain$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertDuplicateCertificateChain$MH = RuntimeHelper.downcallHandle(
        "CertDuplicateCertificateChain",
        constants$794.CertDuplicateCertificateChain$FUNC
    );
    static final FunctionDescriptor CertFindChainInStore$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertFindChainInStore$MH = RuntimeHelper.downcallHandle(
        "CertFindChainInStore",
        constants$794.CertFindChainInStore$FUNC
    );
    static final FunctionDescriptor PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK_UP$MH = RuntimeHelper.upcallHandle(PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK.class, "apply", constants$794.PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK_UP$FUNC);
    static final FunctionDescriptor PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$794.PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor CertVerifyCertificateChainPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CertVerifyCertificateChainPolicy$MH = RuntimeHelper.downcallHandle(
        "CertVerifyCertificateChainPolicy",
        constants$794.CertVerifyCertificateChainPolicy$FUNC
    );
    static final FunctionDescriptor CryptStringToBinaryA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptStringToBinaryA$MH = RuntimeHelper.downcallHandle(
        "CryptStringToBinaryA",
        constants$794.CryptStringToBinaryA$FUNC
    );
}

