// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_FUNCTION_OVERRIDE_HEADER {
 *     DWORD FuncOverrideSize;
 * };
 * }
 */
public class _IMAGE_FUNCTION_OVERRIDE_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("FuncOverrideSize")
    ).withName("_IMAGE_FUNCTION_OVERRIDE_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_FUNCTION_OVERRIDE_HEADER.$struct$LAYOUT;
    }
    static final VarHandle FuncOverrideSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FuncOverrideSize"));
    public static VarHandle FuncOverrideSize$VH() {
        return _IMAGE_FUNCTION_OVERRIDE_HEADER.FuncOverrideSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FuncOverrideSize;
     * }
     */
    public static int FuncOverrideSize$get(MemorySegment seg) {
        return (int)_IMAGE_FUNCTION_OVERRIDE_HEADER.FuncOverrideSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FuncOverrideSize;
     * }
     */
    public static void FuncOverrideSize$set(MemorySegment seg, int x) {
        _IMAGE_FUNCTION_OVERRIDE_HEADER.FuncOverrideSize$VH.set(seg, x);
    }
    public static int FuncOverrideSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_FUNCTION_OVERRIDE_HEADER.FuncOverrideSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FuncOverrideSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_FUNCTION_OVERRIDE_HEADER.FuncOverrideSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

