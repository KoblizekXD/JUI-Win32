// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$386 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$386() {}
    static final FunctionDescriptor ColorCorrectPalette$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ColorCorrectPalette$MH = RuntimeHelper.downcallHandle(
        "ColorCorrectPalette",
        constants$386.ColorCorrectPalette$FUNC
    );
    static final FunctionDescriptor wglCopyContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglCopyContext$MH = RuntimeHelper.downcallHandle(
        "wglCopyContext",
        constants$386.wglCopyContext$FUNC
    );
    static final FunctionDescriptor wglCreateContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglCreateContext$MH = RuntimeHelper.downcallHandle(
        "wglCreateContext",
        constants$386.wglCreateContext$FUNC
    );
    static final FunctionDescriptor wglCreateLayerContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglCreateLayerContext$MH = RuntimeHelper.downcallHandle(
        "wglCreateLayerContext",
        constants$386.wglCreateLayerContext$FUNC
    );
    static final FunctionDescriptor wglDeleteContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglDeleteContext$MH = RuntimeHelper.downcallHandle(
        "wglDeleteContext",
        constants$386.wglDeleteContext$FUNC
    );
    static final FunctionDescriptor wglGetCurrentContext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle wglGetCurrentContext$MH = RuntimeHelper.downcallHandle(
        "wglGetCurrentContext",
        constants$386.wglGetCurrentContext$FUNC
    );
}


