// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$189 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$189() {}
    static final FunctionDescriptor GetSystemFileCacheSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemFileCacheSize$MH = RuntimeHelper.downcallHandle(
        "GetSystemFileCacheSize",
        constants$189.GetSystemFileCacheSize$FUNC
    );
    static final FunctionDescriptor SetSystemFileCacheSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemFileCacheSize$MH = RuntimeHelper.downcallHandle(
        "SetSystemFileCacheSize",
        constants$189.SetSystemFileCacheSize$FUNC
    );
    static final FunctionDescriptor CreateFileMappingNumaW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateFileMappingNumaW$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingNumaW",
        constants$189.CreateFileMappingNumaW$FUNC
    );
    static final FunctionDescriptor PrefetchVirtualMemory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrefetchVirtualMemory$MH = RuntimeHelper.downcallHandle(
        "PrefetchVirtualMemory",
        constants$189.PrefetchVirtualMemory$FUNC
    );
    static final FunctionDescriptor CreateFileMappingFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateFileMappingFromApp$MH = RuntimeHelper.downcallHandle(
        "CreateFileMappingFromApp",
        constants$189.CreateFileMappingFromApp$FUNC
    );
    static final FunctionDescriptor MapViewOfFileFromApp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle MapViewOfFileFromApp$MH = RuntimeHelper.downcallHandle(
        "MapViewOfFileFromApp",
        constants$189.MapViewOfFileFromApp$FUNC
    );
}


