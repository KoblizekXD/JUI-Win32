// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$609 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$609() {}
    static final FunctionDescriptor TIMECALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle TIMECALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$609.TIMECALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor LPTIMECALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor LPTIMECALLBACK_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPTIMECALLBACK_UP$MH = RuntimeHelper.upcallHandle(LPTIMECALLBACK.class, "apply", constants$609.LPTIMECALLBACK_UP$FUNC);
    static final FunctionDescriptor LPTIMECALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle LPTIMECALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$609.LPTIMECALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor timeSetEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle timeSetEvent$MH = RuntimeHelper.downcallHandle(
        "timeSetEvent",
        constants$609.timeSetEvent$FUNC
    );
    static final FunctionDescriptor timeKillEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle timeKillEvent$MH = RuntimeHelper.downcallHandle(
        "timeKillEvent",
        constants$609.timeKillEvent$FUNC
    );
    static final FunctionDescriptor sndPlaySoundA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sndPlaySoundA$MH = RuntimeHelper.downcallHandle(
        "sndPlaySoundA",
        constants$609.sndPlaySoundA$FUNC
    );
}


