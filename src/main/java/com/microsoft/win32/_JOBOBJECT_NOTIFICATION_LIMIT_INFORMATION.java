// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {
 *     DWORD64 IoReadBytesLimit;
 *     DWORD64 IoWriteBytesLimit;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD64 JobMemoryLimit;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval;
 *     DWORD LimitFlags;
 * };
 * }
 */
public class _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoReadBytesLimit"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("IoWriteBytesLimit"),
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
        Constants$root.C_LONG_LONG$LAYOUT.withName("JobMemoryLimit"),
        Constants$root.C_LONG$LAYOUT.withName("RateControlTolerance"),
        Constants$root.C_LONG$LAYOUT.withName("RateControlToleranceInterval"),
        Constants$root.C_LONG$LAYOUT.withName("LimitFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle IoReadBytesLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoReadBytesLimit"));
    public static VarHandle IoReadBytesLimit$VH() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoReadBytesLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 IoReadBytesLimit;
     * }
     */
    public static long IoReadBytesLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoReadBytesLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 IoReadBytesLimit;
     * }
     */
    public static void IoReadBytesLimit$set(MemorySegment seg, long x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoReadBytesLimit$VH.set(seg, x);
    }
    public static long IoReadBytesLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoReadBytesLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoReadBytesLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoReadBytesLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IoWriteBytesLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoWriteBytesLimit"));
    public static VarHandle IoWriteBytesLimit$VH() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoWriteBytesLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 IoWriteBytesLimit;
     * }
     */
    public static long IoWriteBytesLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoWriteBytesLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 IoWriteBytesLimit;
     * }
     */
    public static void IoWriteBytesLimit$set(MemorySegment seg, long x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoWriteBytesLimit$VH.set(seg, x);
    }
    public static long IoWriteBytesLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoWriteBytesLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoWriteBytesLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.IoWriteBytesLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PerJobUserTimeLimit$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle JobMemoryLimit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobMemoryLimit"));
    public static VarHandle JobMemoryLimit$VH() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.JobMemoryLimit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 JobMemoryLimit;
     * }
     */
    public static long JobMemoryLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.JobMemoryLimit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 JobMemoryLimit;
     * }
     */
    public static void JobMemoryLimit$set(MemorySegment seg, long x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.JobMemoryLimit$VH.set(seg, x);
    }
    public static long JobMemoryLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.JobMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobMemoryLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.JobMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RateControlTolerance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RateControlTolerance"));
    public static VarHandle RateControlTolerance$VH() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlTolerance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
     * }
     */
    public static int RateControlTolerance$get(MemorySegment seg) {
        return (int)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlTolerance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
     * }
     */
    public static void RateControlTolerance$set(MemorySegment seg, int x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlTolerance$VH.set(seg, x);
    }
    public static int RateControlTolerance$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlTolerance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RateControlTolerance$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlTolerance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RateControlToleranceInterval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RateControlToleranceInterval"));
    public static VarHandle RateControlToleranceInterval$VH() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlToleranceInterval$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval;
     * }
     */
    public static int RateControlToleranceInterval$get(MemorySegment seg) {
        return (int)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlToleranceInterval$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval;
     * }
     */
    public static void RateControlToleranceInterval$set(MemorySegment seg, int x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlToleranceInterval$VH.set(seg, x);
    }
    public static int RateControlToleranceInterval$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlToleranceInterval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RateControlToleranceInterval$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.RateControlToleranceInterval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LimitFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LimitFlags"));
    public static VarHandle LimitFlags$VH() {
        return _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.LimitFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LimitFlags;
     * }
     */
    public static int LimitFlags$get(MemorySegment seg) {
        return (int)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.LimitFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LimitFlags;
     * }
     */
    public static void LimitFlags$set(MemorySegment seg, int x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.LimitFlags$VH.set(seg, x);
    }
    public static int LimitFlags$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.LimitFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitFlags$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION.LimitFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


