// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagWAVEOUTCAPS2W {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     WCHAR szPname[32];
 *     DWORD dwFormats;
 *     WORD wChannels;
 *     WORD wReserved1;
 *     DWORD dwSupport;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * };
 * }
 */
public class tagWAVEOUTCAPS2W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("dwFormats"),
        Constants$root.C_SHORT$LAYOUT.withName("wChannels"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dwSupport"),
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
    ).withName("tagWAVEOUTCAPS2W");
    public static MemoryLayout $LAYOUT() {
        return tagWAVEOUTCAPS2W.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagWAVEOUTCAPS2W.wMid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPS2W.wMid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPS2W.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPS2W.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPS2W.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagWAVEOUTCAPS2W.wPid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPS2W.wPid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPS2W.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPS2W.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPS2W.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagWAVEOUTCAPS2W.vDriverVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagWAVEOUTCAPS2W.vDriverVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static void vDriverVersion$set(MemorySegment seg, int x) {
        tagWAVEOUTCAPS2W.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagWAVEOUTCAPS2W.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagWAVEOUTCAPS2W.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle dwFormats$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFormats"));
    public static VarHandle dwFormats$VH() {
        return tagWAVEOUTCAPS2W.dwFormats$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFormats;
     * }
     */
    public static int dwFormats$get(MemorySegment seg) {
        return (int)tagWAVEOUTCAPS2W.dwFormats$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFormats;
     * }
     */
    public static void dwFormats$set(MemorySegment seg, int x) {
        tagWAVEOUTCAPS2W.dwFormats$VH.set(seg, x);
    }
    public static int dwFormats$get(MemorySegment seg, long index) {
        return (int)tagWAVEOUTCAPS2W.dwFormats$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFormats$set(MemorySegment seg, long index, int x) {
        tagWAVEOUTCAPS2W.dwFormats$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wChannels"));
    public static VarHandle wChannels$VH() {
        return tagWAVEOUTCAPS2W.wChannels$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wChannels;
     * }
     */
    public static short wChannels$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPS2W.wChannels$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wChannels;
     * }
     */
    public static void wChannels$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPS2W.wChannels$VH.set(seg, x);
    }
    public static short wChannels$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPS2W.wChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannels$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPS2W.wChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    public static VarHandle wReserved1$VH() {
        return tagWAVEOUTCAPS2W.wReserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static short wReserved1$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPS2W.wReserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static void wReserved1$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPS2W.wReserved1$VH.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPS2W.wReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPS2W.wReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagWAVEOUTCAPS2W.dwSupport$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagWAVEOUTCAPS2W.dwSupport$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static void dwSupport$set(MemorySegment seg, int x) {
        tagWAVEOUTCAPS2W.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagWAVEOUTCAPS2W.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagWAVEOUTCAPS2W.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(84, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(100, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(116, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


