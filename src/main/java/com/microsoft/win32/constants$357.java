// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$357 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$357() {}
    static final FunctionDescriptor RoundRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RoundRect$MH = RuntimeHelper.downcallHandle(
        "RoundRect",
        constants$357.RoundRect$FUNC
    );
    static final FunctionDescriptor ResizePalette$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ResizePalette$MH = RuntimeHelper.downcallHandle(
        "ResizePalette",
        constants$357.ResizePalette$FUNC
    );
    static final FunctionDescriptor SaveDC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SaveDC$MH = RuntimeHelper.downcallHandle(
        "SaveDC",
        constants$357.SaveDC$FUNC
    );
    static final FunctionDescriptor SelectClipRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SelectClipRgn$MH = RuntimeHelper.downcallHandle(
        "SelectClipRgn",
        constants$357.SelectClipRgn$FUNC
    );
    static final FunctionDescriptor ExtSelectClipRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExtSelectClipRgn$MH = RuntimeHelper.downcallHandle(
        "ExtSelectClipRgn",
        constants$357.ExtSelectClipRgn$FUNC
    );
    static final FunctionDescriptor SetMetaRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMetaRgn$MH = RuntimeHelper.downcallHandle(
        "SetMetaRgn",
        constants$357.SetMetaRgn$FUNC
    );
}

