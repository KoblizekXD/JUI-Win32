// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDISPPARAMS {
 *     VARIANTARG* rgvarg;
 *     DISPID* rgdispidNamedArgs;
 *     UINT cArgs;
 *     UINT cNamedArgs;
 * };
 * }
 */
public class tagDISPPARAMS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("rgvarg"),
        Constants$root.C_POINTER$LAYOUT.withName("rgdispidNamedArgs"),
        Constants$root.C_LONG$LAYOUT.withName("cArgs"),
        Constants$root.C_LONG$LAYOUT.withName("cNamedArgs")
    ).withName("tagDISPPARAMS");
    public static MemoryLayout $LAYOUT() {
        return tagDISPPARAMS.$struct$LAYOUT;
    }
    static final VarHandle rgvarg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgvarg"));
    public static VarHandle rgvarg$VH() {
        return tagDISPPARAMS.rgvarg$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VARIANTARG* rgvarg;
     * }
     */
    public static MemorySegment rgvarg$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagDISPPARAMS.rgvarg$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VARIANTARG* rgvarg;
     * }
     */
    public static void rgvarg$set(MemorySegment seg, MemorySegment x) {
        tagDISPPARAMS.rgvarg$VH.set(seg, x);
    }
    public static MemorySegment rgvarg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagDISPPARAMS.rgvarg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgvarg$set(MemorySegment seg, long index, MemorySegment x) {
        tagDISPPARAMS.rgvarg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgdispidNamedArgs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgdispidNamedArgs"));
    public static VarHandle rgdispidNamedArgs$VH() {
        return tagDISPPARAMS.rgdispidNamedArgs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPID* rgdispidNamedArgs;
     * }
     */
    public static MemorySegment rgdispidNamedArgs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagDISPPARAMS.rgdispidNamedArgs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPID* rgdispidNamedArgs;
     * }
     */
    public static void rgdispidNamedArgs$set(MemorySegment seg, MemorySegment x) {
        tagDISPPARAMS.rgdispidNamedArgs$VH.set(seg, x);
    }
    public static MemorySegment rgdispidNamedArgs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagDISPPARAMS.rgdispidNamedArgs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgdispidNamedArgs$set(MemorySegment seg, long index, MemorySegment x) {
        tagDISPPARAMS.rgdispidNamedArgs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cArgs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cArgs"));
    public static VarHandle cArgs$VH() {
        return tagDISPPARAMS.cArgs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cArgs;
     * }
     */
    public static int cArgs$get(MemorySegment seg) {
        return (int)tagDISPPARAMS.cArgs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cArgs;
     * }
     */
    public static void cArgs$set(MemorySegment seg, int x) {
        tagDISPPARAMS.cArgs$VH.set(seg, x);
    }
    public static int cArgs$get(MemorySegment seg, long index) {
        return (int)tagDISPPARAMS.cArgs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cArgs$set(MemorySegment seg, long index, int x) {
        tagDISPPARAMS.cArgs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cNamedArgs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cNamedArgs"));
    public static VarHandle cNamedArgs$VH() {
        return tagDISPPARAMS.cNamedArgs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cNamedArgs;
     * }
     */
    public static int cNamedArgs$get(MemorySegment seg) {
        return (int)tagDISPPARAMS.cNamedArgs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cNamedArgs;
     * }
     */
    public static void cNamedArgs$set(MemorySegment seg, int x) {
        tagDISPPARAMS.cNamedArgs$VH.set(seg, x);
    }
    public static int cNamedArgs$get(MemorySegment seg, long index) {
        return (int)tagDISPPARAMS.cNamedArgs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cNamedArgs$set(MemorySegment seg, long index, int x) {
        tagDISPPARAMS.cNamedArgs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


