// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*LPOCNCHKPROC)(unsigned long long,unsigned long long,void*);
 * }
 */
public interface LPOCNCHKPROC {

    int apply(long _x0, long _x1, java.lang.foreign.MemorySegment _x2);
    static MemorySegment allocate(LPOCNCHKPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$869.LPOCNCHKPROC_UP$MH, fi, constants$869.LPOCNCHKPROC$FUNC, scope);
    }
    static LPOCNCHKPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (long __x0, long __x1, java.lang.foreign.MemorySegment __x2) -> {
            try {
                return (int)constants$869.LPOCNCHKPROC_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

