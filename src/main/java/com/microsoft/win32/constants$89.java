// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$89 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$89() {}
    static final StructLayout GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD_1", constants$89.GUID_PROCESSOR_RESPONSIVENESS_ENABLE_THRESHOLD_1$LAYOUT);
    static final StructLayout GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME", constants$89.GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME$LAYOUT);
    static final StructLayout GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME_1", constants$89.GUID_PROCESSOR_RESPONSIVENESS_DISABLE_TIME_1$LAYOUT);
    static final StructLayout GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME", constants$89.GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME$LAYOUT);
    static final StructLayout GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME_1$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME_1$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME_1", constants$89.GUID_PROCESSOR_RESPONSIVENESS_ENABLE_TIME_1$LAYOUT);
    static final StructLayout GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING", constants$89.GUID_PROCESSOR_RESPONSIVENESS_EPP_CEILING$LAYOUT);
}

