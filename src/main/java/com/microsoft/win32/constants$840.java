// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$840 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$840() {}
    static final FunctionDescriptor RpcSsFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsFree$MH = RuntimeHelper.downcallHandle(
        "RpcSsFree",
        constants$840.RpcSsFree$FUNC
    );
    static final FunctionDescriptor RpcSsGetThreadHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle RpcSsGetThreadHandle$MH = RuntimeHelper.downcallHandle(
        "RpcSsGetThreadHandle",
        constants$840.RpcSsGetThreadHandle$FUNC
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientAlloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientAlloc_UP$MH = RuntimeHelper.upcallHandle(RpcSsSetClientAllocFree$ClientAlloc.class, "apply", constants$840.RpcSsSetClientAllocFree$ClientAlloc_UP$FUNC);
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientAlloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientAlloc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$840.RpcSsSetClientAllocFree$ClientAlloc_DOWN$FUNC
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientFree_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientFree_UP$MH = RuntimeHelper.upcallHandle(RpcSsSetClientAllocFree$ClientFree.class, "apply", constants$840.RpcSsSetClientAllocFree$ClientFree_UP$FUNC);
    static final FunctionDescriptor RpcSsSetClientAllocFree$ClientFree_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RpcSsSetClientAllocFree$ClientFree_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$840.RpcSsSetClientAllocFree$ClientFree_DOWN$FUNC
    );
}


