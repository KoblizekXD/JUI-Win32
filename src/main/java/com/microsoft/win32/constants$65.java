// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$65 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$65() {}
    static final StructLayout GUID_DISK_IDLE_TIMEOUT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_IDLE_TIMEOUT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_IDLE_TIMEOUT", constants$65.GUID_DISK_IDLE_TIMEOUT$LAYOUT);
    static final StructLayout GUID_DISK_BURST_IGNORE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_BURST_IGNORE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_BURST_IGNORE_THRESHOLD", constants$65.GUID_DISK_BURST_IGNORE_THRESHOLD$LAYOUT);
    static final StructLayout GUID_DISK_ADAPTIVE_POWERDOWN$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_ADAPTIVE_POWERDOWN$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_ADAPTIVE_POWERDOWN", constants$65.GUID_DISK_ADAPTIVE_POWERDOWN$LAYOUT);
    static final StructLayout GUID_DISK_NVME_NOPPME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISK_NVME_NOPPME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISK_NVME_NOPPME", constants$65.GUID_DISK_NVME_NOPPME$LAYOUT);
    static final StructLayout GUID_SLEEP_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SLEEP_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SLEEP_SUBGROUP", constants$65.GUID_SLEEP_SUBGROUP$LAYOUT);
    static final StructLayout GUID_SLEEP_IDLE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SLEEP_IDLE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_SLEEP_IDLE_THRESHOLD", constants$65.GUID_SLEEP_IDLE_THRESHOLD$LAYOUT);
}


