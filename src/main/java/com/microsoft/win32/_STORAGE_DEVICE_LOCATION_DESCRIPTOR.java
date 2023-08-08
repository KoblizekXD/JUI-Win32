// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DEVICE_LOCATION_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DEVICE_LOCATION Location;
 *     DWORD StringOffset;
 * };
 * }
 */
public class _STORAGE_DEVICE_LOCATION_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Socket"),
            Constants$root.C_LONG$LAYOUT.withName("Slot"),
            Constants$root.C_LONG$LAYOUT.withName("Adapter"),
            Constants$root.C_LONG$LAYOUT.withName("Port"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Channel"),
                    Constants$root.C_LONG$LAYOUT.withName("Device")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Target"),
                    Constants$root.C_LONG$LAYOUT.withName("Lun")
                ).withName("$anon$1")
            ).withName("$anon$0")
        ).withName("Location"),
        Constants$root.C_LONG$LAYOUT.withName("StringOffset")
    ).withName("_STORAGE_DEVICE_LOCATION_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_LOCATION_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_LOCATION_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_LOCATION_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_LOCATION_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_LOCATION_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_LOCATION_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_LOCATION_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_LOCATION_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_LOCATION_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_LOCATION_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_LOCATION_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Location$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    static final VarHandle StringOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StringOffset"));
    public static VarHandle StringOffset$VH() {
        return _STORAGE_DEVICE_LOCATION_DESCRIPTOR.StringOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StringOffset;
     * }
     */
    public static int StringOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_LOCATION_DESCRIPTOR.StringOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StringOffset;
     * }
     */
    public static void StringOffset$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_LOCATION_DESCRIPTOR.StringOffset$VH.set(seg, x);
    }
    public static int StringOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_LOCATION_DESCRIPTOR.StringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StringOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_LOCATION_DESCRIPTOR.StringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

