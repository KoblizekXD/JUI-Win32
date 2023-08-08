// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*DRAWSTATEPROC)(struct HDC__* hdc,long long lData,unsigned long long wData,int cx,int cy);
 * }
 */
public interface DRAWSTATEPROC {

    int apply(java.lang.foreign.MemorySegment hdc, long lData, long wData, int cx, int cy);
    static MemorySegment allocate(DRAWSTATEPROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$393.DRAWSTATEPROC_UP$MH, fi, constants$393.DRAWSTATEPROC$FUNC, scope);
    }
    static DRAWSTATEPROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hdc, long _lData, long _wData, int _cx, int _cy) -> {
            try {
                return (int)constants$394.DRAWSTATEPROC_DOWN$MH.invokeExact(symbol, _hdc, _lData, _wData, _cx, _cy);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

