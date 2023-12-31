// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagWNDCLASSW {
 *     UINT style;
 *     WNDPROC lpfnWndProc;
 *     int cbClsExtra;
 *     int cbWndExtra;
 *     HINSTANCE hInstance;
 *     HICON hIcon;
 *     HCURSOR hCursor;
 *     HBRUSH hbrBackground;
 *     LPCWSTR lpszMenuName;
 *     LPCWSTR lpszClassName;
 * };
 * }
 */
public class tagWNDCLASSW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("style"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnWndProc"),
        Constants$root.C_LONG$LAYOUT.withName("cbClsExtra"),
        Constants$root.C_LONG$LAYOUT.withName("cbWndExtra"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
        Constants$root.C_POINTER$LAYOUT.withName("hCursor"),
        Constants$root.C_POINTER$LAYOUT.withName("hbrBackground"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszMenuName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpszClassName")
    ).withName("tagWNDCLASSW");
    public static MemoryLayout $LAYOUT() {
        return tagWNDCLASSW.$struct$LAYOUT;
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagWNDCLASSW.style$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT style;
     * }
     */
    public static int style$get(MemorySegment seg) {
        return (int)tagWNDCLASSW.style$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT style;
     * }
     */
    public static void style$set(MemorySegment seg, int x) {
        tagWNDCLASSW.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSW.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSW.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnWndProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnWndProc"));
    public static VarHandle lpfnWndProc$VH() {
        return tagWNDCLASSW.lpfnWndProc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WNDPROC lpfnWndProc;
     * }
     */
    public static MemorySegment lpfnWndProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.lpfnWndProc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WNDPROC lpfnWndProc;
     * }
     */
    public static void lpfnWndProc$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.lpfnWndProc$VH.set(seg, x);
    }
    public static MemorySegment lpfnWndProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.lpfnWndProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnWndProc$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.lpfnWndProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static WNDPROC lpfnWndProc(MemorySegment segment, SegmentScope scope) {
        return WNDPROC.ofAddress(lpfnWndProc$get(segment), scope);
    }
    static final VarHandle cbClsExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbClsExtra"));
    public static VarHandle cbClsExtra$VH() {
        return tagWNDCLASSW.cbClsExtra$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cbClsExtra;
     * }
     */
    public static int cbClsExtra$get(MemorySegment seg) {
        return (int)tagWNDCLASSW.cbClsExtra$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cbClsExtra;
     * }
     */
    public static void cbClsExtra$set(MemorySegment seg, int x) {
        tagWNDCLASSW.cbClsExtra$VH.set(seg, x);
    }
    public static int cbClsExtra$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSW.cbClsExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbClsExtra$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSW.cbClsExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbWndExtra$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbWndExtra"));
    public static VarHandle cbWndExtra$VH() {
        return tagWNDCLASSW.cbWndExtra$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cbWndExtra;
     * }
     */
    public static int cbWndExtra$get(MemorySegment seg) {
        return (int)tagWNDCLASSW.cbWndExtra$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cbWndExtra;
     * }
     */
    public static void cbWndExtra$set(MemorySegment seg, int x) {
        tagWNDCLASSW.cbWndExtra$VH.set(seg, x);
    }
    public static int cbWndExtra$get(MemorySegment seg, long index) {
        return (int)tagWNDCLASSW.cbWndExtra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbWndExtra$set(MemorySegment seg, long index, int x) {
        tagWNDCLASSW.cbWndExtra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagWNDCLASSW.hInstance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hInstance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.hInstance$VH.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return tagWNDCLASSW.hIcon$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HICON hIcon;
     * }
     */
    public static MemorySegment hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hIcon$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HICON hIcon;
     * }
     */
    public static void hIcon$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.hIcon$VH.set(seg, x);
    }
    public static MemorySegment hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCursor"));
    public static VarHandle hCursor$VH() {
        return tagWNDCLASSW.hCursor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCURSOR hCursor;
     * }
     */
    public static MemorySegment hCursor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hCursor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCURSOR hCursor;
     * }
     */
    public static void hCursor$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.hCursor$VH.set(seg, x);
    }
    public static MemorySegment hCursor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hCursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCursor$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.hCursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbrBackground$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbrBackground"));
    public static VarHandle hbrBackground$VH() {
        return tagWNDCLASSW.hbrBackground$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HBRUSH hbrBackground;
     * }
     */
    public static MemorySegment hbrBackground$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hbrBackground$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HBRUSH hbrBackground;
     * }
     */
    public static void hbrBackground$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.hbrBackground$VH.set(seg, x);
    }
    public static MemorySegment hbrBackground$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.hbrBackground$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbrBackground$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.hbrBackground$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszMenuName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszMenuName"));
    public static VarHandle lpszMenuName$VH() {
        return tagWNDCLASSW.lpszMenuName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpszMenuName;
     * }
     */
    public static MemorySegment lpszMenuName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.lpszMenuName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpszMenuName;
     * }
     */
    public static void lpszMenuName$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.lpszMenuName$VH.set(seg, x);
    }
    public static MemorySegment lpszMenuName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.lpszMenuName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszMenuName$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.lpszMenuName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszClassName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszClassName"));
    public static VarHandle lpszClassName$VH() {
        return tagWNDCLASSW.lpszClassName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpszClassName;
     * }
     */
    public static MemorySegment lpszClassName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.lpszClassName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpszClassName;
     * }
     */
    public static void lpszClassName$set(MemorySegment seg, MemorySegment x) {
        tagWNDCLASSW.lpszClassName$VH.set(seg, x);
    }
    public static MemorySegment lpszClassName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagWNDCLASSW.lpszClassName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszClassName$set(MemorySegment seg, long index, MemorySegment x) {
        tagWNDCLASSW.lpszClassName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


