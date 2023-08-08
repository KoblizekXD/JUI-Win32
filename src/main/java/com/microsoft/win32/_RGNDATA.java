// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RGNDATA {
 *     RGNDATAHEADER rdh;
 *     char Buffer[1];
 * };
 * }
 */
public class _RGNDATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwSize"),
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nCount"),
            Constants$root.C_LONG$LAYOUT.withName("nRgnSize"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("left"),
                Constants$root.C_LONG$LAYOUT.withName("top"),
                Constants$root.C_LONG$LAYOUT.withName("right"),
                Constants$root.C_LONG$LAYOUT.withName("bottom")
            ).withName("rcBound")
        ).withName("rdh"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Buffer"),
        MemoryLayout.paddingLayout(24)
    ).withName("_RGNDATA");
    public static MemoryLayout $LAYOUT() {
        return _RGNDATA.$struct$LAYOUT;
    }
    public static MemorySegment rdh$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment Buffer$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


