// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$669 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$669() {}
    static final FunctionDescriptor I_RpcUninitializeNdrOle$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle I_RpcUninitializeNdrOle$MH = RuntimeHelper.downcallHandle(
        "I_RpcUninitializeNdrOle",
        constants$669.I_RpcUninitializeNdrOle$FUNC
    );
    static final FunctionDescriptor I_RpcBindingCopy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingCopy$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingCopy",
        constants$669.I_RpcBindingCopy$FUNC
    );
    static final FunctionDescriptor I_RpcBindingIsClientLocal$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingIsClientLocal$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingIsClientLocal",
        constants$669.I_RpcBindingIsClientLocal$FUNC
    );
    static final FunctionDescriptor I_RpcBindingInqConnId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingInqConnId$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingInqConnId",
        constants$669.I_RpcBindingInqConnId$FUNC
    );
    static final FunctionDescriptor I_RpcBindingCreateNP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcBindingCreateNP$MH = RuntimeHelper.downcallHandle(
        "I_RpcBindingCreateNP",
        constants$669.I_RpcBindingCreateNP$FUNC
    );
    static final FunctionDescriptor I_RpcSsDontSerializeContext$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle I_RpcSsDontSerializeContext$MH = RuntimeHelper.downcallHandle(
        "I_RpcSsDontSerializeContext",
        constants$669.I_RpcSsDontSerializeContext$FUNC
    );
}


