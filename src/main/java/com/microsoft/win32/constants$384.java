// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$384 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$384() {}
    static final FunctionDescriptor DeleteColorSpace$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteColorSpace$MH = RuntimeHelper.downcallHandle(
        "DeleteColorSpace",
        constants$384.DeleteColorSpace$FUNC
    );
    static final FunctionDescriptor GetICMProfileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetICMProfileA$MH = RuntimeHelper.downcallHandle(
        "GetICMProfileA",
        constants$384.GetICMProfileA$FUNC
    );
    static final FunctionDescriptor GetICMProfileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetICMProfileW$MH = RuntimeHelper.downcallHandle(
        "GetICMProfileW",
        constants$384.GetICMProfileW$FUNC
    );
    static final FunctionDescriptor SetICMProfileA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetICMProfileA$MH = RuntimeHelper.downcallHandle(
        "SetICMProfileA",
        constants$384.SetICMProfileA$FUNC
    );
    static final FunctionDescriptor SetICMProfileW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetICMProfileW$MH = RuntimeHelper.downcallHandle(
        "SetICMProfileW",
        constants$384.SetICMProfileW$FUNC
    );
    static final FunctionDescriptor GetDeviceGammaRamp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDeviceGammaRamp$MH = RuntimeHelper.downcallHandle(
        "GetDeviceGammaRamp",
        constants$384.GetDeviceGammaRamp$FUNC
    );
}


