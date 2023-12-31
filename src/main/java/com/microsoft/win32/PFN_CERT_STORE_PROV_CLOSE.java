// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_CERT_STORE_PROV_CLOSE)(void* hStoreProv,unsigned long dwFlags);
 * }
 */
public interface PFN_CERT_STORE_PROV_CLOSE {

    void apply(java.lang.foreign.MemorySegment hStoreProv, int dwFlags);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_CLOSE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$751.PFN_CERT_STORE_PROV_CLOSE_UP$MH, fi, constants$751.PFN_CERT_STORE_PROV_CLOSE$FUNC, scope);
    }
    static PFN_CERT_STORE_PROV_CLOSE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hStoreProv, int _dwFlags) -> {
            try {
                constants$752.PFN_CERT_STORE_PROV_CLOSE_DOWN$MH.invokeExact(symbol, _hStoreProv, _dwFlags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


