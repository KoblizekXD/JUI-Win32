// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$948 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$948() {}
    static final StructLayout IID_AsyncIMultiQI$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_AsyncIMultiQI$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_AsyncIMultiQI", constants$948.IID_AsyncIMultiQI$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0009_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0009_v0_0_c_ifspec$VH = constants$948.__MIDL_itf_objidlbase_0000_0009_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0009_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0009_v0_0_c_ifspec", constants$948.__MIDL_itf_objidlbase_0000_0009_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0009_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0009_v0_0_s_ifspec$VH = constants$948.__MIDL_itf_objidlbase_0000_0009_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0009_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0009_v0_0_s_ifspec", constants$948.__MIDL_itf_objidlbase_0000_0009_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IInternalUnknown$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternalUnknown$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IInternalUnknown", constants$948.IID_IInternalUnknown$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0010_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0010_v0_0_c_ifspec$VH = constants$948.__MIDL_itf_objidlbase_0000_0010_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0010_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0010_v0_0_c_ifspec", constants$948.__MIDL_itf_objidlbase_0000_0010_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0010_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0010_v0_0_s_ifspec$VH = constants$948.__MIDL_itf_objidlbase_0000_0010_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0010_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0010_v0_0_s_ifspec", constants$948.__MIDL_itf_objidlbase_0000_0010_v0_0_s_ifspec$LAYOUT);
}

