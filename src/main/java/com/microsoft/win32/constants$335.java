// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$335 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$335() {}
    static final FunctionDescriptor LPFNDEVCAPS$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor LPFNDEVCAPS_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFNDEVCAPS_UP$MH = RuntimeHelper.upcallHandle(LPFNDEVCAPS.class, "apply", constants$335.LPFNDEVCAPS_UP$FUNC);
    static final FunctionDescriptor LPFNDEVCAPS_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LPFNDEVCAPS_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$335.LPFNDEVCAPS_DOWN$FUNC
    );
    static final FunctionDescriptor DeviceCapabilitiesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceCapabilitiesA$MH = RuntimeHelper.downcallHandle(
        "DeviceCapabilitiesA",
        constants$335.DeviceCapabilitiesA$FUNC
    );
    static final FunctionDescriptor DeviceCapabilitiesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeviceCapabilitiesW$MH = RuntimeHelper.downcallHandle(
        "DeviceCapabilitiesW",
        constants$335.DeviceCapabilitiesW$FUNC
    );
    static final FunctionDescriptor DrawEscape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawEscape$MH = RuntimeHelper.downcallHandle(
        "DrawEscape",
        constants$335.DrawEscape$FUNC
    );
    static final FunctionDescriptor Ellipse$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Ellipse$MH = RuntimeHelper.downcallHandle(
        "Ellipse",
        constants$335.Ellipse$FUNC
    );
}


