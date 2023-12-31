// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_POWER_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     BOOLEAN DeviceAttentionSupported;
 *     BOOLEAN AsynchronousNotificationSupported;
 *     BOOLEAN IdlePowerManagementEnabled;
 *     BOOLEAN D3ColdEnabled;
 *     BOOLEAN D3ColdSupported;
 *     BOOLEAN NoVerifyDuringIdlePower;
 *     BYTE Reserved[2];
 *     DWORD IdleTimeoutInMS;
 * };
 * }
 */
public class _DEVICE_POWER_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("DeviceAttentionSupported"),
        Constants$root.C_CHAR$LAYOUT.withName("AsynchronousNotificationSupported"),
        Constants$root.C_CHAR$LAYOUT.withName("IdlePowerManagementEnabled"),
        Constants$root.C_CHAR$LAYOUT.withName("D3ColdEnabled"),
        Constants$root.C_CHAR$LAYOUT.withName("D3ColdSupported"),
        Constants$root.C_CHAR$LAYOUT.withName("NoVerifyDuringIdlePower"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("IdleTimeoutInMS")
    ).withName("_DEVICE_POWER_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_POWER_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_POWER_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_POWER_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _DEVICE_POWER_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_POWER_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_POWER_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_POWER_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_POWER_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _DEVICE_POWER_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_POWER_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_POWER_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceAttentionSupported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceAttentionSupported"));
    public static VarHandle DeviceAttentionSupported$VH() {
        return _DEVICE_POWER_DESCRIPTOR.DeviceAttentionSupported$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN DeviceAttentionSupported;
     * }
     */
    public static byte DeviceAttentionSupported$get(MemorySegment seg) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.DeviceAttentionSupported$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN DeviceAttentionSupported;
     * }
     */
    public static void DeviceAttentionSupported$set(MemorySegment seg, byte x) {
        _DEVICE_POWER_DESCRIPTOR.DeviceAttentionSupported$VH.set(seg, x);
    }
    public static byte DeviceAttentionSupported$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.DeviceAttentionSupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceAttentionSupported$set(MemorySegment seg, long index, byte x) {
        _DEVICE_POWER_DESCRIPTOR.DeviceAttentionSupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AsynchronousNotificationSupported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AsynchronousNotificationSupported"));
    public static VarHandle AsynchronousNotificationSupported$VH() {
        return _DEVICE_POWER_DESCRIPTOR.AsynchronousNotificationSupported$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN AsynchronousNotificationSupported;
     * }
     */
    public static byte AsynchronousNotificationSupported$get(MemorySegment seg) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.AsynchronousNotificationSupported$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN AsynchronousNotificationSupported;
     * }
     */
    public static void AsynchronousNotificationSupported$set(MemorySegment seg, byte x) {
        _DEVICE_POWER_DESCRIPTOR.AsynchronousNotificationSupported$VH.set(seg, x);
    }
    public static byte AsynchronousNotificationSupported$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.AsynchronousNotificationSupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AsynchronousNotificationSupported$set(MemorySegment seg, long index, byte x) {
        _DEVICE_POWER_DESCRIPTOR.AsynchronousNotificationSupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdlePowerManagementEnabled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdlePowerManagementEnabled"));
    public static VarHandle IdlePowerManagementEnabled$VH() {
        return _DEVICE_POWER_DESCRIPTOR.IdlePowerManagementEnabled$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN IdlePowerManagementEnabled;
     * }
     */
    public static byte IdlePowerManagementEnabled$get(MemorySegment seg) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.IdlePowerManagementEnabled$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN IdlePowerManagementEnabled;
     * }
     */
    public static void IdlePowerManagementEnabled$set(MemorySegment seg, byte x) {
        _DEVICE_POWER_DESCRIPTOR.IdlePowerManagementEnabled$VH.set(seg, x);
    }
    public static byte IdlePowerManagementEnabled$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.IdlePowerManagementEnabled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdlePowerManagementEnabled$set(MemorySegment seg, long index, byte x) {
        _DEVICE_POWER_DESCRIPTOR.IdlePowerManagementEnabled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle D3ColdEnabled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("D3ColdEnabled"));
    public static VarHandle D3ColdEnabled$VH() {
        return _DEVICE_POWER_DESCRIPTOR.D3ColdEnabled$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN D3ColdEnabled;
     * }
     */
    public static byte D3ColdEnabled$get(MemorySegment seg) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.D3ColdEnabled$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN D3ColdEnabled;
     * }
     */
    public static void D3ColdEnabled$set(MemorySegment seg, byte x) {
        _DEVICE_POWER_DESCRIPTOR.D3ColdEnabled$VH.set(seg, x);
    }
    public static byte D3ColdEnabled$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.D3ColdEnabled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void D3ColdEnabled$set(MemorySegment seg, long index, byte x) {
        _DEVICE_POWER_DESCRIPTOR.D3ColdEnabled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle D3ColdSupported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("D3ColdSupported"));
    public static VarHandle D3ColdSupported$VH() {
        return _DEVICE_POWER_DESCRIPTOR.D3ColdSupported$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN D3ColdSupported;
     * }
     */
    public static byte D3ColdSupported$get(MemorySegment seg) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.D3ColdSupported$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN D3ColdSupported;
     * }
     */
    public static void D3ColdSupported$set(MemorySegment seg, byte x) {
        _DEVICE_POWER_DESCRIPTOR.D3ColdSupported$VH.set(seg, x);
    }
    public static byte D3ColdSupported$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.D3ColdSupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void D3ColdSupported$set(MemorySegment seg, long index, byte x) {
        _DEVICE_POWER_DESCRIPTOR.D3ColdSupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NoVerifyDuringIdlePower$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NoVerifyDuringIdlePower"));
    public static VarHandle NoVerifyDuringIdlePower$VH() {
        return _DEVICE_POWER_DESCRIPTOR.NoVerifyDuringIdlePower$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN NoVerifyDuringIdlePower;
     * }
     */
    public static byte NoVerifyDuringIdlePower$get(MemorySegment seg) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.NoVerifyDuringIdlePower$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN NoVerifyDuringIdlePower;
     * }
     */
    public static void NoVerifyDuringIdlePower$set(MemorySegment seg, byte x) {
        _DEVICE_POWER_DESCRIPTOR.NoVerifyDuringIdlePower$VH.set(seg, x);
    }
    public static byte NoVerifyDuringIdlePower$get(MemorySegment seg, long index) {
        return (byte)_DEVICE_POWER_DESCRIPTOR.NoVerifyDuringIdlePower$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NoVerifyDuringIdlePower$set(MemorySegment seg, long index, byte x) {
        _DEVICE_POWER_DESCRIPTOR.NoVerifyDuringIdlePower$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(14, 2);
    }
    static final VarHandle IdleTimeoutInMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdleTimeoutInMS"));
    public static VarHandle IdleTimeoutInMS$VH() {
        return _DEVICE_POWER_DESCRIPTOR.IdleTimeoutInMS$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IdleTimeoutInMS;
     * }
     */
    public static int IdleTimeoutInMS$get(MemorySegment seg) {
        return (int)_DEVICE_POWER_DESCRIPTOR.IdleTimeoutInMS$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IdleTimeoutInMS;
     * }
     */
    public static void IdleTimeoutInMS$set(MemorySegment seg, int x) {
        _DEVICE_POWER_DESCRIPTOR.IdleTimeoutInMS$VH.set(seg, x);
    }
    public static int IdleTimeoutInMS$get(MemorySegment seg, long index) {
        return (int)_DEVICE_POWER_DESCRIPTOR.IdleTimeoutInMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdleTimeoutInMS$set(MemorySegment seg, long index, int x) {
        _DEVICE_POWER_DESCRIPTOR.IdleTimeoutInMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


