// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct waveformat_tag {
 *     WORD wFormatTag;
 *     WORD nChannels;
 *     DWORD nSamplesPerSec;
 *     DWORD nAvgBytesPerSec;
 *     WORD nBlockAlign;
 * };
 * }
 */
public class waveformat_tag {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wFormatTag"),
        Constants$root.C_SHORT$LAYOUT.withName("nChannels"),
        Constants$root.C_LONG$LAYOUT.withName("nSamplesPerSec"),
        Constants$root.C_LONG$LAYOUT.withName("nAvgBytesPerSec"),
        Constants$root.C_SHORT$LAYOUT.withName("nBlockAlign")
    ).withName("waveformat_tag");
    public static MemoryLayout $LAYOUT() {
        return waveformat_tag.$struct$LAYOUT;
    }
    static final VarHandle wFormatTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFormatTag"));
    public static VarHandle wFormatTag$VH() {
        return waveformat_tag.wFormatTag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wFormatTag;
     * }
     */
    public static short wFormatTag$get(MemorySegment seg) {
        return (short)waveformat_tag.wFormatTag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wFormatTag;
     * }
     */
    public static void wFormatTag$set(MemorySegment seg, short x) {
        waveformat_tag.wFormatTag$VH.set(seg, x);
    }
    public static short wFormatTag$get(MemorySegment seg, long index) {
        return (short)waveformat_tag.wFormatTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFormatTag$set(MemorySegment seg, long index, short x) {
        waveformat_tag.wFormatTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nChannels$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nChannels"));
    public static VarHandle nChannels$VH() {
        return waveformat_tag.nChannels$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nChannels;
     * }
     */
    public static short nChannels$get(MemorySegment seg) {
        return (short)waveformat_tag.nChannels$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nChannels;
     * }
     */
    public static void nChannels$set(MemorySegment seg, short x) {
        waveformat_tag.nChannels$VH.set(seg, x);
    }
    public static short nChannels$get(MemorySegment seg, long index) {
        return (short)waveformat_tag.nChannels$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nChannels$set(MemorySegment seg, long index, short x) {
        waveformat_tag.nChannels$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nSamplesPerSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSamplesPerSec"));
    public static VarHandle nSamplesPerSec$VH() {
        return waveformat_tag.nSamplesPerSec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nSamplesPerSec;
     * }
     */
    public static int nSamplesPerSec$get(MemorySegment seg) {
        return (int)waveformat_tag.nSamplesPerSec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nSamplesPerSec;
     * }
     */
    public static void nSamplesPerSec$set(MemorySegment seg, int x) {
        waveformat_tag.nSamplesPerSec$VH.set(seg, x);
    }
    public static int nSamplesPerSec$get(MemorySegment seg, long index) {
        return (int)waveformat_tag.nSamplesPerSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSamplesPerSec$set(MemorySegment seg, long index, int x) {
        waveformat_tag.nSamplesPerSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nAvgBytesPerSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nAvgBytesPerSec"));
    public static VarHandle nAvgBytesPerSec$VH() {
        return waveformat_tag.nAvgBytesPerSec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nAvgBytesPerSec;
     * }
     */
    public static int nAvgBytesPerSec$get(MemorySegment seg) {
        return (int)waveformat_tag.nAvgBytesPerSec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nAvgBytesPerSec;
     * }
     */
    public static void nAvgBytesPerSec$set(MemorySegment seg, int x) {
        waveformat_tag.nAvgBytesPerSec$VH.set(seg, x);
    }
    public static int nAvgBytesPerSec$get(MemorySegment seg, long index) {
        return (int)waveformat_tag.nAvgBytesPerSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nAvgBytesPerSec$set(MemorySegment seg, long index, int x) {
        waveformat_tag.nAvgBytesPerSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nBlockAlign$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nBlockAlign"));
    public static VarHandle nBlockAlign$VH() {
        return waveformat_tag.nBlockAlign$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nBlockAlign;
     * }
     */
    public static short nBlockAlign$get(MemorySegment seg) {
        return (short)waveformat_tag.nBlockAlign$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nBlockAlign;
     * }
     */
    public static void nBlockAlign$set(MemorySegment seg, short x) {
        waveformat_tag.nBlockAlign$VH.set(seg, x);
    }
    public static short nBlockAlign$get(MemorySegment seg, long index) {
        return (short)waveformat_tag.nBlockAlign$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nBlockAlign$set(MemorySegment seg, long index, short x) {
        waveformat_tag.nBlockAlign$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


