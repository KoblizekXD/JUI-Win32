// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPSDA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HGLOBAL hDevMode;
 *     HGLOBAL hDevNames;
 *     DWORD Flags;
 *     POINT ptPaperSize;
 *     RECT rtMinMargin;
 *     RECT rtMargin;
 *     HINSTANCE hInstance;
 *     LPARAM lCustData;
 *     LPPAGESETUPHOOK lpfnPageSetupHook;
 *     LPPAGEPAINTHOOK lpfnPagePaintHook;
 *     LPCSTR lpPageSetupTemplateName;
 *     HGLOBAL hPageSetupTemplate;
 * };
 * }
 */
public class tagPSDA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevNames"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptPaperSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rtMinMargin"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rtMargin"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lCustData"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnPageSetupHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnPagePaintHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpPageSetupTemplateName"),
        Constants$root.C_POINTER$LAYOUT.withName("hPageSetupTemplate")
    ).withName("tagPSDA");
    public static MemoryLayout $LAYOUT() {
        return tagPSDA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagPSDA.lStructSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagPSDA.lStructSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static void lStructSize$set(MemorySegment seg, int x) {
        tagPSDA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagPSDA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagPSDA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagPSDA.hwndOwner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hwndOwner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.hwndOwner$VH.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevMode"));
    public static VarHandle hDevMode$VH() {
        return tagPSDA.hDevMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HGLOBAL hDevMode;
     * }
     */
    public static MemorySegment hDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hDevMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HGLOBAL hDevMode;
     * }
     */
    public static void hDevMode$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.hDevMode$VH.set(seg, x);
    }
    public static MemorySegment hDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevMode$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.hDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevNames"));
    public static VarHandle hDevNames$VH() {
        return tagPSDA.hDevNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HGLOBAL hDevNames;
     * }
     */
    public static MemorySegment hDevNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hDevNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HGLOBAL hDevNames;
     * }
     */
    public static void hDevNames$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.hDevNames$VH.set(seg, x);
    }
    public static MemorySegment hDevNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hDevNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevNames$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.hDevNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagPSDA.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)tagPSDA.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        tagPSDA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagPSDA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagPSDA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptPaperSize$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
    }
    public static MemorySegment rtMinMargin$slice(MemorySegment seg) {
        return seg.asSlice(44, 16);
    }
    public static MemorySegment rtMargin$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagPSDA.hInstance$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hInstance$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.hInstance$VH.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagPSDA.lCustData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagPSDA.lCustData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static void lCustData$set(MemorySegment seg, long x) {
        tagPSDA.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagPSDA.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagPSDA.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnPageSetupHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnPageSetupHook"));
    public static VarHandle lpfnPageSetupHook$VH() {
        return tagPSDA.lpfnPageSetupHook$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPPAGESETUPHOOK lpfnPageSetupHook;
     * }
     */
    public static MemorySegment lpfnPageSetupHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.lpfnPageSetupHook$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPPAGESETUPHOOK lpfnPageSetupHook;
     * }
     */
    public static void lpfnPageSetupHook$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.lpfnPageSetupHook$VH.set(seg, x);
    }
    public static MemorySegment lpfnPageSetupHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.lpfnPageSetupHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnPageSetupHook$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.lpfnPageSetupHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPPAGESETUPHOOK lpfnPageSetupHook(MemorySegment segment, SegmentScope scope) {
        return LPPAGESETUPHOOK.ofAddress(lpfnPageSetupHook$get(segment), scope);
    }
    static final VarHandle lpfnPagePaintHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnPagePaintHook"));
    public static VarHandle lpfnPagePaintHook$VH() {
        return tagPSDA.lpfnPagePaintHook$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPPAGEPAINTHOOK lpfnPagePaintHook;
     * }
     */
    public static MemorySegment lpfnPagePaintHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.lpfnPagePaintHook$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPPAGEPAINTHOOK lpfnPagePaintHook;
     * }
     */
    public static void lpfnPagePaintHook$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.lpfnPagePaintHook$VH.set(seg, x);
    }
    public static MemorySegment lpfnPagePaintHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.lpfnPagePaintHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnPagePaintHook$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.lpfnPagePaintHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPPAGEPAINTHOOK lpfnPagePaintHook(MemorySegment segment, SegmentScope scope) {
        return LPPAGEPAINTHOOK.ofAddress(lpfnPagePaintHook$get(segment), scope);
    }
    static final VarHandle lpPageSetupTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpPageSetupTemplateName"));
    public static VarHandle lpPageSetupTemplateName$VH() {
        return tagPSDA.lpPageSetupTemplateName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpPageSetupTemplateName;
     * }
     */
    public static MemorySegment lpPageSetupTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.lpPageSetupTemplateName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpPageSetupTemplateName;
     * }
     */
    public static void lpPageSetupTemplateName$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.lpPageSetupTemplateName$VH.set(seg, x);
    }
    public static MemorySegment lpPageSetupTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.lpPageSetupTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpPageSetupTemplateName$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.lpPageSetupTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hPageSetupTemplate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hPageSetupTemplate"));
    public static VarHandle hPageSetupTemplate$VH() {
        return tagPSDA.hPageSetupTemplate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HGLOBAL hPageSetupTemplate;
     * }
     */
    public static MemorySegment hPageSetupTemplate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hPageSetupTemplate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HGLOBAL hPageSetupTemplate;
     * }
     */
    public static void hPageSetupTemplate$set(MemorySegment seg, MemorySegment x) {
        tagPSDA.hPageSetupTemplate$VH.set(seg, x);
    }
    public static MemorySegment hPageSetupTemplate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPSDA.hPageSetupTemplate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hPageSetupTemplate$set(MemorySegment seg, long index, MemorySegment x) {
        tagPSDA.hPageSetupTemplate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


