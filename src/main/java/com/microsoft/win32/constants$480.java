// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$480 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$480() {}
    static final FunctionDescriptor FrameRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FrameRect$MH = RuntimeHelper.downcallHandle(
        "FrameRect",
        constants$480.FrameRect$FUNC
    );
    static final FunctionDescriptor InvertRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InvertRect$MH = RuntimeHelper.downcallHandle(
        "InvertRect",
        constants$480.InvertRect$FUNC
    );
    static final FunctionDescriptor SetRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetRect$MH = RuntimeHelper.downcallHandle(
        "SetRect",
        constants$480.SetRect$FUNC
    );
    static final FunctionDescriptor SetRectEmpty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetRectEmpty$MH = RuntimeHelper.downcallHandle(
        "SetRectEmpty",
        constants$480.SetRectEmpty$FUNC
    );
    static final FunctionDescriptor CopyRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CopyRect$MH = RuntimeHelper.downcallHandle(
        "CopyRect",
        constants$480.CopyRect$FUNC
    );
    static final FunctionDescriptor InflateRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InflateRect$MH = RuntimeHelper.downcallHandle(
        "InflateRect",
        constants$480.InflateRect$FUNC
    );
}


