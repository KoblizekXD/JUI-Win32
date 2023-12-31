// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct linger {
 *     u_short l_onoff;
 *     u_short l_linger;
 * };
 * }
 */
public class linger {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("l_onoff"),
        Constants$root.C_SHORT$LAYOUT.withName("l_linger")
    ).withName("linger");
    public static MemoryLayout $LAYOUT() {
        return linger.$struct$LAYOUT;
    }
    static final VarHandle l_onoff$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_onoff"));
    public static VarHandle l_onoff$VH() {
        return linger.l_onoff$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * u_short l_onoff;
     * }
     */
    public static short l_onoff$get(MemorySegment seg) {
        return (short)linger.l_onoff$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * u_short l_onoff;
     * }
     */
    public static void l_onoff$set(MemorySegment seg, short x) {
        linger.l_onoff$VH.set(seg, x);
    }
    public static short l_onoff$get(MemorySegment seg, long index) {
        return (short)linger.l_onoff$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_onoff$set(MemorySegment seg, long index, short x) {
        linger.l_onoff$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle l_linger$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("l_linger"));
    public static VarHandle l_linger$VH() {
        return linger.l_linger$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * u_short l_linger;
     * }
     */
    public static short l_linger$get(MemorySegment seg) {
        return (short)linger.l_linger$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * u_short l_linger;
     * }
     */
    public static void l_linger$set(MemorySegment seg, short x) {
        linger.l_linger$VH.set(seg, x);
    }
    public static short l_linger$get(MemorySegment seg, long index) {
        return (short)linger.l_linger$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void l_linger$set(MemorySegment seg, long index, short x) {
        linger.l_linger$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


