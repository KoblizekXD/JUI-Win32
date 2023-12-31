// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ASSOCIATIONELEMENT {
 *     ASSOCCLASS ac;
 *     HKEY hkClass;
 *     PCWSTR pszClass;
 * };
 * }
 */
public class ASSOCIATIONELEMENT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ac"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hkClass"),
        Constants$root.C_POINTER$LAYOUT.withName("pszClass")
    ).withName("ASSOCIATIONELEMENT");
    public static MemoryLayout $LAYOUT() {
        return ASSOCIATIONELEMENT.$struct$LAYOUT;
    }
    static final VarHandle ac$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ac"));
    public static VarHandle ac$VH() {
        return ASSOCIATIONELEMENT.ac$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ASSOCCLASS ac;
     * }
     */
    public static int ac$get(MemorySegment seg) {
        return (int)ASSOCIATIONELEMENT.ac$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ASSOCCLASS ac;
     * }
     */
    public static void ac$set(MemorySegment seg, int x) {
        ASSOCIATIONELEMENT.ac$VH.set(seg, x);
    }
    public static int ac$get(MemorySegment seg, long index) {
        return (int)ASSOCIATIONELEMENT.ac$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ac$set(MemorySegment seg, long index, int x) {
        ASSOCIATIONELEMENT.ac$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hkClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hkClass"));
    public static VarHandle hkClass$VH() {
        return ASSOCIATIONELEMENT.hkClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HKEY hkClass;
     * }
     */
    public static MemorySegment hkClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ASSOCIATIONELEMENT.hkClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HKEY hkClass;
     * }
     */
    public static void hkClass$set(MemorySegment seg, MemorySegment x) {
        ASSOCIATIONELEMENT.hkClass$VH.set(seg, x);
    }
    public static MemorySegment hkClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ASSOCIATIONELEMENT.hkClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hkClass$set(MemorySegment seg, long index, MemorySegment x) {
        ASSOCIATIONELEMENT.hkClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszClass"));
    public static VarHandle pszClass$VH() {
        return ASSOCIATIONELEMENT.pszClass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR pszClass;
     * }
     */
    public static MemorySegment pszClass$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)ASSOCIATIONELEMENT.pszClass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR pszClass;
     * }
     */
    public static void pszClass$set(MemorySegment seg, MemorySegment x) {
        ASSOCIATIONELEMENT.pszClass$VH.set(seg, x);
    }
    public static MemorySegment pszClass$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)ASSOCIATIONELEMENT.pszClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszClass$set(MemorySegment seg, long index, MemorySegment x) {
        ASSOCIATIONELEMENT.pszClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


