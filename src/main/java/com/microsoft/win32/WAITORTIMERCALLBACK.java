// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*WAITORTIMERCALLBACK)(void*,unsigned char);
 * }
 */
public interface WAITORTIMERCALLBACK {

    void apply(java.lang.foreign.MemorySegment _x0, byte _x1);
    static MemorySegment allocate(WAITORTIMERCALLBACK fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$107.WAITORTIMERCALLBACK_UP$MH, fi, constants$107.WAITORTIMERCALLBACK$FUNC, scope);
    }
    static WAITORTIMERCALLBACK ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, byte __x1) -> {
            try {
                constants$107.WAITORTIMERCALLBACK_DOWN$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

