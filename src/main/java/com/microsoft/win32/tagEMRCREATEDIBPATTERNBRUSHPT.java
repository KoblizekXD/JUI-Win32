// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRCREATEDIBPATTERNBRUSHPT {
 *     EMR emr;
 *     DWORD ihBrush;
 *     DWORD iUsage;
 *     DWORD offBmi;
 *     DWORD cbBmi;
 *     DWORD offBits;
 *     DWORD cbBits;
 * };
 * }
 */
public class tagEMRCREATEDIBPATTERNBRUSHPT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihBrush"),
        Constants$root.C_LONG$LAYOUT.withName("iUsage"),
        Constants$root.C_LONG$LAYOUT.withName("offBmi"),
        Constants$root.C_LONG$LAYOUT.withName("cbBmi"),
        Constants$root.C_LONG$LAYOUT.withName("offBits"),
        Constants$root.C_LONG$LAYOUT.withName("cbBits")
    ).withName("tagEMRCREATEDIBPATTERNBRUSHPT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihBrush$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihBrush"));
    public static VarHandle ihBrush$VH() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.ihBrush$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static int ihBrush$get(MemorySegment seg) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.ihBrush$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static void ihBrush$set(MemorySegment seg, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.ihBrush$VH.set(seg, x);
    }
    public static int ihBrush$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.ihBrush$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihBrush$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.ihBrush$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iUsage"));
    public static VarHandle iUsage$VH() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.iUsage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iUsage;
     * }
     */
    public static int iUsage$get(MemorySegment seg) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.iUsage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iUsage;
     * }
     */
    public static void iUsage$set(MemorySegment seg, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.iUsage$VH.set(seg, x);
    }
    public static int iUsage$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.iUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsage$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.iUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBmi"));
    public static VarHandle offBmi$VH() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.offBmi$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD offBmi;
     * }
     */
    public static int offBmi$get(MemorySegment seg) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.offBmi$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD offBmi;
     * }
     */
    public static void offBmi$set(MemorySegment seg, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.offBmi$VH.set(seg, x);
    }
    public static int offBmi$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.offBmi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmi$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.offBmi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmi$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBmi"));
    public static VarHandle cbBmi$VH() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.cbBmi$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbBmi;
     * }
     */
    public static int cbBmi$get(MemorySegment seg) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.cbBmi$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbBmi;
     * }
     */
    public static void cbBmi$set(MemorySegment seg, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.cbBmi$VH.set(seg, x);
    }
    public static int cbBmi$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.cbBmi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmi$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.cbBmi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offBits"));
    public static VarHandle offBits$VH() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.offBits$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD offBits;
     * }
     */
    public static int offBits$get(MemorySegment seg) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.offBits$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD offBits;
     * }
     */
    public static void offBits$set(MemorySegment seg, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.offBits$VH.set(seg, x);
    }
    public static int offBits$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.offBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBits$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.offBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBits"));
    public static VarHandle cbBits$VH() {
        return tagEMRCREATEDIBPATTERNBRUSHPT.cbBits$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbBits;
     * }
     */
    public static int cbBits$get(MemorySegment seg) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.cbBits$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbBits;
     * }
     */
    public static void cbBits$set(MemorySegment seg, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.cbBits$VH.set(seg, x);
    }
    public static int cbBits$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEDIBPATTERNBRUSHPT.cbBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBits$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEDIBPATTERNBRUSHPT.cbBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

