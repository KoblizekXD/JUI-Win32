// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STREAMS_QUERY_ID_OUTPUT_BUFFER {
 *     DWORD StreamId;
 * };
 * }
 */
public class _STREAMS_QUERY_ID_OUTPUT_BUFFER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("StreamId")
    ).withName("_STREAMS_QUERY_ID_OUTPUT_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _STREAMS_QUERY_ID_OUTPUT_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle StreamId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StreamId"));
    public static VarHandle StreamId$VH() {
        return _STREAMS_QUERY_ID_OUTPUT_BUFFER.StreamId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StreamId;
     * }
     */
    public static int StreamId$get(MemorySegment seg) {
        return (int)_STREAMS_QUERY_ID_OUTPUT_BUFFER.StreamId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StreamId;
     * }
     */
    public static void StreamId$set(MemorySegment seg, int x) {
        _STREAMS_QUERY_ID_OUTPUT_BUFFER.StreamId$VH.set(seg, x);
    }
    public static int StreamId$get(MemorySegment seg, long index) {
        return (int)_STREAMS_QUERY_ID_OUTPUT_BUFFER.StreamId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StreamId$set(MemorySegment seg, long index, int x) {
        _STREAMS_QUERY_ID_OUTPUT_BUFFER.StreamId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


