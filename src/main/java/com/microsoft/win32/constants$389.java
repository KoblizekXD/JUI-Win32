// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$389 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$389() {}
    static final FunctionDescriptor wglRealizeLayerPalette$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglRealizeLayerPalette$MH = RuntimeHelper.downcallHandle(
        "wglRealizeLayerPalette",
        constants$389.wglRealizeLayerPalette$FUNC
    );
    static final FunctionDescriptor wglSwapLayerBuffers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle wglSwapLayerBuffers$MH = RuntimeHelper.downcallHandle(
        "wglSwapLayerBuffers",
        constants$389.wglSwapLayerBuffers$FUNC
    );
    static final FunctionDescriptor wglSwapMultipleBuffers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle wglSwapMultipleBuffers$MH = RuntimeHelper.downcallHandle(
        "wglSwapMultipleBuffers",
        constants$389.wglSwapMultipleBuffers$FUNC
    );
    static final FunctionDescriptor WNDPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor WNDPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WNDPROC_UP$MH = RuntimeHelper.upcallHandle(WNDPROC.class, "apply", constants$389.WNDPROC_UP$FUNC);
    static final FunctionDescriptor WNDPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WNDPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$389.WNDPROC_DOWN$FUNC
    );
    static final FunctionDescriptor DLGPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor DLGPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DLGPROC_UP$MH = RuntimeHelper.upcallHandle(DLGPROC.class, "apply", constants$389.DLGPROC_UP$FUNC);
}

