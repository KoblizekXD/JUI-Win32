// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {
 *     ULONG cbSize;
 *     ULONG dwInfoVersion;
 *     PUCHAR pbNonce;
 *     ULONG cbNonce;
 *     PUCHAR pbAuthData;
 *     ULONG cbAuthData;
 *     PUCHAR pbTag;
 *     ULONG cbTag;
 *     PUCHAR pbMacContext;
 *     ULONG cbMacContext;
 *     ULONG cbAAD;
 *     ULONGLONG cbData;
 *     ULONG dwFlags;
 * };
 * }
 */
public class _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwInfoVersion"),
        Constants$root.C_POINTER$LAYOUT.withName("pbNonce"),
        Constants$root.C_LONG$LAYOUT.withName("cbNonce"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbAuthData"),
        Constants$root.C_LONG$LAYOUT.withName("cbAuthData"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbTag"),
        Constants$root.C_LONG$LAYOUT.withName("cbTag"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbMacContext"),
        Constants$root.C_LONG$LAYOUT.withName("cbMacContext"),
        Constants$root.C_LONG$LAYOUT.withName("cbAAD"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("cbData"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwInfoVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwInfoVersion"));
    public static VarHandle dwInfoVersion$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwInfoVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwInfoVersion;
     * }
     */
    public static int dwInfoVersion$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwInfoVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwInfoVersion;
     * }
     */
    public static void dwInfoVersion$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwInfoVersion$VH.set(seg, x);
    }
    public static int dwInfoVersion$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwInfoVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInfoVersion$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwInfoVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbNonce$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbNonce"));
    public static VarHandle pbNonce$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbNonce$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbNonce;
     * }
     */
    public static MemorySegment pbNonce$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbNonce$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbNonce;
     * }
     */
    public static void pbNonce$set(MemorySegment seg, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbNonce$VH.set(seg, x);
    }
    public static MemorySegment pbNonce$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbNonce$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbNonce$set(MemorySegment seg, long index, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbNonce$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbNonce$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbNonce"));
    public static VarHandle cbNonce$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbNonce$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbNonce;
     * }
     */
    public static int cbNonce$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbNonce$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbNonce;
     * }
     */
    public static void cbNonce$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbNonce$VH.set(seg, x);
    }
    public static int cbNonce$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbNonce$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbNonce$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbNonce$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbAuthData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbAuthData"));
    public static VarHandle pbAuthData$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbAuthData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbAuthData;
     * }
     */
    public static MemorySegment pbAuthData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbAuthData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbAuthData;
     * }
     */
    public static void pbAuthData$set(MemorySegment seg, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbAuthData$VH.set(seg, x);
    }
    public static MemorySegment pbAuthData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbAuthData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbAuthData$set(MemorySegment seg, long index, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbAuthData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAuthData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAuthData"));
    public static VarHandle cbAuthData$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAuthData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbAuthData;
     * }
     */
    public static int cbAuthData$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAuthData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbAuthData;
     * }
     */
    public static void cbAuthData$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAuthData$VH.set(seg, x);
    }
    public static int cbAuthData$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAuthData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAuthData$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAuthData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbTag"));
    public static VarHandle pbTag$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbTag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbTag;
     * }
     */
    public static MemorySegment pbTag$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbTag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbTag;
     * }
     */
    public static void pbTag$set(MemorySegment seg, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbTag$VH.set(seg, x);
    }
    public static MemorySegment pbTag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbTag$set(MemorySegment seg, long index, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbTag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbTag"));
    public static VarHandle cbTag$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbTag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbTag;
     * }
     */
    public static int cbTag$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbTag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbTag;
     * }
     */
    public static void cbTag$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbTag$VH.set(seg, x);
    }
    public static int cbTag$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbTag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTag$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbTag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbMacContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbMacContext"));
    public static VarHandle pbMacContext$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbMacContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PUCHAR pbMacContext;
     * }
     */
    public static MemorySegment pbMacContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbMacContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PUCHAR pbMacContext;
     * }
     */
    public static void pbMacContext$set(MemorySegment seg, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbMacContext$VH.set(seg, x);
    }
    public static MemorySegment pbMacContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbMacContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbMacContext$set(MemorySegment seg, long index, MemorySegment x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.pbMacContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbMacContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbMacContext"));
    public static VarHandle cbMacContext$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbMacContext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbMacContext;
     * }
     */
    public static int cbMacContext$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbMacContext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbMacContext;
     * }
     */
    public static void cbMacContext$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbMacContext$VH.set(seg, x);
    }
    public static int cbMacContext$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbMacContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbMacContext$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbMacContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbAAD$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbAAD"));
    public static VarHandle cbAAD$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAAD$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbAAD;
     * }
     */
    public static int cbAAD$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAAD$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbAAD;
     * }
     */
    public static void cbAAD$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAAD$VH.set(seg, x);
    }
    public static int cbAAD$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAAD$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAAD$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbAAD$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG cbData;
     * }
     */
    public static long cbData$get(MemorySegment seg) {
        return (long)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, long x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbData$VH.set(seg, x);
    }
    public static long cbData$get(MemorySegment seg, long index) {
        return (long)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, long x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

