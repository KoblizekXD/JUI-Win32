// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1016 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1016() {}
    static final StructLayout FMTID_DiscardableInformation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_DiscardableInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable("FMTID_DiscardableInformation", constants$1016.FMTID_DiscardableInformation$LAYOUT);
    static final StructLayout FMTID_ImageSummaryInformation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_ImageSummaryInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable("FMTID_ImageSummaryInformation", constants$1016.FMTID_ImageSummaryInformation$LAYOUT);
    static final StructLayout FMTID_AudioSummaryInformation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_AudioSummaryInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable("FMTID_AudioSummaryInformation", constants$1016.FMTID_AudioSummaryInformation$LAYOUT);
    static final StructLayout FMTID_VideoSummaryInformation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_VideoSummaryInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable("FMTID_VideoSummaryInformation", constants$1016.FMTID_VideoSummaryInformation$LAYOUT);
    static final StructLayout FMTID_MediaFileSummaryInformation$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_MediaFileSummaryInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable("FMTID_MediaFileSummaryInformation", constants$1016.FMTID_MediaFileSummaryInformation$LAYOUT);
    static final OfAddress __MIDL_itf_objidl_0000_0077_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0077_v0_0_c_ifspec$VH = constants$1016.__MIDL_itf_objidl_0000_0077_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0077_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0077_v0_0_c_ifspec", constants$1016.__MIDL_itf_objidl_0000_0077_v0_0_c_ifspec$LAYOUT);
}


