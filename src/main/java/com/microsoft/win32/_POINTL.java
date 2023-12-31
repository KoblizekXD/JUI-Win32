// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _POINTL {
 *     LONG x;
 *     LONG y;
 * };
 * }
 */
public class _POINTL {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y")
    ).withName("_POINTL");
    public static MemoryLayout $LAYOUT() {
        return _POINTL.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _POINTL.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)_POINTL.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        _POINTL.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)_POINTL.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        _POINTL.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _POINTL.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)_POINTL.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        _POINTL.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)_POINTL.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        _POINTL.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


