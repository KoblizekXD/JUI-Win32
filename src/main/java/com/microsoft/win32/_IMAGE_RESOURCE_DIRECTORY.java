// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_RESOURCE_DIRECTORY {
 *     DWORD Characteristics;
 *     DWORD TimeDateStamp;
 *     WORD MajorVersion;
 *     WORD MinorVersion;
 *     WORD NumberOfNamedEntries;
 *     WORD NumberOfIdEntries;
 * };
 * }
 */
public class _IMAGE_RESOURCE_DIRECTORY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Characteristics"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfNamedEntries"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfIdEntries")
    ).withName("_IMAGE_RESOURCE_DIRECTORY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_RESOURCE_DIRECTORY.$struct$LAYOUT;
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.Characteristics$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static int Characteristics$get(MemorySegment seg) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, int x) {
        _IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.set(seg, x);
    }
    public static int Characteristics$get(MemorySegment seg, long index) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, int x) {
        _IMAGE_RESOURCE_DIRECTORY.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        _IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_RESOURCE_DIRECTORY.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MajorVersion;
     * }
     */
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MajorVersion;
     * }
     */
    public static void MajorVersion$set(MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinorVersion;
     * }
     */
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinorVersion;
     * }
     */
    public static void MinorVersion$set(MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfNamedEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfNamedEntries"));
    public static VarHandle NumberOfNamedEntries$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfNamedEntries;
     * }
     */
    public static short NumberOfNamedEntries$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfNamedEntries;
     * }
     */
    public static void NumberOfNamedEntries$set(MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.set(seg, x);
    }
    public static short NumberOfNamedEntries$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfNamedEntries$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfNamedEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfIdEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfIdEntries"));
    public static VarHandle NumberOfIdEntries$VH() {
        return _IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfIdEntries;
     * }
     */
    public static short NumberOfIdEntries$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfIdEntries;
     * }
     */
    public static void NumberOfIdEntries$set(MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.set(seg, x);
    }
    public static short NumberOfIdEntries$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfIdEntries$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY.NumberOfIdEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


