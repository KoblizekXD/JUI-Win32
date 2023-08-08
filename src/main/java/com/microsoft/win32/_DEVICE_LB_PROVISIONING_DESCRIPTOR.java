// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_LB_PROVISIONING_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *      *     BYTE ThinProvisioningEnabled;
 *     BYTE ThinProvisioningReadZeros;
 *     BYTE AnchorSupported;
 *     BYTE UnmapGranularityAlignmentValid;
 *     BYTE GetFreeSpaceSupported;
 *     BYTE MapSupported;
 *     BYTE Reserved1[7];
 *     DWORDLONG OptimalUnmapGranularity;
 *     DWORDLONG UnmapGranularityAlignment;
 *     DWORD MaxUnmapLbaCount;
 *     DWORD MaxUnmapBlockDescriptorCount;
 * };
 * }
 */
public class _DEVICE_LB_PROVISIONING_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.sequenceLayout(7, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("OptimalUnmapGranularity"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("UnmapGranularityAlignment"),
        Constants$root.C_LONG$LAYOUT.withName("MaxUnmapLbaCount"),
        Constants$root.C_LONG$LAYOUT.withName("MaxUnmapBlockDescriptorCount")
    ).withName("_DEVICE_LB_PROVISIONING_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(9, 7);
    }
    static final VarHandle OptimalUnmapGranularity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OptimalUnmapGranularity"));
    public static VarHandle OptimalUnmapGranularity$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG OptimalUnmapGranularity;
     * }
     */
    public static long OptimalUnmapGranularity$get(MemorySegment seg) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG OptimalUnmapGranularity;
     * }
     */
    public static void OptimalUnmapGranularity$set(MemorySegment seg, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.set(seg, x);
    }
    public static long OptimalUnmapGranularity$get(MemorySegment seg, long index) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OptimalUnmapGranularity$set(MemorySegment seg, long index, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.OptimalUnmapGranularity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UnmapGranularityAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnmapGranularityAlignment"));
    public static VarHandle UnmapGranularityAlignment$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UnmapGranularityAlignment;
     * }
     */
    public static long UnmapGranularityAlignment$get(MemorySegment seg) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UnmapGranularityAlignment;
     * }
     */
    public static void UnmapGranularityAlignment$set(MemorySegment seg, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.set(seg, x);
    }
    public static long UnmapGranularityAlignment$get(MemorySegment seg, long index) {
        return (long)_DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmapGranularityAlignment$set(MemorySegment seg, long index, long x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.UnmapGranularityAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxUnmapLbaCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxUnmapLbaCount"));
    public static VarHandle MaxUnmapLbaCount$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxUnmapLbaCount;
     * }
     */
    public static int MaxUnmapLbaCount$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxUnmapLbaCount;
     * }
     */
    public static void MaxUnmapLbaCount$set(MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.set(seg, x);
    }
    public static int MaxUnmapLbaCount$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUnmapLbaCount$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapLbaCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxUnmapBlockDescriptorCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxUnmapBlockDescriptorCount"));
    public static VarHandle MaxUnmapBlockDescriptorCount$VH() {
        return _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxUnmapBlockDescriptorCount;
     * }
     */
    public static int MaxUnmapBlockDescriptorCount$get(MemorySegment seg) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxUnmapBlockDescriptorCount;
     * }
     */
    public static void MaxUnmapBlockDescriptorCount$set(MemorySegment seg, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.set(seg, x);
    }
    public static int MaxUnmapBlockDescriptorCount$get(MemorySegment seg, long index) {
        return (int)_DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUnmapBlockDescriptorCount$set(MemorySegment seg, long index, int x) {
        _DEVICE_LB_PROVISIONING_DESCRIPTOR.MaxUnmapBlockDescriptorCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

