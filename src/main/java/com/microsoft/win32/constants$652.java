// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$652 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$652() {}
    static final FunctionDescriptor RpcBindingServerFromClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingServerFromClient$MH = RuntimeHelper.downcallHandle(
        "RpcBindingServerFromClient",
        constants$652.RpcBindingServerFromClient$FUNC
    );
    static final FunctionDescriptor RpcRaiseException$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcRaiseException$MH = RuntimeHelper.downcallHandle(
        "RpcRaiseException",
        constants$652.RpcRaiseException$FUNC
    );
    static final FunctionDescriptor RpcTestCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle RpcTestCancel$MH = RuntimeHelper.downcallHandle(
        "RpcTestCancel",
        constants$652.RpcTestCancel$FUNC
    );
    static final FunctionDescriptor RpcServerTestCancel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerTestCancel$MH = RuntimeHelper.downcallHandle(
        "RpcServerTestCancel",
        constants$652.RpcServerTestCancel$FUNC
    );
    static final FunctionDescriptor RpcCancelThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcCancelThread$MH = RuntimeHelper.downcallHandle(
        "RpcCancelThread",
        constants$652.RpcCancelThread$FUNC
    );
    static final FunctionDescriptor RpcCancelThreadEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcCancelThreadEx$MH = RuntimeHelper.downcallHandle(
        "RpcCancelThreadEx",
        constants$652.RpcCancelThreadEx$FUNC
    );
}


