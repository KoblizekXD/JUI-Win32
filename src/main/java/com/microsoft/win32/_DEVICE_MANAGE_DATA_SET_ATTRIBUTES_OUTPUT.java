// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT {
 *     DWORD Size;
 *     DEVICE_DSM_ACTION Action;
 *     DWORD Flags;
 *     DWORD OperationStatus;
 *     DWORD ExtendedError;
 *     DWORD TargetDetailedError;
 *     DWORD ReservedStatus;
 *     DWORD OutputBlockOffset;
 *     DWORD OutputBlockLength;
 * };
 * }
 */
public class _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Action"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("OperationStatus"),
        Constants$root.C_LONG$LAYOUT.withName("ExtendedError"),
        Constants$root.C_LONG$LAYOUT.withName("TargetDetailedError"),
        Constants$root.C_LONG$LAYOUT.withName("ReservedStatus"),
        Constants$root.C_LONG$LAYOUT.withName("OutputBlockOffset"),
        Constants$root.C_LONG$LAYOUT.withName("OutputBlockLength")
    ).withName("_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Action$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Action"));
    public static VarHandle Action$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Action$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DEVICE_DSM_ACTION Action;
     * }
     */
    public static int Action$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Action$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DEVICE_DSM_ACTION Action;
     * }
     */
    public static void Action$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Action$VH.set(seg, x);
    }
    public static int Action$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Action$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OperationStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OperationStatus"));
    public static VarHandle OperationStatus$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OperationStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD OperationStatus;
     * }
     */
    public static int OperationStatus$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OperationStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD OperationStatus;
     * }
     */
    public static void OperationStatus$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OperationStatus$VH.set(seg, x);
    }
    public static int OperationStatus$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OperationStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OperationStatus$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OperationStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExtendedError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExtendedError"));
    public static VarHandle ExtendedError$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ExtendedError$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ExtendedError;
     * }
     */
    public static int ExtendedError$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ExtendedError$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ExtendedError;
     * }
     */
    public static void ExtendedError$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ExtendedError$VH.set(seg, x);
    }
    public static int ExtendedError$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ExtendedError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtendedError$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ExtendedError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetDetailedError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetDetailedError"));
    public static VarHandle TargetDetailedError$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.TargetDetailedError$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TargetDetailedError;
     * }
     */
    public static int TargetDetailedError$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.TargetDetailedError$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TargetDetailedError;
     * }
     */
    public static void TargetDetailedError$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.TargetDetailedError$VH.set(seg, x);
    }
    public static int TargetDetailedError$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.TargetDetailedError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetDetailedError$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.TargetDetailedError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservedStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservedStatus"));
    public static VarHandle ReservedStatus$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ReservedStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ReservedStatus;
     * }
     */
    public static int ReservedStatus$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ReservedStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ReservedStatus;
     * }
     */
    public static void ReservedStatus$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ReservedStatus$VH.set(seg, x);
    }
    public static int ReservedStatus$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ReservedStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservedStatus$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.ReservedStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OutputBlockOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OutputBlockOffset"));
    public static VarHandle OutputBlockOffset$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD OutputBlockOffset;
     * }
     */
    public static int OutputBlockOffset$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD OutputBlockOffset;
     * }
     */
    public static void OutputBlockOffset$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockOffset$VH.set(seg, x);
    }
    public static int OutputBlockOffset$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OutputBlockOffset$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OutputBlockLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("OutputBlockLength"));
    public static VarHandle OutputBlockLength$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD OutputBlockLength;
     * }
     */
    public static int OutputBlockLength$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD OutputBlockLength;
     * }
     */
    public static void OutputBlockLength$set(MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockLength$VH.set(seg, x);
    }
    public static int OutputBlockLength$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OutputBlockLength$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT.OutputBlockLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


