// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$53 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$53() {}
    static final FunctionDescriptor _mul128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _mul128$MH = RuntimeHelper.downcallHandle(
        "_mul128",
        constants$53._mul128$FUNC
    );
    static final FunctionDescriptor UnsignedMultiply128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnsignedMultiply128$MH = RuntimeHelper.downcallHandle(
        "UnsignedMultiply128",
        constants$53.UnsignedMultiply128$FUNC
    );
    static final FunctionDescriptor _umul128$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _umul128$MH = RuntimeHelper.downcallHandle(
        "_umul128",
        constants$53._umul128$FUNC
    );
    static final FunctionDescriptor __readgsbyte$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __readgsbyte$MH = RuntimeHelper.downcallHandle(
        "__readgsbyte",
        constants$53.__readgsbyte$FUNC
    );
    static final FunctionDescriptor __readgsword$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __readgsword$MH = RuntimeHelper.downcallHandle(
        "__readgsword",
        constants$53.__readgsword$FUNC
    );
    static final FunctionDescriptor __readgsdword$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle __readgsdword$MH = RuntimeHelper.downcallHandle(
        "__readgsdword",
        constants$53.__readgsdword$FUNC
    );
}

