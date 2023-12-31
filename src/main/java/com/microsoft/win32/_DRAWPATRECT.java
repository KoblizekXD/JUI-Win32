// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DRAWPATRECT {
 *     POINT ptPosition;
 *     POINT ptSize;
 *     WORD wStyle;
 *     WORD wPattern;
 * };
 * }
 */
public class _DRAWPATRECT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptPosition"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptSize"),
        Constants$root.C_SHORT$LAYOUT.withName("wStyle"),
        Constants$root.C_SHORT$LAYOUT.withName("wPattern")
    ).withName("_DRAWPATRECT");
    public static MemoryLayout $LAYOUT() {
        return _DRAWPATRECT.$struct$LAYOUT;
    }
    public static MemorySegment ptPosition$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ptSize$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle wStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wStyle"));
    public static VarHandle wStyle$VH() {
        return _DRAWPATRECT.wStyle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wStyle;
     * }
     */
    public static short wStyle$get(MemorySegment seg) {
        return (short)_DRAWPATRECT.wStyle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wStyle;
     * }
     */
    public static void wStyle$set(MemorySegment seg, short x) {
        _DRAWPATRECT.wStyle$VH.set(seg, x);
    }
    public static short wStyle$get(MemorySegment seg, long index) {
        return (short)_DRAWPATRECT.wStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wStyle$set(MemorySegment seg, long index, short x) {
        _DRAWPATRECT.wStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPattern$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPattern"));
    public static VarHandle wPattern$VH() {
        return _DRAWPATRECT.wPattern$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPattern;
     * }
     */
    public static short wPattern$get(MemorySegment seg) {
        return (short)_DRAWPATRECT.wPattern$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPattern;
     * }
     */
    public static void wPattern$set(MemorySegment seg, short x) {
        _DRAWPATRECT.wPattern$VH.set(seg, x);
    }
    public static short wPattern$get(MemorySegment seg, long index) {
        return (short)_DRAWPATRECT.wPattern$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPattern$set(MemorySegment seg, long index, short x) {
        _DRAWPATRECT.wPattern$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


