// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TOKEN_PRIMARY_GROUP {
 *     PSID PrimaryGroup;
 * };
 * }
 */
public class _TOKEN_PRIMARY_GROUP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("PrimaryGroup")
    ).withName("_TOKEN_PRIMARY_GROUP");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_PRIMARY_GROUP.$struct$LAYOUT;
    }
    static final VarHandle PrimaryGroup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrimaryGroup"));
    public static VarHandle PrimaryGroup$VH() {
        return _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID PrimaryGroup;
     * }
     */
    public static MemorySegment PrimaryGroup$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID PrimaryGroup;
     * }
     */
    public static void PrimaryGroup$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.set(seg, x);
    }
    public static MemorySegment PrimaryGroup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrimaryGroup$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

