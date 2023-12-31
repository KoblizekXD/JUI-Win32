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
 *     DWORD Latency;
 *     DWORD Power;
 *     DWORD TimeCheck;
 *     BYTE PromotePercent;
 *     BYTE DemotePercent;
 *     BYTE StateType;
 *     BYTE Reserved;
 *     DWORD StateFlags;
 *     DWORD Context;
 *     DWORD IdleHandler;
 *     DWORD Reserved1;
 * };
 * }
 */
public class PPM_WMI_IDLE_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Latency"),
        Constants$root.C_LONG$LAYOUT.withName("Power"),
        Constants$root.C_LONG$LAYOUT.withName("TimeCheck"),
        Constants$root.C_CHAR$LAYOUT.withName("PromotePercent"),
        Constants$root.C_CHAR$LAYOUT.withName("DemotePercent"),
        Constants$root.C_CHAR$LAYOUT.withName("StateType"),
        Constants$root.C_CHAR$LAYOUT.withName("Reserved"),
        Constants$root.C_LONG$LAYOUT.withName("StateFlags"),
        Constants$root.C_LONG$LAYOUT.withName("Context"),
        Constants$root.C_LONG$LAYOUT.withName("IdleHandler"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved1")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_WMI_IDLE_STATE.$struct$LAYOUT;
    }
    static final VarHandle Latency$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Latency"));
    public static VarHandle Latency$VH() {
        return PPM_WMI_IDLE_STATE.Latency$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Latency;
     * }
     */
    public static int Latency$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.Latency$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Latency;
     * }
     */
    public static void Latency$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.Latency$VH.set(seg, x);
    }
    public static int Latency$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.Latency$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Latency$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.Latency$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Power$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Power"));
    public static VarHandle Power$VH() {
        return PPM_WMI_IDLE_STATE.Power$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Power;
     * }
     */
    public static int Power$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.Power$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Power;
     * }
     */
    public static void Power$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.Power$VH.set(seg, x);
    }
    public static int Power$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.Power$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Power$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.Power$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeCheck$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeCheck"));
    public static VarHandle TimeCheck$VH() {
        return PPM_WMI_IDLE_STATE.TimeCheck$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeCheck;
     * }
     */
    public static int TimeCheck$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.TimeCheck$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeCheck;
     * }
     */
    public static void TimeCheck$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.TimeCheck$VH.set(seg, x);
    }
    public static int TimeCheck$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.TimeCheck$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeCheck$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.TimeCheck$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PromotePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PromotePercent"));
    public static VarHandle PromotePercent$VH() {
        return PPM_WMI_IDLE_STATE.PromotePercent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE PromotePercent;
     * }
     */
    public static byte PromotePercent$get(MemorySegment seg) {
        return (byte)PPM_WMI_IDLE_STATE.PromotePercent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE PromotePercent;
     * }
     */
    public static void PromotePercent$set(MemorySegment seg, byte x) {
        PPM_WMI_IDLE_STATE.PromotePercent$VH.set(seg, x);
    }
    public static byte PromotePercent$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_IDLE_STATE.PromotePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PromotePercent$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_IDLE_STATE.PromotePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DemotePercent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DemotePercent"));
    public static VarHandle DemotePercent$VH() {
        return PPM_WMI_IDLE_STATE.DemotePercent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE DemotePercent;
     * }
     */
    public static byte DemotePercent$get(MemorySegment seg) {
        return (byte)PPM_WMI_IDLE_STATE.DemotePercent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE DemotePercent;
     * }
     */
    public static void DemotePercent$set(MemorySegment seg, byte x) {
        PPM_WMI_IDLE_STATE.DemotePercent$VH.set(seg, x);
    }
    public static byte DemotePercent$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_IDLE_STATE.DemotePercent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DemotePercent$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_IDLE_STATE.DemotePercent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StateType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StateType"));
    public static VarHandle StateType$VH() {
        return PPM_WMI_IDLE_STATE.StateType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE StateType;
     * }
     */
    public static byte StateType$get(MemorySegment seg) {
        return (byte)PPM_WMI_IDLE_STATE.StateType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE StateType;
     * }
     */
    public static void StateType$set(MemorySegment seg, byte x) {
        PPM_WMI_IDLE_STATE.StateType$VH.set(seg, x);
    }
    public static byte StateType$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_IDLE_STATE.StateType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StateType$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_IDLE_STATE.StateType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return PPM_WMI_IDLE_STATE.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Reserved;
     * }
     */
    public static byte Reserved$get(MemorySegment seg) {
        return (byte)PPM_WMI_IDLE_STATE.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, byte x) {
        PPM_WMI_IDLE_STATE.Reserved$VH.set(seg, x);
    }
    public static byte Reserved$get(MemorySegment seg, long index) {
        return (byte)PPM_WMI_IDLE_STATE.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, byte x) {
        PPM_WMI_IDLE_STATE.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StateFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StateFlags"));
    public static VarHandle StateFlags$VH() {
        return PPM_WMI_IDLE_STATE.StateFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StateFlags;
     * }
     */
    public static int StateFlags$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.StateFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StateFlags;
     * }
     */
    public static void StateFlags$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.StateFlags$VH.set(seg, x);
    }
    public static int StateFlags$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.StateFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StateFlags$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.StateFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Context"));
    public static VarHandle Context$VH() {
        return PPM_WMI_IDLE_STATE.Context$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Context;
     * }
     */
    public static int Context$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.Context$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Context;
     * }
     */
    public static void Context$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.Context$VH.set(seg, x);
    }
    public static int Context$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.Context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Context$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.Context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdleHandler$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdleHandler"));
    public static VarHandle IdleHandler$VH() {
        return PPM_WMI_IDLE_STATE.IdleHandler$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IdleHandler;
     * }
     */
    public static int IdleHandler$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.IdleHandler$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IdleHandler;
     * }
     */
    public static void IdleHandler$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.IdleHandler$VH.set(seg, x);
    }
    public static int IdleHandler$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.IdleHandler$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdleHandler$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.IdleHandler$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return PPM_WMI_IDLE_STATE.Reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved1;
     * }
     */
    public static int Reserved1$get(MemorySegment seg) {
        return (int)PPM_WMI_IDLE_STATE.Reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved1;
     * }
     */
    public static void Reserved1$set(MemorySegment seg, int x) {
        PPM_WMI_IDLE_STATE.Reserved1$VH.set(seg, x);
    }
    public static int Reserved1$get(MemorySegment seg, long index) {
        return (int)PPM_WMI_IDLE_STATE.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, int x) {
        PPM_WMI_IDLE_STATE.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


