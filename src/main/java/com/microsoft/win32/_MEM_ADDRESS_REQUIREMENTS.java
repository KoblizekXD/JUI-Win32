// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MEM_ADDRESS_REQUIREMENTS {
 *     PVOID LowestStartingAddress;
 *     PVOID HighestEndingAddress;
 *     SIZE_T Alignment;
 * };
 * }
 */
public class _MEM_ADDRESS_REQUIREMENTS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("LowestStartingAddress"),
        Constants$root.C_POINTER$LAYOUT.withName("HighestEndingAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Alignment")
    ).withName("_MEM_ADDRESS_REQUIREMENTS");
    public static MemoryLayout $LAYOUT() {
        return _MEM_ADDRESS_REQUIREMENTS.$struct$LAYOUT;
    }
    static final VarHandle LowestStartingAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowestStartingAddress"));
    public static VarHandle LowestStartingAddress$VH() {
        return _MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID LowestStartingAddress;
     * }
     */
    public static MemorySegment LowestStartingAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID LowestStartingAddress;
     * }
     */
    public static void LowestStartingAddress$set(MemorySegment seg, MemorySegment x) {
        _MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.set(seg, x);
    }
    public static MemorySegment LowestStartingAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowestStartingAddress$set(MemorySegment seg, long index, MemorySegment x) {
        _MEM_ADDRESS_REQUIREMENTS.LowestStartingAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighestEndingAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighestEndingAddress"));
    public static VarHandle HighestEndingAddress$VH() {
        return _MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID HighestEndingAddress;
     * }
     */
    public static MemorySegment HighestEndingAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID HighestEndingAddress;
     * }
     */
    public static void HighestEndingAddress$set(MemorySegment seg, MemorySegment x) {
        _MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.set(seg, x);
    }
    public static MemorySegment HighestEndingAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighestEndingAddress$set(MemorySegment seg, long index, MemorySegment x) {
        _MEM_ADDRESS_REQUIREMENTS.HighestEndingAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alignment"));
    public static VarHandle Alignment$VH() {
        return _MEM_ADDRESS_REQUIREMENTS.Alignment$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T Alignment;
     * }
     */
    public static long Alignment$get(MemorySegment seg) {
        return (long)_MEM_ADDRESS_REQUIREMENTS.Alignment$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T Alignment;
     * }
     */
    public static void Alignment$set(MemorySegment seg, long x) {
        _MEM_ADDRESS_REQUIREMENTS.Alignment$VH.set(seg, x);
    }
    public static long Alignment$get(MemorySegment seg, long index) {
        return (long)_MEM_ADDRESS_REQUIREMENTS.Alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alignment$set(MemorySegment seg, long index, long x) {
        _MEM_ADDRESS_REQUIREMENTS.Alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


