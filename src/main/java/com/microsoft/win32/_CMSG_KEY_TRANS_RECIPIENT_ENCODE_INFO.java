// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO {
 *     DWORD cbSize;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     void* pvKeyEncryptionAuxInfo;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_BIT_BLOB RecipientPublicKey;
 *     CERT_ID RecipientId;
 * };
 * }
 */
public class _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pvKeyEncryptionAuxInfo"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("RecipientPublicKey"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwIdChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("pbData")
                    ).withName("Issuer"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("pbData")
                    ).withName("SerialNumber")
                ).withName("IssuerSerialNumber"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("KeyId"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData")
                ).withName("HashId")
            ).withName("$anon$0")
        ).withName("RecipientId")
    ).withName("_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    static final VarHandle pvKeyEncryptionAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvKeyEncryptionAuxInfo"));
    public static VarHandle pvKeyEncryptionAuxInfo$VH() {
        return _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.pvKeyEncryptionAuxInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvKeyEncryptionAuxInfo;
     * }
     */
    public static MemorySegment pvKeyEncryptionAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.pvKeyEncryptionAuxInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvKeyEncryptionAuxInfo;
     * }
     */
    public static void pvKeyEncryptionAuxInfo$set(MemorySegment seg, MemorySegment x) {
        _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.pvKeyEncryptionAuxInfo$VH.set(seg, x);
    }
    public static MemorySegment pvKeyEncryptionAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.pvKeyEncryptionAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvKeyEncryptionAuxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.pvKeyEncryptionAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.hCryptProv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.hCryptProv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RecipientPublicKey$slice(MemorySegment seg) {
        return seg.asSlice(48, 24);
    }
    public static MemorySegment RecipientId$slice(MemorySegment seg) {
        return seg.asSlice(72, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


