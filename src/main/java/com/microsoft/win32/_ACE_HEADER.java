// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ACE_HEADER {
 *     BYTE AceType;
 *     BYTE AceFlags;
 *     WORD AceSize;
 * };
 * }
 */
public class _ACE_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("AceType"),
        Constants$root.C_CHAR$LAYOUT.withName("AceFlags"),
        Constants$root.C_SHORT$LAYOUT.withName("AceSize")
    ).withName("_ACE_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _ACE_HEADER.$struct$LAYOUT;
    }
    static final VarHandle AceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AceType"));
    public static VarHandle AceType$VH() {
        return _ACE_HEADER.AceType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE AceType;
     * }
     */
    public static byte AceType$get(MemorySegment seg) {
        return (byte)_ACE_HEADER.AceType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE AceType;
     * }
     */
    public static void AceType$set(MemorySegment seg, byte x) {
        _ACE_HEADER.AceType$VH.set(seg, x);
    }
    public static byte AceType$get(MemorySegment seg, long index) {
        return (byte)_ACE_HEADER.AceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AceType$set(MemorySegment seg, long index, byte x) {
        _ACE_HEADER.AceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AceFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AceFlags"));
    public static VarHandle AceFlags$VH() {
        return _ACE_HEADER.AceFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE AceFlags;
     * }
     */
    public static byte AceFlags$get(MemorySegment seg) {
        return (byte)_ACE_HEADER.AceFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE AceFlags;
     * }
     */
    public static void AceFlags$set(MemorySegment seg, byte x) {
        _ACE_HEADER.AceFlags$VH.set(seg, x);
    }
    public static byte AceFlags$get(MemorySegment seg, long index) {
        return (byte)_ACE_HEADER.AceFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AceFlags$set(MemorySegment seg, long index, byte x) {
        _ACE_HEADER.AceFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AceSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AceSize"));
    public static VarHandle AceSize$VH() {
        return _ACE_HEADER.AceSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD AceSize;
     * }
     */
    public static short AceSize$get(MemorySegment seg) {
        return (short)_ACE_HEADER.AceSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD AceSize;
     * }
     */
    public static void AceSize$set(MemorySegment seg, short x) {
        _ACE_HEADER.AceSize$VH.set(seg, x);
    }
    public static short AceSize$get(MemorySegment seg, long index) {
        return (short)_ACE_HEADER.AceSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AceSize$set(MemorySegment seg, long index, short x) {
        _ACE_HEADER.AceSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


