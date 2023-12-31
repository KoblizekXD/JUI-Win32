// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESS_MACHINE_INFORMATION {
 *     USHORT ProcessMachine;
 *     USHORT Res0;
 *     MACHINE_ATTRIBUTES MachineAttributes;
 * };
 * }
 */
public class _PROCESS_MACHINE_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("ProcessMachine"),
        Constants$root.C_SHORT$LAYOUT.withName("Res0"),
        Constants$root.C_LONG$LAYOUT.withName("MachineAttributes")
    ).withName("_PROCESS_MACHINE_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_MACHINE_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ProcessMachine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcessMachine"));
    public static VarHandle ProcessMachine$VH() {
        return _PROCESS_MACHINE_INFORMATION.ProcessMachine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT ProcessMachine;
     * }
     */
    public static short ProcessMachine$get(MemorySegment seg) {
        return (short)_PROCESS_MACHINE_INFORMATION.ProcessMachine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT ProcessMachine;
     * }
     */
    public static void ProcessMachine$set(MemorySegment seg, short x) {
        _PROCESS_MACHINE_INFORMATION.ProcessMachine$VH.set(seg, x);
    }
    public static short ProcessMachine$get(MemorySegment seg, long index) {
        return (short)_PROCESS_MACHINE_INFORMATION.ProcessMachine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessMachine$set(MemorySegment seg, long index, short x) {
        _PROCESS_MACHINE_INFORMATION.ProcessMachine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Res0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Res0"));
    public static VarHandle Res0$VH() {
        return _PROCESS_MACHINE_INFORMATION.Res0$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT Res0;
     * }
     */
    public static short Res0$get(MemorySegment seg) {
        return (short)_PROCESS_MACHINE_INFORMATION.Res0$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT Res0;
     * }
     */
    public static void Res0$set(MemorySegment seg, short x) {
        _PROCESS_MACHINE_INFORMATION.Res0$VH.set(seg, x);
    }
    public static short Res0$get(MemorySegment seg, long index) {
        return (short)_PROCESS_MACHINE_INFORMATION.Res0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Res0$set(MemorySegment seg, long index, short x) {
        _PROCESS_MACHINE_INFORMATION.Res0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MachineAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MachineAttributes"));
    public static VarHandle MachineAttributes$VH() {
        return _PROCESS_MACHINE_INFORMATION.MachineAttributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MACHINE_ATTRIBUTES MachineAttributes;
     * }
     */
    public static int MachineAttributes$get(MemorySegment seg) {
        return (int)_PROCESS_MACHINE_INFORMATION.MachineAttributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MACHINE_ATTRIBUTES MachineAttributes;
     * }
     */
    public static void MachineAttributes$set(MemorySegment seg, int x) {
        _PROCESS_MACHINE_INFORMATION.MachineAttributes$VH.set(seg, x);
    }
    public static int MachineAttributes$get(MemorySegment seg, long index) {
        return (int)_PROCESS_MACHINE_INFORMATION.MachineAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MachineAttributes$set(MemorySegment seg, long index, int x) {
        _PROCESS_MACHINE_INFORMATION.MachineAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


