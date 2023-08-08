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
 *     BYTE Mode;
 *     DWORD64 Processors;
 * };
 * }
 */
public class PPM_THERMAL_POLICY_EVENT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Mode"),
        MemoryLayout.paddingLayout(56),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Processors")
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_THERMAL_POLICY_EVENT.$struct$LAYOUT;
    }
    static final VarHandle Mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Mode"));
    public static VarHandle Mode$VH() {
        return PPM_THERMAL_POLICY_EVENT.Mode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Mode;
     * }
     */
    public static byte Mode$get(MemorySegment seg) {
        return (byte)PPM_THERMAL_POLICY_EVENT.Mode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Mode;
     * }
     */
    public static void Mode$set(MemorySegment seg, byte x) {
        PPM_THERMAL_POLICY_EVENT.Mode$VH.set(seg, x);
    }
    public static byte Mode$get(MemorySegment seg, long index) {
        return (byte)PPM_THERMAL_POLICY_EVENT.Mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mode$set(MemorySegment seg, long index, byte x) {
        PPM_THERMAL_POLICY_EVENT.Mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Processors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Processors"));
    public static VarHandle Processors$VH() {
        return PPM_THERMAL_POLICY_EVENT.Processors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Processors;
     * }
     */
    public static long Processors$get(MemorySegment seg) {
        return (long)PPM_THERMAL_POLICY_EVENT.Processors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Processors;
     * }
     */
    public static void Processors$set(MemorySegment seg, long x) {
        PPM_THERMAL_POLICY_EVENT.Processors$VH.set(seg, x);
    }
    public static long Processors$get(MemorySegment seg, long index) {
        return (long)PPM_THERMAL_POLICY_EVENT.Processors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Processors$set(MemorySegment seg, long index, long x) {
        PPM_THERMAL_POLICY_EVENT.Processors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

