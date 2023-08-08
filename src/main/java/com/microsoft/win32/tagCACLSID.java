// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCACLSID {
 *     ULONG cElems;
 *     CLSID* pElems;
 * };
 * }
 */
public class tagCACLSID {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cElems"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pElems")
    ).withName("tagCACLSID");
    public static MemoryLayout $LAYOUT() {
        return tagCACLSID.$struct$LAYOUT;
    }
    static final VarHandle cElems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cElems"));
    public static VarHandle cElems$VH() {
        return tagCACLSID.cElems$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cElems;
     * }
     */
    public static int cElems$get(MemorySegment seg) {
        return (int)tagCACLSID.cElems$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cElems;
     * }
     */
    public static void cElems$set(MemorySegment seg, int x) {
        tagCACLSID.cElems$VH.set(seg, x);
    }
    public static int cElems$get(MemorySegment seg, long index) {
        return (int)tagCACLSID.cElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElems$set(MemorySegment seg, long index, int x) {
        tagCACLSID.cElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pElems$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pElems"));
    public static VarHandle pElems$VH() {
        return tagCACLSID.pElems$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CLSID* pElems;
     * }
     */
    public static MemorySegment pElems$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagCACLSID.pElems$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CLSID* pElems;
     * }
     */
    public static void pElems$set(MemorySegment seg, MemorySegment x) {
        tagCACLSID.pElems$VH.set(seg, x);
    }
    public static MemorySegment pElems$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagCACLSID.pElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pElems$set(MemorySegment seg, long index, MemorySegment x) {
        tagCACLSID.pElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


