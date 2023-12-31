// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*EDITWORDBREAKPROCW)(unsigned short* lpch,int ichCurrent,int cch,int code);
 * }
 */
public interface EDITWORDBREAKPROCW {

    int apply(java.lang.foreign.MemorySegment lpch, int ichCurrent, int cch, int code);
    static MemorySegment allocate(EDITWORDBREAKPROCW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$393.EDITWORDBREAKPROCW_UP$MH, fi, constants$393.EDITWORDBREAKPROCW$FUNC, scope);
    }
    static EDITWORDBREAKPROCW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _lpch, int _ichCurrent, int _cch, int _code) -> {
            try {
                return (int)constants$393.EDITWORDBREAKPROCW_DOWN$MH.invokeExact(symbol, _lpch, _ichCurrent, _cch, _code);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


