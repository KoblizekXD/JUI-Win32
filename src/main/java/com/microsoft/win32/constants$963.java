// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$963 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$963() {}
    static final OfAddress __MIDL_itf_objidlbase_0000_0054_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0054_v0_0_s_ifspec$VH = constants$963.__MIDL_itf_objidlbase_0000_0054_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0054_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0054_v0_0_s_ifspec", constants$963.__MIDL_itf_objidlbase_0000_0054_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_ISupportAllowLowerTrustActivation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_ISupportAllowLowerTrustActivation$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_ISupportAllowLowerTrustActivation", constants$963.IID_ISupportAllowLowerTrustActivation$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0055_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0055_v0_0_c_ifspec$VH = constants$963.__MIDL_itf_objidlbase_0000_0055_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0055_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0055_v0_0_c_ifspec", constants$963.__MIDL_itf_objidlbase_0000_0055_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0055_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0055_v0_0_s_ifspec$VH = constants$963.__MIDL_itf_objidlbase_0000_0055_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0055_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0055_v0_0_s_ifspec", constants$963.__MIDL_itf_objidlbase_0000_0055_v0_0_s_ifspec$LAYOUT);
    static final FunctionDescriptor IEnumUnknown_Next_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumUnknown_Next_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumUnknown_Next_Proxy",
        constants$963.IEnumUnknown_Next_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumUnknown_Next_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumUnknown_Next_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumUnknown_Next_Stub",
        constants$963.IEnumUnknown_Next_Stub$FUNC
    );
}

