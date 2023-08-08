// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _REARRANGE_FILE_DATA {
 *     ULONGLONG SourceStartingOffset;
 *     ULONGLONG TargetOffset;
 *     HANDLE SourceFileHandle;
 *     DWORD Length;
 *     DWORD Flags;
 * };
 * }
 */
public class _REARRANGE_FILE_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("SourceStartingOffset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("TargetOffset"),
        Constants$root.C_POINTER$LAYOUT.withName("SourceFileHandle"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("Flags")
    ).withName("_REARRANGE_FILE_DATA");
    public static MemoryLayout $LAYOUT() {
        return _REARRANGE_FILE_DATA.$struct$LAYOUT;
    }
    static final VarHandle SourceStartingOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceStartingOffset"));
    public static VarHandle SourceStartingOffset$VH() {
        return _REARRANGE_FILE_DATA.SourceStartingOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG SourceStartingOffset;
     * }
     */
    public static long SourceStartingOffset$get(MemorySegment seg) {
        return (long)_REARRANGE_FILE_DATA.SourceStartingOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG SourceStartingOffset;
     * }
     */
    public static void SourceStartingOffset$set(MemorySegment seg, long x) {
        _REARRANGE_FILE_DATA.SourceStartingOffset$VH.set(seg, x);
    }
    public static long SourceStartingOffset$get(MemorySegment seg, long index) {
        return (long)_REARRANGE_FILE_DATA.SourceStartingOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceStartingOffset$set(MemorySegment seg, long index, long x) {
        _REARRANGE_FILE_DATA.SourceStartingOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetOffset"));
    public static VarHandle TargetOffset$VH() {
        return _REARRANGE_FILE_DATA.TargetOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TargetOffset;
     * }
     */
    public static long TargetOffset$get(MemorySegment seg) {
        return (long)_REARRANGE_FILE_DATA.TargetOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TargetOffset;
     * }
     */
    public static void TargetOffset$set(MemorySegment seg, long x) {
        _REARRANGE_FILE_DATA.TargetOffset$VH.set(seg, x);
    }
    public static long TargetOffset$get(MemorySegment seg, long index) {
        return (long)_REARRANGE_FILE_DATA.TargetOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetOffset$set(MemorySegment seg, long index, long x) {
        _REARRANGE_FILE_DATA.TargetOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SourceFileHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SourceFileHandle"));
    public static VarHandle SourceFileHandle$VH() {
        return _REARRANGE_FILE_DATA.SourceFileHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE SourceFileHandle;
     * }
     */
    public static MemorySegment SourceFileHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REARRANGE_FILE_DATA.SourceFileHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE SourceFileHandle;
     * }
     */
    public static void SourceFileHandle$set(MemorySegment seg, MemorySegment x) {
        _REARRANGE_FILE_DATA.SourceFileHandle$VH.set(seg, x);
    }
    public static MemorySegment SourceFileHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REARRANGE_FILE_DATA.SourceFileHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceFileHandle$set(MemorySegment seg, long index, MemorySegment x) {
        _REARRANGE_FILE_DATA.SourceFileHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _REARRANGE_FILE_DATA.Length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static int Length$get(MemorySegment seg) {
        return (int)_REARRANGE_FILE_DATA.Length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static void Length$set(MemorySegment seg, int x) {
        _REARRANGE_FILE_DATA.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_REARRANGE_FILE_DATA.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _REARRANGE_FILE_DATA.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _REARRANGE_FILE_DATA.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_REARRANGE_FILE_DATA.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _REARRANGE_FILE_DATA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_REARRANGE_FILE_DATA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _REARRANGE_FILE_DATA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

