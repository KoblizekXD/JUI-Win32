// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$407 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$407() {}
    static final FunctionDescriptor DispatchMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispatchMessageA$MH = RuntimeHelper.downcallHandle(
        "DispatchMessageA",
        constants$407.DispatchMessageA$FUNC
    );
    static final FunctionDescriptor DispatchMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DispatchMessageW$MH = RuntimeHelper.downcallHandle(
        "DispatchMessageW",
        constants$407.DispatchMessageW$FUNC
    );
    static final FunctionDescriptor SetMessageQueue$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMessageQueue$MH = RuntimeHelper.downcallHandle(
        "SetMessageQueue",
        constants$407.SetMessageQueue$FUNC
    );
    static final FunctionDescriptor PeekMessageA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PeekMessageA$MH = RuntimeHelper.downcallHandle(
        "PeekMessageA",
        constants$407.PeekMessageA$FUNC
    );
    static final FunctionDescriptor PeekMessageW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PeekMessageW$MH = RuntimeHelper.downcallHandle(
        "PeekMessageW",
        constants$407.PeekMessageW$FUNC
    );
    static final FunctionDescriptor RegisterHotKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterHotKey$MH = RuntimeHelper.downcallHandle(
        "RegisterHotKey",
        constants$407.RegisterHotKey$FUNC
    );
}


