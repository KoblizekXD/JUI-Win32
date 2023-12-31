// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MEMORY_PRIORITY_INFORMATION {
 *     ULONG MemoryPriority;
 * };
 * }
 */
public class _MEMORY_PRIORITY_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MemoryPriority")
    ).withName("_MEMORY_PRIORITY_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _MEMORY_PRIORITY_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle MemoryPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MemoryPriority"));
    public static VarHandle MemoryPriority$VH() {
        return _MEMORY_PRIORITY_INFORMATION.MemoryPriority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG MemoryPriority;
     * }
     */
    public static int MemoryPriority$get(MemorySegment seg) {
        return (int)_MEMORY_PRIORITY_INFORMATION.MemoryPriority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG MemoryPriority;
     * }
     */
    public static void MemoryPriority$set(MemorySegment seg, int x) {
        _MEMORY_PRIORITY_INFORMATION.MemoryPriority$VH.set(seg, x);
    }
    public static int MemoryPriority$get(MemorySegment seg, long index) {
        return (int)_MEMORY_PRIORITY_INFORMATION.MemoryPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MemoryPriority$set(MemorySegment seg, long index, int x) {
        _MEMORY_PRIORITY_INFORMATION.MemoryPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


