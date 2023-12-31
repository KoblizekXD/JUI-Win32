// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {
 *     DWORD ControlFlags;
 *     union {
 *         DWORD CpuRate;
 *         DWORD Weight;
 *         struct {
 *             WORD MinRate;
 *             WORD MaxRate;
 *         };
 *     };
 * };
 * }
 */
public class _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ControlFlags"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("CpuRate"),
            Constants$root.C_LONG$LAYOUT.withName("Weight"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("MinRate"),
                Constants$root.C_SHORT$LAYOUT.withName("MaxRate")
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ControlFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlFlags"));
    public static VarHandle ControlFlags$VH() {
        return _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.ControlFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ControlFlags;
     * }
     */
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.ControlFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ControlFlags;
     * }
     */
    public static void ControlFlags$set(MemorySegment seg, int x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.ControlFlags$VH.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.ControlFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.ControlFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CpuRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("CpuRate"));
    public static VarHandle CpuRate$VH() {
        return _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.CpuRate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CpuRate;
     * }
     */
    public static int CpuRate$get(MemorySegment seg) {
        return (int)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.CpuRate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CpuRate;
     * }
     */
    public static void CpuRate$set(MemorySegment seg, int x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.CpuRate$VH.set(seg, x);
    }
    public static int CpuRate$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.CpuRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CpuRate$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.CpuRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Weight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Weight"));
    public static VarHandle Weight$VH() {
        return _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.Weight$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Weight;
     * }
     */
    public static int Weight$get(MemorySegment seg) {
        return (int)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.Weight$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Weight;
     * }
     */
    public static void Weight$set(MemorySegment seg, int x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.Weight$VH.set(seg, x);
    }
    public static int Weight$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.Weight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Weight$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.Weight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("MinRate"));
    public static VarHandle MinRate$VH() {
        return _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MinRate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinRate;
     * }
     */
    public static short MinRate$get(MemorySegment seg) {
        return (short)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MinRate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinRate;
     * }
     */
    public static void MinRate$set(MemorySegment seg, short x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MinRate$VH.set(seg, x);
    }
    public static short MinRate$get(MemorySegment seg, long index) {
        return (short)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MinRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinRate$set(MemorySegment seg, long index, short x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MinRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxRate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("MaxRate"));
    public static VarHandle MaxRate$VH() {
        return _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MaxRate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MaxRate;
     * }
     */
    public static short MaxRate$get(MemorySegment seg) {
        return (short)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MaxRate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MaxRate;
     * }
     */
    public static void MaxRate$set(MemorySegment seg, short x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MaxRate$VH.set(seg, x);
    }
    public static short MaxRate$get(MemorySegment seg, long index) {
        return (short)_JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MaxRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxRate$set(MemorySegment seg, long index, short x) {
        _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION.MaxRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


