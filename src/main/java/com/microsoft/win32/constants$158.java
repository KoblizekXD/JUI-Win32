// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$158 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$158() {}
    static final FunctionDescriptor CreateMutexExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMutexExW$MH = RuntimeHelper.downcallHandle(
        "CreateMutexExW",
        constants$158.CreateMutexExW$FUNC
    );
    static final FunctionDescriptor CreateEventExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateEventExA$MH = RuntimeHelper.downcallHandle(
        "CreateEventExA",
        constants$158.CreateEventExA$FUNC
    );
    static final FunctionDescriptor CreateEventExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateEventExW$MH = RuntimeHelper.downcallHandle(
        "CreateEventExW",
        constants$158.CreateEventExW$FUNC
    );
    static final FunctionDescriptor CreateSemaphoreExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSemaphoreExW$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreExW",
        constants$158.CreateSemaphoreExW$FUNC
    );
    static final FunctionDescriptor CreateWaitableTimerExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerExW$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerExW",
        constants$158.CreateWaitableTimerExW$FUNC
    );
    static final FunctionDescriptor EnterSynchronizationBarrier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnterSynchronizationBarrier$MH = RuntimeHelper.downcallHandle(
        "EnterSynchronizationBarrier",
        constants$158.EnterSynchronizationBarrier$FUNC
    );
}

