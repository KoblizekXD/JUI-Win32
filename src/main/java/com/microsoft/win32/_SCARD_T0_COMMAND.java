// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCARD_T0_COMMAND {
 *     BYTE bCla;
 *     BYTE bIns;
 *     BYTE bP1;
 *     BYTE bP2;
 *     BYTE bP3;
 * };
 * }
 */
public class _SCARD_T0_COMMAND {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("bCla"),
        Constants$root.C_CHAR$LAYOUT.withName("bIns"),
        Constants$root.C_CHAR$LAYOUT.withName("bP1"),
        Constants$root.C_CHAR$LAYOUT.withName("bP2"),
        Constants$root.C_CHAR$LAYOUT.withName("bP3")
    ).withName("_SCARD_T0_COMMAND");
    public static MemoryLayout $LAYOUT() {
        return _SCARD_T0_COMMAND.$struct$LAYOUT;
    }
    static final VarHandle bCla$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bCla"));
    public static VarHandle bCla$VH() {
        return _SCARD_T0_COMMAND.bCla$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bCla;
     * }
     */
    public static byte bCla$get(MemorySegment seg) {
        return (byte)_SCARD_T0_COMMAND.bCla$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bCla;
     * }
     */
    public static void bCla$set(MemorySegment seg, byte x) {
        _SCARD_T0_COMMAND.bCla$VH.set(seg, x);
    }
    public static byte bCla$get(MemorySegment seg, long index) {
        return (byte)_SCARD_T0_COMMAND.bCla$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bCla$set(MemorySegment seg, long index, byte x) {
        _SCARD_T0_COMMAND.bCla$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bIns$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bIns"));
    public static VarHandle bIns$VH() {
        return _SCARD_T0_COMMAND.bIns$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bIns;
     * }
     */
    public static byte bIns$get(MemorySegment seg) {
        return (byte)_SCARD_T0_COMMAND.bIns$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bIns;
     * }
     */
    public static void bIns$set(MemorySegment seg, byte x) {
        _SCARD_T0_COMMAND.bIns$VH.set(seg, x);
    }
    public static byte bIns$get(MemorySegment seg, long index) {
        return (byte)_SCARD_T0_COMMAND.bIns$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bIns$set(MemorySegment seg, long index, byte x) {
        _SCARD_T0_COMMAND.bIns$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bP1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bP1"));
    public static VarHandle bP1$VH() {
        return _SCARD_T0_COMMAND.bP1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bP1;
     * }
     */
    public static byte bP1$get(MemorySegment seg) {
        return (byte)_SCARD_T0_COMMAND.bP1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bP1;
     * }
     */
    public static void bP1$set(MemorySegment seg, byte x) {
        _SCARD_T0_COMMAND.bP1$VH.set(seg, x);
    }
    public static byte bP1$get(MemorySegment seg, long index) {
        return (byte)_SCARD_T0_COMMAND.bP1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bP1$set(MemorySegment seg, long index, byte x) {
        _SCARD_T0_COMMAND.bP1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bP2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bP2"));
    public static VarHandle bP2$VH() {
        return _SCARD_T0_COMMAND.bP2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bP2;
     * }
     */
    public static byte bP2$get(MemorySegment seg) {
        return (byte)_SCARD_T0_COMMAND.bP2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bP2;
     * }
     */
    public static void bP2$set(MemorySegment seg, byte x) {
        _SCARD_T0_COMMAND.bP2$VH.set(seg, x);
    }
    public static byte bP2$get(MemorySegment seg, long index) {
        return (byte)_SCARD_T0_COMMAND.bP2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bP2$set(MemorySegment seg, long index, byte x) {
        _SCARD_T0_COMMAND.bP2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bP3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bP3"));
    public static VarHandle bP3$VH() {
        return _SCARD_T0_COMMAND.bP3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bP3;
     * }
     */
    public static byte bP3$get(MemorySegment seg) {
        return (byte)_SCARD_T0_COMMAND.bP3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bP3;
     * }
     */
    public static void bP3$set(MemorySegment seg, byte x) {
        _SCARD_T0_COMMAND.bP3$VH.set(seg, x);
    }
    public static byte bP3$get(MemorySegment seg, long index) {
        return (byte)_SCARD_T0_COMMAND.bP3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bP3$set(MemorySegment seg, long index, byte x) {
        _SCARD_T0_COMMAND.bP3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


