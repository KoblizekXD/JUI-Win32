// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_SEQUENCE_OF_ANY {
 *     DWORD cValue;
 *     PCRYPT_DER_BLOB rgValue;
 * };
 * }
 */
public class _CRYPT_SEQUENCE_OF_ANY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cValue"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgValue")
    ).withName("_CRYPT_SEQUENCE_OF_ANY");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_SEQUENCE_OF_ANY.$struct$LAYOUT;
    }
    static final VarHandle cValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cValue"));
    public static VarHandle cValue$VH() {
        return _CRYPT_SEQUENCE_OF_ANY.cValue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cValue;
     * }
     */
    public static int cValue$get(MemorySegment seg) {
        return (int)_CRYPT_SEQUENCE_OF_ANY.cValue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cValue;
     * }
     */
    public static void cValue$set(MemorySegment seg, int x) {
        _CRYPT_SEQUENCE_OF_ANY.cValue$VH.set(seg, x);
    }
    public static int cValue$get(MemorySegment seg, long index) {
        return (int)_CRYPT_SEQUENCE_OF_ANY.cValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cValue$set(MemorySegment seg, long index, int x) {
        _CRYPT_SEQUENCE_OF_ANY.cValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgValue"));
    public static VarHandle rgValue$VH() {
        return _CRYPT_SEQUENCE_OF_ANY.rgValue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRYPT_DER_BLOB rgValue;
     * }
     */
    public static MemorySegment rgValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_SEQUENCE_OF_ANY.rgValue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRYPT_DER_BLOB rgValue;
     * }
     */
    public static void rgValue$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_SEQUENCE_OF_ANY.rgValue$VH.set(seg, x);
    }
    public static MemorySegment rgValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_SEQUENCE_OF_ANY.rgValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgValue$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_SEQUENCE_OF_ANY.rgValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

