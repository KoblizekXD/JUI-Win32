// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$81 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$81() {}
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_DECREASE_FACTOR$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_DECREASE_FACTOR$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_DECREASE_FACTOR", constants$81.GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_DECREASE_FACTOR$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_THRESHOLD", constants$81.GUID_PROCESSOR_CORE_PARKING_AFFINITY_HISTORY_THRESHOLD$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_AFFINITY_WEIGHTING$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_AFFINITY_WEIGHTING$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_AFFINITY_WEIGHTING", constants$81.GUID_PROCESSOR_CORE_PARKING_AFFINITY_WEIGHTING$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_DECREASE_FACTOR$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_DECREASE_FACTOR$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_DECREASE_FACTOR", constants$81.GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_DECREASE_FACTOR$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_THRESHOLD", constants$81.GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_HISTORY_THRESHOLD$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_WEIGHTING$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_WEIGHTING$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_WEIGHTING", constants$81.GUID_PROCESSOR_CORE_PARKING_OVER_UTILIZATION_WEIGHTING$LAYOUT);
}

