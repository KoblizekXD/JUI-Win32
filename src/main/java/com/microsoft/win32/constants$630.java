// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$630 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$630() {}
    static final FunctionDescriptor joyGetDevCapsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyGetDevCapsA$MH = RuntimeHelper.downcallHandle(
        "joyGetDevCapsA",
        constants$630.joyGetDevCapsA$FUNC
    );
    static final FunctionDescriptor joyGetDevCapsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyGetDevCapsW$MH = RuntimeHelper.downcallHandle(
        "joyGetDevCapsW",
        constants$630.joyGetDevCapsW$FUNC
    );
    static final FunctionDescriptor joyGetPos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetPos$MH = RuntimeHelper.downcallHandle(
        "joyGetPos",
        constants$630.joyGetPos$FUNC
    );
    static final FunctionDescriptor joyGetThreshold$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle joyGetThreshold$MH = RuntimeHelper.downcallHandle(
        "joyGetThreshold",
        constants$630.joyGetThreshold$FUNC
    );
    static final FunctionDescriptor joyReleaseCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joyReleaseCapture$MH = RuntimeHelper.downcallHandle(
        "joyReleaseCapture",
        constants$630.joyReleaseCapture$FUNC
    );
    static final FunctionDescriptor joySetCapture$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle joySetCapture$MH = RuntimeHelper.downcallHandle(
        "joySetCapture",
        constants$630.joySetCapture$FUNC
    );
}


