// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$957 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$957() {}
    static final OfAddress __MIDL_itf_objidlbase_0000_0029_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0029_v0_0_s_ifspec$VH = constants$957.__MIDL_itf_objidlbase_0000_0029_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0029_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0029_v0_0_s_ifspec", constants$957.__MIDL_itf_objidlbase_0000_0029_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_ISynchronize$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISynchronize$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISynchronize", constants$957.IID_ISynchronize$LAYOUT);
    static final StructLayout IID_ISynchronizeHandle$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISynchronizeHandle$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISynchronizeHandle", constants$957.IID_ISynchronizeHandle$LAYOUT);
    static final StructLayout IID_ISynchronizeEvent$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISynchronizeEvent$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISynchronizeEvent", constants$957.IID_ISynchronizeEvent$LAYOUT);
    static final StructLayout IID_ISynchronizeContainer$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISynchronizeContainer$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISynchronizeContainer", constants$957.IID_ISynchronizeContainer$LAYOUT);
    static final StructLayout IID_ISynchronizeMutex$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISynchronizeMutex$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISynchronizeMutex", constants$957.IID_ISynchronizeMutex$LAYOUT);
}


