// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct JOBOBJECT_NET_RATE_CONTROL_INFORMATION {
 *     DWORD64 MaxBandwidth;
 *     JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags;
 *     BYTE DscpTag;
 * };
 * }
 */
public class JOBOBJECT_NET_RATE_CONTROL_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("MaxBandwidth"),
        Constants$root.C_LONG$LAYOUT.withName("ControlFlags"),
        Constants$root.C_CHAR$LAYOUT.withName("DscpTag"),
        MemoryLayout.paddingLayout(24)
    ).withName("JOBOBJECT_NET_RATE_CONTROL_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return JOBOBJECT_NET_RATE_CONTROL_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle MaxBandwidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxBandwidth"));
    public static VarHandle MaxBandwidth$VH() {
        return JOBOBJECT_NET_RATE_CONTROL_INFORMATION.MaxBandwidth$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 MaxBandwidth;
     * }
     */
    public static long MaxBandwidth$get(MemorySegment seg) {
        return (long)JOBOBJECT_NET_RATE_CONTROL_INFORMATION.MaxBandwidth$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 MaxBandwidth;
     * }
     */
    public static void MaxBandwidth$set(MemorySegment seg, long x) {
        JOBOBJECT_NET_RATE_CONTROL_INFORMATION.MaxBandwidth$VH.set(seg, x);
    }
    public static long MaxBandwidth$get(MemorySegment seg, long index) {
        return (long)JOBOBJECT_NET_RATE_CONTROL_INFORMATION.MaxBandwidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxBandwidth$set(MemorySegment seg, long index, long x) {
        JOBOBJECT_NET_RATE_CONTROL_INFORMATION.MaxBandwidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ControlFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ControlFlags"));
    public static VarHandle ControlFlags$VH() {
        return JOBOBJECT_NET_RATE_CONTROL_INFORMATION.ControlFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags;
     * }
     */
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)JOBOBJECT_NET_RATE_CONTROL_INFORMATION.ControlFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags;
     * }
     */
    public static void ControlFlags$set(MemorySegment seg, int x) {
        JOBOBJECT_NET_RATE_CONTROL_INFORMATION.ControlFlags$VH.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)JOBOBJECT_NET_RATE_CONTROL_INFORMATION.ControlFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        JOBOBJECT_NET_RATE_CONTROL_INFORMATION.ControlFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DscpTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DscpTag"));
    public static VarHandle DscpTag$VH() {
        return JOBOBJECT_NET_RATE_CONTROL_INFORMATION.DscpTag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE DscpTag;
     * }
     */
    public static byte DscpTag$get(MemorySegment seg) {
        return (byte)JOBOBJECT_NET_RATE_CONTROL_INFORMATION.DscpTag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE DscpTag;
     * }
     */
    public static void DscpTag$set(MemorySegment seg, byte x) {
        JOBOBJECT_NET_RATE_CONTROL_INFORMATION.DscpTag$VH.set(seg, x);
    }
    public static byte DscpTag$get(MemorySegment seg, long index) {
        return (byte)JOBOBJECT_NET_RATE_CONTROL_INFORMATION.DscpTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DscpTag$set(MemorySegment seg, long index, byte x) {
        JOBOBJECT_NET_RATE_CONTROL_INFORMATION.DscpTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


