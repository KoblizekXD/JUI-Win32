// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$98 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$98() {}
    static final FunctionDescriptor RtlAddGrowableFunctionTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RtlAddGrowableFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlAddGrowableFunctionTable",
        constants$98.RtlAddGrowableFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlGrowFunctionTable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlGrowFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlGrowFunctionTable",
        constants$98.RtlGrowFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlDeleteGrowableFunctionTable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlDeleteGrowableFunctionTable$MH = RuntimeHelper.downcallHandle(
        "RtlDeleteGrowableFunctionTable",
        constants$98.RtlDeleteGrowableFunctionTable$FUNC
    );
    static final FunctionDescriptor RtlLookupFunctionEntry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlLookupFunctionEntry$MH = RuntimeHelper.downcallHandle(
        "RtlLookupFunctionEntry",
        constants$98.RtlLookupFunctionEntry$FUNC
    );
    static final FunctionDescriptor RtlRestoreContext$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlRestoreContext$MH = RuntimeHelper.downcallHandle(
        "RtlRestoreContext",
        constants$98.RtlRestoreContext$FUNC
    );
    static final FunctionDescriptor RtlUnwindEx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlUnwindEx$MH = RuntimeHelper.downcallHandle(
        "RtlUnwindEx",
        constants$98.RtlUnwindEx$FUNC
    );
}


