// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*STUB_THUNK)(struct _MIDL_STUB_MESSAGE*);
 * }
 */
public interface STUB_THUNK {

    void apply(java.lang.foreign.MemorySegment pParameter);
    static MemorySegment allocate(STUB_THUNK fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$814.STUB_THUNK_UP$MH, fi, constants$814.STUB_THUNK$FUNC, scope);
    }
    static STUB_THUNK ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pParameter) -> {
            try {
                constants$814.STUB_THUNK_DOWN$MH.invokeExact(symbol, _pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


