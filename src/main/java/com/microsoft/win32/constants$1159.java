// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1159 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1159() {}
    static final StructLayout IID_IInternetZoneManagerEx$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetZoneManagerEx$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IInternetZoneManagerEx", constants$1159.IID_IInternetZoneManagerEx$LAYOUT);
    static final OfAddress __MIDL_itf_urlmon_0000_0046_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0046_v0_0_c_ifspec$VH = constants$1159.__MIDL_itf_urlmon_0000_0046_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0046_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0046_v0_0_c_ifspec", constants$1159.__MIDL_itf_urlmon_0000_0046_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_urlmon_0000_0046_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0046_v0_0_s_ifspec$VH = constants$1159.__MIDL_itf_urlmon_0000_0046_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0046_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0046_v0_0_s_ifspec", constants$1159.__MIDL_itf_urlmon_0000_0046_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IInternetZoneManagerEx2$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetZoneManagerEx2$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IInternetZoneManagerEx2", constants$1159.IID_IInternetZoneManagerEx2$LAYOUT);
    static final StructLayout CLSID_SoftDistExt$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SoftDistExt$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_SoftDistExt", constants$1159.CLSID_SoftDistExt$LAYOUT);
    static final OfAddress __MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec$VH = constants$1159.__MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec", constants$1159.__MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec$LAYOUT);
}


