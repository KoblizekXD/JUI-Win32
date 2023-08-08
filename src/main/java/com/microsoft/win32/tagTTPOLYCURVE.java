// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagTTPOLYCURVE {
 *     WORD wType;
 *     WORD cpfx;
 *     POINTFX apfx[1];
 * };
 * }
 */
public class tagTTPOLYCURVE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wType"),
        Constants$root.C_SHORT$LAYOUT.withName("cpfx"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("fract"),
                Constants$root.C_SHORT$LAYOUT.withName("value")
            ).withName("x"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("fract"),
                Constants$root.C_SHORT$LAYOUT.withName("value")
            ).withName("y")
        ).withName("tagPOINTFX")).withName("apfx")
    ).withName("tagTTPOLYCURVE");
    public static MemoryLayout $LAYOUT() {
        return tagTTPOLYCURVE.$struct$LAYOUT;
    }
    static final VarHandle wType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wType"));
    public static VarHandle wType$VH() {
        return tagTTPOLYCURVE.wType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wType;
     * }
     */
    public static short wType$get(MemorySegment seg) {
        return (short)tagTTPOLYCURVE.wType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wType;
     * }
     */
    public static void wType$set(MemorySegment seg, short x) {
        tagTTPOLYCURVE.wType$VH.set(seg, x);
    }
    public static short wType$get(MemorySegment seg, long index) {
        return (short)tagTTPOLYCURVE.wType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wType$set(MemorySegment seg, long index, short x) {
        tagTTPOLYCURVE.wType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cpfx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cpfx"));
    public static VarHandle cpfx$VH() {
        return tagTTPOLYCURVE.cpfx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD cpfx;
     * }
     */
    public static short cpfx$get(MemorySegment seg) {
        return (short)tagTTPOLYCURVE.cpfx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD cpfx;
     * }
     */
    public static void cpfx$set(MemorySegment seg, short x) {
        tagTTPOLYCURVE.cpfx$VH.set(seg, x);
    }
    public static short cpfx$get(MemorySegment seg, long index) {
        return (short)tagTTPOLYCURVE.cpfx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cpfx$set(MemorySegment seg, long index, short x) {
        tagTTPOLYCURVE.cpfx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment apfx$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


