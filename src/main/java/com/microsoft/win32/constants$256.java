// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$256 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$256() {}
    static final FunctionDescriptor SetCommConfig$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCommConfig$MH = RuntimeHelper.downcallHandle(
        "SetCommConfig",
        constants$256.SetCommConfig$FUNC
    );
    static final FunctionDescriptor SetCommMask$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetCommMask$MH = RuntimeHelper.downcallHandle(
        "SetCommMask",
        constants$256.SetCommMask$FUNC
    );
    static final FunctionDescriptor SetCommState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCommState$MH = RuntimeHelper.downcallHandle(
        "SetCommState",
        constants$256.SetCommState$FUNC
    );
    static final FunctionDescriptor SetCommTimeouts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCommTimeouts$MH = RuntimeHelper.downcallHandle(
        "SetCommTimeouts",
        constants$256.SetCommTimeouts$FUNC
    );
    static final FunctionDescriptor TransmitCommChar$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle TransmitCommChar$MH = RuntimeHelper.downcallHandle(
        "TransmitCommChar",
        constants$256.TransmitCommChar$FUNC
    );
    static final FunctionDescriptor WaitCommEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle WaitCommEvent$MH = RuntimeHelper.downcallHandle(
        "WaitCommEvent",
        constants$256.WaitCommEvent$FUNC
    );
}

