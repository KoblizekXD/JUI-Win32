// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$303 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$303() {}
    static final FunctionDescriptor CommConfigDialogW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CommConfigDialogW$MH = RuntimeHelper.downcallHandle(
        "CommConfigDialogW",
        constants$303.CommConfigDialogW$FUNC
    );
    static final FunctionDescriptor GetDefaultCommConfigA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDefaultCommConfigA$MH = RuntimeHelper.downcallHandle(
        "GetDefaultCommConfigA",
        constants$303.GetDefaultCommConfigA$FUNC
    );
    static final FunctionDescriptor GetDefaultCommConfigW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDefaultCommConfigW$MH = RuntimeHelper.downcallHandle(
        "GetDefaultCommConfigW",
        constants$303.GetDefaultCommConfigW$FUNC
    );
    static final FunctionDescriptor SetDefaultCommConfigA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDefaultCommConfigA$MH = RuntimeHelper.downcallHandle(
        "SetDefaultCommConfigA",
        constants$303.SetDefaultCommConfigA$FUNC
    );
    static final FunctionDescriptor SetDefaultCommConfigW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetDefaultCommConfigW$MH = RuntimeHelper.downcallHandle(
        "SetDefaultCommConfigW",
        constants$303.SetDefaultCommConfigW$FUNC
    );
    static final FunctionDescriptor GetComputerNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComputerNameA$MH = RuntimeHelper.downcallHandle(
        "GetComputerNameA",
        constants$303.GetComputerNameA$FUNC
    );
}

