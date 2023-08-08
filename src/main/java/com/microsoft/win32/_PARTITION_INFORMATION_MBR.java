// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PARTITION_INFORMATION_MBR {
 *     BYTE PartitionType;
 *     BOOLEAN BootIndicator;
 *     BOOLEAN RecognizedPartition;
 *     DWORD HiddenSectors;
 *     GUID PartitionId;
 * };
 * }
 */
public class _PARTITION_INFORMATION_MBR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("PartitionType"),
        Constants$root.C_CHAR$LAYOUT.withName("BootIndicator"),
        Constants$root.C_CHAR$LAYOUT.withName("RecognizedPartition"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_LONG$LAYOUT.withName("HiddenSectors"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("PartitionId")
    ).withName("_PARTITION_INFORMATION_MBR");
    public static MemoryLayout $LAYOUT() {
        return _PARTITION_INFORMATION_MBR.$struct$LAYOUT;
    }
    static final VarHandle PartitionType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionType"));
    public static VarHandle PartitionType$VH() {
        return _PARTITION_INFORMATION_MBR.PartitionType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE PartitionType;
     * }
     */
    public static byte PartitionType$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_MBR.PartitionType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE PartitionType;
     * }
     */
    public static void PartitionType$set(MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_MBR.PartitionType$VH.set(seg, x);
    }
    public static byte PartitionType$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_MBR.PartitionType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionType$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_MBR.PartitionType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BootIndicator$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BootIndicator"));
    public static VarHandle BootIndicator$VH() {
        return _PARTITION_INFORMATION_MBR.BootIndicator$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN BootIndicator;
     * }
     */
    public static byte BootIndicator$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_MBR.BootIndicator$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN BootIndicator;
     * }
     */
    public static void BootIndicator$set(MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_MBR.BootIndicator$VH.set(seg, x);
    }
    public static byte BootIndicator$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_MBR.BootIndicator$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BootIndicator$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_MBR.BootIndicator$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RecognizedPartition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RecognizedPartition"));
    public static VarHandle RecognizedPartition$VH() {
        return _PARTITION_INFORMATION_MBR.RecognizedPartition$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN RecognizedPartition;
     * }
     */
    public static byte RecognizedPartition$get(MemorySegment seg) {
        return (byte)_PARTITION_INFORMATION_MBR.RecognizedPartition$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN RecognizedPartition;
     * }
     */
    public static void RecognizedPartition$set(MemorySegment seg, byte x) {
        _PARTITION_INFORMATION_MBR.RecognizedPartition$VH.set(seg, x);
    }
    public static byte RecognizedPartition$get(MemorySegment seg, long index) {
        return (byte)_PARTITION_INFORMATION_MBR.RecognizedPartition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RecognizedPartition$set(MemorySegment seg, long index, byte x) {
        _PARTITION_INFORMATION_MBR.RecognizedPartition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HiddenSectors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HiddenSectors"));
    public static VarHandle HiddenSectors$VH() {
        return _PARTITION_INFORMATION_MBR.HiddenSectors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD HiddenSectors;
     * }
     */
    public static int HiddenSectors$get(MemorySegment seg) {
        return (int)_PARTITION_INFORMATION_MBR.HiddenSectors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD HiddenSectors;
     * }
     */
    public static void HiddenSectors$set(MemorySegment seg, int x) {
        _PARTITION_INFORMATION_MBR.HiddenSectors$VH.set(seg, x);
    }
    public static int HiddenSectors$get(MemorySegment seg, long index) {
        return (int)_PARTITION_INFORMATION_MBR.HiddenSectors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HiddenSectors$set(MemorySegment seg, long index, int x) {
        _PARTITION_INFORMATION_MBR.HiddenSectors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PartitionId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


