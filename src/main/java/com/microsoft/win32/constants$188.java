// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$188 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$188() {}
    static final FunctionDescriptor VirtualLock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualLock$MH = RuntimeHelper.downcallHandle(
        "VirtualLock",
        constants$188.VirtualLock$FUNC
    );
    static final FunctionDescriptor VirtualUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle VirtualUnlock$MH = RuntimeHelper.downcallHandle(
        "VirtualUnlock",
        constants$188.VirtualUnlock$FUNC
    );
    static final FunctionDescriptor GetWriteWatch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetWriteWatch$MH = RuntimeHelper.downcallHandle(
        "GetWriteWatch",
        constants$188.GetWriteWatch$FUNC
    );
    static final FunctionDescriptor ResetWriteWatch$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle ResetWriteWatch$MH = RuntimeHelper.downcallHandle(
        "ResetWriteWatch",
        constants$188.ResetWriteWatch$FUNC
    );
    static final FunctionDescriptor CreateMemoryResourceNotification$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMemoryResourceNotification$MH = RuntimeHelper.downcallHandle(
        "CreateMemoryResourceNotification",
        constants$188.CreateMemoryResourceNotification$FUNC
    );
    static final FunctionDescriptor QueryMemoryResourceNotification$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryMemoryResourceNotification$MH = RuntimeHelper.downcallHandle(
        "QueryMemoryResourceNotification",
        constants$188.QueryMemoryResourceNotification$FUNC
    );
}

