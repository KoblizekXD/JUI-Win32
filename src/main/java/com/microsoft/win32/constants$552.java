// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$552 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$552() {}
    static final FunctionDescriptor SetConsoleActiveScreenBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleActiveScreenBuffer$MH = RuntimeHelper.downcallHandle(
        "SetConsoleActiveScreenBuffer",
        constants$552.SetConsoleActiveScreenBuffer$FUNC
    );
    static final FunctionDescriptor FlushConsoleInputBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FlushConsoleInputBuffer$MH = RuntimeHelper.downcallHandle(
        "FlushConsoleInputBuffer",
        constants$552.FlushConsoleInputBuffer$FUNC
    );
    static final FunctionDescriptor SetConsoleCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetConsoleCP$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCP",
        constants$552.SetConsoleCP$FUNC
    );
    static final FunctionDescriptor SetConsoleOutputCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetConsoleOutputCP$MH = RuntimeHelper.downcallHandle(
        "SetConsoleOutputCP",
        constants$552.SetConsoleOutputCP$FUNC
    );
    static final FunctionDescriptor GetConsoleCursorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetConsoleCursorInfo$MH = RuntimeHelper.downcallHandle(
        "GetConsoleCursorInfo",
        constants$552.GetConsoleCursorInfo$FUNC
    );
    static final FunctionDescriptor SetConsoleCursorInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetConsoleCursorInfo$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCursorInfo",
        constants$552.SetConsoleCursorInfo$FUNC
    );
}


