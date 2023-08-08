// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*ENUMRESLANGPROCA)(struct HINSTANCE__* hModule,char* lpType,char* lpName,unsigned short wLanguage,long long lParam);
 * }
 */
public interface ENUMRESLANGPROCA {

    int apply(java.lang.foreign.MemorySegment hModule, java.lang.foreign.MemorySegment lpType, java.lang.foreign.MemorySegment lpName, short wLanguage, long lParam);
    static MemorySegment allocate(ENUMRESLANGPROCA fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$208.ENUMRESLANGPROCA_UP$MH, fi, constants$208.ENUMRESLANGPROCA$FUNC, scope);
    }
    static ENUMRESLANGPROCA ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hModule, java.lang.foreign.MemorySegment _lpType, java.lang.foreign.MemorySegment _lpName, short _wLanguage, long _lParam) -> {
            try {
                return (int)constants$209.ENUMRESLANGPROCA_DOWN$MH.invokeExact(symbol, _hModule, _lpType, _lpName, _wLanguage, _lParam);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

