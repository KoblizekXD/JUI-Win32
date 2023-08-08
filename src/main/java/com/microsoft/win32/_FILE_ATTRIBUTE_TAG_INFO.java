// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILE_ATTRIBUTE_TAG_INFO {
 *     DWORD FileAttributes;
 *     DWORD ReparseTag;
 * };
 * }
 */
public class _FILE_ATTRIBUTE_TAG_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("FileAttributes"),
        Constants$root.C_LONG$LAYOUT.withName("ReparseTag")
    ).withName("_FILE_ATTRIBUTE_TAG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_ATTRIBUTE_TAG_INFO.$struct$LAYOUT;
    }
    static final VarHandle FileAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileAttributes"));
    public static VarHandle FileAttributes$VH() {
        return _FILE_ATTRIBUTE_TAG_INFO.FileAttributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileAttributes;
     * }
     */
    public static int FileAttributes$get(MemorySegment seg) {
        return (int)_FILE_ATTRIBUTE_TAG_INFO.FileAttributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileAttributes;
     * }
     */
    public static void FileAttributes$set(MemorySegment seg, int x) {
        _FILE_ATTRIBUTE_TAG_INFO.FileAttributes$VH.set(seg, x);
    }
    public static int FileAttributes$get(MemorySegment seg, long index) {
        return (int)_FILE_ATTRIBUTE_TAG_INFO.FileAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAttributes$set(MemorySegment seg, long index, int x) {
        _FILE_ATTRIBUTE_TAG_INFO.FileAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReparseTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReparseTag"));
    public static VarHandle ReparseTag$VH() {
        return _FILE_ATTRIBUTE_TAG_INFO.ReparseTag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ReparseTag;
     * }
     */
    public static int ReparseTag$get(MemorySegment seg) {
        return (int)_FILE_ATTRIBUTE_TAG_INFO.ReparseTag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ReparseTag;
     * }
     */
    public static void ReparseTag$set(MemorySegment seg, int x) {
        _FILE_ATTRIBUTE_TAG_INFO.ReparseTag$VH.set(seg, x);
    }
    public static int ReparseTag$get(MemorySegment seg, long index) {
        return (int)_FILE_ATTRIBUTE_TAG_INFO.ReparseTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReparseTag$set(MemorySegment seg, long index, int x) {
        _FILE_ATTRIBUTE_TAG_INFO.ReparseTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


