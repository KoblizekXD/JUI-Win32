// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DRAGINFOA {
 *     UINT uSize;
 *     POINT pt;
 *     BOOL fNC;
 *     PZZSTR lpFileList;
 *     DWORD grfKeyState;
 * };
 * }
 */
public class _DRAGINFOA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("uSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("pt"),
        Constants$root.C_LONG$LAYOUT.withName("fNC"),
        Constants$root.C_POINTER$LAYOUT.withName("lpFileList"),
        Constants$root.C_LONG$LAYOUT.withName("grfKeyState"),
        MemoryLayout.paddingLayout(32)
    ).withName("_DRAGINFOA");
    public static MemoryLayout $LAYOUT() {
        return _DRAGINFOA.$struct$LAYOUT;
    }
    static final VarHandle uSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uSize"));
    public static VarHandle uSize$VH() {
        return _DRAGINFOA.uSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uSize;
     * }
     */
    public static int uSize$get(MemorySegment seg) {
        return (int)_DRAGINFOA.uSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uSize;
     * }
     */
    public static void uSize$set(MemorySegment seg, int x) {
        _DRAGINFOA.uSize$VH.set(seg, x);
    }
    public static int uSize$get(MemorySegment seg, long index) {
        return (int)_DRAGINFOA.uSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uSize$set(MemorySegment seg, long index, int x) {
        _DRAGINFOA.uSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pt$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    static final VarHandle fNC$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fNC"));
    public static VarHandle fNC$VH() {
        return _DRAGINFOA.fNC$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fNC;
     * }
     */
    public static int fNC$get(MemorySegment seg) {
        return (int)_DRAGINFOA.fNC$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fNC;
     * }
     */
    public static void fNC$set(MemorySegment seg, int x) {
        _DRAGINFOA.fNC$VH.set(seg, x);
    }
    public static int fNC$get(MemorySegment seg, long index) {
        return (int)_DRAGINFOA.fNC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fNC$set(MemorySegment seg, long index, int x) {
        _DRAGINFOA.fNC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpFileList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpFileList"));
    public static VarHandle lpFileList$VH() {
        return _DRAGINFOA.lpFileList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PZZSTR lpFileList;
     * }
     */
    public static MemorySegment lpFileList$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRAGINFOA.lpFileList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PZZSTR lpFileList;
     * }
     */
    public static void lpFileList$set(MemorySegment seg, MemorySegment x) {
        _DRAGINFOA.lpFileList$VH.set(seg, x);
    }
    public static MemorySegment lpFileList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRAGINFOA.lpFileList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpFileList$set(MemorySegment seg, long index, MemorySegment x) {
        _DRAGINFOA.lpFileList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfKeyState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfKeyState"));
    public static VarHandle grfKeyState$VH() {
        return _DRAGINFOA.grfKeyState$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfKeyState;
     * }
     */
    public static int grfKeyState$get(MemorySegment seg) {
        return (int)_DRAGINFOA.grfKeyState$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfKeyState;
     * }
     */
    public static void grfKeyState$set(MemorySegment seg, int x) {
        _DRAGINFOA.grfKeyState$VH.set(seg, x);
    }
    public static int grfKeyState$get(MemorySegment seg, long index) {
        return (int)_DRAGINFOA.grfKeyState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfKeyState$set(MemorySegment seg, long index, int x) {
        _DRAGINFOA.grfKeyState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


