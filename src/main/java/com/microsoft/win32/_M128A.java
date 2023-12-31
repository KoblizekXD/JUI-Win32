// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _M128A {
 *     ULONGLONG Low;
 *     LONGLONG High;
 * };
 * }
 */
public class _M128A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Low"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("High")
    ).withName("_M128A");
    public static MemoryLayout $LAYOUT() {
        return _M128A.$struct$LAYOUT;
    }
    static final VarHandle Low$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Low"));
    public static VarHandle Low$VH() {
        return _M128A.Low$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG Low;
     * }
     */
    public static long Low$get(MemorySegment seg) {
        return (long)_M128A.Low$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG Low;
     * }
     */
    public static void Low$set(MemorySegment seg, long x) {
        _M128A.Low$VH.set(seg, x);
    }
    public static long Low$get(MemorySegment seg, long index) {
        return (long)_M128A.Low$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Low$set(MemorySegment seg, long index, long x) {
        _M128A.Low$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle High$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("High"));
    public static VarHandle High$VH() {
        return _M128A.High$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONGLONG High;
     * }
     */
    public static long High$get(MemorySegment seg) {
        return (long)_M128A.High$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONGLONG High;
     * }
     */
    public static void High$set(MemorySegment seg, long x) {
        _M128A.High$VH.set(seg, x);
    }
    public static long High$get(MemorySegment seg, long index) {
        return (long)_M128A.High$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void High$set(MemorySegment seg, long index, long x) {
        _M128A.High$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


