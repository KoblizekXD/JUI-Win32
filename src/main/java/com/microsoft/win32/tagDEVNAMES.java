// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDEVNAMES {
 *     WORD wDriverOffset;
 *     WORD wDeviceOffset;
 *     WORD wOutputOffset;
 *     WORD wDefault;
 * };
 * }
 */
public class tagDEVNAMES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wDriverOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("wDeviceOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("wOutputOffset"),
        Constants$root.C_SHORT$LAYOUT.withName("wDefault")
    ).withName("tagDEVNAMES");
    public static MemoryLayout $LAYOUT() {
        return tagDEVNAMES.$struct$LAYOUT;
    }
    static final VarHandle wDriverOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDriverOffset"));
    public static VarHandle wDriverOffset$VH() {
        return tagDEVNAMES.wDriverOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wDriverOffset;
     * }
     */
    public static short wDriverOffset$get(MemorySegment seg) {
        return (short)tagDEVNAMES.wDriverOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wDriverOffset;
     * }
     */
    public static void wDriverOffset$set(MemorySegment seg, short x) {
        tagDEVNAMES.wDriverOffset$VH.set(seg, x);
    }
    public static short wDriverOffset$get(MemorySegment seg, long index) {
        return (short)tagDEVNAMES.wDriverOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDriverOffset$set(MemorySegment seg, long index, short x) {
        tagDEVNAMES.wDriverOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDeviceOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDeviceOffset"));
    public static VarHandle wDeviceOffset$VH() {
        return tagDEVNAMES.wDeviceOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wDeviceOffset;
     * }
     */
    public static short wDeviceOffset$get(MemorySegment seg) {
        return (short)tagDEVNAMES.wDeviceOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wDeviceOffset;
     * }
     */
    public static void wDeviceOffset$set(MemorySegment seg, short x) {
        tagDEVNAMES.wDeviceOffset$VH.set(seg, x);
    }
    public static short wDeviceOffset$get(MemorySegment seg, long index) {
        return (short)tagDEVNAMES.wDeviceOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDeviceOffset$set(MemorySegment seg, long index, short x) {
        tagDEVNAMES.wDeviceOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wOutputOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wOutputOffset"));
    public static VarHandle wOutputOffset$VH() {
        return tagDEVNAMES.wOutputOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wOutputOffset;
     * }
     */
    public static short wOutputOffset$get(MemorySegment seg) {
        return (short)tagDEVNAMES.wOutputOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wOutputOffset;
     * }
     */
    public static void wOutputOffset$set(MemorySegment seg, short x) {
        tagDEVNAMES.wOutputOffset$VH.set(seg, x);
    }
    public static short wOutputOffset$get(MemorySegment seg, long index) {
        return (short)tagDEVNAMES.wOutputOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wOutputOffset$set(MemorySegment seg, long index, short x) {
        tagDEVNAMES.wOutputOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDefault$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDefault"));
    public static VarHandle wDefault$VH() {
        return tagDEVNAMES.wDefault$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wDefault;
     * }
     */
    public static short wDefault$get(MemorySegment seg) {
        return (short)tagDEVNAMES.wDefault$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wDefault;
     * }
     */
    public static void wDefault$set(MemorySegment seg, short x) {
        tagDEVNAMES.wDefault$VH.set(seg, x);
    }
    public static short wDefault$get(MemorySegment seg, long index) {
        return (short)tagDEVNAMES.wDefault$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDefault$set(MemorySegment seg, long index, short x) {
        tagDEVNAMES.wDefault$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

