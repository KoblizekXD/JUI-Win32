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
 *     BOOLEAN AcOnLine;
 *     BOOLEAN BatteryPresent;
 *     BOOLEAN Charging;
 *     BOOLEAN Discharging;
 *     BOOLEAN Spare1[3];
 *     BYTE Tag;
 *     DWORD MaxCapacity;
 *     DWORD RemainingCapacity;
 *     DWORD Rate;
 *     DWORD EstimatedTime;
 *     DWORD DefaultAlert1;
 *     DWORD DefaultAlert2;
 * };
 * }
 */
public class SYSTEM_BATTERY_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("AcOnLine"),
        Constants$root.C_CHAR$LAYOUT.withName("BatteryPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("Charging"),
        Constants$root.C_CHAR$LAYOUT.withName("Discharging"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Spare1"),
        Constants$root.C_CHAR$LAYOUT.withName("Tag"),
        Constants$root.C_LONG$LAYOUT.withName("MaxCapacity"),
        Constants$root.C_LONG$LAYOUT.withName("RemainingCapacity"),
        Constants$root.C_LONG$LAYOUT.withName("Rate"),
        Constants$root.C_LONG$LAYOUT.withName("EstimatedTime"),
        Constants$root.C_LONG$LAYOUT.withName("DefaultAlert1"),
        Constants$root.C_LONG$LAYOUT.withName("DefaultAlert2")
    );
    public static MemoryLayout $LAYOUT() {
        return SYSTEM_BATTERY_STATE.$struct$LAYOUT;
    }
    static final VarHandle AcOnLine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AcOnLine"));
    public static VarHandle AcOnLine$VH() {
        return SYSTEM_BATTERY_STATE.AcOnLine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN AcOnLine;
     * }
     */
    public static byte AcOnLine$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.AcOnLine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN AcOnLine;
     * }
     */
    public static void AcOnLine$set(MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.AcOnLine$VH.set(seg, x);
    }
    public static byte AcOnLine$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.AcOnLine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AcOnLine$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.AcOnLine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BatteryPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BatteryPresent"));
    public static VarHandle BatteryPresent$VH() {
        return SYSTEM_BATTERY_STATE.BatteryPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN BatteryPresent;
     * }
     */
    public static byte BatteryPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.BatteryPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN BatteryPresent;
     * }
     */
    public static void BatteryPresent$set(MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.BatteryPresent$VH.set(seg, x);
    }
    public static byte BatteryPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.BatteryPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BatteryPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.BatteryPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Charging$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Charging"));
    public static VarHandle Charging$VH() {
        return SYSTEM_BATTERY_STATE.Charging$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN Charging;
     * }
     */
    public static byte Charging$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.Charging$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN Charging;
     * }
     */
    public static void Charging$set(MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.Charging$VH.set(seg, x);
    }
    public static byte Charging$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.Charging$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Charging$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.Charging$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Discharging$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Discharging"));
    public static VarHandle Discharging$VH() {
        return SYSTEM_BATTERY_STATE.Discharging$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN Discharging;
     * }
     */
    public static byte Discharging$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.Discharging$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN Discharging;
     * }
     */
    public static void Discharging$set(MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.Discharging$VH.set(seg, x);
    }
    public static byte Discharging$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.Discharging$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Discharging$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.Discharging$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Spare1$slice(MemorySegment seg) {
        return seg.asSlice(4, 3);
    }
    static final VarHandle Tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Tag"));
    public static VarHandle Tag$VH() {
        return SYSTEM_BATTERY_STATE.Tag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Tag;
     * }
     */
    public static byte Tag$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.Tag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Tag;
     * }
     */
    public static void Tag$set(MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.Tag$VH.set(seg, x);
    }
    public static byte Tag$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.Tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Tag$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.Tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxCapacity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxCapacity"));
    public static VarHandle MaxCapacity$VH() {
        return SYSTEM_BATTERY_STATE.MaxCapacity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxCapacity;
     * }
     */
    public static int MaxCapacity$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.MaxCapacity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxCapacity;
     * }
     */
    public static void MaxCapacity$set(MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.MaxCapacity$VH.set(seg, x);
    }
    public static int MaxCapacity$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.MaxCapacity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCapacity$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.MaxCapacity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RemainingCapacity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RemainingCapacity"));
    public static VarHandle RemainingCapacity$VH() {
        return SYSTEM_BATTERY_STATE.RemainingCapacity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RemainingCapacity;
     * }
     */
    public static int RemainingCapacity$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.RemainingCapacity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RemainingCapacity;
     * }
     */
    public static void RemainingCapacity$set(MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.RemainingCapacity$VH.set(seg, x);
    }
    public static int RemainingCapacity$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.RemainingCapacity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RemainingCapacity$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.RemainingCapacity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Rate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Rate"));
    public static VarHandle Rate$VH() {
        return SYSTEM_BATTERY_STATE.Rate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Rate;
     * }
     */
    public static int Rate$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.Rate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Rate;
     * }
     */
    public static void Rate$set(MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.Rate$VH.set(seg, x);
    }
    public static int Rate$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.Rate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Rate$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.Rate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EstimatedTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EstimatedTime"));
    public static VarHandle EstimatedTime$VH() {
        return SYSTEM_BATTERY_STATE.EstimatedTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD EstimatedTime;
     * }
     */
    public static int EstimatedTime$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.EstimatedTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD EstimatedTime;
     * }
     */
    public static void EstimatedTime$set(MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.EstimatedTime$VH.set(seg, x);
    }
    public static int EstimatedTime$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.EstimatedTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EstimatedTime$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.EstimatedTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultAlert1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultAlert1"));
    public static VarHandle DefaultAlert1$VH() {
        return SYSTEM_BATTERY_STATE.DefaultAlert1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DefaultAlert1;
     * }
     */
    public static int DefaultAlert1$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DefaultAlert1;
     * }
     */
    public static void DefaultAlert1$set(MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert1$VH.set(seg, x);
    }
    public static int DefaultAlert1$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultAlert1$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultAlert2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultAlert2"));
    public static VarHandle DefaultAlert2$VH() {
        return SYSTEM_BATTERY_STATE.DefaultAlert2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DefaultAlert2;
     * }
     */
    public static int DefaultAlert2$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DefaultAlert2;
     * }
     */
    public static void DefaultAlert2$set(MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert2$VH.set(seg, x);
    }
    public static int DefaultAlert2$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultAlert2$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


