// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCRYPT_PROVIDER_NAME {
 *     LPWSTR pszProviderName;
 * };
 * }
 */
public class _BCRYPT_PROVIDER_NAME {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszProviderName")
    ).withName("_BCRYPT_PROVIDER_NAME");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_PROVIDER_NAME.$struct$LAYOUT;
    }
    static final VarHandle pszProviderName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszProviderName"));
    public static VarHandle pszProviderName$VH() {
        return _BCRYPT_PROVIDER_NAME.pszProviderName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszProviderName;
     * }
     */
    public static MemorySegment pszProviderName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_PROVIDER_NAME.pszProviderName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszProviderName;
     * }
     */
    public static void pszProviderName$set(MemorySegment seg, MemorySegment x) {
        _BCRYPT_PROVIDER_NAME.pszProviderName$VH.set(seg, x);
    }
    public static MemorySegment pszProviderName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_PROVIDER_NAME.pszProviderName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszProviderName$set(MemorySegment seg, long index, MemorySegment x) {
        _BCRYPT_PROVIDER_NAME.pszProviderName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


