// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_AES_128_KEY_STATE {
 *     unsigned char Key[16];
 *     unsigned char IV[16];
 *     unsigned char  EncryptionState[11][16];
 *     unsigned char  DecryptionState[11][16];
 *     unsigned char Feedback[16];
 * };
 * }
 */
public class _CRYPT_AES_128_KEY_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Key"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("IV"),
        MemoryLayout.sequenceLayout(11, MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT)).withName("EncryptionState"),
        MemoryLayout.sequenceLayout(11, MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT)).withName("DecryptionState"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Feedback")
    ).withName("_CRYPT_AES_128_KEY_STATE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_AES_128_KEY_STATE.$struct$LAYOUT;
    }
    public static MemorySegment Key$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment IV$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment EncryptionState$slice(MemorySegment seg) {
        return seg.asSlice(32, 176);
    }
    public static MemorySegment DecryptionState$slice(MemorySegment seg) {
        return seg.asSlice(208, 176);
    }
    public static MemorySegment Feedback$slice(MemorySegment seg) {
        return seg.asSlice(384, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


