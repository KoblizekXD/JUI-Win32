// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$981 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$981() {}
    static final FunctionDescriptor CoGetDefaultContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetDefaultContext$MH = RuntimeHelper.downcallHandle(
        "CoGetDefaultContext",
        constants$981.CoGetDefaultContext$FUNC
    );
    static final FunctionDescriptor CoGetApartmentType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoGetApartmentType$MH = RuntimeHelper.downcallHandle(
        "CoGetApartmentType",
        constants$981.CoGetApartmentType$FUNC
    );
    static final FunctionDescriptor CoDecodeProxy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoDecodeProxy$MH = RuntimeHelper.downcallHandle(
        "CoDecodeProxy",
        constants$981.CoDecodeProxy$FUNC
    );
    static final FunctionDescriptor CoIncrementMTAUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoIncrementMTAUsage$MH = RuntimeHelper.downcallHandle(
        "CoIncrementMTAUsage",
        constants$981.CoIncrementMTAUsage$FUNC
    );
    static final FunctionDescriptor CoDecrementMTAUsage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoDecrementMTAUsage$MH = RuntimeHelper.downcallHandle(
        "CoDecrementMTAUsage",
        constants$981.CoDecrementMTAUsage$FUNC
    );
    static final FunctionDescriptor CoAllowUnmarshalerCLSID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CoAllowUnmarshalerCLSID$MH = RuntimeHelper.downcallHandle(
        "CoAllowUnmarshalerCLSID",
        constants$981.CoAllowUnmarshalerCLSID$FUNC
    );
}


