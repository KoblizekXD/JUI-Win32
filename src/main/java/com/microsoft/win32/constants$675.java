// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$675 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$675() {}
    static final FunctionDescriptor I_RpcMapWin32Status$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcMapWin32Status$MH = RuntimeHelper.downcallHandle(
        "I_RpcMapWin32Status",
        constants$675.I_RpcMapWin32Status$FUNC
    );
    static final FunctionDescriptor I_RpcProxyIsValidMachineFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor I_RpcProxyIsValidMachineFn_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcProxyIsValidMachineFn_UP$MH = RuntimeHelper.upcallHandle(I_RpcProxyIsValidMachineFn.class, "apply", constants$675.I_RpcProxyIsValidMachineFn_UP$FUNC);
    static final FunctionDescriptor I_RpcProxyIsValidMachineFn_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcProxyIsValidMachineFn_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$675.I_RpcProxyIsValidMachineFn_DOWN$FUNC
    );
    static final FunctionDescriptor I_RpcProxyGetClientAddressFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor I_RpcProxyGetClientAddressFn_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcProxyGetClientAddressFn_UP$MH = RuntimeHelper.upcallHandle(I_RpcProxyGetClientAddressFn.class, "apply", constants$675.I_RpcProxyGetClientAddressFn_UP$FUNC);
    static final FunctionDescriptor I_RpcProxyGetClientAddressFn_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcProxyGetClientAddressFn_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$675.I_RpcProxyGetClientAddressFn_DOWN$FUNC
    );
    static final FunctionDescriptor I_RpcProxyGetConnectionTimeoutFn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor I_RpcProxyGetConnectionTimeoutFn_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcProxyGetConnectionTimeoutFn_UP$MH = RuntimeHelper.upcallHandle(I_RpcProxyGetConnectionTimeoutFn.class, "apply", constants$675.I_RpcProxyGetConnectionTimeoutFn_UP$FUNC);
}


