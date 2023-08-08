// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DPI_AWARENESS_CONTEXT__ {
 *     int unused;
 * };
 * }
 */
public class DPI_AWARENESS_CONTEXT__ {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("unused")
    ).withName("DPI_AWARENESS_CONTEXT__");
    public static MemoryLayout $LAYOUT() {
        return DPI_AWARENESS_CONTEXT__.$struct$LAYOUT;
    }
    static final VarHandle unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    public static VarHandle unused$VH() {
        return DPI_AWARENESS_CONTEXT__.unused$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int unused;
     * }
     */
    public static int unused$get(MemorySegment seg) {
        return (int)DPI_AWARENESS_CONTEXT__.unused$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int unused;
     * }
     */
    public static void unused$set(MemorySegment seg, int x) {
        DPI_AWARENESS_CONTEXT__.unused$VH.set(seg, x);
    }
    public static int unused$get(MemorySegment seg, long index) {
        return (int)DPI_AWARENESS_CONTEXT__.unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unused$set(MemorySegment seg, long index, int x) {
        DPI_AWARENESS_CONTEXT__.unused$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


