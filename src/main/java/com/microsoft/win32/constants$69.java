// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$69 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$69() {}
    static final StructLayout GUID_ALLOW_SYSTEM_REQUIRED$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ALLOW_SYSTEM_REQUIRED$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ALLOW_SYSTEM_REQUIRED", constants$69.GUID_ALLOW_SYSTEM_REQUIRED$LAYOUT);
    static final StructLayout GUID_POWER_SAVING_STATUS$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_POWER_SAVING_STATUS$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_POWER_SAVING_STATUS", constants$69.GUID_POWER_SAVING_STATUS$LAYOUT);
    static final StructLayout GUID_ENERGY_SAVER_SUBGROUP$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_SUBGROUP$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_SUBGROUP", constants$69.GUID_ENERGY_SAVER_SUBGROUP$LAYOUT);
    static final StructLayout GUID_ENERGY_SAVER_BATTERY_THRESHOLD$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_BATTERY_THRESHOLD$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_BATTERY_THRESHOLD", constants$69.GUID_ENERGY_SAVER_BATTERY_THRESHOLD$LAYOUT);
    static final StructLayout GUID_ENERGY_SAVER_BRIGHTNESS$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_BRIGHTNESS$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_BRIGHTNESS", constants$69.GUID_ENERGY_SAVER_BRIGHTNESS$LAYOUT);
    static final StructLayout GUID_ENERGY_SAVER_POLICY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ENERGY_SAVER_POLICY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ENERGY_SAVER_POLICY", constants$69.GUID_ENERGY_SAVER_POLICY$LAYOUT);
}

