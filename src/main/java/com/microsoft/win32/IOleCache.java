// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct IOleCache {
 *     struct IOleCacheVtbl* lpVtbl;
 * };
 * }
 */
public class IOleCache {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpVtbl")
    ).withName("IOleCache");
    public static MemoryLayout $LAYOUT() {
        return IOleCache.$struct$LAYOUT;
    }
    static final VarHandle lpVtbl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    public static VarHandle lpVtbl$VH() {
        return IOleCache.lpVtbl$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct IOleCacheVtbl* lpVtbl;
     * }
     */
    public static MemorySegment lpVtbl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)IOleCache.lpVtbl$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct IOleCacheVtbl* lpVtbl;
     * }
     */
    public static void lpVtbl$set(MemorySegment seg, MemorySegment x) {
        IOleCache.lpVtbl$VH.set(seg, x);
    }
    public static MemorySegment lpVtbl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)IOleCache.lpVtbl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVtbl$set(MemorySegment seg, long index, MemorySegment x) {
        IOleCache.lpVtbl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


