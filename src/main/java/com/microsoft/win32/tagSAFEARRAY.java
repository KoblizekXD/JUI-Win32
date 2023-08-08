// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagSAFEARRAY {
 *     USHORT cDims;
 *     USHORT fFeatures;
 *     ULONG cbElements;
 *     ULONG cLocks;
 *     PVOID pvData;
 *     SAFEARRAYBOUND rgsabound[1];
 * };
 * }
 */
public class tagSAFEARRAY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("cDims"),
        Constants$root.C_SHORT$LAYOUT.withName("fFeatures"),
        Constants$root.C_LONG$LAYOUT.withName("cbElements"),
        Constants$root.C_LONG$LAYOUT.withName("cLocks"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pvData"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cElements"),
            Constants$root.C_LONG$LAYOUT.withName("lLbound")
        ).withName("tagSAFEARRAYBOUND")).withName("rgsabound")
    ).withName("tagSAFEARRAY");
    public static MemoryLayout $LAYOUT() {
        return tagSAFEARRAY.$struct$LAYOUT;
    }
    static final VarHandle cDims$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDims"));
    public static VarHandle cDims$VH() {
        return tagSAFEARRAY.cDims$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT cDims;
     * }
     */
    public static short cDims$get(MemorySegment seg) {
        return (short)tagSAFEARRAY.cDims$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT cDims;
     * }
     */
    public static void cDims$set(MemorySegment seg, short x) {
        tagSAFEARRAY.cDims$VH.set(seg, x);
    }
    public static short cDims$get(MemorySegment seg, long index) {
        return (short)tagSAFEARRAY.cDims$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDims$set(MemorySegment seg, long index, short x) {
        tagSAFEARRAY.cDims$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fFeatures$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fFeatures"));
    public static VarHandle fFeatures$VH() {
        return tagSAFEARRAY.fFeatures$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT fFeatures;
     * }
     */
    public static short fFeatures$get(MemorySegment seg) {
        return (short)tagSAFEARRAY.fFeatures$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT fFeatures;
     * }
     */
    public static void fFeatures$set(MemorySegment seg, short x) {
        tagSAFEARRAY.fFeatures$VH.set(seg, x);
    }
    public static short fFeatures$get(MemorySegment seg, long index) {
        return (short)tagSAFEARRAY.fFeatures$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fFeatures$set(MemorySegment seg, long index, short x) {
        tagSAFEARRAY.fFeatures$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbElements"));
    public static VarHandle cbElements$VH() {
        return tagSAFEARRAY.cbElements$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbElements;
     * }
     */
    public static int cbElements$get(MemorySegment seg) {
        return (int)tagSAFEARRAY.cbElements$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbElements;
     * }
     */
    public static void cbElements$set(MemorySegment seg, int x) {
        tagSAFEARRAY.cbElements$VH.set(seg, x);
    }
    public static int cbElements$get(MemorySegment seg, long index) {
        return (int)tagSAFEARRAY.cbElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbElements$set(MemorySegment seg, long index, int x) {
        tagSAFEARRAY.cbElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cLocks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cLocks"));
    public static VarHandle cLocks$VH() {
        return tagSAFEARRAY.cLocks$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cLocks;
     * }
     */
    public static int cLocks$get(MemorySegment seg) {
        return (int)tagSAFEARRAY.cLocks$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cLocks;
     * }
     */
    public static void cLocks$set(MemorySegment seg, int x) {
        tagSAFEARRAY.cLocks$VH.set(seg, x);
    }
    public static int cLocks$get(MemorySegment seg, long index) {
        return (int)tagSAFEARRAY.cLocks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cLocks$set(MemorySegment seg, long index, int x) {
        tagSAFEARRAY.cLocks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvData"));
    public static VarHandle pvData$VH() {
        return tagSAFEARRAY.pvData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID pvData;
     * }
     */
    public static MemorySegment pvData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagSAFEARRAY.pvData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID pvData;
     * }
     */
    public static void pvData$set(MemorySegment seg, MemorySegment x) {
        tagSAFEARRAY.pvData$VH.set(seg, x);
    }
    public static MemorySegment pvData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagSAFEARRAY.pvData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvData$set(MemorySegment seg, long index, MemorySegment x) {
        tagSAFEARRAY.pvData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgsabound$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


