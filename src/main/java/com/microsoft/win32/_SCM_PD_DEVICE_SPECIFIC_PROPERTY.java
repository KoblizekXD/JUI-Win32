// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_PD_DEVICE_SPECIFIC_PROPERTY {
 *     WCHAR Name[128];
 *     LONGLONG Value;
 * };
 * }
 */
public class _SCM_PD_DEVICE_SPECIFIC_PROPERTY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(128, Constants$root.C_SHORT$LAYOUT).withName("Name"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Value")
    ).withName("_SCM_PD_DEVICE_SPECIFIC_PROPERTY");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_DEVICE_SPECIFIC_PROPERTY.$struct$LAYOUT;
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(0, 256);
    }
    static final VarHandle Value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Value"));
    public static VarHandle Value$VH() {
        return _SCM_PD_DEVICE_SPECIFIC_PROPERTY.Value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONGLONG Value;
     * }
     */
    public static long Value$get(MemorySegment seg) {
        return (long)_SCM_PD_DEVICE_SPECIFIC_PROPERTY.Value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONGLONG Value;
     * }
     */
    public static void Value$set(MemorySegment seg, long x) {
        _SCM_PD_DEVICE_SPECIFIC_PROPERTY.Value$VH.set(seg, x);
    }
    public static long Value$get(MemorySegment seg, long index) {
        return (long)_SCM_PD_DEVICE_SPECIFIC_PROPERTY.Value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Value$set(MemorySegment seg, long index, long x) {
        _SCM_PD_DEVICE_SPECIFIC_PROPERTY.Value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


