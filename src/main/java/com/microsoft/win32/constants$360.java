// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$360 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$360() {}
    static final FunctionDescriptor SetMapMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMapMode$MH = RuntimeHelper.downcallHandle(
        "SetMapMode",
        constants$360.SetMapMode$FUNC
    );
    static final FunctionDescriptor SetLayout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLayout$MH = RuntimeHelper.downcallHandle(
        "SetLayout",
        constants$360.SetLayout$FUNC
    );
    static final FunctionDescriptor GetLayout$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLayout$MH = RuntimeHelper.downcallHandle(
        "GetLayout",
        constants$360.GetLayout$FUNC
    );
    static final FunctionDescriptor SetMetaFileBitsEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMetaFileBitsEx$MH = RuntimeHelper.downcallHandle(
        "SetMetaFileBitsEx",
        constants$360.SetMetaFileBitsEx$FUNC
    );
    static final FunctionDescriptor SetPaletteEntries$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPaletteEntries$MH = RuntimeHelper.downcallHandle(
        "SetPaletteEntries",
        constants$360.SetPaletteEntries$FUNC
    );
    static final FunctionDescriptor SetPixel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPixel$MH = RuntimeHelper.downcallHandle(
        "SetPixel",
        constants$360.SetPixel$FUNC
    );
}


