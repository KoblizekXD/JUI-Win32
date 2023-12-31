// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _APP_MEMORY_INFORMATION {
 *     ULONG64 AvailableCommit;
 *     ULONG64 PrivateCommitUsage;
 *     ULONG64 PeakPrivateCommitUsage;
 *     ULONG64 TotalCommitUsage;
 * };
 * }
 */
public class _APP_MEMORY_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("AvailableCommit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PrivateCommitUsage"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PeakPrivateCommitUsage"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalCommitUsage")
    ).withName("_APP_MEMORY_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _APP_MEMORY_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle AvailableCommit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AvailableCommit"));
    public static VarHandle AvailableCommit$VH() {
        return _APP_MEMORY_INFORMATION.AvailableCommit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 AvailableCommit;
     * }
     */
    public static long AvailableCommit$get(MemorySegment seg) {
        return (long)_APP_MEMORY_INFORMATION.AvailableCommit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 AvailableCommit;
     * }
     */
    public static void AvailableCommit$set(MemorySegment seg, long x) {
        _APP_MEMORY_INFORMATION.AvailableCommit$VH.set(seg, x);
    }
    public static long AvailableCommit$get(MemorySegment seg, long index) {
        return (long)_APP_MEMORY_INFORMATION.AvailableCommit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AvailableCommit$set(MemorySegment seg, long index, long x) {
        _APP_MEMORY_INFORMATION.AvailableCommit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PrivateCommitUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrivateCommitUsage"));
    public static VarHandle PrivateCommitUsage$VH() {
        return _APP_MEMORY_INFORMATION.PrivateCommitUsage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 PrivateCommitUsage;
     * }
     */
    public static long PrivateCommitUsage$get(MemorySegment seg) {
        return (long)_APP_MEMORY_INFORMATION.PrivateCommitUsage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 PrivateCommitUsage;
     * }
     */
    public static void PrivateCommitUsage$set(MemorySegment seg, long x) {
        _APP_MEMORY_INFORMATION.PrivateCommitUsage$VH.set(seg, x);
    }
    public static long PrivateCommitUsage$get(MemorySegment seg, long index) {
        return (long)_APP_MEMORY_INFORMATION.PrivateCommitUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrivateCommitUsage$set(MemorySegment seg, long index, long x) {
        _APP_MEMORY_INFORMATION.PrivateCommitUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PeakPrivateCommitUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PeakPrivateCommitUsage"));
    public static VarHandle PeakPrivateCommitUsage$VH() {
        return _APP_MEMORY_INFORMATION.PeakPrivateCommitUsage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 PeakPrivateCommitUsage;
     * }
     */
    public static long PeakPrivateCommitUsage$get(MemorySegment seg) {
        return (long)_APP_MEMORY_INFORMATION.PeakPrivateCommitUsage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 PeakPrivateCommitUsage;
     * }
     */
    public static void PeakPrivateCommitUsage$set(MemorySegment seg, long x) {
        _APP_MEMORY_INFORMATION.PeakPrivateCommitUsage$VH.set(seg, x);
    }
    public static long PeakPrivateCommitUsage$get(MemorySegment seg, long index) {
        return (long)_APP_MEMORY_INFORMATION.PeakPrivateCommitUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PeakPrivateCommitUsage$set(MemorySegment seg, long index, long x) {
        _APP_MEMORY_INFORMATION.PeakPrivateCommitUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalCommitUsage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalCommitUsage"));
    public static VarHandle TotalCommitUsage$VH() {
        return _APP_MEMORY_INFORMATION.TotalCommitUsage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 TotalCommitUsage;
     * }
     */
    public static long TotalCommitUsage$get(MemorySegment seg) {
        return (long)_APP_MEMORY_INFORMATION.TotalCommitUsage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 TotalCommitUsage;
     * }
     */
    public static void TotalCommitUsage$set(MemorySegment seg, long x) {
        _APP_MEMORY_INFORMATION.TotalCommitUsage$VH.set(seg, x);
    }
    public static long TotalCommitUsage$get(MemorySegment seg, long index) {
        return (long)_APP_MEMORY_INFORMATION.TotalCommitUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalCommitUsage$set(MemorySegment seg, long index, long x) {
        _APP_MEMORY_INFORMATION.TotalCommitUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


