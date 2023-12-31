// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _wireSAFEARR_UNKNOWN {
 *     ULONG Size;
 *     IUnknown** apUnknown;
 * };
 * }
 */
public class _wireSAFEARR_UNKNOWN {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("apUnknown")
    ).withName("_wireSAFEARR_UNKNOWN");
    public static MemoryLayout $LAYOUT() {
        return _wireSAFEARR_UNKNOWN.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _wireSAFEARR_UNKNOWN.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_wireSAFEARR_UNKNOWN.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _wireSAFEARR_UNKNOWN.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_wireSAFEARR_UNKNOWN.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _wireSAFEARR_UNKNOWN.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle apUnknown$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("apUnknown"));
    public static VarHandle apUnknown$VH() {
        return _wireSAFEARR_UNKNOWN.apUnknown$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IUnknown** apUnknown;
     * }
     */
    public static MemorySegment apUnknown$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_wireSAFEARR_UNKNOWN.apUnknown$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IUnknown** apUnknown;
     * }
     */
    public static void apUnknown$set(MemorySegment seg, MemorySegment x) {
        _wireSAFEARR_UNKNOWN.apUnknown$VH.set(seg, x);
    }
    public static MemorySegment apUnknown$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_wireSAFEARR_UNKNOWN.apUnknown$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void apUnknown$set(MemorySegment seg, long index, MemorySegment x) {
        _wireSAFEARR_UNKNOWN.apUnknown$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


