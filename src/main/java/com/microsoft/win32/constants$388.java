// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$388 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$388() {}
    static final FunctionDescriptor SwapBuffers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SwapBuffers$MH = RuntimeHelper.downcallHandle(
        "SwapBuffers",
        constants$388.SwapBuffers$FUNC
    );
    static final FunctionDescriptor wglUseFontOutlinesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglUseFontOutlinesA$MH = RuntimeHelper.downcallHandle(
        "wglUseFontOutlinesA",
        constants$388.wglUseFontOutlinesA$FUNC
    );
    static final FunctionDescriptor wglUseFontOutlinesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglUseFontOutlinesW$MH = RuntimeHelper.downcallHandle(
        "wglUseFontOutlinesW",
        constants$388.wglUseFontOutlinesW$FUNC
    );
    static final FunctionDescriptor wglDescribeLayerPlane$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglDescribeLayerPlane$MH = RuntimeHelper.downcallHandle(
        "wglDescribeLayerPlane",
        constants$388.wglDescribeLayerPlane$FUNC
    );
    static final FunctionDescriptor wglSetLayerPaletteEntries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglSetLayerPaletteEntries$MH = RuntimeHelper.downcallHandle(
        "wglSetLayerPaletteEntries",
        constants$388.wglSetLayerPaletteEntries$FUNC
    );
    static final FunctionDescriptor wglGetLayerPaletteEntries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglGetLayerPaletteEntries$MH = RuntimeHelper.downcallHandle(
        "wglGetLayerPaletteEntries",
        constants$388.wglGetLayerPaletteEntries$FUNC
    );
}

