// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_PD_PROPERTY_SET {
 *     DWORD Version;
 *     DWORD Size;
 *     SCM_PD_PROPERTY_ID PropertyId;
 *     SCM_PD_SET_TYPE SetType;
 *     BYTE AdditionalParameters[1];
 * };
 * }
 */
public class _SCM_PD_PROPERTY_SET {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("PropertyId"),
        Constants$root.C_LONG$LAYOUT.withName("SetType"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("AdditionalParameters"),
        MemoryLayout.paddingLayout(24)
    ).withName("_SCM_PD_PROPERTY_SET");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_PROPERTY_SET.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PD_PROPERTY_SET.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PD_PROPERTY_SET.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _SCM_PD_PROPERTY_SET.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PROPERTY_SET.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PROPERTY_SET.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PD_PROPERTY_SET.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PD_PROPERTY_SET.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCM_PD_PROPERTY_SET.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PROPERTY_SET.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PROPERTY_SET.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PropertyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PropertyId"));
    public static VarHandle PropertyId$VH() {
        return _SCM_PD_PROPERTY_SET.PropertyId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCM_PD_PROPERTY_ID PropertyId;
     * }
     */
    public static int PropertyId$get(MemorySegment seg) {
        return (int)_SCM_PD_PROPERTY_SET.PropertyId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCM_PD_PROPERTY_ID PropertyId;
     * }
     */
    public static void PropertyId$set(MemorySegment seg, int x) {
        _SCM_PD_PROPERTY_SET.PropertyId$VH.set(seg, x);
    }
    public static int PropertyId$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PROPERTY_SET.PropertyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PropertyId$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PROPERTY_SET.PropertyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SetType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetType"));
    public static VarHandle SetType$VH() {
        return _SCM_PD_PROPERTY_SET.SetType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SCM_PD_SET_TYPE SetType;
     * }
     */
    public static int SetType$get(MemorySegment seg) {
        return (int)_SCM_PD_PROPERTY_SET.SetType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SCM_PD_SET_TYPE SetType;
     * }
     */
    public static void SetType$set(MemorySegment seg, int x) {
        _SCM_PD_PROPERTY_SET.SetType$VH.set(seg, x);
    }
    public static int SetType$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PROPERTY_SET.SetType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetType$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PROPERTY_SET.SetType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AdditionalParameters$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

