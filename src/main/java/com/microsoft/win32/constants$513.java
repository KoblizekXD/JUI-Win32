// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$513 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$513() {}
    static final FunctionDescriptor GetRegisteredRawInputDevices$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetRegisteredRawInputDevices$MH = RuntimeHelper.downcallHandle(
        "GetRegisteredRawInputDevices",
        constants$513.GetRegisteredRawInputDevices$FUNC
    );
    static final FunctionDescriptor GetRawInputDeviceList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetRawInputDeviceList$MH = RuntimeHelper.downcallHandle(
        "GetRawInputDeviceList",
        constants$513.GetRawInputDeviceList$FUNC
    );
    static final FunctionDescriptor DefRawInputProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DefRawInputProc$MH = RuntimeHelper.downcallHandle(
        "DefRawInputProc",
        constants$513.DefRawInputProc$FUNC
    );
    static final FunctionDescriptor GetPointerDevices$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerDevices$MH = RuntimeHelper.downcallHandle(
        "GetPointerDevices",
        constants$513.GetPointerDevices$FUNC
    );
    static final FunctionDescriptor GetPointerDevice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerDevice$MH = RuntimeHelper.downcallHandle(
        "GetPointerDevice",
        constants$513.GetPointerDevice$FUNC
    );
    static final FunctionDescriptor GetPointerDeviceProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerDeviceProperties$MH = RuntimeHelper.downcallHandle(
        "GetPointerDeviceProperties",
        constants$513.GetPointerDeviceProperties$FUNC
    );
}


