// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _POINTFLOAT {
 *     FLOAT x;
 *     FLOAT y;
 * };
 * }
 */
public class _POINTFLOAT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_FLOAT$LAYOUT.withName("x"),
        Constants$root.C_FLOAT$LAYOUT.withName("y")
    ).withName("_POINTFLOAT");
    public static MemoryLayout $LAYOUT() {
        return _POINTFLOAT.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _POINTFLOAT.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT x;
     * }
     */
    public static float x$get(MemorySegment seg) {
        return (float)_POINTFLOAT.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT x;
     * }
     */
    public static void x$set(MemorySegment seg, float x) {
        _POINTFLOAT.x$VH.set(seg, x);
    }
    public static float x$get(MemorySegment seg, long index) {
        return (float)_POINTFLOAT.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, float x) {
        _POINTFLOAT.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _POINTFLOAT.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FLOAT y;
     * }
     */
    public static float y$get(MemorySegment seg) {
        return (float)_POINTFLOAT.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FLOAT y;
     * }
     */
    public static void y$set(MemorySegment seg, float x) {
        _POINTFLOAT.y$VH.set(seg, x);
    }
    public static float y$get(MemorySegment seg, long index) {
        return (float)_POINTFLOAT.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, float x) {
        _POINTFLOAT.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


