// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*WAVECALLBACK)(HDRVR,UINT,DWORD_PTR,DWORD_PTR,DWORD_PTR);
 * }
 */
public interface WAVECALLBACK {

    void apply(java.lang.foreign.MemorySegment hdrvr, int uMsg, long dwUser, long dw1, long dw2);
    static MemorySegment allocate(WAVECALLBACK fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$610.WAVECALLBACK_UP$MH, fi, constants$610.WAVECALLBACK$FUNC, scope);
    }
    static WAVECALLBACK ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hdrvr, int _uMsg, long _dwUser, long _dw1, long _dw2) -> {
            try {
                constants$610.WAVECALLBACK_DOWN$MH.invokeExact(symbol, _hdrvr, _uMsg, _dwUser, _dw1, _dw2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


