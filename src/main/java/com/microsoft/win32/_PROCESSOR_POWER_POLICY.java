// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESSOR_POWER_POLICY {
 *     DWORD Revision;
 *     BYTE DynamicThrottle;
 *     BYTE Spare[3];
 *      *     DWORD DisableCStates;
 *     DWORD Reserved;
 *     DWORD PolicyCount;
 *     PROCESSOR_POWER_POLICY_INFO Policy[3];
 * };
 * }
 */
public class _PROCESSOR_POWER_POLICY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Revision"),
        Constants$root.C_CHAR$LAYOUT.withName("DynamicThrottle"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Spare"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG$LAYOUT.withName("PolicyCount"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("TimeCheck"),
            Constants$root.C_LONG$LAYOUT.withName("DemoteLimit"),
            Constants$root.C_LONG$LAYOUT.withName("PromoteLimit"),
            Constants$root.C_CHAR$LAYOUT.withName("DemotePercent"),
            Constants$root.C_CHAR$LAYOUT.withName("PromotePercent"),
            MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Spare"),
            MemoryLayout.paddingLayout(32)
        ).withName("_PROCESSOR_POWER_POLICY_INFO")).withName("Policy")
    ).withName("_PROCESSOR_POWER_POLICY");
    public static MemoryLayout $LAYOUT() {
        return _PROCESSOR_POWER_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Revision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    public static VarHandle Revision$VH() {
        return _PROCESSOR_POWER_POLICY.Revision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static int Revision$get(MemorySegment seg) {
        return (int)_PROCESSOR_POWER_POLICY.Revision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Revision;
     * }
     */
    public static void Revision$set(MemorySegment seg, int x) {
        _PROCESSOR_POWER_POLICY.Revision$VH.set(seg, x);
    }
    public static int Revision$get(MemorySegment seg, long index) {
        return (int)_PROCESSOR_POWER_POLICY.Revision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, int x) {
        _PROCESSOR_POWER_POLICY.Revision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DynamicThrottle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DynamicThrottle"));
    public static VarHandle DynamicThrottle$VH() {
        return _PROCESSOR_POWER_POLICY.DynamicThrottle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE DynamicThrottle;
     * }
     */
    public static byte DynamicThrottle$get(MemorySegment seg) {
        return (byte)_PROCESSOR_POWER_POLICY.DynamicThrottle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE DynamicThrottle;
     * }
     */
    public static void DynamicThrottle$set(MemorySegment seg, byte x) {
        _PROCESSOR_POWER_POLICY.DynamicThrottle$VH.set(seg, x);
    }
    public static byte DynamicThrottle$get(MemorySegment seg, long index) {
        return (byte)_PROCESSOR_POWER_POLICY.DynamicThrottle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DynamicThrottle$set(MemorySegment seg, long index, byte x) {
        _PROCESSOR_POWER_POLICY.DynamicThrottle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Spare$slice(MemorySegment seg) {
        return seg.asSlice(5, 3);
    }
    static final VarHandle PolicyCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PolicyCount"));
    public static VarHandle PolicyCount$VH() {
        return _PROCESSOR_POWER_POLICY.PolicyCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PolicyCount;
     * }
     */
    public static int PolicyCount$get(MemorySegment seg) {
        return (int)_PROCESSOR_POWER_POLICY.PolicyCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PolicyCount;
     * }
     */
    public static void PolicyCount$set(MemorySegment seg, int x) {
        _PROCESSOR_POWER_POLICY.PolicyCount$VH.set(seg, x);
    }
    public static int PolicyCount$get(MemorySegment seg, long index) {
        return (int)_PROCESSOR_POWER_POLICY.PolicyCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyCount$set(MemorySegment seg, long index, int x) {
        _PROCESSOR_POWER_POLICY.PolicyCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Policy$slice(MemorySegment seg) {
        return seg.asSlice(16, 60);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


