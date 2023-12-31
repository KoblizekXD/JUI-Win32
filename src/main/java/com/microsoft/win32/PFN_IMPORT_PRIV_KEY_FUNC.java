// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_IMPORT_PRIV_KEY_FUNC)(unsigned long long hCryptProv,struct _CRYPT_PRIVATE_KEY_INFO* pPrivateKeyInfo,unsigned long dwFlags,void* pvAuxInfo);
 * }
 */
public interface PFN_IMPORT_PRIV_KEY_FUNC {

    int apply(long hCryptProv, java.lang.foreign.MemorySegment pPrivateKeyInfo, int dwFlags, java.lang.foreign.MemorySegment pvAuxInfo);
    static MemorySegment allocate(PFN_IMPORT_PRIV_KEY_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$781.PFN_IMPORT_PRIV_KEY_FUNC_UP$MH, fi, constants$781.PFN_IMPORT_PRIV_KEY_FUNC$FUNC, scope);
    }
    static PFN_IMPORT_PRIV_KEY_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (long _hCryptProv, java.lang.foreign.MemorySegment _pPrivateKeyInfo, int _dwFlags, java.lang.foreign.MemorySegment _pvAuxInfo) -> {
            try {
                return (int)constants$781.PFN_IMPORT_PRIV_KEY_FUNC_DOWN$MH.invokeExact(symbol, _hCryptProv, _pPrivateKeyInfo, _dwFlags, _pvAuxInfo);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


