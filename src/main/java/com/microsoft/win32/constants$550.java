// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$550 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$550() {}
    static final FunctionDescriptor WriteConsoleW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WriteConsoleW$MH = RuntimeHelper.downcallHandle(
        "WriteConsoleW",
        constants$550.WriteConsoleW$FUNC
    );
    static final FunctionDescriptor PHANDLER_ROUTINE$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor PHANDLER_ROUTINE_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PHANDLER_ROUTINE_UP$MH = RuntimeHelper.upcallHandle(PHANDLER_ROUTINE.class, "apply", constants$550.PHANDLER_ROUTINE_UP$FUNC);
    static final FunctionDescriptor PHANDLER_ROUTINE_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PHANDLER_ROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$550.PHANDLER_ROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor SetConsoleCtrlHandler$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetConsoleCtrlHandler$MH = RuntimeHelper.downcallHandle(
        "SetConsoleCtrlHandler",
        constants$550.SetConsoleCtrlHandler$FUNC
    );
    static final FunctionDescriptor CreatePseudoConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePseudoConsole$MH = RuntimeHelper.downcallHandle(
        "CreatePseudoConsole",
        constants$550.CreatePseudoConsole$FUNC
    );
    static final FunctionDescriptor ResizePseudoConsole$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("_COORD")
    );
    static final MethodHandle ResizePseudoConsole$MH = RuntimeHelper.downcallHandle(
        "ResizePseudoConsole",
        constants$550.ResizePseudoConsole$FUNC
    );
}


