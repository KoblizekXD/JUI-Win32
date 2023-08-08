// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER {
 *     LARGE_INTEGER DirectoryCount;
 *     LARGE_INTEGER FileCount;
 *     WORD FsFormatMajVersion;
 *     WORD FsFormatMinVersion;
 *     WCHAR FsFormatName[12];
 *     LARGE_INTEGER FormatTime;
 *     LARGE_INTEGER LastUpdateTime;
 *     WCHAR CopyrightInfo[34];
 *     WCHAR AbstractInfo[34];
 *     WCHAR FormattingImplementationInfo[34];
 *     WCHAR LastModifyingImplementationInfo[34];
 * };
 * }
 */
public class _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("DirectoryCount"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("FileCount"),
        Constants$root.C_SHORT$LAYOUT.withName("FsFormatMajVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("FsFormatMinVersion"),
        MemoryLayout.sequenceLayout(12, Constants$root.C_SHORT$LAYOUT).withName("FsFormatName"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("FormatTime"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("LastUpdateTime"),
        MemoryLayout.sequenceLayout(34, Constants$root.C_SHORT$LAYOUT).withName("CopyrightInfo"),
        MemoryLayout.sequenceLayout(34, Constants$root.C_SHORT$LAYOUT).withName("AbstractInfo"),
        MemoryLayout.sequenceLayout(34, Constants$root.C_SHORT$LAYOUT).withName("FormattingImplementationInfo"),
        MemoryLayout.sequenceLayout(34, Constants$root.C_SHORT$LAYOUT).withName("LastModifyingImplementationInfo")
    ).withName("_FILE_QUERY_ON_DISK_VOL_INFO_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.$struct$LAYOUT;
    }
    public static MemorySegment DirectoryCount$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment FileCount$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle FsFormatMajVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FsFormatMajVersion"));
    public static VarHandle FsFormatMajVersion$VH() {
        return _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMajVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FsFormatMajVersion;
     * }
     */
    public static short FsFormatMajVersion$get(MemorySegment seg) {
        return (short)_FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMajVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FsFormatMajVersion;
     * }
     */
    public static void FsFormatMajVersion$set(MemorySegment seg, short x) {
        _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMajVersion$VH.set(seg, x);
    }
    public static short FsFormatMajVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMajVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FsFormatMajVersion$set(MemorySegment seg, long index, short x) {
        _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMajVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FsFormatMinVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FsFormatMinVersion"));
    public static VarHandle FsFormatMinVersion$VH() {
        return _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMinVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FsFormatMinVersion;
     * }
     */
    public static short FsFormatMinVersion$get(MemorySegment seg) {
        return (short)_FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMinVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FsFormatMinVersion;
     * }
     */
    public static void FsFormatMinVersion$set(MemorySegment seg, short x) {
        _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMinVersion$VH.set(seg, x);
    }
    public static short FsFormatMinVersion$get(MemorySegment seg, long index) {
        return (short)_FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMinVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FsFormatMinVersion$set(MemorySegment seg, long index, short x) {
        _FILE_QUERY_ON_DISK_VOL_INFO_BUFFER.FsFormatMinVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FsFormatName$slice(MemorySegment seg) {
        return seg.asSlice(20, 24);
    }
    public static MemorySegment FormatTime$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static MemorySegment LastUpdateTime$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
    }
    public static MemorySegment CopyrightInfo$slice(MemorySegment seg) {
        return seg.asSlice(64, 68);
    }
    public static MemorySegment AbstractInfo$slice(MemorySegment seg) {
        return seg.asSlice(132, 68);
    }
    public static MemorySegment FormattingImplementationInfo$slice(MemorySegment seg) {
        return seg.asSlice(200, 68);
    }
    public static MemorySegment LastModifyingImplementationInfo$slice(MemorySegment seg) {
        return seg.asSlice(268, 68);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


