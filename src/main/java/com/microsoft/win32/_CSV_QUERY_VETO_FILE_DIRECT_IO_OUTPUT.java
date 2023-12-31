// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT {
 *     DWORDLONG VetoedFromAltitudeIntegral;
 *     DWORDLONG VetoedFromAltitudeDecimal;
 *     WCHAR Reason[256];
 * };
 * }
 */
public class _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("VetoedFromAltitudeIntegral"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("VetoedFromAltitudeDecimal"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_SHORT$LAYOUT).withName("Reason")
    ).withName("_CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle VetoedFromAltitudeIntegral$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VetoedFromAltitudeIntegral"));
    public static VarHandle VetoedFromAltitudeIntegral$VH() {
        return _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeIntegral$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG VetoedFromAltitudeIntegral;
     * }
     */
    public static long VetoedFromAltitudeIntegral$get(MemorySegment seg) {
        return (long)_CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeIntegral$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG VetoedFromAltitudeIntegral;
     * }
     */
    public static void VetoedFromAltitudeIntegral$set(MemorySegment seg, long x) {
        _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeIntegral$VH.set(seg, x);
    }
    public static long VetoedFromAltitudeIntegral$get(MemorySegment seg, long index) {
        return (long)_CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeIntegral$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VetoedFromAltitudeIntegral$set(MemorySegment seg, long index, long x) {
        _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeIntegral$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VetoedFromAltitudeDecimal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VetoedFromAltitudeDecimal"));
    public static VarHandle VetoedFromAltitudeDecimal$VH() {
        return _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeDecimal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG VetoedFromAltitudeDecimal;
     * }
     */
    public static long VetoedFromAltitudeDecimal$get(MemorySegment seg) {
        return (long)_CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeDecimal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG VetoedFromAltitudeDecimal;
     * }
     */
    public static void VetoedFromAltitudeDecimal$set(MemorySegment seg, long x) {
        _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeDecimal$VH.set(seg, x);
    }
    public static long VetoedFromAltitudeDecimal$get(MemorySegment seg, long index) {
        return (long)_CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeDecimal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VetoedFromAltitudeDecimal$set(MemorySegment seg, long index, long x) {
        _CSV_QUERY_VETO_FILE_DIRECT_IO_OUTPUT.VetoedFromAltitudeDecimal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reason$slice(MemorySegment seg) {
        return seg.asSlice(16, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


