// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_CRYPT_FREE)(void* pv);
 * }
 */
public interface PFN_CRYPT_FREE {

    void apply(java.lang.foreign.MemorySegment pParameter);
    static MemorySegment allocate(PFN_CRYPT_FREE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$739.PFN_CRYPT_FREE_UP$MH, fi, constants$739.PFN_CRYPT_FREE$FUNC, scope);
    }
    static PFN_CRYPT_FREE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pParameter) -> {
            try {
                constants$739.PFN_CRYPT_FREE_DOWN$MH.invokeExact(symbol, _pParameter);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


