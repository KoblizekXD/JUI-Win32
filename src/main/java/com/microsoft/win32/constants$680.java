// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$680 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$680() {}
    static final FunctionDescriptor I_RpcServerSubscribeForDisconnectNotification2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcServerSubscribeForDisconnectNotification2$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerSubscribeForDisconnectNotification2",
        constants$680.I_RpcServerSubscribeForDisconnectNotification2$FUNC
    );
    static final FunctionDescriptor I_RpcServerUnsubscribeForDisconnectNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("_GUID")
    );
    static final MethodHandle I_RpcServerUnsubscribeForDisconnectNotification$MH = RuntimeHelper.downcallHandle(
        "I_RpcServerUnsubscribeForDisconnectNotification",
        constants$680.I_RpcServerUnsubscribeForDisconnectNotification$FUNC
    );
    static final FunctionDescriptor RpcNsBindingExportA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingExportA$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingExportA",
        constants$680.RpcNsBindingExportA$FUNC
    );
    static final FunctionDescriptor RpcNsBindingUnexportA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingUnexportA$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingUnexportA",
        constants$680.RpcNsBindingUnexportA$FUNC
    );
    static final FunctionDescriptor RpcNsBindingExportW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingExportW$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingExportW",
        constants$680.RpcNsBindingExportW$FUNC
    );
    static final FunctionDescriptor RpcNsBindingUnexportW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcNsBindingUnexportW$MH = RuntimeHelper.downcallHandle(
        "RpcNsBindingUnexportW",
        constants$680.RpcNsBindingUnexportW$FUNC
    );
}

