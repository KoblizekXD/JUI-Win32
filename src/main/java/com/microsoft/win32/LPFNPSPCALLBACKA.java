// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*LPFNPSPCALLBACKA)(struct HWND__* hwnd,unsigned int uMsg,struct _PROPSHEETPAGEA* ppsp);
 * }
 */
public interface LPFNPSPCALLBACKA {

    int apply(java.lang.foreign.MemorySegment hwnd, int uMsg, java.lang.foreign.MemorySegment ppsp);
    static MemorySegment allocate(LPFNPSPCALLBACKA fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$872.LPFNPSPCALLBACKA_UP$MH, fi, constants$872.LPFNPSPCALLBACKA$FUNC, scope);
    }
    static LPFNPSPCALLBACKA ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hwnd, int _uMsg, java.lang.foreign.MemorySegment _ppsp) -> {
            try {
                return (int)constants$873.LPFNPSPCALLBACKA_DOWN$MH.invokeExact(symbol, _hwnd, _uMsg, _ppsp);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


