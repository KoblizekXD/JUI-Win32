// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$972 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$972() {}
    static final StructLayout CLSID_MachineGlobalObjectTable$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_MachineGlobalObjectTable$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_MachineGlobalObjectTable", constants$972.CLSID_MachineGlobalObjectTable$LAYOUT);
    static final StructLayout CLSID_ActivationCapabilities$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ActivationCapabilities$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_ActivationCapabilities", constants$972.CLSID_ActivationCapabilities$LAYOUT);
    static final StructLayout CLSID_ComBinding$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ComBinding$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_ComBinding", constants$972.CLSID_ComBinding$LAYOUT);
    static final StructLayout CLSID_StdEvent$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_StdEvent$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_StdEvent", constants$972.CLSID_StdEvent$LAYOUT);
    static final StructLayout CLSID_ManualResetEvent$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_ManualResetEvent$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_ManualResetEvent", constants$972.CLSID_ManualResetEvent$LAYOUT);
    static final StructLayout CLSID_SynchronizeContainer$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SynchronizeContainer$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_SynchronizeContainer", constants$972.CLSID_SynchronizeContainer$LAYOUT);
}

