// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$994 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$994() {}
    static final FunctionDescriptor CoTaskMemFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoTaskMemFree$MH = RuntimeHelper.downcallHandle(
        "CoTaskMemFree",
        constants$994.CoTaskMemFree$FUNC
    );
    static final FunctionDescriptor CoFileTimeNow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoFileTimeNow$MH = RuntimeHelper.downcallHandle(
        "CoFileTimeNow",
        constants$994.CoFileTimeNow$FUNC
    );
    static final FunctionDescriptor CLSIDFromProgIDEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CLSIDFromProgIDEx$MH = RuntimeHelper.downcallHandle(
        "CLSIDFromProgIDEx",
        constants$994.CLSIDFromProgIDEx$FUNC
    );
    static final FunctionDescriptor CoRegisterDeviceCatalog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRegisterDeviceCatalog$MH = RuntimeHelper.downcallHandle(
        "CoRegisterDeviceCatalog",
        constants$994.CoRegisterDeviceCatalog$FUNC
    );
    static final FunctionDescriptor CoRevokeDeviceCatalog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoRevokeDeviceCatalog$MH = RuntimeHelper.downcallHandle(
        "CoRevokeDeviceCatalog",
        constants$994.CoRevokeDeviceCatalog$FUNC
    );
    static final OfAddress __MIDL_itf_unknwn_0000_0000_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_unknwn_0000_0000_v0_0_c_ifspec$VH = constants$994.__MIDL_itf_unknwn_0000_0000_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_unknwn_0000_0000_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_unknwn_0000_0000_v0_0_c_ifspec", constants$994.__MIDL_itf_unknwn_0000_0000_v0_0_c_ifspec$LAYOUT);
}


