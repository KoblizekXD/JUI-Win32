// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * DWORD (*PM_COLLECT_PROC)(LPWSTR pValueName,void** ppData,DWORD* pcbTotalBytes,DWORD* pNumObjectTypes);
 * }
 */
public interface PM_COLLECT_PROC {

    int apply(java.lang.foreign.MemorySegment pValueName, java.lang.foreign.MemorySegment ppData, java.lang.foreign.MemorySegment pcbTotalBytes, java.lang.foreign.MemorySegment pNumObjectTypes);
    static MemorySegment allocate(PM_COLLECT_PROC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$707.PM_COLLECT_PROC_UP$MH, fi, constants$707.PM_COLLECT_PROC$FUNC, scope);
    }
    static PM_COLLECT_PROC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pValueName, java.lang.foreign.MemorySegment _ppData, java.lang.foreign.MemorySegment _pcbTotalBytes, java.lang.foreign.MemorySegment _pNumObjectTypes) -> {
            try {
                return (int)constants$708.PM_COLLECT_PROC_DOWN$MH.invokeExact(symbol, _pValueName, _ppData, _pcbTotalBytes, _pNumObjectTypes);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


