// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ROOT_INFO_LUID {
 *     DWORD LowPart;
 *     LONG HighPart;
 * };
 * }
 */
public class _ROOT_INFO_LUID {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
        Constants$root.C_LONG$LAYOUT.withName("HighPart")
    ).withName("_ROOT_INFO_LUID");
    public static MemoryLayout $LAYOUT() {
        return _ROOT_INFO_LUID.$struct$LAYOUT;
    }
    static final VarHandle LowPart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowPart"));
    public static VarHandle LowPart$VH() {
        return _ROOT_INFO_LUID.LowPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LowPart;
     * }
     */
    public static int LowPart$get(MemorySegment seg) {
        return (int)_ROOT_INFO_LUID.LowPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LowPart;
     * }
     */
    public static void LowPart$set(MemorySegment seg, int x) {
        _ROOT_INFO_LUID.LowPart$VH.set(seg, x);
    }
    public static int LowPart$get(MemorySegment seg, long index) {
        return (int)_ROOT_INFO_LUID.LowPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowPart$set(MemorySegment seg, long index, int x) {
        _ROOT_INFO_LUID.LowPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighPart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighPart"));
    public static VarHandle HighPart$VH() {
        return _ROOT_INFO_LUID.HighPart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG HighPart;
     * }
     */
    public static int HighPart$get(MemorySegment seg) {
        return (int)_ROOT_INFO_LUID.HighPart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG HighPart;
     * }
     */
    public static void HighPart$set(MemorySegment seg, int x) {
        _ROOT_INFO_LUID.HighPart$VH.set(seg, x);
    }
    public static int HighPart$get(MemorySegment seg, long index) {
        return (int)_ROOT_INFO_LUID.HighPart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighPart$set(MemorySegment seg, long index, int x) {
        _ROOT_INFO_LUID.HighPart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


