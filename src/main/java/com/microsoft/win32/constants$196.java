// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$196 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$196() {}
    static final FunctionDescriptor InitializeEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitializeEnclave$MH = RuntimeHelper.downcallHandle(
        "InitializeEnclave",
        constants$196.InitializeEnclave$FUNC
    );
    static final FunctionDescriptor LoadEnclaveImageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadEnclaveImageA$MH = RuntimeHelper.downcallHandle(
        "LoadEnclaveImageA",
        constants$196.LoadEnclaveImageA$FUNC
    );
    static final FunctionDescriptor LoadEnclaveImageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LoadEnclaveImageW$MH = RuntimeHelper.downcallHandle(
        "LoadEnclaveImageW",
        constants$196.LoadEnclaveImageW$FUNC
    );
    static final FunctionDescriptor CallEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CallEnclave$MH = RuntimeHelper.downcallHandle(
        "CallEnclave",
        constants$196.CallEnclave$FUNC
    );
    static final FunctionDescriptor TerminateEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TerminateEnclave$MH = RuntimeHelper.downcallHandle(
        "TerminateEnclave",
        constants$196.TerminateEnclave$FUNC
    );
    static final FunctionDescriptor DeleteEnclave$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeleteEnclave$MH = RuntimeHelper.downcallHandle(
        "DeleteEnclave",
        constants$196.DeleteEnclave$FUNC
    );
}


