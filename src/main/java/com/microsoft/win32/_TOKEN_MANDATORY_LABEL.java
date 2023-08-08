// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TOKEN_MANDATORY_LABEL {
 *     SID_AND_ATTRIBUTES Label;
 * };
 * }
 */
public class _TOKEN_MANDATORY_LABEL {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("Sid"),
            Constants$root.C_LONG$LAYOUT.withName("Attributes"),
            MemoryLayout.paddingLayout(32)
        ).withName("Label")
    ).withName("_TOKEN_MANDATORY_LABEL");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_MANDATORY_LABEL.$struct$LAYOUT;
    }
    public static MemorySegment Label$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

