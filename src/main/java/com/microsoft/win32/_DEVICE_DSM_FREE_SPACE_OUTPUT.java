// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_DSM_FREE_SPACE_OUTPUT {
 *     DWORD Version;
 *     DWORDLONG FreeSpace;
 * };
 * }
 */
public class _DEVICE_DSM_FREE_SPACE_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("FreeSpace")
    ).withName("_DEVICE_DSM_FREE_SPACE_OUTPUT");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_FREE_SPACE_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _DEVICE_DSM_FREE_SPACE_OUTPUT.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_FREE_SPACE_OUTPUT.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _DEVICE_DSM_FREE_SPACE_OUTPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_FREE_SPACE_OUTPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_FREE_SPACE_OUTPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FreeSpace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FreeSpace"));
    public static VarHandle FreeSpace$VH() {
        return _DEVICE_DSM_FREE_SPACE_OUTPUT.FreeSpace$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG FreeSpace;
     * }
     */
    public static long FreeSpace$get(MemorySegment seg) {
        return (long)_DEVICE_DSM_FREE_SPACE_OUTPUT.FreeSpace$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG FreeSpace;
     * }
     */
    public static void FreeSpace$set(MemorySegment seg, long x) {
        _DEVICE_DSM_FREE_SPACE_OUTPUT.FreeSpace$VH.set(seg, x);
    }
    public static long FreeSpace$get(MemorySegment seg, long index) {
        return (long)_DEVICE_DSM_FREE_SPACE_OUTPUT.FreeSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeSpace$set(MemorySegment seg, long index, long x) {
        _DEVICE_DSM_FREE_SPACE_OUTPUT.FreeSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

