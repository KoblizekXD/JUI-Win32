// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_CE_RUNTIME_FUNCTION_ENTRY {
 *     DWORD FuncStart;
 *      *     DWORD PrologLen;
 *     DWORD FuncLen;
 *     DWORD ThirtyTwoBit;
 *     DWORD ExceptionFlag;
 * };
 * }
 */
public class _IMAGE_CE_RUNTIME_FUNCTION_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("FuncStart"),
        MemoryLayout.paddingLayout(32)
    ).withName("_IMAGE_CE_RUNTIME_FUNCTION_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_CE_RUNTIME_FUNCTION_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle FuncStart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FuncStart"));
    public static VarHandle FuncStart$VH() {
        return _IMAGE_CE_RUNTIME_FUNCTION_ENTRY.FuncStart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FuncStart;
     * }
     */
    public static int FuncStart$get(MemorySegment seg) {
        return (int)_IMAGE_CE_RUNTIME_FUNCTION_ENTRY.FuncStart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FuncStart;
     * }
     */
    public static void FuncStart$set(MemorySegment seg, int x) {
        _IMAGE_CE_RUNTIME_FUNCTION_ENTRY.FuncStart$VH.set(seg, x);
    }
    public static int FuncStart$get(MemorySegment seg, long index) {
        return (int)_IMAGE_CE_RUNTIME_FUNCTION_ENTRY.FuncStart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FuncStart$set(MemorySegment seg, long index, int x) {
        _IMAGE_CE_RUNTIME_FUNCTION_ENTRY.FuncStart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


