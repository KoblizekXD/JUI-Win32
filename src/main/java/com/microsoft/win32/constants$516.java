// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$516 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$516() {}
    static final FunctionDescriptor ShutdownBlockReasonQuery$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShutdownBlockReasonQuery$MH = RuntimeHelper.downcallHandle(
        "ShutdownBlockReasonQuery",
        constants$516.ShutdownBlockReasonQuery$FUNC
    );
    static final FunctionDescriptor ShutdownBlockReasonDestroy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ShutdownBlockReasonDestroy$MH = RuntimeHelper.downcallHandle(
        "ShutdownBlockReasonDestroy",
        constants$516.ShutdownBlockReasonDestroy$FUNC
    );
    static final FunctionDescriptor GetCurrentInputMessageSource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentInputMessageSource$MH = RuntimeHelper.downcallHandle(
        "GetCurrentInputMessageSource",
        constants$516.GetCurrentInputMessageSource$FUNC
    );
    static final FunctionDescriptor GetCIMSSM$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCIMSSM$MH = RuntimeHelper.downcallHandle(
        "GetCIMSSM",
        constants$516.GetCIMSSM$FUNC
    );
    static final FunctionDescriptor GetAutoRotationState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetAutoRotationState$MH = RuntimeHelper.downcallHandle(
        "GetAutoRotationState",
        constants$516.GetAutoRotationState$FUNC
    );
    static final FunctionDescriptor GetDisplayAutoRotationPreferences$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDisplayAutoRotationPreferences$MH = RuntimeHelper.downcallHandle(
        "GetDisplayAutoRotationPreferences",
        constants$516.GetDisplayAutoRotationPreferences$FUNC
    );
}


