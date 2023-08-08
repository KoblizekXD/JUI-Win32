// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GLYPHMETRICSFLOAT {
 *     FLOAT gmfBlackBoxX;
 *     FLOAT gmfBlackBoxY;
 *     POINTFLOAT gmfptGlyphOrigin;
 *     FLOAT gmfCellIncX;
 *     FLOAT gmfCellIncY;
 * };
 * }
 */
public class _GLYPHMETRICSFLOAT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("gmfBlackBoxX"),
        Constants$root.C_FLOAT$LAYOUT.withName("gmfBlackBoxY"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("gmfptGlyphOrigin"),
        Constants$root.C_FLOAT$LAYOUT.withName("gmfCellIncX"),
        Constants$root.C_FLOAT$LAYOUT.withName("gmfCellIncY")
    ).withName("_GLYPHMETRICSFLOAT");
    public static MemoryLayout $LAYOUT() {
        return _GLYPHMETRICSFLOAT.$struct$LAYOUT;
    }
    static final VarHandle gmfBlackBoxX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gmfBlackBoxX"));
    public static VarHandle gmfBlackBoxX$VH() {
        return _GLYPHMETRICSFLOAT.gmfBlackBoxX$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT gmfBlackBoxX;
     * }
     */
    public static float gmfBlackBoxX$get(MemorySegment seg) {
        return (float)_GLYPHMETRICSFLOAT.gmfBlackBoxX$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT gmfBlackBoxX;
     * }
     */
    public static void gmfBlackBoxX$set(MemorySegment seg, float x) {
        _GLYPHMETRICSFLOAT.gmfBlackBoxX$VH.set(seg, x);
    }
    public static float gmfBlackBoxX$get(MemorySegment seg, long index) {
        return (float)_GLYPHMETRICSFLOAT.gmfBlackBoxX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gmfBlackBoxX$set(MemorySegment seg, long index, float x) {
        _GLYPHMETRICSFLOAT.gmfBlackBoxX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gmfBlackBoxY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gmfBlackBoxY"));
    public static VarHandle gmfBlackBoxY$VH() {
        return _GLYPHMETRICSFLOAT.gmfBlackBoxY$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT gmfBlackBoxY;
     * }
     */
    public static float gmfBlackBoxY$get(MemorySegment seg) {
        return (float)_GLYPHMETRICSFLOAT.gmfBlackBoxY$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT gmfBlackBoxY;
     * }
     */
    public static void gmfBlackBoxY$set(MemorySegment seg, float x) {
        _GLYPHMETRICSFLOAT.gmfBlackBoxY$VH.set(seg, x);
    }
    public static float gmfBlackBoxY$get(MemorySegment seg, long index) {
        return (float)_GLYPHMETRICSFLOAT.gmfBlackBoxY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gmfBlackBoxY$set(MemorySegment seg, long index, float x) {
        _GLYPHMETRICSFLOAT.gmfBlackBoxY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment gmfptGlyphOrigin$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle gmfCellIncX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gmfCellIncX"));
    public static VarHandle gmfCellIncX$VH() {
        return _GLYPHMETRICSFLOAT.gmfCellIncX$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT gmfCellIncX;
     * }
     */
    public static float gmfCellIncX$get(MemorySegment seg) {
        return (float)_GLYPHMETRICSFLOAT.gmfCellIncX$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT gmfCellIncX;
     * }
     */
    public static void gmfCellIncX$set(MemorySegment seg, float x) {
        _GLYPHMETRICSFLOAT.gmfCellIncX$VH.set(seg, x);
    }
    public static float gmfCellIncX$get(MemorySegment seg, long index) {
        return (float)_GLYPHMETRICSFLOAT.gmfCellIncX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gmfCellIncX$set(MemorySegment seg, long index, float x) {
        _GLYPHMETRICSFLOAT.gmfCellIncX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gmfCellIncY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("gmfCellIncY"));
    public static VarHandle gmfCellIncY$VH() {
        return _GLYPHMETRICSFLOAT.gmfCellIncY$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT gmfCellIncY;
     * }
     */
    public static float gmfCellIncY$get(MemorySegment seg) {
        return (float)_GLYPHMETRICSFLOAT.gmfCellIncY$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT gmfCellIncY;
     * }
     */
    public static void gmfCellIncY$set(MemorySegment seg, float x) {
        _GLYPHMETRICSFLOAT.gmfCellIncY$VH.set(seg, x);
    }
    public static float gmfCellIncY$get(MemorySegment seg, long index) {
        return (float)_GLYPHMETRICSFLOAT.gmfCellIncY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gmfCellIncY$set(MemorySegment seg, long index, float x) {
        _GLYPHMETRICSFLOAT.gmfCellIncY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


