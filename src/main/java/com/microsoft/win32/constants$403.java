// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$403 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$403() {}
    static final FunctionDescriptor OpenWindowStationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenWindowStationW$MH = RuntimeHelper.downcallHandle(
        "OpenWindowStationW",
        constants$403.OpenWindowStationW$FUNC
    );
    static final FunctionDescriptor EnumWindowStationsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindowStationsA$MH = RuntimeHelper.downcallHandle(
        "EnumWindowStationsA",
        constants$403.EnumWindowStationsA$FUNC
    );
    static final FunctionDescriptor EnumWindowStationsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindowStationsW$MH = RuntimeHelper.downcallHandle(
        "EnumWindowStationsW",
        constants$403.EnumWindowStationsW$FUNC
    );
    static final FunctionDescriptor CloseWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseWindowStation$MH = RuntimeHelper.downcallHandle(
        "CloseWindowStation",
        constants$403.CloseWindowStation$FUNC
    );
    static final FunctionDescriptor SetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "SetProcessWindowStation",
        constants$403.SetProcessWindowStation$FUNC
    );
    static final FunctionDescriptor GetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "GetProcessWindowStation",
        constants$403.GetProcessWindowStation$FUNC
    );
}


