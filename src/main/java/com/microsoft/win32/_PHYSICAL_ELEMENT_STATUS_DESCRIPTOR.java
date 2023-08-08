// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD ElementIdentifier;
 *     BYTE PhysicalElementType;
 *     BYTE PhysicalElementHealth;
 *     BYTE Reserved1[2];
 *     DWORDLONG AssociatedCapacity;
 *     DWORD Reserved2[4];
 * };
 * }
 */
public class _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("ElementIdentifier"),
        Constants$root.C_CHAR$LAYOUT.withName("PhysicalElementType"),
        Constants$root.C_CHAR$LAYOUT.withName("PhysicalElementHealth"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AssociatedCapacity"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG$LAYOUT).withName("Reserved2")
    ).withName("_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ElementIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ElementIdentifier"));
    public static VarHandle ElementIdentifier$VH() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.ElementIdentifier$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ElementIdentifier;
     * }
     */
    public static int ElementIdentifier$get(MemorySegment seg) {
        return (int)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.ElementIdentifier$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ElementIdentifier;
     * }
     */
    public static void ElementIdentifier$set(MemorySegment seg, int x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.ElementIdentifier$VH.set(seg, x);
    }
    public static int ElementIdentifier$get(MemorySegment seg, long index) {
        return (int)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.ElementIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ElementIdentifier$set(MemorySegment seg, long index, int x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.ElementIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PhysicalElementType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PhysicalElementType"));
    public static VarHandle PhysicalElementType$VH() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE PhysicalElementType;
     * }
     */
    public static byte PhysicalElementType$get(MemorySegment seg) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE PhysicalElementType;
     * }
     */
    public static void PhysicalElementType$set(MemorySegment seg, byte x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementType$VH.set(seg, x);
    }
    public static byte PhysicalElementType$get(MemorySegment seg, long index) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PhysicalElementType$set(MemorySegment seg, long index, byte x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PhysicalElementHealth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PhysicalElementHealth"));
    public static VarHandle PhysicalElementHealth$VH() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementHealth$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE PhysicalElementHealth;
     * }
     */
    public static byte PhysicalElementHealth$get(MemorySegment seg) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementHealth$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE PhysicalElementHealth;
     * }
     */
    public static void PhysicalElementHealth$set(MemorySegment seg, byte x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementHealth$VH.set(seg, x);
    }
    public static byte PhysicalElementHealth$get(MemorySegment seg, long index) {
        return (byte)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementHealth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PhysicalElementHealth$set(MemorySegment seg, long index, byte x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.PhysicalElementHealth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(14, 2);
    }
    static final VarHandle AssociatedCapacity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AssociatedCapacity"));
    public static VarHandle AssociatedCapacity$VH() {
        return _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.AssociatedCapacity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG AssociatedCapacity;
     * }
     */
    public static long AssociatedCapacity$get(MemorySegment seg) {
        return (long)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.AssociatedCapacity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG AssociatedCapacity;
     * }
     */
    public static void AssociatedCapacity$set(MemorySegment seg, long x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.AssociatedCapacity$VH.set(seg, x);
    }
    public static long AssociatedCapacity$get(MemorySegment seg, long index) {
        return (long)_PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.AssociatedCapacity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AssociatedCapacity$set(MemorySegment seg, long index, long x) {
        _PHYSICAL_ELEMENT_STATUS_DESCRIPTOR.AssociatedCapacity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved2$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


