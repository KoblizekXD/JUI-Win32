// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned char (*PREGISTERCLASSNAMEW)(unsigned short*);
 * }
 */
public interface PREGISTERCLASSNAMEW {

    byte apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(PREGISTERCLASSNAMEW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$417.PREGISTERCLASSNAMEW_UP$MH, fi, constants$417.PREGISTERCLASSNAMEW$FUNC, scope);
    }
    static PREGISTERCLASSNAMEW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (byte)constants$417.PREGISTERCLASSNAMEW_DOWN$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


