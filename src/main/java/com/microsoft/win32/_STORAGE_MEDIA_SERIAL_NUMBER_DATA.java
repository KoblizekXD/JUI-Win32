// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_MEDIA_SERIAL_NUMBER_DATA {
 *     WORD Reserved;
 *     WORD SerialNumberLength;
 *     BYTE SerialNumber[0];
 * };
 * }
 */
public class _STORAGE_MEDIA_SERIAL_NUMBER_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
        Constants$root.C_SHORT$LAYOUT.withName("SerialNumberLength"),
        MemoryLayout.sequenceLayout(0, Constants$root.C_CHAR$LAYOUT).withName("SerialNumber")
    ).withName("_STORAGE_MEDIA_SERIAL_NUMBER_DATA");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_MEDIA_SERIAL_NUMBER_DATA.$struct$LAYOUT;
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _STORAGE_MEDIA_SERIAL_NUMBER_DATA.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static short Reserved$get(MemorySegment seg) {
        return (short)_STORAGE_MEDIA_SERIAL_NUMBER_DATA.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, short x) {
        _STORAGE_MEDIA_SERIAL_NUMBER_DATA.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_STORAGE_MEDIA_SERIAL_NUMBER_DATA.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _STORAGE_MEDIA_SERIAL_NUMBER_DATA.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SerialNumberLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SerialNumberLength"));
    public static VarHandle SerialNumberLength$VH() {
        return _STORAGE_MEDIA_SERIAL_NUMBER_DATA.SerialNumberLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD SerialNumberLength;
     * }
     */
    public static short SerialNumberLength$get(MemorySegment seg) {
        return (short)_STORAGE_MEDIA_SERIAL_NUMBER_DATA.SerialNumberLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD SerialNumberLength;
     * }
     */
    public static void SerialNumberLength$set(MemorySegment seg, short x) {
        _STORAGE_MEDIA_SERIAL_NUMBER_DATA.SerialNumberLength$VH.set(seg, x);
    }
    public static short SerialNumberLength$get(MemorySegment seg, long index) {
        return (short)_STORAGE_MEDIA_SERIAL_NUMBER_DATA.SerialNumberLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SerialNumberLength$set(MemorySegment seg, long index, short x) {
        _STORAGE_MEDIA_SERIAL_NUMBER_DATA.SerialNumberLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


