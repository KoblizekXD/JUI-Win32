// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$162 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$162() {}
    static final FunctionDescriptor GetProcessTimes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessTimes$MH = RuntimeHelper.downcallHandle(
        "GetProcessTimes",
        constants$162.GetProcessTimes$FUNC
    );
    static final FunctionDescriptor GetCurrentProcess$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCurrentProcess$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcess",
        constants$162.GetCurrentProcess$FUNC
    );
    static final FunctionDescriptor GetCurrentProcessId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetCurrentProcessId$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcessId",
        constants$162.GetCurrentProcessId$FUNC
    );
    static final FunctionDescriptor ExitProcess$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitProcess$MH = RuntimeHelper.downcallHandle(
        "ExitProcess",
        constants$162.ExitProcess$FUNC
    );
    static final FunctionDescriptor TerminateProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateProcess$MH = RuntimeHelper.downcallHandle(
        "TerminateProcess",
        constants$162.TerminateProcess$FUNC
    );
    static final FunctionDescriptor GetExitCodeProcess$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetExitCodeProcess$MH = RuntimeHelper.downcallHandle(
        "GetExitCodeProcess",
        constants$162.GetExitCodeProcess$FUNC
    );
}


