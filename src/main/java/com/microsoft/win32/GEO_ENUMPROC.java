// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GEO_ENUMPROC)(long);
 * }
 */
public interface GEO_ENUMPROC {

    int apply(int _x0);
    static MemorySegment allocate(GEO_ENUMPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$525.GEO_ENUMPROC_UP$MH, fi, constants$525.GEO_ENUMPROC$FUNC, scope);
    }
    static GEO_ENUMPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int __x0) -> {
            try {
                return (int)constants$526.GEO_ENUMPROC_DOWN$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

