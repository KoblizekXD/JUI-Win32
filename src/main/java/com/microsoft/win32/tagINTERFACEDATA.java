// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagINTERFACEDATA {
 *     METHODDATA* pmethdata;
 *     UINT cMembers;
 * };
 * }
 */
public class tagINTERFACEDATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pmethdata"),
        Constants$root.C_LONG$LAYOUT.withName("cMembers"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagINTERFACEDATA");
    public static MemoryLayout $LAYOUT() {
        return tagINTERFACEDATA.$struct$LAYOUT;
    }
    static final VarHandle pmethdata$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pmethdata"));
    public static VarHandle pmethdata$VH() {
        return tagINTERFACEDATA.pmethdata$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * METHODDATA* pmethdata;
     * }
     */
    public static MemorySegment pmethdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagINTERFACEDATA.pmethdata$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * METHODDATA* pmethdata;
     * }
     */
    public static void pmethdata$set(MemorySegment seg, MemorySegment x) {
        tagINTERFACEDATA.pmethdata$VH.set(seg, x);
    }
    public static MemorySegment pmethdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagINTERFACEDATA.pmethdata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pmethdata$set(MemorySegment seg, long index, MemorySegment x) {
        tagINTERFACEDATA.pmethdata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cMembers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cMembers"));
    public static VarHandle cMembers$VH() {
        return tagINTERFACEDATA.cMembers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cMembers;
     * }
     */
    public static int cMembers$get(MemorySegment seg) {
        return (int)tagINTERFACEDATA.cMembers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cMembers;
     * }
     */
    public static void cMembers$set(MemorySegment seg, int x) {
        tagINTERFACEDATA.cMembers$VH.set(seg, x);
    }
    public static int cMembers$get(MemorySegment seg, long index) {
        return (int)tagINTERFACEDATA.cMembers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cMembers$set(MemorySegment seg, long index, int x) {
        tagINTERFACEDATA.cMembers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


