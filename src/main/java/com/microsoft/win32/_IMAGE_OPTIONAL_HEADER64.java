// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_OPTIONAL_HEADER64 {
 *     WORD Magic;
 *     BYTE MajorLinkerVersion;
 *     BYTE MinorLinkerVersion;
 *     DWORD SizeOfCode;
 *     DWORD SizeOfInitializedData;
 *     DWORD SizeOfUninitializedData;
 *     DWORD AddressOfEntryPoint;
 *     DWORD BaseOfCode;
 *     ULONGLONG ImageBase;
 *     DWORD SectionAlignment;
 *     DWORD FileAlignment;
 *     WORD MajorOperatingSystemVersion;
 *     WORD MinorOperatingSystemVersion;
 *     WORD MajorImageVersion;
 *     WORD MinorImageVersion;
 *     WORD MajorSubsystemVersion;
 *     WORD MinorSubsystemVersion;
 *     DWORD Win32VersionValue;
 *     DWORD SizeOfImage;
 *     DWORD SizeOfHeaders;
 *     DWORD CheckSum;
 *     WORD Subsystem;
 *     WORD DllCharacteristics;
 *     ULONGLONG SizeOfStackReserve;
 *     ULONGLONG SizeOfStackCommit;
 *     ULONGLONG SizeOfHeapReserve;
 *     ULONGLONG SizeOfHeapCommit;
 *     DWORD LoaderFlags;
 *     DWORD NumberOfRvaAndSizes;
 *     IMAGE_DATA_DIRECTORY DataDirectory[16];
 * };
 * }
 */
