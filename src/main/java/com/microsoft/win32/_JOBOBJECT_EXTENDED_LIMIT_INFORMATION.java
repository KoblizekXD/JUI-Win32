// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_EXTENDED_LIMIT_INFORMATION {
 *     JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation;
 *     IO_COUNTERS IoInfo;
 *     SIZE_T ProcessMemoryLimit;
 *     SIZE_T JobMemoryLimit;
 *     SIZE_T PeakProcessMemoryUsed;
 *     SIZE_T PeakJobMemoryUsed;
 * };
 * }
 */
public class _JOBOBJECT_EXTENDED_LIMIT_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("u"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
            ).withName("PerProcessUserTimeLimit"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                    Constants$root.C_LONG$LAYOUT.withName("HighPart")
                ).withName("u"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
            ).withName("PerJobUserTimeLimit"),
            Constants$root.C_LONG$LAYOUT.withName("LimitFlags"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("MinimumWorkingSetSize"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("MaximumWorkingSetSize"),
            Constants$root.C_LONG$LAYOUT.withName("ActiveProcessLimit"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Affinity"),
            Constants$root.C_LONG$LAYOUT.withName("PriorityClass"),
            Constants$root.C_LONG$LAYOUT.withName("SchedulingClass")
        ).withName("BasicLimitInformation"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("ReadOperationCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("WriteOperationCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("OtherOperationCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ReadTransferCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("WriteTransferCount"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("OtherTransferCount")
        ).withName("IoInfo"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ProcessMemoryLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("JobMemoryLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PeakProcessMemoryUsed"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PeakJobMemoryUsed")
    ).withName("_JOBOBJECT_EXTENDED_LIMIT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment BasicLimitInformation$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static MemorySegment IoInfo$slice(MemorySegment seg) {
        return seg.asSlice(64, 48);
    }
    static final VarHandle ProcessMemoryLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessMemoryLimit"));
    public static VarHandle ProcessMemoryLimit$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T ProcessMemoryLimit;
     * }
     */
    public static long ProcessMemoryLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T ProcessMemoryLimit;
     * }
     */
    public static void ProcessMemoryLimit$set(MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.set(seg, x);
    }
    public static long ProcessMemoryLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessMemoryLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobMemoryLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobMemoryLimit"));
    public static VarHandle JobMemoryLimit$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T JobMemoryLimit;
     * }
     */
    public static long JobMemoryLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T JobMemoryLimit;
     * }
     */
    public static void JobMemoryLimit$set(MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.set(seg, x);
    }
    public static long JobMemoryLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobMemoryLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PeakProcessMemoryUsed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PeakProcessMemoryUsed"));
    public static VarHandle PeakProcessMemoryUsed$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T PeakProcessMemoryUsed;
     * }
     */
    public static long PeakProcessMemoryUsed$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T PeakProcessMemoryUsed;
     * }
     */
    public static void PeakProcessMemoryUsed$set(MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.set(seg, x);
    }
    public static long PeakProcessMemoryUsed$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PeakProcessMemoryUsed$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PeakJobMemoryUsed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PeakJobMemoryUsed"));
    public static VarHandle PeakJobMemoryUsed$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T PeakJobMemoryUsed;
     * }
     */
    public static long PeakJobMemoryUsed$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T PeakJobMemoryUsed;
     * }
     */
    public static void PeakJobMemoryUsed$set(MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.set(seg, x);
    }
    public static long PeakJobMemoryUsed$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PeakJobMemoryUsed$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


