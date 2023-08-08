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
 *     DWORDLONG StartFileReferenceNumber;
 *     USN LowUsn;
 *     USN HighUsn;
 *     WORD MinMajorVersion;
 *     WORD MaxMajorVersion;
 * };
 * }
 */
public class MFT_ENUM_DATA_V1 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("StartFileReferenceNumber"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LowUsn"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("HighUsn"),
        Constants$root.C_SHORT$LAYOUT.withName("MinMajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MaxMajorVersion"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return MFT_ENUM_DATA_V1.$struct$LAYOUT;
    }
    static final VarHandle StartFileReferenceNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartFileReferenceNumber"));
    public static VarHandle StartFileReferenceNumber$VH() {
        return MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG StartFileReferenceNumber;
     * }
     */
    public static long StartFileReferenceNumber$get(MemorySegment seg) {
        return (long)MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG StartFileReferenceNumber;
     * }
     */
    public static void StartFileReferenceNumber$set(MemorySegment seg, long x) {
        MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.set(seg, x);
    }
    public static long StartFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        MFT_ENUM_DATA_V1.StartFileReferenceNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LowUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowUsn"));
    public static VarHandle LowUsn$VH() {
        return MFT_ENUM_DATA_V1.LowUsn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USN LowUsn;
     * }
     */
    public static long LowUsn$get(MemorySegment seg) {
        return (long)MFT_ENUM_DATA_V1.LowUsn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USN LowUsn;
     * }
     */
    public static void LowUsn$set(MemorySegment seg, long x) {
        MFT_ENUM_DATA_V1.LowUsn$VH.set(seg, x);
    }
    public static long LowUsn$get(MemorySegment seg, long index) {
        return (long)MFT_ENUM_DATA_V1.LowUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LowUsn$set(MemorySegment seg, long index, long x) {
        MFT_ENUM_DATA_V1.LowUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HighUsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighUsn"));
    public static VarHandle HighUsn$VH() {
        return MFT_ENUM_DATA_V1.HighUsn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USN HighUsn;
     * }
     */
    public static long HighUsn$get(MemorySegment seg) {
        return (long)MFT_ENUM_DATA_V1.HighUsn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USN HighUsn;
     * }
     */
    public static void HighUsn$set(MemorySegment seg, long x) {
        MFT_ENUM_DATA_V1.HighUsn$VH.set(seg, x);
    }
    public static long HighUsn$get(MemorySegment seg, long index) {
        return (long)MFT_ENUM_DATA_V1.HighUsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HighUsn$set(MemorySegment seg, long index, long x) {
        MFT_ENUM_DATA_V1.HighUsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinMajorVersion"));
    public static VarHandle MinMajorVersion$VH() {
        return MFT_ENUM_DATA_V1.MinMajorVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinMajorVersion;
     * }
     */
    public static short MinMajorVersion$get(MemorySegment seg) {
        return (short)MFT_ENUM_DATA_V1.MinMajorVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinMajorVersion;
     * }
     */
    public static void MinMajorVersion$set(MemorySegment seg, short x) {
        MFT_ENUM_DATA_V1.MinMajorVersion$VH.set(seg, x);
    }
    public static short MinMajorVersion$get(MemorySegment seg, long index) {
        return (short)MFT_ENUM_DATA_V1.MinMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinMajorVersion$set(MemorySegment seg, long index, short x) {
        MFT_ENUM_DATA_V1.MinMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxMajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxMajorVersion"));
    public static VarHandle MaxMajorVersion$VH() {
        return MFT_ENUM_DATA_V1.MaxMajorVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MaxMajorVersion;
     * }
     */
    public static short MaxMajorVersion$get(MemorySegment seg) {
        return (short)MFT_ENUM_DATA_V1.MaxMajorVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MaxMajorVersion;
     * }
     */
    public static void MaxMajorVersion$set(MemorySegment seg, short x) {
        MFT_ENUM_DATA_V1.MaxMajorVersion$VH.set(seg, x);
    }
    public static short MaxMajorVersion$get(MemorySegment seg, long index) {
        return (short)MFT_ENUM_DATA_V1.MaxMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxMajorVersion$set(MemorySegment seg, long index, short x) {
        MFT_ENUM_DATA_V1.MaxMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


