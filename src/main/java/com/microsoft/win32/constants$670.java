// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$670 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$670() {}
    static final FunctionDescriptor I_RpcLaunchDatagramReceiveThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcLaunchDatagramReceiveThread$MH = RuntimeHelper.downcallHandle(
        "I_RpcLaunchDatagramReceiveThread",
        constants$670.I_RpcLaunchDatagramReceiveThread$FUNC
    );
    static final FunctionDescriptor I_RpcServerRegisterForwardFunction$pForwardFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor I_RpcServerRegisterForwardFunction$pForwardFunction_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerRegisterForwardFunction$pForwardFunction_UP$MH = RuntimeHelper.upcallHandle(I_RpcServerRegisterForwardFunction$pForwardFunction.class, "apply", constants$670.I_RpcServerRegisterForwardFunction$pForwardFunction_UP$FUNC);
    static final FunctionDescriptor I_RpcServerRegisterForwardFunction$pForwardFunction_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerRegisterForwardFunction$pForwardFunction_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$670.I_RpcServerRegisterForwardFunction$pForwardFunction_DOWN$FUNC
    );
    static final FunctionDescriptor I_RpcServerRegisterForwardFunction$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerRegisterForwardFunction$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerRegisterForwardFunction",
        constants$670.I_RpcServerRegisterForwardFunction$FUNC
    );
    static final FunctionDescriptor I_RpcServerInqAddressChangeFn$return$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor I_RpcServerInqAddressChangeFn$return_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerInqAddressChangeFn$return_UP$MH = RuntimeHelper.upcallHandle(I_RpcServerInqAddressChangeFn$return.class, "apply", constants$670.I_RpcServerInqAddressChangeFn$return_UP$FUNC);
    static final FunctionDescriptor I_RpcServerInqAddressChangeFn$return_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerInqAddressChangeFn$return_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$670.I_RpcServerInqAddressChangeFn$return_DOWN$FUNC
    );
}

