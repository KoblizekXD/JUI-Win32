// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRSETPIXELV {
 *     EMR emr;
 *     POINTL ptlPixel;
 *     COLORREF crColor;
 * };
 * }
 */
public class tagEMRSETPIXELV {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptlPixel"),
        Constants$root.C_LONG$LAYOUT.withName("crColor")
    ).withName("tagEMRSETPIXELV");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETPIXELV.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ptlPixel$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle crColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crColor"));
    public static VarHandle crColor$VH() {
        return tagEMRSETPIXELV.crColor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLORREF crColor;
     * }
     */
    public static int crColor$get(MemorySegment seg) {
        return (int)tagEMRSETPIXELV.crColor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLORREF crColor;
     * }
     */
    public static void crColor$set(MemorySegment seg, int x) {
        tagEMRSETPIXELV.crColor$VH.set(seg, x);
    }
    public static int crColor$get(MemorySegment seg, long index) {
        return (int)tagEMRSETPIXELV.crColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crColor$set(MemorySegment seg, long index, int x) {
        tagEMRSETPIXELV.crColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


