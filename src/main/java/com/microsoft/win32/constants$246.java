// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$246 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$246() {}
    static final FunctionDescriptor ConvertFiberToThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle ConvertFiberToThread$MH = RuntimeHelper.downcallHandle(
        "ConvertFiberToThread",
        constants$246.ConvertFiberToThread$FUNC
    );
    static final FunctionDescriptor CreateFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFiberEx$MH = RuntimeHelper.downcallHandle(
        "CreateFiberEx",
        constants$246.CreateFiberEx$FUNC
    );
    static final FunctionDescriptor ConvertThreadToFiberEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiberEx$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiberEx",
        constants$246.ConvertThreadToFiberEx$FUNC
    );
    static final FunctionDescriptor CreateFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFiber$MH = RuntimeHelper.downcallHandle(
        "CreateFiber",
        constants$246.CreateFiber$FUNC
    );
    static final FunctionDescriptor ConvertThreadToFiber$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConvertThreadToFiber$MH = RuntimeHelper.downcallHandle(
        "ConvertThreadToFiber",
        constants$246.ConvertThreadToFiber$FUNC
    );
    static final FunctionDescriptor PUMS_SCHEDULER_ENTRY_POINT$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PUMS_SCHEDULER_ENTRY_POINT_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PUMS_SCHEDULER_ENTRY_POINT_UP$MH = RuntimeHelper.upcallHandle(PUMS_SCHEDULER_ENTRY_POINT.class, "apply", constants$246.PUMS_SCHEDULER_ENTRY_POINT_UP$FUNC);
}


