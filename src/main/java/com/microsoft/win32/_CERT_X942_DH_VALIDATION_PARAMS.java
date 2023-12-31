// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_X942_DH_VALIDATION_PARAMS {
 *     CRYPT_BIT_BLOB seed;
 *     DWORD pgenCounter;
 * };
 * }
 */
public class _CERT_X942_DH_VALIDATION_PARAMS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("seed"),
        Constants$root.C_LONG$LAYOUT.withName("pgenCounter"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CERT_X942_DH_VALIDATION_PARAMS");
    public static MemoryLayout $LAYOUT() {
        return _CERT_X942_DH_VALIDATION_PARAMS.$struct$LAYOUT;
    }
    public static MemorySegment seed$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle pgenCounter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pgenCounter"));
    public static VarHandle pgenCounter$VH() {
        return _CERT_X942_DH_VALIDATION_PARAMS.pgenCounter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD pgenCounter;
     * }
     */
    public static int pgenCounter$get(MemorySegment seg) {
        return (int)_CERT_X942_DH_VALIDATION_PARAMS.pgenCounter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD pgenCounter;
     * }
     */
    public static void pgenCounter$set(MemorySegment seg, int x) {
        _CERT_X942_DH_VALIDATION_PARAMS.pgenCounter$VH.set(seg, x);
    }
    public static int pgenCounter$get(MemorySegment seg, long index) {
        return (int)_CERT_X942_DH_VALIDATION_PARAMS.pgenCounter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pgenCounter$set(MemorySegment seg, long index, int x) {
        _CERT_X942_DH_VALIDATION_PARAMS.pgenCounter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


