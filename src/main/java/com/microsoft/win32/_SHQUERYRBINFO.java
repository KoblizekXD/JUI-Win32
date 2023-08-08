// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHQUERYRBINFO {
 *     DWORD cbSize;
 *     long long i64Size;
 *     long long i64NumItems;
 * };
 * }
 */
public class _SHQUERYRBINFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("i64Size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("i64NumItems")
    ).withName("_SHQUERYRBINFO");
    public static MemoryLayout $LAYOUT() {
        return _SHQUERYRBINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SHQUERYRBINFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SHQUERYRBINFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _SHQUERYRBINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SHQUERYRBINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SHQUERYRBINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle i64Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("i64Size"));
    public static VarHandle i64Size$VH() {
        return _SHQUERYRBINFO.i64Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long i64Size;
     * }
     */
    public static long i64Size$get(MemorySegment seg) {
        return (long)_SHQUERYRBINFO.i64Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long i64Size;
     * }
     */
    public static void i64Size$set(MemorySegment seg, long x) {
        _SHQUERYRBINFO.i64Size$VH.set(seg, x);
    }
    public static long i64Size$get(MemorySegment seg, long index) {
        return (long)_SHQUERYRBINFO.i64Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void i64Size$set(MemorySegment seg, long index, long x) {
        _SHQUERYRBINFO.i64Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle i64NumItems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("i64NumItems"));
    public static VarHandle i64NumItems$VH() {
        return _SHQUERYRBINFO.i64NumItems$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * long long i64NumItems;
     * }
     */
    public static long i64NumItems$get(MemorySegment seg) {
        return (long)_SHQUERYRBINFO.i64NumItems$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * long long i64NumItems;
     * }
     */
    public static void i64NumItems$set(MemorySegment seg, long x) {
        _SHQUERYRBINFO.i64NumItems$VH.set(seg, x);
    }
    public static long i64NumItems$get(MemorySegment seg, long index) {
        return (long)_SHQUERYRBINFO.i64NumItems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void i64NumItems$set(MemorySegment seg, long index, long x) {
        _SHQUERYRBINFO.i64NumItems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


