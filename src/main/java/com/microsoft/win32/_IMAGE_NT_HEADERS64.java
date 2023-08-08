// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_NT_HEADERS64 {
 *     DWORD Signature;
 *     IMAGE_FILE_HEADER FileHeader;
 *     IMAGE_OPTIONAL_HEADER64 OptionalHeader;
 * };
 * }
 */
public class _IMAGE_NT_HEADERS64 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Signature"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Machine"),
            Constants$root.C_SHORT$LAYOUT.withName("NumberOfSections"),
            Constants$root.C_LONG$LAYOUT.withName("TimeDateStamp"),
            Constants$root.C_LONG$LAYOUT.withName("PointerToSymbolTable"),
            Constants$root.C_LONG$LAYOUT.withName("NumberOfSymbols"),
            Constants$root.C_SHORT$LAYOUT.withName("SizeOfOptionalHeader"),
            Constants$root.C_SHORT$LAYOUT.withName("Characteristics")
        ).withName("FileHeader"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Magic"),
            Constants$root.C_CHAR$LAYOUT.withName("MajorLinkerVersion"),
            Constants$root.C_CHAR$LAYOUT.withName("MinorLinkerVersion"),
            Constants$root.C_LONG$LAYOUT.withName("SizeOfCode"),
            Constants$root.C_LONG$LAYOUT.withName("SizeOfInitializedData"),
            Constants$root.C_LONG$LAYOUT.withName("SizeOfUninitializedData"),
            Constants$root.C_LONG$LAYOUT.withName("AddressOfEntryPoint"),
            Constants$root.C_LONG$LAYOUT.withName("BaseOfCode"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ImageBase"),
            Constants$root.C_LONG$LAYOUT.withName("SectionAlignment"),
            Constants$root.C_LONG$LAYOUT.withName("FileAlignment"),
            Constants$root.C_SHORT$LAYOUT.withName("MajorOperatingSystemVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MinorOperatingSystemVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MajorImageVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MinorImageVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MajorSubsystemVersion"),
            Constants$root.C_SHORT$LAYOUT.withName("MinorSubsystemVersion"),
            Constants$root.C_LONG$LAYOUT.withName("Win32VersionValue"),
            Constants$root.C_LONG$LAYOUT.withName("SizeOfImage"),
            Constants$root.C_LONG$LAYOUT.withName("SizeOfHeaders"),
            Constants$root.C_LONG$LAYOUT.withName("CheckSum"),
            Constants$root.C_SHORT$LAYOUT.withName("Subsystem"),
            Constants$root.C_SHORT$LAYOUT.withName("DllCharacteristics"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("SizeOfStackReserve"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("SizeOfStackCommit"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("SizeOfHeapReserve"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("SizeOfHeapCommit"),
            Constants$root.C_LONG$LAYOUT.withName("LoaderFlags"),
            Constants$root.C_LONG$LAYOUT.withName("NumberOfRvaAndSizes"),
            MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("VirtualAddress"),
                Constants$root.C_LONG$LAYOUT.withName("Size")
            ).withName("_IMAGE_DATA_DIRECTORY")).withName("DataDirectory")
        ).withName("OptionalHeader")
    ).withName("_IMAGE_NT_HEADERS64");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_NT_HEADERS64.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return _IMAGE_NT_HEADERS64.Signature$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Signature;
     * }
     */
    public static int Signature$get(MemorySegment seg) {
        return (int)_IMAGE_NT_HEADERS64.Signature$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Signature;
     * }
     */
    public static void Signature$set(MemorySegment seg, int x) {
        _IMAGE_NT_HEADERS64.Signature$VH.set(seg, x);
    }
    public static int Signature$get(MemorySegment seg, long index) {
        return (int)_IMAGE_NT_HEADERS64.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, int x) {
        _IMAGE_NT_HEADERS64.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileHeader$slice(MemorySegment seg) {
        return seg.asSlice(4, 20);
    }
    public static MemorySegment OptionalHeader$slice(MemorySegment seg) {
        return seg.asSlice(24, 240);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


