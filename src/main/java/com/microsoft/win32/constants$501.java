// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$501 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$501() {}
    static final FunctionDescriptor EnumDisplayDevicesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnumDisplayDevicesA$MH = RuntimeHelper.downcallHandle(
        "EnumDisplayDevicesA",
        constants$501.EnumDisplayDevicesA$FUNC
    );
    static final FunctionDescriptor EnumDisplayDevicesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EnumDisplayDevicesW$MH = RuntimeHelper.downcallHandle(
        "EnumDisplayDevicesW",
        constants$501.EnumDisplayDevicesW$FUNC
    );
    static final FunctionDescriptor GetDisplayConfigBufferSizes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDisplayConfigBufferSizes$MH = RuntimeHelper.downcallHandle(
        "GetDisplayConfigBufferSizes",
        constants$501.GetDisplayConfigBufferSizes$FUNC
    );
    static final FunctionDescriptor SetDisplayConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDisplayConfig$MH = RuntimeHelper.downcallHandle(
        "SetDisplayConfig",
        constants$501.SetDisplayConfig$FUNC
    );
    static final FunctionDescriptor QueryDisplayConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryDisplayConfig$MH = RuntimeHelper.downcallHandle(
        "QueryDisplayConfig",
        constants$501.QueryDisplayConfig$FUNC
    );
    static final FunctionDescriptor DisplayConfigGetDeviceInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisplayConfigGetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        "DisplayConfigGetDeviceInfo",
        constants$501.DisplayConfigGetDeviceInfo$FUNC
    );
}


