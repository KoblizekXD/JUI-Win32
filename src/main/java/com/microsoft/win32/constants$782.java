// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$782 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$782() {}
    static final FunctionDescriptor PFN_EXPORT_PRIV_KEY_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_EXPORT_PRIV_KEY_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$782.PFN_EXPORT_PRIV_KEY_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor CryptExportPKCS8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPKCS8$MH = RuntimeHelper.downcallHandle(
        "CryptExportPKCS8",
        constants$782.CryptExportPKCS8$FUNC
    );
    static final FunctionDescriptor CryptExportPKCS8Ex$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptExportPKCS8Ex$MH = RuntimeHelper.downcallHandle(
        "CryptExportPKCS8Ex",
        constants$782.CryptExportPKCS8Ex$FUNC
    );
    static final FunctionDescriptor CryptHashPublicKeyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptHashPublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        "CryptHashPublicKeyInfo",
        constants$782.CryptHashPublicKeyInfo$FUNC
    );
    static final FunctionDescriptor CertRDNValueToStrA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertRDNValueToStrA$MH = RuntimeHelper.downcallHandle(
        "CertRDNValueToStrA",
        constants$782.CertRDNValueToStrA$FUNC
    );
    static final FunctionDescriptor CertRDNValueToStrW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CertRDNValueToStrW$MH = RuntimeHelper.downcallHandle(
        "CertRDNValueToStrW",
        constants$782.CertRDNValueToStrW$FUNC
    );
}


