// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$945 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$945() {}
    static final FunctionDescriptor IClassFactory_CreateInstance_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IClassFactory_CreateInstance_Stub$MH = RuntimeHelper.downcallHandle(
        "IClassFactory_CreateInstance_Stub",
        constants$945.IClassFactory_CreateInstance_Stub$FUNC
    );
    static final FunctionDescriptor IClassFactory_LockServer_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IClassFactory_LockServer_Proxy$MH = RuntimeHelper.downcallHandle(
        "IClassFactory_LockServer_Proxy",
        constants$945.IClassFactory_LockServer_Proxy$FUNC
    );
    static final FunctionDescriptor IClassFactory_LockServer_Stub$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IClassFactory_LockServer_Stub$MH = RuntimeHelper.downcallHandle(
        "IClassFactory_LockServer_Stub",
        constants$945.IClassFactory_LockServer_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_objidlbase_0000_0000_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0000_v0_0_c_ifspec$VH = constants$945.__MIDL_itf_objidlbase_0000_0000_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0000_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0000_v0_0_c_ifspec", constants$945.__MIDL_itf_objidlbase_0000_0000_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_objidlbase_0000_0000_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_objidlbase_0000_0000_v0_0_s_ifspec$VH = constants$945.__MIDL_itf_objidlbase_0000_0000_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_objidlbase_0000_0000_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0000_v0_0_s_ifspec", constants$945.__MIDL_itf_objidlbase_0000_0000_v0_0_s_ifspec$LAYOUT);
    static final StructLayout IID_IMarshal$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Data1"),
        Constants$root.C_SHORT$LAYOUT.withName("Data2"),
        Constants$root.C_SHORT$LAYOUT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IMarshal$SEGMENT = RuntimeHelper.lookupGlobalVariable("IID_IMarshal", constants$945.IID_IMarshal$LAYOUT);
}


