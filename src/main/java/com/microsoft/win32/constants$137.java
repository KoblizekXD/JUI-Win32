// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$137 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$137() {}
    static final FunctionDescriptor EncodeSystemPointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodeSystemPointer$MH = RuntimeHelper.downcallHandle(
        "EncodeSystemPointer",
        constants$137.EncodeSystemPointer$FUNC
    );
    static final FunctionDescriptor DecodeSystemPointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodeSystemPointer$MH = RuntimeHelper.downcallHandle(
        "DecodeSystemPointer",
        constants$137.DecodeSystemPointer$FUNC
    );
    static final FunctionDescriptor EncodeRemotePointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EncodeRemotePointer$MH = RuntimeHelper.downcallHandle(
        "EncodeRemotePointer",
        constants$137.EncodeRemotePointer$FUNC
    );
    static final FunctionDescriptor DecodeRemotePointer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DecodeRemotePointer$MH = RuntimeHelper.downcallHandle(
        "DecodeRemotePointer",
        constants$137.DecodeRemotePointer$FUNC
    );
    static final FunctionDescriptor Beep$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Beep$MH = RuntimeHelper.downcallHandle(
        "Beep",
        constants$137.Beep$FUNC
    );
    static final FunctionDescriptor CloseHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseHandle$MH = RuntimeHelper.downcallHandle(
        "CloseHandle",
        constants$137.CloseHandle$FUNC
    );
}


