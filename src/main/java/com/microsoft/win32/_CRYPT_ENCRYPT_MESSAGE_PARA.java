// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_ENCRYPT_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgEncodingType;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     void* pvEncryptionAuxInfo;
 *     DWORD dwFlags;
 *     DWORD dwInnerContentType;
 * };
 * }
 */
public class _CRYPT_ENCRYPT_MESSAGE_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwMsgEncodingType"),
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
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwInnerContentType")
    ).withName("_CRYPT_ENCRYPT_MESSAGE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMsgEncodingType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMsgEncodingType"));
    public static VarHandle dwMsgEncodingType$VH() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.dwMsgEncodingType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMsgEncodingType;
     * }
     */
    public static int dwMsgEncodingType$get(MemorySegment seg) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.dwMsgEncodingType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMsgEncodingType;
     * }
     */
    public static void dwMsgEncodingType$set(MemorySegment seg, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.dwMsgEncodingType$VH.set(seg, x);
    }
    public static int dwMsgEncodingType$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.dwMsgEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgEncodingType$set(MemorySegment seg, long index, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.dwMsgEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.hCryptProv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CRYPT_ENCRYPT_MESSAGE_PARA.hCryptProv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CRYPT_ENCRYPT_MESSAGE_PARA.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ContentEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    static final VarHandle pvEncryptionAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvEncryptionAuxInfo"));
    public static VarHandle pvEncryptionAuxInfo$VH() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.pvEncryptionAuxInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvEncryptionAuxInfo;
     * }
     */
    public static MemorySegment pvEncryptionAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ENCRYPT_MESSAGE_PARA.pvEncryptionAuxInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvEncryptionAuxInfo;
     * }
     */
    public static void pvEncryptionAuxInfo$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.pvEncryptionAuxInfo$VH.set(seg, x);
    }
    public static MemorySegment pvEncryptionAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ENCRYPT_MESSAGE_PARA.pvEncryptionAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvEncryptionAuxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.pvEncryptionAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInnerContentType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInnerContentType"));
    public static VarHandle dwInnerContentType$VH() {
        return _CRYPT_ENCRYPT_MESSAGE_PARA.dwInnerContentType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwInnerContentType;
     * }
     */
    public static int dwInnerContentType$get(MemorySegment seg) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.dwInnerContentType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwInnerContentType;
     * }
     */
    public static void dwInnerContentType$set(MemorySegment seg, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.dwInnerContentType$VH.set(seg, x);
    }
    public static int dwInnerContentType$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ENCRYPT_MESSAGE_PARA.dwInnerContentType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInnerContentType$set(MemorySegment seg, long index, int x) {
        _CRYPT_ENCRYPT_MESSAGE_PARA.dwInnerContentType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


