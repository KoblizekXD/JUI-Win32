// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$459 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$459() {}
    static final FunctionDescriptor GetMenuItemInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuItemInfoA$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemInfoA",
        constants$459.GetMenuItemInfoA$FUNC
    );
    static final FunctionDescriptor GetMenuItemInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuItemInfoW$MH = RuntimeHelper.downcallHandle(
        "GetMenuItemInfoW",
        constants$459.GetMenuItemInfoW$FUNC
    );
    static final FunctionDescriptor SetMenuItemInfoA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuItemInfoA$MH = RuntimeHelper.downcallHandle(
        "SetMenuItemInfoA",
        constants$459.SetMenuItemInfoA$FUNC
    );
    static final FunctionDescriptor SetMenuItemInfoW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenuItemInfoW$MH = RuntimeHelper.downcallHandle(
        "SetMenuItemInfoW",
        constants$459.SetMenuItemInfoW$FUNC
    );
    static final FunctionDescriptor GetMenuDefaultItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMenuDefaultItem$MH = RuntimeHelper.downcallHandle(
        "GetMenuDefaultItem",
        constants$459.GetMenuDefaultItem$FUNC
    );
    static final FunctionDescriptor SetMenuDefaultItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMenuDefaultItem$MH = RuntimeHelper.downcallHandle(
        "SetMenuDefaultItem",
        constants$459.SetMenuDefaultItem$FUNC
    );
}


