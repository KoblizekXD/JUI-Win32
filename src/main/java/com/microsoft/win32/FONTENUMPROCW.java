// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*FONTENUMPROCW)(struct tagLOGFONTW*,struct tagTEXTMETRICW*,unsigned long,long long);
 * }
 */
public interface FONTENUMPROCW {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, long _x3);
    static MemorySegment allocate(FONTENUMPROCW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$325.FONTENUMPROCW_UP$MH, fi, constants$325.FONTENUMPROCW$FUNC, scope);
    }
    static FONTENUMPROCW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, long __x3) -> {
            try {
                return (int)constants$325.FONTENUMPROCW_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


