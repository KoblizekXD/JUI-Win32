// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$250 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$250() {}
    static final FunctionDescriptor RequestWakeupLatency$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RequestWakeupLatency$MH = RuntimeHelper.downcallHandle(
        "RequestWakeupLatency",
        constants$250.RequestWakeupLatency$FUNC
    );
    static final FunctionDescriptor IsSystemResumeAutomatic$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsSystemResumeAutomatic$MH = RuntimeHelper.downcallHandle(
        "IsSystemResumeAutomatic",
        constants$250.IsSystemResumeAutomatic$FUNC
    );
    static final FunctionDescriptor GetThreadSelectorEntry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadSelectorEntry$MH = RuntimeHelper.downcallHandle(
        "GetThreadSelectorEntry",
        constants$250.GetThreadSelectorEntry$FUNC
    );
    static final FunctionDescriptor SetThreadExecutionState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadExecutionState$MH = RuntimeHelper.downcallHandle(
        "SetThreadExecutionState",
        constants$250.SetThreadExecutionState$FUNC
    );
    static final FunctionDescriptor PowerCreateRequest$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PowerCreateRequest$MH = RuntimeHelper.downcallHandle(
        "PowerCreateRequest",
        constants$250.PowerCreateRequest$FUNC
    );
    static final FunctionDescriptor PowerSetRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PowerSetRequest$MH = RuntimeHelper.downcallHandle(
        "PowerSetRequest",
        constants$250.PowerSetRequest$FUNC
    );
}

