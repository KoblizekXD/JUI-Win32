// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DEVICE_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     BYTE DeviceType;
 *     BYTE DeviceTypeModifier;
 *     BOOLEAN RemovableMedia;
 *     BOOLEAN CommandQueueing;
 *     DWORD VendorIdOffset;
 *     DWORD ProductIdOffset;
 *     DWORD ProductRevisionOffset;
 *     DWORD SerialNumberOffset;
 *     STORAGE_BUS_TYPE BusType;
 *     DWORD RawPropertiesLength;
 *     BYTE RawDeviceProperties[1];
 * };
 * }
 */
public class _STORAGE_DEVICE_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceType"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceTypeModifier"),
        Constants$root.C_CHAR$LAYOUT.withName("RemovableMedia"),
        Constants$root.C_CHAR$LAYOUT.withName("CommandQueueing"),
        Constants$root.C_LONG$LAYOUT.withName("VendorIdOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ProductIdOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ProductRevisionOffset"),
        Constants$root.C_LONG$LAYOUT.withName("SerialNumberOffset"),
        Constants$root.C_LONG$LAYOUT.withName("BusType"),
        Constants$root.C_LONG$LAYOUT.withName("RawPropertiesLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("RawDeviceProperties"),
        MemoryLayout.paddingLayout(24)
    ).withName("_STORAGE_DEVICE_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceType"));
    public static VarHandle DeviceType$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE DeviceType;
     * }
     */
    public static byte DeviceType$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE DeviceType;
     * }
     */
    public static void DeviceType$set(MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.set(seg, x);
    }
    public static byte DeviceType$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceType$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceTypeModifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceTypeModifier"));
    public static VarHandle DeviceTypeModifier$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE DeviceTypeModifier;
     * }
     */
    public static byte DeviceTypeModifier$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE DeviceTypeModifier;
     * }
     */
    public static void DeviceTypeModifier$set(MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.set(seg, x);
    }
    public static byte DeviceTypeModifier$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceTypeModifier$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.DeviceTypeModifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RemovableMedia$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RemovableMedia"));
    public static VarHandle RemovableMedia$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN RemovableMedia;
     * }
     */
    public static byte RemovableMedia$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN RemovableMedia;
     * }
     */
    public static void RemovableMedia$set(MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.set(seg, x);
    }
    public static byte RemovableMedia$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RemovableMedia$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.RemovableMedia$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CommandQueueing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CommandQueueing"));
    public static VarHandle CommandQueueing$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN CommandQueueing;
     * }
     */
    public static byte CommandQueueing$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN CommandQueueing;
     * }
     */
    public static void CommandQueueing$set(MemorySegment seg, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.set(seg, x);
    }
    public static byte CommandQueueing$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CommandQueueing$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_DESCRIPTOR.CommandQueueing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VendorIdOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VendorIdOffset"));
    public static VarHandle VendorIdOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD VendorIdOffset;
     * }
     */
    public static int VendorIdOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD VendorIdOffset;
     * }
     */
    public static void VendorIdOffset$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.set(seg, x);
    }
    public static int VendorIdOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VendorIdOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.VendorIdOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProductIdOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProductIdOffset"));
    public static VarHandle ProductIdOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ProductIdOffset;
     * }
     */
    public static int ProductIdOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ProductIdOffset;
     * }
     */
    public static void ProductIdOffset$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.set(seg, x);
    }
    public static int ProductIdOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProductIdOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductIdOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProductRevisionOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProductRevisionOffset"));
    public static VarHandle ProductRevisionOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ProductRevisionOffset;
     * }
     */
    public static int ProductRevisionOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ProductRevisionOffset;
     * }
     */
    public static void ProductRevisionOffset$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.set(seg, x);
    }
    public static int ProductRevisionOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProductRevisionOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.ProductRevisionOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SerialNumberOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SerialNumberOffset"));
    public static VarHandle SerialNumberOffset$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SerialNumberOffset;
     * }
     */
    public static int SerialNumberOffset$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SerialNumberOffset;
     * }
     */
    public static void SerialNumberOffset$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.set(seg, x);
    }
    public static int SerialNumberOffset$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SerialNumberOffset$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.SerialNumberOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BusType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BusType"));
    public static VarHandle BusType$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.BusType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_BUS_TYPE BusType;
     * }
     */
    public static int BusType$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.BusType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_BUS_TYPE BusType;
     * }
     */
    public static void BusType$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.BusType$VH.set(seg, x);
    }
    public static int BusType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.BusType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BusType$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.BusType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RawPropertiesLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RawPropertiesLength"));
    public static VarHandle RawPropertiesLength$VH() {
        return _STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RawPropertiesLength;
     * }
     */
    public static int RawPropertiesLength$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RawPropertiesLength;
     * }
     */
    public static void RawPropertiesLength$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.set(seg, x);
    }
    public static int RawPropertiesLength$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RawPropertiesLength$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_DESCRIPTOR.RawPropertiesLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RawDeviceProperties$slice(MemorySegment seg) {
        return seg.asSlice(36, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

