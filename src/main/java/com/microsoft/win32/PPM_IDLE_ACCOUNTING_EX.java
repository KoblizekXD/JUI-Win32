// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD StateCount;
 *     DWORD TotalTransitions;
 *     DWORD ResetCount;
 *     DWORD AbortCount;
 *     DWORD64 StartTime;
 *     PPM_IDLE_STATE_ACCOUNTING_EX State[1];
 * };
 * }
 */
public class PPM_IDLE_ACCOUNTING_EX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("StateCount"),
        Constants$root.C_LONG$LAYOUT.withName("TotalTransitions"),
        Constants$root.C_LONG$LAYOUT.withName("ResetCount"),
        Constants$root.C_LONG$LAYOUT.withName("AbortCount"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartTime"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("TotalTime"),
            Constants$root.C_LONG$LAYOUT.withName("IdleTransitions"),
            Constants$root.C_LONG$LAYOUT.withName("FailedTransitions"),
            Constants$root.C_LONG$LAYOUT.withName("InvalidBucketIndex"),
            Constants$root.C_LONG$LAYOUT.withName("MinTimeUs"),
            Constants$root.C_LONG$LAYOUT.withName("MaxTimeUs"),
            Constants$root.C_LONG$LAYOUT.withName("CancelledTransitions"),
            MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("TotalTimeUs"),
                Constants$root.C_LONG$LAYOUT.withName("MinTimeUs"),
                Constants$root.C_LONG$LAYOUT.withName("MaxTimeUs"),
                Constants$root.C_LONG$LAYOUT.withName("Count"),
                MemoryLayout.paddingLayout(32)
            )).withName("IdleTimeBuckets")
        )).withName("State")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_IDLE_ACCOUNTING_EX.$struct$LAYOUT;
    }
    static final VarHandle StateCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StateCount"));
    public static VarHandle StateCount$VH() {
        return PPM_IDLE_ACCOUNTING_EX.StateCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StateCount;
     * }
     */
    public static int StateCount$get(MemorySegment seg) {
        return (int)PPM_IDLE_ACCOUNTING_EX.StateCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StateCount;
     * }
     */
    public static void StateCount$set(MemorySegment seg, int x) {
        PPM_IDLE_ACCOUNTING_EX.StateCount$VH.set(seg, x);
    }
    public static int StateCount$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_ACCOUNTING_EX.StateCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StateCount$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_ACCOUNTING_EX.StateCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalTransitions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalTransitions"));
    public static VarHandle TotalTransitions$VH() {
        return PPM_IDLE_ACCOUNTING_EX.TotalTransitions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalTransitions;
     * }
     */
    public static int TotalTransitions$get(MemorySegment seg) {
        return (int)PPM_IDLE_ACCOUNTING_EX.TotalTransitions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalTransitions;
     * }
     */
    public static void TotalTransitions$set(MemorySegment seg, int x) {
        PPM_IDLE_ACCOUNTING_EX.TotalTransitions$VH.set(seg, x);
    }
    public static int TotalTransitions$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_ACCOUNTING_EX.TotalTransitions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalTransitions$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_ACCOUNTING_EX.TotalTransitions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ResetCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResetCount"));
    public static VarHandle ResetCount$VH() {
        return PPM_IDLE_ACCOUNTING_EX.ResetCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ResetCount;
     * }
     */
    public static int ResetCount$get(MemorySegment seg) {
        return (int)PPM_IDLE_ACCOUNTING_EX.ResetCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ResetCount;
     * }
     */
    public static void ResetCount$set(MemorySegment seg, int x) {
        PPM_IDLE_ACCOUNTING_EX.ResetCount$VH.set(seg, x);
    }
    public static int ResetCount$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_ACCOUNTING_EX.ResetCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResetCount$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_ACCOUNTING_EX.ResetCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AbortCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AbortCount"));
    public static VarHandle AbortCount$VH() {
        return PPM_IDLE_ACCOUNTING_EX.AbortCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AbortCount;
     * }
     */
    public static int AbortCount$get(MemorySegment seg) {
        return (int)PPM_IDLE_ACCOUNTING_EX.AbortCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AbortCount;
     * }
     */
    public static void AbortCount$set(MemorySegment seg, int x) {
        PPM_IDLE_ACCOUNTING_EX.AbortCount$VH.set(seg, x);
    }
    public static int AbortCount$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_ACCOUNTING_EX.AbortCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AbortCount$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_ACCOUNTING_EX.AbortCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StartTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartTime"));
    public static VarHandle StartTime$VH() {
        return PPM_IDLE_ACCOUNTING_EX.StartTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 StartTime;
     * }
     */
    public static long StartTime$get(MemorySegment seg) {
        return (long)PPM_IDLE_ACCOUNTING_EX.StartTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 StartTime;
     * }
     */
    public static void StartTime$set(MemorySegment seg, long x) {
        PPM_IDLE_ACCOUNTING_EX.StartTime$VH.set(seg, x);
    }
    public static long StartTime$get(MemorySegment seg, long index) {
        return (long)PPM_IDLE_ACCOUNTING_EX.StartTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartTime$set(MemorySegment seg, long index, long x) {
        PPM_IDLE_ACCOUNTING_EX.StartTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment State$slice(MemorySegment seg) {
        return seg.asSlice(24, 416);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

