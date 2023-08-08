// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PREVENT_MEDIA_REMOVAL {
 *     BOOLEAN PreventMediaRemoval;
 * };
 * }
 */
public class _PREVENT_MEDIA_REMOVAL {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("PreventMediaRemoval")
    ).withName("_PREVENT_MEDIA_REMOVAL");
    public static MemoryLayout $LAYOUT() {
        return _PREVENT_MEDIA_REMOVAL.$struct$LAYOUT;
    }
    static final VarHandle PreventMediaRemoval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PreventMediaRemoval"));
    public static VarHandle PreventMediaRemoval$VH() {
        return _PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN PreventMediaRemoval;
     * }
     */
    public static byte PreventMediaRemoval$get(MemorySegment seg) {
        return (byte)_PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN PreventMediaRemoval;
     * }
     */
    public static void PreventMediaRemoval$set(MemorySegment seg, byte x) {
        _PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.set(seg, x);
    }
    public static byte PreventMediaRemoval$get(MemorySegment seg, long index) {
        return (byte)_PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreventMediaRemoval$set(MemorySegment seg, long index, byte x) {
        _PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


