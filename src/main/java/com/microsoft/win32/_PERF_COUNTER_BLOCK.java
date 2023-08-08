// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PERF_COUNTER_BLOCK {
 *     DWORD ByteLength;
 * };
 * }
 */
public class _PERF_COUNTER_BLOCK {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ByteLength")
    ).withName("_PERF_COUNTER_BLOCK");
    public static MemoryLayout $LAYOUT() {
        return _PERF_COUNTER_BLOCK.$struct$LAYOUT;
    }
    static final VarHandle ByteLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteLength"));
    public static VarHandle ByteLength$VH() {
        return _PERF_COUNTER_BLOCK.ByteLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ByteLength;
     * }
     */
    public static int ByteLength$get(MemorySegment seg) {
        return (int)_PERF_COUNTER_BLOCK.ByteLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ByteLength;
     * }
     */
    public static void ByteLength$set(MemorySegment seg, int x) {
        _PERF_COUNTER_BLOCK.ByteLength$VH.set(seg, x);
    }
    public static int ByteLength$get(MemorySegment seg, long index) {
        return (int)_PERF_COUNTER_BLOCK.ByteLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteLength$set(MemorySegment seg, long index, int x) {
        _PERF_COUNTER_BLOCK.ByteLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


