// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD MediumProductType;
 * };
 * }
 */
public class _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("MediumProductType")
    ).withName("_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MediumProductType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MediumProductType"));
    public static VarHandle MediumProductType$VH() {
        return _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.MediumProductType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MediumProductType;
     * }
     */
    public static int MediumProductType$get(MemorySegment seg) {
        return (int)_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.MediumProductType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MediumProductType;
     * }
     */
    public static void MediumProductType$set(MemorySegment seg, int x) {
        _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.MediumProductType$VH.set(seg, x);
    }
    public static int MediumProductType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.MediumProductType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MediumProductType$set(MemorySegment seg, long index, int x) {
        _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR.MediumProductType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


