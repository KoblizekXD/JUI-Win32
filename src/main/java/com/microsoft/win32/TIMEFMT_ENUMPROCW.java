// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*TIMEFMT_ENUMPROCW)(unsigned short*);
 * }
 */
public interface TIMEFMT_ENUMPROCW {

    int apply(java.lang.foreign.MemorySegment hAsyncRetrieve);
    static MemorySegment allocate(TIMEFMT_ENUMPROCW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$524.TIMEFMT_ENUMPROCW_UP$MH, fi, constants$524.TIMEFMT_ENUMPROCW$FUNC, scope);
    }
    static TIMEFMT_ENUMPROCW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hAsyncRetrieve) -> {
            try {
                return (int)constants$525.TIMEFMT_ENUMPROCW_DOWN$MH.invokeExact(symbol, _hAsyncRetrieve);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


