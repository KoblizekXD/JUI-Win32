// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1094 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1094() {}
    static final StructLayout IID_IOleItemContainer$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleItemContainer$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleItemContainer", constants$1094.IID_IOleItemContainer$LAYOUT);
    static final StructLayout IID_IOleInPlaceUIWindow$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleInPlaceUIWindow$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleInPlaceUIWindow", constants$1094.IID_IOleInPlaceUIWindow$LAYOUT);
    static final StructLayout IID_IOleInPlaceActiveObject$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IOleInPlaceActiveObject$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IOleInPlaceActiveObject", constants$1094.IID_IOleInPlaceActiveObject$LAYOUT);
    static final FunctionDescriptor IOleInPlaceActiveObject_RemoteTranslateAccelerator_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IOleInPlaceActiveObject_RemoteTranslateAccelerator_Proxy$MH = RuntimeHelper.downcallHandle(
        "IOleInPlaceActiveObject_RemoteTranslateAccelerator_Proxy",
        constants$1094.IOleInPlaceActiveObject_RemoteTranslateAccelerator_Proxy$FUNC
    );
    static final FunctionDescriptor IOleInPlaceActiveObject_RemoteTranslateAccelerator_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IOleInPlaceActiveObject_RemoteTranslateAccelerator_Stub$MH = RuntimeHelper.downcallHandle(
        "IOleInPlaceActiveObject_RemoteTranslateAccelerator_Stub",
        constants$1094.IOleInPlaceActiveObject_RemoteTranslateAccelerator_Stub$FUNC
    );
    static final FunctionDescriptor IOleInPlaceActiveObject_RemoteResizeBorder_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IOleInPlaceActiveObject_RemoteResizeBorder_Proxy$MH = RuntimeHelper.downcallHandle(
        "IOleInPlaceActiveObject_RemoteResizeBorder_Proxy",
        constants$1094.IOleInPlaceActiveObject_RemoteResizeBorder_Proxy$FUNC
    );
}

