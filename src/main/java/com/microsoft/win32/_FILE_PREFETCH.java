// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_PREFETCH {
 *     DWORD Type;
 *     DWORD Count;
 *     DWORDLONG Prefetch[1];
 * };
 * }
 */
public class _FILE_PREFETCH {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG_LONG$LAYOUT).withName("Prefetch")
    ).withName("_FILE_PREFETCH");
    public static MemoryLayout $LAYOUT() {
        return _FILE_PREFETCH.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _FILE_PREFETCH.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)_FILE_PREFETCH.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        _FILE_PREFETCH.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_FILE_PREFETCH.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _FILE_PREFETCH.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _FILE_PREFETCH.Count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)_FILE_PREFETCH.Count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        _FILE_PREFETCH.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_FILE_PREFETCH.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _FILE_PREFETCH.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Prefetch$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


