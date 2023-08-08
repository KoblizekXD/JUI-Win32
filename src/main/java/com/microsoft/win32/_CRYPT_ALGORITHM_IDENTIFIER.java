// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_ALGORITHM_IDENTIFIER {
 *     LPSTR pszObjId;
 *     CRYPT_OBJID_BLOB Parameters;
 * };
 * }
 */
public class _CRYPT_ALGORITHM_IDENTIFIER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("Parameters")
    ).withName("_CRYPT_ALGORITHM_IDENTIFIER");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ALGORITHM_IDENTIFIER.$struct$LAYOUT;
    }
    static final VarHandle pszObjId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszObjId"));
    public static VarHandle pszObjId$VH() {
        return _CRYPT_ALGORITHM_IDENTIFIER.pszObjId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static MemorySegment pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ALGORITHM_IDENTIFIER.pszObjId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static void pszObjId$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_ALGORITHM_IDENTIFIER.pszObjId$VH.set(seg, x);
    }
    public static MemorySegment pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ALGORITHM_IDENTIFIER.pszObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_ALGORITHM_IDENTIFIER.pszObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Parameters$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


