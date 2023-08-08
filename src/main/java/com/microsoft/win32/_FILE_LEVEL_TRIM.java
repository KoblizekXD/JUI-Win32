// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_LEVEL_TRIM {
 *     DWORD Key;
 *     DWORD NumRanges;
 *     FILE_LEVEL_TRIM_RANGE Ranges[1];
 * };
 * }
 */
public class _FILE_LEVEL_TRIM {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Key"),
        Constants$root.C_LONG$LAYOUT.withName("NumRanges"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
        ).withName("_FILE_LEVEL_TRIM_RANGE")).withName("Ranges")
    ).withName("_FILE_LEVEL_TRIM");
    public static MemoryLayout $LAYOUT() {
        return _FILE_LEVEL_TRIM.$struct$LAYOUT;
    }
    static final VarHandle Key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Key"));
    public static VarHandle Key$VH() {
        return _FILE_LEVEL_TRIM.Key$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Key;
     * }
     */
    public static int Key$get(MemorySegment seg) {
        return (int)_FILE_LEVEL_TRIM.Key$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Key;
     * }
     */
    public static void Key$set(MemorySegment seg, int x) {
        _FILE_LEVEL_TRIM.Key$VH.set(seg, x);
    }
    public static int Key$get(MemorySegment seg, long index) {
        return (int)_FILE_LEVEL_TRIM.Key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Key$set(MemorySegment seg, long index, int x) {
        _FILE_LEVEL_TRIM.Key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumRanges"));
    public static VarHandle NumRanges$VH() {
        return _FILE_LEVEL_TRIM.NumRanges$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumRanges;
     * }
     */
    public static int NumRanges$get(MemorySegment seg) {
        return (int)_FILE_LEVEL_TRIM.NumRanges$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumRanges;
     * }
     */
    public static void NumRanges$set(MemorySegment seg, int x) {
        _FILE_LEVEL_TRIM.NumRanges$VH.set(seg, x);
    }
    public static int NumRanges$get(MemorySegment seg, long index) {
        return (int)_FILE_LEVEL_TRIM.NumRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumRanges$set(MemorySegment seg, long index, int x) {
        _FILE_LEVEL_TRIM.NumRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Ranges$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


