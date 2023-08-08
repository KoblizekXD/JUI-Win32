// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct joyinfo_tag {
 *     UINT wXpos;
 *     UINT wYpos;
 *     UINT wZpos;
 *     UINT wButtons;
 * };
 * }
 */
public class joyinfo_tag {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("wXpos"),
        Constants$root.C_LONG$LAYOUT.withName("wYpos"),
        Constants$root.C_LONG$LAYOUT.withName("wZpos"),
        Constants$root.C_LONG$LAYOUT.withName("wButtons")
    ).withName("joyinfo_tag");
    public static MemoryLayout $LAYOUT() {
        return joyinfo_tag.$struct$LAYOUT;
    }
    static final VarHandle wXpos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wXpos"));
    public static VarHandle wXpos$VH() {
        return joyinfo_tag.wXpos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wXpos;
     * }
     */
    public static int wXpos$get(MemorySegment seg) {
        return (int)joyinfo_tag.wXpos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wXpos;
     * }
     */
    public static void wXpos$set(MemorySegment seg, int x) {
        joyinfo_tag.wXpos$VH.set(seg, x);
    }
    public static int wXpos$get(MemorySegment seg, long index) {
        return (int)joyinfo_tag.wXpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wXpos$set(MemorySegment seg, long index, int x) {
        joyinfo_tag.wXpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wYpos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wYpos"));
    public static VarHandle wYpos$VH() {
        return joyinfo_tag.wYpos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wYpos;
     * }
     */
    public static int wYpos$get(MemorySegment seg) {
        return (int)joyinfo_tag.wYpos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wYpos;
     * }
     */
    public static void wYpos$set(MemorySegment seg, int x) {
        joyinfo_tag.wYpos$VH.set(seg, x);
    }
    public static int wYpos$get(MemorySegment seg, long index) {
        return (int)joyinfo_tag.wYpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wYpos$set(MemorySegment seg, long index, int x) {
        joyinfo_tag.wYpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wZpos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wZpos"));
    public static VarHandle wZpos$VH() {
        return joyinfo_tag.wZpos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wZpos;
     * }
     */
    public static int wZpos$get(MemorySegment seg) {
        return (int)joyinfo_tag.wZpos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wZpos;
     * }
     */
    public static void wZpos$set(MemorySegment seg, int x) {
        joyinfo_tag.wZpos$VH.set(seg, x);
    }
    public static int wZpos$get(MemorySegment seg, long index) {
        return (int)joyinfo_tag.wZpos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wZpos$set(MemorySegment seg, long index, int x) {
        joyinfo_tag.wZpos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wButtons$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wButtons"));
    public static VarHandle wButtons$VH() {
        return joyinfo_tag.wButtons$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wButtons;
     * }
     */
    public static int wButtons$get(MemorySegment seg) {
        return (int)joyinfo_tag.wButtons$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wButtons;
     * }
     */
    public static void wButtons$set(MemorySegment seg, int x) {
        joyinfo_tag.wButtons$VH.set(seg, x);
    }
    public static int wButtons$get(MemorySegment seg, long index) {
        return (int)joyinfo_tag.wButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wButtons$set(MemorySegment seg, long index, int x) {
        joyinfo_tag.wButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


