// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$157 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$157() {}
    static final FunctionDescriptor PTIMERAPCROUTINE_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PTIMERAPCROUTINE_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$157.PTIMERAPCROUTINE_DOWN$FUNC
    );
    static final FunctionDescriptor OpenWaitableTimerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenWaitableTimerW$MH = RuntimeHelper.downcallHandle(
        "OpenWaitableTimerW",
        constants$157.OpenWaitableTimerW$FUNC
    );
    static final FunctionDescriptor SetWaitableTimerEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimerEx$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimerEx",
        constants$157.SetWaitableTimerEx$FUNC
    );
    static final FunctionDescriptor SetWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "SetWaitableTimer",
        constants$157.SetWaitableTimer$FUNC
    );
    static final FunctionDescriptor CancelWaitableTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelWaitableTimer$MH = RuntimeHelper.downcallHandle(
        "CancelWaitableTimer",
        constants$157.CancelWaitableTimer$FUNC
    );
    static final FunctionDescriptor CreateMutexExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExA$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExA",
        constants$157.CreateMutexExA$FUNC
    );
}

