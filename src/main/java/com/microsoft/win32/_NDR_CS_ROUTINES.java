// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NDR_CS_ROUTINES {
 *     NDR_CS_SIZE_CONVERT_ROUTINES* pSizeConvertRoutines;
 *     CS_TAG_GETTING_ROUTINE* pTagGettingRoutines;
 * };
 * }
 */
public class _NDR_CS_ROUTINES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pSizeConvertRoutines"),
        Constants$root.C_POINTER$LAYOUT.withName("pTagGettingRoutines")
    ).withName("_NDR_CS_ROUTINES");
    public static MemoryLayout $LAYOUT() {
        return _NDR_CS_ROUTINES.$struct$LAYOUT;
    }
    static final VarHandle pSizeConvertRoutines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSizeConvertRoutines"));
    public static VarHandle pSizeConvertRoutines$VH() {
        return _NDR_CS_ROUTINES.pSizeConvertRoutines$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * NDR_CS_SIZE_CONVERT_ROUTINES* pSizeConvertRoutines;
     * }
     */
    public static MemorySegment pSizeConvertRoutines$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NDR_CS_ROUTINES.pSizeConvertRoutines$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * NDR_CS_SIZE_CONVERT_ROUTINES* pSizeConvertRoutines;
     * }
     */
    public static void pSizeConvertRoutines$set(MemorySegment seg, MemorySegment x) {
        _NDR_CS_ROUTINES.pSizeConvertRoutines$VH.set(seg, x);
    }
    public static MemorySegment pSizeConvertRoutines$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NDR_CS_ROUTINES.pSizeConvertRoutines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSizeConvertRoutines$set(MemorySegment seg, long index, MemorySegment x) {
        _NDR_CS_ROUTINES.pSizeConvertRoutines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTagGettingRoutines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTagGettingRoutines"));
    public static VarHandle pTagGettingRoutines$VH() {
        return _NDR_CS_ROUTINES.pTagGettingRoutines$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CS_TAG_GETTING_ROUTINE* pTagGettingRoutines;
     * }
     */
    public static MemorySegment pTagGettingRoutines$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_NDR_CS_ROUTINES.pTagGettingRoutines$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CS_TAG_GETTING_ROUTINE* pTagGettingRoutines;
     * }
     */
    public static void pTagGettingRoutines$set(MemorySegment seg, MemorySegment x) {
        _NDR_CS_ROUTINES.pTagGettingRoutines$VH.set(seg, x);
    }
    public static MemorySegment pTagGettingRoutines$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_NDR_CS_ROUTINES.pTagGettingRoutines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTagGettingRoutines$set(MemorySegment seg, long index, MemorySegment x) {
        _NDR_CS_ROUTINES.pTagGettingRoutines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


