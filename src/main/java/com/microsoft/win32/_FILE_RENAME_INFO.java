// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_RENAME_INFO {
 *     union {
 *         BOOLEAN ReplaceIfExists;
 *         DWORD Flags;
 *     };
 *     HANDLE RootDirectory;
 *     DWORD FileNameLength;
 *     WCHAR FileName[1];
 * };
 * }
 */
public class _FILE_RENAME_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_CHAR$LAYOUT.withName("ReplaceIfExists"),
            Constants$root.C_LONG$LAYOUT.withName("Flags")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("RootDirectory"),
        Constants$root.C_LONG$LAYOUT.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_RENAME_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_RENAME_INFO.$struct$LAYOUT;
    }
    static final VarHandle ReplaceIfExists$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("ReplaceIfExists"));
    public static VarHandle ReplaceIfExists$VH() {
        return _FILE_RENAME_INFO.ReplaceIfExists$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN ReplaceIfExists;
     * }
     */
    public static byte ReplaceIfExists$get(MemorySegment seg) {
        return (byte)_FILE_RENAME_INFO.ReplaceIfExists$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN ReplaceIfExists;
     * }
     */
    public static void ReplaceIfExists$set(MemorySegment seg, byte x) {
        _FILE_RENAME_INFO.ReplaceIfExists$VH.set(seg, x);
    }
    public static byte ReplaceIfExists$get(MemorySegment seg, long index) {
        return (byte)_FILE_RENAME_INFO.ReplaceIfExists$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReplaceIfExists$set(MemorySegment seg, long index, byte x) {
        _FILE_RENAME_INFO.ReplaceIfExists$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FILE_RENAME_INFO.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_FILE_RENAME_INFO.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _FILE_RENAME_INFO.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FILE_RENAME_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FILE_RENAME_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RootDirectory$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RootDirectory"));
    public static VarHandle RootDirectory$VH() {
        return _FILE_RENAME_INFO.RootDirectory$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE RootDirectory;
     * }
     */
    public static MemorySegment RootDirectory$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_FILE_RENAME_INFO.RootDirectory$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE RootDirectory;
     * }
     */
    public static void RootDirectory$set(MemorySegment seg, MemorySegment x) {
        _FILE_RENAME_INFO.RootDirectory$VH.set(seg, x);
    }
    public static MemorySegment RootDirectory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_FILE_RENAME_INFO.RootDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RootDirectory$set(MemorySegment seg, long index, MemorySegment x) {
        _FILE_RENAME_INFO.RootDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return _FILE_RENAME_INFO.FileNameLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileNameLength;
     * }
     */
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)_FILE_RENAME_INFO.FileNameLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileNameLength;
     * }
     */
    public static void FileNameLength$set(MemorySegment seg, int x) {
        _FILE_RENAME_INFO.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_RENAME_INFO.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_RENAME_INFO.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(20, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


