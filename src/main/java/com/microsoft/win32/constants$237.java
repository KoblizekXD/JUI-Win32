// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$237 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$237() {}
    static final FunctionDescriptor QueryProcessCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProcessCycleTime$MH = RuntimeHelper.downcallHandle(
        "QueryProcessCycleTime",
        constants$237.QueryProcessCycleTime$FUNC
    );
    static final FunctionDescriptor QueryIdleProcessorCycleTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryIdleProcessorCycleTime$MH = RuntimeHelper.downcallHandle(
        "QueryIdleProcessorCycleTime",
        constants$237.QueryIdleProcessorCycleTime$FUNC
    );
    static final FunctionDescriptor QueryIdleProcessorCycleTimeEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryIdleProcessorCycleTimeEx$MH = RuntimeHelper.downcallHandle(
        "QueryIdleProcessorCycleTimeEx",
        constants$237.QueryIdleProcessorCycleTimeEx$FUNC
    );
    static final FunctionDescriptor QueryInterruptTimePrecise$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterruptTimePrecise$MH = RuntimeHelper.downcallHandle(
        "QueryInterruptTimePrecise",
        constants$237.QueryInterruptTimePrecise$FUNC
    );
    static final FunctionDescriptor QueryUnbiasedInterruptTimePrecise$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryUnbiasedInterruptTimePrecise$MH = RuntimeHelper.downcallHandle(
        "QueryUnbiasedInterruptTimePrecise",
        constants$237.QueryUnbiasedInterruptTimePrecise$FUNC
    );
    static final FunctionDescriptor QueryInterruptTime$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterruptTime$MH = RuntimeHelper.downcallHandle(
        "QueryInterruptTime",
        constants$237.QueryInterruptTime$FUNC
    );
}


