// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2 {
 *     DWORD Version;
 *     DWORD Size;
 *     BOOLEAN SupportsSelfEncryption;
 *     STORAGE_ENCRYPTION_TYPE EncryptionType;
 * };
 * }
 */
public class _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_CHAR$LAYOUT.withName("SupportsSelfEncryption"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_LONG$LAYOUT.withName("EncryptionType")
    ).withName("_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SupportsSelfEncryption$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SupportsSelfEncryption"));
    public static VarHandle SupportsSelfEncryption$VH() {
        return _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.SupportsSelfEncryption$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SupportsSelfEncryption;
     * }
     */
    public static byte SupportsSelfEncryption$get(MemorySegment seg) {
        return (byte)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.SupportsSelfEncryption$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SupportsSelfEncryption;
     * }
     */
    public static void SupportsSelfEncryption$set(MemorySegment seg, byte x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.SupportsSelfEncryption$VH.set(seg, x);
    }
    public static byte SupportsSelfEncryption$get(MemorySegment seg, long index) {
        return (byte)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.SupportsSelfEncryption$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SupportsSelfEncryption$set(MemorySegment seg, long index, byte x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.SupportsSelfEncryption$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EncryptionType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EncryptionType"));
    public static VarHandle EncryptionType$VH() {
        return _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.EncryptionType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_ENCRYPTION_TYPE EncryptionType;
     * }
     */
    public static int EncryptionType$get(MemorySegment seg) {
        return (int)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.EncryptionType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_ENCRYPTION_TYPE EncryptionType;
     * }
     */
    public static void EncryptionType$set(MemorySegment seg, int x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.EncryptionType$VH.set(seg, x);
    }
    public static int EncryptionType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.EncryptionType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EncryptionType$set(MemorySegment seg, long index, int x) {
        _STORAGE_DEVICE_SELF_ENCRYPTION_PROPERTY_V2.EncryptionType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

