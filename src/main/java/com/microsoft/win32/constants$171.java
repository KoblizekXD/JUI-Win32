// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$171 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$171() {}
    static final FunctionDescriptor SetProcessMitigationPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetProcessMitigationPolicy$MH = RuntimeHelper.downcallHandle(
        "SetProcessMitigationPolicy",
        constants$171.SetProcessMitigationPolicy$FUNC
    );
    static final FunctionDescriptor FlushInstructionCache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle FlushInstructionCache$MH = RuntimeHelper.downcallHandle(
        "FlushInstructionCache",
        constants$171.FlushInstructionCache$FUNC
    );
    static final FunctionDescriptor GetThreadTimes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadTimes$MH = RuntimeHelper.downcallHandle(
        "GetThreadTimes",
        constants$171.GetThreadTimes$FUNC
    );
    static final FunctionDescriptor OpenProcess$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenProcess$MH = RuntimeHelper.downcallHandle(
        "OpenProcess",
        constants$171.OpenProcess$FUNC
    );
    static final FunctionDescriptor IsProcessorFeaturePresent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsProcessorFeaturePresent$MH = RuntimeHelper.downcallHandle(
        "IsProcessorFeaturePresent",
        constants$171.IsProcessorFeaturePresent$FUNC
    );
    static final FunctionDescriptor GetProcessHandleCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessHandleCount$MH = RuntimeHelper.downcallHandle(
        "GetProcessHandleCount",
        constants$171.GetProcessHandleCount$FUNC
    );
}


