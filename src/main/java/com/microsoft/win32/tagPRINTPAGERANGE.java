// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPRINTPAGERANGE {
 *     DWORD nFromPage;
 *     DWORD nToPage;
 * };
 * }
 */
public class tagPRINTPAGERANGE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("nFromPage"),
        Constants$root.C_LONG$LAYOUT.withName("nToPage")
    ).withName("tagPRINTPAGERANGE");
    public static MemoryLayout $LAYOUT() {
        return tagPRINTPAGERANGE.$struct$LAYOUT;
    }
    static final VarHandle nFromPage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFromPage"));
    public static VarHandle nFromPage$VH() {
        return tagPRINTPAGERANGE.nFromPage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFromPage;
     * }
     */
    public static int nFromPage$get(MemorySegment seg) {
        return (int)tagPRINTPAGERANGE.nFromPage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFromPage;
     * }
     */
    public static void nFromPage$set(MemorySegment seg, int x) {
        tagPRINTPAGERANGE.nFromPage$VH.set(seg, x);
    }
    public static int nFromPage$get(MemorySegment seg, long index) {
        return (int)tagPRINTPAGERANGE.nFromPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFromPage$set(MemorySegment seg, long index, int x) {
        tagPRINTPAGERANGE.nFromPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nToPage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nToPage"));
    public static VarHandle nToPage$VH() {
        return tagPRINTPAGERANGE.nToPage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nToPage;
     * }
     */
    public static int nToPage$get(MemorySegment seg) {
        return (int)tagPRINTPAGERANGE.nToPage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nToPage;
     * }
     */
    public static void nToPage$set(MemorySegment seg, int x) {
        tagPRINTPAGERANGE.nToPage$VH.set(seg, x);
    }
    public static int nToPage$get(MemorySegment seg, long index) {
        return (int)tagPRINTPAGERANGE.nToPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nToPage$set(MemorySegment seg, long index, int x) {
        tagPRINTPAGERANGE.nToPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

