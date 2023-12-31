// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRIVERTEX {
 *     LONG x;
 *     LONG y;
 *     COLOR16 Red;
 *     COLOR16 Green;
 *     COLOR16 Blue;
 *     COLOR16 Alpha;
 * };
 * }
 */
public class _TRIVERTEX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_SHORT$LAYOUT.withName("Red"),
        Constants$root.C_SHORT$LAYOUT.withName("Green"),
        Constants$root.C_SHORT$LAYOUT.withName("Blue"),
        Constants$root.C_SHORT$LAYOUT.withName("Alpha")
    ).withName("_TRIVERTEX");
    public static MemoryLayout $LAYOUT() {
        return _TRIVERTEX.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _TRIVERTEX.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)_TRIVERTEX.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        _TRIVERTEX.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)_TRIVERTEX.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        _TRIVERTEX.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _TRIVERTEX.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)_TRIVERTEX.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        _TRIVERTEX.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)_TRIVERTEX.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        _TRIVERTEX.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Red$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Red"));
    public static VarHandle Red$VH() {
        return _TRIVERTEX.Red$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLOR16 Red;
     * }
     */
    public static short Red$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Red$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLOR16 Red;
     * }
     */
    public static void Red$set(MemorySegment seg, short x) {
        _TRIVERTEX.Red$VH.set(seg, x);
    }
    public static short Red$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Red$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Red$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Red$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Green$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Green"));
    public static VarHandle Green$VH() {
        return _TRIVERTEX.Green$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLOR16 Green;
     * }
     */
    public static short Green$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Green$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLOR16 Green;
     * }
     */
    public static void Green$set(MemorySegment seg, short x) {
        _TRIVERTEX.Green$VH.set(seg, x);
    }
    public static short Green$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Green$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Green$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Green$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Blue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Blue"));
    public static VarHandle Blue$VH() {
        return _TRIVERTEX.Blue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLOR16 Blue;
     * }
     */
    public static short Blue$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Blue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLOR16 Blue;
     * }
     */
    public static void Blue$set(MemorySegment seg, short x) {
        _TRIVERTEX.Blue$VH.set(seg, x);
    }
    public static short Blue$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Blue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Blue$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Blue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Alpha$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Alpha"));
    public static VarHandle Alpha$VH() {
        return _TRIVERTEX.Alpha$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLOR16 Alpha;
     * }
     */
    public static short Alpha$get(MemorySegment seg) {
        return (short)_TRIVERTEX.Alpha$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLOR16 Alpha;
     * }
     */
    public static void Alpha$set(MemorySegment seg, short x) {
        _TRIVERTEX.Alpha$VH.set(seg, x);
    }
    public static short Alpha$get(MemorySegment seg, long index) {
        return (short)_TRIVERTEX.Alpha$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Alpha$set(MemorySegment seg, long index, short x) {
        _TRIVERTEX.Alpha$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


