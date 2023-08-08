// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMDINEXTMENU {
 *     HMENU hmenuIn;
 *     HMENU hmenuNext;
 *     HWND hwndNext;
 * };
 * }
 */
public class tagMDINEXTMENU {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hmenuIn"),
        Constants$root.C_POINTER$LAYOUT.withName("hmenuNext"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndNext")
    ).withName("tagMDINEXTMENU");
    public static MemoryLayout $LAYOUT() {
        return tagMDINEXTMENU.$struct$LAYOUT;
    }
    static final VarHandle hmenuIn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hmenuIn"));
    public static VarHandle hmenuIn$VH() {
        return tagMDINEXTMENU.hmenuIn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HMENU hmenuIn;
     * }
     */
    public static MemorySegment hmenuIn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMDINEXTMENU.hmenuIn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HMENU hmenuIn;
     * }
     */
    public static void hmenuIn$set(MemorySegment seg, MemorySegment x) {
        tagMDINEXTMENU.hmenuIn$VH.set(seg, x);
    }
    public static MemorySegment hmenuIn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMDINEXTMENU.hmenuIn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenuIn$set(MemorySegment seg, long index, MemorySegment x) {
        tagMDINEXTMENU.hmenuIn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hmenuNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hmenuNext"));
    public static VarHandle hmenuNext$VH() {
        return tagMDINEXTMENU.hmenuNext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HMENU hmenuNext;
     * }
     */
    public static MemorySegment hmenuNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMDINEXTMENU.hmenuNext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HMENU hmenuNext;
     * }
     */
    public static void hmenuNext$set(MemorySegment seg, MemorySegment x) {
        tagMDINEXTMENU.hmenuNext$VH.set(seg, x);
    }
    public static MemorySegment hmenuNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMDINEXTMENU.hmenuNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hmenuNext$set(MemorySegment seg, long index, MemorySegment x) {
        tagMDINEXTMENU.hmenuNext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndNext"));
    public static VarHandle hwndNext$VH() {
        return tagMDINEXTMENU.hwndNext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndNext;
     * }
     */
    public static MemorySegment hwndNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMDINEXTMENU.hwndNext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndNext;
     * }
     */
    public static void hwndNext$set(MemorySegment seg, MemorySegment x) {
        tagMDINEXTMENU.hwndNext$VH.set(seg, x);
    }
    public static MemorySegment hwndNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMDINEXTMENU.hwndNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndNext$set(MemorySegment seg, long index, MemorySegment x) {
        tagMDINEXTMENU.hwndNext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

