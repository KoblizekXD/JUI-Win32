// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$178 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$178() {}
    static final FunctionDescriptor GetSystemLeapSecondInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemLeapSecondInformation$MH = RuntimeHelper.downcallHandle(
        "GetSystemLeapSecondInformation",
        constants$178.GetSystemLeapSecondInformation$FUNC
    );
    static final FunctionDescriptor GetVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetVersion$MH = RuntimeHelper.downcallHandle(
        "GetVersion",
        constants$178.GetVersion$FUNC
    );
    static final FunctionDescriptor SetLocalTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetLocalTime$MH = RuntimeHelper.downcallHandle(
        "SetLocalTime",
        constants$178.SetLocalTime$FUNC
    );
    static final FunctionDescriptor GetTickCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetTickCount$MH = RuntimeHelper.downcallHandle(
        "GetTickCount",
        constants$178.GetTickCount$FUNC
    );
    static final FunctionDescriptor GetTickCount64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetTickCount64$MH = RuntimeHelper.downcallHandle(
        "GetTickCount64",
        constants$178.GetTickCount64$FUNC
    );
    static final FunctionDescriptor GetSystemTimeAdjustment$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemTimeAdjustment$MH = RuntimeHelper.downcallHandle(
        "GetSystemTimeAdjustment",
        constants$178.GetSystemTimeAdjustment$FUNC
    );
}


