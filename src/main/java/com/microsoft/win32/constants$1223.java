// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1223 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1223() {}
    static final FunctionDescriptor VarR4CmpR8$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle VarR4CmpR8$MH = RuntimeHelper.downcallHandle(
        "VarR4CmpR8",
        constants$1223.VarR4CmpR8$FUNC
    );
    static final FunctionDescriptor VarR8Round$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarR8Round$MH = RuntimeHelper.downcallHandle(
        "VarR8Round",
        constants$1223.VarR8Round$FUNC
    );
    static final FunctionDescriptor VarDateFromUdate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDateFromUdate$MH = RuntimeHelper.downcallHandle(
        "VarDateFromUdate",
        constants$1223.VarDateFromUdate$FUNC
    );
    static final FunctionDescriptor VarDateFromUdateEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarDateFromUdateEx$MH = RuntimeHelper.downcallHandle(
        "VarDateFromUdateEx",
        constants$1223.VarDateFromUdateEx$FUNC
    );
    static final FunctionDescriptor VarUdateFromDate$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VarUdateFromDate$MH = RuntimeHelper.downcallHandle(
        "VarUdateFromDate",
        constants$1223.VarUdateFromDate$FUNC
    );
    static final FunctionDescriptor GetAltMonthNames$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAltMonthNames$MH = RuntimeHelper.downcallHandle(
        "GetAltMonthNames",
        constants$1223.GetAltMonthNames$FUNC
    );
}


