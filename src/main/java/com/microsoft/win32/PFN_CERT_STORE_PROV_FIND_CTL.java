// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_FIND_CTL)(void* hStoreProv,struct _CERT_STORE_PROV_FIND_INFO* pFindInfo,struct _CTL_CONTEXT* pPrevCtlContext,unsigned long dwFlags,void** ppvStoreProvFindInfo,struct _CTL_CONTEXT** ppProvCtlContext);
 * }
 */
public interface PFN_CERT_STORE_PROV_FIND_CTL {

    int apply(java.lang.foreign.MemorySegment hStoreProv, java.lang.foreign.MemorySegment pFindInfo, java.lang.foreign.MemorySegment pPrevCtlContext, int dwFlags, java.lang.foreign.MemorySegment ppvStoreProvFindInfo, java.lang.foreign.MemorySegment ppProvCtlContext);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_FIND_CTL fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$758.PFN_CERT_STORE_PROV_FIND_CTL_UP$MH, fi, constants$758.PFN_CERT_STORE_PROV_FIND_CTL$FUNC, scope);
    }
    static PFN_CERT_STORE_PROV_FIND_CTL ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hStoreProv, java.lang.foreign.MemorySegment _pFindInfo, java.lang.foreign.MemorySegment _pPrevCtlContext, int _dwFlags, java.lang.foreign.MemorySegment _ppvStoreProvFindInfo, java.lang.foreign.MemorySegment _ppProvCtlContext) -> {
            try {
                return (int)constants$758.PFN_CERT_STORE_PROV_FIND_CTL_DOWN$MH.invokeExact(symbol, _hStoreProv, _pFindInfo, _pPrevCtlContext, _dwFlags, _ppvStoreProvFindInfo, _ppProvCtlContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


