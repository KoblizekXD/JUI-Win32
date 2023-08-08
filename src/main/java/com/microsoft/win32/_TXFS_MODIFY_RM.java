// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_MODIFY_RM {
 *     DWORD Flags;
 *     DWORD LogContainerCountMax;
 *     DWORD LogContainerCountMin;
 *     DWORD LogContainerCount;
 *     DWORD LogGrowthIncrement;
 *     DWORD LogAutoShrinkPercentage;
 *     DWORDLONG Reserved;
 *     WORD LoggingMode;
 * };
 * }
 */
public class _TXFS_MODIFY_RM {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCountMax"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCountMin"),
        Constants$root.C_LONG$LAYOUT.withName("LogContainerCount"),
        Constants$root.C_LONG$LAYOUT.withName("LogGrowthIncrement"),
        Constants$root.C_LONG$LAYOUT.withName("LogAutoShrinkPercentage"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Reserved"),
        Constants$root.C_SHORT$LAYOUT.withName("LoggingMode"),
        MemoryLayout.paddingLayout(48)
    ).withName("_TXFS_MODIFY_RM");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_MODIFY_RM.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _TXFS_MODIFY_RM.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_TXFS_MODIFY_RM.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _TXFS_MODIFY_RM.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_TXFS_MODIFY_RM.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _TXFS_MODIFY_RM.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCountMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCountMax"));
    public static VarHandle LogContainerCountMax$VH() {
        return _TXFS_MODIFY_RM.LogContainerCountMax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LogContainerCountMax;
     * }
     */
    public static int LogContainerCountMax$get(MemorySegment seg) {
        return (int)_TXFS_MODIFY_RM.LogContainerCountMax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LogContainerCountMax;
     * }
     */
    public static void LogContainerCountMax$set(MemorySegment seg, int x) {
        _TXFS_MODIFY_RM.LogContainerCountMax$VH.set(seg, x);
    }
    public static int LogContainerCountMax$get(MemorySegment seg, long index) {
        return (int)_TXFS_MODIFY_RM.LogContainerCountMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCountMax$set(MemorySegment seg, long index, int x) {
        _TXFS_MODIFY_RM.LogContainerCountMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCountMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCountMin"));
    public static VarHandle LogContainerCountMin$VH() {
        return _TXFS_MODIFY_RM.LogContainerCountMin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LogContainerCountMin;
     * }
     */
    public static int LogContainerCountMin$get(MemorySegment seg) {
        return (int)_TXFS_MODIFY_RM.LogContainerCountMin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LogContainerCountMin;
     * }
     */
    public static void LogContainerCountMin$set(MemorySegment seg, int x) {
        _TXFS_MODIFY_RM.LogContainerCountMin$VH.set(seg, x);
    }
    public static int LogContainerCountMin$get(MemorySegment seg, long index) {
        return (int)_TXFS_MODIFY_RM.LogContainerCountMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCountMin$set(MemorySegment seg, long index, int x) {
        _TXFS_MODIFY_RM.LogContainerCountMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogContainerCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogContainerCount"));
    public static VarHandle LogContainerCount$VH() {
        return _TXFS_MODIFY_RM.LogContainerCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LogContainerCount;
     * }
     */
    public static int LogContainerCount$get(MemorySegment seg) {
        return (int)_TXFS_MODIFY_RM.LogContainerCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LogContainerCount;
     * }
     */
    public static void LogContainerCount$set(MemorySegment seg, int x) {
        _TXFS_MODIFY_RM.LogContainerCount$VH.set(seg, x);
    }
    public static int LogContainerCount$get(MemorySegment seg, long index) {
        return (int)_TXFS_MODIFY_RM.LogContainerCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogContainerCount$set(MemorySegment seg, long index, int x) {
        _TXFS_MODIFY_RM.LogContainerCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogGrowthIncrement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogGrowthIncrement"));
    public static VarHandle LogGrowthIncrement$VH() {
        return _TXFS_MODIFY_RM.LogGrowthIncrement$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LogGrowthIncrement;
     * }
     */
    public static int LogGrowthIncrement$get(MemorySegment seg) {
        return (int)_TXFS_MODIFY_RM.LogGrowthIncrement$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LogGrowthIncrement;
     * }
     */
    public static void LogGrowthIncrement$set(MemorySegment seg, int x) {
        _TXFS_MODIFY_RM.LogGrowthIncrement$VH.set(seg, x);
    }
    public static int LogGrowthIncrement$get(MemorySegment seg, long index) {
        return (int)_TXFS_MODIFY_RM.LogGrowthIncrement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogGrowthIncrement$set(MemorySegment seg, long index, int x) {
        _TXFS_MODIFY_RM.LogGrowthIncrement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LogAutoShrinkPercentage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LogAutoShrinkPercentage"));
    public static VarHandle LogAutoShrinkPercentage$VH() {
        return _TXFS_MODIFY_RM.LogAutoShrinkPercentage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LogAutoShrinkPercentage;
     * }
     */
    public static int LogAutoShrinkPercentage$get(MemorySegment seg) {
        return (int)_TXFS_MODIFY_RM.LogAutoShrinkPercentage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LogAutoShrinkPercentage;
     * }
     */
    public static void LogAutoShrinkPercentage$set(MemorySegment seg, int x) {
        _TXFS_MODIFY_RM.LogAutoShrinkPercentage$VH.set(seg, x);
    }
    public static int LogAutoShrinkPercentage$get(MemorySegment seg, long index) {
        return (int)_TXFS_MODIFY_RM.LogAutoShrinkPercentage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LogAutoShrinkPercentage$set(MemorySegment seg, long index, int x) {
        _TXFS_MODIFY_RM.LogAutoShrinkPercentage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _TXFS_MODIFY_RM.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG Reserved;
     * }
     */
    public static long Reserved$get(MemorySegment seg) {
        return (long)_TXFS_MODIFY_RM.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, long x) {
        _TXFS_MODIFY_RM.Reserved$VH.set(seg, x);
    }
    public static long Reserved$get(MemorySegment seg, long index) {
        return (long)_TXFS_MODIFY_RM.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, long x) {
        _TXFS_MODIFY_RM.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LoggingMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LoggingMode"));
    public static VarHandle LoggingMode$VH() {
        return _TXFS_MODIFY_RM.LoggingMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LoggingMode;
     * }
     */
    public static short LoggingMode$get(MemorySegment seg) {
        return (short)_TXFS_MODIFY_RM.LoggingMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LoggingMode;
     * }
     */
    public static void LoggingMode$set(MemorySegment seg, short x) {
        _TXFS_MODIFY_RM.LoggingMode$VH.set(seg, x);
    }
    public static short LoggingMode$get(MemorySegment seg, long index) {
        return (short)_TXFS_MODIFY_RM.LoggingMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LoggingMode$set(MemorySegment seg, long index, short x) {
        _TXFS_MODIFY_RM.LoggingMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

