// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD DeviceCount;
 *     SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO Devices[1];
 * };
 * }
 */
public class _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceCount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("DeviceGuid"),
            Constants$root.C_LONG$LAYOUT.withName("DeviceNumber"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("Flags"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("DeviceSize")
        ).withName("_SCM_BUS_DEDICATED_MEMORY_DEVICE_INFO")).withName("Devices")
    ).withName("_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceCount"));
    public static VarHandle DeviceCount$VH() {
        return _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.DeviceCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DeviceCount;
     * }
     */
    public static int DeviceCount$get(MemorySegment seg) {
        return (int)_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.DeviceCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DeviceCount;
     * }
     */
    public static void DeviceCount$set(MemorySegment seg, int x) {
        _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.DeviceCount$VH.set(seg, x);
    }
    public static int DeviceCount$get(MemorySegment seg, long index) {
        return (int)_SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.DeviceCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceCount$set(MemorySegment seg, long index, int x) {
        _SCM_BUS_DEDICATED_MEMORY_DEVICES_INFO.DeviceCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Devices$slice(MemorySegment seg) {
        return seg.asSlice(16, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

