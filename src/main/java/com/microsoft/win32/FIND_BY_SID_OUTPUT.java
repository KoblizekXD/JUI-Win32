// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD NextEntryOffset;
 *     DWORD FileIndex;
 *     DWORD FileNameLength;
 *     WCHAR FileName[1];
 * };
 * }
 */
public class FIND_BY_SID_OUTPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NextEntryOffset"),
        Constants$root.C_LONG$LAYOUT.withName("FileIndex"),
        Constants$root.C_LONG$LAYOUT.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    );
    public static MemoryLayout $LAYOUT() {
        return FIND_BY_SID_OUTPUT.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return FIND_BY_SID_OUTPUT.NextEntryOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NextEntryOffset;
     * }
     */
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)FIND_BY_SID_OUTPUT.NextEntryOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NextEntryOffset;
     * }
     */
    public static void NextEntryOffset$set(MemorySegment seg, int x) {
        FIND_BY_SID_OUTPUT.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)FIND_BY_SID_OUTPUT.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        FIND_BY_SID_OUTPUT.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileIndex"));
    public static VarHandle FileIndex$VH() {
        return FIND_BY_SID_OUTPUT.FileIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileIndex;
     * }
     */
    public static int FileIndex$get(MemorySegment seg) {
        return (int)FIND_BY_SID_OUTPUT.FileIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileIndex;
     * }
     */
    public static void FileIndex$set(MemorySegment seg, int x) {
        FIND_BY_SID_OUTPUT.FileIndex$VH.set(seg, x);
    }
    public static int FileIndex$get(MemorySegment seg, long index) {
        return (int)FIND_BY_SID_OUTPUT.FileIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileIndex$set(MemorySegment seg, long index, int x) {
        FIND_BY_SID_OUTPUT.FileIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return FIND_BY_SID_OUTPUT.FileNameLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileNameLength;
     * }
     */
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)FIND_BY_SID_OUTPUT.FileNameLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileNameLength;
     * }
     */
    public static void FileNameLength$set(MemorySegment seg, int x) {
        FIND_BY_SID_OUTPUT.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)FIND_BY_SID_OUTPUT.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        FIND_BY_SID_OUTPUT.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(12, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


