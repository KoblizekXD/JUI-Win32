// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$110 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$110() {}
    static final FunctionDescriptor PTP_WAIT_CALLBACK_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PTP_WAIT_CALLBACK_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$110.PTP_WAIT_CALLBACK_DOWN$FUNC
    );
    static final FunctionDescriptor FARPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final FunctionDescriptor FARPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle FARPROC_UP$MH = RuntimeHelper.upcallHandle(FARPROC.class, "apply", constants$110.FARPROC_UP$FUNC);
    static final FunctionDescriptor FARPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle FARPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$110.FARPROC_DOWN$FUNC
    );
    static final FunctionDescriptor NEARPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final FunctionDescriptor NEARPROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle NEARPROC_UP$MH = RuntimeHelper.upcallHandle(NEARPROC.class, "apply", constants$110.NEARPROC_UP$FUNC);
    static final FunctionDescriptor NEARPROC_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle NEARPROC_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$110.NEARPROC_DOWN$FUNC
    );
    static final FunctionDescriptor PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final FunctionDescriptor PROC_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle PROC_UP$MH = RuntimeHelper.upcallHandle(PROC.class, "apply", constants$110.PROC_UP$FUNC);
}


