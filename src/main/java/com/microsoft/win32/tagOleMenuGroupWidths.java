// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagOleMenuGroupWidths {
 *     LONG width[6];
 * };
 * }
 */
public class tagOleMenuGroupWidths {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("width")
    ).withName("tagOleMenuGroupWidths");
    public static MemoryLayout $LAYOUT() {
        return tagOleMenuGroupWidths.$struct$LAYOUT;
    }
    public static MemorySegment width$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


