// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * DWORD (*PM_OPEN_PROC)(LPWSTR pContext);
 * }
 */
public interface PM_OPEN_PROC {

    int apply(java.lang.foreign.MemorySegment pContext);
    static MemorySegment allocate(PM_OPEN_PROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$707.PM_OPEN_PROC_UP$MH, fi, constants$707.PM_OPEN_PROC$FUNC, scope);
    }
    static PM_OPEN_PROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pContext) -> {
            try {
                return (int)constants$707.PM_OPEN_PROC_DOWN$MH.invokeExact(symbol, _pContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


