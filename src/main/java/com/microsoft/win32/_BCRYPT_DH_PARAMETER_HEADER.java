// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCRYPT_DH_PARAMETER_HEADER {
 *     ULONG cbLength;
 *     ULONG dwMagic;
 *     ULONG cbKeyLength;
 * };
 * }
 */
public class _BCRYPT_DH_PARAMETER_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbLength"),
        Constants$root.C_LONG$LAYOUT.withName("dwMagic"),
        Constants$root.C_LONG$LAYOUT.withName("cbKeyLength")
    ).withName("_BCRYPT_DH_PARAMETER_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_DH_PARAMETER_HEADER.$struct$LAYOUT;
    }
    static final VarHandle cbLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbLength"));
    public static VarHandle cbLength$VH() {
        return _BCRYPT_DH_PARAMETER_HEADER.cbLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbLength;
     * }
     */
    public static int cbLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbLength;
     * }
     */
    public static void cbLength$set(MemorySegment seg, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.set(seg, x);
    }
    public static int cbLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMagic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMagic"));
    public static VarHandle dwMagic$VH() {
        return _BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMagic;
     * }
     */
    public static int dwMagic$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMagic;
     * }
     */
    public static void dwMagic$set(MemorySegment seg, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.set(seg, x);
    }
    public static int dwMagic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMagic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKeyLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbKeyLength"));
    public static VarHandle cbKeyLength$VH() {
        return _BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbKeyLength;
     * }
     */
    public static int cbKeyLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbKeyLength;
     * }
     */
    public static void cbKeyLength$set(MemorySegment seg, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.set(seg, x);
    }
    public static int cbKeyLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


