// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1018 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1018() {}
    static final FunctionDescriptor IFillLockBytes_RemoteFillAppend_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IFillLockBytes_RemoteFillAppend_Stub$MH = RuntimeHelper.downcallHandle(
        "IFillLockBytes_RemoteFillAppend_Stub",
        constants$1018.IFillLockBytes_RemoteFillAppend_Stub$FUNC
    );
    static final FunctionDescriptor IFillLockBytes_RemoteFillAt_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IFillLockBytes_RemoteFillAt_Proxy$MH = RuntimeHelper.downcallHandle(
        "IFillLockBytes_RemoteFillAt_Proxy",
        constants$1018.IFillLockBytes_RemoteFillAt_Proxy$FUNC
    );
    static final FunctionDescriptor IFillLockBytes_RemoteFillAt_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IFillLockBytes_RemoteFillAt_Stub$MH = RuntimeHelper.downcallHandle(
        "IFillLockBytes_RemoteFillAt_Stub",
        constants$1018.IFillLockBytes_RemoteFillAt_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_objidl_0000_0079_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0079_v0_0_c_ifspec$VH = constants$1018.__MIDL_itf_objidl_0000_0079_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0079_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0079_v0_0_c_ifspec", constants$1018.__MIDL_itf_objidl_0000_0079_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_objidl_0000_0079_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0079_v0_0_s_ifspec$VH = constants$1018.__MIDL_itf_objidl_0000_0079_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0079_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0079_v0_0_s_ifspec", constants$1018.__MIDL_itf_objidl_0000_0079_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IProgressNotify$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IProgressNotify$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IProgressNotify", constants$1018.IID_IProgressNotify$LAYOUT);
}


