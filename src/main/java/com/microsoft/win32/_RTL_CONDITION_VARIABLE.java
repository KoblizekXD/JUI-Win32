// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RTL_CONDITION_VARIABLE {
 *     PVOID Ptr;
 * };
 * }
 */
public class _RTL_CONDITION_VARIABLE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Ptr")
    ).withName("_RTL_CONDITION_VARIABLE");
    public static MemoryLayout $LAYOUT() {
        return _RTL_CONDITION_VARIABLE.$struct$LAYOUT;
    }
    static final VarHandle Ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Ptr"));
    public static VarHandle Ptr$VH() {
        return _RTL_CONDITION_VARIABLE.Ptr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID Ptr;
     * }
     */
    public static MemorySegment Ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RTL_CONDITION_VARIABLE.Ptr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID Ptr;
     * }
     */
    public static void Ptr$set(MemorySegment seg, MemorySegment x) {
        _RTL_CONDITION_VARIABLE.Ptr$VH.set(seg, x);
    }
    public static MemorySegment Ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RTL_CONDITION_VARIABLE.Ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ptr$set(MemorySegment seg, long index, MemorySegment x) {
        _RTL_CONDITION_VARIABLE.Ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


