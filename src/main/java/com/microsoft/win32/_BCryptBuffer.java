// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCryptBuffer {
 *     ULONG cbBuffer;
 *     ULONG BufferType;
 *     PVOID pvBuffer;
 * };
 * }
 */
public class _BCryptBuffer {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbBuffer"),
        Constants$root.C_LONG$LAYOUT.withName("BufferType"),
        Constants$root.C_POINTER$LAYOUT.withName("pvBuffer")
    ).withName("_BCryptBuffer");
    public static MemoryLayout $LAYOUT() {
        return _BCryptBuffer.$struct$LAYOUT;
    }
    static final VarHandle cbBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBuffer"));
    public static VarHandle cbBuffer$VH() {
        return _BCryptBuffer.cbBuffer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbBuffer;
     * }
     */
    public static int cbBuffer$get(MemorySegment seg) {
        return (int)_BCryptBuffer.cbBuffer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbBuffer;
     * }
     */
    public static void cbBuffer$set(MemorySegment seg, int x) {
        _BCryptBuffer.cbBuffer$VH.set(seg, x);
    }
    public static int cbBuffer$get(MemorySegment seg, long index) {
        return (int)_BCryptBuffer.cbBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBuffer$set(MemorySegment seg, long index, int x) {
        _BCryptBuffer.cbBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferType"));
    public static VarHandle BufferType$VH() {
        return _BCryptBuffer.BufferType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG BufferType;
     * }
     */
    public static int BufferType$get(MemorySegment seg) {
        return (int)_BCryptBuffer.BufferType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG BufferType;
     * }
     */
    public static void BufferType$set(MemorySegment seg, int x) {
        _BCryptBuffer.BufferType$VH.set(seg, x);
    }
    public static int BufferType$get(MemorySegment seg, long index) {
        return (int)_BCryptBuffer.BufferType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferType$set(MemorySegment seg, long index, int x) {
        _BCryptBuffer.BufferType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvBuffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvBuffer"));
    public static VarHandle pvBuffer$VH() {
        return _BCryptBuffer.pvBuffer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID pvBuffer;
     * }
     */
    public static MemorySegment pvBuffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BCryptBuffer.pvBuffer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID pvBuffer;
     * }
     */
    public static void pvBuffer$set(MemorySegment seg, MemorySegment x) {
        _BCryptBuffer.pvBuffer$VH.set(seg, x);
    }
    public static MemorySegment pvBuffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BCryptBuffer.pvBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvBuffer$set(MemorySegment seg, long index, MemorySegment x) {
        _BCryptBuffer.pvBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

