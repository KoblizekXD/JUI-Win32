// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ITypeLib {
 *     struct ITypeLibVtbl* lpVtbl;
 * };
 * }
 */
public class ITypeLib {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpVtbl")
    ).withName("ITypeLib");
    public static MemoryLayout $LAYOUT() {
        return ITypeLib.$struct$LAYOUT;
    }
    static final VarHandle lpVtbl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    public static VarHandle lpVtbl$VH() {
        return ITypeLib.lpVtbl$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct ITypeLibVtbl* lpVtbl;
     * }
     */
    public static MemorySegment lpVtbl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ITypeLib.lpVtbl$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct ITypeLibVtbl* lpVtbl;
     * }
     */
    public static void lpVtbl$set(MemorySegment seg, MemorySegment x) {
        ITypeLib.lpVtbl$VH.set(seg, x);
    }
    public static MemorySegment lpVtbl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ITypeLib.lpVtbl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVtbl$set(MemorySegment seg, long index, MemorySegment x) {
        ITypeLib.lpVtbl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


