// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHFILEOPSTRUCTW {
 *     HWND hwnd;
 *     UINT wFunc;
 *     PCZZWSTR pFrom;
 *     PCZZWSTR pTo;
 *     FILEOP_FLAGS fFlags;
 *     BOOL fAnyOperationsAborted;
 *     LPVOID hNameMappings;
 *     PCWSTR lpszProgressTitle;
 * };
 * }
 */
public class _SHFILEOPSTRUCTW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hwnd"),
        Constants$root.C_LONG$LAYOUT.withName("wFunc"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pFrom"),
        Constants$root.C_POINTER$LAYOUT.withName("pTo"),
        Constants$root.C_SHORT$LAYOUT.withName("fFlags"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("fAnyOperationsAborted"),
        Constants$root.C_POINTER$LAYOUT.withName("hNameMappings"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszProgressTitle")
    ).withName("_SHFILEOPSTRUCTW");
    public static MemoryLayout $LAYOUT() {
        return _SHFILEOPSTRUCTW.$struct$LAYOUT;
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return _SHFILEOPSTRUCTW.hwnd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.hwnd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        _SHFILEOPSTRUCTW.hwnd$VH.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        _SHFILEOPSTRUCTW.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFunc"));
    public static VarHandle wFunc$VH() {
        return _SHFILEOPSTRUCTW.wFunc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wFunc;
     * }
     */
    public static int wFunc$get(MemorySegment seg) {
        return (int)_SHFILEOPSTRUCTW.wFunc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wFunc;
     * }
     */
    public static void wFunc$set(MemorySegment seg, int x) {
        _SHFILEOPSTRUCTW.wFunc$VH.set(seg, x);
    }
    public static int wFunc$get(MemorySegment seg, long index) {
        return (int)_SHFILEOPSTRUCTW.wFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFunc$set(MemorySegment seg, long index, int x) {
        _SHFILEOPSTRUCTW.wFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pFrom$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pFrom"));
    public static VarHandle pFrom$VH() {
        return _SHFILEOPSTRUCTW.pFrom$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCZZWSTR pFrom;
     * }
     */
    public static MemorySegment pFrom$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.pFrom$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCZZWSTR pFrom;
     * }
     */
    public static void pFrom$set(MemorySegment seg, MemorySegment x) {
        _SHFILEOPSTRUCTW.pFrom$VH.set(seg, x);
    }
    public static MemorySegment pFrom$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.pFrom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pFrom$set(MemorySegment seg, long index, MemorySegment x) {
        _SHFILEOPSTRUCTW.pFrom$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTo"));
    public static VarHandle pTo$VH() {
        return _SHFILEOPSTRUCTW.pTo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCZZWSTR pTo;
     * }
     */
    public static MemorySegment pTo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.pTo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCZZWSTR pTo;
     * }
     */
    public static void pTo$set(MemorySegment seg, MemorySegment x) {
        _SHFILEOPSTRUCTW.pTo$VH.set(seg, x);
    }
    public static MemorySegment pTo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.pTo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTo$set(MemorySegment seg, long index, MemorySegment x) {
        _SHFILEOPSTRUCTW.pTo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fFlags"));
    public static VarHandle fFlags$VH() {
        return _SHFILEOPSTRUCTW.fFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FILEOP_FLAGS fFlags;
     * }
     */
    public static short fFlags$get(MemorySegment seg) {
        return (short)_SHFILEOPSTRUCTW.fFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FILEOP_FLAGS fFlags;
     * }
     */
    public static void fFlags$set(MemorySegment seg, short x) {
        _SHFILEOPSTRUCTW.fFlags$VH.set(seg, x);
    }
    public static short fFlags$get(MemorySegment seg, long index) {
        return (short)_SHFILEOPSTRUCTW.fFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fFlags$set(MemorySegment seg, long index, short x) {
        _SHFILEOPSTRUCTW.fFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fAnyOperationsAborted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fAnyOperationsAborted"));
    public static VarHandle fAnyOperationsAborted$VH() {
        return _SHFILEOPSTRUCTW.fAnyOperationsAborted$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fAnyOperationsAborted;
     * }
     */
    public static int fAnyOperationsAborted$get(MemorySegment seg) {
        return (int)_SHFILEOPSTRUCTW.fAnyOperationsAborted$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fAnyOperationsAborted;
     * }
     */
    public static void fAnyOperationsAborted$set(MemorySegment seg, int x) {
        _SHFILEOPSTRUCTW.fAnyOperationsAborted$VH.set(seg, x);
    }
    public static int fAnyOperationsAborted$get(MemorySegment seg, long index) {
        return (int)_SHFILEOPSTRUCTW.fAnyOperationsAborted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fAnyOperationsAborted$set(MemorySegment seg, long index, int x) {
        _SHFILEOPSTRUCTW.fAnyOperationsAborted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hNameMappings$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hNameMappings"));
    public static VarHandle hNameMappings$VH() {
        return _SHFILEOPSTRUCTW.hNameMappings$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID hNameMappings;
     * }
     */
    public static MemorySegment hNameMappings$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.hNameMappings$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID hNameMappings;
     * }
     */
    public static void hNameMappings$set(MemorySegment seg, MemorySegment x) {
        _SHFILEOPSTRUCTW.hNameMappings$VH.set(seg, x);
    }
    public static MemorySegment hNameMappings$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.hNameMappings$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hNameMappings$set(MemorySegment seg, long index, MemorySegment x) {
        _SHFILEOPSTRUCTW.hNameMappings$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszProgressTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszProgressTitle"));
    public static VarHandle lpszProgressTitle$VH() {
        return _SHFILEOPSTRUCTW.lpszProgressTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR lpszProgressTitle;
     * }
     */
    public static MemorySegment lpszProgressTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.lpszProgressTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR lpszProgressTitle;
     * }
     */
    public static void lpszProgressTitle$set(MemorySegment seg, MemorySegment x) {
        _SHFILEOPSTRUCTW.lpszProgressTitle$VH.set(seg, x);
    }
    public static MemorySegment lpszProgressTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHFILEOPSTRUCTW.lpszProgressTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszProgressTitle$set(MemorySegment seg, long index, MemorySegment x) {
        _SHFILEOPSTRUCTW.lpszProgressTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

