// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$718 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$718() {}
    static final FunctionDescriptor CryptSetKeyParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetKeyParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetKeyParam",
        constants$718.CryptSetKeyParam$FUNC
    );
    static final FunctionDescriptor CryptGetKeyParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetKeyParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetKeyParam",
        constants$718.CryptGetKeyParam$FUNC
    );
    static final FunctionDescriptor CryptSetHashParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetHashParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetHashParam",
        constants$718.CryptSetHashParam$FUNC
    );
    static final FunctionDescriptor CryptGetHashParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetHashParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetHashParam",
        constants$718.CryptGetHashParam$FUNC
    );
    static final FunctionDescriptor CryptSetProvParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptSetProvParam$MH = RuntimeHelper.downcallHandle(
        "CryptSetProvParam",
        constants$718.CryptSetProvParam$FUNC
    );
    static final FunctionDescriptor CryptGetProvParam$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CryptGetProvParam$MH = RuntimeHelper.downcallHandle(
        "CryptGetProvParam",
        constants$718.CryptGetProvParam$FUNC
    );
}


