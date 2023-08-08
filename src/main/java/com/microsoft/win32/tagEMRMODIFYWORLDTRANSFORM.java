// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRMODIFYWORLDTRANSFORM {
 *     EMR emr;
 *     XFORM xform;
 *     DWORD iMode;
 * };
 * }
 */
public class tagEMRMODIFYWORLDTRANSFORM {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("eM11"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM12"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM21"),
            Constants$root.C_FLOAT$LAYOUT.withName("eM22"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDx"),
            Constants$root.C_FLOAT$LAYOUT.withName("eDy")
        ).withName("xform"),
        Constants$root.C_LONG$LAYOUT.withName("iMode")
    ).withName("tagEMRMODIFYWORLDTRANSFORM");
    public static MemoryLayout $LAYOUT() {
        return tagEMRMODIFYWORLDTRANSFORM.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment xform$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    static final VarHandle iMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMode"));
    public static VarHandle iMode$VH() {
        return tagEMRMODIFYWORLDTRANSFORM.iMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iMode;
     * }
     */
    public static int iMode$get(MemorySegment seg) {
        return (int)tagEMRMODIFYWORLDTRANSFORM.iMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iMode;
     * }
     */
    public static void iMode$set(MemorySegment seg, int x) {
        tagEMRMODIFYWORLDTRANSFORM.iMode$VH.set(seg, x);
    }
    public static int iMode$get(MemorySegment seg, long index) {
        return (int)tagEMRMODIFYWORLDTRANSFORM.iMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMode$set(MemorySegment seg, long index, int x) {
        tagEMRMODIFYWORLDTRANSFORM.iMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


