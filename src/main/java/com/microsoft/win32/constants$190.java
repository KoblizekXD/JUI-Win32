// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$190 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$190() {}
    static final FunctionDescriptor UnmapViewOfFileEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnmapViewOfFileEx$MH = RuntimeHelper.downcallHandle(
        "UnmapViewOfFileEx",
        constants$190.UnmapViewOfFileEx$FUNC
    );
    static final FunctionDescriptor AllocateUserPhysicalPages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AllocateUserPhysicalPages$MH = RuntimeHelper.downcallHandle(
        "AllocateUserPhysicalPages",
        constants$190.AllocateUserPhysicalPages$FUNC
    );
    static final FunctionDescriptor FreeUserPhysicalPages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeUserPhysicalPages$MH = RuntimeHelper.downcallHandle(
        "FreeUserPhysicalPages",
        constants$190.FreeUserPhysicalPages$FUNC
    );
    static final FunctionDescriptor MapUserPhysicalPages$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapUserPhysicalPages$MH = RuntimeHelper.downcallHandle(
        "MapUserPhysicalPages",
        constants$190.MapUserPhysicalPages$FUNC
    );
    static final FunctionDescriptor AllocateUserPhysicalPagesNuma$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle AllocateUserPhysicalPagesNuma$MH = RuntimeHelper.downcallHandle(
        "AllocateUserPhysicalPagesNuma",
        constants$190.AllocateUserPhysicalPagesNuma$FUNC
    );
    static final FunctionDescriptor VirtualAllocExNuma$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VirtualAllocExNuma$MH = RuntimeHelper.downcallHandle(
        "VirtualAllocExNuma",
        constants$190.VirtualAllocExNuma$FUNC
    );
}


