// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tMIXERCONTROLDETAILS_SIGNED {
 *     LONG lValue;
 * };
 * }
 */
public class tMIXERCONTROLDETAILS_SIGNED {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lValue")
    ).withName("tMIXERCONTROLDETAILS_SIGNED");
    public static MemoryLayout $LAYOUT() {
        return tMIXERCONTROLDETAILS_SIGNED.$struct$LAYOUT;
    }
    static final VarHandle lValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lValue"));
    public static VarHandle lValue$VH() {
        return tMIXERCONTROLDETAILS_SIGNED.lValue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lValue;
     * }
     */
    public static int lValue$get(MemorySegment seg) {
        return (int)tMIXERCONTROLDETAILS_SIGNED.lValue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lValue;
     * }
     */
    public static void lValue$set(MemorySegment seg, int x) {
        tMIXERCONTROLDETAILS_SIGNED.lValue$VH.set(seg, x);
    }
    public static int lValue$get(MemorySegment seg, long index) {
        return (int)tMIXERCONTROLDETAILS_SIGNED.lValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lValue$set(MemorySegment seg, long index, int x) {
        tMIXERCONTROLDETAILS_SIGNED.lValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

