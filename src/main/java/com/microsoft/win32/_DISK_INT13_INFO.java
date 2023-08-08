// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISK_INT13_INFO {
 *     WORD DriveSelect;
 *     DWORD MaxCylinders;
 *     WORD SectorsPerTrack;
 *     WORD MaxHeads;
 *     WORD NumberDrives;
 * };
 * }
 */
public class _DISK_INT13_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("DriveSelect"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("MaxCylinders"),
        Constants$root.C_SHORT$LAYOUT.withName("SectorsPerTrack"),
        Constants$root.C_SHORT$LAYOUT.withName("MaxHeads"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberDrives"),
        MemoryLayout.paddingLayout(16)
    ).withName("_DISK_INT13_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DISK_INT13_INFO.$struct$LAYOUT;
    }
    static final VarHandle DriveSelect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DriveSelect"));
    public static VarHandle DriveSelect$VH() {
        return _DISK_INT13_INFO.DriveSelect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD DriveSelect;
     * }
     */
    public static short DriveSelect$get(MemorySegment seg) {
        return (short)_DISK_INT13_INFO.DriveSelect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD DriveSelect;
     * }
     */
    public static void DriveSelect$set(MemorySegment seg, short x) {
        _DISK_INT13_INFO.DriveSelect$VH.set(seg, x);
    }
    public static short DriveSelect$get(MemorySegment seg, long index) {
        return (short)_DISK_INT13_INFO.DriveSelect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DriveSelect$set(MemorySegment seg, long index, short x) {
        _DISK_INT13_INFO.DriveSelect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxCylinders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxCylinders"));
    public static VarHandle MaxCylinders$VH() {
        return _DISK_INT13_INFO.MaxCylinders$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxCylinders;
     * }
     */
    public static int MaxCylinders$get(MemorySegment seg) {
        return (int)_DISK_INT13_INFO.MaxCylinders$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxCylinders;
     * }
     */
    public static void MaxCylinders$set(MemorySegment seg, int x) {
        _DISK_INT13_INFO.MaxCylinders$VH.set(seg, x);
    }
    public static int MaxCylinders$get(MemorySegment seg, long index) {
        return (int)_DISK_INT13_INFO.MaxCylinders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCylinders$set(MemorySegment seg, long index, int x) {
        _DISK_INT13_INFO.MaxCylinders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectorsPerTrack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectorsPerTrack"));
    public static VarHandle SectorsPerTrack$VH() {
        return _DISK_INT13_INFO.SectorsPerTrack$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD SectorsPerTrack;
     * }
     */
    public static short SectorsPerTrack$get(MemorySegment seg) {
        return (short)_DISK_INT13_INFO.SectorsPerTrack$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD SectorsPerTrack;
     * }
     */
    public static void SectorsPerTrack$set(MemorySegment seg, short x) {
        _DISK_INT13_INFO.SectorsPerTrack$VH.set(seg, x);
    }
    public static short SectorsPerTrack$get(MemorySegment seg, long index) {
        return (short)_DISK_INT13_INFO.SectorsPerTrack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectorsPerTrack$set(MemorySegment seg, long index, short x) {
        _DISK_INT13_INFO.SectorsPerTrack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxHeads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxHeads"));
    public static VarHandle MaxHeads$VH() {
        return _DISK_INT13_INFO.MaxHeads$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MaxHeads;
     * }
     */
    public static short MaxHeads$get(MemorySegment seg) {
        return (short)_DISK_INT13_INFO.MaxHeads$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MaxHeads;
     * }
     */
    public static void MaxHeads$set(MemorySegment seg, short x) {
        _DISK_INT13_INFO.MaxHeads$VH.set(seg, x);
    }
    public static short MaxHeads$get(MemorySegment seg, long index) {
        return (short)_DISK_INT13_INFO.MaxHeads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxHeads$set(MemorySegment seg, long index, short x) {
        _DISK_INT13_INFO.MaxHeads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberDrives$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberDrives"));
    public static VarHandle NumberDrives$VH() {
        return _DISK_INT13_INFO.NumberDrives$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberDrives;
     * }
     */
    public static short NumberDrives$get(MemorySegment seg) {
        return (short)_DISK_INT13_INFO.NumberDrives$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberDrives;
     * }
     */
    public static void NumberDrives$set(MemorySegment seg, short x) {
        _DISK_INT13_INFO.NumberDrives$VH.set(seg, x);
    }
    public static short NumberDrives$get(MemorySegment seg, long index) {
        return (short)_DISK_INT13_INFO.NumberDrives$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberDrives$set(MemorySegment seg, long index, short x) {
        _DISK_INT13_INFO.NumberDrives$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


