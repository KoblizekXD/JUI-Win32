// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$555 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$555() {}
    static final FunctionDescriptor ReadConsoleOutputCharacterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadConsoleOutputCharacterW$MH = RuntimeHelper.downcallHandle(
        "ReadConsoleOutputCharacterW",
        constants$555.ReadConsoleOutputCharacterW$FUNC
    );
    static final FunctionDescriptor ReadConsoleOutputAttribute$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadConsoleOutputAttribute$MH = RuntimeHelper.downcallHandle(
        "ReadConsoleOutputAttribute",
        constants$555.ReadConsoleOutputAttribute$FUNC
    );
    static final FunctionDescriptor WriteConsoleInputA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteConsoleInputA$MH = RuntimeHelper.downcallHandle(
        "WriteConsoleInputA",
        constants$555.WriteConsoleInputA$FUNC
    );
    static final FunctionDescriptor WriteConsoleInputW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteConsoleInputW$MH = RuntimeHelper.downcallHandle(
        "WriteConsoleInputW",
        constants$555.WriteConsoleInputW$FUNC
    );
    static final FunctionDescriptor ScrollConsoleScreenBufferA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScrollConsoleScreenBufferA$MH = RuntimeHelper.downcallHandle(
        "ScrollConsoleScreenBufferA",
        constants$555.ScrollConsoleScreenBufferA$FUNC
    );
    static final FunctionDescriptor ScrollConsoleScreenBufferW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ScrollConsoleScreenBufferW$MH = RuntimeHelper.downcallHandle(
        "ScrollConsoleScreenBufferW",
        constants$555.ScrollConsoleScreenBufferW$FUNC
    );
}


