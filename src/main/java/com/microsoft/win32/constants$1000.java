// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1000 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1000() {}
    static final StructLayout IID_IMoniker$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IMoniker$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IMoniker", constants$1000.IID_IMoniker$LAYOUT);
    static final FunctionDescriptor IMoniker_RemoteBindToObject_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToObject_Proxy$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToObject_Proxy",
        constants$1000.IMoniker_RemoteBindToObject_Proxy$FUNC
    );
    static final FunctionDescriptor IMoniker_RemoteBindToObject_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToObject_Stub$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToObject_Stub",
        constants$1000.IMoniker_RemoteBindToObject_Stub$FUNC
    );
    static final FunctionDescriptor IMoniker_RemoteBindToStorage_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToStorage_Proxy$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToStorage_Proxy",
        constants$1000.IMoniker_RemoteBindToStorage_Proxy$FUNC
    );
    static final FunctionDescriptor IMoniker_RemoteBindToStorage_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IMoniker_RemoteBindToStorage_Stub$MH = RuntimeHelper.downcallHandle(
        "IMoniker_RemoteBindToStorage_Stub",
        constants$1000.IMoniker_RemoteBindToStorage_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_objidl_0000_0063_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0063_v0_0_c_ifspec$VH = constants$1000.__MIDL_itf_objidl_0000_0063_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0063_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0063_v0_0_c_ifspec", constants$1000.__MIDL_itf_objidl_0000_0063_v0_0_c_ifspec$LAYOUT);
}


