// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$290 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$290() {}
    static final FunctionDescriptor FindFirstStreamTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstStreamTransactedW$MH = RuntimeHelper.downcallHandle(
        "FindFirstStreamTransactedW",
        constants$290.FindFirstStreamTransactedW$FUNC
    );
    static final FunctionDescriptor FindFirstFileNameTransactedW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindFirstFileNameTransactedW$MH = RuntimeHelper.downcallHandle(
        "FindFirstFileNameTransactedW",
        constants$290.FindFirstFileNameTransactedW$FUNC
    );
    static final FunctionDescriptor CreateNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "CreateNamedPipeA",
        constants$290.CreateNamedPipeA$FUNC
    );
    static final FunctionDescriptor GetNamedPipeHandleStateA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNamedPipeHandleStateA$MH = RuntimeHelper.downcallHandle(
        "GetNamedPipeHandleStateA",
        constants$290.GetNamedPipeHandleStateA$FUNC
    );
    static final FunctionDescriptor CallNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CallNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "CallNamedPipeA",
        constants$290.CallNamedPipeA$FUNC
    );
    static final FunctionDescriptor WaitNamedPipeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitNamedPipeA$MH = RuntimeHelper.downcallHandle(
        "WaitNamedPipeA",
        constants$290.WaitNamedPipeA$FUNC
    );
}


