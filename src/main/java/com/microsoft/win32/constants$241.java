// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$241 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$241() {}
    static final FunctionDescriptor GlobalHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalHandle$MH = RuntimeHelper.downcallHandle(
        "GlobalHandle",
        constants$241.GlobalHandle$FUNC
    );
    static final FunctionDescriptor GlobalFree$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFree$MH = RuntimeHelper.downcallHandle(
        "GlobalFree",
        constants$241.GlobalFree$FUNC
    );
    static final FunctionDescriptor GlobalCompact$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GlobalCompact$MH = RuntimeHelper.downcallHandle(
        "GlobalCompact",
        constants$241.GlobalCompact$FUNC
    );
    static final FunctionDescriptor GlobalFix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalFix$MH = RuntimeHelper.downcallHandle(
        "GlobalFix",
        constants$241.GlobalFix$FUNC
    );
    static final FunctionDescriptor GlobalUnfix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalUnfix$MH = RuntimeHelper.downcallHandle(
        "GlobalUnfix",
        constants$241.GlobalUnfix$FUNC
    );
    static final FunctionDescriptor GlobalWire$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GlobalWire$MH = RuntimeHelper.downcallHandle(
        "GlobalWire",
        constants$241.GlobalWire$FUNC
    );
}


