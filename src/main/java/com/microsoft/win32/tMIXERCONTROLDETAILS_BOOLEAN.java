// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tMIXERCONTROLDETAILS_BOOLEAN {
 *     LONG fValue;
 * };
 * }
 */
public class tMIXERCONTROLDETAILS_BOOLEAN {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fValue")
    ).withName("tMIXERCONTROLDETAILS_BOOLEAN");
    public static MemoryLayout $LAYOUT() {
        return tMIXERCONTROLDETAILS_BOOLEAN.$struct$LAYOUT;
    }
    static final VarHandle fValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fValue"));
    public static VarHandle fValue$VH() {
        return tMIXERCONTROLDETAILS_BOOLEAN.fValue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG fValue;
     * }
     */
    public static int fValue$get(MemorySegment seg) {
        return (int)tMIXERCONTROLDETAILS_BOOLEAN.fValue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG fValue;
     * }
     */
    public static void fValue$set(MemorySegment seg, int x) {
        tMIXERCONTROLDETAILS_BOOLEAN.fValue$VH.set(seg, x);
    }
    public static int fValue$get(MemorySegment seg, long index) {
        return (int)tMIXERCONTROLDETAILS_BOOLEAN.fValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fValue$set(MemorySegment seg, long index, int x) {
        tMIXERCONTROLDETAILS_BOOLEAN.fValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

