// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$664 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$664() {}
    static final FunctionDescriptor PRPC_RUNDOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor PRPC_RUNDOWN_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PRPC_RUNDOWN_UP$MH = RuntimeHelper.upcallHandle(PRPC_RUNDOWN.class, "apply", constants$664.PRPC_RUNDOWN_UP$FUNC);
    static final FunctionDescriptor PRPC_RUNDOWN_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PRPC_RUNDOWN_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$664.PRPC_RUNDOWN_DOWN$FUNC
    );
    static final FunctionDescriptor I_RpcMonitorAssociation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcMonitorAssociation$MH = RuntimeHelper.downcallHandle(
        "I_RpcMonitorAssociation",
        constants$664.I_RpcMonitorAssociation$FUNC
    );
    static final FunctionDescriptor I_RpcStopMonitorAssociation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcStopMonitorAssociation$MH = RuntimeHelper.downcallHandle(
        "I_RpcStopMonitorAssociation",
        constants$664.I_RpcStopMonitorAssociation$FUNC
    );
    static final FunctionDescriptor I_RpcGetCurrentCallHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle I_RpcGetCurrentCallHandle$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetCurrentCallHandle",
        constants$664.I_RpcGetCurrentCallHandle$FUNC
    );
    static final FunctionDescriptor I_RpcGetAssociationContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcGetAssociationContext$MH = RuntimeHelper.downcallHandle(
        "I_RpcGetAssociationContext",
        constants$664.I_RpcGetAssociationContext$FUNC
    );
}