public class _IMAGE_OPTIONAL_HEADER64 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("_IMAGE_OPTIONAL_HEADER64");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_OPTIONAL_HEADER64.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return _IMAGE_OPTIONAL_HEADER64.Magic$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Magic;
     * }
     */
    public static short Magic$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.Magic$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Magic;
     * }
     */
    public static void Magic$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.Magic$VH.set(seg, x);
    }
    public static short Magic$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.Magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorLinkerVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorLinkerVersion"));
    public static VarHandle MajorLinkerVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MajorLinkerVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE MajorLinkerVersion;
     * }
     */
    public static byte MajorLinkerVersion$get(MemorySegment seg) {
        return (byte)_IMAGE_OPTIONAL_HEADER64.MajorLinkerVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE MajorLinkerVersion;
     * }
     */
    public static void MajorLinkerVersion$set(MemorySegment seg, byte x) {
        _IMAGE_OPTIONAL_HEADER64.MajorLinkerVersion$VH.set(seg, x);
    }
    public static byte MajorLinkerVersion$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OPTIONAL_HEADER64.MajorLinkerVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorLinkerVersion$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OPTIONAL_HEADER64.MajorLinkerVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorLinkerVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorLinkerVersion"));
    public static VarHandle MinorLinkerVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MinorLinkerVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE MinorLinkerVersion;
     * }
     */
    public static byte MinorLinkerVersion$get(MemorySegment seg) {
        return (byte)_IMAGE_OPTIONAL_HEADER64.MinorLinkerVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE MinorLinkerVersion;
     * }
     */
    public static void MinorLinkerVersion$set(MemorySegment seg, byte x) {
        _IMAGE_OPTIONAL_HEADER64.MinorLinkerVersion$VH.set(seg, x);
    }
    public static byte MinorLinkerVersion$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OPTIONAL_HEADER64.MinorLinkerVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorLinkerVersion$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OPTIONAL_HEADER64.MinorLinkerVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfCode"));
    public static VarHandle SizeOfCode$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfCode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfCode;
     * }
     */
    public static int SizeOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfCode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfCode;
     * }
     */
    public static void SizeOfCode$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfCode$VH.set(seg, x);
    }
    public static int SizeOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfInitializedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfInitializedData"));
    public static VarHandle SizeOfInitializedData$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfInitializedData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfInitializedData;
     * }
     */
    public static int SizeOfInitializedData$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfInitializedData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfInitializedData;
     * }
     */
    public static void SizeOfInitializedData$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfInitializedData$VH.set(seg, x);
    }
    public static int SizeOfInitializedData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfInitializedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfInitializedData$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfInitializedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfUninitializedData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfUninitializedData"));
    public static VarHandle SizeOfUninitializedData$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfUninitializedData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfUninitializedData;
     * }
     */
    public static int SizeOfUninitializedData$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfUninitializedData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfUninitializedData;
     * }
     */
    public static void SizeOfUninitializedData$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfUninitializedData$VH.set(seg, x);
    }
    public static int SizeOfUninitializedData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfUninitializedData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfUninitializedData$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfUninitializedData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AddressOfEntryPoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddressOfEntryPoint"));
    public static VarHandle AddressOfEntryPoint$VH() {
        return _IMAGE_OPTIONAL_HEADER64.AddressOfEntryPoint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AddressOfEntryPoint;
     * }
     */
    public static int AddressOfEntryPoint$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.AddressOfEntryPoint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AddressOfEntryPoint;
     * }
     */
    public static void AddressOfEntryPoint$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.AddressOfEntryPoint$VH.set(seg, x);
    }
    public static int AddressOfEntryPoint$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.AddressOfEntryPoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddressOfEntryPoint$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.AddressOfEntryPoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseOfCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseOfCode"));
    public static VarHandle BaseOfCode$VH() {
        return _IMAGE_OPTIONAL_HEADER64.BaseOfCode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BaseOfCode;
     * }
     */
    public static int BaseOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.BaseOfCode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BaseOfCode;
     * }
     */
    public static void BaseOfCode$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.BaseOfCode$VH.set(seg, x);
    }
    public static int BaseOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.BaseOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.BaseOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImageBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImageBase"));
    public static VarHandle ImageBase$VH() {
        return _IMAGE_OPTIONAL_HEADER64.ImageBase$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG ImageBase;
     * }
     */
    public static long ImageBase$get(MemorySegment seg) {
        return (long)_IMAGE_OPTIONAL_HEADER64.ImageBase$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG ImageBase;
     * }
     */
    public static void ImageBase$set(MemorySegment seg, long x) {
        _IMAGE_OPTIONAL_HEADER64.ImageBase$VH.set(seg, x);
    }
    public static long ImageBase$get(MemorySegment seg, long index) {
        return (long)_IMAGE_OPTIONAL_HEADER64.ImageBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, long x) {
        _IMAGE_OPTIONAL_HEADER64.ImageBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SectionAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SectionAlignment"));
    public static VarHandle SectionAlignment$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SectionAlignment$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SectionAlignment;
     * }
     */
    public static int SectionAlignment$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SectionAlignment$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SectionAlignment;
     * }
     */
    public static void SectionAlignment$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.SectionAlignment$VH.set(seg, x);
    }
    public static int SectionAlignment$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SectionAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SectionAlignment$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.SectionAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileAlignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAlignment"));
    public static VarHandle FileAlignment$VH() {
        return _IMAGE_OPTIONAL_HEADER64.FileAlignment$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileAlignment;
     * }
     */
    public static int FileAlignment$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.FileAlignment$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileAlignment;
     * }
     */
    public static void FileAlignment$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.FileAlignment$VH.set(seg, x);
    }
    public static int FileAlignment$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.FileAlignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAlignment$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.FileAlignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorOperatingSystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorOperatingSystemVersion"));
    public static VarHandle MajorOperatingSystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MajorOperatingSystemVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MajorOperatingSystemVersion;
     * }
     */
    public static short MajorOperatingSystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MajorOperatingSystemVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MajorOperatingSystemVersion;
     * }
     */
    public static void MajorOperatingSystemVersion$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.MajorOperatingSystemVersion$VH.set(seg, x);
    }
    public static short MajorOperatingSystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MajorOperatingSystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorOperatingSystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.MajorOperatingSystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorOperatingSystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorOperatingSystemVersion"));
    public static VarHandle MinorOperatingSystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MinorOperatingSystemVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinorOperatingSystemVersion;
     * }
     */
    public static short MinorOperatingSystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MinorOperatingSystemVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinorOperatingSystemVersion;
     * }
     */
    public static void MinorOperatingSystemVersion$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.MinorOperatingSystemVersion$VH.set(seg, x);
    }
    public static short MinorOperatingSystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MinorOperatingSystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorOperatingSystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.MinorOperatingSystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorImageVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorImageVersion"));
    public static VarHandle MajorImageVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MajorImageVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MajorImageVersion;
     * }
     */
    public static short MajorImageVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MajorImageVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MajorImageVersion;
     * }
     */
    public static void MajorImageVersion$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.MajorImageVersion$VH.set(seg, x);
    }
    public static short MajorImageVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MajorImageVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorImageVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.MajorImageVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorImageVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorImageVersion"));
    public static VarHandle MinorImageVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MinorImageVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinorImageVersion;
     * }
     */
    public static short MinorImageVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MinorImageVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinorImageVersion;
     * }
     */
    public static void MinorImageVersion$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.MinorImageVersion$VH.set(seg, x);
    }
    public static short MinorImageVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MinorImageVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorImageVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.MinorImageVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MajorSubsystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorSubsystemVersion"));
    public static VarHandle MajorSubsystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MajorSubsystemVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MajorSubsystemVersion;
     * }
     */
    public static short MajorSubsystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MajorSubsystemVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MajorSubsystemVersion;
     * }
     */
    public static void MajorSubsystemVersion$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.MajorSubsystemVersion$VH.set(seg, x);
    }
    public static short MajorSubsystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MajorSubsystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorSubsystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.MajorSubsystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorSubsystemVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorSubsystemVersion"));
    public static VarHandle MinorSubsystemVersion$VH() {
        return _IMAGE_OPTIONAL_HEADER64.MinorSubsystemVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinorSubsystemVersion;
     * }
     */
    public static short MinorSubsystemVersion$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MinorSubsystemVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinorSubsystemVersion;
     * }
     */
    public static void MinorSubsystemVersion$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.MinorSubsystemVersion$VH.set(seg, x);
    }
    public static short MinorSubsystemVersion$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.MinorSubsystemVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorSubsystemVersion$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.MinorSubsystemVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Win32VersionValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Win32VersionValue"));
    public static VarHandle Win32VersionValue$VH() {
        return _IMAGE_OPTIONAL_HEADER64.Win32VersionValue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Win32VersionValue;
     * }
     */
    public static int Win32VersionValue$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.Win32VersionValue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Win32VersionValue;
     * }
     */
    public static void Win32VersionValue$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.Win32VersionValue$VH.set(seg, x);
    }
    public static int Win32VersionValue$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.Win32VersionValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Win32VersionValue$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.Win32VersionValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfImage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfImage"));
    public static VarHandle SizeOfImage$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfImage$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfImage;
     * }
     */
    public static int SizeOfImage$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfImage$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfImage;
     * }
     */
    public static void SizeOfImage$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfImage$VH.set(seg, x);
    }
    public static int SizeOfImage$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfImage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfImage$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfImage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfHeaders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfHeaders"));
    public static VarHandle SizeOfHeaders$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfHeaders$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfHeaders;
     * }
     */
    public static int SizeOfHeaders$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfHeaders$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfHeaders;
     * }
     */
    public static void SizeOfHeaders$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfHeaders$VH.set(seg, x);
    }
    public static int SizeOfHeaders$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.SizeOfHeaders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfHeaders$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfHeaders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CheckSum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
    public static VarHandle CheckSum$VH() {
        return _IMAGE_OPTIONAL_HEADER64.CheckSum$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CheckSum;
     * }
     */
    public static int CheckSum$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.CheckSum$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CheckSum;
     * }
     */
    public static void CheckSum$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.CheckSum$VH.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.CheckSum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Subsystem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Subsystem"));
    public static VarHandle Subsystem$VH() {
        return _IMAGE_OPTIONAL_HEADER64.Subsystem$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Subsystem;
     * }
     */
    public static short Subsystem$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.Subsystem$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Subsystem;
     * }
     */
    public static void Subsystem$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.Subsystem$VH.set(seg, x);
    }
    public static short Subsystem$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.Subsystem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Subsystem$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.Subsystem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DllCharacteristics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DllCharacteristics"));
    public static VarHandle DllCharacteristics$VH() {
        return _IMAGE_OPTIONAL_HEADER64.DllCharacteristics$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD DllCharacteristics;
     * }
     */
    public static short DllCharacteristics$get(MemorySegment seg) {
        return (short)_IMAGE_OPTIONAL_HEADER64.DllCharacteristics$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD DllCharacteristics;
     * }
     */
    public static void DllCharacteristics$set(MemorySegment seg, short x) {
        _IMAGE_OPTIONAL_HEADER64.DllCharacteristics$VH.set(seg, x);
    }
    public static short DllCharacteristics$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OPTIONAL_HEADER64.DllCharacteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DllCharacteristics$set(MemorySegment seg, long index, short x) {
        _IMAGE_OPTIONAL_HEADER64.DllCharacteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfStackReserve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfStackReserve"));
    public static VarHandle SizeOfStackReserve$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfStackReserve$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG SizeOfStackReserve;
     * }
     */
    public static long SizeOfStackReserve$get(MemorySegment seg) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfStackReserve$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG SizeOfStackReserve;
     * }
     */
    public static void SizeOfStackReserve$set(MemorySegment seg, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfStackReserve$VH.set(seg, x);
    }
    public static long SizeOfStackReserve$get(MemorySegment seg, long index) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfStackReserve$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfStackReserve$set(MemorySegment seg, long index, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfStackReserve$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfStackCommit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfStackCommit"));
    public static VarHandle SizeOfStackCommit$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfStackCommit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG SizeOfStackCommit;
     * }
     */
    public static long SizeOfStackCommit$get(MemorySegment seg) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfStackCommit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG SizeOfStackCommit;
     * }
     */
    public static void SizeOfStackCommit$set(MemorySegment seg, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfStackCommit$VH.set(seg, x);
    }
    public static long SizeOfStackCommit$get(MemorySegment seg, long index) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfStackCommit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfStackCommit$set(MemorySegment seg, long index, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfStackCommit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfHeapReserve$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfHeapReserve"));
    public static VarHandle SizeOfHeapReserve$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfHeapReserve$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG SizeOfHeapReserve;
     * }
     */
    public static long SizeOfHeapReserve$get(MemorySegment seg) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfHeapReserve$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG SizeOfHeapReserve;
     * }
     */
    public static void SizeOfHeapReserve$set(MemorySegment seg, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfHeapReserve$VH.set(seg, x);
    }
    public static long SizeOfHeapReserve$get(MemorySegment seg, long index) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfHeapReserve$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfHeapReserve$set(MemorySegment seg, long index, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfHeapReserve$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfHeapCommit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfHeapCommit"));
    public static VarHandle SizeOfHeapCommit$VH() {
        return _IMAGE_OPTIONAL_HEADER64.SizeOfHeapCommit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG SizeOfHeapCommit;
     * }
     */
    public static long SizeOfHeapCommit$get(MemorySegment seg) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfHeapCommit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG SizeOfHeapCommit;
     * }
     */
    public static void SizeOfHeapCommit$set(MemorySegment seg, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfHeapCommit$VH.set(seg, x);
    }
    public static long SizeOfHeapCommit$get(MemorySegment seg, long index) {
        return (long)_IMAGE_OPTIONAL_HEADER64.SizeOfHeapCommit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfHeapCommit$set(MemorySegment seg, long index, long x) {
        _IMAGE_OPTIONAL_HEADER64.SizeOfHeapCommit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LoaderFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LoaderFlags"));
    public static VarHandle LoaderFlags$VH() {
        return _IMAGE_OPTIONAL_HEADER64.LoaderFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LoaderFlags;
     * }
     */
    public static int LoaderFlags$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.LoaderFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LoaderFlags;
     * }
     */
    public static void LoaderFlags$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.LoaderFlags$VH.set(seg, x);
    }
    public static int LoaderFlags$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.LoaderFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LoaderFlags$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.LoaderFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfRvaAndSizes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfRvaAndSizes"));
    public static VarHandle NumberOfRvaAndSizes$VH() {
        return _IMAGE_OPTIONAL_HEADER64.NumberOfRvaAndSizes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfRvaAndSizes;
     * }
     */
    public static int NumberOfRvaAndSizes$get(MemorySegment seg) {
        return (int)_IMAGE_OPTIONAL_HEADER64.NumberOfRvaAndSizes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfRvaAndSizes;
     * }
     */
    public static void NumberOfRvaAndSizes$set(MemorySegment seg, int x) {
        _IMAGE_OPTIONAL_HEADER64.NumberOfRvaAndSizes$VH.set(seg, x);
    }
    public static int NumberOfRvaAndSizes$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OPTIONAL_HEADER64.NumberOfRvaAndSizes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRvaAndSizes$set(MemorySegment seg, long index, int x) {
        _IMAGE_OPTIONAL_HEADER64.NumberOfRvaAndSizes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DataDirectory$slice(MemorySegment seg) {
        return seg.asSlice(112, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

