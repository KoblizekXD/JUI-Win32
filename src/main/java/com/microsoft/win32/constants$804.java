// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$804 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$804() {}
    static final FunctionDescriptor GetEncryptedFileMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "GetEncryptedFileMetadata",
        constants$804.GetEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor SetEncryptedFileMetadata$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "SetEncryptedFileMetadata",
        constants$804.SetEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor FreeEncryptedFileMetadata$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeEncryptedFileMetadata$MH = RuntimeHelper.downcallHandle(
        "FreeEncryptedFileMetadata",
        constants$804.FreeEncryptedFileMetadata$FUNC
    );
    static final FunctionDescriptor I_RpcNsGetBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsGetBuffer$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsGetBuffer",
        constants$804.I_RpcNsGetBuffer$FUNC
    );
    static final FunctionDescriptor I_RpcNsSendReceive$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcNsSendReceive$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsSendReceive",
        constants$804.I_RpcNsSendReceive$FUNC
    );
    static final FunctionDescriptor I_RpcNsRaiseException$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle I_RpcNsRaiseException$MH = RuntimeHelper.downcallHandle(
        "I_RpcNsRaiseException",
        constants$804.I_RpcNsRaiseException$FUNC
    );
}


