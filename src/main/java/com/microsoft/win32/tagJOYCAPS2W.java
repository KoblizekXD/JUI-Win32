// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagJOYCAPS2W {
 *     WORD wMid;
 *     WORD wPid;
 *     WCHAR szPname[32];
 *     UINT wXmin;
 *     UINT wXmax;
 *     UINT wYmin;
 *     UINT wYmax;
 *     UINT wZmin;
 *     UINT wZmax;
 *     UINT wNumButtons;
 *     UINT wPeriodMin;
 *     UINT wPeriodMax;
 *     UINT wRmin;
 *     UINT wRmax;
 *     UINT wUmin;
 *     UINT wUmax;
 *     UINT wVmin;
 *     UINT wVmax;
 *     UINT wCaps;
 *     UINT wMaxAxes;
 *     UINT wNumAxes;
 *     UINT wMaxButtons;
 *     WCHAR szRegKey[32];
 *     WCHAR szOEMVxD[260];
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * };
 * }
 */
public class tagJOYCAPS2W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("wXmin"),
        Constants$root.C_LONG$LAYOUT.withName("wXmax"),
        Constants$root.C_LONG$LAYOUT.withName("wYmin"),
        Constants$root.C_LONG$LAYOUT.withName("wYmax"),
        Constants$root.C_LONG$LAYOUT.withName("wZmin"),
        Constants$root.C_LONG$LAYOUT.withName("wZmax"),
        Constants$root.C_LONG$LAYOUT.withName("wNumButtons"),
        Constants$root.C_LONG$LAYOUT.withName("wPeriodMin"),
        Constants$root.C_LONG$LAYOUT.withName("wPeriodMax"),
        Constants$root.C_LONG$LAYOUT.withName("wRmin"),
        Constants$root.C_LONG$LAYOUT.withName("wRmax"),
        Constants$root.C_LONG$LAYOUT.withName("wUmin"),
        Constants$root.C_LONG$LAYOUT.withName("wUmax"),
        Constants$root.C_LONG$LAYOUT.withName("wVmin"),
        Constants$root.C_LONG$LAYOUT.withName("wVmax"),
        Constants$root.C_LONG$LAYOUT.withName("wCaps"),
        Constants$root.C_LONG$LAYOUT.withName("wMaxAxes"),
        Constants$root.C_LONG$LAYOUT.withName("wNumAxes"),
        Constants$root.C_LONG$LAYOUT.withName("wMaxButtons"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szRegKey"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_SHORT$LAYOUT).withName("szOEMVxD"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ManufacturerGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProductGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("NameGuid")
    ).withName("tagJOYCAPS2W");
    public static MemoryLayout $LAYOUT() {
        return tagJOYCAPS2W.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagJOYCAPS2W.wMid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)tagJOYCAPS2W.wMid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        tagJOYCAPS2W.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagJOYCAPS2W.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagJOYCAPS2W.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagJOYCAPS2W.wPid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)tagJOYCAPS2W.wPid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        tagJOYCAPS2W.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagJOYCAPS2W.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagJOYCAPS2W.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(4, 64);
    }
    static final VarHandle wXmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wXmin"));
    public static VarHandle wXmin$VH() {
        return tagJOYCAPS2W.wXmin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wXmin;
     * }
     */
    public static int wXmin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wXmin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wXmin;
     * }
     */
    public static void wXmin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wXmin$VH.set(seg, x);
    }
    public static int wXmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wXmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wXmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wXmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wXmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wXmax"));
    public static VarHandle wXmax$VH() {
        return tagJOYCAPS2W.wXmax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wXmax;
     * }
     */
    public static int wXmax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wXmax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wXmax;
     * }
     */
    public static void wXmax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wXmax$VH.set(seg, x);
    }
    public static int wXmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wXmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wXmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wXmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wYmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wYmin"));
    public static VarHandle wYmin$VH() {
        return tagJOYCAPS2W.wYmin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wYmin;
     * }
     */
    public static int wYmin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wYmin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wYmin;
     * }
     */
    public static void wYmin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wYmin$VH.set(seg, x);
    }
    public static int wYmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wYmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wYmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wYmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wYmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wYmax"));
    public static VarHandle wYmax$VH() {
        return tagJOYCAPS2W.wYmax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wYmax;
     * }
     */
    public static int wYmax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wYmax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wYmax;
     * }
     */
    public static void wYmax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wYmax$VH.set(seg, x);
    }
    public static int wYmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wYmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wYmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wYmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wZmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wZmin"));
    public static VarHandle wZmin$VH() {
        return tagJOYCAPS2W.wZmin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wZmin;
     * }
     */
    public static int wZmin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wZmin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wZmin;
     * }
     */
    public static void wZmin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wZmin$VH.set(seg, x);
    }
    public static int wZmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wZmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wZmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wZmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wZmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wZmax"));
    public static VarHandle wZmax$VH() {
        return tagJOYCAPS2W.wZmax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wZmax;
     * }
     */
    public static int wZmax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wZmax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wZmax;
     * }
     */
    public static void wZmax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wZmax$VH.set(seg, x);
    }
    public static int wZmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wZmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wZmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wZmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNumButtons$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wNumButtons"));
    public static VarHandle wNumButtons$VH() {
        return tagJOYCAPS2W.wNumButtons$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wNumButtons;
     * }
     */
    public static int wNumButtons$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wNumButtons$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wNumButtons;
     * }
     */
    public static void wNumButtons$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wNumButtons$VH.set(seg, x);
    }
    public static int wNumButtons$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wNumButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNumButtons$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wNumButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPeriodMin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMin"));
    public static VarHandle wPeriodMin$VH() {
        return tagJOYCAPS2W.wPeriodMin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wPeriodMin;
     * }
     */
    public static int wPeriodMin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wPeriodMin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wPeriodMin;
     * }
     */
    public static void wPeriodMin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wPeriodMin$VH.set(seg, x);
    }
    public static int wPeriodMin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wPeriodMin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wPeriodMin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPeriodMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPeriodMax"));
    public static VarHandle wPeriodMax$VH() {
        return tagJOYCAPS2W.wPeriodMax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wPeriodMax;
     * }
     */
    public static int wPeriodMax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wPeriodMax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wPeriodMax;
     * }
     */
    public static void wPeriodMax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wPeriodMax$VH.set(seg, x);
    }
    public static int wPeriodMax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wPeriodMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPeriodMax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wPeriodMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wRmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wRmin"));
    public static VarHandle wRmin$VH() {
        return tagJOYCAPS2W.wRmin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wRmin;
     * }
     */
    public static int wRmin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wRmin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wRmin;
     * }
     */
    public static void wRmin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wRmin$VH.set(seg, x);
    }
    public static int wRmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wRmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wRmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wRmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wRmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wRmax"));
    public static VarHandle wRmax$VH() {
        return tagJOYCAPS2W.wRmax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wRmax;
     * }
     */
    public static int wRmax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wRmax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wRmax;
     * }
     */
    public static void wRmax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wRmax$VH.set(seg, x);
    }
    public static int wRmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wRmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wRmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wRmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wUmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wUmin"));
    public static VarHandle wUmin$VH() {
        return tagJOYCAPS2W.wUmin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wUmin;
     * }
     */
    public static int wUmin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wUmin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wUmin;
     * }
     */
    public static void wUmin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wUmin$VH.set(seg, x);
    }
    public static int wUmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wUmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wUmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wUmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wUmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wUmax"));
    public static VarHandle wUmax$VH() {
        return tagJOYCAPS2W.wUmax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wUmax;
     * }
     */
    public static int wUmax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wUmax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wUmax;
     * }
     */
    public static void wUmax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wUmax$VH.set(seg, x);
    }
    public static int wUmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wUmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wUmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wUmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVmin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVmin"));
    public static VarHandle wVmin$VH() {
        return tagJOYCAPS2W.wVmin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wVmin;
     * }
     */
    public static int wVmin$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wVmin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wVmin;
     * }
     */
    public static void wVmin$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wVmin$VH.set(seg, x);
    }
    public static int wVmin$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wVmin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVmin$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wVmin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVmax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVmax"));
    public static VarHandle wVmax$VH() {
        return tagJOYCAPS2W.wVmax$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wVmax;
     * }
     */
    public static int wVmax$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wVmax$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wVmax;
     * }
     */
    public static void wVmax$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wVmax$VH.set(seg, x);
    }
    public static int wVmax$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wVmax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVmax$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wVmax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wCaps$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wCaps"));
    public static VarHandle wCaps$VH() {
        return tagJOYCAPS2W.wCaps$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wCaps;
     * }
     */
    public static int wCaps$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wCaps$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wCaps;
     * }
     */
    public static void wCaps$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wCaps$VH.set(seg, x);
    }
    public static int wCaps$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wCaps$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wCaps$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wCaps$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMaxAxes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMaxAxes"));
    public static VarHandle wMaxAxes$VH() {
        return tagJOYCAPS2W.wMaxAxes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wMaxAxes;
     * }
     */
    public static int wMaxAxes$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wMaxAxes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wMaxAxes;
     * }
     */
    public static void wMaxAxes$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wMaxAxes$VH.set(seg, x);
    }
    public static int wMaxAxes$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wMaxAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMaxAxes$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wMaxAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNumAxes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wNumAxes"));
    public static VarHandle wNumAxes$VH() {
        return tagJOYCAPS2W.wNumAxes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wNumAxes;
     * }
     */
    public static int wNumAxes$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wNumAxes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wNumAxes;
     * }
     */
    public static void wNumAxes$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wNumAxes$VH.set(seg, x);
    }
    public static int wNumAxes$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wNumAxes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNumAxes$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wNumAxes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wMaxButtons$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMaxButtons"));
    public static VarHandle wMaxButtons$VH() {
        return tagJOYCAPS2W.wMaxButtons$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wMaxButtons;
     * }
     */
    public static int wMaxButtons$get(MemorySegment seg) {
        return (int)tagJOYCAPS2W.wMaxButtons$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wMaxButtons;
     * }
     */
    public static void wMaxButtons$set(MemorySegment seg, int x) {
        tagJOYCAPS2W.wMaxButtons$VH.set(seg, x);
    }
    public static int wMaxButtons$get(MemorySegment seg, long index) {
        return (int)tagJOYCAPS2W.wMaxButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMaxButtons$set(MemorySegment seg, long index, int x) {
        tagJOYCAPS2W.wMaxButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szRegKey$slice(MemorySegment seg) {
        return seg.asSlice(144, 64);
    }
    public static MemorySegment szOEMVxD$slice(MemorySegment seg) {
        return seg.asSlice(208, 520);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(728, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(744, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(760, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


