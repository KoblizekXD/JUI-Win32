// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$163 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$163() {}
    static final FunctionDescriptor SwitchToThread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SwitchToThread$MH = RuntimeHelper.downcallHandle(
        "SwitchToThread",
        constants$163.SwitchToThread$FUNC
    );
    static final FunctionDescriptor CreateThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateThread$MH = RuntimeHelper.downcallHandle(
        "CreateThread",
        constants$163.CreateThread$FUNC
    );
    static final FunctionDescriptor CreateRemoteThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateRemoteThread$MH = RuntimeHelper.downcallHandle(
        "CreateRemoteThread",
        constants$163.CreateRemoteThread$FUNC
    );
    static final FunctionDescriptor GetCurrentThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetCurrentThread$MH = RuntimeHelper.downcallHandle(
        "GetCurrentThread",
        constants$163.GetCurrentThread$FUNC
    );
    static final FunctionDescriptor GetCurrentThreadId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetCurrentThreadId$MH = RuntimeHelper.downcallHandle(
        "GetCurrentThreadId",
        constants$163.GetCurrentThreadId$FUNC
    );
    static final FunctionDescriptor OpenThread$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenThread$MH = RuntimeHelper.downcallHandle(
        "OpenThread",
        constants$163.OpenThread$FUNC
    );
}


