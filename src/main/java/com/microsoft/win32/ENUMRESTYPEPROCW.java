// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*ENUMRESTYPEPROCW)(struct HINSTANCE__* hModule,unsigned short* lpType,long long lParam);
 * }
 */
public interface ENUMRESTYPEPROCW {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2);
    static MemorySegment allocate(ENUMRESTYPEPROCW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$210.ENUMRESTYPEPROCW_UP$MH, fi, constants$210.ENUMRESTYPEPROCW$FUNC, scope);
    }
    static ENUMRESTYPEPROCW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2) -> {
            try {
                return (int)constants$210.ENUMRESTYPEPROCW_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


