// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _QUOTA_LIMITS {
 *     SIZE_T PagedPoolLimit;
 *     SIZE_T NonPagedPoolLimit;
 *     SIZE_T MinimumWorkingSetSize;
 *     SIZE_T MaximumWorkingSetSize;
 *     SIZE_T PagefileLimit;
 *     LARGE_INTEGER TimeLimit;
 * };
 * }
 */
public class _QUOTA_LIMITS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("PagedPoolLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("NonPagedPoolLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MinimumWorkingSetSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaximumWorkingSetSize"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PagefileLimit"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("TimeLimit")
    ).withName("_QUOTA_LIMITS");
    public static MemoryLayout $LAYOUT() {
        return _QUOTA_LIMITS.$struct$LAYOUT;
    }
    static final VarHandle PagedPoolLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagedPoolLimit"));
    public static VarHandle PagedPoolLimit$VH() {
        return _QUOTA_LIMITS.PagedPoolLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T PagedPoolLimit;
     * }
     */
    public static long PagedPoolLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS.PagedPoolLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T PagedPoolLimit;
     * }
     */
    public static void PagedPoolLimit$set(MemorySegment seg, long x) {
        _QUOTA_LIMITS.PagedPoolLimit$VH.set(seg, x);
    }
    public static long PagedPoolLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS.PagedPoolLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagedPoolLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS.PagedPoolLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonPagedPoolLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NonPagedPoolLimit"));
    public static VarHandle NonPagedPoolLimit$VH() {
        return _QUOTA_LIMITS.NonPagedPoolLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T NonPagedPoolLimit;
     * }
     */
    public static long NonPagedPoolLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS.NonPagedPoolLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T NonPagedPoolLimit;
     * }
     */
    public static void NonPagedPoolLimit$set(MemorySegment seg, long x) {
        _QUOTA_LIMITS.NonPagedPoolLimit$VH.set(seg, x);
    }
    public static long NonPagedPoolLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS.NonPagedPoolLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonPagedPoolLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS.NonPagedPoolLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinimumWorkingSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinimumWorkingSetSize"));
    public static VarHandle MinimumWorkingSetSize$VH() {
        return _QUOTA_LIMITS.MinimumWorkingSetSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T MinimumWorkingSetSize;
     * }
     */
    public static long MinimumWorkingSetSize$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS.MinimumWorkingSetSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T MinimumWorkingSetSize;
     * }
     */
    public static void MinimumWorkingSetSize$set(MemorySegment seg, long x) {
        _QUOTA_LIMITS.MinimumWorkingSetSize$VH.set(seg, x);
    }
    public static long MinimumWorkingSetSize$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS.MinimumWorkingSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinimumWorkingSetSize$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS.MinimumWorkingSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaximumWorkingSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumWorkingSetSize"));
    public static VarHandle MaximumWorkingSetSize$VH() {
        return _QUOTA_LIMITS.MaximumWorkingSetSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T MaximumWorkingSetSize;
     * }
     */
    public static long MaximumWorkingSetSize$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS.MaximumWorkingSetSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T MaximumWorkingSetSize;
     * }
     */
    public static void MaximumWorkingSetSize$set(MemorySegment seg, long x) {
        _QUOTA_LIMITS.MaximumWorkingSetSize$VH.set(seg, x);
    }
    public static long MaximumWorkingSetSize$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS.MaximumWorkingSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumWorkingSetSize$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS.MaximumWorkingSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PagefileLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagefileLimit"));
    public static VarHandle PagefileLimit$VH() {
        return _QUOTA_LIMITS.PagefileLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T PagefileLimit;
     * }
     */
    public static long PagefileLimit$get(MemorySegment seg) {
        return (long)_QUOTA_LIMITS.PagefileLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T PagefileLimit;
     * }
     */
    public static void PagefileLimit$set(MemorySegment seg, long x) {
        _QUOTA_LIMITS.PagefileLimit$VH.set(seg, x);
    }
    public static long PagefileLimit$get(MemorySegment seg, long index) {
        return (long)_QUOTA_LIMITS.PagefileLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagefileLimit$set(MemorySegment seg, long index, long x) {
        _QUOTA_LIMITS.PagefileLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TimeLimit$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

