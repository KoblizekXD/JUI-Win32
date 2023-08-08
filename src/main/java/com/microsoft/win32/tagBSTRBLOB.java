// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagBSTRBLOB {
 *     ULONG cbSize;
 *     BYTE* pData;
 * };
 * }
 */
public class tagBSTRBLOB {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pData")
    ).withName("tagBSTRBLOB");
    public static MemoryLayout $LAYOUT() {
        return tagBSTRBLOB.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagBSTRBLOB.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagBSTRBLOB.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        tagBSTRBLOB.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagBSTRBLOB.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagBSTRBLOB.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return tagBSTRBLOB.pData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pData;
     * }
     */
    public static MemorySegment pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagBSTRBLOB.pData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pData;
     * }
     */
    public static void pData$set(MemorySegment seg, MemorySegment x) {
        tagBSTRBLOB.pData$VH.set(seg, x);
    }
    public static MemorySegment pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagBSTRBLOB.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemorySegment x) {
        tagBSTRBLOB.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


