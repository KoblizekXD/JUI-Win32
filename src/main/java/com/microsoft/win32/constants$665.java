// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$665 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$665() {}
    static final FunctionDescriptor I_RpcGetServerContextList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcGetServerContextList$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetServerContextList",
        constants$665.I_RpcGetServerContextList$FUNC
    );
    static final FunctionDescriptor I_RpcSetServerContextList$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcSetServerContextList$MH = RuntimeHelper.downcallHandle(
        "I_RpcSetServerContextList",
        constants$665.I_RpcSetServerContextList$FUNC
    );
    static final FunctionDescriptor I_RpcNsInterfaceExported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsInterfaceExported$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsInterfaceExported",
        constants$665.I_RpcNsInterfaceExported$FUNC
    );
    static final FunctionDescriptor I_RpcNsInterfaceUnexported$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsInterfaceUnexported$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsInterfaceUnexported",
        constants$665.I_RpcNsInterfaceUnexported$FUNC
    );
    static final FunctionDescriptor I_RpcBindingToStaticStringBindingW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingToStaticStringBindingW$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingToStaticStringBindingW",
        constants$665.I_RpcBindingToStaticStringBindingW$FUNC
    );
    static final FunctionDescriptor I_RpcBindingInqSecurityContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingInqSecurityContext$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingInqSecurityContext",
        constants$665.I_RpcBindingInqSecurityContext$FUNC
    );
}

