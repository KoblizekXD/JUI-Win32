// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$352 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$352() {}
    static final FunctionDescriptor CreateFontIndirectExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFontIndirectExA$MH = RuntimeHelper.downcallHandle(
        "CreateFontIndirectExA",
        constants$352.CreateFontIndirectExA$FUNC
    );
    static final FunctionDescriptor CreateFontIndirectExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFontIndirectExW$MH = RuntimeHelper.downcallHandle(
        "CreateFontIndirectExW",
        constants$352.CreateFontIndirectExW$FUNC
    );
    static final FunctionDescriptor GetViewportExtEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetViewportExtEx$MH = RuntimeHelper.downcallHandle(
        "GetViewportExtEx",
        constants$352.GetViewportExtEx$FUNC
    );
    static final FunctionDescriptor GetViewportOrgEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetViewportOrgEx$MH = RuntimeHelper.downcallHandle(
        "GetViewportOrgEx",
        constants$352.GetViewportOrgEx$FUNC
    );
    static final FunctionDescriptor GetWindowExtEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowExtEx$MH = RuntimeHelper.downcallHandle(
        "GetWindowExtEx",
        constants$352.GetWindowExtEx$FUNC
    );
    static final FunctionDescriptor GetWindowOrgEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWindowOrgEx$MH = RuntimeHelper.downcallHandle(
        "GetWindowOrgEx",
        constants$352.GetWindowOrgEx$FUNC
    );
}


