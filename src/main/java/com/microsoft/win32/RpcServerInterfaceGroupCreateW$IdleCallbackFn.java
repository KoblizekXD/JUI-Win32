// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*RpcServerInterfaceGroupCreateW$IdleCallbackFn)(RPC_INTERFACE_GROUP,void*,unsigned long);
 * }
 */
public interface RpcServerInterfaceGroupCreateW$IdleCallbackFn {

    void apply(java.lang.foreign.MemorySegment IfGroup, java.lang.foreign.MemorySegment IdleCallbackContext, int IsGroupIdle);
    static MemorySegment allocate(RpcServerInterfaceGroupCreateW$IdleCallbackFn fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$657.RpcServerInterfaceGroupCreateW$IdleCallbackFn_UP$MH, fi, constants$657.RpcServerInterfaceGroupCreateW$IdleCallbackFn$FUNC, scope);
    }
    static RpcServerInterfaceGroupCreateW$IdleCallbackFn ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _IfGroup, java.lang.foreign.MemorySegment _IdleCallbackContext, int _IsGroupIdle) -> {
            try {
                constants$658.RpcServerInterfaceGroupCreateW$IdleCallbackFn_DOWN$MH.invokeExact(symbol, _IfGroup, _IdleCallbackContext, _IsGroupIdle);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

