// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$717 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$717() {}
    static final FunctionDescriptor CryptAcquireContextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptAcquireContextA$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireContextA",
        constants$717.CryptAcquireContextA$FUNC
    );
    static final FunctionDescriptor CryptAcquireContextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptAcquireContextW$MH = RuntimeHelper.downcallHandle(
        "CryptAcquireContextW",
        constants$717.CryptAcquireContextW$FUNC
    );
    static final FunctionDescriptor CryptReleaseContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptReleaseContext$MH = RuntimeHelper.downcallHandle(
        "CryptReleaseContext",
        constants$717.CryptReleaseContext$FUNC
    );
    static final FunctionDescriptor CryptGenKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptGenKey$MH = RuntimeHelper.downcallHandle(
        "CryptGenKey",
        constants$717.CryptGenKey$FUNC
    );
    static final FunctionDescriptor CryptDeriveKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CryptDeriveKey$MH = RuntimeHelper.downcallHandle(
        "CryptDeriveKey",
        constants$717.CryptDeriveKey$FUNC
    );
    static final FunctionDescriptor CryptDestroyKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CryptDestroyKey$MH = RuntimeHelper.downcallHandle(
        "CryptDestroyKey",
        constants$717.CryptDestroyKey$FUNC
    );
}


