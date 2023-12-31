// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     WORD versionNumber;
 *     WORD offset;
 * };
 * }
 */
public class MENUITEMTEMPLATEHEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("versionNumber"),
        Constants$root.C_SHORT$LAYOUT.withName("offset")
    );
    public static MemoryLayout $LAYOUT() {
        return MENUITEMTEMPLATEHEADER.$struct$LAYOUT;
    }
    static final VarHandle versionNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("versionNumber"));
    public static VarHandle versionNumber$VH() {
        return MENUITEMTEMPLATEHEADER.versionNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD versionNumber;
     * }
     */
    public static short versionNumber$get(MemorySegment seg) {
        return (short)MENUITEMTEMPLATEHEADER.versionNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD versionNumber;
     * }
     */
    public static void versionNumber$set(MemorySegment seg, short x) {
        MENUITEMTEMPLATEHEADER.versionNumber$VH.set(seg, x);
    }
    public static short versionNumber$get(MemorySegment seg, long index) {
        return (short)MENUITEMTEMPLATEHEADER.versionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void versionNumber$set(MemorySegment seg, long index, short x) {
        MENUITEMTEMPLATEHEADER.versionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return MENUITEMTEMPLATEHEADER.offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD offset;
     * }
     */
    public static short offset$get(MemorySegment seg) {
        return (short)MENUITEMTEMPLATEHEADER.offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD offset;
     * }
     */
    public static void offset$set(MemorySegment seg, short x) {
        MENUITEMTEMPLATEHEADER.offset$VH.set(seg, x);
    }
    public static short offset$get(MemorySegment seg, long index) {
        return (short)MENUITEMTEMPLATEHEADER.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, short x) {
        MENUITEMTEMPLATEHEADER.offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


