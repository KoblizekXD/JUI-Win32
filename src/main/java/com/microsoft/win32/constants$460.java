// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$460 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$460() {}
    static final FunctionDescriptor GetMenuItemRect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuItemRect$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemRect",
        constants$460.GetMenuItemRect$FUNC
    );
    static final FunctionDescriptor MenuItemFromPoint$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle MenuItemFromPoint$MH = RuntimeHelper.downcallHandle(
        "MenuItemFromPoint",
        constants$460.MenuItemFromPoint$FUNC
    );
    static final FunctionDescriptor DragObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DragObject$MH = RuntimeHelper.downcallHandle(
        "DragObject",
        constants$460.DragObject$FUNC
    );
    static final FunctionDescriptor DragDetect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("tagPOINT")
    );
    static final MethodHandle DragDetect$MH = RuntimeHelper.downcallHandle(
        "DragDetect",
        constants$460.DragDetect$FUNC
    );
    static final FunctionDescriptor DrawIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrawIcon$MH = RuntimeHelper.downcallHandle(
        "DrawIcon",
        constants$460.DrawIcon$FUNC
    );
    static final FunctionDescriptor DrawTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DrawTextA$MH = RuntimeHelper.downcallHandle(
        "DrawTextA",
        constants$460.DrawTextA$FUNC
    );
}


