// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long long (*LPMMIOPROC)(char*,unsigned int,long long,long long);
 * }
 */
public interface LPMMIOPROC {

    long apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, long _x3);
    static MemorySegment allocate(LPMMIOPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$605.LPMMIOPROC_UP$MH, fi, constants$605.LPMMIOPROC$FUNC, scope);
    }
    static LPMMIOPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, long __x3) -> {
            try {
                return (long)constants$605.LPMMIOPROC_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


