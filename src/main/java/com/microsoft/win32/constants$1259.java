// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1259 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1259() {}
    static final FunctionDescriptor QueryServiceStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceStatus$MH = RuntimeHelper.downcallHandle(
        "QueryServiceStatus",
        constants$1259.QueryServiceStatus$FUNC
    );
    static final FunctionDescriptor QueryServiceStatusEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceStatusEx$MH = RuntimeHelper.downcallHandle(
        "QueryServiceStatusEx",
        constants$1259.QueryServiceStatusEx$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerA$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerA",
        constants$1259.RegisterServiceCtrlHandlerA$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerW$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerW",
        constants$1259.RegisterServiceCtrlHandlerW$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerExA$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerExA",
        constants$1259.RegisterServiceCtrlHandlerExA$FUNC
    );
    static final FunctionDescriptor RegisterServiceCtrlHandlerExW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RegisterServiceCtrlHandlerExW$MH = RuntimeHelper.downcallHandle(
        "RegisterServiceCtrlHandlerExW",
        constants$1259.RegisterServiceCtrlHandlerExW$FUNC
    );
}


