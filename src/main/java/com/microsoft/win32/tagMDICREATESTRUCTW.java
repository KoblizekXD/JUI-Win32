// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMDICREATESTRUCTW {
 *     LPCWSTR szClass;
 *     LPCWSTR szTitle;
 *     HANDLE hOwner;
 *     int x;
 *     int y;
 *     int cx;
 *     int cy;
 *     DWORD style;
 *     LPARAM lParam;
 * };
 * }
 */
public class tagMDICREATESTRUCTW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("szClass"),
        Constants$root.C_POINTER$LAYOUT.withName("szTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("hOwner"),
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("cx"),
        Constants$root.C_LONG$LAYOUT.withName("cy"),
        Constants$root.C_LONG$LAYOUT.withName("style"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lParam")
    ).withName("tagMDICREATESTRUCTW");
    public static MemoryLayout $LAYOUT() {
        return tagMDICREATESTRUCTW.$struct$LAYOUT;
    }
    static final VarHandle szClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szClass"));
    public static VarHandle szClass$VH() {
        return tagMDICREATESTRUCTW.szClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR szClass;
     * }
     */
    public static MemorySegment szClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMDICREATESTRUCTW.szClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR szClass;
     * }
     */
    public static void szClass$set(MemorySegment seg, MemorySegment x) {
        tagMDICREATESTRUCTW.szClass$VH.set(seg, x);
    }
    public static MemorySegment szClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMDICREATESTRUCTW.szClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szClass$set(MemorySegment seg, long index, MemorySegment x) {
        tagMDICREATESTRUCTW.szClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle szTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("szTitle"));
    public static VarHandle szTitle$VH() {
        return tagMDICREATESTRUCTW.szTitle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR szTitle;
     * }
     */
    public static MemorySegment szTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMDICREATESTRUCTW.szTitle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR szTitle;
     * }
     */
    public static void szTitle$set(MemorySegment seg, MemorySegment x) {
        tagMDICREATESTRUCTW.szTitle$VH.set(seg, x);
    }
    public static MemorySegment szTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMDICREATESTRUCTW.szTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void szTitle$set(MemorySegment seg, long index, MemorySegment x) {
        tagMDICREATESTRUCTW.szTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hOwner"));
    public static VarHandle hOwner$VH() {
        return tagMDICREATESTRUCTW.hOwner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hOwner;
     * }
     */
    public static MemorySegment hOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMDICREATESTRUCTW.hOwner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hOwner;
     * }
     */
    public static void hOwner$set(MemorySegment seg, MemorySegment x) {
        tagMDICREATESTRUCTW.hOwner$VH.set(seg, x);
    }
    public static MemorySegment hOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMDICREATESTRUCTW.hOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hOwner$set(MemorySegment seg, long index, MemorySegment x) {
        tagMDICREATESTRUCTW.hOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagMDICREATESTRUCTW.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTW.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        tagMDICREATESTRUCTW.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTW.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTW.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagMDICREATESTRUCTW.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTW.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        tagMDICREATESTRUCTW.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTW.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTW.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return tagMDICREATESTRUCTW.cx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cx;
     * }
     */
    public static int cx$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTW.cx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cx;
     * }
     */
    public static void cx$set(MemorySegment seg, int x) {
        tagMDICREATESTRUCTW.cx$VH.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTW.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTW.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return tagMDICREATESTRUCTW.cy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cy;
     * }
     */
    public static int cy$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTW.cy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cy;
     * }
     */
    public static void cy$set(MemorySegment seg, int x) {
        tagMDICREATESTRUCTW.cy$VH.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTW.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTW.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagMDICREATESTRUCTW.style$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD style;
     * }
     */
    public static int style$get(MemorySegment seg) {
        return (int)tagMDICREATESTRUCTW.style$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD style;
     * }
     */
    public static void style$set(MemorySegment seg, int x) {
        tagMDICREATESTRUCTW.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagMDICREATESTRUCTW.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagMDICREATESTRUCTW.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return tagMDICREATESTRUCTW.lParam$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lParam;
     * }
     */
    public static long lParam$get(MemorySegment seg) {
        return (long)tagMDICREATESTRUCTW.lParam$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lParam;
     * }
     */
    public static void lParam$set(MemorySegment seg, long x) {
        tagMDICREATESTRUCTW.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)tagMDICREATESTRUCTW.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        tagMDICREATESTRUCTW.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


