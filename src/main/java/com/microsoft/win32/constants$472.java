// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$472 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$472() {}
    static final FunctionDescriptor AdjustWindowRectEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AdjustWindowRectEx$MH = RuntimeHelper.downcallHandle(
        "AdjustWindowRectEx",
        constants$472.AdjustWindowRectEx$FUNC
    );
    static final FunctionDescriptor AdjustWindowRectExForDpi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AdjustWindowRectExForDpi$MH = RuntimeHelper.downcallHandle(
        "AdjustWindowRectExForDpi",
        constants$472.AdjustWindowRectExForDpi$FUNC
    );
    static final FunctionDescriptor SetWindowContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowContextHelpId$MH = RuntimeHelper.downcallHandle(
        "SetWindowContextHelpId",
        constants$472.SetWindowContextHelpId$FUNC
    );
    static final FunctionDescriptor GetWindowContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowContextHelpId$MH = RuntimeHelper.downcallHandle(
        "GetWindowContextHelpId",
        constants$472.GetWindowContextHelpId$FUNC
    );
    static final FunctionDescriptor SetMenuContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMenuContextHelpId$MH = RuntimeHelper.downcallHandle(
        "SetMenuContextHelpId",
        constants$472.SetMenuContextHelpId$FUNC
    );
    static final FunctionDescriptor GetMenuContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuContextHelpId$MH = RuntimeHelper.downcallHandle(
        "GetMenuContextHelpId",
        constants$472.GetMenuContextHelpId$FUNC
    );
}


