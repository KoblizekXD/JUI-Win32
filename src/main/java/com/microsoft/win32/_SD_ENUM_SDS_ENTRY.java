// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SD_ENUM_SDS_ENTRY {
 *     DWORD Hash;
 *     DWORD SecurityId;
 *     DWORDLONG Offset;
 *     DWORD Length;
 *     BYTE Descriptor[1];
 * };
 * }
 */
public class _SD_ENUM_SDS_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Hash"),
        Constants$root.C_LONG$LAYOUT.withName("SecurityId"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Offset"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Descriptor"),
        MemoryLayout.paddingLayout(24)
    ).withName("_SD_ENUM_SDS_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _SD_ENUM_SDS_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Hash$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hash"));
    public static VarHandle Hash$VH() {
        return _SD_ENUM_SDS_ENTRY.Hash$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Hash;
     * }
     */
    public static int Hash$get(MemorySegment seg) {
        return (int)_SD_ENUM_SDS_ENTRY.Hash$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Hash;
     * }
     */
    public static void Hash$set(MemorySegment seg, int x) {
        _SD_ENUM_SDS_ENTRY.Hash$VH.set(seg, x);
    }
    public static int Hash$get(MemorySegment seg, long index) {
        return (int)_SD_ENUM_SDS_ENTRY.Hash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hash$set(MemorySegment seg, long index, int x) {
        _SD_ENUM_SDS_ENTRY.Hash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityId"));
    public static VarHandle SecurityId$VH() {
        return _SD_ENUM_SDS_ENTRY.SecurityId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SecurityId;
     * }
     */
    public static int SecurityId$get(MemorySegment seg) {
        return (int)_SD_ENUM_SDS_ENTRY.SecurityId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SecurityId;
     * }
     */
    public static void SecurityId$set(MemorySegment seg, int x) {
        _SD_ENUM_SDS_ENTRY.SecurityId$VH.set(seg, x);
    }
    public static int SecurityId$get(MemorySegment seg, long index) {
        return (int)_SD_ENUM_SDS_ENTRY.SecurityId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityId$set(MemorySegment seg, long index, int x) {
        _SD_ENUM_SDS_ENTRY.SecurityId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _SD_ENUM_SDS_ENTRY.Offset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG Offset;
     * }
     */
    public static long Offset$get(MemorySegment seg) {
        return (long)_SD_ENUM_SDS_ENTRY.Offset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG Offset;
     * }
     */
    public static void Offset$set(MemorySegment seg, long x) {
        _SD_ENUM_SDS_ENTRY.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_SD_ENUM_SDS_ENTRY.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _SD_ENUM_SDS_ENTRY.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _SD_ENUM_SDS_ENTRY.Length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static int Length$get(MemorySegment seg) {
        return (int)_SD_ENUM_SDS_ENTRY.Length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static void Length$set(MemorySegment seg, int x) {
        _SD_ENUM_SDS_ENTRY.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_SD_ENUM_SDS_ENTRY.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _SD_ENUM_SDS_ENTRY.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Descriptor$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


