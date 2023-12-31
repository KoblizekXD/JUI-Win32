// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagSCROLLINFO {
 *     UINT cbSize;
 *     UINT fMask;
 *     int nMin;
 *     int nMax;
 *     UINT nPage;
 *     int nPos;
 *     int nTrackPos;
 * };
 * }
 */
public class tagSCROLLINFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("fMask"),
        Constants$root.C_LONG$LAYOUT.withName("nMin"),
        Constants$root.C_LONG$LAYOUT.withName("nMax"),
        Constants$root.C_LONG$LAYOUT.withName("nPage"),
        Constants$root.C_LONG$LAYOUT.withName("nPos"),
        Constants$root.C_LONG$LAYOUT.withName("nTrackPos")
    ).withName("tagSCROLLINFO");
    public static MemoryLayout $LAYOUT() {
        return tagSCROLLINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagSCROLLINFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        tagSCROLLINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fMask"));
    public static VarHandle fMask$VH() {
        return tagSCROLLINFO.fMask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT fMask;
     * }
     */
    public static int fMask$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.fMask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT fMask;
     * }
     */
    public static void fMask$set(MemorySegment seg, int x) {
        tagSCROLLINFO.fMask$VH.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.fMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.fMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMin"));
    public static VarHandle nMin$VH() {
        return tagSCROLLINFO.nMin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nMin;
     * }
     */
    public static int nMin$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.nMin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nMin;
     * }
     */
    public static void nMin$set(MemorySegment seg, int x) {
        tagSCROLLINFO.nMin$VH.set(seg, x);
    }
    public static int nMin$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.nMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMin$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.nMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nMax"));
    public static VarHandle nMax$VH() {
        return tagSCROLLINFO.nMax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nMax;
     * }
     */
    public static int nMax$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.nMax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nMax;
     * }
     */
    public static void nMax$set(MemorySegment seg, int x) {
        tagSCROLLINFO.nMax$VH.set(seg, x);
    }
    public static int nMax$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.nMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMax$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.nMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPage"));
    public static VarHandle nPage$VH() {
        return tagSCROLLINFO.nPage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT nPage;
     * }
     */
    public static int nPage$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.nPage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT nPage;
     * }
     */
    public static void nPage$set(MemorySegment seg, int x) {
        tagSCROLLINFO.nPage$VH.set(seg, x);
    }
    public static int nPage$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.nPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPage$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.nPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nPos"));
    public static VarHandle nPos$VH() {
        return tagSCROLLINFO.nPos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nPos;
     * }
     */
    public static int nPos$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.nPos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nPos;
     * }
     */
    public static void nPos$set(MemorySegment seg, int x) {
        tagSCROLLINFO.nPos$VH.set(seg, x);
    }
    public static int nPos$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.nPos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPos$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.nPos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nTrackPos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nTrackPos"));
    public static VarHandle nTrackPos$VH() {
        return tagSCROLLINFO.nTrackPos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int nTrackPos;
     * }
     */
    public static int nTrackPos$get(MemorySegment seg) {
        return (int)tagSCROLLINFO.nTrackPos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int nTrackPos;
     * }
     */
    public static void nTrackPos$set(MemorySegment seg, int x) {
        tagSCROLLINFO.nTrackPos$VH.set(seg, x);
    }
    public static int nTrackPos$get(MemorySegment seg, long index) {
        return (int)tagSCROLLINFO.nTrackPos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nTrackPos$set(MemorySegment seg, long index, int x) {
        tagSCROLLINFO.nTrackPos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


