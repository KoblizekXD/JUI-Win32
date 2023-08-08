// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_DLL_OPEN_STORE_PROV_FUNC)(char* lpszStoreProvider,unsigned long dwEncodingType,unsigned long long hCryptProv,unsigned long dwFlags,void* pvPara,void* hCertStore,struct _CERT_STORE_PROV_INFO* pStoreProvInfo);
 * }
 */
public interface PFN_CERT_DLL_OPEN_STORE_PROV_FUNC {

    int apply(java.lang.foreign.MemorySegment lpszStoreProvider, int dwEncodingType, long hCryptProv, int dwFlags, java.lang.foreign.MemorySegment pvPara, java.lang.foreign.MemorySegment hCertStore, java.lang.foreign.MemorySegment pStoreProvInfo);
    static MemorySegment allocate(PFN_CERT_DLL_OPEN_STORE_PROV_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$751.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_UP$MH, fi, constants$751.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC$FUNC, scope);
    }
    static PFN_CERT_DLL_OPEN_STORE_PROV_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _lpszStoreProvider, int _dwEncodingType, long _hCryptProv, int _dwFlags, java.lang.foreign.MemorySegment _pvPara, java.lang.foreign.MemorySegment _hCertStore, java.lang.foreign.MemorySegment _pStoreProvInfo) -> {
            try {
                return (int)constants$751.PFN_CERT_DLL_OPEN_STORE_PROV_FUNC_DOWN$MH.invokeExact(symbol, _lpszStoreProvider, _dwEncodingType, _hCryptProv, _dwFlags, _pvPara, _hCertStore, _pStoreProvInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

