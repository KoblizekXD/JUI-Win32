// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESSOR_RELATIONSHIP {
 *     BYTE Flags;
 *     BYTE EfficiencyClass;
 *     BYTE Reserved[20];
 *     WORD GroupCount;
 *     GROUP_AFFINITY GroupMask[1];
 * };
 * }
 */
public class _PROCESSOR_RELATIONSHIP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Flags"),
        Constants$root.C_CHAR$LAYOUT.withName("EfficiencyClass"),
        MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_SHORT$LAYOUT.withName("GroupCount"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
            Constants$root.C_SHORT$LAYOUT.withName("Group"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
        ).withName("_GROUP_AFFINITY")).withName("GroupMask")
    ).withName("_PROCESSOR_RELATIONSHIP");
    public static MemoryLayout $LAYOUT() {
        return _PROCESSOR_RELATIONSHIP.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PROCESSOR_RELATIONSHIP.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Flags;
     * }
     */
    public static byte Flags$get(MemorySegment seg) {
        return (byte)_PROCESSOR_RELATIONSHIP.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, byte x) {
        _PROCESSOR_RELATIONSHIP.Flags$VH.set(seg, x);
    }
    public static byte Flags$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_RELATIONSHIP.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_RELATIONSHIP.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EfficiencyClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EfficiencyClass"));
    public static VarHandle EfficiencyClass$VH() {
        return _PROCESSOR_RELATIONSHIP.EfficiencyClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE EfficiencyClass;
     * }
     */
    public static byte EfficiencyClass$get(MemorySegment seg) {
        return (byte)_PROCESSOR_RELATIONSHIP.EfficiencyClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE EfficiencyClass;
     * }
     */
    public static void EfficiencyClass$set(MemorySegment seg, byte x) {
        _PROCESSOR_RELATIONSHIP.EfficiencyClass$VH.set(seg, x);
    }
    public static byte EfficiencyClass$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_RELATIONSHIP.EfficiencyClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EfficiencyClass$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_RELATIONSHIP.EfficiencyClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(2, 20);
    }
    static final VarHandle GroupCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GroupCount"));
    public static VarHandle GroupCount$VH() {
        return _PROCESSOR_RELATIONSHIP.GroupCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static short GroupCount$get(MemorySegment seg) {
        return (short)_PROCESSOR_RELATIONSHIP.GroupCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static void GroupCount$set(MemorySegment seg, short x) {
        _PROCESSOR_RELATIONSHIP.GroupCount$VH.set(seg, x);
    }
    public static short GroupCount$get(MemorySegment seg, long index) {
        return (short)_PROCESSOR_RELATIONSHIP.GroupCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupCount$set(MemorySegment seg, long index, short x) {
        _PROCESSOR_RELATIONSHIP.GroupCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment GroupMask$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


