// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned long (*LPHANDLER_FUNCTION_EX)(unsigned long dwControl,unsigned long dwEventType,void* lpEventData,void* lpContext);
 * }
 */
public interface LPHANDLER_FUNCTION_EX {

    int apply(int dwControl, int dwEventType, java.lang.foreign.MemorySegment lpEventData, java.lang.foreign.MemorySegment lpContext);
    static MemorySegment allocate(LPHANDLER_FUNCTION_EX fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1253.LPHANDLER_FUNCTION_EX_UP$MH, fi, constants$1253.LPHANDLER_FUNCTION_EX$FUNC, scope);
    }
    static LPHANDLER_FUNCTION_EX ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _dwControl, int _dwEventType, java.lang.foreign.MemorySegment _lpEventData, java.lang.foreign.MemorySegment _lpContext) -> {
            try {
                return (int)constants$1253.LPHANDLER_FUNCTION_EX_DOWN$MH.invokeExact(symbol, _dwControl, _dwEventType, _lpEventData, _lpContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


