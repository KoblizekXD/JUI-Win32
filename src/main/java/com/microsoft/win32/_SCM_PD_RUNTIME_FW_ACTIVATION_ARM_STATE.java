// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE {
 *     BOOLEAN ArmState;
 * };
 * }
 */
public class _SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("ArmState")
    ).withName("_SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE.$struct$LAYOUT;
    }
    static final VarHandle ArmState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArmState"));
    public static VarHandle ArmState$VH() {
        return _SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE.ArmState$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN ArmState;
     * }
     */
    public static byte ArmState$get(MemorySegment seg) {
        return (byte)_SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE.ArmState$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN ArmState;
     * }
     */
    public static void ArmState$set(MemorySegment seg, byte x) {
        _SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE.ArmState$VH.set(seg, x);
    }
    public static byte ArmState$get(MemorySegment seg, long index) {
        return (byte)_SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE.ArmState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArmState$set(MemorySegment seg, long index, byte x) {
        _SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE.ArmState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


