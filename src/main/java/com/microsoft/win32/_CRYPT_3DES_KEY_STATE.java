// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_3DES_KEY_STATE {
 *     unsigned char Key[24];
 *     unsigned char IV[8];
 *     unsigned char Feedback[8];
 * };
 * }
 */
public class _CRYPT_3DES_KEY_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(24, Constants$root.C_CHAR$LAYOUT).withName("Key"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("IV"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Feedback")
    ).withName("_CRYPT_3DES_KEY_STATE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_3DES_KEY_STATE.$struct$LAYOUT;
    }
    public static MemorySegment Key$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment IV$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment Feedback$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


