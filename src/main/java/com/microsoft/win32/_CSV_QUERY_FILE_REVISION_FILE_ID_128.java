// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CSV_QUERY_FILE_REVISION_FILE_ID_128 {
 *     FILE_ID_128 FileId;
 *     LONGLONG FileRevision[3];
 * };
 * }
 */
public class _CSV_QUERY_FILE_REVISION_FILE_ID_128 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Identifier")
        ).withName("FileId"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_LONG_LONG$LAYOUT).withName("FileRevision")
    ).withName("_CSV_QUERY_FILE_REVISION_FILE_ID_128");
    public static MemoryLayout $LAYOUT() {
        return _CSV_QUERY_FILE_REVISION_FILE_ID_128.$struct$LAYOUT;
    }
    public static MemorySegment FileId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment FileRevision$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


