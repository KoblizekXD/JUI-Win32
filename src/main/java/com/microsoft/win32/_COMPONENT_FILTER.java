// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _COMPONENT_FILTER {
 *     DWORD ComponentFlags;
 * };
 * }
 */
public class _COMPONENT_FILTER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ComponentFlags")
    ).withName("_COMPONENT_FILTER");
    public static MemoryLayout $LAYOUT() {
        return _COMPONENT_FILTER.$struct$LAYOUT;
    }
    static final VarHandle ComponentFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ComponentFlags"));
    public static VarHandle ComponentFlags$VH() {
        return _COMPONENT_FILTER.ComponentFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ComponentFlags;
     * }
     */
    public static int ComponentFlags$get(MemorySegment seg) {
        return (int)_COMPONENT_FILTER.ComponentFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ComponentFlags;
     * }
     */
    public static void ComponentFlags$set(MemorySegment seg, int x) {
        _COMPONENT_FILTER.ComponentFlags$VH.set(seg, x);
    }
    public static int ComponentFlags$get(MemorySegment seg, long index) {
        return (int)_COMPONENT_FILTER.ComponentFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ComponentFlags$set(MemorySegment seg, long index, int x) {
        _COMPONENT_FILTER.ComponentFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


