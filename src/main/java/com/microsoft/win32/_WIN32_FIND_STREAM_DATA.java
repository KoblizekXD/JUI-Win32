// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _WIN32_FIND_STREAM_DATA {
 *     LARGE_INTEGER StreamSize;
 *     WCHAR cStreamName[296];
 * };
 * }
 */
public class _WIN32_FIND_STREAM_DATA {

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
        ).withName("StreamSize"),
        MemoryLayout.sequenceLayout(296, Constants$root.C_SHORT$LAYOUT).withName("cStreamName")
    ).withName("_WIN32_FIND_STREAM_DATA");
    public static MemoryLayout $LAYOUT() {
        return _WIN32_FIND_STREAM_DATA.$struct$LAYOUT;
    }
    public static MemorySegment StreamSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment cStreamName$slice(MemorySegment seg) {
        return seg.asSlice(8, 592);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


