// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$79 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$79() {}
    static final StructLayout GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD", constants$79.GUID_PROCESSOR_IDLE_DEMOTE_THRESHOLD$LAYOUT);
    static final StructLayout GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD", constants$79.GUID_PROCESSOR_IDLE_PROMOTE_THRESHOLD$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD", constants$79.GUID_PROCESSOR_CORE_PARKING_INCREASE_THRESHOLD$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_DECREASE_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_DECREASE_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_DECREASE_THRESHOLD", constants$79.GUID_PROCESSOR_CORE_PARKING_DECREASE_THRESHOLD$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_INCREASE_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_INCREASE_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_INCREASE_POLICY", constants$79.GUID_PROCESSOR_CORE_PARKING_INCREASE_POLICY$LAYOUT);
    static final StructLayout GUID_PROCESSOR_CORE_PARKING_DECREASE_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_CORE_PARKING_DECREASE_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_CORE_PARKING_DECREASE_POLICY", constants$79.GUID_PROCESSOR_CORE_PARKING_DECREASE_POLICY$LAYOUT);
}

