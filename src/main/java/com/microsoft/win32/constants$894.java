// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$894 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$894() {}
    static final FunctionDescriptor ConfigurePortA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConfigurePortA$MH = RuntimeHelper.downcallHandle(
        "ConfigurePortA",
        constants$894.ConfigurePortA$FUNC
    );
    static final FunctionDescriptor ConfigurePortW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ConfigurePortW$MH = RuntimeHelper.downcallHandle(
        "ConfigurePortW",
        constants$894.ConfigurePortW$FUNC
    );
    static final FunctionDescriptor DeletePortA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePortA$MH = RuntimeHelper.downcallHandle(
        "DeletePortA",
        constants$894.DeletePortA$FUNC
    );
    static final FunctionDescriptor DeletePortW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePortW$MH = RuntimeHelper.downcallHandle(
        "DeletePortW",
        constants$894.DeletePortW$FUNC
    );
    static final FunctionDescriptor XcvDataW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle XcvDataW$MH = RuntimeHelper.downcallHandle(
        "XcvDataW",
        constants$894.XcvDataW$FUNC
    );
    static final FunctionDescriptor GetDefaultPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDefaultPrinterA$MH = RuntimeHelper.downcallHandle(
        "GetDefaultPrinterA",
        constants$894.GetDefaultPrinterA$FUNC
    );
}

