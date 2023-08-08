// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_BLOB_ARRAY {
 *     DWORD cBlob;
 *     PCRYPT_DATA_BLOB rgBlob;
 * };
 * }
 */
public class _CRYPT_BLOB_ARRAY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cBlob"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgBlob")
    ).withName("_CRYPT_BLOB_ARRAY");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_BLOB_ARRAY.$struct$LAYOUT;
    }
    static final VarHandle cBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBlob"));
    public static VarHandle cBlob$VH() {
        return _CRYPT_BLOB_ARRAY.cBlob$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cBlob;
     * }
     */
    public static int cBlob$get(MemorySegment seg) {
        return (int)_CRYPT_BLOB_ARRAY.cBlob$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cBlob;
     * }
     */
    public static void cBlob$set(MemorySegment seg, int x) {
        _CRYPT_BLOB_ARRAY.cBlob$VH.set(seg, x);
    }
    public static int cBlob$get(MemorySegment seg, long index) {
        return (int)_CRYPT_BLOB_ARRAY.cBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBlob$set(MemorySegment seg, long index, int x) {
        _CRYPT_BLOB_ARRAY.cBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgBlob"));
    public static VarHandle rgBlob$VH() {
        return _CRYPT_BLOB_ARRAY.rgBlob$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRYPT_DATA_BLOB rgBlob;
     * }
     */
    public static MemorySegment rgBlob$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_BLOB_ARRAY.rgBlob$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRYPT_DATA_BLOB rgBlob;
     * }
     */
    public static void rgBlob$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_BLOB_ARRAY.rgBlob$VH.set(seg, x);
    }
    public static MemorySegment rgBlob$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_BLOB_ARRAY.rgBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgBlob$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_BLOB_ARRAY.rgBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


