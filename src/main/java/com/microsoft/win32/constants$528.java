// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$528 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$528() {}
    static final FunctionDescriptor GetACP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetACP$MH = RuntimeHelper.downcallHandle(
        "GetACP",
        constants$528.GetACP$FUNC
    );
    static final FunctionDescriptor GetOEMCP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetOEMCP$MH = RuntimeHelper.downcallHandle(
        "GetOEMCP",
        constants$528.GetOEMCP$FUNC
    );
    static final FunctionDescriptor GetCPInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfo$MH = RuntimeHelper.downcallHandle(
        "GetCPInfo",
        constants$528.GetCPInfo$FUNC
    );
    static final FunctionDescriptor GetCPInfoExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExA$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExA",
        constants$528.GetCPInfoExA$FUNC
    );
    static final FunctionDescriptor GetCPInfoExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCPInfoExW$MH = RuntimeHelper.downcallHandle(
        "GetCPInfoExW",
        constants$528.GetCPInfoExW$FUNC
    );
    static final FunctionDescriptor CompareStringA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CompareStringA$MH = RuntimeHelper.downcallHandle(
        "CompareStringA",
        constants$528.CompareStringA$FUNC
    );
}

