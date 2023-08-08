// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SID_IDENTIFIER_AUTHORITY {
 *     BYTE Value[6];
 * };
 * }
 */
public class _SID_IDENTIFIER_AUTHORITY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("Value")
    ).withName("_SID_IDENTIFIER_AUTHORITY");
    public static MemoryLayout $LAYOUT() {
        return _SID_IDENTIFIER_AUTHORITY.$struct$LAYOUT;
    }
    public static MemorySegment Value$slice(MemorySegment seg) {
        return seg.asSlice(0, 6);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

