// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$257 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$257() {}
    static final FunctionDescriptor OpenCommPort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenCommPort$MH = RuntimeHelper.downcallHandle(
        "OpenCommPort",
        constants$257.OpenCommPort$FUNC
    );
    static final FunctionDescriptor GetCommPorts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCommPorts$MH = RuntimeHelper.downcallHandle(
        "GetCommPorts",
        constants$257.GetCommPorts$FUNC
    );
    static final FunctionDescriptor SetTapePosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTapePosition$MH = RuntimeHelper.downcallHandle(
        "SetTapePosition",
        constants$257.SetTapePosition$FUNC
    );
    static final FunctionDescriptor GetTapePosition$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTapePosition$MH = RuntimeHelper.downcallHandle(
        "GetTapePosition",
        constants$257.GetTapePosition$FUNC
    );
    static final FunctionDescriptor PrepareTape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrepareTape$MH = RuntimeHelper.downcallHandle(
        "PrepareTape",
        constants$257.PrepareTape$FUNC
    );
    static final FunctionDescriptor EraseTape$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle EraseTape$MH = RuntimeHelper.downcallHandle(
        "EraseTape",
        constants$257.EraseTape$FUNC
    );
}


