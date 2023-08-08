// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCABOOL {
 *     ULONG cElems;
 *     VARIANT_BOOL* pElems;
 * };
 * }
 */
public class tagCABOOL {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cElems"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pElems")
    ).withName("tagCABOOL");
    public static MemoryLayout $LAYOUT() {
        return tagCABOOL.$struct$LAYOUT;
    }
    static final VarHandle cElems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cElems"));
    public static VarHandle cElems$VH() {
        return tagCABOOL.cElems$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cElems;
     * }
     */
    public static int cElems$get(MemorySegment seg) {
        return (int)tagCABOOL.cElems$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cElems;
     * }
     */
    public static void cElems$set(MemorySegment seg, int x) {
        tagCABOOL.cElems$VH.set(seg, x);
    }
    public static int cElems$get(MemorySegment seg, long index) {
        return (int)tagCABOOL.cElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElems$set(MemorySegment seg, long index, int x) {
        tagCABOOL.cElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pElems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pElems"));
    public static VarHandle pElems$VH() {
        return tagCABOOL.pElems$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * VARIANT_BOOL* pElems;
     * }
     */
    public static MemorySegment pElems$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCABOOL.pElems$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * VARIANT_BOOL* pElems;
     * }
     */
    public static void pElems$set(MemorySegment seg, MemorySegment x) {
        tagCABOOL.pElems$VH.set(seg, x);
    }
    public static MemorySegment pElems$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCABOOL.pElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pElems$set(MemorySegment seg, long index, MemorySegment x) {
        tagCABOOL.pElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


