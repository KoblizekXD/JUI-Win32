// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NUMA_NODE_RELATIONSHIP {
 *     DWORD NodeNumber;
 *     BYTE Reserved[18];
 *     WORD GroupCount;
 *     union {
 *         GROUP_AFFINITY GroupMask;
 *         GROUP_AFFINITY GroupMasks[1];
 *     };
 * };
 * }
 */
public class _NUMA_NODE_RELATIONSHIP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NodeNumber"),
        MemoryLayout.sequenceLayout(18, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_SHORT$LAYOUT.withName("GroupCount"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                Constants$root.C_SHORT$LAYOUT.withName("Group"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
            ).withName("GroupMask"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                Constants$root.C_SHORT$LAYOUT.withName("Group"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
            ).withName("_GROUP_AFFINITY")).withName("GroupMasks")
        ).withName("$anon$0")
    ).withName("_NUMA_NODE_RELATIONSHIP");
    public static MemoryLayout $LAYOUT() {
        return _NUMA_NODE_RELATIONSHIP.$struct$LAYOUT;
    }
    static final VarHandle NodeNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NodeNumber"));
    public static VarHandle NodeNumber$VH() {
        return _NUMA_NODE_RELATIONSHIP.NodeNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NodeNumber;
     * }
     */
    public static int NodeNumber$get(MemorySegment seg) {
        return (int)_NUMA_NODE_RELATIONSHIP.NodeNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NodeNumber;
     * }
     */
    public static void NodeNumber$set(MemorySegment seg, int x) {
        _NUMA_NODE_RELATIONSHIP.NodeNumber$VH.set(seg, x);
    }
    public static int NodeNumber$get(MemorySegment seg, long index) {
        return (int)_NUMA_NODE_RELATIONSHIP.NodeNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NodeNumber$set(MemorySegment seg, long index, int x) {
        _NUMA_NODE_RELATIONSHIP.NodeNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(4, 18);
    }
    static final VarHandle GroupCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GroupCount"));
    public static VarHandle GroupCount$VH() {
        return _NUMA_NODE_RELATIONSHIP.GroupCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static short GroupCount$get(MemorySegment seg) {
        return (short)_NUMA_NODE_RELATIONSHIP.GroupCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static void GroupCount$set(MemorySegment seg, short x) {
        _NUMA_NODE_RELATIONSHIP.GroupCount$VH.set(seg, x);
    }
    public static short GroupCount$get(MemorySegment seg, long index) {
        return (short)_NUMA_NODE_RELATIONSHIP.GroupCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupCount$set(MemorySegment seg, long index, short x) {
        _NUMA_NODE_RELATIONSHIP.GroupCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment GroupMask$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static MemorySegment GroupMasks$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

