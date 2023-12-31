// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION {
 *     DWORD ElementCount;
 *     COMPATIBILITY_CONTEXT_ELEMENT Elements[];
 * };
 * }
 */
public class _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ElementCount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("Id"),
            Constants$root.C_LONG$LAYOUT.withName("Type"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("MaxVersionTested")
        ).withName("_COMPATIBILITY_CONTEXT_ELEMENT")).withName("Elements")
    ).withName("_ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle ElementCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ElementCount"));
    public static VarHandle ElementCount$VH() {
        return _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION.ElementCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ElementCount;
     * }
     */
    public static int ElementCount$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION.ElementCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ElementCount;
     * }
     */
    public static void ElementCount$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION.ElementCount$VH.set(seg, x);
    }
    public static int ElementCount$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION.ElementCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ElementCount$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_COMPATIBILITY_INFORMATION.ElementCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


