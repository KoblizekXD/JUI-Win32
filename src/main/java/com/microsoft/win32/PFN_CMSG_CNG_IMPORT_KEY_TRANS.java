// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CMSG_CNG_IMPORT_KEY_TRANS)(struct _CMSG_CNG_CONTENT_DECRYPT_INFO* pCNGContentDecryptInfo,struct _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA* pKeyTransDecryptPara,unsigned long dwFlags,void* pvReserved);
 * }
 */
public interface PFN_CMSG_CNG_IMPORT_KEY_TRANS {

    int apply(java.lang.foreign.MemorySegment hStoreProv, java.lang.foreign.MemorySegment pStoreCtlContext, int dwFlags, java.lang.foreign.MemorySegment ppProvCtlContext);
    static MemorySegment allocate(PFN_CMSG_CNG_IMPORT_KEY_TRANS fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$750.PFN_CMSG_CNG_IMPORT_KEY_TRANS_UP$MH, fi, constants$750.PFN_CMSG_CNG_IMPORT_KEY_TRANS$FUNC, scope);
    }
    static PFN_CMSG_CNG_IMPORT_KEY_TRANS ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hStoreProv, java.lang.foreign.MemorySegment _pStoreCtlContext, int _dwFlags, java.lang.foreign.MemorySegment _ppProvCtlContext) -> {
            try {
                return (int)constants$750.PFN_CMSG_CNG_IMPORT_KEY_TRANS_DOWN$MH.invokeExact(symbol, _hStoreProv, _pStoreCtlContext, _dwFlags, _ppProvCtlContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


