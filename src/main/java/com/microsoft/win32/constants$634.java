// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$634 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$634() {}
    static final FunctionDescriptor RpcBindingReset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingReset$MH = RuntimeHelper.downcallHandle(
        "RpcBindingReset",
        constants$634.RpcBindingReset$FUNC
    );
    static final FunctionDescriptor RpcBindingSetObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingSetObject$MH = RuntimeHelper.downcallHandle(
        "RpcBindingSetObject",
        constants$634.RpcBindingSetObject$FUNC
    );
    static final FunctionDescriptor RpcMgmtInqDefaultProtectLevel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcMgmtInqDefaultProtectLevel$MH = RuntimeHelper.downcallHandle(
        "RpcMgmtInqDefaultProtectLevel",
        constants$634.RpcMgmtInqDefaultProtectLevel$FUNC
    );
    static final FunctionDescriptor RpcBindingToStringBindingA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingToStringBindingA$MH = RuntimeHelper.downcallHandle(
        "RpcBindingToStringBindingA",
        constants$634.RpcBindingToStringBindingA$FUNC
    );
    static final FunctionDescriptor RpcBindingToStringBindingW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingToStringBindingW$MH = RuntimeHelper.downcallHandle(
        "RpcBindingToStringBindingW",
        constants$634.RpcBindingToStringBindingW$FUNC
    );
    static final FunctionDescriptor RpcBindingVectorFree$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingVectorFree$MH = RuntimeHelper.downcallHandle(
        "RpcBindingVectorFree",
        constants$634.RpcBindingVectorFree$FUNC
    );
}


