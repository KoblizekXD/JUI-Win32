// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$942 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$942() {}
    static final FunctionDescriptor IUnknown_QueryInterface_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IUnknown_QueryInterface_Stub$MH = RuntimeHelper.downcallHandle(
        "IUnknown_QueryInterface_Stub",
        constants$942.IUnknown_QueryInterface_Stub$FUNC
    );
    static final FunctionDescriptor IUnknown_AddRef_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IUnknown_AddRef_Proxy$MH = RuntimeHelper.downcallHandle(
        "IUnknown_AddRef_Proxy",
        constants$942.IUnknown_AddRef_Proxy$FUNC
    );
    static final FunctionDescriptor IUnknown_AddRef_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IUnknown_AddRef_Stub$MH = RuntimeHelper.downcallHandle(
        "IUnknown_AddRef_Stub",
        constants$942.IUnknown_AddRef_Stub$FUNC
    );
    static final FunctionDescriptor IUnknown_Release_Proxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IUnknown_Release_Proxy$MH = RuntimeHelper.downcallHandle(
        "IUnknown_Release_Proxy",
        constants$942.IUnknown_Release_Proxy$FUNC
    );
    static final FunctionDescriptor IUnknown_Release_Stub$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IUnknown_Release_Stub$MH = RuntimeHelper.downcallHandle(
        "IUnknown_Release_Stub",
        constants$942.IUnknown_Release_Stub$FUNC
    );
    static final OfAddress __MIDL_itf_unknwnbase_0000_0001_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_unknwnbase_0000_0001_v0_0_c_ifspec$VH = constants$942.__MIDL_itf_unknwnbase_0000_0001_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_unknwnbase_0000_0001_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_unknwnbase_0000_0001_v0_0_c_ifspec", constants$942.__MIDL_itf_unknwnbase_0000_0001_v0_0_c_ifspec$LAYOUT);
}


