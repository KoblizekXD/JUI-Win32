// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$806 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$806() {}
    static final FunctionDescriptor I_RpcDefaultAllocate$RealAlloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final FunctionDescriptor I_RpcDefaultAllocate$RealAlloc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle I_RpcDefaultAllocate$RealAlloc_UP$MH = RuntimeHelper.upcallHandle(I_RpcDefaultAllocate$RealAlloc.class, "apply", constants$806.I_RpcDefaultAllocate$RealAlloc_UP$FUNC);
    static final FunctionDescriptor I_RpcDefaultAllocate$RealAlloc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle I_RpcDefaultAllocate$RealAlloc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$806.I_RpcDefaultAllocate$RealAlloc_DOWN$FUNC
    );
    static final FunctionDescriptor I_RpcDefaultAllocate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcDefaultAllocate$MH = RuntimeHelper.downcallHandle(
        "I_RpcDefaultAllocate",
        constants$806.I_RpcDefaultAllocate$FUNC
    );
    static final FunctionDescriptor I_RpcDefaultFree$RealFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor I_RpcDefaultFree$RealFree_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcDefaultFree$RealFree_UP$MH = RuntimeHelper.upcallHandle(I_RpcDefaultFree$RealFree.class, "apply", constants$806.I_RpcDefaultFree$RealFree_UP$FUNC);
    static final FunctionDescriptor I_RpcDefaultFree$RealFree_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcDefaultFree$RealFree_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$806.I_RpcDefaultFree$RealFree_DOWN$FUNC
    );
    static final FunctionDescriptor I_RpcDefaultFree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle I_RpcDefaultFree$MH = RuntimeHelper.downcallHandle(
        "I_RpcDefaultFree",
        constants$806.I_RpcDefaultFree$FUNC
    );
}


