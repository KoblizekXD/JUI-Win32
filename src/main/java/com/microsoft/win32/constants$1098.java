// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1098 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1098() {}
    static final StructLayout IID_IEnterpriseDropTarget$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnterpriseDropTarget$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnterpriseDropTarget", constants$1098.IID_IEnterpriseDropTarget$LAYOUT);
    static final OfAddress __MIDL_itf_oleidl_0000_0024_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0024_v0_0_c_ifspec$VH = constants$1098.__MIDL_itf_oleidl_0000_0024_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0024_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0024_v0_0_c_ifspec", constants$1098.__MIDL_itf_oleidl_0000_0024_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_oleidl_0000_0024_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0024_v0_0_s_ifspec$VH = constants$1098.__MIDL_itf_oleidl_0000_0024_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0024_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0024_v0_0_s_ifspec", constants$1098.__MIDL_itf_oleidl_0000_0024_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IEnumOLEVERB$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumOLEVERB$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumOLEVERB", constants$1098.IID_IEnumOLEVERB$LAYOUT);
    static final FunctionDescriptor IEnumOLEVERB_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumOLEVERB_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumOLEVERB_RemoteNext_Proxy",
        constants$1098.IEnumOLEVERB_RemoteNext_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumOLEVERB_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumOLEVERB_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumOLEVERB_RemoteNext_Stub",
        constants$1098.IEnumOLEVERB_RemoteNext_Stub$FUNC
    );
}


