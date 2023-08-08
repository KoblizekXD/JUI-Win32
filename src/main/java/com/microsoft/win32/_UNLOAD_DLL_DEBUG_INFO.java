// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _UNLOAD_DLL_DEBUG_INFO {
 *     LPVOID lpBaseOfDll;
 * };
 * }
 */
public class _UNLOAD_DLL_DEBUG_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpBaseOfDll")
    ).withName("_UNLOAD_DLL_DEBUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _UNLOAD_DLL_DEBUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle lpBaseOfDll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpBaseOfDll"));
    public static VarHandle lpBaseOfDll$VH() {
        return _UNLOAD_DLL_DEBUG_INFO.lpBaseOfDll$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID lpBaseOfDll;
     * }
     */
    public static MemorySegment lpBaseOfDll$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_UNLOAD_DLL_DEBUG_INFO.lpBaseOfDll$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID lpBaseOfDll;
     * }
     */
    public static void lpBaseOfDll$set(MemorySegment seg, MemorySegment x) {
        _UNLOAD_DLL_DEBUG_INFO.lpBaseOfDll$VH.set(seg, x);
    }
    public static MemorySegment lpBaseOfDll$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_UNLOAD_DLL_DEBUG_INFO.lpBaseOfDll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpBaseOfDll$set(MemorySegment seg, long index, MemorySegment x) {
        _UNLOAD_DLL_DEBUG_INFO.lpBaseOfDll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

