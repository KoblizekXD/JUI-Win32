// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDROPSTRUCT {
 *     HWND hwndSource;
 *     HWND hwndSink;
 *     DWORD wFmt;
 *     ULONG_PTR dwData;
 *     POINT ptDrop;
 *     DWORD dwControlData;
 * };
 * }
 */
public class tagDROPSTRUCT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hwndSource"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndSink"),
        Constants$root.C_LONG$LAYOUT.withName("wFmt"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwData"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptDrop"),
        Constants$root.C_LONG$LAYOUT.withName("dwControlData"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagDROPSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagDROPSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle hwndSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndSource"));
    public static VarHandle hwndSource$VH() {
        return tagDROPSTRUCT.hwndSource$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndSource;
     * }
     */
    public static MemorySegment hwndSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagDROPSTRUCT.hwndSource$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndSource;
     * }
     */
    public static void hwndSource$set(MemorySegment seg, MemorySegment x) {
        tagDROPSTRUCT.hwndSource$VH.set(seg, x);
    }
    public static MemorySegment hwndSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagDROPSTRUCT.hwndSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndSource$set(MemorySegment seg, long index, MemorySegment x) {
        tagDROPSTRUCT.hwndSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndSink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndSink"));
    public static VarHandle hwndSink$VH() {
        return tagDROPSTRUCT.hwndSink$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndSink;
     * }
     */
    public static MemorySegment hwndSink$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagDROPSTRUCT.hwndSink$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndSink;
     * }
     */
    public static void hwndSink$set(MemorySegment seg, MemorySegment x) {
        tagDROPSTRUCT.hwndSink$VH.set(seg, x);
    }
    public static MemorySegment hwndSink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagDROPSTRUCT.hwndSink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndSink$set(MemorySegment seg, long index, MemorySegment x) {
        tagDROPSTRUCT.hwndSink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFmt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFmt"));
    public static VarHandle wFmt$VH() {
        return tagDROPSTRUCT.wFmt$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD wFmt;
     * }
     */
    public static int wFmt$get(MemorySegment seg) {
        return (int)tagDROPSTRUCT.wFmt$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD wFmt;
     * }
     */
    public static void wFmt$set(MemorySegment seg, int x) {
        tagDROPSTRUCT.wFmt$VH.set(seg, x);
    }
    public static int wFmt$get(MemorySegment seg, long index) {
        return (int)tagDROPSTRUCT.wFmt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFmt$set(MemorySegment seg, long index, int x) {
        tagDROPSTRUCT.wFmt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwData"));
    public static VarHandle dwData$VH() {
        return tagDROPSTRUCT.dwData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR dwData;
     * }
     */
    public static long dwData$get(MemorySegment seg) {
        return (long)tagDROPSTRUCT.dwData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR dwData;
     * }
     */
    public static void dwData$set(MemorySegment seg, long x) {
        tagDROPSTRUCT.dwData$VH.set(seg, x);
    }
    public static long dwData$get(MemorySegment seg, long index) {
        return (long)tagDROPSTRUCT.dwData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwData$set(MemorySegment seg, long index, long x) {
        tagDROPSTRUCT.dwData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptDrop$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    static final VarHandle dwControlData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwControlData"));
    public static VarHandle dwControlData$VH() {
        return tagDROPSTRUCT.dwControlData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwControlData;
     * }
     */
    public static int dwControlData$get(MemorySegment seg) {
        return (int)tagDROPSTRUCT.dwControlData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwControlData;
     * }
     */
    public static void dwControlData$set(MemorySegment seg, int x) {
        tagDROPSTRUCT.dwControlData$VH.set(seg, x);
    }
    public static int dwControlData$get(MemorySegment seg, long index) {
        return (int)tagDROPSTRUCT.dwControlData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlData$set(MemorySegment seg, long index, int x) {
        tagDROPSTRUCT.dwControlData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


