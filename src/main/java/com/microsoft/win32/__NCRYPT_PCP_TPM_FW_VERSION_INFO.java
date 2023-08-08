// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __NCRYPT_PCP_TPM_FW_VERSION_INFO {
 *     UINT16 major1;
 *     UINT16 major2;
 *     UINT16 minor1;
 *     UINT16 minor2;
 * };
 * }
 */
public class __NCRYPT_PCP_TPM_FW_VERSION_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("major1"),
        Constants$root.C_SHORT$LAYOUT.withName("major2"),
        Constants$root.C_SHORT$LAYOUT.withName("minor1"),
        Constants$root.C_SHORT$LAYOUT.withName("minor2")
    ).withName("__NCRYPT_PCP_TPM_FW_VERSION_INFO");
    public static MemoryLayout $LAYOUT() {
        return __NCRYPT_PCP_TPM_FW_VERSION_INFO.$struct$LAYOUT;
    }
    static final VarHandle major1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("major1"));
    public static VarHandle major1$VH() {
        return __NCRYPT_PCP_TPM_FW_VERSION_INFO.major1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT16 major1;
     * }
     */
    public static short major1$get(MemorySegment seg) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.major1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT16 major1;
     * }
     */
    public static void major1$set(MemorySegment seg, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.major1$VH.set(seg, x);
    }
    public static short major1$get(MemorySegment seg, long index) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.major1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void major1$set(MemorySegment seg, long index, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.major1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle major2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("major2"));
    public static VarHandle major2$VH() {
        return __NCRYPT_PCP_TPM_FW_VERSION_INFO.major2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT16 major2;
     * }
     */
    public static short major2$get(MemorySegment seg) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.major2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT16 major2;
     * }
     */
    public static void major2$set(MemorySegment seg, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.major2$VH.set(seg, x);
    }
    public static short major2$get(MemorySegment seg, long index) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.major2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void major2$set(MemorySegment seg, long index, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.major2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle minor1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minor1"));
    public static VarHandle minor1$VH() {
        return __NCRYPT_PCP_TPM_FW_VERSION_INFO.minor1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT16 minor1;
     * }
     */
    public static short minor1$get(MemorySegment seg) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.minor1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT16 minor1;
     * }
     */
    public static void minor1$set(MemorySegment seg, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.minor1$VH.set(seg, x);
    }
    public static short minor1$get(MemorySegment seg, long index) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.minor1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minor1$set(MemorySegment seg, long index, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.minor1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle minor2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minor2"));
    public static VarHandle minor2$VH() {
        return __NCRYPT_PCP_TPM_FW_VERSION_INFO.minor2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT16 minor2;
     * }
     */
    public static short minor2$get(MemorySegment seg) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.minor2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT16 minor2;
     * }
     */
    public static void minor2$set(MemorySegment seg, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.minor2$VH.set(seg, x);
    }
    public static short minor2$get(MemorySegment seg, long index) {
        return (short)__NCRYPT_PCP_TPM_FW_VERSION_INFO.minor2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minor2$set(MemorySegment seg, long index, short x) {
        __NCRYPT_PCP_TPM_FW_VERSION_INFO.minor2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

