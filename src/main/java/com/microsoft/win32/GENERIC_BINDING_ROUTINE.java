// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*GENERIC_BINDING_ROUTINE)(void*);
 * }
 */
public interface GENERIC_BINDING_ROUTINE {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(GENERIC_BINDING_ROUTINE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$810.GENERIC_BINDING_ROUTINE_UP$MH, fi, constants$810.GENERIC_BINDING_ROUTINE$FUNC, scope);
    }
    static GENERIC_BINDING_ROUTINE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$810.GENERIC_BINDING_ROUTINE_DOWN$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


