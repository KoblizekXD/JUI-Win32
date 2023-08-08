// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_READ_CTL)(void* hStoreProv,struct _CTL_CONTEXT* pStoreCtlContext,unsigned long dwFlags,struct _CTL_CONTEXT** ppProvCtlContext);
 * }
 */
public interface PFN_CERT_STORE_PROV_READ_CTL {

    int apply(java.lang.foreign.MemorySegment hStoreProv, java.lang.foreign.MemorySegment pStoreCtlContext, int dwFlags, java.lang.foreign.MemorySegment ppProvCtlContext);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_READ_CTL fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$754.PFN_CERT_STORE_PROV_READ_CTL_UP$MH, fi, constants$754.PFN_CERT_STORE_PROV_READ_CTL$FUNC, scope);
    }
    static PFN_CERT_STORE_PROV_READ_CTL ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hStoreProv, java.lang.foreign.MemorySegment _pStoreCtlContext, int _dwFlags, java.lang.foreign.MemorySegment _ppProvCtlContext) -> {
            try {
                return (int)constants$755.PFN_CERT_STORE_PROV_READ_CTL_DOWN$MH.invokeExact(symbol, _hStoreProv, _pStoreCtlContext, _dwFlags, _ppProvCtlContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

