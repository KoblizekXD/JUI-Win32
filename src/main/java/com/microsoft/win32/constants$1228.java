// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1228 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1228() {}
    static final FunctionDescriptor CreateDispTypeInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateDispTypeInfo$MH = RuntimeHelper.downcallHandle(
        "CreateDispTypeInfo",
        constants$1228.CreateDispTypeInfo$FUNC
    );
    static final FunctionDescriptor CreateStdDispatch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateStdDispatch$MH = RuntimeHelper.downcallHandle(
        "CreateStdDispatch",
        constants$1228.CreateStdDispatch$FUNC
    );
    static final FunctionDescriptor DispCallFunc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispCallFunc$MH = RuntimeHelper.downcallHandle(
        "DispCallFunc",
        constants$1228.DispCallFunc$FUNC
    );
    static final FunctionDescriptor RegisterActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterActiveObject$MH = RuntimeHelper.downcallHandle(
        "RegisterActiveObject",
        constants$1228.RegisterActiveObject$FUNC
    );
    static final FunctionDescriptor RevokeActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevokeActiveObject$MH = RuntimeHelper.downcallHandle(
        "RevokeActiveObject",
        constants$1228.RevokeActiveObject$FUNC
    );
    static final FunctionDescriptor GetActiveObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetActiveObject$MH = RuntimeHelper.downcallHandle(
        "GetActiveObject",
        constants$1228.GetActiveObject$FUNC
    );
}


