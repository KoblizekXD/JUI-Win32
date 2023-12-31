// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagICONMETRICSA {
 *     UINT cbSize;
 *     int iHorzSpacing;
 *     int iVertSpacing;
 *     int iTitleWrap;
 *     LOGFONTA lfFont;
 * };
 * }
 */
public class tagICONMETRICSA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("iHorzSpacing"),
        Constants$root.C_LONG$LAYOUT.withName("iVertSpacing"),
        Constants$root.C_LONG$LAYOUT.withName("iTitleWrap"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("lfHeight"),
            Constants$root.C_LONG$LAYOUT.withName("lfWidth"),
            Constants$root.C_LONG$LAYOUT.withName("lfEscapement"),
            Constants$root.C_LONG$LAYOUT.withName("lfOrientation"),
            Constants$root.C_LONG$LAYOUT.withName("lfWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("lfItalic"),
            Constants$root.C_CHAR$LAYOUT.withName("lfUnderline"),
            Constants$root.C_CHAR$LAYOUT.withName("lfStrikeOut"),
            Constants$root.C_CHAR$LAYOUT.withName("lfCharSet"),
            Constants$root.C_CHAR$LAYOUT.withName("lfOutPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfClipPrecision"),
            Constants$root.C_CHAR$LAYOUT.withName("lfQuality"),
            Constants$root.C_CHAR$LAYOUT.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("lfFaceName")
        ).withName("lfFont")
    ).withName("tagICONMETRICSA");
    public static MemoryLayout $LAYOUT() {
        return tagICONMETRICSA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagICONMETRICSA.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagICONMETRICSA.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        tagICONMETRICSA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagICONMETRICSA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagICONMETRICSA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iHorzSpacing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iHorzSpacing"));
    public static VarHandle iHorzSpacing$VH() {
        return tagICONMETRICSA.iHorzSpacing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iHorzSpacing;
     * }
     */
    public static int iHorzSpacing$get(MemorySegment seg) {
        return (int)tagICONMETRICSA.iHorzSpacing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iHorzSpacing;
     * }
     */
    public static void iHorzSpacing$set(MemorySegment seg, int x) {
        tagICONMETRICSA.iHorzSpacing$VH.set(seg, x);
    }
    public static int iHorzSpacing$get(MemorySegment seg, long index) {
        return (int)tagICONMETRICSA.iHorzSpacing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iHorzSpacing$set(MemorySegment seg, long index, int x) {
        tagICONMETRICSA.iHorzSpacing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iVertSpacing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iVertSpacing"));
    public static VarHandle iVertSpacing$VH() {
        return tagICONMETRICSA.iVertSpacing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iVertSpacing;
     * }
     */
    public static int iVertSpacing$get(MemorySegment seg) {
        return (int)tagICONMETRICSA.iVertSpacing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iVertSpacing;
     * }
     */
    public static void iVertSpacing$set(MemorySegment seg, int x) {
        tagICONMETRICSA.iVertSpacing$VH.set(seg, x);
    }
    public static int iVertSpacing$get(MemorySegment seg, long index) {
        return (int)tagICONMETRICSA.iVertSpacing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iVertSpacing$set(MemorySegment seg, long index, int x) {
        tagICONMETRICSA.iVertSpacing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iTitleWrap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iTitleWrap"));
    public static VarHandle iTitleWrap$VH() {
        return tagICONMETRICSA.iTitleWrap$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iTitleWrap;
     * }
     */
    public static int iTitleWrap$get(MemorySegment seg) {
        return (int)tagICONMETRICSA.iTitleWrap$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iTitleWrap;
     * }
     */
    public static void iTitleWrap$set(MemorySegment seg, int x) {
        tagICONMETRICSA.iTitleWrap$VH.set(seg, x);
    }
    public static int iTitleWrap$get(MemorySegment seg, long index) {
        return (int)tagICONMETRICSA.iTitleWrap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iTitleWrap$set(MemorySegment seg, long index, int x) {
        tagICONMETRICSA.iTitleWrap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lfFont$slice(MemorySegment seg) {
        return seg.asSlice(16, 60);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


