// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagRemBRUSH {
 *     ULONG cbData;
 *     byte data[1];
 * };
 * }
 */
public class tagRemBRUSH {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagRemBRUSH");
    public static MemoryLayout $LAYOUT() {
        return tagRemBRUSH.$struct$LAYOUT;
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagRemBRUSH.cbData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)tagRemBRUSH.cbData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        tagRemBRUSH.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagRemBRUSH.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagRemBRUSH.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(4, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


