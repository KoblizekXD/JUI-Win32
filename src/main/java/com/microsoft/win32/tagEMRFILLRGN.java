// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRFILLRGN {
 *     EMR emr;
 *     RECTL rclBounds;
 *     DWORD cbRgnData;
 *     DWORD ihBrush;
 *     BYTE RgnData[1];
 * };
 * }
 */
public class tagEMRFILLRGN {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rclBounds"),
        Constants$root.C_LONG$LAYOUT.withName("cbRgnData"),
        Constants$root.C_LONG$LAYOUT.withName("ihBrush"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("RgnData"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagEMRFILLRGN");
    public static MemoryLayout $LAYOUT() {
        return tagEMRFILLRGN.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle cbRgnData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbRgnData"));
    public static VarHandle cbRgnData$VH() {
        return tagEMRFILLRGN.cbRgnData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbRgnData;
     * }
     */
    public static int cbRgnData$get(MemorySegment seg) {
        return (int)tagEMRFILLRGN.cbRgnData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbRgnData;
     * }
     */
    public static void cbRgnData$set(MemorySegment seg, int x) {
        tagEMRFILLRGN.cbRgnData$VH.set(seg, x);
    }
    public static int cbRgnData$get(MemorySegment seg, long index) {
        return (int)tagEMRFILLRGN.cbRgnData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbRgnData$set(MemorySegment seg, long index, int x) {
        tagEMRFILLRGN.cbRgnData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ihBrush$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ihBrush"));
    public static VarHandle ihBrush$VH() {
        return tagEMRFILLRGN.ihBrush$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static int ihBrush$get(MemorySegment seg) {
        return (int)tagEMRFILLRGN.ihBrush$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ihBrush;
     * }
     */
    public static void ihBrush$set(MemorySegment seg, int x) {
        tagEMRFILLRGN.ihBrush$VH.set(seg, x);
    }
    public static int ihBrush$get(MemorySegment seg, long index) {
        return (int)tagEMRFILLRGN.ihBrush$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihBrush$set(MemorySegment seg, long index, int x) {
        tagEMRFILLRGN.ihBrush$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RgnData$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

