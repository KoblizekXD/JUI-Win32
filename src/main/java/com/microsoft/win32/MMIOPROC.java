// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * LRESULT (*MMIOPROC)(LPSTR lpmmioinfo,UINT uMsg,LPARAM lParam1,LPARAM lParam2);
 * }
 */
public interface MMIOPROC {

    long apply(java.lang.foreign.MemorySegment lpmmioinfo, int uMsg, long lParam1, long lParam2);
    static MemorySegment allocate(MMIOPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$604.MMIOPROC_UP$MH, fi, constants$604.MMIOPROC$FUNC, scope);
    }
    static MMIOPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _lpmmioinfo, int _uMsg, long _lParam1, long _lParam2) -> {
            try {
                return (long)constants$604.MMIOPROC_DOWN$MH.invokeExact(symbol, _lpmmioinfo, _uMsg, _lParam1, _lParam2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


