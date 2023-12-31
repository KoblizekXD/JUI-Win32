// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SENDCMDINPARAMS {
 *     DWORD cBufferSize;
 *     IDEREGS irDriveRegs;
 *     BYTE bDriveNumber;
 *     BYTE bReserved[3];
 *     DWORD dwReserved[4];
 *     BYTE bBuffer[1];
 * };
 * }
 */
public class _SENDCMDINPARAMS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cBufferSize"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("bFeaturesReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bSectorCountReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bSectorNumberReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bCylLowReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bCylHighReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bDriveHeadReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bCommandReg"),
            Constants$root.C_CHAR$LAYOUT.withName("bReserved")
        ).withName("irDriveRegs"),
        Constants$root.C_CHAR$LAYOUT.withName("bDriveNumber"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("bReserved"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_LONG$LAYOUT).withName("dwReserved"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("bBuffer")
    ).withName("_SENDCMDINPARAMS");
    public static MemoryLayout $LAYOUT() {
        return _SENDCMDINPARAMS.$struct$LAYOUT;
    }
    static final VarHandle cBufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBufferSize"));
    public static VarHandle cBufferSize$VH() {
        return _SENDCMDINPARAMS.cBufferSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cBufferSize;
     * }
     */
    public static int cBufferSize$get(MemorySegment seg) {
        return (int)_SENDCMDINPARAMS.cBufferSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cBufferSize;
     * }
     */
    public static void cBufferSize$set(MemorySegment seg, int x) {
        _SENDCMDINPARAMS.cBufferSize$VH.set(seg, x);
    }
    public static int cBufferSize$get(MemorySegment seg, long index) {
        return (int)_SENDCMDINPARAMS.cBufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBufferSize$set(MemorySegment seg, long index, int x) {
        _SENDCMDINPARAMS.cBufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment irDriveRegs$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    static final VarHandle bDriveNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bDriveNumber"));
    public static VarHandle bDriveNumber$VH() {
        return _SENDCMDINPARAMS.bDriveNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bDriveNumber;
     * }
     */
    public static byte bDriveNumber$get(MemorySegment seg) {
        return (byte)_SENDCMDINPARAMS.bDriveNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bDriveNumber;
     * }
     */
    public static void bDriveNumber$set(MemorySegment seg, byte x) {
        _SENDCMDINPARAMS.bDriveNumber$VH.set(seg, x);
    }
    public static byte bDriveNumber$get(MemorySegment seg, long index) {
        return (byte)_SENDCMDINPARAMS.bDriveNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bDriveNumber$set(MemorySegment seg, long index, byte x) {
        _SENDCMDINPARAMS.bDriveNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bReserved$slice(MemorySegment seg) {
        return seg.asSlice(13, 3);
    }
    public static MemorySegment dwReserved$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment bBuffer$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


