// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$408 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$408() {}
    static final FunctionDescriptor UnregisterHotKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterHotKey$MH = RuntimeHelper.downcallHandle(
        "UnregisterHotKey",
        constants$408.UnregisterHotKey$FUNC
    );
    static final FunctionDescriptor ExitWindowsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitWindowsEx$MH = RuntimeHelper.downcallHandle(
        "ExitWindowsEx",
        constants$408.ExitWindowsEx$FUNC
    );
    static final FunctionDescriptor SwapMouseButton$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SwapMouseButton$MH = RuntimeHelper.downcallHandle(
        "SwapMouseButton",
        constants$408.SwapMouseButton$FUNC
    );
    static final FunctionDescriptor GetMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetMessagePos",
        constants$408.GetMessagePos$FUNC
    );
    static final FunctionDescriptor GetMessageTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessageTime$MH = RuntimeHelper.downcallHandle(
        "GetMessageTime",
        constants$408.GetMessageTime$FUNC
    );
    static final FunctionDescriptor GetMessageExtraInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle GetMessageExtraInfo$MH = RuntimeHelper.downcallHandle(
        "GetMessageExtraInfo",
        constants$408.GetMessageExtraInfo$FUNC
    );
}


