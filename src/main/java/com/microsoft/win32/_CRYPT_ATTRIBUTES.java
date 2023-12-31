// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_ATTRIBUTES {
 *     DWORD cAttr;
 *     PCRYPT_ATTRIBUTE rgAttr;
 * };
 * }
 */
public class _CRYPT_ATTRIBUTES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cAttr"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgAttr")
    ).withName("_CRYPT_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle cAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAttr"));
    public static VarHandle cAttr$VH() {
        return _CRYPT_ATTRIBUTES.cAttr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cAttr;
     * }
     */
    public static int cAttr$get(MemorySegment seg) {
        return (int)_CRYPT_ATTRIBUTES.cAttr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cAttr;
     * }
     */
    public static void cAttr$set(MemorySegment seg, int x) {
        _CRYPT_ATTRIBUTES.cAttr$VH.set(seg, x);
    }
    public static int cAttr$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ATTRIBUTES.cAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAttr$set(MemorySegment seg, long index, int x) {
        _CRYPT_ATTRIBUTES.cAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgAttr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgAttr"));
    public static VarHandle rgAttr$VH() {
        return _CRYPT_ATTRIBUTES.rgAttr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRYPT_ATTRIBUTE rgAttr;
     * }
     */
    public static MemorySegment rgAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ATTRIBUTES.rgAttr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRYPT_ATTRIBUTE rgAttr;
     * }
     */
    public static void rgAttr$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_ATTRIBUTES.rgAttr$VH.set(seg, x);
    }
    public static MemorySegment rgAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ATTRIBUTES.rgAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgAttr$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_ATTRIBUTES.rgAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


