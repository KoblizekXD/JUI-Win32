// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$91 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$91() {}
    static final StructLayout GUID_DISCONNECTED_STANDBY_MODE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DISCONNECTED_STANDBY_MODE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_DISCONNECTED_STANDBY_MODE", constants$91.GUID_DISCONNECTED_STANDBY_MODE$LAYOUT);
    static final StructLayout GUID_ACDC_POWER_SOURCE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_ACDC_POWER_SOURCE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_ACDC_POWER_SOURCE", constants$91.GUID_ACDC_POWER_SOURCE$LAYOUT);
    static final StructLayout GUID_LIDSWITCH_STATE_CHANGE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDSWITCH_STATE_CHANGE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDSWITCH_STATE_CHANGE", constants$91.GUID_LIDSWITCH_STATE_CHANGE$LAYOUT);
    static final StructLayout GUID_LIDSWITCH_STATE_RELIABILITY$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_LIDSWITCH_STATE_RELIABILITY$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_LIDSWITCH_STATE_RELIABILITY", constants$91.GUID_LIDSWITCH_STATE_RELIABILITY$LAYOUT);
    static final StructLayout GUID_BATTERY_PERCENTAGE_REMAINING$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_PERCENTAGE_REMAINING$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_PERCENTAGE_REMAINING", constants$91.GUID_BATTERY_PERCENTAGE_REMAINING$LAYOUT);
    static final StructLayout GUID_BATTERY_COUNT$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_COUNT$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_BATTERY_COUNT", constants$91.GUID_BATTERY_COUNT$LAYOUT);
}

