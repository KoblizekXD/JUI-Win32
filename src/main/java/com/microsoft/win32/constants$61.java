// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$61 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$61() {}
    static final StructLayout GUID_DEEP_SLEEP_PLATFORM_STATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEEP_SLEEP_PLATFORM_STATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DEEP_SLEEP_PLATFORM_STATE", constants$61.GUID_DEEP_SLEEP_PLATFORM_STATE$LAYOUT);
    static final StructLayout GUID_DISK_COALESCING_POWERDOWN_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_COALESCING_POWERDOWN_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_COALESCING_POWERDOWN_TIMEOUT", constants$61.GUID_DISK_COALESCING_POWERDOWN_TIMEOUT$LAYOUT);
    static final StructLayout GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT", constants$61.GUID_EXECUTION_REQUIRED_REQUEST_TIMEOUT$LAYOUT);
    static final StructLayout GUID_VIDEO_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_SUBGROUP", constants$61.GUID_VIDEO_SUBGROUP$LAYOUT);
    static final StructLayout GUID_VIDEO_POWERDOWN_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_POWERDOWN_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_POWERDOWN_TIMEOUT", constants$61.GUID_VIDEO_POWERDOWN_TIMEOUT$LAYOUT);
    static final StructLayout GUID_VIDEO_ANNOYANCE_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ANNOYANCE_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_VIDEO_ANNOYANCE_TIMEOUT", constants$61.GUID_VIDEO_ANNOYANCE_TIMEOUT$LAYOUT);
}


