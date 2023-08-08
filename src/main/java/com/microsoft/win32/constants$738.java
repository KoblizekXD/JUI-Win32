// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$738 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$738() {}
    static final FunctionDescriptor PCRYPT_DECRYPT_PRIVATE_KEY_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("_CRYPT_ALGORITHM_IDENTIFIER"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("_CRYPTOAPI_BLOB"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PCRYPT_DECRYPT_PRIVATE_KEY_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$738.PCRYPT_DECRYPT_PRIVATE_KEY_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC_UP$MH = RuntimeHelper.upcallHandle(PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC.class, "apply", constants$738.PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC_UP$FUNC);
    static final FunctionDescriptor PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$738.PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor PCRYPT_RESOLVE_HCRYPTPROV_FUNC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PCRYPT_RESOLVE_HCRYPTPROV_FUNC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PCRYPT_RESOLVE_HCRYPTPROV_FUNC_UP$MH = RuntimeHelper.upcallHandle(PCRYPT_RESOLVE_HCRYPTPROV_FUNC.class, "apply", constants$738.PCRYPT_RESOLVE_HCRYPTPROV_FUNC_UP$FUNC);
    static final FunctionDescriptor PCRYPT_RESOLVE_HCRYPTPROV_FUNC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PCRYPT_RESOLVE_HCRYPTPROV_FUNC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$738.PCRYPT_RESOLVE_HCRYPTPROV_FUNC_DOWN$FUNC
    );
    static final FunctionDescriptor CryptFormatObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptFormatObject$MH = RuntimeHelper.downcallHandle(
        "CryptFormatObject",
        constants$738.CryptFormatObject$FUNC
    );
}

