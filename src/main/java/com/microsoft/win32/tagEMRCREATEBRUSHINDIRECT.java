// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRCREATEBRUSHINDIRECT {
 *     EMR emr;
 *     DWORD ihBrush;
 *     LOGBRUSH32 lb;
 * };
 * }
 */
public class tagEMRCREATEBRUSHINDIRECT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("ihBrush"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lbStyle"),
            Constants$root.C_LONG$LAYOUT.withName("lbColor"),
            Constants$root.C_LONG$LAYOUT.withName("lbHatch")
        ).withName("lb")
    ).withName("tagEMRCREATEBRUSHINDIRECT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRCREATEBRUSHINDIRECT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihBrush$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihBrush"));
    public static VarHandle ihBrush$VH() {
        return tagEMRCREATEBRUSHINDIRECT.ihBrush$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static int ihBrush$get(MemorySegment seg) {
        return (int)tagEMRCREATEBRUSHINDIRECT.ihBrush$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static void ihBrush$set(MemorySegment seg, int x) {
        tagEMRCREATEBRUSHINDIRECT.ihBrush$VH.set(seg, x);
    }
    public static int ihBrush$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEBRUSHINDIRECT.ihBrush$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihBrush$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEBRUSHINDIRECT.ihBrush$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lb$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


