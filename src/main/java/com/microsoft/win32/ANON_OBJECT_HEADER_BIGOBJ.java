// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ANON_OBJECT_HEADER_BIGOBJ {
 *     WORD Sig1;
 *     WORD Sig2;
 *     WORD Version;
 *     WORD Machine;
 *     DWORD TimeDateStamp;
 *     CLSID ClassID;
 *     DWORD SizeOfData;
 *     DWORD Flags;
 *     DWORD MetaDataSize;
 *     DWORD MetaDataOffset;
 *     DWORD NumberOfSections;
 *     DWORD PointerToSymbolTable;
 *     DWORD NumberOfSymbols;
 * };
 * }
 */
public class ANON_OBJECT_HEADER_BIGOBJ {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Sig1"),
        Constants$root.C_SHORT$LAYOUT.withName("Sig2"),
        Constants$root.C_SHORT$LAYOUT.withName("Version"),
        Constants$root.C_SHORT$LAYOUT.withName("Machine"),
        Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ClassID"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfData"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataSize"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataOffset"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfSections"),
        Constants$root.C_LONG$LAYOUT.withName("PointerToSymbolTable"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfSymbols")
    ).withName("ANON_OBJECT_HEADER_BIGOBJ");
    public static MemoryLayout $LAYOUT() {
        return ANON_OBJECT_HEADER_BIGOBJ.$struct$LAYOUT;
    }
    static final VarHandle Sig1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sig1"));
    public static VarHandle Sig1$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.Sig1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Sig1;
     * }
     */
    public static short Sig1$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Sig1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Sig1;
     * }
     */
    public static void Sig1$set(MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Sig1$VH.set(seg, x);
    }
    public static short Sig1$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Sig1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig1$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Sig1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sig2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sig2"));
    public static VarHandle Sig2$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.Sig2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Sig2;
     * }
     */
    public static short Sig2$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Sig2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Sig2;
     * }
     */
    public static void Sig2$set(MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Sig2$VH.set(seg, x);
    }
    public static short Sig2$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Sig2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig2$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Sig2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.Machine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static short Machine$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Machine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static void Machine$set(MemorySegment seg, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER_BIGOBJ.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER_BIGOBJ.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.TimeDateStamp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.TimeDateStamp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ClassID$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    static final VarHandle SizeOfData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfData"));
    public static VarHandle SizeOfData$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.SizeOfData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfData;
     * }
     */
    public static int SizeOfData$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.SizeOfData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfData;
     * }
     */
    public static void SizeOfData$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.SizeOfData$VH.set(seg, x);
    }
    public static int SizeOfData$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.SizeOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfData$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.SizeOfData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataSize"));
    public static VarHandle MetaDataSize$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.MetaDataSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataSize;
     * }
     */
    public static int MetaDataSize$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.MetaDataSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataSize;
     * }
     */
    public static void MetaDataSize$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.MetaDataSize$VH.set(seg, x);
    }
    public static int MetaDataSize$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.MetaDataSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataSize$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.MetaDataSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataOffset"));
    public static VarHandle MetaDataOffset$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.MetaDataOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataOffset;
     * }
     */
    public static int MetaDataOffset$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.MetaDataOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataOffset;
     * }
     */
    public static void MetaDataOffset$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.MetaDataOffset$VH.set(seg, x);
    }
    public static int MetaDataOffset$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.MetaDataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataOffset$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.MetaDataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfSections$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfSections"));
    public static VarHandle NumberOfSections$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.NumberOfSections$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfSections;
     * }
     */
    public static int NumberOfSections$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.NumberOfSections$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfSections;
     * }
     */
    public static void NumberOfSections$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.NumberOfSections$VH.set(seg, x);
    }
    public static int NumberOfSections$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.NumberOfSections$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSections$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.NumberOfSections$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PointerToSymbolTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PointerToSymbolTable"));
    public static VarHandle PointerToSymbolTable$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.PointerToSymbolTable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PointerToSymbolTable;
     * }
     */
    public static int PointerToSymbolTable$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.PointerToSymbolTable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PointerToSymbolTable;
     * }
     */
    public static void PointerToSymbolTable$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.PointerToSymbolTable$VH.set(seg, x);
    }
    public static int PointerToSymbolTable$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.PointerToSymbolTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PointerToSymbolTable$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.PointerToSymbolTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfSymbols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfSymbols"));
    public static VarHandle NumberOfSymbols$VH() {
        return ANON_OBJECT_HEADER_BIGOBJ.NumberOfSymbols$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfSymbols;
     * }
     */
    public static int NumberOfSymbols$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.NumberOfSymbols$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfSymbols;
     * }
     */
    public static void NumberOfSymbols$set(MemorySegment seg, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.NumberOfSymbols$VH.set(seg, x);
    }
    public static int NumberOfSymbols$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER_BIGOBJ.NumberOfSymbols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSymbols$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER_BIGOBJ.NumberOfSymbols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


