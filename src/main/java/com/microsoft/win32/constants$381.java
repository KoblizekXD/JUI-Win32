// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$381 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$381() {}
    static final FunctionDescriptor GetDCOrgEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDCOrgEx$MH = RuntimeHelper.downcallHandle(
        "GetDCOrgEx",
        constants$381.GetDCOrgEx$FUNC
    );
    static final FunctionDescriptor FixBrushOrgEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FixBrushOrgEx$MH = RuntimeHelper.downcallHandle(
        "FixBrushOrgEx",
        constants$381.FixBrushOrgEx$FUNC
    );
    static final FunctionDescriptor UnrealizeObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnrealizeObject$MH = RuntimeHelper.downcallHandle(
        "UnrealizeObject",
        constants$381.UnrealizeObject$FUNC
    );
    static final FunctionDescriptor GdiFlush$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GdiFlush$MH = RuntimeHelper.downcallHandle(
        "GdiFlush",
        constants$381.GdiFlush$FUNC
    );
    static final FunctionDescriptor GdiSetBatchLimit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GdiSetBatchLimit$MH = RuntimeHelper.downcallHandle(
        "GdiSetBatchLimit",
        constants$381.GdiSetBatchLimit$FUNC
    );
    static final FunctionDescriptor GdiGetBatchLimit$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GdiGetBatchLimit$MH = RuntimeHelper.downcallHandle(
        "GdiGetBatchLimit",
        constants$381.GdiGetBatchLimit$FUNC
    );
}


