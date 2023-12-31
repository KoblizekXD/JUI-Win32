// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPOLYTEXTW {
 *     int x;
 *     int y;
 *     UINT n;
 *     LPCWSTR lpstr;
 *     UINT uiFlags;
 *     RECT rcl;
 *     int* pdx;
 * };
 * }
 */
public class tagPOLYTEXTW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("n"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstr"),
        Constants$root.C_LONG$LAYOUT.withName("uiFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcl"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pdx")
    ).withName("tagPOLYTEXTW");
    public static MemoryLayout $LAYOUT() {
        return tagPOLYTEXTW.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagPOLYTEXTW.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)tagPOLYTEXTW.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        tagPOLYTEXTW.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTW.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTW.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagPOLYTEXTW.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)tagPOLYTEXTW.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        tagPOLYTEXTW.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTW.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTW.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n"));
    public static VarHandle n$VH() {
        return tagPOLYTEXTW.n$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT n;
     * }
     */
    public static int n$get(MemorySegment seg) {
        return (int)tagPOLYTEXTW.n$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT n;
     * }
     */
    public static void n$set(MemorySegment seg, int x) {
        tagPOLYTEXTW.n$VH.set(seg, x);
    }
    public static int n$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTW.n$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTW.n$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstr"));
    public static VarHandle lpstr$VH() {
        return tagPOLYTEXTW.lpstr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpstr;
     * }
     */
    public static MemorySegment lpstr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPOLYTEXTW.lpstr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpstr;
     * }
     */
    public static void lpstr$set(MemorySegment seg, MemorySegment x) {
        tagPOLYTEXTW.lpstr$VH.set(seg, x);
    }
    public static MemorySegment lpstr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPOLYTEXTW.lpstr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstr$set(MemorySegment seg, long index, MemorySegment x) {
        tagPOLYTEXTW.lpstr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uiFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uiFlags"));
    public static VarHandle uiFlags$VH() {
        return tagPOLYTEXTW.uiFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uiFlags;
     * }
     */
    public static int uiFlags$get(MemorySegment seg) {
        return (int)tagPOLYTEXTW.uiFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uiFlags;
     * }
     */
    public static void uiFlags$set(MemorySegment seg, int x) {
        tagPOLYTEXTW.uiFlags$VH.set(seg, x);
    }
    public static int uiFlags$get(MemorySegment seg, long index) {
        return (int)tagPOLYTEXTW.uiFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uiFlags$set(MemorySegment seg, long index, int x) {
        tagPOLYTEXTW.uiFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcl$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    static final VarHandle pdx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pdx"));
    public static VarHandle pdx$VH() {
        return tagPOLYTEXTW.pdx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* pdx;
     * }
     */
    public static MemorySegment pdx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPOLYTEXTW.pdx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* pdx;
     * }
     */
    public static void pdx$set(MemorySegment seg, MemorySegment x) {
        tagPOLYTEXTW.pdx$VH.set(seg, x);
    }
    public static MemorySegment pdx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPOLYTEXTW.pdx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pdx$set(MemorySegment seg, long index, MemorySegment x) {
        tagPOLYTEXTW.pdx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


