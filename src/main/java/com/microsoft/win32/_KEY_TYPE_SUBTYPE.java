// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _KEY_TYPE_SUBTYPE {
 *     DWORD dwKeySpec;
 *     GUID Type;
 *     GUID Subtype;
 * };
 * }
 */
public class _KEY_TYPE_SUBTYPE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("Type"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("Subtype")
    ).withName("_KEY_TYPE_SUBTYPE");
    public static MemoryLayout $LAYOUT() {
        return _KEY_TYPE_SUBTYPE.$struct$LAYOUT;
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _KEY_TYPE_SUBTYPE.dwKeySpec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeySpec;
     * }
     */
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_KEY_TYPE_SUBTYPE.dwKeySpec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeySpec;
     * }
     */
    public static void dwKeySpec$set(MemorySegment seg, int x) {
        _KEY_TYPE_SUBTYPE.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_KEY_TYPE_SUBTYPE.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _KEY_TYPE_SUBTYPE.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Type$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment Subtype$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


