// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1138 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1138() {}
    static final OfAddress __MIDL_itf_urlmon_0000_0020_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0020_v0_0_s_ifspec$VH = constants$1138.__MIDL_itf_urlmon_0000_0020_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0020_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0020_v0_0_s_ifspec", constants$1138.__MIDL_itf_urlmon_0000_0020_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IWinInetHttpInfo$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetHttpInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IWinInetHttpInfo", constants$1138.IID_IWinInetHttpInfo$LAYOUT);
    static final FunctionDescriptor IWinInetHttpInfo_RemoteQueryInfo_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IWinInetHttpInfo_RemoteQueryInfo_Proxy$MH = RuntimeHelper.downcallHandle(
        "IWinInetHttpInfo_RemoteQueryInfo_Proxy",
        constants$1138.IWinInetHttpInfo_RemoteQueryInfo_Proxy$FUNC
    );
    static final FunctionDescriptor IWinInetHttpInfo_RemoteQueryInfo_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IWinInetHttpInfo_RemoteQueryInfo_Stub$MH = RuntimeHelper.downcallHandle(
        "IWinInetHttpInfo_RemoteQueryInfo_Stub",
        constants$1138.IWinInetHttpInfo_RemoteQueryInfo_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$VH = constants$1138.__MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec", constants$1138.__MIDL_itf_urlmon_0000_0021_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$VH = constants$1138.__MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec", constants$1138.__MIDL_itf_urlmon_0000_0021_v0_0_s_ifspec$LAYOUT);
}

