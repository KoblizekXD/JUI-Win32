// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*DATEFMT_ENUMPROCEXA)(char*,unsigned long);
 * }
 */
public interface DATEFMT_ENUMPROCEXA {

    int apply(java.lang.foreign.MemorySegment _x0, int _x1);
    static MemorySegment allocate(DATEFMT_ENUMPROCEXA fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$521.DATEFMT_ENUMPROCEXA_UP$MH, fi, constants$521.DATEFMT_ENUMPROCEXA$FUNC, scope);
    }
    static DATEFMT_ENUMPROCEXA ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
            try {
                return (int)constants$521.DATEFMT_ENUMPROCEXA_DOWN$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

