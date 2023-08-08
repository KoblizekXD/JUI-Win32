// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ACTION_HEADER {
 *     ULONG transport_id;
 *     USHORT action_code;
 *     USHORT reserved;
 * };
 * }
 */
public class _ACTION_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("transport_id"),
        Constants$root.C_SHORT$LAYOUT.withName("action_code"),
        Constants$root.C_SHORT$LAYOUT.withName("reserved")
    ).withName("_ACTION_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _ACTION_HEADER.$struct$LAYOUT;
    }
    static final VarHandle transport_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("transport_id"));
    public static VarHandle transport_id$VH() {
        return _ACTION_HEADER.transport_id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG transport_id;
     * }
     */
    public static int transport_id$get(MemorySegment seg) {
        return (int)_ACTION_HEADER.transport_id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG transport_id;
     * }
     */
    public static void transport_id$set(MemorySegment seg, int x) {
        _ACTION_HEADER.transport_id$VH.set(seg, x);
    }
    public static int transport_id$get(MemorySegment seg, long index) {
        return (int)_ACTION_HEADER.transport_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void transport_id$set(MemorySegment seg, long index, int x) {
        _ACTION_HEADER.transport_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle action_code$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("action_code"));
    public static VarHandle action_code$VH() {
        return _ACTION_HEADER.action_code$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT action_code;
     * }
     */
    public static short action_code$get(MemorySegment seg) {
        return (short)_ACTION_HEADER.action_code$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT action_code;
     * }
     */
    public static void action_code$set(MemorySegment seg, short x) {
        _ACTION_HEADER.action_code$VH.set(seg, x);
    }
    public static short action_code$get(MemorySegment seg, long index) {
        return (short)_ACTION_HEADER.action_code$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void action_code$set(MemorySegment seg, long index, short x) {
        _ACTION_HEADER.action_code$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return _ACTION_HEADER.reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT reserved;
     * }
     */
    public static short reserved$get(MemorySegment seg) {
        return (short)_ACTION_HEADER.reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT reserved;
     * }
     */
    public static void reserved$set(MemorySegment seg, short x) {
        _ACTION_HEADER.reserved$VH.set(seg, x);
    }
    public static short reserved$get(MemorySegment seg, long index) {
        return (short)_ACTION_HEADER.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, short x) {
        _ACTION_HEADER.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

