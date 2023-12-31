// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_STORAGE_RANGE_ATTRIBUTES {
 *     DWORDLONG LengthInBytes;
 *     union {
 *         DWORD AllFlags;
 *         struct {
 *              *             DWORD IsRangeBad;
 *         };
 *     };
 *     DWORD Reserved;
 * };
 * }
 */
public class _DEVICE_STORAGE_RANGE_ATTRIBUTES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("LengthInBytes"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("AllFlags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_DEVICE_STORAGE_RANGE_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_STORAGE_RANGE_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle LengthInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LengthInBytes"));
    public static VarHandle LengthInBytes$VH() {
        return _DEVICE_STORAGE_RANGE_ATTRIBUTES.LengthInBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG LengthInBytes;
     * }
     */
    public static long LengthInBytes$get(MemorySegment seg) {
        return (long)_DEVICE_STORAGE_RANGE_ATTRIBUTES.LengthInBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG LengthInBytes;
     * }
     */
    public static void LengthInBytes$set(MemorySegment seg, long x) {
        _DEVICE_STORAGE_RANGE_ATTRIBUTES.LengthInBytes$VH.set(seg, x);
    }
    public static long LengthInBytes$get(MemorySegment seg, long index) {
        return (long)_DEVICE_STORAGE_RANGE_ATTRIBUTES.LengthInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LengthInBytes$set(MemorySegment seg, long index, long x) {
        _DEVICE_STORAGE_RANGE_ATTRIBUTES.LengthInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("AllFlags"));
    public static VarHandle AllFlags$VH() {
        return _DEVICE_STORAGE_RANGE_ATTRIBUTES.AllFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AllFlags;
     * }
     */
    public static int AllFlags$get(MemorySegment seg) {
        return (int)_DEVICE_STORAGE_RANGE_ATTRIBUTES.AllFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AllFlags;
     * }
     */
    public static void AllFlags$set(MemorySegment seg, int x) {
        _DEVICE_STORAGE_RANGE_ATTRIBUTES.AllFlags$VH.set(seg, x);
    }
    public static int AllFlags$get(MemorySegment seg, long index) {
        return (int)_DEVICE_STORAGE_RANGE_ATTRIBUTES.AllFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllFlags$set(MemorySegment seg, long index, int x) {
        _DEVICE_STORAGE_RANGE_ATTRIBUTES.AllFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _DEVICE_STORAGE_RANGE_ATTRIBUTES.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_DEVICE_STORAGE_RANGE_ATTRIBUTES.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _DEVICE_STORAGE_RANGE_ATTRIBUTES.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_DEVICE_STORAGE_RANGE_ATTRIBUTES.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _DEVICE_STORAGE_RANGE_ATTRIBUTES.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


