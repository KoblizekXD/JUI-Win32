// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$172 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$172() {}
    static final FunctionDescriptor GetCurrentProcessorNumber$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetCurrentProcessorNumber$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcessorNumber",
        constants$172.GetCurrentProcessorNumber$FUNC
    );
    static final FunctionDescriptor SetThreadIdealProcessorEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadIdealProcessorEx$MH = RuntimeHelper.downcallHandle(
        "SetThreadIdealProcessorEx",
        constants$172.SetThreadIdealProcessorEx$FUNC
    );
    static final FunctionDescriptor GetThreadIdealProcessorEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadIdealProcessorEx$MH = RuntimeHelper.downcallHandle(
        "GetThreadIdealProcessorEx",
        constants$172.GetThreadIdealProcessorEx$FUNC
    );
    static final FunctionDescriptor GetCurrentProcessorNumberEx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentProcessorNumberEx$MH = RuntimeHelper.downcallHandle(
        "GetCurrentProcessorNumberEx",
        constants$172.GetCurrentProcessorNumberEx$FUNC
    );
    static final FunctionDescriptor GetProcessPriorityBoost$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessPriorityBoost$MH = RuntimeHelper.downcallHandle(
        "GetProcessPriorityBoost",
        constants$172.GetProcessPriorityBoost$FUNC
    );
    static final FunctionDescriptor SetProcessPriorityBoost$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessPriorityBoost$MH = RuntimeHelper.downcallHandle(
        "SetProcessPriorityBoost",
        constants$172.SetProcessPriorityBoost$FUNC
    );
}

