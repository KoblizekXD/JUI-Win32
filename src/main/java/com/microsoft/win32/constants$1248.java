// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1248 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1248() {}
    static final FunctionDescriptor uaw_wcschr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle uaw_wcschr$MH = RuntimeHelper.downcallHandle(
        "uaw_wcschr",
        constants$1248.uaw_wcschr$FUNC
    );
    static final FunctionDescriptor uaw_wcscpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle uaw_wcscpy$MH = RuntimeHelper.downcallHandle(
        "uaw_wcscpy",
        constants$1248.uaw_wcscpy$FUNC
    );
    static final FunctionDescriptor uaw_wcsicmp$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle uaw_wcsicmp$MH = RuntimeHelper.downcallHandle(
        "uaw_wcsicmp",
        constants$1248.uaw_wcsicmp$FUNC
    );
    static final FunctionDescriptor uaw_wcslen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle uaw_wcslen$MH = RuntimeHelper.downcallHandle(
        "uaw_wcslen",
        constants$1248.uaw_wcslen$FUNC
    );
    static final FunctionDescriptor uaw_wcsrchr$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle uaw_wcsrchr$MH = RuntimeHelper.downcallHandle(
        "uaw_wcsrchr",
        constants$1248.uaw_wcsrchr$FUNC
    );
    static final StructLayout NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID$SEGMENT = RuntimeHelper.lookupGlobalVariable("NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID", constants$1248.NETWORK_MANAGER_FIRST_IP_ADDRESS_ARRIVAL_GUID$LAYOUT);
}

