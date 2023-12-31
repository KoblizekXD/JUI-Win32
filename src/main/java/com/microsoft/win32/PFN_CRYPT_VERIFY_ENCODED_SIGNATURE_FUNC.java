// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC)(unsigned long dwCertEncodingType,struct _CERT_PUBLIC_KEY_INFO* pPubKeyInfo,struct _CRYPT_ALGORITHM_IDENTIFIER* pSignatureAlgorithm,void* pvDecodedSignPara,unsigned short* pwszCNGPubKeyAlgid,unsigned short* pwszCNGHashAlgid,unsigned char* pbComputedHash,unsigned long cbComputedHash,unsigned char* pbSignature,unsigned long cbSignature);
 * }
 */
public interface PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC {

    int apply(int dwCertEncodingType, java.lang.foreign.MemorySegment pPubKeyInfo, java.lang.foreign.MemorySegment pSignatureAlgorithm, java.lang.foreign.MemorySegment pvDecodedSignPara, java.lang.foreign.MemorySegment pwszCNGPubKeyAlgid, java.lang.foreign.MemorySegment pwszCNGHashAlgid, java.lang.foreign.MemorySegment pbComputedHash, int cbComputedHash, java.lang.foreign.MemorySegment pbSignature, int cbSignature);
    static MemorySegment allocate(PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$776.PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC_UP$MH, fi, constants$776.PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC$FUNC, scope);
    }
    static PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int _dwCertEncodingType, java.lang.foreign.MemorySegment _pPubKeyInfo, java.lang.foreign.MemorySegment _pSignatureAlgorithm, java.lang.foreign.MemorySegment _pvDecodedSignPara, java.lang.foreign.MemorySegment _pwszCNGPubKeyAlgid, java.lang.foreign.MemorySegment _pwszCNGHashAlgid, java.lang.foreign.MemorySegment _pbComputedHash, int _cbComputedHash, java.lang.foreign.MemorySegment _pbSignature, int _cbSignature) -> {
            try {
                return (int)constants$776.PFN_CRYPT_VERIFY_ENCODED_SIGNATURE_FUNC_DOWN$MH.invokeExact(symbol, _dwCertEncodingType, _pPubKeyInfo, _pSignatureAlgorithm, _pvDecodedSignPara, _pwszCNGPubKeyAlgid, _pwszCNGHashAlgid, _pbComputedHash, _cbComputedHash, _pbSignature, _cbSignature);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


