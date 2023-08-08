// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCRUB_PARITY_EXTENT_DATA {
 *     WORD Size;
 *     WORD Flags;
 *     WORD NumberOfParityExtents;
 *     WORD MaximumNumberOfParityExtents;
 *     SCRUB_PARITY_EXTENT ParityExtents[1];
 * };
 * }
 */
public class _SCRUB_PARITY_EXTENT_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Size"),
        Constants$root.C_SHORT$LAYOUT.withName("Flags"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfParityExtents"),
        Constants$root.C_SHORT$LAYOUT.withName("MaximumNumberOfParityExtents"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Length")
        ).withName("_SCRUB_PARITY_EXTENT")).withName("ParityExtents")
    ).withName("_SCRUB_PARITY_EXTENT_DATA");
    public static MemoryLayout $LAYOUT() {
        return _SCRUB_PARITY_EXTENT_DATA.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCRUB_PARITY_EXTENT_DATA.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Size;
     * }
     */
    public static short Size$get(MemorySegment seg) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, short x) {
        _SCRUB_PARITY_EXTENT_DATA.Size$VH.set(seg, x);
    }
    public static short Size$get(MemorySegment seg, long index) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, short x) {
        _SCRUB_PARITY_EXTENT_DATA.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SCRUB_PARITY_EXTENT_DATA.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Flags;
     * }
     */
    public static short Flags$get(MemorySegment seg) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, short x) {
        _SCRUB_PARITY_EXTENT_DATA.Flags$VH.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        _SCRUB_PARITY_EXTENT_DATA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfParityExtents$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfParityExtents"));
    public static VarHandle NumberOfParityExtents$VH() {
        return _SCRUB_PARITY_EXTENT_DATA.NumberOfParityExtents$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfParityExtents;
     * }
     */
    public static short NumberOfParityExtents$get(MemorySegment seg) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.NumberOfParityExtents$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfParityExtents;
     * }
     */
    public static void NumberOfParityExtents$set(MemorySegment seg, short x) {
        _SCRUB_PARITY_EXTENT_DATA.NumberOfParityExtents$VH.set(seg, x);
    }
    public static short NumberOfParityExtents$get(MemorySegment seg, long index) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.NumberOfParityExtents$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfParityExtents$set(MemorySegment seg, long index, short x) {
        _SCRUB_PARITY_EXTENT_DATA.NumberOfParityExtents$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaximumNumberOfParityExtents$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumNumberOfParityExtents"));
    public static VarHandle MaximumNumberOfParityExtents$VH() {
        return _SCRUB_PARITY_EXTENT_DATA.MaximumNumberOfParityExtents$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MaximumNumberOfParityExtents;
     * }
     */
    public static short MaximumNumberOfParityExtents$get(MemorySegment seg) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.MaximumNumberOfParityExtents$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MaximumNumberOfParityExtents;
     * }
     */
    public static void MaximumNumberOfParityExtents$set(MemorySegment seg, short x) {
        _SCRUB_PARITY_EXTENT_DATA.MaximumNumberOfParityExtents$VH.set(seg, x);
    }
    public static short MaximumNumberOfParityExtents$get(MemorySegment seg, long index) {
        return (short)_SCRUB_PARITY_EXTENT_DATA.MaximumNumberOfParityExtents$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumNumberOfParityExtents$set(MemorySegment seg, long index, short x) {
        _SCRUB_PARITY_EXTENT_DATA.MaximumNumberOfParityExtents$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ParityExtents$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

