// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOB_INFO_3 {
 *     DWORD JobId;
 *     DWORD NextJobId;
 *     DWORD Reserved;
 * };
 * }
 */
public class _JOB_INFO_3 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("JobId"),
        Constants$root.C_LONG$LAYOUT.withName("NextJobId"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_JOB_INFO_3");
    public static MemoryLayout $LAYOUT() {
        return _JOB_INFO_3.$struct$LAYOUT;
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _JOB_INFO_3.JobId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_3.JobId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        _JOB_INFO_3.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_3.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_3.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NextJobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextJobId"));
    public static VarHandle NextJobId$VH() {
        return _JOB_INFO_3.NextJobId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NextJobId;
     * }
     */
    public static int NextJobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_3.NextJobId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NextJobId;
     * }
     */
    public static void NextJobId$set(MemorySegment seg, int x) {
        _JOB_INFO_3.NextJobId$VH.set(seg, x);
    }
    public static int NextJobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_3.NextJobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextJobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_3.NextJobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _JOB_INFO_3.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_JOB_INFO_3.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _JOB_INFO_3.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_3.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_3.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


