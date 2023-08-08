// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PCRYPT_RESOLVE_HCRYPTPROV_FUNC)(struct _CRYPT_PRIVATE_KEY_INFO* pPrivateKeyInfo,unsigned long long* phCryptProv,void* pVoidResolveFunc);
 * }
 */
public interface PCRYPT_RESOLVE_HCRYPTPROV_FUNC {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
    static MemorySegment allocate(PCRYPT_RESOLVE_HCRYPTPROV_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$738.PCRYPT_RESOLVE_HCRYPTPROV_FUNC_UP$MH, fi, constants$738.PCRYPT_RESOLVE_HCRYPTPROV_FUNC$FUNC, scope);
    }
    static PCRYPT_RESOLVE_HCRYPTPROV_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
            try {
                return (int)constants$738.PCRYPT_RESOLVE_HCRYPTPROV_FUNC_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


