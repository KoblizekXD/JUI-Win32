// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMCI_ANIM_WINDOW_PARMSA {
 *     DWORD_PTR dwCallback;
 *     HWND hWnd;
 *     UINT nCmdShow;
 *     LPCSTR lpstrText;
 * };
 * }
 */
public class tagMCI_ANIM_WINDOW_PARMSA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("hWnd"),
        Constants$root.C_LONG$LAYOUT.withName("nCmdShow"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpstrText")
    ).withName("tagMCI_ANIM_WINDOW_PARMSA");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_ANIM_WINDOW_PARMSA.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_ANIM_WINDOW_PARMSA.dwCallback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_ANIM_WINDOW_PARMSA.dwCallback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static void dwCallback$set(MemorySegment seg, long x) {
        tagMCI_ANIM_WINDOW_PARMSA.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_ANIM_WINDOW_PARMSA.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_ANIM_WINDOW_PARMSA.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hWnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hWnd"));
    public static VarHandle hWnd$VH() {
        return tagMCI_ANIM_WINDOW_PARMSA.hWnd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hWnd;
     * }
     */
    public static MemorySegment hWnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMCI_ANIM_WINDOW_PARMSA.hWnd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hWnd;
     * }
     */
    public static void hWnd$set(MemorySegment seg, MemorySegment x) {
        tagMCI_ANIM_WINDOW_PARMSA.hWnd$VH.set(seg, x);
    }
    public static MemorySegment hWnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMCI_ANIM_WINDOW_PARMSA.hWnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hWnd$set(MemorySegment seg, long index, MemorySegment x) {
        tagMCI_ANIM_WINDOW_PARMSA.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCmdShow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCmdShow"));
    public static VarHandle nCmdShow$VH() {
        return tagMCI_ANIM_WINDOW_PARMSA.nCmdShow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT nCmdShow;
     * }
     */
    public static int nCmdShow$get(MemorySegment seg) {
        return (int)tagMCI_ANIM_WINDOW_PARMSA.nCmdShow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT nCmdShow;
     * }
     */
    public static void nCmdShow$set(MemorySegment seg, int x) {
        tagMCI_ANIM_WINDOW_PARMSA.nCmdShow$VH.set(seg, x);
    }
    public static int nCmdShow$get(MemorySegment seg, long index) {
        return (int)tagMCI_ANIM_WINDOW_PARMSA.nCmdShow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCmdShow$set(MemorySegment seg, long index, int x) {
        tagMCI_ANIM_WINDOW_PARMSA.nCmdShow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrText$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrText"));
    public static VarHandle lpstrText$VH() {
        return tagMCI_ANIM_WINDOW_PARMSA.lpstrText$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrText;
     * }
     */
    public static MemorySegment lpstrText$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMCI_ANIM_WINDOW_PARMSA.lpstrText$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrText;
     * }
     */
    public static void lpstrText$set(MemorySegment seg, MemorySegment x) {
        tagMCI_ANIM_WINDOW_PARMSA.lpstrText$VH.set(seg, x);
    }
    public static MemorySegment lpstrText$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMCI_ANIM_WINDOW_PARMSA.lpstrText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrText$set(MemorySegment seg, long index, MemorySegment x) {
        tagMCI_ANIM_WINDOW_PARMSA.lpstrText$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


