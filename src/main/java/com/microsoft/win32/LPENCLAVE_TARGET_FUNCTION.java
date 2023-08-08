// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*LPENCLAVE_TARGET_FUNCTION)(void*);
 * }
 */
public interface LPENCLAVE_TARGET_FUNCTION {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(LPENCLAVE_TARGET_FUNCTION fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$59.LPENCLAVE_TARGET_FUNCTION_UP$MH, fi, constants$59.LPENCLAVE_TARGET_FUNCTION$FUNC, scope);
    }
    static LPENCLAVE_TARGET_FUNCTION ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$59.LPENCLAVE_TARGET_FUNCTION_DOWN$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


