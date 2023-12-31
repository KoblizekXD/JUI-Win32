// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_LEVEL_TRIM_OUTPUT {
 *     DWORD NumRangesProcessed;
 * };
 * }
 */
public class _FILE_LEVEL_TRIM_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumRangesProcessed")
    ).withName("_FILE_LEVEL_TRIM_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _FILE_LEVEL_TRIM_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle NumRangesProcessed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumRangesProcessed"));
    public static VarHandle NumRangesProcessed$VH() {
        return _FILE_LEVEL_TRIM_OUTPUT.NumRangesProcessed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumRangesProcessed;
     * }
     */
    public static int NumRangesProcessed$get(MemorySegment seg) {
        return (int)_FILE_LEVEL_TRIM_OUTPUT.NumRangesProcessed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumRangesProcessed;
     * }
     */
    public static void NumRangesProcessed$set(MemorySegment seg, int x) {
        _FILE_LEVEL_TRIM_OUTPUT.NumRangesProcessed$VH.set(seg, x);
    }
    public static int NumRangesProcessed$get(MemorySegment seg, long index) {
        return (int)_FILE_LEVEL_TRIM_OUTPUT.NumRangesProcessed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumRangesProcessed$set(MemorySegment seg, long index, int x) {
        _FILE_LEVEL_TRIM_OUTPUT.NumRangesProcessed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


