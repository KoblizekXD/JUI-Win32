// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$743 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$743() {}
    static final FunctionDescriptor CryptRegisterOIDInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptRegisterOIDInfo$MH = RuntimeHelper.downcallHandle(
        "CryptRegisterOIDInfo",
        constants$743.CryptRegisterOIDInfo$FUNC
    );
    static final FunctionDescriptor CryptUnregisterOIDInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptUnregisterOIDInfo$MH = RuntimeHelper.downcallHandle(
        "CryptUnregisterOIDInfo",
        constants$743.CryptUnregisterOIDInfo$FUNC
    );
    static final FunctionDescriptor PFN_CRYPT_ENUM_OID_INFO$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_CRYPT_ENUM_OID_INFO_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ENUM_OID_INFO_UP$MH = RuntimeHelper.upcallHandle(PFN_CRYPT_ENUM_OID_INFO.class, "apply", constants$743.PFN_CRYPT_ENUM_OID_INFO_UP$FUNC);
    static final FunctionDescriptor PFN_CRYPT_ENUM_OID_INFO_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_ENUM_OID_INFO_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$743.PFN_CRYPT_ENUM_OID_INFO_DOWN$FUNC
    );
    static final FunctionDescriptor CryptEnumOIDInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptEnumOIDInfo$MH = RuntimeHelper.downcallHandle(
        "CryptEnumOIDInfo",
        constants$743.CryptEnumOIDInfo$FUNC
    );
    static final FunctionDescriptor CryptFindLocalizedName$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptFindLocalizedName$MH = RuntimeHelper.downcallHandle(
        "CryptFindLocalizedName",
        constants$743.CryptFindLocalizedName$FUNC
    );
}


