// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$694 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$694() {}
    static final FunctionDescriptor RpcServerSubscribeForNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerSubscribeForNotification$MH = RuntimeHelper.downcallHandle(
        "RpcServerSubscribeForNotification",
        constants$694.RpcServerSubscribeForNotification$FUNC
    );
    static final FunctionDescriptor RpcServerUnsubscribeForNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerUnsubscribeForNotification$MH = RuntimeHelper.downcallHandle(
        "RpcServerUnsubscribeForNotification",
        constants$694.RpcServerUnsubscribeForNotification$FUNC
    );
    static final FunctionDescriptor RpcBindingBind$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingBind$MH = RuntimeHelper.downcallHandle(
        "RpcBindingBind",
        constants$694.RpcBindingBind$FUNC
    );
    static final FunctionDescriptor RpcBindingUnbind$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcBindingUnbind$MH = RuntimeHelper.downcallHandle(
        "RpcBindingUnbind",
        constants$694.RpcBindingUnbind$FUNC
    );
    static final FunctionDescriptor I_RpcAsyncSetHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcAsyncSetHandle$MH = RuntimeHelper.downcallHandle(
        "I_RpcAsyncSetHandle",
        constants$694.I_RpcAsyncSetHandle$FUNC
    );
    static final FunctionDescriptor I_RpcAsyncAbortCall$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcAsyncAbortCall$MH = RuntimeHelper.downcallHandle(
        "I_RpcAsyncAbortCall",
        constants$694.I_RpcAsyncAbortCall$FUNC
    );
}

