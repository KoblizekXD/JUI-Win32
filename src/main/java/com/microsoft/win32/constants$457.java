// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$457 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$457() {}
    static final FunctionDescriptor RemoveMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RemoveMenu$MH = RuntimeHelper.downcallHandle(
        "RemoveMenu",
        constants$457.RemoveMenu$FUNC
    );
    static final FunctionDescriptor DeleteMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DeleteMenu$MH = RuntimeHelper.downcallHandle(
        "DeleteMenu",
        constants$457.DeleteMenu$FUNC
    );
    static final FunctionDescriptor SetMenuItemBitmaps$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuItemBitmaps$MH = RuntimeHelper.downcallHandle(
        "SetMenuItemBitmaps",
        constants$457.SetMenuItemBitmaps$FUNC
    );
    static final FunctionDescriptor GetMenuCheckMarkDimensions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMenuCheckMarkDimensions$MH = RuntimeHelper.downcallHandle(
        "GetMenuCheckMarkDimensions",
        constants$457.GetMenuCheckMarkDimensions$FUNC
    );
    static final FunctionDescriptor TrackPopupMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenu$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenu",
        constants$457.TrackPopupMenu$FUNC
    );
    static final FunctionDescriptor TrackPopupMenuEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrackPopupMenuEx$MH = RuntimeHelper.downcallHandle(
        "TrackPopupMenuEx",
        constants$457.TrackPopupMenuEx$FUNC
    );
}


