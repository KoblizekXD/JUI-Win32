// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1099 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1099() {}
    static final OfAddress __MIDL_itf_oleidl_0000_0025_v0_0_c_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0025_v0_0_c_ifspec$VH = constants$1099.__MIDL_itf_oleidl_0000_0025_v0_0_c_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0025_v0_0_c_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0025_v0_0_c_ifspec", constants$1099.__MIDL_itf_oleidl_0000_0025_v0_0_c_ifspec$LAYOUT);
    static final OfAddress __MIDL_itf_oleidl_0000_0025_v0_0_s_ifspec$LAYOUT = Constants$root.C_POINTER$LAYOUT;
    static final VarHandle __MIDL_itf_oleidl_0000_0025_v0_0_s_ifspec$VH = constants$1099.__MIDL_itf_oleidl_0000_0025_v0_0_s_ifspec$LAYOUT.varHandle();
    static final MemorySegment __MIDL_itf_oleidl_0000_0025_v0_0_s_ifspec$SEGMENT = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oleidl_0000_0025_v0_0_s_ifspec", constants$1099.__MIDL_itf_oleidl_0000_0025_v0_0_s_ifspec$LAYOUT);
    static final FunctionDescriptor HACCEL_UserSize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserSize$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserSize",
        constants$1099.HACCEL_UserSize$FUNC
    );
    static final FunctionDescriptor HACCEL_UserMarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserMarshal$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserMarshal",
        constants$1099.HACCEL_UserMarshal$FUNC
    );
    static final FunctionDescriptor HACCEL_UserUnmarshal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserUnmarshal$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserUnmarshal",
        constants$1099.HACCEL_UserUnmarshal$FUNC
    );
    static final FunctionDescriptor HACCEL_UserFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle HACCEL_UserFree$MH = RuntimeHelper.downcallHandle(
        "HACCEL_UserFree",
        constants$1099.HACCEL_UserFree$FUNC
    );
}

