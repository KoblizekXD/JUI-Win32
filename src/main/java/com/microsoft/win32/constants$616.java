// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$616 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$616() {}
    static final FunctionDescriptor waveInClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInClose$MH = RuntimeHelper.downcallHandle(
        "waveInClose",
        constants$616.waveInClose$FUNC
    );
    static final FunctionDescriptor waveInPrepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInPrepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveInPrepareHeader",
        constants$616.waveInPrepareHeader$FUNC
    );
    static final FunctionDescriptor waveInUnprepareHeader$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        "waveInUnprepareHeader",
        constants$616.waveInUnprepareHeader$FUNC
    );
    static final FunctionDescriptor waveInAddBuffer$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle waveInAddBuffer$MH = RuntimeHelper.downcallHandle(
        "waveInAddBuffer",
        constants$616.waveInAddBuffer$FUNC
    );
    static final FunctionDescriptor waveInStart$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInStart$MH = RuntimeHelper.downcallHandle(
        "waveInStart",
        constants$616.waveInStart$FUNC
    );
    static final FunctionDescriptor waveInStop$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle waveInStop$MH = RuntimeHelper.downcallHandle(
        "waveInStop",
        constants$616.waveInStop$FUNC
    );
}


