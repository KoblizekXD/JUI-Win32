// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$958 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$958() {}
    static final StructLayout IID_ICancelMethodCalls$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ICancelMethodCalls$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ICancelMethodCalls", constants$958.IID_ICancelMethodCalls$LAYOUT);
    static final StructLayout IID_IAsyncManager$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAsyncManager$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IAsyncManager", constants$958.IID_IAsyncManager$LAYOUT);
    static final StructLayout IID_ICallFactory$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ICallFactory$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ICallFactory", constants$958.IID_ICallFactory$LAYOUT);
    static final StructLayout IID_IRpcHelper$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IRpcHelper$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IRpcHelper", constants$958.IID_IRpcHelper$LAYOUT);
    static final StructLayout IID_IReleaseMarshalBuffers$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IReleaseMarshalBuffers$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IReleaseMarshalBuffers", constants$958.IID_IReleaseMarshalBuffers$LAYOUT);
    static final StructLayout IID_IWaitMultiple$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWaitMultiple$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IWaitMultiple", constants$958.IID_IWaitMultiple$LAYOUT);
}


