// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$100() {}
    static final FunctionDescriptor RtlInterlockedPopEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInterlockedPopEntrySList$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedPopEntrySList",
        constants$100.RtlInterlockedPopEntrySList$FUNC
    );
    static final FunctionDescriptor RtlInterlockedPushEntrySList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInterlockedPushEntrySList$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedPushEntrySList",
        constants$100.RtlInterlockedPushEntrySList$FUNC
    );
    static final FunctionDescriptor RtlInterlockedPushListSListEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RtlInterlockedPushListSListEx$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedPushListSListEx",
        constants$100.RtlInterlockedPushListSListEx$FUNC
    );
    static final FunctionDescriptor RtlInterlockedFlushSList$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlInterlockedFlushSList$MH = RuntimeHelper.downcallHandle(
        "RtlInterlockedFlushSList",
        constants$100.RtlInterlockedFlushSList$FUNC
    );
    static final FunctionDescriptor RtlQueryDepthSList$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RtlQueryDepthSList$MH = RuntimeHelper.downcallHandle(
        "RtlQueryDepthSList",
        constants$100.RtlQueryDepthSList$FUNC
    );
    static final FunctionDescriptor RtlGetReturnAddressHijackTarget$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle RtlGetReturnAddressHijackTarget$MH = RuntimeHelper.downcallHandle(
        "RtlGetReturnAddressHijackTarget",
        constants$100.RtlGetReturnAddressHijackTarget$FUNC
    );
}


