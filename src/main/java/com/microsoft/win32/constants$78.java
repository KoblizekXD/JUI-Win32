// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$78 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$78() {}
    static final StructLayout GUID_PROCESSOR_PERF_AUTONOMOUS_ACTIVITY_WINDOW$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_PERF_AUTONOMOUS_ACTIVITY_WINDOW$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_PERF_AUTONOMOUS_ACTIVITY_WINDOW", constants$78.GUID_PROCESSOR_PERF_AUTONOMOUS_ACTIVITY_WINDOW$LAYOUT);
    static final StructLayout GUID_PROCESSOR_DUTY_CYCLING$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_DUTY_CYCLING$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_DUTY_CYCLING", constants$78.GUID_PROCESSOR_DUTY_CYCLING$LAYOUT);
    static final StructLayout GUID_PROCESSOR_IDLE_ALLOW_SCALING$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_ALLOW_SCALING$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_ALLOW_SCALING", constants$78.GUID_PROCESSOR_IDLE_ALLOW_SCALING$LAYOUT);
    static final StructLayout GUID_PROCESSOR_IDLE_DISABLE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_DISABLE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_DISABLE", constants$78.GUID_PROCESSOR_IDLE_DISABLE$LAYOUT);
    static final StructLayout GUID_PROCESSOR_IDLE_STATE_MAXIMUM$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_STATE_MAXIMUM$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_STATE_MAXIMUM", constants$78.GUID_PROCESSOR_IDLE_STATE_MAXIMUM$LAYOUT);
    static final StructLayout GUID_PROCESSOR_IDLE_TIME_CHECK$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_IDLE_TIME_CHECK$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_IDLE_TIME_CHECK", constants$78.GUID_PROCESSOR_IDLE_TIME_CHECK$LAYOUT);
}


