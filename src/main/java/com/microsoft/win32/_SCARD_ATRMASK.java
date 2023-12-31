// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCARD_ATRMASK {
 *     DWORD cbAtr;
 *     BYTE rgbAtr[36];
 *     BYTE rgbMask[36];
 * };
 * }
 */
public class _SCARD_ATRMASK {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbAtr"),
        MemoryLayout.sequenceLayout(36, Constants$root.C_CHAR$LAYOUT).withName("rgbAtr"),
        MemoryLayout.sequenceLayout(36, Constants$root.C_CHAR$LAYOUT).withName("rgbMask")
    ).withName("_SCARD_ATRMASK");
    public static MemoryLayout $LAYOUT() {
        return _SCARD_ATRMASK.$struct$LAYOUT;
    }
    static final VarHandle cbAtr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAtr"));
    public static VarHandle cbAtr$VH() {
        return _SCARD_ATRMASK.cbAtr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbAtr;
     * }
     */
    public static int cbAtr$get(MemorySegment seg) {
        return (int)_SCARD_ATRMASK.cbAtr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbAtr;
     * }
     */
    public static void cbAtr$set(MemorySegment seg, int x) {
        _SCARD_ATRMASK.cbAtr$VH.set(seg, x);
    }
    public static int cbAtr$get(MemorySegment seg, long index) {
        return (int)_SCARD_ATRMASK.cbAtr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAtr$set(MemorySegment seg, long index, int x) {
        _SCARD_ATRMASK.cbAtr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgbAtr$slice(MemorySegment seg) {
        return seg.asSlice(4, 36);
    }
    public static MemorySegment rgbMask$slice(MemorySegment seg) {
        return seg.asSlice(40, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


