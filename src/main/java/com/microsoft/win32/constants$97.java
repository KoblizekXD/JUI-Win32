// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$97 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$97() {}
    static final FunctionDescriptor RtlCaptureContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlCaptureContext$MH = RuntimeHelper.downcallHandle(
        "RtlCaptureContext",
        constants$97.RtlCaptureContext$FUNC
    );
    static final FunctionDescriptor RtlCaptureContext2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlCaptureContext2$MH = RuntimeHelper.downcallHandle(
        "RtlCaptureContext2",
        constants$97.RtlCaptureContext2$FUNC
    );
    static final FunctionDescriptor RtlUnwind$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlUnwind$MH = RuntimeHelper.downcallHandle(
        "RtlUnwind",
        constants$97.RtlUnwind$FUNC
    );
    static final FunctionDescriptor RtlAddFunctionTable$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlAddFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlAddFunctionTable",
        constants$97.RtlAddFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlDeleteFunctionTable$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlDeleteFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlDeleteFunctionTable",
        constants$97.RtlDeleteFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlInstallFunctionTableCallback$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInstallFunctionTableCallback$MH = RuntimeHelper.downcallHandle(
        "RtlInstallFunctionTableCallback",
        constants$97.RtlInstallFunctionTableCallback$FUNC
    );
}

