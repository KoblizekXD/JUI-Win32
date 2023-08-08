// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDVTARGETDEVICE {
 *     DWORD tdSize;
 *     WORD tdDriverNameOffset;
 *     WORD tdDeviceNameOffset;
 *     WORD tdPortNameOffset;
 *     WORD tdExtDevmodeOffset;
 *     BYTE tdData[1];
 * };
 * }
 */
public class tagDVTARGETDEVICE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("tdSize"),
        Constants$root.C_SHORT$LAYOUT.withName("tdDriverNameOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("tdDeviceNameOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("tdPortNameOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("tdExtDevmodeOffset"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("tdData"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagDVTARGETDEVICE");
    public static MemoryLayout $LAYOUT() {
        return tagDVTARGETDEVICE.$struct$LAYOUT;
    }
    static final VarHandle tdSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tdSize"));
    public static VarHandle tdSize$VH() {
        return tagDVTARGETDEVICE.tdSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD tdSize;
     * }
     */
    public static int tdSize$get(MemorySegment seg) {
        return (int)tagDVTARGETDEVICE.tdSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD tdSize;
     * }
     */
    public static void tdSize$set(MemorySegment seg, int x) {
        tagDVTARGETDEVICE.tdSize$VH.set(seg, x);
    }
    public static int tdSize$get(MemorySegment seg, long index) {
        return (int)tagDVTARGETDEVICE.tdSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tdSize$set(MemorySegment seg, long index, int x) {
        tagDVTARGETDEVICE.tdSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tdDriverNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tdDriverNameOffset"));
    public static VarHandle tdDriverNameOffset$VH() {
        return tagDVTARGETDEVICE.tdDriverNameOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdDriverNameOffset;
     * }
     */
    public static short tdDriverNameOffset$get(MemorySegment seg) {
        return (short)tagDVTARGETDEVICE.tdDriverNameOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdDriverNameOffset;
     * }
     */
    public static void tdDriverNameOffset$set(MemorySegment seg, short x) {
        tagDVTARGETDEVICE.tdDriverNameOffset$VH.set(seg, x);
    }
    public static short tdDriverNameOffset$get(MemorySegment seg, long index) {
        return (short)tagDVTARGETDEVICE.tdDriverNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tdDriverNameOffset$set(MemorySegment seg, long index, short x) {
        tagDVTARGETDEVICE.tdDriverNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tdDeviceNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tdDeviceNameOffset"));
    public static VarHandle tdDeviceNameOffset$VH() {
        return tagDVTARGETDEVICE.tdDeviceNameOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdDeviceNameOffset;
     * }
     */
    public static short tdDeviceNameOffset$get(MemorySegment seg) {
        return (short)tagDVTARGETDEVICE.tdDeviceNameOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdDeviceNameOffset;
     * }
     */
    public static void tdDeviceNameOffset$set(MemorySegment seg, short x) {
        tagDVTARGETDEVICE.tdDeviceNameOffset$VH.set(seg, x);
    }
    public static short tdDeviceNameOffset$get(MemorySegment seg, long index) {
        return (short)tagDVTARGETDEVICE.tdDeviceNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tdDeviceNameOffset$set(MemorySegment seg, long index, short x) {
        tagDVTARGETDEVICE.tdDeviceNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tdPortNameOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tdPortNameOffset"));
    public static VarHandle tdPortNameOffset$VH() {
        return tagDVTARGETDEVICE.tdPortNameOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdPortNameOffset;
     * }
     */
    public static short tdPortNameOffset$get(MemorySegment seg) {
        return (short)tagDVTARGETDEVICE.tdPortNameOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdPortNameOffset;
     * }
     */
    public static void tdPortNameOffset$set(MemorySegment seg, short x) {
        tagDVTARGETDEVICE.tdPortNameOffset$VH.set(seg, x);
    }
    public static short tdPortNameOffset$get(MemorySegment seg, long index) {
        return (short)tagDVTARGETDEVICE.tdPortNameOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tdPortNameOffset$set(MemorySegment seg, long index, short x) {
        tagDVTARGETDEVICE.tdPortNameOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tdExtDevmodeOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tdExtDevmodeOffset"));
    public static VarHandle tdExtDevmodeOffset$VH() {
        return tagDVTARGETDEVICE.tdExtDevmodeOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD tdExtDevmodeOffset;
     * }
     */
    public static short tdExtDevmodeOffset$get(MemorySegment seg) {
        return (short)tagDVTARGETDEVICE.tdExtDevmodeOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD tdExtDevmodeOffset;
     * }
     */
    public static void tdExtDevmodeOffset$set(MemorySegment seg, short x) {
        tagDVTARGETDEVICE.tdExtDevmodeOffset$VH.set(seg, x);
    }
    public static short tdExtDevmodeOffset$get(MemorySegment seg, long index) {
        return (short)tagDVTARGETDEVICE.tdExtDevmodeOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tdExtDevmodeOffset$set(MemorySegment seg, long index, short x) {
        tagDVTARGETDEVICE.tdExtDevmodeOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment tdData$slice(MemorySegment seg) {
        return seg.asSlice(12, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

