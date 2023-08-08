// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagWAVEOUTCAPSA {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     CHAR szPname[32];
 *     DWORD dwFormats;
 *     WORD wChannels;
 *     WORD wReserved1;
 *     DWORD dwSupport;
 * };
 * }
 */
public class tagWAVEOUTCAPSA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("dwFormats"),
        Constants$root.C_SHORT$LAYOUT.withName("wChannels"),
        Constants$root.C_SHORT$LAYOUT.withName("wReserved1"),
        Constants$root.C_LONG$LAYOUT.withName("dwSupport")
    ).withName("tagWAVEOUTCAPSA");
    public static MemoryLayout $LAYOUT() {
        return tagWAVEOUTCAPSA.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagWAVEOUTCAPSA.wMid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPSA.wMid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPSA.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPSA.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPSA.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagWAVEOUTCAPSA.wPid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPSA.wPid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPSA.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPSA.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPSA.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagWAVEOUTCAPSA.vDriverVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagWAVEOUTCAPSA.vDriverVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static void vDriverVersion$set(MemorySegment seg, int x) {
        tagWAVEOUTCAPSA.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagWAVEOUTCAPSA.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagWAVEOUTCAPSA.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 32);
    }
    static final VarHandle dwFormats$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFormats"));
    public static VarHandle dwFormats$VH() {
        return tagWAVEOUTCAPSA.dwFormats$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFormats;
     * }
     */
    public static int dwFormats$get(MemorySegment seg) {
        return (int)tagWAVEOUTCAPSA.dwFormats$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFormats;
     * }
     */
    public static void dwFormats$set(MemorySegment seg, int x) {
        tagWAVEOUTCAPSA.dwFormats$VH.set(seg, x);
    }
    public static int dwFormats$get(MemorySegment seg, long index) {
        return (int)tagWAVEOUTCAPSA.dwFormats$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFormats$set(MemorySegment seg, long index, int x) {
        tagWAVEOUTCAPSA.dwFormats$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wChannels"));
    public static VarHandle wChannels$VH() {
        return tagWAVEOUTCAPSA.wChannels$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wChannels;
     * }
     */
    public static short wChannels$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPSA.wChannels$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wChannels;
     * }
     */
    public static void wChannels$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPSA.wChannels$VH.set(seg, x);
    }
    public static short wChannels$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPSA.wChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannels$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPSA.wChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    public static VarHandle wReserved1$VH() {
        return tagWAVEOUTCAPSA.wReserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static short wReserved1$get(MemorySegment seg) {
        return (short)tagWAVEOUTCAPSA.wReserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved1;
     * }
     */
    public static void wReserved1$set(MemorySegment seg, short x) {
        tagWAVEOUTCAPSA.wReserved1$VH.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)tagWAVEOUTCAPSA.wReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        tagWAVEOUTCAPSA.wReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagWAVEOUTCAPSA.dwSupport$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagWAVEOUTCAPSA.dwSupport$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSupport;
     * }
     */
    public static void dwSupport$set(MemorySegment seg, int x) {
        tagWAVEOUTCAPSA.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagWAVEOUTCAPSA.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagWAVEOUTCAPSA.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

