// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GRAYSTRINGPROC)(struct HDC__*,long long,int);
 * }
 */
public interface GRAYSTRINGPROC {

    int apply(java.lang.foreign.MemorySegment _x0, long _x1, int _x2);
    static MemorySegment allocate(GRAYSTRINGPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$390.GRAYSTRINGPROC_UP$MH, fi, constants$390.GRAYSTRINGPROC$FUNC, scope);
    }
    static GRAYSTRINGPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, long __x1, int __x2) -> {
            try {
                return (int)constants$390.GRAYSTRINGPROC_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

