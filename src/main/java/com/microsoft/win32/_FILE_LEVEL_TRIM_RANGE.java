// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_LEVEL_TRIM_RANGE {
 *     DWORDLONG Offset;
 *     DWORDLONG Length;
 * };
 * }
 */
public class _FILE_LEVEL_TRIM_RANGE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
    ).withName("_FILE_LEVEL_TRIM_RANGE");
    public static MemoryLayout $LAYOUT() {
        return _FILE_LEVEL_TRIM_RANGE.$struct$LAYOUT;
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _FILE_LEVEL_TRIM_RANGE.Offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG Offset;
     * }
     */
    public static long Offset$get(MemorySegment seg) {
        return (long)_FILE_LEVEL_TRIM_RANGE.Offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG Offset;
     * }
     */
    public static void Offset$set(MemorySegment seg, long x) {
        _FILE_LEVEL_TRIM_RANGE.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_FILE_LEVEL_TRIM_RANGE.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _FILE_LEVEL_TRIM_RANGE.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _FILE_LEVEL_TRIM_RANGE.Length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG Length;
     * }
     */
    public static long Length$get(MemorySegment seg) {
        return (long)_FILE_LEVEL_TRIM_RANGE.Length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG Length;
     * }
     */
    public static void Length$set(MemorySegment seg, long x) {
        _FILE_LEVEL_TRIM_RANGE.Length$VH.set(seg, x);
    }
    public static long Length$get(MemorySegment seg, long index) {
        return (long)_FILE_LEVEL_TRIM_RANGE.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, long x) {
        _FILE_LEVEL_TRIM_RANGE.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

