// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1154 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1154() {}
    static final StructLayout CLSID_InternetSecurityManager$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_InternetSecurityManager$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_InternetSecurityManager", constants$1154.CLSID_InternetSecurityManager$LAYOUT);
    static final StructLayout CLSID_InternetZoneManager$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_InternetZoneManager$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_InternetZoneManager", constants$1154.CLSID_InternetZoneManager$LAYOUT);
    static final StructLayout CLSID_PersistentZoneIdentifier$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_PersistentZoneIdentifier$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_PersistentZoneIdentifier", constants$1154.CLSID_PersistentZoneIdentifier$LAYOUT);
    static final OfAddress __MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec$VH = constants$1154.__MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec", constants$1154.__MIDL_itf_urlmon_0000_0037_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_urlmon_0000_0037_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_urlmon_0000_0037_v0_0_s_ifspec$VH = constants$1154.__MIDL_itf_urlmon_0000_0037_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_urlmon_0000_0037_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0037_v0_0_s_ifspec", constants$1154.__MIDL_itf_urlmon_0000_0037_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IInternetSecurityMgrSite$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IInternetSecurityMgrSite$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IInternetSecurityMgrSite", constants$1154.IID_IInternetSecurityMgrSite$LAYOUT);
}


