// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CMSG_EXPORT_ENCRYPT_KEY)(unsigned long long hCryptProv,unsigned long long hEncryptKey,struct _CERT_PUBLIC_KEY_INFO* pPublicKeyInfo,unsigned char* pbData,unsigned long* pcbData);
 * }
 */
public interface PFN_CMSG_EXPORT_ENCRYPT_KEY {

    int apply(long hCryptProv, long hEncryptKey, java.lang.foreign.MemorySegment pPublicKeyInfo, java.lang.foreign.MemorySegment pbData, java.lang.foreign.MemorySegment pcbData);
    static MemorySegment allocate(PFN_CMSG_EXPORT_ENCRYPT_KEY fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$747.PFN_CMSG_EXPORT_ENCRYPT_KEY_UP$MH, fi, constants$747.PFN_CMSG_EXPORT_ENCRYPT_KEY$FUNC, scope);
    }
    static PFN_CMSG_EXPORT_ENCRYPT_KEY ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (long _hCryptProv, long _hEncryptKey, java.lang.foreign.MemorySegment _pPublicKeyInfo, java.lang.foreign.MemorySegment _pbData, java.lang.foreign.MemorySegment _pcbData) -> {
            try {
                return (int)constants$747.PFN_CMSG_EXPORT_ENCRYPT_KEY_DOWN$MH.invokeExact(symbol, _hCryptProv, _hEncryptKey, _pPublicKeyInfo, _pbData, _pcbData);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

