// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CFG_CALL_TARGET_INFO {
 *     ULONG_PTR Offset;
 *     ULONG_PTR Flags;
 * };
 * }
 */
public class _CFG_CALL_TARGET_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Flags")
    ).withName("_CFG_CALL_TARGET_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CFG_CALL_TARGET_INFO.$struct$LAYOUT;
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _CFG_CALL_TARGET_INFO.Offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR Offset;
     * }
     */
    public static long Offset$get(MemorySegment seg) {
        return (long)_CFG_CALL_TARGET_INFO.Offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR Offset;
     * }
     */
    public static void Offset$set(MemorySegment seg, long x) {
        _CFG_CALL_TARGET_INFO.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_CFG_CALL_TARGET_INFO.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _CFG_CALL_TARGET_INFO.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _CFG_CALL_TARGET_INFO.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR Flags;
     * }
     */
    public static long Flags$get(MemorySegment seg) {
        return (long)_CFG_CALL_TARGET_INFO.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, long x) {
        _CFG_CALL_TARGET_INFO.Flags$VH.set(seg, x);
    }
    public static long Flags$get(MemorySegment seg, long index) {
        return (long)_CFG_CALL_TARGET_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, long x) {
        _CFG_CALL_TARGET_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


