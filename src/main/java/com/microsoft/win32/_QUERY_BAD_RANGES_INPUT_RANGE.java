// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _QUERY_BAD_RANGES_INPUT_RANGE {
 *     DWORDLONG StartOffset;
 *     DWORDLONG LengthInBytes;
 * };
 * }
 */
public class _QUERY_BAD_RANGES_INPUT_RANGE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LengthInBytes")
    ).withName("_QUERY_BAD_RANGES_INPUT_RANGE");
    public static MemoryLayout $LAYOUT() {
        return _QUERY_BAD_RANGES_INPUT_RANGE.$struct$LAYOUT;
    }
    static final VarHandle StartOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartOffset"));
    public static VarHandle StartOffset$VH() {
        return _QUERY_BAD_RANGES_INPUT_RANGE.StartOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG StartOffset;
     * }
     */
    public static long StartOffset$get(MemorySegment seg) {
        return (long)_QUERY_BAD_RANGES_INPUT_RANGE.StartOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG StartOffset;
     * }
     */
    public static void StartOffset$set(MemorySegment seg, long x) {
        _QUERY_BAD_RANGES_INPUT_RANGE.StartOffset$VH.set(seg, x);
    }
    public static long StartOffset$get(MemorySegment seg, long index) {
        return (long)_QUERY_BAD_RANGES_INPUT_RANGE.StartOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartOffset$set(MemorySegment seg, long index, long x) {
        _QUERY_BAD_RANGES_INPUT_RANGE.StartOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LengthInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LengthInBytes"));
    public static VarHandle LengthInBytes$VH() {
        return _QUERY_BAD_RANGES_INPUT_RANGE.LengthInBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG LengthInBytes;
     * }
     */
    public static long LengthInBytes$get(MemorySegment seg) {
        return (long)_QUERY_BAD_RANGES_INPUT_RANGE.LengthInBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG LengthInBytes;
     * }
     */
    public static void LengthInBytes$set(MemorySegment seg, long x) {
        _QUERY_BAD_RANGES_INPUT_RANGE.LengthInBytes$VH.set(seg, x);
    }
    public static long LengthInBytes$get(MemorySegment seg, long index) {
        return (long)_QUERY_BAD_RANGES_INPUT_RANGE.LengthInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LengthInBytes$set(MemorySegment seg, long index, long x) {
        _QUERY_BAD_RANGES_INPUT_RANGE.LengthInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


