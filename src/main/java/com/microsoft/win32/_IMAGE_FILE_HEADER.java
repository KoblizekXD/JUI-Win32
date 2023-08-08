// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_FILE_HEADER {
 *     WORD Machine;
 *     WORD NumberOfSections;
 *     DWORD TimeDateStamp;
 *     DWORD PointerToSymbolTable;
 *     DWORD NumberOfSymbols;
 *     WORD SizeOfOptionalHeader;
 *     WORD Characteristics;
 * };
 * }
 */
public class _IMAGE_FILE_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Machine"),
        Constants$root.C_SHORT$LAYOUT.withName("NumberOfSections"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        Constants$root.C_LONG$LAYOUT.withName("PointerToSymbolTable"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfSymbols"),
        Constants$root.C_SHORT$LAYOUT.withName("SizeOfOptionalHeader"),
        Constants$root.C_SHORT$LAYOUT.withName("Characteristics")
    ).withName("_IMAGE_FILE_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_FILE_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return _IMAGE_FILE_HEADER.Machine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static short Machine$get(MemorySegment seg) {
        return (short)_IMAGE_FILE_HEADER.Machine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static void Machine$set(MemorySegment seg, short x) {
        _IMAGE_FILE_HEADER.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)_IMAGE_FILE_HEADER.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        _IMAGE_FILE_HEADER.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfSections$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfSections"));
    public static VarHandle NumberOfSections$VH() {
        return _IMAGE_FILE_HEADER.NumberOfSections$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfSections;
     * }
     */
    public static short NumberOfSections$get(MemorySegment seg) {
        return (short)_IMAGE_FILE_HEADER.NumberOfSections$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfSections;
     * }
     */
    public static void NumberOfSections$set(MemorySegment seg, short x) {
        _IMAGE_FILE_HEADER.NumberOfSections$VH.set(seg, x);
    }
    public static short NumberOfSections$get(MemorySegment seg, long index) {
        return (short)_IMAGE_FILE_HEADER.NumberOfSections$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSections$set(MemorySegment seg, long index, short x) {
        _IMAGE_FILE_HEADER.NumberOfSections$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return _IMAGE_FILE_HEADER.TimeDateStamp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)_IMAGE_FILE_HEADER.TimeDateStamp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        _IMAGE_FILE_HEADER.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_FILE_HEADER.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        _IMAGE_FILE_HEADER.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PointerToSymbolTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToSymbolTable"));
    public static VarHandle PointerToSymbolTable$VH() {
        return _IMAGE_FILE_HEADER.PointerToSymbolTable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PointerToSymbolTable;
     * }
     */
    public static int PointerToSymbolTable$get(MemorySegment seg) {
        return (int)_IMAGE_FILE_HEADER.PointerToSymbolTable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PointerToSymbolTable;
     * }
     */
    public static void PointerToSymbolTable$set(MemorySegment seg, int x) {
        _IMAGE_FILE_HEADER.PointerToSymbolTable$VH.set(seg, x);
    }
    public static int PointerToSymbolTable$get(MemorySegment seg, long index) {
        return (int)_IMAGE_FILE_HEADER.PointerToSymbolTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToSymbolTable$set(MemorySegment seg, long index, int x) {
        _IMAGE_FILE_HEADER.PointerToSymbolTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfSymbols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfSymbols"));
    public static VarHandle NumberOfSymbols$VH() {
        return _IMAGE_FILE_HEADER.NumberOfSymbols$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfSymbols;
     * }
     */
    public static int NumberOfSymbols$get(MemorySegment seg) {
        return (int)_IMAGE_FILE_HEADER.NumberOfSymbols$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfSymbols;
     * }
     */
    public static void NumberOfSymbols$set(MemorySegment seg, int x) {
        _IMAGE_FILE_HEADER.NumberOfSymbols$VH.set(seg, x);
    }
    public static int NumberOfSymbols$get(MemorySegment seg, long index) {
        return (int)_IMAGE_FILE_HEADER.NumberOfSymbols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSymbols$set(MemorySegment seg, long index, int x) {
        _IMAGE_FILE_HEADER.NumberOfSymbols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfOptionalHeader$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfOptionalHeader"));
    public static VarHandle SizeOfOptionalHeader$VH() {
        return _IMAGE_FILE_HEADER.SizeOfOptionalHeader$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD SizeOfOptionalHeader;
     * }
     */
    public static short SizeOfOptionalHeader$get(MemorySegment seg) {
        return (short)_IMAGE_FILE_HEADER.SizeOfOptionalHeader$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD SizeOfOptionalHeader;
     * }
     */
    public static void SizeOfOptionalHeader$set(MemorySegment seg, short x) {
        _IMAGE_FILE_HEADER.SizeOfOptionalHeader$VH.set(seg, x);
    }
    public static short SizeOfOptionalHeader$get(MemorySegment seg, long index) {
        return (short)_IMAGE_FILE_HEADER.SizeOfOptionalHeader$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfOptionalHeader$set(MemorySegment seg, long index, short x) {
        _IMAGE_FILE_HEADER.SizeOfOptionalHeader$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Characteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Characteristics"));
    public static VarHandle Characteristics$VH() {
        return _IMAGE_FILE_HEADER.Characteristics$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Characteristics;
     * }
     */
    public static short Characteristics$get(MemorySegment seg) {
        return (short)_IMAGE_FILE_HEADER.Characteristics$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, short x) {
        _IMAGE_FILE_HEADER.Characteristics$VH.set(seg, x);
    }
    public static short Characteristics$get(MemorySegment seg, long index) {
        return (short)_IMAGE_FILE_HEADER.Characteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, short x) {
        _IMAGE_FILE_HEADER.Characteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


