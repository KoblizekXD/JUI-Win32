// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_BASIC_LIMIT_INFORMATION {
 *     LARGE_INTEGER PerProcessUserTimeLimit;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD LimitFlags;
 *     SIZE_T MinimumWorkingSetSize;
 *     SIZE_T MaximumWorkingSetSize;
 *     DWORD ActiveProcessLimit;
 *     ULONG_PTR Affinity;
 *     DWORD PriorityClass;
 *     DWORD SchedulingClass;
 * };
 * }
 */
public class _JOBOBJECT_BASIC_LIMIT_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("_JOBOBJECT_BASIC_LIMIT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment PerProcessUserTimeLimit$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment PerJobUserTimeLimit$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle LimitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitFlags"));
    public static VarHandle LimitFlags$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.LimitFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LimitFlags;
     * }
     */
    public static int LimitFlags$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.LimitFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LimitFlags;
     * }
     */
    public static void LimitFlags$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.LimitFlags$VH.set(seg, x);
    }
    public static int LimitFlags$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.LimitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitFlags$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.LimitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinimumWorkingSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinimumWorkingSetSize"));
    public static VarHandle MinimumWorkingSetSize$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.MinimumWorkingSetSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T MinimumWorkingSetSize;
     * }
     */
    public static long MinimumWorkingSetSize$get(MemorySegment seg) {
        return (long)_JOBOBJECT_BASIC_LIMIT_INFORMATION.MinimumWorkingSetSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T MinimumWorkingSetSize;
     * }
     */
    public static void MinimumWorkingSetSize$set(MemorySegment seg, long x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.MinimumWorkingSetSize$VH.set(seg, x);
    }
    public static long MinimumWorkingSetSize$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_BASIC_LIMIT_INFORMATION.MinimumWorkingSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinimumWorkingSetSize$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.MinimumWorkingSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaximumWorkingSetSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaximumWorkingSetSize"));
    public static VarHandle MaximumWorkingSetSize$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.MaximumWorkingSetSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SIZE_T MaximumWorkingSetSize;
     * }
     */
    public static long MaximumWorkingSetSize$get(MemorySegment seg) {
        return (long)_JOBOBJECT_BASIC_LIMIT_INFORMATION.MaximumWorkingSetSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SIZE_T MaximumWorkingSetSize;
     * }
     */
    public static void MaximumWorkingSetSize$set(MemorySegment seg, long x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.MaximumWorkingSetSize$VH.set(seg, x);
    }
    public static long MaximumWorkingSetSize$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_BASIC_LIMIT_INFORMATION.MaximumWorkingSetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaximumWorkingSetSize$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.MaximumWorkingSetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActiveProcessLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActiveProcessLimit"));
    public static VarHandle ActiveProcessLimit$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.ActiveProcessLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ActiveProcessLimit;
     * }
     */
    public static int ActiveProcessLimit$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.ActiveProcessLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ActiveProcessLimit;
     * }
     */
    public static void ActiveProcessLimit$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.ActiveProcessLimit$VH.set(seg, x);
    }
    public static int ActiveProcessLimit$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.ActiveProcessLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcessLimit$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.ActiveProcessLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Affinity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Affinity"));
    public static VarHandle Affinity$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.Affinity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR Affinity;
     * }
     */
    public static long Affinity$get(MemorySegment seg) {
        return (long)_JOBOBJECT_BASIC_LIMIT_INFORMATION.Affinity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR Affinity;
     * }
     */
    public static void Affinity$set(MemorySegment seg, long x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.Affinity$VH.set(seg, x);
    }
    public static long Affinity$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_BASIC_LIMIT_INFORMATION.Affinity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Affinity$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.Affinity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PriorityClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PriorityClass"));
    public static VarHandle PriorityClass$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.PriorityClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PriorityClass;
     * }
     */
    public static int PriorityClass$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.PriorityClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PriorityClass;
     * }
     */
    public static void PriorityClass$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.PriorityClass$VH.set(seg, x);
    }
    public static int PriorityClass$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.PriorityClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PriorityClass$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.PriorityClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SchedulingClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SchedulingClass"));
    public static VarHandle SchedulingClass$VH() {
        return _JOBOBJECT_BASIC_LIMIT_INFORMATION.SchedulingClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SchedulingClass;
     * }
     */
    public static int SchedulingClass$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.SchedulingClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SchedulingClass;
     * }
     */
    public static void SchedulingClass$set(MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.SchedulingClass$VH.set(seg, x);
    }
    public static int SchedulingClass$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_LIMIT_INFORMATION.SchedulingClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SchedulingClass$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_LIMIT_INFORMATION.SchedulingClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


