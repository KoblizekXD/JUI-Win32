// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*atexit$x0)();
 * }
 */
public interface atexit$x0 {

    void apply();
    static MemorySegment allocate(atexit$x0 fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$918.atexit$x0_UP$MH, fi, constants$918.atexit$x0$FUNC, scope);
    }
    static atexit$x0 ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$918.atexit$x0_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


