// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEXTLOGFONTW {
 *     LOGFONTW elfLogFont;
 *     WCHAR elfFullName[64];
 *     WCHAR elfStyle[32];
 *     DWORD elfVersion;
 *     DWORD elfStyleSize;
 *     DWORD elfMatch;
 *     DWORD elfReserved;
 *     BYTE elfVendorId[4];
 *     DWORD elfCulture;
 *     PANOSE elfPanose;
 * };
 * }
 */
public class tagEXTLOGFONTW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
            MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("lfFaceName")
        ).withName("elfLogFont"),
        MemoryLayout.sequenceLayout(64, Constants$root.C_SHORT$LAYOUT).withName("elfFullName"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("elfStyle"),
        Constants$root.C_LONG$LAYOUT.withName("elfVersion"),
        Constants$root.C_LONG$LAYOUT.withName("elfStyleSize"),
        Constants$root.C_LONG$LAYOUT.withName("elfMatch"),
        Constants$root.C_LONG$LAYOUT.withName("elfReserved"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("elfVendorId"),
        Constants$root.C_LONG$LAYOUT.withName("elfCulture"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("bFamilyType"),
            Constants$root.C_CHAR$LAYOUT.withName("bSerifStyle"),
            Constants$root.C_CHAR$LAYOUT.withName("bWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("bProportion"),
            Constants$root.C_CHAR$LAYOUT.withName("bContrast"),
            Constants$root.C_CHAR$LAYOUT.withName("bStrokeVariation"),
            Constants$root.C_CHAR$LAYOUT.withName("bArmStyle"),
            Constants$root.C_CHAR$LAYOUT.withName("bLetterform"),
            Constants$root.C_CHAR$LAYOUT.withName("bMidline"),
            Constants$root.C_CHAR$LAYOUT.withName("bXHeight")
        ).withName("elfPanose"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagEXTLOGFONTW");
    public static MemoryLayout $LAYOUT() {
        return tagEXTLOGFONTW.$struct$LAYOUT;
    }
    public static MemorySegment elfLogFont$slice(MemorySegment seg) {
        return seg.asSlice(0, 92);
    }
    public static MemorySegment elfFullName$slice(MemorySegment seg) {
        return seg.asSlice(92, 128);
    }
    public static MemorySegment elfStyle$slice(MemorySegment seg) {
        return seg.asSlice(220, 64);
    }
    static final VarHandle elfVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elfVersion"));
    public static VarHandle elfVersion$VH() {
        return tagEXTLOGFONTW.elfVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD elfVersion;
     * }
     */
    public static int elfVersion$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTW.elfVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD elfVersion;
     * }
     */
    public static void elfVersion$set(MemorySegment seg, int x) {
        tagEXTLOGFONTW.elfVersion$VH.set(seg, x);
    }
    public static int elfVersion$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTW.elfVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfVersion$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTW.elfVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elfStyleSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elfStyleSize"));
    public static VarHandle elfStyleSize$VH() {
        return tagEXTLOGFONTW.elfStyleSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD elfStyleSize;
     * }
     */
    public static int elfStyleSize$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTW.elfStyleSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD elfStyleSize;
     * }
     */
    public static void elfStyleSize$set(MemorySegment seg, int x) {
        tagEXTLOGFONTW.elfStyleSize$VH.set(seg, x);
    }
    public static int elfStyleSize$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTW.elfStyleSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfStyleSize$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTW.elfStyleSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elfMatch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elfMatch"));
    public static VarHandle elfMatch$VH() {
        return tagEXTLOGFONTW.elfMatch$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD elfMatch;
     * }
     */
    public static int elfMatch$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTW.elfMatch$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD elfMatch;
     * }
     */
    public static void elfMatch$set(MemorySegment seg, int x) {
        tagEXTLOGFONTW.elfMatch$VH.set(seg, x);
    }
    public static int elfMatch$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTW.elfMatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfMatch$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTW.elfMatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elfReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elfReserved"));
    public static VarHandle elfReserved$VH() {
        return tagEXTLOGFONTW.elfReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD elfReserved;
     * }
     */
    public static int elfReserved$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTW.elfReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD elfReserved;
     * }
     */
    public static void elfReserved$set(MemorySegment seg, int x) {
        tagEXTLOGFONTW.elfReserved$VH.set(seg, x);
    }
    public static int elfReserved$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTW.elfReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfReserved$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTW.elfReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elfVendorId$slice(MemorySegment seg) {
        return seg.asSlice(300, 4);
    }
    static final VarHandle elfCulture$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("elfCulture"));
    public static VarHandle elfCulture$VH() {
        return tagEXTLOGFONTW.elfCulture$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD elfCulture;
     * }
     */
    public static int elfCulture$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTW.elfCulture$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD elfCulture;
     * }
     */
    public static void elfCulture$set(MemorySegment seg, int x) {
        tagEXTLOGFONTW.elfCulture$VH.set(seg, x);
    }
    public static int elfCulture$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTW.elfCulture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfCulture$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTW.elfCulture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elfPanose$slice(MemorySegment seg) {
        return seg.asSlice(308, 10);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


