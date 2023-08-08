// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_KEY_AGREE_RECIPIENT_INFO {
 *     DWORD dwVersion;
 *     DWORD dwOriginatorChoice;
 *     union {
 *         CERT_ID OriginatorCertId;
 *         CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo;
 *     };
 *     CRYPT_DATA_BLOB UserKeyingMaterial;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     DWORD cRecipientEncryptedKeys;
 *     PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO* rgpRecipientEncryptedKeys;
 * };
 * }
 */
public class _CMSG_KEY_AGREE_RECIPIENT_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwOriginatorChoice"),
        MemoryLayout.unionLayout(
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
            ).withName("OriginatorCertId"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("pbData")
                    ).withName("Parameters")
                ).withName("Algorithm"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("pbData"),
                    Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
                    MemoryLayout.paddingLayout(32)
                ).withName("PublicKey")
            ).withName("OriginatorPublicKeyInfo")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("UserKeyingMaterial"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        Constants$root.C_LONG$LAYOUT.withName("cRecipientEncryptedKeys"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpRecipientEncryptedKeys")
    ).withName("_CMSG_KEY_AGREE_RECIPIENT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOriginatorChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOriginatorChoice"));
    public static VarHandle dwOriginatorChoice$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOriginatorChoice;
     * }
     */
    public static int dwOriginatorChoice$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOriginatorChoice;
     * }
     */
    public static void dwOriginatorChoice$set(MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.set(seg, x);
    }
    public static int dwOriginatorChoice$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOriginatorChoice$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.dwOriginatorChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OriginatorCertId$slice(MemorySegment seg) {
        return seg.asSlice(8, 40);
    }
    public static MemorySegment OriginatorPublicKeyInfo$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    public static MemorySegment UserKeyingMaterial$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(72, 24);
    }
    static final VarHandle cRecipientEncryptedKeys$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRecipientEncryptedKeys"));
    public static VarHandle cRecipientEncryptedKeys$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cRecipientEncryptedKeys;
     * }
     */
    public static int cRecipientEncryptedKeys$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cRecipientEncryptedKeys;
     * }
     */
    public static void cRecipientEncryptedKeys$set(MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.set(seg, x);
    }
    public static int cRecipientEncryptedKeys$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRecipientEncryptedKeys$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.cRecipientEncryptedKeys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpRecipientEncryptedKeys$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpRecipientEncryptedKeys"));
    public static VarHandle rgpRecipientEncryptedKeys$VH() {
        return _CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO* rgpRecipientEncryptedKeys;
     * }
     */
    public static MemorySegment rgpRecipientEncryptedKeys$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO* rgpRecipientEncryptedKeys;
     * }
     */
    public static void rgpRecipientEncryptedKeys$set(MemorySegment seg, MemorySegment x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.set(seg, x);
    }
    public static MemorySegment rgpRecipientEncryptedKeys$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpRecipientEncryptedKeys$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_KEY_AGREE_RECIPIENT_INFO.rgpRecipientEncryptedKeys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


