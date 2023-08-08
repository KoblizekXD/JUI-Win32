// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RASTERIZER_STATUS {
 *     short nSize;
 *     short wFlags;
 *     short nLanguageID;
 * };
 * }
 */
public class _RASTERIZER_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("nSize"),
        Constants$root.C_SHORT$LAYOUT.withName("wFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("nLanguageID")
    ).withName("_RASTERIZER_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _RASTERIZER_STATUS.$struct$LAYOUT;
    }
    static final VarHandle nSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSize"));
    public static VarHandle nSize$VH() {
        return _RASTERIZER_STATUS.nSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short nSize;
     * }
     */
    public static short nSize$get(MemorySegment seg) {
        return (short)_RASTERIZER_STATUS.nSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short nSize;
     * }
     */
    public static void nSize$set(MemorySegment seg, short x) {
        _RASTERIZER_STATUS.nSize$VH.set(seg, x);
    }
    public static short nSize$get(MemorySegment seg, long index) {
        return (short)_RASTERIZER_STATUS.nSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSize$set(MemorySegment seg, long index, short x) {
        _RASTERIZER_STATUS.nSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFlags"));
    public static VarHandle wFlags$VH() {
        return _RASTERIZER_STATUS.wFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short wFlags;
     * }
     */
    public static short wFlags$get(MemorySegment seg) {
        return (short)_RASTERIZER_STATUS.wFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short wFlags;
     * }
     */
    public static void wFlags$set(MemorySegment seg, short x) {
        _RASTERIZER_STATUS.wFlags$VH.set(seg, x);
    }
    public static short wFlags$get(MemorySegment seg, long index) {
        return (short)_RASTERIZER_STATUS.wFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFlags$set(MemorySegment seg, long index, short x) {
        _RASTERIZER_STATUS.wFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nLanguageID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nLanguageID"));
    public static VarHandle nLanguageID$VH() {
        return _RASTERIZER_STATUS.nLanguageID$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * short nLanguageID;
     * }
     */
    public static short nLanguageID$get(MemorySegment seg) {
        return (short)_RASTERIZER_STATUS.nLanguageID$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * short nLanguageID;
     * }
     */
    public static void nLanguageID$set(MemorySegment seg, short x) {
        _RASTERIZER_STATUS.nLanguageID$VH.set(seg, x);
    }
    public static short nLanguageID$get(MemorySegment seg, long index) {
        return (short)_RASTERIZER_STATUS.nLanguageID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nLanguageID$set(MemorySegment seg, long index, short x) {
        _RASTERIZER_STATUS.nLanguageID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


