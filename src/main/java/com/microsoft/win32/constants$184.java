// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$184 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$184() {}
    static final FunctionDescriptor SetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameA",
        constants$184.SetComputerNameA$FUNC
    );
    static final FunctionDescriptor SetComputerNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameW$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameW",
        constants$184.SetComputerNameW$FUNC
    );
    static final FunctionDescriptor SetComputerNameExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetComputerNameExA$MH = RuntimeHelper.downcallHandle(
        "SetComputerNameExA",
        constants$184.SetComputerNameExA$FUNC
    );
    static final FunctionDescriptor VirtualAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAlloc$MH = RuntimeHelper.downcallHandle(
        "VirtualAlloc",
        constants$184.VirtualAlloc$FUNC
    );
    static final FunctionDescriptor VirtualProtect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VirtualProtect$MH = RuntimeHelper.downcallHandle(
        "VirtualProtect",
        constants$184.VirtualProtect$FUNC
    );
    static final FunctionDescriptor VirtualFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualFree$MH = RuntimeHelper.downcallHandle(
        "VirtualFree",
        constants$184.VirtualFree$FUNC
    );
}

