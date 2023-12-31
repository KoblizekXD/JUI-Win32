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
 *     POWER_ACTION Action;
 *     DWORD Flags;
 *     DWORD EventCode;
 * };
 * }
 */
public class POWER_ACTION_POLICY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Action"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("EventCode")
    );
    public static MemoryLayout $LAYOUT() {
        return POWER_ACTION_POLICY.$struct$LAYOUT;
    }
    static final VarHandle Action$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Action"));
    public static VarHandle Action$VH() {
        return POWER_ACTION_POLICY.Action$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POWER_ACTION Action;
     * }
     */
    public static int Action$get(MemorySegment seg) {
        return (int)POWER_ACTION_POLICY.Action$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POWER_ACTION Action;
     * }
     */
    public static void Action$set(MemorySegment seg, int x) {
        POWER_ACTION_POLICY.Action$VH.set(seg, x);
    }
    public static int Action$get(MemorySegment seg, long index) {
        return (int)POWER_ACTION_POLICY.Action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Action$set(MemorySegment seg, long index, int x) {
        POWER_ACTION_POLICY.Action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return POWER_ACTION_POLICY.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)POWER_ACTION_POLICY.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        POWER_ACTION_POLICY.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)POWER_ACTION_POLICY.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        POWER_ACTION_POLICY.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EventCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EventCode"));
    public static VarHandle EventCode$VH() {
        return POWER_ACTION_POLICY.EventCode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD EventCode;
     * }
     */
    public static int EventCode$get(MemorySegment seg) {
        return (int)POWER_ACTION_POLICY.EventCode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD EventCode;
     * }
     */
    public static void EventCode$set(MemorySegment seg, int x) {
        POWER_ACTION_POLICY.EventCode$VH.set(seg, x);
    }
    public static int EventCode$get(MemorySegment seg, long index) {
        return (int)POWER_ACTION_POLICY.EventCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EventCode$set(MemorySegment seg, long index, int x) {
        POWER_ACTION_POLICY.EventCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


