// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_DEBUG_MISC {
 *     DWORD DataType;
 *     DWORD Length;
 *     BOOLEAN Unicode;
 *     BYTE Reserved[3];
 *     BYTE Data[1];
 * };
 * }
 */
public class _IMAGE_DEBUG_MISC {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DataType"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_CHAR$LAYOUT.withName("Unicode"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    ).withName("_IMAGE_DEBUG_MISC");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_DEBUG_MISC.$struct$LAYOUT;
    }
    static final VarHandle DataType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataType"));
    public static VarHandle DataType$VH() {
        return _IMAGE_DEBUG_MISC.DataType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DataType;
     * }
     */
    public static int DataType$get(MemorySegment seg) {
        return (int)_IMAGE_DEBUG_MISC.DataType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DataType;
     * }
     */
    public static void DataType$set(MemorySegment seg, int x) {
        _IMAGE_DEBUG_MISC.DataType$VH.set(seg, x);
    }
    public static int DataType$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DEBUG_MISC.DataType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataType$set(MemorySegment seg, long index, int x) {
        _IMAGE_DEBUG_MISC.DataType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _IMAGE_DEBUG_MISC.Length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static int Length$get(MemorySegment seg) {
        return (int)_IMAGE_DEBUG_MISC.Length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static void Length$set(MemorySegment seg, int x) {
        _IMAGE_DEBUG_MISC.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_IMAGE_DEBUG_MISC.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _IMAGE_DEBUG_MISC.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unicode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unicode"));
    public static VarHandle Unicode$VH() {
        return _IMAGE_DEBUG_MISC.Unicode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN Unicode;
     * }
     */
    public static byte Unicode$get(MemorySegment seg) {
        return (byte)_IMAGE_DEBUG_MISC.Unicode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN Unicode;
     * }
     */
    public static void Unicode$set(MemorySegment seg, byte x) {
        _IMAGE_DEBUG_MISC.Unicode$VH.set(seg, x);
    }
    public static byte Unicode$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_DEBUG_MISC.Unicode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unicode$set(MemorySegment seg, long index, byte x) {
        _IMAGE_DEBUG_MISC.Unicode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(9, 3);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(12, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

