// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_RC4_KEY_STATE {
 *     unsigned char Key[16];
 *     unsigned char SBox[256];
 *     unsigned char i;
 *     unsigned char j;
 * };
 * }
 */
public class _CRYPT_RC4_KEY_STATE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("Key"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_CHAR$LAYOUT).withName("SBox"),
        Constants$root.C_CHAR$LAYOUT.withName("i"),
        Constants$root.C_CHAR$LAYOUT.withName("j")
    ).withName("_CRYPT_RC4_KEY_STATE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_RC4_KEY_STATE.$struct$LAYOUT;
    }
    public static MemorySegment Key$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment SBox$slice(MemorySegment seg) {
        return seg.asSlice(16, 256);
    }
    static final VarHandle i$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("i"));
    public static VarHandle i$VH() {
        return _CRYPT_RC4_KEY_STATE.i$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char i;
     * }
     */
    public static byte i$get(MemorySegment seg) {
        return (byte)_CRYPT_RC4_KEY_STATE.i$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char i;
     * }
     */
    public static void i$set(MemorySegment seg, byte x) {
        _CRYPT_RC4_KEY_STATE.i$VH.set(seg, x);
    }
    public static byte i$get(MemorySegment seg, long index) {
        return (byte)_CRYPT_RC4_KEY_STATE.i$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void i$set(MemorySegment seg, long index, byte x) {
        _CRYPT_RC4_KEY_STATE.i$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle j$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("j"));
    public static VarHandle j$VH() {
        return _CRYPT_RC4_KEY_STATE.j$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char j;
     * }
     */
    public static byte j$get(MemorySegment seg) {
        return (byte)_CRYPT_RC4_KEY_STATE.j$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char j;
     * }
     */
    public static void j$set(MemorySegment seg, byte x) {
        _CRYPT_RC4_KEY_STATE.j$VH.set(seg, x);
    }
    public static byte j$get(MemorySegment seg, long index) {
        return (byte)_CRYPT_RC4_KEY_STATE.j$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void j$set(MemorySegment seg, long index, byte x) {
        _CRYPT_RC4_KEY_STATE.j$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


