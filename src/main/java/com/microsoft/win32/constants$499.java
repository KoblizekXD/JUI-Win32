// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$499 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$499() {}
    static final FunctionDescriptor CascadeWindows$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CascadeWindows$MH = RuntimeHelper.downcallHandle(
        "CascadeWindows",
        constants$499.CascadeWindows$FUNC
    );
    static final FunctionDescriptor WinHelpA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WinHelpA$MH = RuntimeHelper.downcallHandle(
        "WinHelpA",
        constants$499.WinHelpA$FUNC
    );
    static final FunctionDescriptor WinHelpW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle WinHelpW$MH = RuntimeHelper.downcallHandle(
        "WinHelpW",
        constants$499.WinHelpW$FUNC
    );
    static final FunctionDescriptor GetGuiResources$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetGuiResources$MH = RuntimeHelper.downcallHandle(
        "GetGuiResources",
        constants$499.GetGuiResources$FUNC
    );
    static final FunctionDescriptor ChangeDisplaySettingsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeDisplaySettingsA$MH = RuntimeHelper.downcallHandle(
        "ChangeDisplaySettingsA",
        constants$499.ChangeDisplaySettingsA$FUNC
    );
    static final FunctionDescriptor ChangeDisplaySettingsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ChangeDisplaySettingsW$MH = RuntimeHelper.downcallHandle(
        "ChangeDisplaySettingsW",
        constants$499.ChangeDisplaySettingsW$FUNC
    );
}


