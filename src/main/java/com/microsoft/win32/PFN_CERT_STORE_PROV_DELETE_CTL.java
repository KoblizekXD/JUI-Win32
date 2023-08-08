// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_STORE_PROV_DELETE_CTL)(void* hStoreProv,struct _CTL_CONTEXT* pCtlContext,unsigned long dwFlags);
 * }
 */
public interface PFN_CERT_STORE_PROV_DELETE_CTL {

    int apply(java.lang.foreign.MemorySegment pContext, java.lang.foreign.MemorySegment rgIdentifierOrNameList, int dwIdentifierOrNameListCount);
    static MemorySegment allocate(PFN_CERT_STORE_PROV_DELETE_CTL fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$755.PFN_CERT_STORE_PROV_DELETE_CTL_UP$MH, fi, constants$755.PFN_CERT_STORE_PROV_DELETE_CTL$FUNC, scope);
    }
    static PFN_CERT_STORE_PROV_DELETE_CTL ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pContext, java.lang.foreign.MemorySegment _rgIdentifierOrNameList, int _dwIdentifierOrNameListCount) -> {
            try {
                return (int)constants$755.PFN_CERT_STORE_PROV_DELETE_CTL_DOWN$MH.invokeExact(symbol, _pContext, _rgIdentifierOrNameList, _dwIdentifierOrNameListCount);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


