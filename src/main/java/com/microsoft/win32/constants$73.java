// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$73 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$73() {}
    static final StructLayout GUID_BATTERY_DISCHARGE_FLAGS_3$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_DISCHARGE_FLAGS_3$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_DISCHARGE_FLAGS_3", constants$73.GUID_BATTERY_DISCHARGE_FLAGS_3$LAYOUT);
    static final StructLayout GUID_PROCESSOR_SETTINGS_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_SETTINGS_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_SETTINGS_SUBGROUP", constants$73.GUID_PROCESSOR_SETTINGS_SUBGROUP$LAYOUT);
    static final StructLayout GUID_PROCESSOR_THROTTLE_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_THROTTLE_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_THROTTLE_POLICY", constants$73.GUID_PROCESSOR_THROTTLE_POLICY$LAYOUT);
    static final StructLayout GUID_PROCESSOR_THROTTLE_MAXIMUM$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_THROTTLE_MAXIMUM$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_THROTTLE_MAXIMUM", constants$73.GUID_PROCESSOR_THROTTLE_MAXIMUM$LAYOUT);
    static final StructLayout GUID_PROCESSOR_THROTTLE_MAXIMUM_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_THROTTLE_MAXIMUM_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_THROTTLE_MAXIMUM_1", constants$73.GUID_PROCESSOR_THROTTLE_MAXIMUM_1$LAYOUT);
    static final StructLayout GUID_PROCESSOR_THROTTLE_MINIMUM$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_THROTTLE_MINIMUM$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_THROTTLE_MINIMUM", constants$73.GUID_PROCESSOR_THROTTLE_MINIMUM$LAYOUT);
}


