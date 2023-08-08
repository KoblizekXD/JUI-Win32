// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_LB_PROVISIONING_MAP_RESOURCES {
 *     DWORD Size;
 *     DWORD Version;
 *      *     BYTE AvailableMappingResourcesValid;
 *     BYTE UsedMappingResourcesValid;
 *     BYTE Reserved0;
 *     BYTE Reserved1[3];
 *      *     BYTE AvailableMappingResourcesScope;
 *     BYTE UsedMappingResourcesScope;
 *     BYTE Reserved2;
 *     BYTE Reserved3[3];
 *     DWORDLONG AvailableMappingResources;
 *     DWORDLONG UsedMappingResources;
 * };
 * }
 */
public class _STORAGE_LB_PROVISIONING_MAP_RESOURCES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        MemoryLayout.paddingLayout(8),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved3"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AvailableMappingResources"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("UsedMappingResources")
    ).withName("_STORAGE_LB_PROVISIONING_MAP_RESOURCES");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_LB_PROVISIONING_MAP_RESOURCES.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_LB_PROVISIONING_MAP_RESOURCES.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_LB_PROVISIONING_MAP_RESOURCES.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(9, 3);
    }
    public static MemorySegment Reserved3$slice(MemorySegment seg) {
        return seg.asSlice(13, 3);
    }
    static final VarHandle AvailableMappingResources$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AvailableMappingResources"));
    public static VarHandle AvailableMappingResources$VH() {
        return _STORAGE_LB_PROVISIONING_MAP_RESOURCES.AvailableMappingResources$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG AvailableMappingResources;
     * }
     */
    public static long AvailableMappingResources$get(MemorySegment seg) {
        return (long)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.AvailableMappingResources$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG AvailableMappingResources;
     * }
     */
    public static void AvailableMappingResources$set(MemorySegment seg, long x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.AvailableMappingResources$VH.set(seg, x);
    }
    public static long AvailableMappingResources$get(MemorySegment seg, long index) {
        return (long)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.AvailableMappingResources$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AvailableMappingResources$set(MemorySegment seg, long index, long x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.AvailableMappingResources$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UsedMappingResources$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UsedMappingResources"));
    public static VarHandle UsedMappingResources$VH() {
        return _STORAGE_LB_PROVISIONING_MAP_RESOURCES.UsedMappingResources$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UsedMappingResources;
     * }
     */
    public static long UsedMappingResources$get(MemorySegment seg) {
        return (long)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.UsedMappingResources$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UsedMappingResources;
     * }
     */
    public static void UsedMappingResources$set(MemorySegment seg, long x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.UsedMappingResources$VH.set(seg, x);
    }
    public static long UsedMappingResources$get(MemorySegment seg, long index) {
        return (long)_STORAGE_LB_PROVISIONING_MAP_RESOURCES.UsedMappingResources$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UsedMappingResources$set(MemorySegment seg, long index, long x) {
        _STORAGE_LB_PROVISIONING_MAP_RESOURCES.UsedMappingResources$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


