// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$161 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$161() {}
    static final FunctionDescriptor InterlockedPushEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedPushEntrySList$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushEntrySList",
        constants$161.InterlockedPushEntrySList$FUNC
    );
    static final FunctionDescriptor InterlockedPushListSListEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle InterlockedPushListSListEx$MH = RuntimeHelper.downcallHandle(
        "InterlockedPushListSListEx",
        constants$161.InterlockedPushListSListEx$FUNC
    );
    static final FunctionDescriptor InterlockedFlushSList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InterlockedFlushSList$MH = RuntimeHelper.downcallHandle(
        "InterlockedFlushSList",
        constants$161.InterlockedFlushSList$FUNC
    );
    static final FunctionDescriptor QueryDepthSList$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryDepthSList$MH = RuntimeHelper.downcallHandle(
        "QueryDepthSList",
        constants$161.QueryDepthSList$FUNC
    );
    static final FunctionDescriptor QueueUserAPC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle QueueUserAPC$MH = RuntimeHelper.downcallHandle(
        "QueueUserAPC",
        constants$161.QueueUserAPC$FUNC
    );
    static final FunctionDescriptor QueueUserAPC2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle QueueUserAPC2$MH = RuntimeHelper.downcallHandle(
        "QueueUserAPC2",
        constants$161.QueueUserAPC2$FUNC
    );
}


