// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$268 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$268() {}
    static final FunctionDescriptor OpenWaitableTimerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenWaitableTimerA$MH = RuntimeHelper.downcallHandle(
        "OpenWaitableTimerA",
        constants$268.OpenWaitableTimerA$FUNC
    );
    static final FunctionDescriptor CreateSemaphoreExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateSemaphoreExA$MH = RuntimeHelper.downcallHandle(
        "CreateSemaphoreExA",
        constants$268.CreateSemaphoreExA$FUNC
    );
    static final FunctionDescriptor CreateWaitableTimerExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateWaitableTimerExA$MH = RuntimeHelper.downcallHandle(
        "CreateWaitableTimerExA",
        constants$268.CreateWaitableTimerExA$FUNC
    );
    static final FunctionDescriptor CreateFileMappingA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileMappingA$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingA",
        constants$268.CreateFileMappingA$FUNC
    );
    static final FunctionDescriptor CreateFileMappingNumaA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateFileMappingNumaA$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingNumaA",
        constants$268.CreateFileMappingNumaA$FUNC
    );
    static final FunctionDescriptor OpenFileMappingA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenFileMappingA$MH = RuntimeHelper.downcallHandle(
        "OpenFileMappingA",
        constants$268.OpenFileMappingA$FUNC
    );
}


