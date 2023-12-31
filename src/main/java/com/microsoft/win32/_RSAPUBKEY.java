// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RSAPUBKEY {
 *     DWORD magic;
 *     DWORD bitlen;
 *     DWORD pubexp;
 * };
 * }
 */
public class _RSAPUBKEY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("magic"),
        Constants$root.C_LONG$LAYOUT.withName("bitlen"),
        Constants$root.C_LONG$LAYOUT.withName("pubexp")
    ).withName("_RSAPUBKEY");
    public static MemoryLayout $LAYOUT() {
        return _RSAPUBKEY.$struct$LAYOUT;
    }
    static final VarHandle magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("magic"));
    public static VarHandle magic$VH() {
        return _RSAPUBKEY.magic$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD magic;
     * }
     */
    public static int magic$get(MemorySegment seg) {
        return (int)_RSAPUBKEY.magic$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD magic;
     * }
     */
    public static void magic$set(MemorySegment seg, int x) {
        _RSAPUBKEY.magic$VH.set(seg, x);
    }
    public static int magic$get(MemorySegment seg, long index) {
        return (int)_RSAPUBKEY.magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void magic$set(MemorySegment seg, long index, int x) {
        _RSAPUBKEY.magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitlen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitlen"));
    public static VarHandle bitlen$VH() {
        return _RSAPUBKEY.bitlen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD bitlen;
     * }
     */
    public static int bitlen$get(MemorySegment seg) {
        return (int)_RSAPUBKEY.bitlen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD bitlen;
     * }
     */
    public static void bitlen$set(MemorySegment seg, int x) {
        _RSAPUBKEY.bitlen$VH.set(seg, x);
    }
    public static int bitlen$get(MemorySegment seg, long index) {
        return (int)_RSAPUBKEY.bitlen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitlen$set(MemorySegment seg, long index, int x) {
        _RSAPUBKEY.bitlen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pubexp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pubexp"));
    public static VarHandle pubexp$VH() {
        return _RSAPUBKEY.pubexp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD pubexp;
     * }
     */
    public static int pubexp$get(MemorySegment seg) {
        return (int)_RSAPUBKEY.pubexp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD pubexp;
     * }
     */
    public static void pubexp$set(MemorySegment seg, int x) {
        _RSAPUBKEY.pubexp$VH.set(seg, x);
    }
    public static int pubexp$get(MemorySegment seg, long index) {
        return (int)_RSAPUBKEY.pubexp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pubexp$set(MemorySegment seg, long index, int x) {
        _RSAPUBKEY.pubexp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


