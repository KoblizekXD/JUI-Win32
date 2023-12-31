// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*CS_TYPE_LOCAL_SIZE_ROUTINE)(void* hBinding,unsigned long ulNetworkCodeSet,unsigned long ulNetworkBufferSize,enum _IDL_CS_CONVERT* conversionType,unsigned long* pulLocalBufferSize,unsigned long* pStatus);
 * }
 */
public interface CS_TYPE_LOCAL_SIZE_ROUTINE {

    void apply(java.lang.foreign.MemorySegment hBinding, int ulNetworkCodeSet, int ulNetworkBufferSize, java.lang.foreign.MemorySegment conversionType, java.lang.foreign.MemorySegment pulLocalBufferSize, java.lang.foreign.MemorySegment pStatus);
    static MemorySegment allocate(CS_TYPE_LOCAL_SIZE_ROUTINE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$812.CS_TYPE_LOCAL_SIZE_ROUTINE_UP$MH, fi, constants$812.CS_TYPE_LOCAL_SIZE_ROUTINE$FUNC, scope);
    }
    static CS_TYPE_LOCAL_SIZE_ROUTINE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hBinding, int _ulNetworkCodeSet, int _ulNetworkBufferSize, java.lang.foreign.MemorySegment _conversionType, java.lang.foreign.MemorySegment _pulLocalBufferSize, java.lang.foreign.MemorySegment _pStatus) -> {
            try {
                constants$813.CS_TYPE_LOCAL_SIZE_ROUTINE_DOWN$MH.invokeExact(symbol, _hBinding, _ulNetworkCodeSet, _ulNetworkBufferSize, _conversionType, _pulLocalBufferSize, _pStatus);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


