// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$249 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$249() {}
    static final FunctionDescriptor CreateUmsThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateUmsThreadContext$MH = RuntimeHelper.downcallHandle(
        "CreateUmsThreadContext",
        constants$249.CreateUmsThreadContext$FUNC
    );
    static final FunctionDescriptor EnterUmsSchedulingMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnterUmsSchedulingMode$MH = RuntimeHelper.downcallHandle(
        "EnterUmsSchedulingMode",
        constants$249.EnterUmsSchedulingMode$FUNC
    );
    static final FunctionDescriptor GetUmsSystemThreadInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUmsSystemThreadInformation$MH = RuntimeHelper.downcallHandle(
        "GetUmsSystemThreadInformation",
        constants$249.GetUmsSystemThreadInformation$FUNC
    );
    static final FunctionDescriptor SetThreadAffinityMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetThreadAffinityMask$MH = RuntimeHelper.downcallHandle(
        "SetThreadAffinityMask",
        constants$249.SetThreadAffinityMask$FUNC
    );
    static final FunctionDescriptor SetProcessDEPPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetProcessDEPPolicy$MH = RuntimeHelper.downcallHandle(
        "SetProcessDEPPolicy",
        constants$249.SetProcessDEPPolicy$FUNC
    );
    static final FunctionDescriptor GetProcessDEPPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessDEPPolicy$MH = RuntimeHelper.downcallHandle(
        "GetProcessDEPPolicy",
        constants$249.GetProcessDEPPolicy$FUNC
    );
}


