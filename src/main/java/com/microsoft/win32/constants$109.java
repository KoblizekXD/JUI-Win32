// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$109 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$109() {}
    static final FunctionDescriptor PTP_CLEANUP_GROUP_CANCEL_CALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_CLEANUP_GROUP_CANCEL_CALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$109.PTP_CLEANUP_GROUP_CANCEL_CALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor PTP_WORK_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PTP_WORK_CALLBACK_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_WORK_CALLBACK_UP$MH = RuntimeHelper.upcallHandle(PTP_WORK_CALLBACK.class, "apply", constants$109.PTP_WORK_CALLBACK_UP$FUNC);
    static final FunctionDescriptor PTP_WORK_CALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_WORK_CALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$109.PTP_WORK_CALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor PTP_TIMER_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PTP_TIMER_CALLBACK_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_TIMER_CALLBACK_UP$MH = RuntimeHelper.upcallHandle(PTP_TIMER_CALLBACK.class, "apply", constants$109.PTP_TIMER_CALLBACK_UP$FUNC);
    static final FunctionDescriptor PTP_TIMER_CALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PTP_TIMER_CALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$109.PTP_TIMER_CALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor PTP_WAIT_CALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor PTP_WAIT_CALLBACK_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PTP_WAIT_CALLBACK_UP$MH = RuntimeHelper.upcallHandle(PTP_WAIT_CALLBACK.class, "apply", constants$109.PTP_WAIT_CALLBACK_UP$FUNC);
}


