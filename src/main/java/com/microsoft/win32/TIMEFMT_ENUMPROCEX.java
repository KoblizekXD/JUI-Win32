// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*TIMEFMT_ENUMPROCEX)(unsigned short*,long long);
 * }
 */
public interface TIMEFMT_ENUMPROCEX {

    int apply(java.lang.foreign.MemorySegment _x0, long _x1);
    static MemorySegment allocate(TIMEFMT_ENUMPROCEX fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$546.TIMEFMT_ENUMPROCEX_UP$MH, fi, constants$546.TIMEFMT_ENUMPROCEX$FUNC, scope);
    }
    static TIMEFMT_ENUMPROCEX ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, long __x1) -> {
            try {
                return (int)constants$546.TIMEFMT_ENUMPROCEX_DOWN$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


