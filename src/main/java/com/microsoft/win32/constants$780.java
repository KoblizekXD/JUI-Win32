// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$780 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$780() {}
    static final FunctionDescriptor PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$780.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor CryptImportPublicKeyInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        "CryptImportPublicKeyInfo",
        constants$780.CryptImportPublicKeyInfo$FUNC
    );
    static final FunctionDescriptor CryptImportPublicKeyInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPublicKeyInfoEx$MH = RuntimeHelper.downcallHandle(
        "CryptImportPublicKeyInfoEx",
        constants$780.CryptImportPublicKeyInfoEx$FUNC
    );
    static final FunctionDescriptor CryptImportPublicKeyInfoEx2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptImportPublicKeyInfoEx2$MH = RuntimeHelper.downcallHandle(
        "CryptImportPublicKeyInfoEx2",
        constants$780.CryptImportPublicKeyInfoEx2$FUNC
    );
    static final FunctionDescriptor PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC_UP$MH = RuntimeHelper.upcallHandle(PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC.class, "apply", constants$780.PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC_UP$FUNC);
    static final FunctionDescriptor PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$780.PFN_IMPORT_PUBLIC_KEY_INFO_EX2_FUNC_DOWN$FUNC
    );
}


