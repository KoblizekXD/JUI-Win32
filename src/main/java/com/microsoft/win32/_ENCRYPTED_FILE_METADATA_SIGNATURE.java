// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCRYPTED_FILE_METADATA_SIGNATURE {
 *     DWORD dwEfsAccessType;
 *     PENCRYPTION_CERTIFICATE_HASH_LIST pCertificatesAdded;
 *     PENCRYPTION_CERTIFICATE pEncryptionCertificate;
 *     PEFS_RPC_BLOB pEfsStreamSignature;
 * };
 * }
 */
public class _ENCRYPTED_FILE_METADATA_SIGNATURE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwEfsAccessType"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pCertificatesAdded"),
        Constants$root.C_POINTER$LAYOUT.withName("pEncryptionCertificate"),
        Constants$root.C_POINTER$LAYOUT.withName("pEfsStreamSignature")
    ).withName("_ENCRYPTED_FILE_METADATA_SIGNATURE");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTED_FILE_METADATA_SIGNATURE.$struct$LAYOUT;
    }
    static final VarHandle dwEfsAccessType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEfsAccessType"));
    public static VarHandle dwEfsAccessType$VH() {
        return _ENCRYPTED_FILE_METADATA_SIGNATURE.dwEfsAccessType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwEfsAccessType;
     * }
     */
    public static int dwEfsAccessType$get(MemorySegment seg) {
        return (int)_ENCRYPTED_FILE_METADATA_SIGNATURE.dwEfsAccessType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwEfsAccessType;
     * }
     */
    public static void dwEfsAccessType$set(MemorySegment seg, int x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.dwEfsAccessType$VH.set(seg, x);
    }
    public static int dwEfsAccessType$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTED_FILE_METADATA_SIGNATURE.dwEfsAccessType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEfsAccessType$set(MemorySegment seg, long index, int x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.dwEfsAccessType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCertificatesAdded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCertificatesAdded"));
    public static VarHandle pCertificatesAdded$VH() {
        return _ENCRYPTED_FILE_METADATA_SIGNATURE.pCertificatesAdded$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PENCRYPTION_CERTIFICATE_HASH_LIST pCertificatesAdded;
     * }
     */
    public static MemorySegment pCertificatesAdded$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTED_FILE_METADATA_SIGNATURE.pCertificatesAdded$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PENCRYPTION_CERTIFICATE_HASH_LIST pCertificatesAdded;
     * }
     */
    public static void pCertificatesAdded$set(MemorySegment seg, MemorySegment x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.pCertificatesAdded$VH.set(seg, x);
    }
    public static MemorySegment pCertificatesAdded$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTED_FILE_METADATA_SIGNATURE.pCertificatesAdded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCertificatesAdded$set(MemorySegment seg, long index, MemorySegment x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.pCertificatesAdded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEncryptionCertificate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEncryptionCertificate"));
    public static VarHandle pEncryptionCertificate$VH() {
        return _ENCRYPTED_FILE_METADATA_SIGNATURE.pEncryptionCertificate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PENCRYPTION_CERTIFICATE pEncryptionCertificate;
     * }
     */
    public static MemorySegment pEncryptionCertificate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTED_FILE_METADATA_SIGNATURE.pEncryptionCertificate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PENCRYPTION_CERTIFICATE pEncryptionCertificate;
     * }
     */
    public static void pEncryptionCertificate$set(MemorySegment seg, MemorySegment x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.pEncryptionCertificate$VH.set(seg, x);
    }
    public static MemorySegment pEncryptionCertificate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTED_FILE_METADATA_SIGNATURE.pEncryptionCertificate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEncryptionCertificate$set(MemorySegment seg, long index, MemorySegment x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.pEncryptionCertificate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEfsStreamSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEfsStreamSignature"));
    public static VarHandle pEfsStreamSignature$VH() {
        return _ENCRYPTED_FILE_METADATA_SIGNATURE.pEfsStreamSignature$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PEFS_RPC_BLOB pEfsStreamSignature;
     * }
     */
    public static MemorySegment pEfsStreamSignature$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTED_FILE_METADATA_SIGNATURE.pEfsStreamSignature$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PEFS_RPC_BLOB pEfsStreamSignature;
     * }
     */
    public static void pEfsStreamSignature$set(MemorySegment seg, MemorySegment x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.pEfsStreamSignature$VH.set(seg, x);
    }
    public static MemorySegment pEfsStreamSignature$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTED_FILE_METADATA_SIGNATURE.pEfsStreamSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEfsStreamSignature$set(MemorySegment seg, long index, MemorySegment x) {
        _ENCRYPTED_FILE_METADATA_SIGNATURE.pEfsStreamSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


