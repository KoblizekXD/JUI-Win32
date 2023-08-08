// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMOUSEHOOKSTRUCT {
 *     POINT pt;
 *     HWND hwnd;
 *     UINT wHitTestCode;
 *     ULONG_PTR dwExtraInfo;
 * };
 * }
 */
public class tagMOUSEHOOKSTRUCT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("pt"),
        Constants$root.C_POINTER$LAYOUT.withName("hwnd"),
        Constants$root.C_LONG$LAYOUT.withName("wHitTestCode"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwExtraInfo")
    ).withName("tagMOUSEHOOKSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagMOUSEHOOKSTRUCT.$struct$LAYOUT;
    }
    public static MemorySegment pt$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return tagMOUSEHOOKSTRUCT.hwnd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMOUSEHOOKSTRUCT.hwnd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        tagMOUSEHOOKSTRUCT.hwnd$VH.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMOUSEHOOKSTRUCT.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        tagMOUSEHOOKSTRUCT.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wHitTestCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wHitTestCode"));
    public static VarHandle wHitTestCode$VH() {
        return tagMOUSEHOOKSTRUCT.wHitTestCode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wHitTestCode;
     * }
     */
    public static int wHitTestCode$get(MemorySegment seg) {
        return (int)tagMOUSEHOOKSTRUCT.wHitTestCode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wHitTestCode;
     * }
     */
    public static void wHitTestCode$set(MemorySegment seg, int x) {
        tagMOUSEHOOKSTRUCT.wHitTestCode$VH.set(seg, x);
    }
    public static int wHitTestCode$get(MemorySegment seg, long index) {
        return (int)tagMOUSEHOOKSTRUCT.wHitTestCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wHitTestCode$set(MemorySegment seg, long index, int x) {
        tagMOUSEHOOKSTRUCT.wHitTestCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagMOUSEHOOKSTRUCT.dwExtraInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR dwExtraInfo;
     * }
     */
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagMOUSEHOOKSTRUCT.dwExtraInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR dwExtraInfo;
     * }
     */
    public static void dwExtraInfo$set(MemorySegment seg, long x) {
        tagMOUSEHOOKSTRUCT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagMOUSEHOOKSTRUCT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagMOUSEHOOKSTRUCT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

