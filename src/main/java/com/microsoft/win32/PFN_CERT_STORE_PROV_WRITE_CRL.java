// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_WRITE_CRL)(void* hStoreProv,struct _CRL_CONTEXT* pCrlContext,unsigned long dwFlags);
 * }
 */
public interface PFN_CERT_STORE_PROV_WRITE_CRL {

    int apply(java.lang.foreign.MemorySegment pContext, java.lang.foreign.MemorySegment rgIdentifierOrNameList, int dwIdentifierOrNameListCount);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_WRITE_CRL fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$753.PFN_CERT_STORE_PROV_WRITE_CRL_UP$MH, fi, constants$753.PFN_CERT_STORE_PROV_WRITE_CRL$FUNC, scope);
    }
    static PFN_CERT_STORE_PROV_WRITE_CRL ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pContext, java.lang.foreign.MemorySegment _rgIdentifierOrNameList, int _dwIdentifierOrNameListCount) -> {
            try {
                return (int)constants$754.PFN_CERT_STORE_PROV_WRITE_CRL_DOWN$MH.invokeExact(symbol, _pContext, _rgIdentifierOrNameList, _dwIdentifierOrNameListCount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


