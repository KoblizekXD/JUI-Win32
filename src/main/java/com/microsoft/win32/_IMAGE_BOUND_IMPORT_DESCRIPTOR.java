// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_BOUND_IMPORT_DESCRIPTOR {
 *     DWORD TimeDateStamp;
 *     WORD OffsetModuleName;
 *     WORD NumberOfModuleForwarderRefs;
 * };
 * }
 */
public class _IMAGE_BOUND_IMPORT_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_SHORT$LAYOUT.withName("OffsetModuleName"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfModuleForwarderRefs")
    ).withName("_IMAGE_BOUND_IMPORT_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_BOUND_IMPORT_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_BOUND_IMPORT_DESCRIPTOR.TimeDateStamp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_BOUND_IMPORT_DESCRIPTOR.TimeDateStamp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        _IMAGE_BOUND_IMPORT_DESCRIPTOR.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_BOUND_IMPORT_DESCRIPTOR.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_BOUND_IMPORT_DESCRIPTOR.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OffsetModuleName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OffsetModuleName"));
    public static VarHandle OffsetModuleName$VH() {
        return _IMAGE_BOUND_IMPORT_DESCRIPTOR.OffsetModuleName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD OffsetModuleName;
     * }
     */
    public static short OffsetModuleName$get(MemorySegment seg) {
        return (short)_IMAGE_BOUND_IMPORT_DESCRIPTOR.OffsetModuleName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD OffsetModuleName;
     * }
     */
    public static void OffsetModuleName$set(MemorySegment seg, short x) {
        _IMAGE_BOUND_IMPORT_DESCRIPTOR.OffsetModuleName$VH.set(seg, x);
    }
    public static short OffsetModuleName$get(MemorySegment seg, long index) {
        return (short)_IMAGE_BOUND_IMPORT_DESCRIPTOR.OffsetModuleName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffsetModuleName$set(MemorySegment seg, long index, short x) {
        _IMAGE_BOUND_IMPORT_DESCRIPTOR.OffsetModuleName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfModuleForwarderRefs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfModuleForwarderRefs"));
    public static VarHandle NumberOfModuleForwarderRefs$VH() {
        return _IMAGE_BOUND_IMPORT_DESCRIPTOR.NumberOfModuleForwarderRefs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfModuleForwarderRefs;
     * }
     */
    public static short NumberOfModuleForwarderRefs$get(MemorySegment seg) {
        return (short)_IMAGE_BOUND_IMPORT_DESCRIPTOR.NumberOfModuleForwarderRefs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfModuleForwarderRefs;
     * }
     */
    public static void NumberOfModuleForwarderRefs$set(MemorySegment seg, short x) {
        _IMAGE_BOUND_IMPORT_DESCRIPTOR.NumberOfModuleForwarderRefs$VH.set(seg, x);
    }
    public static short NumberOfModuleForwarderRefs$get(MemorySegment seg, long index) {
        return (short)_IMAGE_BOUND_IMPORT_DESCRIPTOR.NumberOfModuleForwarderRefs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfModuleForwarderRefs$set(MemorySegment seg, long index, short x) {
        _IMAGE_BOUND_IMPORT_DESCRIPTOR.NumberOfModuleForwarderRefs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


