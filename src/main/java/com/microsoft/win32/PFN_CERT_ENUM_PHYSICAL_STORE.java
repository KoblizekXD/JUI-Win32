// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*PFN_CERT_ENUM_PHYSICAL_STORE)(void* pvSystemStore,unsigned long dwFlags,unsigned short* pwszStoreName,struct _CERT_PHYSICAL_STORE_INFO* pStoreInfo,void* pvReserved,void* pvArg);
 * }
 */
public interface PFN_CERT_ENUM_PHYSICAL_STORE {

    int apply(java.lang.foreign.MemorySegment pvSystemStore, int dwFlags, java.lang.foreign.MemorySegment pwszStoreName, java.lang.foreign.MemorySegment pStoreInfo, java.lang.foreign.MemorySegment pvReserved, java.lang.foreign.MemorySegment pvArg);
    static MemorySegment allocate(PFN_CERT_ENUM_PHYSICAL_STORE fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$770.PFN_CERT_ENUM_PHYSICAL_STORE_UP$MH, fi, constants$770.PFN_CERT_ENUM_PHYSICAL_STORE$FUNC, scope);
    }
    static PFN_CERT_ENUM_PHYSICAL_STORE ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pvSystemStore, int _dwFlags, java.lang.foreign.MemorySegment _pwszStoreName, java.lang.foreign.MemorySegment _pStoreInfo, java.lang.foreign.MemorySegment _pvReserved, java.lang.foreign.MemorySegment _pvArg) -> {
            try {
                return (int)constants$771.PFN_CERT_ENUM_PHYSICAL_STORE_DOWN$MH.invokeExact(symbol, _pvSystemStore, _dwFlags, _pwszStoreName, _pStoreInfo, _pvReserved, _pvArg);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


