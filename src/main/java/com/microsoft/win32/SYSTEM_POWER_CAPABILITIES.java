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
 *     BOOLEAN PowerButtonPresent;
 *     BOOLEAN SleepButtonPresent;
 *     BOOLEAN LidPresent;
 *     BOOLEAN SystemS1;
 *     BOOLEAN SystemS2;
 *     BOOLEAN SystemS3;
 *     BOOLEAN SystemS4;
 *     BOOLEAN SystemS5;
 *     BOOLEAN HiberFilePresent;
 *     BOOLEAN FullWake;
 *     BOOLEAN VideoDimPresent;
 *     BOOLEAN ApmPresent;
 *     BOOLEAN UpsPresent;
 *     BOOLEAN ThermalControl;
 *     BOOLEAN ProcessorThrottle;
 *     BYTE ProcessorMinThrottle;
 *     BYTE ProcessorMaxThrottle;
 *     BOOLEAN FastSystemS4;
 *     BOOLEAN Hiberboot;
 *     BOOLEAN WakeAlarmPresent;
 *     BOOLEAN AoAc;
 *     BOOLEAN DiskSpinDown;
 *     BYTE HiberFileType;
 *     BOOLEAN AoAcConnectivitySupported;
 *     BYTE spare3[6];
 *     BOOLEAN SystemBatteriesPresent;
 *     BOOLEAN BatteriesAreShortTerm;
 *     BATTERY_REPORTING_SCALE BatteryScale[3];
 *     SYSTEM_POWER_STATE AcOnLineWake;
 *     SYSTEM_POWER_STATE SoftLidWake;
 *     SYSTEM_POWER_STATE RtcWake;
 *     SYSTEM_POWER_STATE MinDeviceWakeState;
 *     SYSTEM_POWER_STATE DefaultLowLatencyWake;
 * };
 * }
 */
