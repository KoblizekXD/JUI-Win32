// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * long (*LPFNCANUNLOADNOW)();
 * }
 */
public interface LPFNCANUNLOADNOW {

    int apply();
    static MemorySegment allocate(LPFNCANUNLOADNOW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$993.LPFNCANUNLOADNOW_UP$MH, fi, constants$993.LPFNCANUNLOADNOW$FUNC, scope);
    }
    static LPFNCANUNLOADNOW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                return (int)constants$993.LPFNCANUNLOADNOW_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


