// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_IO_ATTRIBUTION_STATS {
 *     ULONG_PTR IoCount;
 *     ULONGLONG TotalNonOverlappedQueueTime;
 *     ULONGLONG TotalNonOverlappedServiceTime;
 *     ULONGLONG TotalSize;
 * };
 * }
 */
public class _JOBOBJECT_IO_ATTRIBUTION_STATS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNonOverlappedQueueTime"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalNonOverlappedServiceTime"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalSize")
    ).withName("_JOBOBJECT_IO_ATTRIBUTION_STATS");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_IO_ATTRIBUTION_STATS.$struct$LAYOUT;
    }
    static final VarHandle IoCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoCount"));
    public static VarHandle IoCount$VH() {
        return _JOBOBJECT_IO_ATTRIBUTION_STATS.IoCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR IoCount;
     * }
     */
    public static long IoCount$get(MemorySegment seg) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.IoCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR IoCount;
     * }
     */
    public static void IoCount$set(MemorySegment seg, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.IoCount$VH.set(seg, x);
    }
    public static long IoCount$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.IoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoCount$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.IoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNonOverlappedQueueTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNonOverlappedQueueTime"));
    public static VarHandle TotalNonOverlappedQueueTime$VH() {
        return _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedQueueTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedQueueTime;
     * }
     */
    public static long TotalNonOverlappedQueueTime$get(MemorySegment seg) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedQueueTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedQueueTime;
     * }
     */
    public static void TotalNonOverlappedQueueTime$set(MemorySegment seg, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedQueueTime$VH.set(seg, x);
    }
    public static long TotalNonOverlappedQueueTime$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedQueueTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNonOverlappedQueueTime$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedQueueTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNonOverlappedServiceTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNonOverlappedServiceTime"));
    public static VarHandle TotalNonOverlappedServiceTime$VH() {
        return _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedServiceTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedServiceTime;
     * }
     */
    public static long TotalNonOverlappedServiceTime$get(MemorySegment seg) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedServiceTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNonOverlappedServiceTime;
     * }
     */
    public static void TotalNonOverlappedServiceTime$set(MemorySegment seg, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedServiceTime$VH.set(seg, x);
    }
    public static long TotalNonOverlappedServiceTime$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedServiceTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNonOverlappedServiceTime$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalNonOverlappedServiceTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalSize"));
    public static VarHandle TotalSize$VH() {
        return _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalSize;
     * }
     */
    public static long TotalSize$get(MemorySegment seg) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.TotalSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalSize;
     * }
     */
    public static void TotalSize$set(MemorySegment seg, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalSize$VH.set(seg, x);
    }
    public static long TotalSize$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_IO_ATTRIBUTION_STATS.TotalSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalSize$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_IO_ATTRIBUTION_STATS.TotalSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


