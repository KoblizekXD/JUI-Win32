// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*I_RpcDefaultFree$RealFree)(void*);
 * }
 */
public interface I_RpcDefaultFree$RealFree {

    void apply(java.lang.foreign.MemorySegment pParameter);
    static MemorySegment allocate(I_RpcDefaultFree$RealFree fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$806.I_RpcDefaultFree$RealFree_UP$MH, fi, constants$806.I_RpcDefaultFree$RealFree$FUNC, scope);
    }
    static I_RpcDefaultFree$RealFree ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pParameter) -> {
            try {
                constants$806.I_RpcDefaultFree$RealFree_DOWN$MH.invokeExact(symbol, _pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


