// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*LANGUAGEGROUP_ENUMPROCW)(unsigned long,unsigned short*,unsigned short*,unsigned long,long long);
 * }
 */
public interface LANGUAGEGROUP_ENUMPROCW {

    int apply(int _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, long _x4);
    static MemorySegment allocate(LANGUAGEGROUP_ENUMPROCW fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$522.LANGUAGEGROUP_ENUMPROCW_UP$MH, fi, constants$522.LANGUAGEGROUP_ENUMPROCW$FUNC, scope);
    }
    static LANGUAGEGROUP_ENUMPROCW ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, long __x4) -> {
            try {
                return (int)constants$523.LANGUAGEGROUP_ENUMPROCW_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

