// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$998 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$998() {}
    static final FunctionDescriptor IEnumMoniker_RemoteNext_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumMoniker_RemoteNext_Proxy$MH = RuntimeHelper.downcallHandle(
        "IEnumMoniker_RemoteNext_Proxy",
        constants$998.IEnumMoniker_RemoteNext_Proxy$FUNC
    );
    static final FunctionDescriptor IEnumMoniker_RemoteNext_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IEnumMoniker_RemoteNext_Stub$MH = RuntimeHelper.downcallHandle(
        "IEnumMoniker_RemoteNext_Stub",
        constants$998.IEnumMoniker_RemoteNext_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_objidl_0000_0058_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0058_v0_0_c_ifspec$VH = constants$998.__MIDL_itf_objidl_0000_0058_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0058_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0058_v0_0_c_ifspec", constants$998.__MIDL_itf_objidl_0000_0058_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$VH = constants$998.__MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0058_v0_0_s_ifspec", constants$998.__MIDL_itf_objidl_0000_0058_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IRunnableObject$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IRunnableObject$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IRunnableObject", constants$998.IID_IRunnableObject$LAYOUT);
    static final FunctionDescriptor IRunnableObject_RemoteIsRunning_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IRunnableObject_RemoteIsRunning_Proxy$MH = RuntimeHelper.downcallHandle(
        "IRunnableObject_RemoteIsRunning_Proxy",
        constants$998.IRunnableObject_RemoteIsRunning_Proxy$FUNC
    );
}


