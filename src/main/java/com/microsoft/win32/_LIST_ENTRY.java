// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _LIST_ENTRY {
 *     struct _LIST_ENTRY* Flink;
 *     struct _LIST_ENTRY* Blink;
 * };
 * }
 */
public class _LIST_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Flink"),
        Constants$root.C_POINTER$LAYOUT.withName("Blink")
    ).withName("_LIST_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _LIST_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Flink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flink"));
    public static VarHandle Flink$VH() {
        return _LIST_ENTRY.Flink$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Flink;
     * }
     */
    public static MemorySegment Flink$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_LIST_ENTRY.Flink$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Flink;
     * }
     */
    public static void Flink$set(MemorySegment seg, MemorySegment x) {
        _LIST_ENTRY.Flink$VH.set(seg, x);
    }
    public static MemorySegment Flink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_LIST_ENTRY.Flink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flink$set(MemorySegment seg, long index, MemorySegment x) {
        _LIST_ENTRY.Flink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Blink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Blink"));
    public static VarHandle Blink$VH() {
        return _LIST_ENTRY.Blink$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Blink;
     * }
     */
    public static MemorySegment Blink$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_LIST_ENTRY.Blink$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Blink;
     * }
     */
    public static void Blink$set(MemorySegment seg, MemorySegment x) {
        _LIST_ENTRY.Blink$VH.set(seg, x);
    }
    public static MemorySegment Blink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_LIST_ENTRY.Blink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Blink$set(MemorySegment seg, long index, MemorySegment x) {
        _LIST_ENTRY.Blink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


