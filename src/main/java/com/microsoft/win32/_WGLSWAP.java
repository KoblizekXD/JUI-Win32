// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _WGLSWAP {
 *     HDC hdc;
 *     UINT uiFlags;
 * };
 * }
 */
public class _WGLSWAP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hdc"),
        Constants$root.C_LONG$LAYOUT.withName("uiFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_WGLSWAP");
    public static MemoryLayout $LAYOUT() {
        return _WGLSWAP.$struct$LAYOUT;
    }
    static final VarHandle hdc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hdc"));
    public static VarHandle hdc$VH() {
        return _WGLSWAP.hdc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HDC hdc;
     * }
     */
    public static MemorySegment hdc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_WGLSWAP.hdc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HDC hdc;
     * }
     */
    public static void hdc$set(MemorySegment seg, MemorySegment x) {
        _WGLSWAP.hdc$VH.set(seg, x);
    }
    public static MemorySegment hdc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_WGLSWAP.hdc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hdc$set(MemorySegment seg, long index, MemorySegment x) {
        _WGLSWAP.hdc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uiFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uiFlags"));
    public static VarHandle uiFlags$VH() {
        return _WGLSWAP.uiFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uiFlags;
     * }
     */
    public static int uiFlags$get(MemorySegment seg) {
        return (int)_WGLSWAP.uiFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uiFlags;
     * }
     */
    public static void uiFlags$set(MemorySegment seg, int x) {
        _WGLSWAP.uiFlags$VH.set(seg, x);
    }
    public static int uiFlags$get(MemorySegment seg, long index) {
        return (int)_WGLSWAP.uiFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uiFlags$set(MemorySegment seg, long index, int x) {
        _WGLSWAP.uiFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


