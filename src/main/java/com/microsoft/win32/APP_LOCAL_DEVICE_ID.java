// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct APP_LOCAL_DEVICE_ID {
 *     BYTE value[32];
 * };
 * }
 */
public class APP_LOCAL_DEVICE_ID {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("value")
    ).withName("APP_LOCAL_DEVICE_ID");
    public static MemoryLayout $LAYOUT() {
        return APP_LOCAL_DEVICE_ID.$struct$LAYOUT;
    }
    public static MemorySegment value$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


