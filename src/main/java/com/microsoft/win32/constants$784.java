// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$784 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$784() {}
    static final FunctionDescriptor PFN_CRYPT_GET_SIGNER_CERTIFICATE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CRYPT_GET_SIGNER_CERTIFICATE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_GET_SIGNER_CERTIFICATE_UP$MH = RuntimeHelper.upcallHandle(PFN_CRYPT_GET_SIGNER_CERTIFICATE.class, "apply", constants$784.PFN_CRYPT_GET_SIGNER_CERTIFICATE_UP$FUNC);
    static final FunctionDescriptor PFN_CRYPT_GET_SIGNER_CERTIFICATE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_GET_SIGNER_CERTIFICATE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$784.PFN_CRYPT_GET_SIGNER_CERTIFICATE_DOWN$FUNC
    );
    static final FunctionDescriptor CryptSignMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptSignMessage$MH = RuntimeHelper.downcallHandle(
        "CryptSignMessage",
        constants$784.CryptSignMessage$FUNC
    );
    static final FunctionDescriptor CryptVerifyMessageSignature$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptVerifyMessageSignature$MH = RuntimeHelper.downcallHandle(
        "CryptVerifyMessageSignature",
        constants$784.CryptVerifyMessageSignature$FUNC
    );
    static final FunctionDescriptor CryptGetMessageSignerCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetMessageSignerCount$MH = RuntimeHelper.downcallHandle(
        "CryptGetMessageSignerCount",
        constants$784.CryptGetMessageSignerCount$FUNC
    );
    static final FunctionDescriptor CryptGetMessageCertificates$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetMessageCertificates$MH = RuntimeHelper.downcallHandle(
        "CryptGetMessageCertificates",
        constants$784.CryptGetMessageCertificates$FUNC
    );
}


