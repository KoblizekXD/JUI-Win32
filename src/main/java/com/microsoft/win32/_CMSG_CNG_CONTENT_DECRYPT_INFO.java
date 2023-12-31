// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_CNG_CONTENT_DECRYPT_INFO {
 *     DWORD cbSize;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     PFN_CMSG_ALLOC pfnAlloc;
 *     PFN_CMSG_FREE pfnFree;
 *     NCRYPT_KEY_HANDLE hNCryptKey;
 *     BYTE* pbContentEncryptKey;
 *     DWORD cbContentEncryptKey;
 *     BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
 *     BYTE* pbCNGContentEncryptKeyObject;
 * };
 * }
 */
public class _CMSG_CNG_CONTENT_DECRYPT_INFO {

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
        ).withName("ContentEncryptionAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnAlloc"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hNCryptKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pbContentEncryptKey"),
        Constants$root.C_LONG$LAYOUT.withName("cbContentEncryptKey"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hCNGContentEncryptKey"),
        Constants$root.C_POINTER$LAYOUT.withName("pbCNGContentEncryptKeyObject")
    ).withName("_CMSG_CNG_CONTENT_DECRYPT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContentEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    static final VarHandle pfnAlloc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnAlloc"));
    public static VarHandle pfnAlloc$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CMSG_ALLOC pfnAlloc;
     * }
     */
    public static MemorySegment pfnAlloc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CMSG_ALLOC pfnAlloc;
     * }
     */
    public static void pfnAlloc$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.set(seg, x);
    }
    public static MemorySegment pfnAlloc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_ALLOC pfnAlloc(MemorySegment segment, SegmentScope scope) {
        return PFN_CMSG_ALLOC.ofAddress(pfnAlloc$get(segment), scope);
    }
    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CMSG_FREE pfnFree;
     * }
     */
    public static MemorySegment pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CMSG_FREE pfnFree;
     * }
     */
    public static void pfnFree$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.set(seg, x);
    }
    public static MemorySegment pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CMSG_FREE pfnFree(MemorySegment segment, SegmentScope scope) {
        return PFN_CMSG_FREE.ofAddress(pfnFree$get(segment), scope);
    }
    static final VarHandle hNCryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hNCryptKey"));
    public static VarHandle hNCryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * NCRYPT_KEY_HANDLE hNCryptKey;
     * }
     */
    public static long hNCryptKey$get(MemorySegment seg) {
        return (long)_CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * NCRYPT_KEY_HANDLE hNCryptKey;
     * }
     */
    public static void hNCryptKey$set(MemorySegment seg, long x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.set(seg, x);
    }
    public static long hNCryptKey$get(MemorySegment seg, long index) {
        return (long)_CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hNCryptKey$set(MemorySegment seg, long index, long x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hNCryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbContentEncryptKey"));
    public static VarHandle pbContentEncryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbContentEncryptKey;
     * }
     */
    public static MemorySegment pbContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbContentEncryptKey;
     * }
     */
    public static void pbContentEncryptKey$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.set(seg, x);
    }
    public static MemorySegment pbContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbContentEncryptKey$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbContentEncryptKey"));
    public static VarHandle cbContentEncryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbContentEncryptKey;
     * }
     */
    public static int cbContentEncryptKey$get(MemorySegment seg) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbContentEncryptKey;
     * }
     */
    public static void cbContentEncryptKey$set(MemorySegment seg, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.set(seg, x);
    }
    public static int cbContentEncryptKey$get(MemorySegment seg, long index) {
        return (int)_CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbContentEncryptKey$set(MemorySegment seg, long index, int x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.cbContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCNGContentEncryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCNGContentEncryptKey"));
    public static VarHandle hCNGContentEncryptKey$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
     * }
     */
    public static MemorySegment hCNGContentEncryptKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
     * }
     */
    public static void hCNGContentEncryptKey$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.set(seg, x);
    }
    public static MemorySegment hCNGContentEncryptKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCNGContentEncryptKey$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.hCNGContentEncryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbCNGContentEncryptKeyObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbCNGContentEncryptKeyObject"));
    public static VarHandle pbCNGContentEncryptKeyObject$VH() {
        return _CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbCNGContentEncryptKeyObject;
     * }
     */
    public static MemorySegment pbCNGContentEncryptKeyObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbCNGContentEncryptKeyObject;
     * }
     */
    public static void pbCNGContentEncryptKeyObject$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg, x);
    }
    public static MemorySegment pbCNGContentEncryptKeyObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbCNGContentEncryptKeyObject$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CNG_CONTENT_DECRYPT_INFO.pbCNGContentEncryptKeyObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


