// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$475 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$475() {}
    static final FunctionDescriptor SetCursor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCursor$MH = RuntimeHelper.downcallHandle(
        "SetCursor",
        constants$475.SetCursor$FUNC
    );
    static final FunctionDescriptor GetCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCursorPos$MH = RuntimeHelper.downcallHandle(
        "GetCursorPos",
        constants$475.GetCursorPos$FUNC
    );
    static final FunctionDescriptor GetPhysicalCursorPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPhysicalCursorPos$MH = RuntimeHelper.downcallHandle(
        "GetPhysicalCursorPos",
        constants$475.GetPhysicalCursorPos$FUNC
    );
    static final FunctionDescriptor GetClipCursor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClipCursor$MH = RuntimeHelper.downcallHandle(
        "GetClipCursor",
        constants$475.GetClipCursor$FUNC
    );
    static final FunctionDescriptor GetCursor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCursor$MH = RuntimeHelper.downcallHandle(
        "GetCursor",
        constants$475.GetCursor$FUNC
    );
    static final FunctionDescriptor CreateCaret$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateCaret$MH = RuntimeHelper.downcallHandle(
        "CreateCaret",
        constants$475.CreateCaret$FUNC
    );
}

