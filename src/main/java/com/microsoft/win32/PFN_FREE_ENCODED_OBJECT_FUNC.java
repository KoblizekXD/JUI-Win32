// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*PFN_FREE_ENCODED_OBJECT_FUNC)(char* pszObjectOid,struct _CRYPT_BLOB_ARRAY* pObject,void* pvFreeContext);
 * }
 */
public interface PFN_FREE_ENCODED_OBJECT_FUNC {

    void apply(java.lang.foreign.MemorySegment pszObjectOid, java.lang.foreign.MemorySegment pObject, java.lang.foreign.MemorySegment pvFreeContext);
    static MemorySegment allocate(PFN_FREE_ENCODED_OBJECT_FUNC fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$789.PFN_FREE_ENCODED_OBJECT_FUNC_UP$MH, fi, constants$789.PFN_FREE_ENCODED_OBJECT_FUNC$FUNC, scope);
    }
    static PFN_FREE_ENCODED_OBJECT_FUNC ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pszObjectOid, java.lang.foreign.MemorySegment _pObject, java.lang.foreign.MemorySegment _pvFreeContext) -> {
            try {
                constants$789.PFN_FREE_ENCODED_OBJECT_FUNC_DOWN$MH.invokeExact(symbol, _pszObjectOid, _pObject, _pvFreeContext);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


