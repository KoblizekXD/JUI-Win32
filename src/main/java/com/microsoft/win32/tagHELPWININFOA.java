// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagHELPWININFOA {
 *     int wStructSize;
 *     int x;
 *     int y;
 *     int dx;
 *     int dy;
 *     int wMax;
 *     CHAR rgchMember[2];
 * };
 * }
 */
public class tagHELPWININFOA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("wStructSize"),
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("dx"),
        Constants$root.C_LONG$LAYOUT.withName("dy"),
        Constants$root.C_LONG$LAYOUT.withName("wMax"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("rgchMember"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagHELPWININFOA");
    public static MemoryLayout $LAYOUT() {
        return tagHELPWININFOA.$struct$LAYOUT;
    }
    static final VarHandle wStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wStructSize"));
    public static VarHandle wStructSize$VH() {
        return tagHELPWININFOA.wStructSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int wStructSize;
     * }
     */
    public static int wStructSize$get(MemorySegment seg) {
        return (int)tagHELPWININFOA.wStructSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int wStructSize;
     * }
     */
    public static void wStructSize$set(MemorySegment seg, int x) {
        tagHELPWININFOA.wStructSize$VH.set(seg, x);
    }
    public static int wStructSize$get(MemorySegment seg, long index) {
        return (int)tagHELPWININFOA.wStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wStructSize$set(MemorySegment seg, long index, int x) {
        tagHELPWININFOA.wStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagHELPWININFOA.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)tagHELPWININFOA.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        tagHELPWININFOA.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagHELPWININFOA.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagHELPWININFOA.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagHELPWININFOA.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)tagHELPWININFOA.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        tagHELPWININFOA.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagHELPWININFOA.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagHELPWININFOA.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dx"));
    public static VarHandle dx$VH() {
        return tagHELPWININFOA.dx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dx;
     * }
     */
    public static int dx$get(MemorySegment seg) {
        return (int)tagHELPWININFOA.dx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dx;
     * }
     */
    public static void dx$set(MemorySegment seg, int x) {
        tagHELPWININFOA.dx$VH.set(seg, x);
    }
    public static int dx$get(MemorySegment seg, long index) {
        return (int)tagHELPWININFOA.dx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dx$set(MemorySegment seg, long index, int x) {
        tagHELPWININFOA.dx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dy"));
    public static VarHandle dy$VH() {
        return tagHELPWININFOA.dy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int dy;
     * }
     */
    public static int dy$get(MemorySegment seg) {
        return (int)tagHELPWININFOA.dy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int dy;
     * }
     */
    public static void dy$set(MemorySegment seg, int x) {
        tagHELPWININFOA.dy$VH.set(seg, x);
    }
    public static int dy$get(MemorySegment seg, long index) {
        return (int)tagHELPWININFOA.dy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dy$set(MemorySegment seg, long index, int x) {
        tagHELPWININFOA.dy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMax"));
    public static VarHandle wMax$VH() {
        return tagHELPWININFOA.wMax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int wMax;
     * }
     */
    public static int wMax$get(MemorySegment seg) {
        return (int)tagHELPWININFOA.wMax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int wMax;
     * }
     */
    public static void wMax$set(MemorySegment seg, int x) {
        tagHELPWININFOA.wMax$VH.set(seg, x);
    }
    public static int wMax$get(MemorySegment seg, long index) {
        return (int)tagHELPWININFOA.wMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMax$set(MemorySegment seg, long index, int x) {
        tagHELPWININFOA.wMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgchMember$slice(MemorySegment seg) {
        return seg.asSlice(24, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


