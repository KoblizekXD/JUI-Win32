// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagFILTERKEYS {
 *     UINT cbSize;
 *     DWORD dwFlags;
 *     DWORD iWaitMSec;
 *     DWORD iDelayMSec;
 *     DWORD iRepeatMSec;
 *     DWORD iBounceMSec;
 * };
 * }
 */
public class tagFILTERKEYS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("iWaitMSec"),
        Constants$root.C_LONG$LAYOUT.withName("iDelayMSec"),
        Constants$root.C_LONG$LAYOUT.withName("iRepeatMSec"),
        Constants$root.C_LONG$LAYOUT.withName("iBounceMSec")
    ).withName("tagFILTERKEYS");
    public static MemoryLayout $LAYOUT() {
        return tagFILTERKEYS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagFILTERKEYS.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagFILTERKEYS.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        tagFILTERKEYS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagFILTERKEYS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagFILTERKEYS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagFILTERKEYS.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagFILTERKEYS.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        tagFILTERKEYS.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagFILTERKEYS.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagFILTERKEYS.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWaitMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iWaitMSec"));
    public static VarHandle iWaitMSec$VH() {
        return tagFILTERKEYS.iWaitMSec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iWaitMSec;
     * }
     */
    public static int iWaitMSec$get(MemorySegment seg) {
        return (int)tagFILTERKEYS.iWaitMSec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iWaitMSec;
     * }
     */
    public static void iWaitMSec$set(MemorySegment seg, int x) {
        tagFILTERKEYS.iWaitMSec$VH.set(seg, x);
    }
    public static int iWaitMSec$get(MemorySegment seg, long index) {
        return (int)tagFILTERKEYS.iWaitMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWaitMSec$set(MemorySegment seg, long index, int x) {
        tagFILTERKEYS.iWaitMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iDelayMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iDelayMSec"));
    public static VarHandle iDelayMSec$VH() {
        return tagFILTERKEYS.iDelayMSec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iDelayMSec;
     * }
     */
    public static int iDelayMSec$get(MemorySegment seg) {
        return (int)tagFILTERKEYS.iDelayMSec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iDelayMSec;
     * }
     */
    public static void iDelayMSec$set(MemorySegment seg, int x) {
        tagFILTERKEYS.iDelayMSec$VH.set(seg, x);
    }
    public static int iDelayMSec$get(MemorySegment seg, long index) {
        return (int)tagFILTERKEYS.iDelayMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iDelayMSec$set(MemorySegment seg, long index, int x) {
        tagFILTERKEYS.iDelayMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iRepeatMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iRepeatMSec"));
    public static VarHandle iRepeatMSec$VH() {
        return tagFILTERKEYS.iRepeatMSec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iRepeatMSec;
     * }
     */
    public static int iRepeatMSec$get(MemorySegment seg) {
        return (int)tagFILTERKEYS.iRepeatMSec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iRepeatMSec;
     * }
     */
    public static void iRepeatMSec$set(MemorySegment seg, int x) {
        tagFILTERKEYS.iRepeatMSec$VH.set(seg, x);
    }
    public static int iRepeatMSec$get(MemorySegment seg, long index) {
        return (int)tagFILTERKEYS.iRepeatMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iRepeatMSec$set(MemorySegment seg, long index, int x) {
        tagFILTERKEYS.iRepeatMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iBounceMSec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iBounceMSec"));
    public static VarHandle iBounceMSec$VH() {
        return tagFILTERKEYS.iBounceMSec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iBounceMSec;
     * }
     */
    public static int iBounceMSec$get(MemorySegment seg) {
        return (int)tagFILTERKEYS.iBounceMSec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iBounceMSec;
     * }
     */
    public static void iBounceMSec$set(MemorySegment seg, int x) {
        tagFILTERKEYS.iBounceMSec$VH.set(seg, x);
    }
    public static int iBounceMSec$get(MemorySegment seg, long index) {
        return (int)tagFILTERKEYS.iBounceMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iBounceMSec$set(MemorySegment seg, long index, int x) {
        tagFILTERKEYS.iBounceMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

