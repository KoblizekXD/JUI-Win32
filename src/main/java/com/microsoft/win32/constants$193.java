// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$193 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$193() {}
    static final FunctionDescriptor VirtualAllocFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAllocFromApp$MH = RuntimeHelper.downcallHandle(
        "VirtualAllocFromApp",
        constants$193.VirtualAllocFromApp$FUNC
    );
    static final FunctionDescriptor VirtualProtectFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle VirtualProtectFromApp$MH = RuntimeHelper.downcallHandle(
        "VirtualProtectFromApp",
        constants$193.VirtualProtectFromApp$FUNC
    );
    static final FunctionDescriptor OpenFileMappingFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenFileMappingFromApp$MH = RuntimeHelper.downcallHandle(
        "OpenFileMappingFromApp",
        constants$193.OpenFileMappingFromApp$FUNC
    );
    static final FunctionDescriptor QueryVirtualMemoryInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryVirtualMemoryInformation$MH = RuntimeHelper.downcallHandle(
        "QueryVirtualMemoryInformation",
        constants$193.QueryVirtualMemoryInformation$FUNC
    );
    static final FunctionDescriptor MapViewOfFileNuma2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFileNuma2$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileNuma2",
        constants$193.MapViewOfFileNuma2$FUNC
    );
    static final FunctionDescriptor UnmapViewOfFile2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnmapViewOfFile2$MH = RuntimeHelper.downcallHandle(
        "UnmapViewOfFile2",
        constants$193.UnmapViewOfFile2$FUNC
    );
}


