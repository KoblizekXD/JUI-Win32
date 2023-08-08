// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _userBITMAP {
 *     LONG bmType;
 *     LONG bmWidth;
 *     LONG bmHeight;
 *     LONG bmWidthBytes;
 *     WORD bmPlanes;
 *     WORD bmBitsPixel;
 *     ULONG cbSize;
 *     byte pBuffer[1];
 * };
 * }
 */
public class _userBITMAP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("bmType"),
        Constants$root.C_LONG$LAYOUT.withName("bmWidth"),
        Constants$root.C_LONG$LAYOUT.withName("bmHeight"),
        Constants$root.C_LONG$LAYOUT.withName("bmWidthBytes"),
        Constants$root.C_SHORT$LAYOUT.withName("bmPlanes"),
        Constants$root.C_SHORT$LAYOUT.withName("bmBitsPixel"),
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("pBuffer"),
        MemoryLayout.paddingLayout(24)
    ).withName("_userBITMAP");
    public static MemoryLayout $LAYOUT() {
        return _userBITMAP.$struct$LAYOUT;
    }
    static final VarHandle bmType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmType"));
    public static VarHandle bmType$VH() {
        return _userBITMAP.bmType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmType;
     * }
     */
    public static int bmType$get(MemorySegment seg) {
        return (int)_userBITMAP.bmType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmType;
     * }
     */
    public static void bmType$set(MemorySegment seg, int x) {
        _userBITMAP.bmType$VH.set(seg, x);
    }
    public static int bmType$get(MemorySegment seg, long index) {
        return (int)_userBITMAP.bmType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmType$set(MemorySegment seg, long index, int x) {
        _userBITMAP.bmType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmWidth"));
    public static VarHandle bmWidth$VH() {
        return _userBITMAP.bmWidth$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmWidth;
     * }
     */
    public static int bmWidth$get(MemorySegment seg) {
        return (int)_userBITMAP.bmWidth$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmWidth;
     * }
     */
    public static void bmWidth$set(MemorySegment seg, int x) {
        _userBITMAP.bmWidth$VH.set(seg, x);
    }
    public static int bmWidth$get(MemorySegment seg, long index) {
        return (int)_userBITMAP.bmWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmWidth$set(MemorySegment seg, long index, int x) {
        _userBITMAP.bmWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmHeight"));
    public static VarHandle bmHeight$VH() {
        return _userBITMAP.bmHeight$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmHeight;
     * }
     */
    public static int bmHeight$get(MemorySegment seg) {
        return (int)_userBITMAP.bmHeight$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmHeight;
     * }
     */
    public static void bmHeight$set(MemorySegment seg, int x) {
        _userBITMAP.bmHeight$VH.set(seg, x);
    }
    public static int bmHeight$get(MemorySegment seg, long index) {
        return (int)_userBITMAP.bmHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmHeight$set(MemorySegment seg, long index, int x) {
        _userBITMAP.bmHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmWidthBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmWidthBytes"));
    public static VarHandle bmWidthBytes$VH() {
        return _userBITMAP.bmWidthBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG bmWidthBytes;
     * }
     */
    public static int bmWidthBytes$get(MemorySegment seg) {
        return (int)_userBITMAP.bmWidthBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG bmWidthBytes;
     * }
     */
    public static void bmWidthBytes$set(MemorySegment seg, int x) {
        _userBITMAP.bmWidthBytes$VH.set(seg, x);
    }
    public static int bmWidthBytes$get(MemorySegment seg, long index) {
        return (int)_userBITMAP.bmWidthBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmWidthBytes$set(MemorySegment seg, long index, int x) {
        _userBITMAP.bmWidthBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmPlanes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmPlanes"));
    public static VarHandle bmPlanes$VH() {
        return _userBITMAP.bmPlanes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD bmPlanes;
     * }
     */
    public static short bmPlanes$get(MemorySegment seg) {
        return (short)_userBITMAP.bmPlanes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD bmPlanes;
     * }
     */
    public static void bmPlanes$set(MemorySegment seg, short x) {
        _userBITMAP.bmPlanes$VH.set(seg, x);
    }
    public static short bmPlanes$get(MemorySegment seg, long index) {
        return (short)_userBITMAP.bmPlanes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmPlanes$set(MemorySegment seg, long index, short x) {
        _userBITMAP.bmPlanes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bmBitsPixel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bmBitsPixel"));
    public static VarHandle bmBitsPixel$VH() {
        return _userBITMAP.bmBitsPixel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD bmBitsPixel;
     * }
     */
    public static short bmBitsPixel$get(MemorySegment seg) {
        return (short)_userBITMAP.bmBitsPixel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD bmBitsPixel;
     * }
     */
    public static void bmBitsPixel$set(MemorySegment seg, short x) {
        _userBITMAP.bmBitsPixel$VH.set(seg, x);
    }
    public static short bmBitsPixel$get(MemorySegment seg, long index) {
        return (short)_userBITMAP.bmBitsPixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bmBitsPixel$set(MemorySegment seg, long index, short x) {
        _userBITMAP.bmBitsPixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _userBITMAP.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_userBITMAP.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _userBITMAP.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_userBITMAP.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _userBITMAP.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pBuffer$slice(MemorySegment seg) {
        return seg.asSlice(24, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

