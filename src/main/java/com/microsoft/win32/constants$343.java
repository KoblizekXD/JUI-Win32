// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$343 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$343() {}
    static final FunctionDescriptor GetDIBits$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetDIBits$MH = RuntimeHelper.downcallHandle(
        "GetDIBits",
        constants$343.GetDIBits$FUNC
    );
    static final FunctionDescriptor GetFontData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetFontData$MH = RuntimeHelper.downcallHandle(
        "GetFontData",
        constants$343.GetFontData$FUNC
    );
    static final FunctionDescriptor GetGlyphOutlineA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGlyphOutlineA$MH = RuntimeHelper.downcallHandle(
        "GetGlyphOutlineA",
        constants$343.GetGlyphOutlineA$FUNC
    );
    static final FunctionDescriptor GetGlyphOutlineW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGlyphOutlineW$MH = RuntimeHelper.downcallHandle(
        "GetGlyphOutlineW",
        constants$343.GetGlyphOutlineW$FUNC
    );
    static final FunctionDescriptor GetGraphicsMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGraphicsMode$MH = RuntimeHelper.downcallHandle(
        "GetGraphicsMode",
        constants$343.GetGraphicsMode$FUNC
    );
    static final FunctionDescriptor GetMapMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMapMode$MH = RuntimeHelper.downcallHandle(
        "GetMapMode",
        constants$343.GetMapMode$FUNC
    );
}


