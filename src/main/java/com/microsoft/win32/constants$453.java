// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$453 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$453() {}
    static final FunctionDescriptor GetMenu$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenu$MH = RuntimeHelper.downcallHandle(
        "GetMenu",
        constants$453.GetMenu$FUNC
    );
    static final FunctionDescriptor SetMenu$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetMenu$MH = RuntimeHelper.downcallHandle(
        "SetMenu",
        constants$453.SetMenu$FUNC
    );
    static final FunctionDescriptor ChangeMenuA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeMenuA$MH = RuntimeHelper.downcallHandle(
        "ChangeMenuA",
        constants$453.ChangeMenuA$FUNC
    );
    static final FunctionDescriptor ChangeMenuW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeMenuW$MH = RuntimeHelper.downcallHandle(
        "ChangeMenuW",
        constants$453.ChangeMenuW$FUNC
    );
    static final FunctionDescriptor HiliteMenuItem$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle HiliteMenuItem$MH = RuntimeHelper.downcallHandle(
        "HiliteMenuItem",
        constants$453.HiliteMenuItem$FUNC
    );
    static final FunctionDescriptor GetMenuStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetMenuStringA$MH = RuntimeHelper.downcallHandle(
        "GetMenuStringA",
        constants$453.GetMenuStringA$FUNC
    );
}


