// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILESYSTEM_STATISTICS {
 *     WORD FileSystemType;
 *     WORD Version;
 *     DWORD SizeOfCompleteStructure;
 *     DWORD UserFileReads;
 *     DWORD UserFileReadBytes;
 *     DWORD UserDiskReads;
 *     DWORD UserFileWrites;
 *     DWORD UserFileWriteBytes;
 *     DWORD UserDiskWrites;
 *     DWORD MetaDataReads;
 *     DWORD MetaDataReadBytes;
 *     DWORD MetaDataDiskReads;
 *     DWORD MetaDataWrites;
 *     DWORD MetaDataWriteBytes;
 *     DWORD MetaDataDiskWrites;
 * };
 * }
 */
public class _FILESYSTEM_STATISTICS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("FileSystemType"),
        Constants$root.C_SHORT$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("SizeOfCompleteStructure"),
        Constants$root.C_LONG$LAYOUT.withName("UserFileReads"),
        Constants$root.C_LONG$LAYOUT.withName("UserFileReadBytes"),
        Constants$root.C_LONG$LAYOUT.withName("UserDiskReads"),
        Constants$root.C_LONG$LAYOUT.withName("UserFileWrites"),
        Constants$root.C_LONG$LAYOUT.withName("UserFileWriteBytes"),
        Constants$root.C_LONG$LAYOUT.withName("UserDiskWrites"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataReads"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataReadBytes"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataDiskReads"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataWrites"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataWriteBytes"),
        Constants$root.C_LONG$LAYOUT.withName("MetaDataDiskWrites")
    ).withName("_FILESYSTEM_STATISTICS");
    public static MemoryLayout $LAYOUT() {
        return _FILESYSTEM_STATISTICS.$struct$LAYOUT;
    }
    static final VarHandle FileSystemType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileSystemType"));
    public static VarHandle FileSystemType$VH() {
        return _FILESYSTEM_STATISTICS.FileSystemType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FileSystemType;
     * }
     */
    public static short FileSystemType$get(MemorySegment seg) {
        return (short)_FILESYSTEM_STATISTICS.FileSystemType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FileSystemType;
     * }
     */
    public static void FileSystemType$set(MemorySegment seg, short x) {
        _FILESYSTEM_STATISTICS.FileSystemType$VH.set(seg, x);
    }
    public static short FileSystemType$get(MemorySegment seg, long index) {
        return (short)_FILESYSTEM_STATISTICS.FileSystemType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileSystemType$set(MemorySegment seg, long index, short x) {
        _FILESYSTEM_STATISTICS.FileSystemType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _FILESYSTEM_STATISTICS.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)_FILESYSTEM_STATISTICS.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        _FILESYSTEM_STATISTICS.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)_FILESYSTEM_STATISTICS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        _FILESYSTEM_STATISTICS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfCompleteStructure$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfCompleteStructure"));
    public static VarHandle SizeOfCompleteStructure$VH() {
        return _FILESYSTEM_STATISTICS.SizeOfCompleteStructure$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfCompleteStructure;
     * }
     */
    public static int SizeOfCompleteStructure$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.SizeOfCompleteStructure$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfCompleteStructure;
     * }
     */
    public static void SizeOfCompleteStructure$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.SizeOfCompleteStructure$VH.set(seg, x);
    }
    public static int SizeOfCompleteStructure$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.SizeOfCompleteStructure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfCompleteStructure$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.SizeOfCompleteStructure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserFileReads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserFileReads"));
    public static VarHandle UserFileReads$VH() {
        return _FILESYSTEM_STATISTICS.UserFileReads$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UserFileReads;
     * }
     */
    public static int UserFileReads$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.UserFileReads$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UserFileReads;
     * }
     */
    public static void UserFileReads$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.UserFileReads$VH.set(seg, x);
    }
    public static int UserFileReads$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.UserFileReads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileReads$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.UserFileReads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserFileReadBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserFileReadBytes"));
    public static VarHandle UserFileReadBytes$VH() {
        return _FILESYSTEM_STATISTICS.UserFileReadBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UserFileReadBytes;
     * }
     */
    public static int UserFileReadBytes$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.UserFileReadBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UserFileReadBytes;
     * }
     */
    public static void UserFileReadBytes$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.UserFileReadBytes$VH.set(seg, x);
    }
    public static int UserFileReadBytes$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.UserFileReadBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileReadBytes$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.UserFileReadBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserDiskReads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserDiskReads"));
    public static VarHandle UserDiskReads$VH() {
        return _FILESYSTEM_STATISTICS.UserDiskReads$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UserDiskReads;
     * }
     */
    public static int UserDiskReads$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.UserDiskReads$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UserDiskReads;
     * }
     */
    public static void UserDiskReads$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.UserDiskReads$VH.set(seg, x);
    }
    public static int UserDiskReads$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.UserDiskReads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserDiskReads$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.UserDiskReads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserFileWrites$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserFileWrites"));
    public static VarHandle UserFileWrites$VH() {
        return _FILESYSTEM_STATISTICS.UserFileWrites$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UserFileWrites;
     * }
     */
    public static int UserFileWrites$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.UserFileWrites$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UserFileWrites;
     * }
     */
    public static void UserFileWrites$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.UserFileWrites$VH.set(seg, x);
    }
    public static int UserFileWrites$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.UserFileWrites$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileWrites$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.UserFileWrites$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserFileWriteBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserFileWriteBytes"));
    public static VarHandle UserFileWriteBytes$VH() {
        return _FILESYSTEM_STATISTICS.UserFileWriteBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UserFileWriteBytes;
     * }
     */
    public static int UserFileWriteBytes$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.UserFileWriteBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UserFileWriteBytes;
     * }
     */
    public static void UserFileWriteBytes$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.UserFileWriteBytes$VH.set(seg, x);
    }
    public static int UserFileWriteBytes$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.UserFileWriteBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileWriteBytes$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.UserFileWriteBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UserDiskWrites$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UserDiskWrites"));
    public static VarHandle UserDiskWrites$VH() {
        return _FILESYSTEM_STATISTICS.UserDiskWrites$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UserDiskWrites;
     * }
     */
    public static int UserDiskWrites$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.UserDiskWrites$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UserDiskWrites;
     * }
     */
    public static void UserDiskWrites$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.UserDiskWrites$VH.set(seg, x);
    }
    public static int UserDiskWrites$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.UserDiskWrites$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserDiskWrites$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.UserDiskWrites$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataReads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataReads"));
    public static VarHandle MetaDataReads$VH() {
        return _FILESYSTEM_STATISTICS.MetaDataReads$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataReads;
     * }
     */
    public static int MetaDataReads$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataReads$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataReads;
     * }
     */
    public static void MetaDataReads$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.MetaDataReads$VH.set(seg, x);
    }
    public static int MetaDataReads$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataReads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataReads$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.MetaDataReads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataReadBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataReadBytes"));
    public static VarHandle MetaDataReadBytes$VH() {
        return _FILESYSTEM_STATISTICS.MetaDataReadBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataReadBytes;
     * }
     */
    public static int MetaDataReadBytes$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataReadBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataReadBytes;
     * }
     */
    public static void MetaDataReadBytes$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.MetaDataReadBytes$VH.set(seg, x);
    }
    public static int MetaDataReadBytes$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataReadBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataReadBytes$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.MetaDataReadBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataDiskReads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataDiskReads"));
    public static VarHandle MetaDataDiskReads$VH() {
        return _FILESYSTEM_STATISTICS.MetaDataDiskReads$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataDiskReads;
     * }
     */
    public static int MetaDataDiskReads$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataDiskReads$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataDiskReads;
     * }
     */
    public static void MetaDataDiskReads$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.MetaDataDiskReads$VH.set(seg, x);
    }
    public static int MetaDataDiskReads$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataDiskReads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataDiskReads$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.MetaDataDiskReads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataWrites$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataWrites"));
    public static VarHandle MetaDataWrites$VH() {
        return _FILESYSTEM_STATISTICS.MetaDataWrites$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataWrites;
     * }
     */
    public static int MetaDataWrites$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataWrites$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataWrites;
     * }
     */
    public static void MetaDataWrites$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.MetaDataWrites$VH.set(seg, x);
    }
    public static int MetaDataWrites$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataWrites$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataWrites$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.MetaDataWrites$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataWriteBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataWriteBytes"));
    public static VarHandle MetaDataWriteBytes$VH() {
        return _FILESYSTEM_STATISTICS.MetaDataWriteBytes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataWriteBytes;
     * }
     */
    public static int MetaDataWriteBytes$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataWriteBytes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataWriteBytes;
     * }
     */
    public static void MetaDataWriteBytes$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.MetaDataWriteBytes$VH.set(seg, x);
    }
    public static int MetaDataWriteBytes$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataWriteBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataWriteBytes$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.MetaDataWriteBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MetaDataDiskWrites$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MetaDataDiskWrites"));
    public static VarHandle MetaDataDiskWrites$VH() {
        return _FILESYSTEM_STATISTICS.MetaDataDiskWrites$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MetaDataDiskWrites;
     * }
     */
    public static int MetaDataDiskWrites$get(MemorySegment seg) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataDiskWrites$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MetaDataDiskWrites;
     * }
     */
    public static void MetaDataDiskWrites$set(MemorySegment seg, int x) {
        _FILESYSTEM_STATISTICS.MetaDataDiskWrites$VH.set(seg, x);
    }
    public static int MetaDataDiskWrites$get(MemorySegment seg, long index) {
        return (int)_FILESYSTEM_STATISTICS.MetaDataDiskWrites$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataDiskWrites$set(MemorySegment seg, long index, int x) {
        _FILESYSTEM_STATISTICS.MetaDataDiskWrites$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


