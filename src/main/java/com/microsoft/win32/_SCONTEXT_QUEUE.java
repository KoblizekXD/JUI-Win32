// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCONTEXT_QUEUE {
 *     unsigned long NumberOfObjects;
 *     NDR_SCONTEXT* ArrayOfObjects;
 * };
 * }
 */
public class _SCONTEXT_QUEUE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfObjects"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ArrayOfObjects")
    ).withName("_SCONTEXT_QUEUE");
    public static MemoryLayout $LAYOUT() {
        return _SCONTEXT_QUEUE.$struct$LAYOUT;
    }
    static final VarHandle NumberOfObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfObjects"));
    public static VarHandle NumberOfObjects$VH() {
        return _SCONTEXT_QUEUE.NumberOfObjects$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long NumberOfObjects;
     * }
     */
    public static int NumberOfObjects$get(MemorySegment seg) {
        return (int)_SCONTEXT_QUEUE.NumberOfObjects$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long NumberOfObjects;
     * }
     */
    public static void NumberOfObjects$set(MemorySegment seg, int x) {
        _SCONTEXT_QUEUE.NumberOfObjects$VH.set(seg, x);
    }
    public static int NumberOfObjects$get(MemorySegment seg, long index) {
        return (int)_SCONTEXT_QUEUE.NumberOfObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfObjects$set(MemorySegment seg, long index, int x) {
        _SCONTEXT_QUEUE.NumberOfObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ArrayOfObjects$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArrayOfObjects"));
    public static VarHandle ArrayOfObjects$VH() {
        return _SCONTEXT_QUEUE.ArrayOfObjects$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * NDR_SCONTEXT* ArrayOfObjects;
     * }
     */
    public static MemorySegment ArrayOfObjects$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SCONTEXT_QUEUE.ArrayOfObjects$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * NDR_SCONTEXT* ArrayOfObjects;
     * }
     */
    public static void ArrayOfObjects$set(MemorySegment seg, MemorySegment x) {
        _SCONTEXT_QUEUE.ArrayOfObjects$VH.set(seg, x);
    }
    public static MemorySegment ArrayOfObjects$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SCONTEXT_QUEUE.ArrayOfObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArrayOfObjects$set(MemorySegment seg, long index, MemorySegment x) {
        _SCONTEXT_QUEUE.ArrayOfObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

