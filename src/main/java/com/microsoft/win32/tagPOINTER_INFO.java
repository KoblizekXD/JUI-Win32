// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPOINTER_INFO {
 *     POINTER_INPUT_TYPE pointerType;
 *     UINT32 pointerId;
 *     UINT32 frameId;
 *     POINTER_FLAGS pointerFlags;
 *     HANDLE sourceDevice;
 *     HWND hwndTarget;
 *     POINT ptPixelLocation;
 *     POINT ptHimetricLocation;
 *     POINT ptPixelLocationRaw;
 *     POINT ptHimetricLocationRaw;
 *     DWORD dwTime;
 *     UINT32 historyCount;
 *     INT32 InputData;
 *     DWORD dwKeyStates;
 *     UINT64 PerformanceCount;
 *     POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
 * };
 * }
 */
public class tagPOINTER_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("pointerType"),
        Constants$root.C_LONG$LAYOUT.withName("pointerId"),
        Constants$root.C_LONG$LAYOUT.withName("frameId"),
        Constants$root.C_LONG$LAYOUT.withName("pointerFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("sourceDevice"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndTarget"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptPixelLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptHimetricLocation"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptPixelLocationRaw"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptHimetricLocationRaw"),
        Constants$root.C_LONG$LAYOUT.withName("dwTime"),
        Constants$root.C_LONG$LAYOUT.withName("historyCount"),
        Constants$root.C_LONG$LAYOUT.withName("InputData"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeyStates"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("PerformanceCount"),
        Constants$root.C_LONG$LAYOUT.withName("ButtonChangeType"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagPOINTER_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagPOINTER_INFO.$struct$LAYOUT;
    }
    static final VarHandle pointerType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pointerType"));
    public static VarHandle pointerType$VH() {
        return tagPOINTER_INFO.pointerType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_INPUT_TYPE pointerType;
     * }
     */
    public static int pointerType$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.pointerType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_INPUT_TYPE pointerType;
     * }
     */
    public static void pointerType$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.pointerType$VH.set(seg, x);
    }
    public static int pointerType$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.pointerType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerType$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.pointerType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pointerId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pointerId"));
    public static VarHandle pointerId$VH() {
        return tagPOINTER_INFO.pointerId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 pointerId;
     * }
     */
    public static int pointerId$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.pointerId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 pointerId;
     * }
     */
    public static void pointerId$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.pointerId$VH.set(seg, x);
    }
    public static int pointerId$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.pointerId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerId$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.pointerId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle frameId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frameId"));
    public static VarHandle frameId$VH() {
        return tagPOINTER_INFO.frameId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 frameId;
     * }
     */
    public static int frameId$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.frameId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 frameId;
     * }
     */
    public static void frameId$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.frameId$VH.set(seg, x);
    }
    public static int frameId$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.frameId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frameId$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.frameId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pointerFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pointerFlags"));
    public static VarHandle pointerFlags$VH() {
        return tagPOINTER_INFO.pointerFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_FLAGS pointerFlags;
     * }
     */
    public static int pointerFlags$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.pointerFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_FLAGS pointerFlags;
     * }
     */
    public static void pointerFlags$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.pointerFlags$VH.set(seg, x);
    }
    public static int pointerFlags$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.pointerFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerFlags$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.pointerFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sourceDevice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sourceDevice"));
    public static VarHandle sourceDevice$VH() {
        return tagPOINTER_INFO.sourceDevice$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE sourceDevice;
     * }
     */
    public static MemorySegment sourceDevice$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_INFO.sourceDevice$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE sourceDevice;
     * }
     */
    public static void sourceDevice$set(MemorySegment seg, MemorySegment x) {
        tagPOINTER_INFO.sourceDevice$VH.set(seg, x);
    }
    public static MemorySegment sourceDevice$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_INFO.sourceDevice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sourceDevice$set(MemorySegment seg, long index, MemorySegment x) {
        tagPOINTER_INFO.sourceDevice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndTarget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndTarget"));
    public static VarHandle hwndTarget$VH() {
        return tagPOINTER_INFO.hwndTarget$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndTarget;
     * }
     */
    public static MemorySegment hwndTarget$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_INFO.hwndTarget$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndTarget;
     * }
     */
    public static void hwndTarget$set(MemorySegment seg, MemorySegment x) {
        tagPOINTER_INFO.hwndTarget$VH.set(seg, x);
    }
    public static MemorySegment hwndTarget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_INFO.hwndTarget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndTarget$set(MemorySegment seg, long index, MemorySegment x) {
        tagPOINTER_INFO.hwndTarget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptPixelLocation$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment ptHimetricLocation$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static MemorySegment ptPixelLocationRaw$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static MemorySegment ptHimetricLocationRaw$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagPOINTER_INFO.dwTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwTime;
     * }
     */
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.dwTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwTime;
     * }
     */
    public static void dwTime$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle historyCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("historyCount"));
    public static VarHandle historyCount$VH() {
        return tagPOINTER_INFO.historyCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 historyCount;
     * }
     */
    public static int historyCount$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.historyCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 historyCount;
     * }
     */
    public static void historyCount$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.historyCount$VH.set(seg, x);
    }
    public static int historyCount$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.historyCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void historyCount$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.historyCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InputData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InputData"));
    public static VarHandle InputData$VH() {
        return tagPOINTER_INFO.InputData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT32 InputData;
     * }
     */
    public static int InputData$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.InputData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT32 InputData;
     * }
     */
    public static void InputData$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.InputData$VH.set(seg, x);
    }
    public static int InputData$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.InputData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InputData$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.InputData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeyStates$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeyStates"));
    public static VarHandle dwKeyStates$VH() {
        return tagPOINTER_INFO.dwKeyStates$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeyStates;
     * }
     */
    public static int dwKeyStates$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.dwKeyStates$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeyStates;
     * }
     */
    public static void dwKeyStates$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.dwKeyStates$VH.set(seg, x);
    }
    public static int dwKeyStates$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.dwKeyStates$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeyStates$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.dwKeyStates$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PerformanceCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PerformanceCount"));
    public static VarHandle PerformanceCount$VH() {
        return tagPOINTER_INFO.PerformanceCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT64 PerformanceCount;
     * }
     */
    public static long PerformanceCount$get(MemorySegment seg) {
        return (long)tagPOINTER_INFO.PerformanceCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT64 PerformanceCount;
     * }
     */
    public static void PerformanceCount$set(MemorySegment seg, long x) {
        tagPOINTER_INFO.PerformanceCount$VH.set(seg, x);
    }
    public static long PerformanceCount$get(MemorySegment seg, long index) {
        return (long)tagPOINTER_INFO.PerformanceCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PerformanceCount$set(MemorySegment seg, long index, long x) {
        tagPOINTER_INFO.PerformanceCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ButtonChangeType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ButtonChangeType"));
    public static VarHandle ButtonChangeType$VH() {
        return tagPOINTER_INFO.ButtonChangeType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
     * }
     */
    public static int ButtonChangeType$get(MemorySegment seg) {
        return (int)tagPOINTER_INFO.ButtonChangeType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_BUTTON_CHANGE_TYPE ButtonChangeType;
     * }
     */
    public static void ButtonChangeType$set(MemorySegment seg, int x) {
        tagPOINTER_INFO.ButtonChangeType$VH.set(seg, x);
    }
    public static int ButtonChangeType$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_INFO.ButtonChangeType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ButtonChangeType$set(MemorySegment seg, long index, int x) {
        tagPOINTER_INFO.ButtonChangeType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


