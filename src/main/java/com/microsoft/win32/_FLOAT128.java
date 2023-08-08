// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FLOAT128 {
 *     long long LowPart;
 *     long long HighPart;
 * };
 * }
 */
public class _FLOAT128 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("LowPart"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("HighPart")
    ).withName("_FLOAT128");
    public static MemoryLayout $LAYOUT() {
        return _FLOAT128.$struct$LAYOUT;
    }
    static final VarHandle LowPart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowPart"));
    public static VarHandle LowPart$VH() {
        return _FLOAT128.LowPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long LowPart;
     * }
     */
    public static long LowPart$get(MemorySegment seg) {
        return (long)_FLOAT128.LowPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long LowPart;
     * }
     */
    public static void LowPart$set(MemorySegment seg, long x) {
        _FLOAT128.LowPart$VH.set(seg, x);
    }
    public static long LowPart$get(MemorySegment seg, long index) {
        return (long)_FLOAT128.LowPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowPart$set(MemorySegment seg, long index, long x) {
        _FLOAT128.LowPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighPart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighPart"));
    public static VarHandle HighPart$VH() {
        return _FLOAT128.HighPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long HighPart;
     * }
     */
    public static long HighPart$get(MemorySegment seg) {
        return (long)_FLOAT128.HighPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long HighPart;
     * }
     */
    public static void HighPart$set(MemorySegment seg, long x) {
        _FLOAT128.HighPart$VH.set(seg, x);
    }
    public static long HighPart$get(MemorySegment seg, long index) {
        return (long)_FLOAT128.HighPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighPart$set(MemorySegment seg, long index, long x) {
        _FLOAT128.HighPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


