// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagBITMAP {
 *     LONG bmType;
 *     LONG bmWidth;
 *     LONG bmHeight;
 *     LONG bmWidthBytes;
 *     WORD bmPlanes;
 *     WORD bmBitsPixel;
 *     LPVOID bmBits;
 * };
 * }
 */
public class tagBITMAP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("bmType"),
        Constants$root.C_LONG$LAYOUT.withName("bmWidth"),
        Constants$root.C_LONG$LAYOUT.withName("bmHeight"),
        Constants$root.C_LONG$LAYOUT.withName("bmWidthBytes"),
        Constants$root.C_SHORT$LAYOUT.withName("bmPlanes"),
        Constants$root.C_SHORT$LAYOUT.withName("bmBitsPixel"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("bmBits")
    ).withName("tagBITMAP");
    public static MemoryLayout $LAYOUT() {
        return tagBITMAP.$struct$LAYOUT;
    }
    static final VarHandle bmType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmType"));
    public static VarHandle bmType$VH() {
        return tagBITMAP.bmType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmType;
     * }
     */
    public static int bmType$get(MemorySegment seg) {
        return (int)tagBITMAP.bmType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmType;
     * }
     */
    public static void bmType$set(MemorySegment seg, int x) {
        tagBITMAP.bmType$VH.set(seg, x);
    }
    public static int bmType$get(MemorySegment seg, long index) {
        return (int)tagBITMAP.bmType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmType$set(MemorySegment seg, long index, int x) {
        tagBITMAP.bmType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmWidth"));
    public static VarHandle bmWidth$VH() {
        return tagBITMAP.bmWidth$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmWidth;
     * }
     */
    public static int bmWidth$get(MemorySegment seg) {
        return (int)tagBITMAP.bmWidth$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmWidth;
     * }
     */
    public static void bmWidth$set(MemorySegment seg, int x) {
        tagBITMAP.bmWidth$VH.set(seg, x);
    }
    public static int bmWidth$get(MemorySegment seg, long index) {
        return (int)tagBITMAP.bmWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmWidth$set(MemorySegment seg, long index, int x) {
        tagBITMAP.bmWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmHeight"));
    public static VarHandle bmHeight$VH() {
        return tagBITMAP.bmHeight$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmHeight;
     * }
     */
    public static int bmHeight$get(MemorySegment seg) {
        return (int)tagBITMAP.bmHeight$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmHeight;
     * }
     */
    public static void bmHeight$set(MemorySegment seg, int x) {
        tagBITMAP.bmHeight$VH.set(seg, x);
    }
    public static int bmHeight$get(MemorySegment seg, long index) {
        return (int)tagBITMAP.bmHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmHeight$set(MemorySegment seg, long index, int x) {
        tagBITMAP.bmHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmWidthBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmWidthBytes"));
    public static VarHandle bmWidthBytes$VH() {
        return tagBITMAP.bmWidthBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmWidthBytes;
     * }
     */
    public static int bmWidthBytes$get(MemorySegment seg) {
        return (int)tagBITMAP.bmWidthBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmWidthBytes;
     * }
     */
    public static void bmWidthBytes$set(MemorySegment seg, int x) {
        tagBITMAP.bmWidthBytes$VH.set(seg, x);
    }
    public static int bmWidthBytes$get(MemorySegment seg, long index) {
        return (int)tagBITMAP.bmWidthBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmWidthBytes$set(MemorySegment seg, long index, int x) {
        tagBITMAP.bmWidthBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmPlanes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmPlanes"));
    public static VarHandle bmPlanes$VH() {
        return tagBITMAP.bmPlanes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD bmPlanes;
     * }
     */
    public static short bmPlanes$get(MemorySegment seg) {
        return (short)tagBITMAP.bmPlanes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD bmPlanes;
     * }
     */
    public static void bmPlanes$set(MemorySegment seg, short x) {
        tagBITMAP.bmPlanes$VH.set(seg, x);
    }
    public static short bmPlanes$get(MemorySegment seg, long index) {
        return (short)tagBITMAP.bmPlanes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmPlanes$set(MemorySegment seg, long index, short x) {
        tagBITMAP.bmPlanes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmBitsPixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmBitsPixel"));
    public static VarHandle bmBitsPixel$VH() {
        return tagBITMAP.bmBitsPixel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD bmBitsPixel;
     * }
     */
    public static short bmBitsPixel$get(MemorySegment seg) {
        return (short)tagBITMAP.bmBitsPixel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD bmBitsPixel;
     * }
     */
    public static void bmBitsPixel$set(MemorySegment seg, short x) {
        tagBITMAP.bmBitsPixel$VH.set(seg, x);
    }
    public static short bmBitsPixel$get(MemorySegment seg, long index) {
        return (short)tagBITMAP.bmBitsPixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmBitsPixel$set(MemorySegment seg, long index, short x) {
        tagBITMAP.bmBitsPixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmBits"));
    public static VarHandle bmBits$VH() {
        return tagBITMAP.bmBits$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID bmBits;
     * }
     */
    public static MemorySegment bmBits$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagBITMAP.bmBits$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID bmBits;
     * }
     */
    public static void bmBits$set(MemorySegment seg, MemorySegment x) {
        tagBITMAP.bmBits$VH.set(seg, x);
    }
    public static MemorySegment bmBits$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagBITMAP.bmBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmBits$set(MemorySegment seg, long index, MemorySegment x) {
        tagBITMAP.bmBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

