// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*LPFIBER_START_ROUTINE)(void*);
 * }
 */
public interface LPFIBER_START_ROUTINE {

    void apply(java.lang.foreign.MemorySegment pParameter);
    static MemorySegment allocate(LPFIBER_START_ROUTINE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$239.LPFIBER_START_ROUTINE_UP$MH, fi, constants$239.LPFIBER_START_ROUTINE$FUNC, scope);
    }
    static LPFIBER_START_ROUTINE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pParameter) -> {
            try {
                constants$239.LPFIBER_START_ROUTINE_DOWN$MH.invokeExact(symbol, _pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


