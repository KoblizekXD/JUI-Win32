// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$199 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$199() {}
    static final FunctionDescriptor SetThreadpoolThreadMinimum$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadpoolThreadMinimum$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolThreadMinimum",
        constants$199.SetThreadpoolThreadMinimum$FUNC
    );
    static final FunctionDescriptor SetThreadpoolStackInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetThreadpoolStackInformation$MH = RuntimeHelper.downcallHandle(
        "SetThreadpoolStackInformation",
        constants$199.SetThreadpoolStackInformation$FUNC
    );
    static final FunctionDescriptor QueryThreadpoolStackInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryThreadpoolStackInformation$MH = RuntimeHelper.downcallHandle(
        "QueryThreadpoolStackInformation",
        constants$199.QueryThreadpoolStackInformation$FUNC
    );
    static final FunctionDescriptor CloseThreadpool$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpool$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpool",
        constants$199.CloseThreadpool$FUNC
    );
    static final FunctionDescriptor CreateThreadpoolCleanupGroup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle CreateThreadpoolCleanupGroup$MH = RuntimeHelper.downcallHandle(
        "CreateThreadpoolCleanupGroup",
        constants$199.CreateThreadpoolCleanupGroup$FUNC
    );
    static final FunctionDescriptor CloseThreadpoolCleanupGroupMembers$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseThreadpoolCleanupGroupMembers$MH = RuntimeHelper.downcallHandle(
        "CloseThreadpoolCleanupGroupMembers",
        constants$199.CloseThreadpoolCleanupGroupMembers$FUNC
    );
}


