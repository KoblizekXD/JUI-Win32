// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMEASUREITEMSTRUCT {
 *     UINT CtlType;
 *     UINT CtlID;
 *     UINT itemID;
 *     UINT itemWidth;
 *     UINT itemHeight;
 *     ULONG_PTR itemData;
 * };
 * }
 */
public class tagMEASUREITEMSTRUCT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("CtlType"),
        Constants$root.C_LONG$LAYOUT.withName("CtlID"),
        Constants$root.C_LONG$LAYOUT.withName("itemID"),
        Constants$root.C_LONG$LAYOUT.withName("itemWidth"),
        Constants$root.C_LONG$LAYOUT.withName("itemHeight"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("itemData")
    ).withName("tagMEASUREITEMSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagMEASUREITEMSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle CtlType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CtlType"));
    public static VarHandle CtlType$VH() {
        return tagMEASUREITEMSTRUCT.CtlType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT CtlType;
     * }
     */
    public static int CtlType$get(MemorySegment seg) {
        return (int)tagMEASUREITEMSTRUCT.CtlType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT CtlType;
     * }
     */
    public static void CtlType$set(MemorySegment seg, int x) {
        tagMEASUREITEMSTRUCT.CtlType$VH.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)tagMEASUREITEMSTRUCT.CtlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        tagMEASUREITEMSTRUCT.CtlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CtlID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CtlID"));
    public static VarHandle CtlID$VH() {
        return tagMEASUREITEMSTRUCT.CtlID$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT CtlID;
     * }
     */
    public static int CtlID$get(MemorySegment seg) {
        return (int)tagMEASUREITEMSTRUCT.CtlID$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT CtlID;
     * }
     */
    public static void CtlID$set(MemorySegment seg, int x) {
        tagMEASUREITEMSTRUCT.CtlID$VH.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)tagMEASUREITEMSTRUCT.CtlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        tagMEASUREITEMSTRUCT.CtlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemID"));
    public static VarHandle itemID$VH() {
        return tagMEASUREITEMSTRUCT.itemID$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemID;
     * }
     */
    public static int itemID$get(MemorySegment seg) {
        return (int)tagMEASUREITEMSTRUCT.itemID$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemID;
     * }
     */
    public static void itemID$set(MemorySegment seg, int x) {
        tagMEASUREITEMSTRUCT.itemID$VH.set(seg, x);
    }
    public static int itemID$get(MemorySegment seg, long index) {
        return (int)tagMEASUREITEMSTRUCT.itemID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID$set(MemorySegment seg, long index, int x) {
        tagMEASUREITEMSTRUCT.itemID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemWidth"));
    public static VarHandle itemWidth$VH() {
        return tagMEASUREITEMSTRUCT.itemWidth$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemWidth;
     * }
     */
    public static int itemWidth$get(MemorySegment seg) {
        return (int)tagMEASUREITEMSTRUCT.itemWidth$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemWidth;
     * }
     */
    public static void itemWidth$set(MemorySegment seg, int x) {
        tagMEASUREITEMSTRUCT.itemWidth$VH.set(seg, x);
    }
    public static int itemWidth$get(MemorySegment seg, long index) {
        return (int)tagMEASUREITEMSTRUCT.itemWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemWidth$set(MemorySegment seg, long index, int x) {
        tagMEASUREITEMSTRUCT.itemWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemHeight"));
    public static VarHandle itemHeight$VH() {
        return tagMEASUREITEMSTRUCT.itemHeight$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT itemHeight;
     * }
     */
    public static int itemHeight$get(MemorySegment seg) {
        return (int)tagMEASUREITEMSTRUCT.itemHeight$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT itemHeight;
     * }
     */
    public static void itemHeight$set(MemorySegment seg, int x) {
        tagMEASUREITEMSTRUCT.itemHeight$VH.set(seg, x);
    }
    public static int itemHeight$get(MemorySegment seg, long index) {
        return (int)tagMEASUREITEMSTRUCT.itemHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemHeight$set(MemorySegment seg, long index, int x) {
        tagMEASUREITEMSTRUCT.itemHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemData"));
    public static VarHandle itemData$VH() {
        return tagMEASUREITEMSTRUCT.itemData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR itemData;
     * }
     */
    public static long itemData$get(MemorySegment seg) {
        return (long)tagMEASUREITEMSTRUCT.itemData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR itemData;
     * }
     */
    public static void itemData$set(MemorySegment seg, long x) {
        tagMEASUREITEMSTRUCT.itemData$VH.set(seg, x);
    }
    public static long itemData$get(MemorySegment seg, long index) {
        return (long)tagMEASUREITEMSTRUCT.itemData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData$set(MemorySegment seg, long index, long x) {
        tagMEASUREITEMSTRUCT.itemData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


