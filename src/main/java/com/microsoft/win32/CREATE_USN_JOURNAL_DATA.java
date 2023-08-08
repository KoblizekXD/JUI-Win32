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
 *     DWORDLONG MaximumSize;
 *     DWORDLONG AllocationDelta;
 * };
 * }
 */
public class CREATE_USN_JOURNAL_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaximumSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AllocationDelta")
    );
    public static MemoryLayout $LAYOUT() {
        return CREATE_USN_JOURNAL_DATA.$struct$LAYOUT;
    }
    static final VarHandle MaximumSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumSize"));
    public static VarHandle MaximumSize$VH() {
        return CREATE_USN_JOURNAL_DATA.MaximumSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MaximumSize;
     * }
     */
    public static long MaximumSize$get(MemorySegment seg) {
        return (long)CREATE_USN_JOURNAL_DATA.MaximumSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MaximumSize;
     * }
     */
    public static void MaximumSize$set(MemorySegment seg, long x) {
        CREATE_USN_JOURNAL_DATA.MaximumSize$VH.set(seg, x);
    }
    public static long MaximumSize$get(MemorySegment seg, long index) {
        return (long)CREATE_USN_JOURNAL_DATA.MaximumSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumSize$set(MemorySegment seg, long index, long x) {
        CREATE_USN_JOURNAL_DATA.MaximumSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationDelta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationDelta"));
    public static VarHandle AllocationDelta$VH() {
        return CREATE_USN_JOURNAL_DATA.AllocationDelta$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG AllocationDelta;
     * }
     */
    public static long AllocationDelta$get(MemorySegment seg) {
        return (long)CREATE_USN_JOURNAL_DATA.AllocationDelta$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG AllocationDelta;
     * }
     */
    public static void AllocationDelta$set(MemorySegment seg, long x) {
        CREATE_USN_JOURNAL_DATA.AllocationDelta$VH.set(seg, x);
    }
    public static long AllocationDelta$get(MemorySegment seg, long index) {
        return (long)CREATE_USN_JOURNAL_DATA.AllocationDelta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationDelta$set(MemorySegment seg, long index, long x) {
        CREATE_USN_JOURNAL_DATA.AllocationDelta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


