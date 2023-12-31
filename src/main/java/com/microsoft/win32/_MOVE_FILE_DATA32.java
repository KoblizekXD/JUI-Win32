// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MOVE_FILE_DATA32 {
 *     UINT32 FileHandle;
 *     LARGE_INTEGER StartingVcn;
 *     LARGE_INTEGER StartingLcn;
 *     DWORD ClusterCount;
 * };
 * }
 */
public class _MOVE_FILE_DATA32 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("FileHandle"),
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
        ).withName("StartingVcn"),
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
        ).withName("StartingLcn"),
        Constants$root.C_LONG$LAYOUT.withName("ClusterCount"),
        MemoryLayout.paddingLayout(32)
    ).withName("_MOVE_FILE_DATA32");
    public static MemoryLayout $LAYOUT() {
        return _MOVE_FILE_DATA32.$struct$LAYOUT;
    }
    static final VarHandle FileHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileHandle"));
    public static VarHandle FileHandle$VH() {
        return _MOVE_FILE_DATA32.FileHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 FileHandle;
     * }
     */
    public static int FileHandle$get(MemorySegment seg) {
        return (int)_MOVE_FILE_DATA32.FileHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 FileHandle;
     * }
     */
    public static void FileHandle$set(MemorySegment seg, int x) {
        _MOVE_FILE_DATA32.FileHandle$VH.set(seg, x);
    }
    public static int FileHandle$get(MemorySegment seg, long index) {
        return (int)_MOVE_FILE_DATA32.FileHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileHandle$set(MemorySegment seg, long index, int x) {
        _MOVE_FILE_DATA32.FileHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingVcn$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment StartingLcn$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle ClusterCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ClusterCount"));
    public static VarHandle ClusterCount$VH() {
        return _MOVE_FILE_DATA32.ClusterCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ClusterCount;
     * }
     */
    public static int ClusterCount$get(MemorySegment seg) {
        return (int)_MOVE_FILE_DATA32.ClusterCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ClusterCount;
     * }
     */
    public static void ClusterCount$set(MemorySegment seg, int x) {
        _MOVE_FILE_DATA32.ClusterCount$VH.set(seg, x);
    }
    public static int ClusterCount$get(MemorySegment seg, long index) {
        return (int)_MOVE_FILE_DATA32.ClusterCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ClusterCount$set(MemorySegment seg, long index, int x) {
        _MOVE_FILE_DATA32.ClusterCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


