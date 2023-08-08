// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PGET_MODULE_HANDLE_EXA)(unsigned long dwFlags,char* lpModuleName,struct HINSTANCE__** phModule);
 * }
 */
public interface PGET_MODULE_HANDLE_EXA {

    int apply(int dwFlags, java.lang.foreign.MemorySegment lpModuleName, java.lang.foreign.MemorySegment phModule);
    static MemorySegment allocate(PGET_MODULE_HANDLE_EXA fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$212.PGET_MODULE_HANDLE_EXA_UP$MH, fi, constants$212.PGET_MODULE_HANDLE_EXA$FUNC, scope);
    }
    static PGET_MODULE_HANDLE_EXA ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _dwFlags, java.lang.foreign.MemorySegment _lpModuleName, java.lang.foreign.MemorySegment _phModule) -> {
            try {
                return (int)constants$212.PGET_MODULE_HANDLE_EXA_DOWN$MH.invokeExact(symbol, _dwFlags, _lpModuleName, _phModule);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


