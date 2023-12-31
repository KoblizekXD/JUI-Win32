// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_DATA_SET_SCRUB_OUTPUT {
 *     DWORDLONG BytesProcessed;
 *     DWORDLONG BytesRepaired;
 *     DWORDLONG BytesFailed;
 * };
 * }
 */
public class _DEVICE_DATA_SET_SCRUB_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("BytesProcessed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("BytesRepaired"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("BytesFailed")
    ).withName("_DEVICE_DATA_SET_SCRUB_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DATA_SET_SCRUB_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle BytesProcessed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesProcessed"));
    public static VarHandle BytesProcessed$VH() {
        return _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesProcessed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BytesProcessed;
     * }
     */
    public static long BytesProcessed$get(MemorySegment seg) {
        return (long)_DEVICE_DATA_SET_SCRUB_OUTPUT.BytesProcessed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BytesProcessed;
     * }
     */
    public static void BytesProcessed$set(MemorySegment seg, long x) {
        _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesProcessed$VH.set(seg, x);
    }
    public static long BytesProcessed$get(MemorySegment seg, long index) {
        return (long)_DEVICE_DATA_SET_SCRUB_OUTPUT.BytesProcessed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesProcessed$set(MemorySegment seg, long index, long x) {
        _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesProcessed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BytesRepaired$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesRepaired"));
    public static VarHandle BytesRepaired$VH() {
        return _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesRepaired$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BytesRepaired;
     * }
     */
    public static long BytesRepaired$get(MemorySegment seg) {
        return (long)_DEVICE_DATA_SET_SCRUB_OUTPUT.BytesRepaired$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BytesRepaired;
     * }
     */
    public static void BytesRepaired$set(MemorySegment seg, long x) {
        _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesRepaired$VH.set(seg, x);
    }
    public static long BytesRepaired$get(MemorySegment seg, long index) {
        return (long)_DEVICE_DATA_SET_SCRUB_OUTPUT.BytesRepaired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesRepaired$set(MemorySegment seg, long index, long x) {
        _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesRepaired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BytesFailed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesFailed"));
    public static VarHandle BytesFailed$VH() {
        return _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesFailed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BytesFailed;
     * }
     */
    public static long BytesFailed$get(MemorySegment seg) {
        return (long)_DEVICE_DATA_SET_SCRUB_OUTPUT.BytesFailed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BytesFailed;
     * }
     */
    public static void BytesFailed$set(MemorySegment seg, long x) {
        _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesFailed$VH.set(seg, x);
    }
    public static long BytesFailed$get(MemorySegment seg, long index) {
        return (long)_DEVICE_DATA_SET_SCRUB_OUTPUT.BytesFailed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesFailed$set(MemorySegment seg, long index, long x) {
        _DEVICE_DATA_SET_SCRUB_OUTPUT.BytesFailed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


