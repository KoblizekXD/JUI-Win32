// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRTEXT {
 *     POINTL ptlReference;
 *     DWORD nChars;
 *     DWORD offString;
 *     DWORD fOptions;
 *     RECTL rcl;
 *     DWORD offDx;
 * };
 * }
 */
public class tagEMRTEXT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptlReference"),
        Constants$root.C_LONG$LAYOUT.withName("nChars"),
        Constants$root.C_LONG$LAYOUT.withName("offString"),
        Constants$root.C_LONG$LAYOUT.withName("fOptions"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcl"),
        Constants$root.C_LONG$LAYOUT.withName("offDx")
    ).withName("tagEMRTEXT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRTEXT.$struct$LAYOUT;
    }
    public static MemorySegment ptlReference$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle nChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nChars"));
    public static VarHandle nChars$VH() {
        return tagEMRTEXT.nChars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nChars;
     * }
     */
    public static int nChars$get(MemorySegment seg) {
        return (int)tagEMRTEXT.nChars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nChars;
     * }
     */
    public static void nChars$set(MemorySegment seg, int x) {
        tagEMRTEXT.nChars$VH.set(seg, x);
    }
    public static int nChars$get(MemorySegment seg, long index) {
        return (int)tagEMRTEXT.nChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nChars$set(MemorySegment seg, long index, int x) {
        tagEMRTEXT.nChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offString"));
    public static VarHandle offString$VH() {
        return tagEMRTEXT.offString$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD offString;
     * }
     */
    public static int offString$get(MemorySegment seg) {
        return (int)tagEMRTEXT.offString$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD offString;
     * }
     */
    public static void offString$set(MemorySegment seg, int x) {
        tagEMRTEXT.offString$VH.set(seg, x);
    }
    public static int offString$get(MemorySegment seg, long index) {
        return (int)tagEMRTEXT.offString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offString$set(MemorySegment seg, long index, int x) {
        tagEMRTEXT.offString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fOptions"));
    public static VarHandle fOptions$VH() {
        return tagEMRTEXT.fOptions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fOptions;
     * }
     */
    public static int fOptions$get(MemorySegment seg) {
        return (int)tagEMRTEXT.fOptions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fOptions;
     * }
     */
    public static void fOptions$set(MemorySegment seg, int x) {
        tagEMRTEXT.fOptions$VH.set(seg, x);
    }
    public static int fOptions$get(MemorySegment seg, long index) {
        return (int)tagEMRTEXT.fOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fOptions$set(MemorySegment seg, long index, int x) {
        tagEMRTEXT.fOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcl$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    static final VarHandle offDx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offDx"));
    public static VarHandle offDx$VH() {
        return tagEMRTEXT.offDx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD offDx;
     * }
     */
    public static int offDx$get(MemorySegment seg) {
        return (int)tagEMRTEXT.offDx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD offDx;
     * }
     */
    public static void offDx$set(MemorySegment seg, int x) {
        tagEMRTEXT.offDx$VH.set(seg, x);
    }
    public static int offDx$get(MemorySegment seg, long index) {
        return (int)tagEMRTEXT.offDx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offDx$set(MemorySegment seg, long index, int x) {
        tagEMRTEXT.offDx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


