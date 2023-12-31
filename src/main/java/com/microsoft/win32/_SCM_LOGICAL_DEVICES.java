// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_LOGICAL_DEVICES {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD DeviceCount;
 *     SCM_LOGICAL_DEVICE_INSTANCE Devices[1];
 * };
 * }
 */
public class _SCM_LOGICAL_DEVICES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceCount"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Version"),
            Constants$root.C_LONG$LAYOUT.withName("Size"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("DeviceGuid"),
            MemoryLayout.sequenceLayout(256, Constants$root.C_SHORT$LAYOUT).withName("SymbolicLink")
        ).withName("_SCM_LOGICAL_DEVICE_INSTANCE")).withName("Devices")
    ).withName("_SCM_LOGICAL_DEVICES");
    public static MemoryLayout $LAYOUT() {
        return _SCM_LOGICAL_DEVICES.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_LOGICAL_DEVICES.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_LOGICAL_DEVICES.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _SCM_LOGICAL_DEVICES.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_LOGICAL_DEVICES.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_LOGICAL_DEVICES.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_LOGICAL_DEVICES.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_LOGICAL_DEVICES.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCM_LOGICAL_DEVICES.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_LOGICAL_DEVICES.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_LOGICAL_DEVICES.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceCount"));
    public static VarHandle DeviceCount$VH() {
        return _SCM_LOGICAL_DEVICES.DeviceCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DeviceCount;
     * }
     */
    public static int DeviceCount$get(MemorySegment seg) {
        return (int)_SCM_LOGICAL_DEVICES.DeviceCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DeviceCount;
     * }
     */
    public static void DeviceCount$set(MemorySegment seg, int x) {
        _SCM_LOGICAL_DEVICES.DeviceCount$VH.set(seg, x);
    }
    public static int DeviceCount$get(MemorySegment seg, long index) {
        return (int)_SCM_LOGICAL_DEVICES.DeviceCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceCount$set(MemorySegment seg, long index, int x) {
        _SCM_LOGICAL_DEVICES.DeviceCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Devices$slice(MemorySegment seg) {
        return seg.asSlice(12, 536);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


