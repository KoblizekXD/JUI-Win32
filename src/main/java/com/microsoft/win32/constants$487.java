// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$487 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$487() {}
    static final FunctionDescriptor FindWindowExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindWindowExW$MH = RuntimeHelper.downcallHandle(
        "FindWindowExW",
        constants$487.FindWindowExW$FUNC
    );
    static final FunctionDescriptor GetShellWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetShellWindow$MH = RuntimeHelper.downcallHandle(
        "GetShellWindow",
        constants$487.GetShellWindow$FUNC
    );
    static final FunctionDescriptor RegisterShellHookWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterShellHookWindow$MH = RuntimeHelper.downcallHandle(
        "RegisterShellHookWindow",
        constants$487.RegisterShellHookWindow$FUNC
    );
    static final FunctionDescriptor DeregisterShellHookWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeregisterShellHookWindow$MH = RuntimeHelper.downcallHandle(
        "DeregisterShellHookWindow",
        constants$487.DeregisterShellHookWindow$FUNC
    );
    static final FunctionDescriptor EnumWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindows$MH = RuntimeHelper.downcallHandle(
        "EnumWindows",
        constants$487.EnumWindows$FUNC
    );
    static final FunctionDescriptor EnumThreadWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumThreadWindows$MH = RuntimeHelper.downcallHandle(
        "EnumThreadWindows",
        constants$487.EnumThreadWindows$FUNC
    );
}

