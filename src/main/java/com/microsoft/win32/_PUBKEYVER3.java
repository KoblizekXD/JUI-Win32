// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PUBKEYVER3 {
 *     DWORD magic;
 *     DWORD bitlenP;
 *     DWORD bitlenQ;
 *     DWORD bitlenJ;
 *     DSSSEED DSSSeed;
 * };
 * }
 */
public class _PUBKEYVER3 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("magic"),
        Constants$root.C_LONG$LAYOUT.withName("bitlenP"),
        Constants$root.C_LONG$LAYOUT.withName("bitlenQ"),
        Constants$root.C_LONG$LAYOUT.withName("bitlenJ"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("counter"),
            MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("seed")
        ).withName("DSSSeed")
    ).withName("_PUBKEYVER3");
    public static MemoryLayout $LAYOUT() {
        return _PUBKEYVER3.$struct$LAYOUT;
    }
    static final VarHandle magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("magic"));
    public static VarHandle magic$VH() {
        return _PUBKEYVER3.magic$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD magic;
     * }
     */
    public static int magic$get(MemorySegment seg) {
        return (int)_PUBKEYVER3.magic$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD magic;
     * }
     */
    public static void magic$set(MemorySegment seg, int x) {
        _PUBKEYVER3.magic$VH.set(seg, x);
    }
    public static int magic$get(MemorySegment seg, long index) {
        return (int)_PUBKEYVER3.magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void magic$set(MemorySegment seg, long index, int x) {
        _PUBKEYVER3.magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitlenP$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitlenP"));
    public static VarHandle bitlenP$VH() {
        return _PUBKEYVER3.bitlenP$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bitlenP;
     * }
     */
    public static int bitlenP$get(MemorySegment seg) {
        return (int)_PUBKEYVER3.bitlenP$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bitlenP;
     * }
     */
    public static void bitlenP$set(MemorySegment seg, int x) {
        _PUBKEYVER3.bitlenP$VH.set(seg, x);
    }
    public static int bitlenP$get(MemorySegment seg, long index) {
        return (int)_PUBKEYVER3.bitlenP$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitlenP$set(MemorySegment seg, long index, int x) {
        _PUBKEYVER3.bitlenP$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitlenQ$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitlenQ"));
    public static VarHandle bitlenQ$VH() {
        return _PUBKEYVER3.bitlenQ$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bitlenQ;
     * }
     */
    public static int bitlenQ$get(MemorySegment seg) {
        return (int)_PUBKEYVER3.bitlenQ$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bitlenQ;
     * }
     */
    public static void bitlenQ$set(MemorySegment seg, int x) {
        _PUBKEYVER3.bitlenQ$VH.set(seg, x);
    }
    public static int bitlenQ$get(MemorySegment seg, long index) {
        return (int)_PUBKEYVER3.bitlenQ$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitlenQ$set(MemorySegment seg, long index, int x) {
        _PUBKEYVER3.bitlenQ$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitlenJ$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitlenJ"));
    public static VarHandle bitlenJ$VH() {
        return _PUBKEYVER3.bitlenJ$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bitlenJ;
     * }
     */
    public static int bitlenJ$get(MemorySegment seg) {
        return (int)_PUBKEYVER3.bitlenJ$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bitlenJ;
     * }
     */
    public static void bitlenJ$set(MemorySegment seg, int x) {
        _PUBKEYVER3.bitlenJ$VH.set(seg, x);
    }
    public static int bitlenJ$get(MemorySegment seg, long index) {
        return (int)_PUBKEYVER3.bitlenJ$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitlenJ$set(MemorySegment seg, long index, int x) {
        _PUBKEYVER3.bitlenJ$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DSSSeed$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


