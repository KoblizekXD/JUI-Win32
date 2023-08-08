// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ASYNC_DUPLICATE_EXTENTS_STATUS {
 *     DWORD Version;
 *     DUPLICATE_EXTENTS_STATE State;
 *     DWORDLONG SourceFileOffset;
 *     DWORDLONG TargetFileOffset;
 *     DWORDLONG ByteCount;
 *     DWORDLONG BytesDuplicated;
 * };
 * }
 */
public class _ASYNC_DUPLICATE_EXTENTS_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("State"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("SourceFileOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TargetFileOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ByteCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("BytesDuplicated")
    ).withName("_ASYNC_DUPLICATE_EXTENTS_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_ASYNC_DUPLICATE_EXTENTS_STATUS.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_ASYNC_DUPLICATE_EXTENTS_STATUS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("State"));
    public static VarHandle State$VH() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.State$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DUPLICATE_EXTENTS_STATE State;
     * }
     */
    public static int State$get(MemorySegment seg) {
        return (int)_ASYNC_DUPLICATE_EXTENTS_STATUS.State$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DUPLICATE_EXTENTS_STATE State;
     * }
     */
    public static void State$set(MemorySegment seg, int x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.State$VH.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)_ASYNC_DUPLICATE_EXTENTS_STATUS.State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SourceFileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceFileOffset"));
    public static VarHandle SourceFileOffset$VH() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.SourceFileOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG SourceFileOffset;
     * }
     */
    public static long SourceFileOffset$get(MemorySegment seg) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.SourceFileOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG SourceFileOffset;
     * }
     */
    public static void SourceFileOffset$set(MemorySegment seg, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.SourceFileOffset$VH.set(seg, x);
    }
    public static long SourceFileOffset$get(MemorySegment seg, long index) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.SourceFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceFileOffset$set(MemorySegment seg, long index, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.SourceFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetFileOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetFileOffset"));
    public static VarHandle TargetFileOffset$VH() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.TargetFileOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG TargetFileOffset;
     * }
     */
    public static long TargetFileOffset$get(MemorySegment seg) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.TargetFileOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG TargetFileOffset;
     * }
     */
    public static void TargetFileOffset$set(MemorySegment seg, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.TargetFileOffset$VH.set(seg, x);
    }
    public static long TargetFileOffset$get(MemorySegment seg, long index) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.TargetFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetFileOffset$set(MemorySegment seg, long index, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.TargetFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ByteCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteCount"));
    public static VarHandle ByteCount$VH() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.ByteCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ByteCount;
     * }
     */
    public static long ByteCount$get(MemorySegment seg) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.ByteCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ByteCount;
     * }
     */
    public static void ByteCount$set(MemorySegment seg, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.ByteCount$VH.set(seg, x);
    }
    public static long ByteCount$get(MemorySegment seg, long index) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.ByteCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteCount$set(MemorySegment seg, long index, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.ByteCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BytesDuplicated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BytesDuplicated"));
    public static VarHandle BytesDuplicated$VH() {
        return _ASYNC_DUPLICATE_EXTENTS_STATUS.BytesDuplicated$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BytesDuplicated;
     * }
     */
    public static long BytesDuplicated$get(MemorySegment seg) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.BytesDuplicated$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BytesDuplicated;
     * }
     */
    public static void BytesDuplicated$set(MemorySegment seg, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.BytesDuplicated$VH.set(seg, x);
    }
    public static long BytesDuplicated$get(MemorySegment seg, long index) {
        return (long)_ASYNC_DUPLICATE_EXTENTS_STATUS.BytesDuplicated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesDuplicated$set(MemorySegment seg, long index, long x) {
        _ASYNC_DUPLICATE_EXTENTS_STATUS.BytesDuplicated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

