// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$934 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$934() {}
    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        "mbtowc",
        constants$934.mbtowc$FUNC
    );
    static final FunctionDescriptor _mbtowc_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mbtowc_l$MH = RuntimeHelper.downcallHandle(
        "_mbtowc_l",
        constants$934._mbtowc_l$FUNC
    );
    static final FunctionDescriptor mbstowcs_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbstowcs_s$MH = RuntimeHelper.downcallHandle(
        "mbstowcs_s",
        constants$934.mbstowcs_s$FUNC
    );
    static final FunctionDescriptor mbstowcs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle mbstowcs$MH = RuntimeHelper.downcallHandle(
        "mbstowcs",
        constants$934.mbstowcs$FUNC
    );
    static final FunctionDescriptor _mbstowcs_s_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mbstowcs_s_l$MH = RuntimeHelper.downcallHandle(
        "_mbstowcs_s_l",
        constants$934._mbstowcs_s_l$FUNC
    );
    static final FunctionDescriptor _mbstowcs_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mbstowcs_l$MH = RuntimeHelper.downcallHandle(
        "_mbstowcs_l",
        constants$934._mbstowcs_l$FUNC
    );
}


