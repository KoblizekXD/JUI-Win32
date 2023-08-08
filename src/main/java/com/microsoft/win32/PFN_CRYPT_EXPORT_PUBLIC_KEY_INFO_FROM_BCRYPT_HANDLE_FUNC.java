// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC)(void* hBCryptKey,unsigned long dwCertEncodingType,char* pszPublicKeyObjId,unsigned long dwFlags,void* pvAuxInfo,struct _CERT_PUBLIC_KEY_INFO* pInfo,unsigned long* pcbInfo);
 * }
 */
public interface PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC {

    int apply(java.lang.foreign.MemorySegment hBCryptKey, int dwCertEncodingType, java.lang.foreign.MemorySegment pszPublicKeyObjId, int dwFlags, java.lang.foreign.MemorySegment pvAuxInfo, java.lang.foreign.MemorySegment pInfo, java.lang.foreign.MemorySegment pcbInfo);
    static MemorySegment allocate(PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$779.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC_UP$MH, fi, constants$779.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC$FUNC, scope);
    }
    static PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _hBCryptKey, int _dwCertEncodingType, java.lang.foreign.MemorySegment _pszPublicKeyObjId, int _dwFlags, java.lang.foreign.MemorySegment _pvAuxInfo, java.lang.foreign.MemorySegment _pInfo, java.lang.foreign.MemorySegment _pcbInfo) -> {
            try {
                return (int)constants$780.PFN_CRYPT_EXPORT_PUBLIC_KEY_INFO_FROM_BCRYPT_HANDLE_FUNC_DOWN$MH.invokeExact(symbol, _hBCryptKey, _dwCertEncodingType, _pszPublicKeyObjId, _dwFlags, _pvAuxInfo, _pInfo, _pcbInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


