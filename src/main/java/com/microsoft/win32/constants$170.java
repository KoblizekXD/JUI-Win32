// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$170 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$170() {}
    static final FunctionDescriptor QueryProcessAffinityUpdateMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryProcessAffinityUpdateMode$MH = RuntimeHelper.downcallHandle(
        "QueryProcessAffinityUpdateMode",
        constants$170.QueryProcessAffinityUpdateMode$FUNC
    );
    static final FunctionDescriptor CreateRemoteThreadEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateRemoteThreadEx$MH = RuntimeHelper.downcallHandle(
        "CreateRemoteThreadEx",
        constants$170.CreateRemoteThreadEx$FUNC
    );
    static final FunctionDescriptor GetCurrentThreadStackLimits$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentThreadStackLimits$MH = RuntimeHelper.downcallHandle(
        "GetCurrentThreadStackLimits",
        constants$170.GetCurrentThreadStackLimits$FUNC
    );
    static final FunctionDescriptor GetThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadContext$MH = RuntimeHelper.downcallHandle(
        "GetThreadContext",
        constants$170.GetThreadContext$FUNC
    );
    static final FunctionDescriptor GetProcessMitigationPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GetProcessMitigationPolicy$MH = RuntimeHelper.downcallHandle(
        "GetProcessMitigationPolicy",
        constants$170.GetProcessMitigationPolicy$FUNC
    );
    static final FunctionDescriptor SetThreadContext$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadContext$MH = RuntimeHelper.downcallHandle(
        "SetThreadContext",
        constants$170.SetThreadContext$FUNC
    );
}


