// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_CONTENT_ENCRYPT_INFO {
 *     DWORD cbSize;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     void* pvEncryptionAuxInfo;
 *     DWORD cRecipients;
 *     PCMSG_RECIPIENT_ENCODE_INFO rgCmsRecipients;
 *     PFN_CMSG_ALLOC pfnAlloc;
 *     PFN_CMSG_FREE pfnFree;
 *     DWORD dwEncryptFlags;
 *     union {
 *         HCRYPTKEY hContentEncryptKey;
 *         BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
 *     };
 *     DWORD dwFlags;
 *     BOOL fCNG;
 *     BYTE* pbCNGContentEncryptKeyObject;
 *     BYTE* pbContentEncryptKey;
 *     DWORD cbContentEncryptKey;
 * };
 * }
 */
public class _CMSG_CONTENT_ENCRYPT_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("ContentEncryptionAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pvEncryptionAuxInfo"),
        Constants$root.C_LONG$LAYOUT.withName("cRecipients"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCmsRecipients"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree"),
        Constants$root.C_LONG$LAYOUT.withName("dwEncryptFlags"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("hContentEncryptKey"),
            Constants$root.C_POINTER$LAYOUT.withName("hCNGContentEncryptKey")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("fCNG"),
        Constants$root.C_POINTER$LAYOUT.withName("pbCNGContentEncryptKeyObject"),
        Constants$root.C_POINTER$LAYOUT.withName("pbContentEncryptKey"),
        Constants$root.C_LONG$LAYOUT.withName("cbContentEncryptKey"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CMSG_CONTENT_ENCRYPT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CONTENT_ENCRYPT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContentEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    static final VarHandle pvEncryptionAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvEncryptionAuxInfo"));
    public static VarHandle pvEncryptionAuxInfo$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvEncryptionAuxInfo;
     * }
     */
    public static MemorySegment pvEncryptionAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvEncryptionAuxInfo;
     * }
     */
    public static void pvEncryptionAuxInfo$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.set(seg, x);
    }
    public static MemorySegment pvEncryptionAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvEncryptionAuxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pvEncryptionAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRecipients$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRecipients"));
    public static VarHandle cRecipients$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cRecipients;
     * }
     */
    public static int cRecipients$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cRecipients;
     * }
     */
    public static void cRecipients$set(MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.set(seg, x);
    }
    public static int cRecipients$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRecipients$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cRecipients$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCmsRecipients$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCmsRecipients"));
    public static VarHandle rgCmsRecipients$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMSG_RECIPIENT_ENCODE_INFO rgCmsRecipients;
     * }
     */
    public static MemorySegment rgCmsRecipients$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMSG_RECIPIENT_ENCODE_INFO rgCmsRecipients;
     * }
     */
    public static void rgCmsRecipients$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.set(seg, x);
    }
    public static MemorySegment rgCmsRecipients$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCmsRecipients$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.rgCmsRecipients$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnAlloc"));
    public static VarHandle pfnAlloc$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CMSG_ALLOC pfnAlloc;
     * }
     */
    public static MemorySegment pfnAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CMSG_ALLOC pfnAlloc;
     * }
     */
    public static void pfnAlloc$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.set(seg, x);
    }
    public static MemorySegment pfnAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_ALLOC pfnAlloc(MemorySegment segment, SegmentScope scope) {
        return PFN_CMSG_ALLOC.ofAddress(pfnAlloc$get(segment), scope);
    }
    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CMSG_FREE pfnFree;
     * }
     */
    public static MemorySegment pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CMSG_FREE pfnFree;
     * }
     */
    public static void pfnFree$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.set(seg, x);
    }
    public static MemorySegment pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_FREE pfnFree(MemorySegment segment, SegmentScope scope) {
        return PFN_CMSG_FREE.ofAddress(pfnFree$get(segment), scope);
    }
    static final VarHandle dwEncryptFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwEncryptFlags"));
    public static VarHandle dwEncryptFlags$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwEncryptFlags;
     * }
     */
    public static int dwEncryptFlags$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwEncryptFlags;
     * }
     */
    public static void dwEncryptFlags$set(MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.set(seg, x);
    }
    public static int dwEncryptFlags$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEncryptFlags$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwEncryptFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hContentEncryptKey"));
    public static VarHandle hContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTKEY hContentEncryptKey;
     * }
     */
    public static long hContentEncryptKey$get(MemorySegment seg) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTKEY hContentEncryptKey;
     * }
     */
    public static void hContentEncryptKey$set(MemorySegment seg, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.set(seg, x);
    }
    public static long hContentEncryptKey$get(MemorySegment seg, long index) {
        return (long)_CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hContentEncryptKey$set(MemorySegment seg, long index, long x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCNGContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hCNGContentEncryptKey"));
    public static VarHandle hCNGContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
     * }
     */
    public static MemorySegment hCNGContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
     * }
     */
    public static void hCNGContentEncryptKey$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.set(seg, x);
    }
    public static MemorySegment hCNGContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCNGContentEncryptKey$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.hCNGContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fCNG$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fCNG"));
    public static VarHandle fCNG$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fCNG;
     * }
     */
    public static int fCNG$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fCNG;
     * }
     */
    public static void fCNG$set(MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.set(seg, x);
    }
    public static int fCNG$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fCNG$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.fCNG$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbCNGContentEncryptKeyObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbCNGContentEncryptKeyObject"));
    public static VarHandle pbCNGContentEncryptKeyObject$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbCNGContentEncryptKeyObject;
     * }
     */
    public static MemorySegment pbCNGContentEncryptKeyObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbCNGContentEncryptKeyObject;
     * }
     */
    public static void pbCNGContentEncryptKeyObject$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg, x);
    }
    public static MemorySegment pbCNGContentEncryptKeyObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbCNGContentEncryptKeyObject$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbContentEncryptKey"));
    public static VarHandle pbContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbContentEncryptKey;
     * }
     */
    public static MemorySegment pbContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbContentEncryptKey;
     * }
     */
    public static void pbContentEncryptKey$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.set(seg, x);
    }
    public static MemorySegment pbContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbContentEncryptKey$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CONTENT_ENCRYPT_INFO.pbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbContentEncryptKey"));
    public static VarHandle cbContentEncryptKey$VH() {
        return _CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbContentEncryptKey;
     * }
     */
    public static int cbContentEncryptKey$get(MemorySegment seg) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbContentEncryptKey;
     * }
     */
    public static void cbContentEncryptKey$set(MemorySegment seg, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.set(seg, x);
    }
    public static int cbContentEncryptKey$get(MemorySegment seg, long index) {
        return (int)_CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbContentEncryptKey$set(MemorySegment seg, long index, int x) {
        _CMSG_CONTENT_ENCRYPT_INFO.cbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


