// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$618 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$618() {}
    static final FunctionDescriptor LPMIDICALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LPMIDICALLBACK_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPMIDICALLBACK_UP$MH = RuntimeHelper.upcallHandle(LPMIDICALLBACK.class, "apply", constants$618.LPMIDICALLBACK_UP$FUNC);
    static final FunctionDescriptor LPMIDICALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPMIDICALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$618.LPMIDICALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor midiOutGetNumDevs$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle midiOutGetNumDevs$MH = RuntimeHelper.downcallHandle(
        "midiOutGetNumDevs",
        constants$618.midiOutGetNumDevs$FUNC
    );
    static final FunctionDescriptor midiStreamOpen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiStreamOpen$MH = RuntimeHelper.downcallHandle(
        "midiStreamOpen",
        constants$618.midiStreamOpen$FUNC
    );
    static final FunctionDescriptor midiStreamClose$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle midiStreamClose$MH = RuntimeHelper.downcallHandle(
        "midiStreamClose",
        constants$618.midiStreamClose$FUNC
    );
    static final FunctionDescriptor midiStreamProperty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle midiStreamProperty$MH = RuntimeHelper.downcallHandle(
        "midiStreamProperty",
        constants$618.midiStreamProperty$FUNC
    );
}


