// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$553 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$553() {}
    static final FunctionDescriptor GetConsoleScreenBufferInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleScreenBufferInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleScreenBufferInfo",
        constants$553.GetConsoleScreenBufferInfo$FUNC
    );
    static final FunctionDescriptor GetConsoleScreenBufferInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleScreenBufferInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetConsoleScreenBufferInfoEx",
        constants$553.GetConsoleScreenBufferInfoEx$FUNC
    );
    static final FunctionDescriptor SetConsoleScreenBufferInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleScreenBufferInfoEx$MH = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferInfoEx",
        constants$553.SetConsoleScreenBufferInfoEx$FUNC
    );
    static final FunctionDescriptor SetConsoleScreenBufferSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle SetConsoleScreenBufferSize$MH = RuntimeHelper.downcallHandle(
        "SetConsoleScreenBufferSize",
        constants$553.SetConsoleScreenBufferSize$FUNC
    );
    static final FunctionDescriptor SetConsoleCursorPosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle SetConsoleCursorPosition$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCursorPosition",
        constants$553.SetConsoleCursorPosition$FUNC
    );
    static final FunctionDescriptor GetLargestConsoleWindowSize$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("X"),
        Constants$root.C_SHORT$LAYOUT.withName("Y")
    ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLargestConsoleWindowSize$MH = RuntimeHelper.downcallHandle(
        "GetLargestConsoleWindowSize",
        constants$553.GetLargestConsoleWindowSize$FUNC
    );
}


