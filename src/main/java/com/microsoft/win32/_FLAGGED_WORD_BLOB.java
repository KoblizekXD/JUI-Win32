// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FLAGGED_WORD_BLOB {
 *     ULONG fFlags;
 *     ULONG clSize;
 *     unsigned short asData[1];
 * };
 * }
 */
public class _FLAGGED_WORD_BLOB {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fFlags"),
        Constants$root.C_LONG$LAYOUT.withName("clSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("asData"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FLAGGED_WORD_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _FLAGGED_WORD_BLOB.$struct$LAYOUT;
    }
    static final VarHandle fFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fFlags"));
    public static VarHandle fFlags$VH() {
        return _FLAGGED_WORD_BLOB.fFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG fFlags;
     * }
     */
    public static int fFlags$get(MemorySegment seg) {
        return (int)_FLAGGED_WORD_BLOB.fFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG fFlags;
     * }
     */
    public static void fFlags$set(MemorySegment seg, int x) {
        _FLAGGED_WORD_BLOB.fFlags$VH.set(seg, x);
    }
    public static int fFlags$get(MemorySegment seg, long index) {
        return (int)_FLAGGED_WORD_BLOB.fFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fFlags$set(MemorySegment seg, long index, int x) {
        _FLAGGED_WORD_BLOB.fFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle clSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("clSize"));
    public static VarHandle clSize$VH() {
        return _FLAGGED_WORD_BLOB.clSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG clSize;
     * }
     */
    public static int clSize$get(MemorySegment seg) {
        return (int)_FLAGGED_WORD_BLOB.clSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG clSize;
     * }
     */
    public static void clSize$set(MemorySegment seg, int x) {
        _FLAGGED_WORD_BLOB.clSize$VH.set(seg, x);
    }
    public static int clSize$get(MemorySegment seg, long index) {
        return (int)_FLAGGED_WORD_BLOB.clSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clSize$set(MemorySegment seg, long index, int x) {
        _FLAGGED_WORD_BLOB.clSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment asData$slice(MemorySegment seg) {
        return seg.asSlice(8, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


