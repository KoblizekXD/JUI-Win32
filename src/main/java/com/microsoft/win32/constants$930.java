// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$930 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$930() {}
    static final FunctionDescriptor _strtoui64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _strtoui64$MH = RuntimeHelper.downcallHandle(
        "_strtoui64",
        constants$930._strtoui64$FUNC
    );
    static final FunctionDescriptor _strtoui64_l$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _strtoui64_l$MH = RuntimeHelper.downcallHandle(
        "_strtoui64_l",
        constants$930._strtoui64_l$FUNC
    );
    static final FunctionDescriptor _itoa_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _itoa_s$MH = RuntimeHelper.downcallHandle(
        "_itoa_s",
        constants$930._itoa_s$FUNC
    );
    static final FunctionDescriptor _itoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _itoa$MH = RuntimeHelper.downcallHandle(
        "_itoa",
        constants$930._itoa$FUNC
    );
    static final FunctionDescriptor _ltoa_s$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _ltoa_s$MH = RuntimeHelper.downcallHandle(
        "_ltoa_s",
        constants$930._ltoa_s$FUNC
    );
    static final FunctionDescriptor _ltoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _ltoa$MH = RuntimeHelper.downcallHandle(
        "_ltoa",
        constants$930._ltoa$FUNC
    );
}


