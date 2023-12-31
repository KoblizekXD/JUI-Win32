// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTION_BIND_INFORMATION {
 *     HANDLE TmHandle;
 * };
 * }
 */
public class _TRANSACTION_BIND_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("TmHandle")
    ).withName("_TRANSACTION_BIND_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_BIND_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle TmHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TmHandle"));
    public static VarHandle TmHandle$VH() {
        return _TRANSACTION_BIND_INFORMATION.TmHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE TmHandle;
     * }
     */
    public static MemorySegment TmHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TRANSACTION_BIND_INFORMATION.TmHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE TmHandle;
     * }
     */
    public static void TmHandle$set(MemorySegment seg, MemorySegment x) {
        _TRANSACTION_BIND_INFORMATION.TmHandle$VH.set(seg, x);
    }
    public static MemorySegment TmHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TRANSACTION_BIND_INFORMATION.TmHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TmHandle$set(MemorySegment seg, long index, MemorySegment x) {
        _TRANSACTION_BIND_INFORMATION.TmHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


