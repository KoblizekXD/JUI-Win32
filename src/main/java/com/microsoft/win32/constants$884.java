// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$884 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$884() {}
    static final FunctionDescriptor AbortPrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AbortPrinter$MH = RuntimeHelper.downcallHandle(
        "AbortPrinter",
        constants$884.AbortPrinter$FUNC
    );
    static final FunctionDescriptor ReadPrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ReadPrinter$MH = RuntimeHelper.downcallHandle(
        "ReadPrinter",
        constants$884.ReadPrinter$FUNC
    );
    static final FunctionDescriptor EndDocPrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EndDocPrinter$MH = RuntimeHelper.downcallHandle(
        "EndDocPrinter",
        constants$884.EndDocPrinter$FUNC
    );
    static final FunctionDescriptor AddJobA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddJobA$MH = RuntimeHelper.downcallHandle(
        "AddJobA",
        constants$884.AddJobA$FUNC
    );
    static final FunctionDescriptor AddJobW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddJobW$MH = RuntimeHelper.downcallHandle(
        "AddJobW",
        constants$884.AddJobW$FUNC
    );
    static final FunctionDescriptor ScheduleJob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ScheduleJob$MH = RuntimeHelper.downcallHandle(
        "ScheduleJob",
        constants$884.ScheduleJob$FUNC
    );
}


