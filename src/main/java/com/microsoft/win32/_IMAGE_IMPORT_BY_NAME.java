// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_IMPORT_BY_NAME {
 *     WORD Hint;
 *     CHAR Name[1];
 * };
 * }
 */
public class _IMAGE_IMPORT_BY_NAME {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Hint"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Name"),
        MemoryLayout.paddingLayout(8)
    ).withName("_IMAGE_IMPORT_BY_NAME");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_IMPORT_BY_NAME.$struct$LAYOUT;
    }
    static final VarHandle Hint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hint"));
    public static VarHandle Hint$VH() {
        return _IMAGE_IMPORT_BY_NAME.Hint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Hint;
     * }
     */
    public static short Hint$get(MemorySegment seg) {
        return (short)_IMAGE_IMPORT_BY_NAME.Hint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Hint;
     * }
     */
    public static void Hint$set(MemorySegment seg, short x) {
        _IMAGE_IMPORT_BY_NAME.Hint$VH.set(seg, x);
    }
    public static short Hint$get(MemorySegment seg, long index) {
        return (short)_IMAGE_IMPORT_BY_NAME.Hint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hint$set(MemorySegment seg, long index, short x) {
        _IMAGE_IMPORT_BY_NAME.Hint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(2, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


