// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _LMR_QUERY_INFO_PARAM {
 *     LMR_QUERY_INFO_CLASS Operation;
 * };
 * }
 */
public class _LMR_QUERY_INFO_PARAM {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Operation")
    ).withName("_LMR_QUERY_INFO_PARAM");
    public static MemoryLayout $LAYOUT() {
        return _LMR_QUERY_INFO_PARAM.$struct$LAYOUT;
    }
    static final VarHandle Operation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Operation"));
    public static VarHandle Operation$VH() {
        return _LMR_QUERY_INFO_PARAM.Operation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LMR_QUERY_INFO_CLASS Operation;
     * }
     */
    public static int Operation$get(MemorySegment seg) {
        return (int)_LMR_QUERY_INFO_PARAM.Operation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LMR_QUERY_INFO_CLASS Operation;
     * }
     */
    public static void Operation$set(MemorySegment seg, int x) {
        _LMR_QUERY_INFO_PARAM.Operation$VH.set(seg, x);
    }
    public static int Operation$get(MemorySegment seg, long index) {
        return (int)_LMR_QUERY_INFO_PARAM.Operation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Operation$set(MemorySegment seg, long index, int x) {
        _LMR_QUERY_INFO_PARAM.Operation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


