// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_PREFETCH_EX {
 *     DWORD Type;
 *     DWORD Count;
 *     PVOID Context;
 *     DWORDLONG Prefetch[1];
 * };
 * }
 */
public class _FILE_PREFETCH_EX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        Constants$root.C_POINTER$LAYOUT.withName("Context"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG_LONG$LAYOUT).withName("Prefetch")
    ).withName("_FILE_PREFETCH_EX");
    public static MemoryLayout $LAYOUT() {
        return _FILE_PREFETCH_EX.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _FILE_PREFETCH_EX.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)_FILE_PREFETCH_EX.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        _FILE_PREFETCH_EX.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_FILE_PREFETCH_EX.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _FILE_PREFETCH_EX.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _FILE_PREFETCH_EX.Count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)_FILE_PREFETCH_EX.Count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        _FILE_PREFETCH_EX.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_FILE_PREFETCH_EX.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _FILE_PREFETCH_EX.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Context"));
    public static VarHandle Context$VH() {
        return _FILE_PREFETCH_EX.Context$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID Context;
     * }
     */
    public static MemorySegment Context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_FILE_PREFETCH_EX.Context$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID Context;
     * }
     */
    public static void Context$set(MemorySegment seg, MemorySegment x) {
        _FILE_PREFETCH_EX.Context$VH.set(seg, x);
    }
    public static MemorySegment Context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_FILE_PREFETCH_EX.Context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Context$set(MemorySegment seg, long index, MemorySegment x) {
        _FILE_PREFETCH_EX.Context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Prefetch$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


