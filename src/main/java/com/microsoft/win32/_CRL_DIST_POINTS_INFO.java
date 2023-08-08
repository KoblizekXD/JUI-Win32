// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRL_DIST_POINTS_INFO {
 *     DWORD cDistPoint;
 *     PCRL_DIST_POINT rgDistPoint;
 * };
 * }
 */
public class _CRL_DIST_POINTS_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cDistPoint"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgDistPoint")
    ).withName("_CRL_DIST_POINTS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CRL_DIST_POINTS_INFO.$struct$LAYOUT;
    }
    static final VarHandle cDistPoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDistPoint"));
    public static VarHandle cDistPoint$VH() {
        return _CRL_DIST_POINTS_INFO.cDistPoint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cDistPoint;
     * }
     */
    public static int cDistPoint$get(MemorySegment seg) {
        return (int)_CRL_DIST_POINTS_INFO.cDistPoint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cDistPoint;
     * }
     */
    public static void cDistPoint$set(MemorySegment seg, int x) {
        _CRL_DIST_POINTS_INFO.cDistPoint$VH.set(seg, x);
    }
    public static int cDistPoint$get(MemorySegment seg, long index) {
        return (int)_CRL_DIST_POINTS_INFO.cDistPoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDistPoint$set(MemorySegment seg, long index, int x) {
        _CRL_DIST_POINTS_INFO.cDistPoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgDistPoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgDistPoint"));
    public static VarHandle rgDistPoint$VH() {
        return _CRL_DIST_POINTS_INFO.rgDistPoint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRL_DIST_POINT rgDistPoint;
     * }
     */
    public static MemorySegment rgDistPoint$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRL_DIST_POINTS_INFO.rgDistPoint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRL_DIST_POINT rgDistPoint;
     * }
     */
    public static void rgDistPoint$set(MemorySegment seg, MemorySegment x) {
        _CRL_DIST_POINTS_INFO.rgDistPoint$VH.set(seg, x);
    }
    public static MemorySegment rgDistPoint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRL_DIST_POINTS_INFO.rgDistPoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgDistPoint$set(MemorySegment seg, long index, MemorySegment x) {
        _CRL_DIST_POINTS_INFO.rgDistPoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

