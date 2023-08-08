// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISK_EXTENT {
 *     DWORD DiskNumber;
 *     LARGE_INTEGER StartingOffset;
 *     LARGE_INTEGER ExtentLength;
 * };
 * }
 */
public class _DISK_EXTENT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DiskNumber"),
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
        ).withName("StartingOffset"),
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
        ).withName("ExtentLength")
    ).withName("_DISK_EXTENT");
    public static MemoryLayout $LAYOUT() {
        return _DISK_EXTENT.$struct$LAYOUT;
    }
    static final VarHandle DiskNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DiskNumber"));
    public static VarHandle DiskNumber$VH() {
        return _DISK_EXTENT.DiskNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DiskNumber;
     * }
     */
    public static int DiskNumber$get(MemorySegment seg) {
        return (int)_DISK_EXTENT.DiskNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DiskNumber;
     * }
     */
    public static void DiskNumber$set(MemorySegment seg, int x) {
        _DISK_EXTENT.DiskNumber$VH.set(seg, x);
    }
    public static int DiskNumber$get(MemorySegment seg, long index) {
        return (int)_DISK_EXTENT.DiskNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DiskNumber$set(MemorySegment seg, long index, int x) {
        _DISK_EXTENT.DiskNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingOffset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ExtentLength$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


