// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$979 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$979() {}
    static final StructLayout CLSID_Picture_EnhMetafile$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_Picture_EnhMetafile$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_Picture_EnhMetafile", constants$979.CLSID_Picture_EnhMetafile$LAYOUT);
    static final StructLayout CLSID_Picture_Dib$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_Picture_Dib$SEGMENT = RuntimeHelper.lookupGlobalVariable("CLSID_Picture_Dib", constants$979.CLSID_Picture_Dib$LAYOUT);
    static final StructLayout GUID_TRISTATE$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_TRISTATE$SEGMENT = RuntimeHelper.lookupGlobalVariable("GUID_TRISTATE", constants$979.GUID_TRISTATE$LAYOUT);
    static final FunctionDescriptor CoGetMalloc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetMalloc$MH = RuntimeHelper.downcallHandle(
        "CoGetMalloc",
        constants$979.CoGetMalloc$FUNC
    );
    static final FunctionDescriptor CreateStreamOnHGlobal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateStreamOnHGlobal$MH = RuntimeHelper.downcallHandle(
        "CreateStreamOnHGlobal",
        constants$979.CreateStreamOnHGlobal$FUNC
    );
    static final FunctionDescriptor GetHGlobalFromStream$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetHGlobalFromStream$MH = RuntimeHelper.downcallHandle(
        "GetHGlobalFromStream",
        constants$979.GetHGlobalFromStream$FUNC
    );
}


