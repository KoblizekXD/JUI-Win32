// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$378 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$378() {}
    static final FunctionDescriptor Polyline$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Polyline$MH = RuntimeHelper.downcallHandle(
        "Polyline",
        constants$378.Polyline$FUNC
    );
    static final FunctionDescriptor PolyBezier$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PolyBezier$MH = RuntimeHelper.downcallHandle(
        "PolyBezier",
        constants$378.PolyBezier$FUNC
    );
    static final FunctionDescriptor PolyBezierTo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PolyBezierTo$MH = RuntimeHelper.downcallHandle(
        "PolyBezierTo",
        constants$378.PolyBezierTo$FUNC
    );
    static final FunctionDescriptor PolylineTo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PolylineTo$MH = RuntimeHelper.downcallHandle(
        "PolylineTo",
        constants$378.PolylineTo$FUNC
    );
    static final FunctionDescriptor SetViewportExtEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetViewportExtEx$MH = RuntimeHelper.downcallHandle(
        "SetViewportExtEx",
        constants$378.SetViewportExtEx$FUNC
    );
    static final FunctionDescriptor SetViewportOrgEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetViewportOrgEx$MH = RuntimeHelper.downcallHandle(
        "SetViewportOrgEx",
        constants$378.SetViewportOrgEx$FUNC
    );
}