public class SYSTEM_POWER_CAPABILITIES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("PowerButtonPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("SleepButtonPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("LidPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("SystemS1"),
        Constants$root.C_CHAR$LAYOUT.withName("SystemS2"),
        Constants$root.C_CHAR$LAYOUT.withName("SystemS3"),
        Constants$root.C_CHAR$LAYOUT.withName("SystemS4"),
        Constants$root.C_CHAR$LAYOUT.withName("SystemS5"),
        Constants$root.C_CHAR$LAYOUT.withName("HiberFilePresent"),
        Constants$root.C_CHAR$LAYOUT.withName("FullWake"),
        Constants$root.C_CHAR$LAYOUT.withName("VideoDimPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("ApmPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("UpsPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("ThermalControl"),
        Constants$root.C_CHAR$LAYOUT.withName("ProcessorThrottle"),
        Constants$root.C_CHAR$LAYOUT.withName("ProcessorMinThrottle"),
        Constants$root.C_CHAR$LAYOUT.withName("ProcessorMaxThrottle"),
        Constants$root.C_CHAR$LAYOUT.withName("FastSystemS4"),
        Constants$root.C_CHAR$LAYOUT.withName("Hiberboot"),
        Constants$root.C_CHAR$LAYOUT.withName("WakeAlarmPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("AoAc"),
        Constants$root.C_CHAR$LAYOUT.withName("DiskSpinDown"),
        Constants$root.C_CHAR$LAYOUT.withName("HiberFileType"),
        Constants$root.C_CHAR$LAYOUT.withName("AoAcConnectivitySupported"),
        MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("spare3"),
        Constants$root.C_CHAR$LAYOUT.withName("SystemBatteriesPresent"),
        Constants$root.C_CHAR$LAYOUT.withName("BatteriesAreShortTerm"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Granularity"),
            Constants$root.C_LONG$LAYOUT.withName("Capacity")
        )).withName("BatteryScale"),
        Constants$root.C_LONG$LAYOUT.withName("AcOnLineWake"),
        Constants$root.C_LONG$LAYOUT.withName("SoftLidWake"),
        Constants$root.C_LONG$LAYOUT.withName("RtcWake"),
        Constants$root.C_LONG$LAYOUT.withName("MinDeviceWakeState"),
        Constants$root.C_LONG$LAYOUT.withName("DefaultLowLatencyWake")
    );
    public static MemoryLayout $LAYOUT() {
        return SYSTEM_POWER_CAPABILITIES.$struct$LAYOUT;
    }
    static final VarHandle PowerButtonPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PowerButtonPresent"));
    public static VarHandle PowerButtonPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN PowerButtonPresent;
     * }
     */
    public static byte PowerButtonPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN PowerButtonPresent;
     * }
     */
    public static void PowerButtonPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.set(seg, x);
    }
    public static byte PowerButtonPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PowerButtonPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.PowerButtonPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SleepButtonPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SleepButtonPresent"));
    public static VarHandle SleepButtonPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SleepButtonPresent;
     * }
     */
    public static byte SleepButtonPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SleepButtonPresent;
     * }
     */
    public static void SleepButtonPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.set(seg, x);
    }
    public static byte SleepButtonPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SleepButtonPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SleepButtonPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LidPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LidPresent"));
    public static VarHandle LidPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.LidPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN LidPresent;
     * }
     */
    public static byte LidPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.LidPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN LidPresent;
     * }
     */
    public static void LidPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.LidPresent$VH.set(seg, x);
    }
    public static byte LidPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.LidPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LidPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.LidPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SystemS1"));
    public static VarHandle SystemS1$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SystemS1;
     * }
     */
    public static byte SystemS1$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SystemS1;
     * }
     */
    public static void SystemS1$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS1$VH.set(seg, x);
    }
    public static byte SystemS1$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS1$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SystemS2"));
    public static VarHandle SystemS2$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SystemS2;
     * }
     */
    public static byte SystemS2$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SystemS2;
     * }
     */
    public static void SystemS2$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS2$VH.set(seg, x);
    }
    public static byte SystemS2$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS2$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SystemS3"));
    public static VarHandle SystemS3$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SystemS3;
     * }
     */
    public static byte SystemS3$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SystemS3;
     * }
     */
    public static void SystemS3$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS3$VH.set(seg, x);
    }
    public static byte SystemS3$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS3$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SystemS4"));
    public static VarHandle SystemS4$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SystemS4;
     * }
     */
    public static byte SystemS4$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SystemS4;
     * }
     */
    public static void SystemS4$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS4$VH.set(seg, x);
    }
    public static byte SystemS4$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS4$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SystemS5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SystemS5"));
    public static VarHandle SystemS5$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemS5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SystemS5;
     * }
     */
    public static byte SystemS5$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SystemS5;
     * }
     */
    public static void SystemS5$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS5$VH.set(seg, x);
    }
    public static byte SystemS5$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemS5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemS5$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemS5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HiberFilePresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HiberFilePresent"));
    public static VarHandle HiberFilePresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN HiberFilePresent;
     * }
     */
    public static byte HiberFilePresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN HiberFilePresent;
     * }
     */
    public static void HiberFilePresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.set(seg, x);
    }
    public static byte HiberFilePresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HiberFilePresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.HiberFilePresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FullWake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FullWake"));
    public static VarHandle FullWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.FullWake$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN FullWake;
     * }
     */
    public static byte FullWake$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FullWake$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN FullWake;
     * }
     */
    public static void FullWake$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.FullWake$VH.set(seg, x);
    }
    public static byte FullWake$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FullWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FullWake$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.FullWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VideoDimPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("VideoDimPresent"));
    public static VarHandle VideoDimPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN VideoDimPresent;
     * }
     */
    public static byte VideoDimPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN VideoDimPresent;
     * }
     */
    public static void VideoDimPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.set(seg, x);
    }
    public static byte VideoDimPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VideoDimPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.VideoDimPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ApmPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ApmPresent"));
    public static VarHandle ApmPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.ApmPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN ApmPresent;
     * }
     */
    public static byte ApmPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN ApmPresent;
     * }
     */
    public static void ApmPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.set(seg, x);
    }
    public static byte ApmPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ApmPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ApmPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UpsPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UpsPresent"));
    public static VarHandle UpsPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.UpsPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN UpsPresent;
     * }
     */
    public static byte UpsPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN UpsPresent;
     * }
     */
    public static void UpsPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.set(seg, x);
    }
    public static byte UpsPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UpsPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.UpsPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ThermalControl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ThermalControl"));
    public static VarHandle ThermalControl$VH() {
        return SYSTEM_POWER_CAPABILITIES.ThermalControl$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN ThermalControl;
     * }
     */
    public static byte ThermalControl$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN ThermalControl;
     * }
     */
    public static void ThermalControl$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.set(seg, x);
    }
    public static byte ThermalControl$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ThermalControl$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ThermalControl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcessorThrottle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessorThrottle"));
    public static VarHandle ProcessorThrottle$VH() {
        return SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN ProcessorThrottle;
     * }
     */
    public static byte ProcessorThrottle$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN ProcessorThrottle;
     * }
     */
    public static void ProcessorThrottle$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.set(seg, x);
    }
    public static byte ProcessorThrottle$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessorThrottle$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcessorMinThrottle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessorMinThrottle"));
    public static VarHandle ProcessorMinThrottle$VH() {
        return SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE ProcessorMinThrottle;
     * }
     */
    public static byte ProcessorMinThrottle$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE ProcessorMinThrottle;
     * }
     */
    public static void ProcessorMinThrottle$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.set(seg, x);
    }
    public static byte ProcessorMinThrottle$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessorMinThrottle$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMinThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcessorMaxThrottle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessorMaxThrottle"));
    public static VarHandle ProcessorMaxThrottle$VH() {
        return SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE ProcessorMaxThrottle;
     * }
     */
    public static byte ProcessorMaxThrottle$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE ProcessorMaxThrottle;
     * }
     */
    public static void ProcessorMaxThrottle$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.set(seg, x);
    }
    public static byte ProcessorMaxThrottle$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessorMaxThrottle$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.ProcessorMaxThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FastSystemS4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FastSystemS4"));
    public static VarHandle FastSystemS4$VH() {
        return SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN FastSystemS4;
     * }
     */
    public static byte FastSystemS4$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN FastSystemS4;
     * }
     */
    public static void FastSystemS4$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.set(seg, x);
    }
    public static byte FastSystemS4$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FastSystemS4$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.FastSystemS4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Hiberboot$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hiberboot"));
    public static VarHandle Hiberboot$VH() {
        return SYSTEM_POWER_CAPABILITIES.Hiberboot$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN Hiberboot;
     * }
     */
    public static byte Hiberboot$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.Hiberboot$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN Hiberboot;
     * }
     */
    public static void Hiberboot$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.Hiberboot$VH.set(seg, x);
    }
    public static byte Hiberboot$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.Hiberboot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hiberboot$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.Hiberboot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WakeAlarmPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WakeAlarmPresent"));
    public static VarHandle WakeAlarmPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.WakeAlarmPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN WakeAlarmPresent;
     * }
     */
    public static byte WakeAlarmPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.WakeAlarmPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN WakeAlarmPresent;
     * }
     */
    public static void WakeAlarmPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.WakeAlarmPresent$VH.set(seg, x);
    }
    public static byte WakeAlarmPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.WakeAlarmPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WakeAlarmPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.WakeAlarmPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AoAc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AoAc"));
    public static VarHandle AoAc$VH() {
        return SYSTEM_POWER_CAPABILITIES.AoAc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN AoAc;
     * }
     */
    public static byte AoAc$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.AoAc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN AoAc;
     * }
     */
    public static void AoAc$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.AoAc$VH.set(seg, x);
    }
    public static byte AoAc$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.AoAc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AoAc$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.AoAc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DiskSpinDown$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DiskSpinDown"));
    public static VarHandle DiskSpinDown$VH() {
        return SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN DiskSpinDown;
     * }
     */
    public static byte DiskSpinDown$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN DiskSpinDown;
     * }
     */
    public static void DiskSpinDown$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.set(seg, x);
    }
    public static byte DiskSpinDown$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DiskSpinDown$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.DiskSpinDown$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HiberFileType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HiberFileType"));
    public static VarHandle HiberFileType$VH() {
        return SYSTEM_POWER_CAPABILITIES.HiberFileType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE HiberFileType;
     * }
     */
    public static byte HiberFileType$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.HiberFileType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE HiberFileType;
     * }
     */
    public static void HiberFileType$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.HiberFileType$VH.set(seg, x);
    }
    public static byte HiberFileType$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.HiberFileType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HiberFileType$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.HiberFileType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AoAcConnectivitySupported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AoAcConnectivitySupported"));
    public static VarHandle AoAcConnectivitySupported$VH() {
        return SYSTEM_POWER_CAPABILITIES.AoAcConnectivitySupported$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN AoAcConnectivitySupported;
     * }
     */
    public static byte AoAcConnectivitySupported$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.AoAcConnectivitySupported$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN AoAcConnectivitySupported;
     * }
     */
    public static void AoAcConnectivitySupported$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.AoAcConnectivitySupported$VH.set(seg, x);
    }
    public static byte AoAcConnectivitySupported$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.AoAcConnectivitySupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AoAcConnectivitySupported$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.AoAcConnectivitySupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment spare3$slice(MemorySegment seg) {
        return seg.asSlice(24, 6);
    }
    static final VarHandle SystemBatteriesPresent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SystemBatteriesPresent"));
    public static VarHandle SystemBatteriesPresent$VH() {
        return SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN SystemBatteriesPresent;
     * }
     */
    public static byte SystemBatteriesPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN SystemBatteriesPresent;
     * }
     */
    public static void SystemBatteriesPresent$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.set(seg, x);
    }
    public static byte SystemBatteriesPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SystemBatteriesPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.SystemBatteriesPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BatteriesAreShortTerm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BatteriesAreShortTerm"));
    public static VarHandle BatteriesAreShortTerm$VH() {
        return SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN BatteriesAreShortTerm;
     * }
     */
    public static byte BatteriesAreShortTerm$get(MemorySegment seg) {
        return (byte)SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN BatteriesAreShortTerm;
     * }
     */
    public static void BatteriesAreShortTerm$set(MemorySegment seg, byte x) {
        SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.set(seg, x);
    }
    public static byte BatteriesAreShortTerm$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BatteriesAreShortTerm$set(MemorySegment seg, long index, byte x) {
        SYSTEM_POWER_CAPABILITIES.BatteriesAreShortTerm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BatteryScale$slice(MemorySegment seg) {
        return seg.asSlice(32, 24);
    }
    static final VarHandle AcOnLineWake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AcOnLineWake"));
    public static VarHandle AcOnLineWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE AcOnLineWake;
     * }
     */
    public static int AcOnLineWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE AcOnLineWake;
     * }
     */
    public static void AcOnLineWake$set(MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.set(seg, x);
    }
    public static int AcOnLineWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AcOnLineWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.AcOnLineWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SoftLidWake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SoftLidWake"));
    public static VarHandle SoftLidWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE SoftLidWake;
     * }
     */
    public static int SoftLidWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE SoftLidWake;
     * }
     */
    public static void SoftLidWake$set(MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.set(seg, x);
    }
    public static int SoftLidWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftLidWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.SoftLidWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RtcWake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RtcWake"));
    public static VarHandle RtcWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.RtcWake$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE RtcWake;
     * }
     */
    public static int RtcWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.RtcWake$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE RtcWake;
     * }
     */
    public static void RtcWake$set(MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.RtcWake$VH.set(seg, x);
    }
    public static int RtcWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.RtcWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RtcWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.RtcWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinDeviceWakeState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinDeviceWakeState"));
    public static VarHandle MinDeviceWakeState$VH() {
        return SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE MinDeviceWakeState;
     * }
     */
    public static int MinDeviceWakeState$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE MinDeviceWakeState;
     * }
     */
    public static void MinDeviceWakeState$set(MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.set(seg, x);
    }
    public static int MinDeviceWakeState$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinDeviceWakeState$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.MinDeviceWakeState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultLowLatencyWake$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultLowLatencyWake"));
    public static VarHandle DefaultLowLatencyWake$VH() {
        return SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE DefaultLowLatencyWake;
     * }
     */
    public static int DefaultLowLatencyWake$get(MemorySegment seg) {
        return (int)SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SYSTEM_POWER_STATE DefaultLowLatencyWake;
     * }
     */
    public static void DefaultLowLatencyWake$set(MemorySegment seg, int x) {
        SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.set(seg, x);
    }
    public static int DefaultLowLatencyWake$get(MemorySegment seg, long index) {
        return (int)SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultLowLatencyWake$set(MemorySegment seg, long index, int x) {
        SYSTEM_POWER_CAPABILITIES.DefaultLowLatencyWake$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


