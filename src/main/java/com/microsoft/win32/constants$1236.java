// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1236() {}
    static final FunctionDescriptor OleCreateMenuDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleCreateMenuDescriptor$MH = RuntimeHelper.downcallHandle(
        "OleCreateMenuDescriptor",
        constants$1236.OleCreateMenuDescriptor$FUNC
    );
    static final FunctionDescriptor OleSetMenuDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleSetMenuDescriptor$MH = RuntimeHelper.downcallHandle(
        "OleSetMenuDescriptor",
        constants$1236.OleSetMenuDescriptor$FUNC
    );
    static final FunctionDescriptor OleDestroyMenuDescriptor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleDestroyMenuDescriptor$MH = RuntimeHelper.downcallHandle(
        "OleDestroyMenuDescriptor",
        constants$1236.OleDestroyMenuDescriptor$FUNC
    );
    static final FunctionDescriptor OleTranslateAccelerator$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleTranslateAccelerator$MH = RuntimeHelper.downcallHandle(
        "OleTranslateAccelerator",
        constants$1236.OleTranslateAccelerator$FUNC
    );
    static final FunctionDescriptor OleDuplicateData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OleDuplicateData$MH = RuntimeHelper.downcallHandle(
        "OleDuplicateData",
        constants$1236.OleDuplicateData$FUNC
    );
    static final FunctionDescriptor OleDraw$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OleDraw$MH = RuntimeHelper.downcallHandle(
        "OleDraw",
        constants$1236.OleDraw$FUNC
    );
}


