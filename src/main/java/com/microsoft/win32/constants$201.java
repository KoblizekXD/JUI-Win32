// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$201 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$201() {}
    static final FunctionDescriptor CallbackMayRunLong$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CallbackMayRunLong$MH = RuntimeHelper.downcallHandle(
        "CallbackMayRunLong",
        constants$201.CallbackMayRunLong$FUNC
    );
    static final FunctionDescriptor DisassociateCurrentThreadFromCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisassociateCurrentThreadFromCallback$MH = RuntimeHelper.downcallHandle(
        "DisassociateCurrentThreadFromCallback",
        constants$201.DisassociateCurrentThreadFromCallback$FUNC
    );
    static final FunctionDescriptor TrySubmitThreadpoolCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TrySubmitThreadpoolCallback$MH = RuntimeHelper.downcallHandle(
        "TrySubmitThreadpoolCallback",
        constants$201.TrySubmitThreadpoolCallback$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolWork$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThreadpoolWork$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolWork",
        constants$201.CreateThreadpoolWork$FUNC
    );
    static final FunctionDescriptor SubmitThreadpoolWork$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SubmitThreadpoolWork$MH = RuntimeHelper.downcallHandle(
        "SubmitThreadpoolWork",
        constants$201.SubmitThreadpoolWork$FUNC
    );
    static final FunctionDescriptor WaitForThreadpoolWorkCallbacks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForThreadpoolWorkCallbacks$MH = RuntimeHelper.downcallHandle(
        "WaitForThreadpoolWorkCallbacks",
        constants$201.WaitForThreadpoolWorkCallbacks$FUNC
    );
}


