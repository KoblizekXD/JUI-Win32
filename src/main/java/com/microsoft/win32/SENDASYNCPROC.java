// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*SENDASYNCPROC)(struct HWND__*,unsigned int,unsigned long long,long long);
 * }
 */
public interface SENDASYNCPROC {

    void apply(java.lang.foreign.MemorySegment _x0, int _x1, long _x2, long _x3);
    static MemorySegment allocate(SENDASYNCPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$391.SENDASYNCPROC_UP$MH, fi, constants$391.SENDASYNCPROC$FUNC, scope);
    }
    static SENDASYNCPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, int __x1, long __x2, long __x3) -> {
            try {
                constants$391.SENDASYNCPROC_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


