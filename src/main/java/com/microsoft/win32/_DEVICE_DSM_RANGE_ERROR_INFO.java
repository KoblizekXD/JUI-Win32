// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_DSM_RANGE_ERROR_INFO {
 *     DWORD Version;
 *     DWORD Flags;
 *     DWORD TotalNumberOfRanges;
 *     DWORD NumberOfRangesReturned;
 *     DEVICE_STORAGE_RANGE_ATTRIBUTES Ranges[1];
 * };
 * }
 */
public class _DEVICE_DSM_RANGE_ERROR_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("TotalNumberOfRanges"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfRangesReturned"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("LengthInBytes"),
            MemoryLayout.unionLayout(
                Constants$root.C_LONG$LAYOUT.withName("AllFlags"),
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(32)
                ).withName("$anon$0")
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("Reserved")
        ).withName("_DEVICE_STORAGE_RANGE_ATTRIBUTES")).withName("Ranges")
    ).withName("_DEVICE_DSM_RANGE_ERROR_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_RANGE_ERROR_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_DSM_RANGE_ERROR_INFO.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _DEVICE_DSM_RANGE_ERROR_INFO.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalNumberOfRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalNumberOfRanges"));
    public static VarHandle TotalNumberOfRanges$VH() {
        return _DEVICE_DSM_RANGE_ERROR_INFO.TotalNumberOfRanges$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalNumberOfRanges;
     * }
     */
    public static int TotalNumberOfRanges$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.TotalNumberOfRanges$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalNumberOfRanges;
     * }
     */
    public static void TotalNumberOfRanges$set(MemorySegment seg, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.TotalNumberOfRanges$VH.set(seg, x);
    }
    public static int TotalNumberOfRanges$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.TotalNumberOfRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfRanges$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.TotalNumberOfRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRangesReturned$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRangesReturned"));
    public static VarHandle NumberOfRangesReturned$VH() {
        return _DEVICE_DSM_RANGE_ERROR_INFO.NumberOfRangesReturned$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfRangesReturned;
     * }
     */
    public static int NumberOfRangesReturned$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.NumberOfRangesReturned$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfRangesReturned;
     * }
     */
    public static void NumberOfRangesReturned$set(MemorySegment seg, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.NumberOfRangesReturned$VH.set(seg, x);
    }
    public static int NumberOfRangesReturned$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_RANGE_ERROR_INFO.NumberOfRangesReturned$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRangesReturned$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_RANGE_ERROR_INFO.NumberOfRangesReturned$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Ranges$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


