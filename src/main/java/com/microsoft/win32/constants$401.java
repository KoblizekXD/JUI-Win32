// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$401 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$401() {}
    static final FunctionDescriptor OpenDesktopW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenDesktopW$MH = RuntimeHelper.downcallHandle(
        "OpenDesktopW",
        constants$401.OpenDesktopW$FUNC
    );
    static final FunctionDescriptor OpenInputDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenInputDesktop$MH = RuntimeHelper.downcallHandle(
        "OpenInputDesktop",
        constants$401.OpenInputDesktop$FUNC
    );
    static final FunctionDescriptor EnumDesktopsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopsA$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopsA",
        constants$401.EnumDesktopsA$FUNC
    );
    static final FunctionDescriptor EnumDesktopsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopsW$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopsW",
        constants$401.EnumDesktopsW$FUNC
    );
    static final FunctionDescriptor EnumDesktopWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumDesktopWindows$MH = RuntimeHelper.downcallHandle(
        "EnumDesktopWindows",
        constants$401.EnumDesktopWindows$FUNC
    );
    static final FunctionDescriptor SwitchDesktop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SwitchDesktop$MH = RuntimeHelper.downcallHandle(
        "SwitchDesktop",
        constants$401.SwitchDesktop$FUNC
    );
}

