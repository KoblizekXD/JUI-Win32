// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$658 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$658() {}
    static final FunctionDescriptor RpcServerInterfaceGroupCreateW$IdleCallbackFn_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateW$IdleCallbackFn_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$658.RpcServerInterfaceGroupCreateW$IdleCallbackFn_DOWN$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateW$MH = RuntimeHelper.downcallHandle(
        "RpcServerInterfaceGroupCreateW",
        constants$658.RpcServerInterfaceGroupCreateW$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateA$IdleCallbackFn$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateA$IdleCallbackFn_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateA$IdleCallbackFn_UP$MH = RuntimeHelper.upcallHandle(RpcServerInterfaceGroupCreateA$IdleCallbackFn.class, "apply", constants$658.RpcServerInterfaceGroupCreateA$IdleCallbackFn_UP$FUNC);
    static final FunctionDescriptor RpcServerInterfaceGroupCreateA$IdleCallbackFn_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateA$IdleCallbackFn_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$658.RpcServerInterfaceGroupCreateA$IdleCallbackFn_DOWN$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupCreateA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupCreateA$MH = RuntimeHelper.downcallHandle(
        "RpcServerInterfaceGroupCreateA",
        constants$658.RpcServerInterfaceGroupCreateA$FUNC
    );
    static final FunctionDescriptor RpcServerInterfaceGroupClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcServerInterfaceGroupClose$MH = RuntimeHelper.downcallHandle(
        "RpcServerInterfaceGroupClose",
        constants$658.RpcServerInterfaceGroupClose$FUNC
    );
}


