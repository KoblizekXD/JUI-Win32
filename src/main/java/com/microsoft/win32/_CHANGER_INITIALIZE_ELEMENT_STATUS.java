// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CHANGER_INITIALIZE_ELEMENT_STATUS {
 *     CHANGER_ELEMENT_LIST ElementList;
 *     BOOLEAN BarCodeScan;
 * };
 * }
 */
public class _CHANGER_INITIALIZE_ELEMENT_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("ElementType"),
                Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
            ).withName("Element"),
            Constants$root.C_LONG$LAYOUT.withName("NumberOfElements")
        ).withName("ElementList"),
        Constants$root.C_CHAR$LAYOUT.withName("BarCodeScan"),
        MemoryLayout.paddingLayout(24)
    ).withName("_CHANGER_INITIALIZE_ELEMENT_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _CHANGER_INITIALIZE_ELEMENT_STATUS.$struct$LAYOUT;
    }
    public static MemorySegment ElementList$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    static final VarHandle BarCodeScan$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BarCodeScan"));
    public static VarHandle BarCodeScan$VH() {
        return _CHANGER_INITIALIZE_ELEMENT_STATUS.BarCodeScan$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN BarCodeScan;
     * }
     */
    public static byte BarCodeScan$get(MemorySegment seg) {
        return (byte)_CHANGER_INITIALIZE_ELEMENT_STATUS.BarCodeScan$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN BarCodeScan;
     * }
     */
    public static void BarCodeScan$set(MemorySegment seg, byte x) {
        _CHANGER_INITIALIZE_ELEMENT_STATUS.BarCodeScan$VH.set(seg, x);
    }
    public static byte BarCodeScan$get(MemorySegment seg, long index) {
        return (byte)_CHANGER_INITIALIZE_ELEMENT_STATUS.BarCodeScan$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BarCodeScan$set(MemorySegment seg, long index, byte x) {
        _CHANGER_INITIALIZE_ELEMENT_STATUS.BarCodeScan$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


