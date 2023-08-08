// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _HARDWARE_COUNTER_DATA {
 *     HARDWARE_COUNTER_TYPE Type;
 *     DWORD Reserved;
 *     DWORD64 Value;
 * };
 * }
 */
public class _HARDWARE_COUNTER_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
    ).withName("_HARDWARE_COUNTER_DATA");
    public static MemoryLayout $LAYOUT() {
        return _HARDWARE_COUNTER_DATA.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _HARDWARE_COUNTER_DATA.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HARDWARE_COUNTER_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)_HARDWARE_COUNTER_DATA.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HARDWARE_COUNTER_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        _HARDWARE_COUNTER_DATA.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_HARDWARE_COUNTER_DATA.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _HARDWARE_COUNTER_DATA.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _HARDWARE_COUNTER_DATA.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_HARDWARE_COUNTER_DATA.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _HARDWARE_COUNTER_DATA.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_HARDWARE_COUNTER_DATA.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _HARDWARE_COUNTER_DATA.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return _HARDWARE_COUNTER_DATA.Value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Value;
     * }
     */
    public static long Value$get(MemorySegment seg) {
        return (long)_HARDWARE_COUNTER_DATA.Value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Value;
     * }
     */
    public static void Value$set(MemorySegment seg, long x) {
        _HARDWARE_COUNTER_DATA.Value$VH.set(seg, x);
    }
    public static long Value$get(MemorySegment seg, long index) {
        return (long)_HARDWARE_COUNTER_DATA.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, long x) {
        _HARDWARE_COUNTER_DATA.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


