// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1077 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1077() {}
    static final FunctionDescriptor IEnumSTATPROPSTG_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumSTATPROPSTG_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumSTATPROPSTG_RemoteNext_Stub",
        constants$1077.IEnumSTATPROPSTG_RemoteNext_Stub$FUNC
    );
    static final StructLayout IID_IEnumSTATPROPSETSTG$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IEnumSTATPROPSETSTG$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IEnumSTATPROPSETSTG", constants$1077.IID_IEnumSTATPROPSETSTG$LAYOUT);
    static final FunctionDescriptor IEnumSTATPROPSETSTG_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumSTATPROPSETSTG_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumSTATPROPSETSTG_RemoteNext_Proxy",
        constants$1077.IEnumSTATPROPSETSTG_RemoteNext_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumSTATPROPSETSTG_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumSTATPROPSETSTG_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumSTATPROPSETSTG_RemoteNext_Stub",
        constants$1077.IEnumSTATPROPSETSTG_RemoteNext_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_propidlbase_0000_0004_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_propidlbase_0000_0004_v0_0_c_ifspec$VH = constants$1077.__MIDL_itf_propidlbase_0000_0004_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_propidlbase_0000_0004_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_propidlbase_0000_0004_v0_0_c_ifspec", constants$1077.__MIDL_itf_propidlbase_0000_0004_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_propidlbase_0000_0004_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_propidlbase_0000_0004_v0_0_s_ifspec$VH = constants$1077.__MIDL_itf_propidlbase_0000_0004_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_propidlbase_0000_0004_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_propidlbase_0000_0004_v0_0_s_ifspec", constants$1077.__MIDL_itf_propidlbase_0000_0004_v0_0_s_ifspec$LAYOUT);
}


