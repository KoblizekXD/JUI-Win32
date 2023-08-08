// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FIND_NAME_HEADER {
 *     WORD node_count;
 *     UCHAR reserved;
 *     UCHAR unique_group;
 * };
 * }
 */
public class _FIND_NAME_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("node_count"),
        Constants$root.C_CHAR$LAYOUT.withName("reserved"),
        Constants$root.C_CHAR$LAYOUT.withName("unique_group")
    ).withName("_FIND_NAME_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _FIND_NAME_HEADER.$struct$LAYOUT;
    }
    static final VarHandle node_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("node_count"));
    public static VarHandle node_count$VH() {
        return _FIND_NAME_HEADER.node_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD node_count;
     * }
     */
    public static short node_count$get(MemorySegment seg) {
        return (short)_FIND_NAME_HEADER.node_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD node_count;
     * }
     */
    public static void node_count$set(MemorySegment seg, short x) {
        _FIND_NAME_HEADER.node_count$VH.set(seg, x);
    }
    public static short node_count$get(MemorySegment seg, long index) {
        return (short)_FIND_NAME_HEADER.node_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void node_count$set(MemorySegment seg, long index, short x) {
        _FIND_NAME_HEADER.node_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return _FIND_NAME_HEADER.reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR reserved;
     * }
     */
    public static byte reserved$get(MemorySegment seg) {
        return (byte)_FIND_NAME_HEADER.reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR reserved;
     * }
     */
    public static void reserved$set(MemorySegment seg, byte x) {
        _FIND_NAME_HEADER.reserved$VH.set(seg, x);
    }
    public static byte reserved$get(MemorySegment seg, long index) {
        return (byte)_FIND_NAME_HEADER.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, byte x) {
        _FIND_NAME_HEADER.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle unique_group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unique_group"));
    public static VarHandle unique_group$VH() {
        return _FIND_NAME_HEADER.unique_group$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR unique_group;
     * }
     */
    public static byte unique_group$get(MemorySegment seg) {
        return (byte)_FIND_NAME_HEADER.unique_group$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR unique_group;
     * }
     */
    public static void unique_group$set(MemorySegment seg, byte x) {
        _FIND_NAME_HEADER.unique_group$VH.set(seg, x);
    }
    public static byte unique_group$get(MemorySegment seg, long index) {
        return (byte)_FIND_NAME_HEADER.unique_group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unique_group$set(MemorySegment seg, long index, byte x) {
        _FIND_NAME_HEADER.unique_group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


