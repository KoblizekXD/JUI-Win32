// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$345 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$345() {}
    static final FunctionDescriptor GetOutlineTextMetricsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOutlineTextMetricsA$MH = RuntimeHelper.downcallHandle(
        "GetOutlineTextMetricsA",
        constants$345.GetOutlineTextMetricsA$FUNC
    );
    static final FunctionDescriptor GetOutlineTextMetricsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetOutlineTextMetricsW$MH = RuntimeHelper.downcallHandle(
        "GetOutlineTextMetricsW",
        constants$345.GetOutlineTextMetricsW$FUNC
    );
    static final FunctionDescriptor GetPaletteEntries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPaletteEntries$MH = RuntimeHelper.downcallHandle(
        "GetPaletteEntries",
        constants$345.GetPaletteEntries$FUNC
    );
    static final FunctionDescriptor GetPixel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetPixel$MH = RuntimeHelper.downcallHandle(
        "GetPixel",
        constants$345.GetPixel$FUNC
    );
    static final FunctionDescriptor GetPixelFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPixelFormat$MH = RuntimeHelper.downcallHandle(
        "GetPixelFormat",
        constants$345.GetPixelFormat$FUNC
    );
    static final FunctionDescriptor GetPolyFillMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPolyFillMode$MH = RuntimeHelper.downcallHandle(
        "GetPolyFillMode",
        constants$345.GetPolyFillMode$FUNC
    );
}


