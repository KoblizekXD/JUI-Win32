// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCLAVE_INIT_INFO_VBS_BASIC {
 *     BYTE FamilyId[16];
 *     BYTE ImageId[16];
 *     ULONGLONG EnclaveSize;
 *     DWORD EnclaveSvn;
 *     DWORD Reserved;
 *     union {
 *         HANDLE SignatureInfoHandle;
 *         ULONGLONG Unused;
 *     };
 * };
 * }
 */
public class _ENCLAVE_INIT_INFO_VBS_BASIC {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("FamilyId"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("ImageId"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("EnclaveSize"),
        Constants$root.C_LONG$LAYOUT.withName("EnclaveSvn"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("SignatureInfoHandle"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Unused")
        ).withName("$anon$0")
    ).withName("_ENCLAVE_INIT_INFO_VBS_BASIC");
    public static MemoryLayout $LAYOUT() {
        return _ENCLAVE_INIT_INFO_VBS_BASIC.$struct$LAYOUT;
    }
    public static MemorySegment FamilyId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment ImageId$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle EnclaveSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnclaveSize"));
    public static VarHandle EnclaveSize$VH() {
        return _ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG EnclaveSize;
     * }
     */
    public static long EnclaveSize$get(MemorySegment seg) {
        return (long)_ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG EnclaveSize;
     * }
     */
    public static void EnclaveSize$set(MemorySegment seg, long x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSize$VH.set(seg, x);
    }
    public static long EnclaveSize$get(MemorySegment seg, long index) {
        return (long)_ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnclaveSize$set(MemorySegment seg, long index, long x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EnclaveSvn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnclaveSvn"));
    public static VarHandle EnclaveSvn$VH() {
        return _ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSvn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD EnclaveSvn;
     * }
     */
    public static int EnclaveSvn$get(MemorySegment seg) {
        return (int)_ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSvn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD EnclaveSvn;
     * }
     */
    public static void EnclaveSvn$set(MemorySegment seg, int x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSvn$VH.set(seg, x);
    }
    public static int EnclaveSvn$get(MemorySegment seg, long index) {
        return (int)_ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSvn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnclaveSvn$set(MemorySegment seg, long index, int x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.EnclaveSvn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _ENCLAVE_INIT_INFO_VBS_BASIC.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_ENCLAVE_INIT_INFO_VBS_BASIC.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_ENCLAVE_INIT_INFO_VBS_BASIC.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SignatureInfoHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("SignatureInfoHandle"));
    public static VarHandle SignatureInfoHandle$VH() {
        return _ENCLAVE_INIT_INFO_VBS_BASIC.SignatureInfoHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE SignatureInfoHandle;
     * }
     */
    public static MemorySegment SignatureInfoHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ENCLAVE_INIT_INFO_VBS_BASIC.SignatureInfoHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE SignatureInfoHandle;
     * }
     */
    public static void SignatureInfoHandle$set(MemorySegment seg, MemorySegment x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.SignatureInfoHandle$VH.set(seg, x);
    }
    public static MemorySegment SignatureInfoHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ENCLAVE_INIT_INFO_VBS_BASIC.SignatureInfoHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SignatureInfoHandle$set(MemorySegment seg, long index, MemorySegment x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.SignatureInfoHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Unused"));
    public static VarHandle Unused$VH() {
        return _ENCLAVE_INIT_INFO_VBS_BASIC.Unused$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG Unused;
     * }
     */
    public static long Unused$get(MemorySegment seg) {
        return (long)_ENCLAVE_INIT_INFO_VBS_BASIC.Unused$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG Unused;
     * }
     */
    public static void Unused$set(MemorySegment seg, long x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.Unused$VH.set(seg, x);
    }
    public static long Unused$get(MemorySegment seg, long index) {
        return (long)_ENCLAVE_INIT_INFO_VBS_BASIC.Unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unused$set(MemorySegment seg, long index, long x) {
        _ENCLAVE_INIT_INFO_VBS_BASIC.Unused$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

