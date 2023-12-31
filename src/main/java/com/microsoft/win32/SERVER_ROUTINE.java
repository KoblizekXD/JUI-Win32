// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long (*SERVER_ROUTINE)();
 * }
 */
public interface SERVER_ROUTINE {

    int apply();
    static MemorySegment allocate(SERVER_ROUTINE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$814.SERVER_ROUTINE_UP$MH, fi, constants$814.SERVER_ROUTINE$FUNC, scope);
    }
    static SERVER_ROUTINE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                return (int)constants$814.SERVER_ROUTINE_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


