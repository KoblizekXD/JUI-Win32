// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DRIVER_INFO_1A {
 *     LPSTR pName;
 * };
 * }
 */
public class _DRIVER_INFO_1A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pName")
    ).withName("_DRIVER_INFO_1A");
    public static MemoryLayout $LAYOUT() {
        return _DRIVER_INFO_1A.$struct$LAYOUT;
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _DRIVER_INFO_1A.pName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pName;
     * }
     */
    public static MemorySegment pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_1A.pName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pName;
     * }
     */
    public static void pName$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_1A.pName$VH.set(seg, x);
    }
    public static MemorySegment pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_1A.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_1A.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


