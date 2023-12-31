// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_RPMB_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD SizeInBytes;
 *     DWORD MaxReliableWriteSizeInBytes;
 *     STORAGE_RPMB_FRAME_TYPE FrameFormat;
 * };
 * }
 */
public class _STORAGE_RPMB_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("SizeInBytes"),
        Constants$root.C_LONG$LAYOUT.withName("MaxReliableWriteSizeInBytes"),
        Constants$root.C_LONG$LAYOUT.withName("FrameFormat")
    ).withName("_STORAGE_RPMB_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_RPMB_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_RPMB_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_RPMB_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_RPMB_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_RPMB_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_RPMB_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_RPMB_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeInBytes"));
    public static VarHandle SizeInBytes$VH() {
        return _STORAGE_RPMB_DESCRIPTOR.SizeInBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeInBytes;
     * }
     */
    public static int SizeInBytes$get(MemorySegment seg) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.SizeInBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeInBytes;
     * }
     */
    public static void SizeInBytes$set(MemorySegment seg, int x) {
        _STORAGE_RPMB_DESCRIPTOR.SizeInBytes$VH.set(seg, x);
    }
    public static int SizeInBytes$get(MemorySegment seg, long index) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.SizeInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeInBytes$set(MemorySegment seg, long index, int x) {
        _STORAGE_RPMB_DESCRIPTOR.SizeInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxReliableWriteSizeInBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxReliableWriteSizeInBytes"));
    public static VarHandle MaxReliableWriteSizeInBytes$VH() {
        return _STORAGE_RPMB_DESCRIPTOR.MaxReliableWriteSizeInBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxReliableWriteSizeInBytes;
     * }
     */
    public static int MaxReliableWriteSizeInBytes$get(MemorySegment seg) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.MaxReliableWriteSizeInBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxReliableWriteSizeInBytes;
     * }
     */
    public static void MaxReliableWriteSizeInBytes$set(MemorySegment seg, int x) {
        _STORAGE_RPMB_DESCRIPTOR.MaxReliableWriteSizeInBytes$VH.set(seg, x);
    }
    public static int MaxReliableWriteSizeInBytes$get(MemorySegment seg, long index) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.MaxReliableWriteSizeInBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxReliableWriteSizeInBytes$set(MemorySegment seg, long index, int x) {
        _STORAGE_RPMB_DESCRIPTOR.MaxReliableWriteSizeInBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FrameFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FrameFormat"));
    public static VarHandle FrameFormat$VH() {
        return _STORAGE_RPMB_DESCRIPTOR.FrameFormat$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_RPMB_FRAME_TYPE FrameFormat;
     * }
     */
    public static int FrameFormat$get(MemorySegment seg) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.FrameFormat$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_RPMB_FRAME_TYPE FrameFormat;
     * }
     */
    public static void FrameFormat$set(MemorySegment seg, int x) {
        _STORAGE_RPMB_DESCRIPTOR.FrameFormat$VH.set(seg, x);
    }
    public static int FrameFormat$get(MemorySegment seg, long index) {
        return (int)_STORAGE_RPMB_DESCRIPTOR.FrameFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FrameFormat$set(MemorySegment seg, long index, int x) {
        _STORAGE_RPMB_DESCRIPTOR.FrameFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


