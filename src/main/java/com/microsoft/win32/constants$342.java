// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$342 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$342() {}
    static final FunctionDescriptor GetClipBox$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClipBox$MH = RuntimeHelper.downcallHandle(
        "GetClipBox",
        constants$342.GetClipBox$FUNC
    );
    static final FunctionDescriptor GetClipRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClipRgn$MH = RuntimeHelper.downcallHandle(
        "GetClipRgn",
        constants$342.GetClipRgn$FUNC
    );
    static final FunctionDescriptor GetMetaRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMetaRgn$MH = RuntimeHelper.downcallHandle(
        "GetMetaRgn",
        constants$342.GetMetaRgn$FUNC
    );
    static final FunctionDescriptor GetCurrentObject$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetCurrentObject$MH = RuntimeHelper.downcallHandle(
        "GetCurrentObject",
        constants$342.GetCurrentObject$FUNC
    );
    static final FunctionDescriptor GetCurrentPositionEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentPositionEx$MH = RuntimeHelper.downcallHandle(
        "GetCurrentPositionEx",
        constants$342.GetCurrentPositionEx$FUNC
    );
    static final FunctionDescriptor GetDeviceCaps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDeviceCaps$MH = RuntimeHelper.downcallHandle(
        "GetDeviceCaps",
        constants$342.GetDeviceCaps$FUNC
    );
}


