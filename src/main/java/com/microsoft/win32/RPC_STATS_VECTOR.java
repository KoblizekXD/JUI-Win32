// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     unsigned int Count;
 *     unsigned long Stats[1];
 * };
 * }
 */
public class RPC_STATS_VECTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("Stats")
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_STATS_VECTOR.$struct$LAYOUT;
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return RPC_STATS_VECTOR.Count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)RPC_STATS_VECTOR.Count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        RPC_STATS_VECTOR.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)RPC_STATS_VECTOR.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        RPC_STATS_VECTOR.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Stats$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


