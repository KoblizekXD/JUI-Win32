// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*I_RpcFreeCalloutStateFn)(struct _RDR_CALLOUT_STATE* CallOutState);
 * }
 */
public interface I_RpcFreeCalloutStateFn {

    void apply(java.lang.foreign.MemorySegment pParameter);
    static MemorySegment allocate(I_RpcFreeCalloutStateFn fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$676.I_RpcFreeCalloutStateFn_UP$MH, fi, constants$676.I_RpcFreeCalloutStateFn$FUNC, scope);
    }
    static I_RpcFreeCalloutStateFn ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pParameter) -> {
            try {
                constants$676.I_RpcFreeCalloutStateFn_DOWN$MH.invokeExact(symbol, _pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

