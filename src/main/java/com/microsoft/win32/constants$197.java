// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$197 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$197() {}
    static final FunctionDescriptor QueueUserWorkItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueueUserWorkItem$MH = RuntimeHelper.downcallHandle(
        "QueueUserWorkItem",
        constants$197.QueueUserWorkItem$FUNC
    );
    static final FunctionDescriptor UnregisterWaitEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnregisterWaitEx$MH = RuntimeHelper.downcallHandle(
        "UnregisterWaitEx",
        constants$197.UnregisterWaitEx$FUNC
    );
    static final FunctionDescriptor CreateTimerQueue$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreateTimerQueue$MH = RuntimeHelper.downcallHandle(
        "CreateTimerQueue",
        constants$197.CreateTimerQueue$FUNC
    );
    static final FunctionDescriptor CreateTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "CreateTimerQueueTimer",
        constants$197.CreateTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor ChangeTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "ChangeTimerQueueTimer",
        constants$197.ChangeTimerQueueTimer$FUNC
    );
    static final FunctionDescriptor DeleteTimerQueueTimer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteTimerQueueTimer$MH = RuntimeHelper.downcallHandle(
        "DeleteTimerQueueTimer",
        constants$197.DeleteTimerQueueTimer$FUNC
    );
}


