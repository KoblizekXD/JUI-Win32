// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PQUERYACTCTXW_FUNC)(unsigned long dwFlags,void* hActCtx,void* pvSubInstance,unsigned long ulInfoClass,void* pvBuffer,unsigned long long cbBuffer,unsigned long long* pcbWrittenOrRequired);
 * }
 */
public interface PQUERYACTCTXW_FUNC {

    int apply(int dwFlags, java.lang.foreign.MemorySegment hActCtx, java.lang.foreign.MemorySegment pvSubInstance, int ulInfoClass, java.lang.foreign.MemorySegment pvBuffer, long cbBuffer, java.lang.foreign.MemorySegment pcbWrittenOrRequired);
    static MemorySegment allocate(PQUERYACTCTXW_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$315.PQUERYACTCTXW_FUNC_UP$MH, fi, constants$315.PQUERYACTCTXW_FUNC$FUNC, scope);
    }
    static PQUERYACTCTXW_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _dwFlags, java.lang.foreign.MemorySegment _hActCtx, java.lang.foreign.MemorySegment _pvSubInstance, int _ulInfoClass, java.lang.foreign.MemorySegment _pvBuffer, long _cbBuffer, java.lang.foreign.MemorySegment _pcbWrittenOrRequired) -> {
            try {
                return (int)constants$316.PQUERYACTCTXW_FUNC_DOWN$MH.invokeExact(symbol, _dwFlags, _hActCtx, _pvSubInstance, _ulInfoClass, _pvBuffer, _cbBuffer, _pcbWrittenOrRequired);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


