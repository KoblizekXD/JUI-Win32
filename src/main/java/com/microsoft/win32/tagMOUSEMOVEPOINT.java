// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMOUSEMOVEPOINT {
 *     int x;
 *     int y;
 *     DWORD time;
 *     ULONG_PTR dwExtraInfo;
 * };
 * }
 */
public class tagMOUSEMOVEPOINT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("x"),
        Constants$root.C_LONG$LAYOUT.withName("y"),
        Constants$root.C_LONG$LAYOUT.withName("time"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwExtraInfo")
    ).withName("tagMOUSEMOVEPOINT");
    public static MemoryLayout $LAYOUT() {
        return tagMOUSEMOVEPOINT.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagMOUSEMOVEPOINT.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)tagMOUSEMOVEPOINT.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        tagMOUSEMOVEPOINT.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagMOUSEMOVEPOINT.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagMOUSEMOVEPOINT.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagMOUSEMOVEPOINT.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)tagMOUSEMOVEPOINT.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        tagMOUSEMOVEPOINT.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagMOUSEMOVEPOINT.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagMOUSEMOVEPOINT.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return tagMOUSEMOVEPOINT.time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)tagMOUSEMOVEPOINT.time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        tagMOUSEMOVEPOINT.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)tagMOUSEMOVEPOINT.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        tagMOUSEMOVEPOINT.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExtraInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwExtraInfo"));
    public static VarHandle dwExtraInfo$VH() {
        return tagMOUSEMOVEPOINT.dwExtraInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR dwExtraInfo;
     * }
     */
    public static long dwExtraInfo$get(MemorySegment seg) {
        return (long)tagMOUSEMOVEPOINT.dwExtraInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR dwExtraInfo;
     * }
     */
    public static void dwExtraInfo$set(MemorySegment seg, long x) {
        tagMOUSEMOVEPOINT.dwExtraInfo$VH.set(seg, x);
    }
    public static long dwExtraInfo$get(MemorySegment seg, long index) {
        return (long)tagMOUSEMOVEPOINT.dwExtraInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExtraInfo$set(MemorySegment seg, long index, long x) {
        tagMOUSEMOVEPOINT.dwExtraInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


