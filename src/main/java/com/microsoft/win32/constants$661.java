// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$661 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$661() {}
    static final FunctionDescriptor I_RpcSendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcSendReceive$MH = RuntimeHelper.downcallHandle(
        "I_RpcSendReceive",
        constants$661.I_RpcSendReceive$FUNC
    );
    static final FunctionDescriptor I_RpcFreeBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcFreeBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcFreeBuffer",
        constants$661.I_RpcFreeBuffer$FUNC
    );
    static final FunctionDescriptor I_RpcSend$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcSend$MH = RuntimeHelper.downcallHandle(
        "I_RpcSend",
        constants$661.I_RpcSend$FUNC
    );
    static final FunctionDescriptor I_RpcReceive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcReceive$MH = RuntimeHelper.downcallHandle(
        "I_RpcReceive",
        constants$661.I_RpcReceive$FUNC
    );
    static final FunctionDescriptor I_RpcFreePipeBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcFreePipeBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcFreePipeBuffer",
        constants$661.I_RpcFreePipeBuffer$FUNC
    );
    static final FunctionDescriptor I_RpcReallocPipeBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcReallocPipeBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcReallocPipeBuffer",
        constants$661.I_RpcReallocPipeBuffer$FUNC
    );
}


