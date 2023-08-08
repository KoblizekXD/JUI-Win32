// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MARK_HANDLE_INFO {
 *     union {
 *         DWORD UsnSourceInfo;
 *         DWORD CopyNumber;
 *     };
 *     HANDLE VolumeHandle;
 *     DWORD HandleInfo;
 * };
 * }
 */
public class _MARK_HANDLE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("UsnSourceInfo"),
            Constants$root.C_LONG$LAYOUT.withName("CopyNumber")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("VolumeHandle"),
        Constants$root.C_LONG$LAYOUT.withName("HandleInfo"),
        MemoryLayout.paddingLayout(32)
    ).withName("_MARK_HANDLE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _MARK_HANDLE_INFO.$struct$LAYOUT;
    }
    static final VarHandle UsnSourceInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UsnSourceInfo"));
    public static VarHandle UsnSourceInfo$VH() {
        return _MARK_HANDLE_INFO.UsnSourceInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UsnSourceInfo;
     * }
     */
    public static int UsnSourceInfo$get(MemorySegment seg) {
        return (int)_MARK_HANDLE_INFO.UsnSourceInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UsnSourceInfo;
     * }
     */
    public static void UsnSourceInfo$set(MemorySegment seg, int x) {
        _MARK_HANDLE_INFO.UsnSourceInfo$VH.set(seg, x);
    }
    public static int UsnSourceInfo$get(MemorySegment seg, long index) {
        return (int)_MARK_HANDLE_INFO.UsnSourceInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnSourceInfo$set(MemorySegment seg, long index, int x) {
        _MARK_HANDLE_INFO.UsnSourceInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CopyNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("CopyNumber"));
    public static VarHandle CopyNumber$VH() {
        return _MARK_HANDLE_INFO.CopyNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CopyNumber;
     * }
     */
    public static int CopyNumber$get(MemorySegment seg) {
        return (int)_MARK_HANDLE_INFO.CopyNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CopyNumber;
     * }
     */
    public static void CopyNumber$set(MemorySegment seg, int x) {
        _MARK_HANDLE_INFO.CopyNumber$VH.set(seg, x);
    }
    public static int CopyNumber$get(MemorySegment seg, long index) {
        return (int)_MARK_HANDLE_INFO.CopyNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CopyNumber$set(MemorySegment seg, long index, int x) {
        _MARK_HANDLE_INFO.CopyNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VolumeHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VolumeHandle"));
    public static VarHandle VolumeHandle$VH() {
        return _MARK_HANDLE_INFO.VolumeHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE VolumeHandle;
     * }
     */
    public static MemorySegment VolumeHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MARK_HANDLE_INFO.VolumeHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE VolumeHandle;
     * }
     */
    public static void VolumeHandle$set(MemorySegment seg, MemorySegment x) {
        _MARK_HANDLE_INFO.VolumeHandle$VH.set(seg, x);
    }
    public static MemorySegment VolumeHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MARK_HANDLE_INFO.VolumeHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeHandle$set(MemorySegment seg, long index, MemorySegment x) {
        _MARK_HANDLE_INFO.VolumeHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HandleInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HandleInfo"));
    public static VarHandle HandleInfo$VH() {
        return _MARK_HANDLE_INFO.HandleInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD HandleInfo;
     * }
     */
    public static int HandleInfo$get(MemorySegment seg) {
        return (int)_MARK_HANDLE_INFO.HandleInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD HandleInfo;
     * }
     */
    public static void HandleInfo$set(MemorySegment seg, int x) {
        _MARK_HANDLE_INFO.HandleInfo$VH.set(seg, x);
    }
    public static int HandleInfo$get(MemorySegment seg, long index) {
        return (int)_MARK_HANDLE_INFO.HandleInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleInfo$set(MemorySegment seg, long index, int x) {
        _MARK_HANDLE_INFO.HandleInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

