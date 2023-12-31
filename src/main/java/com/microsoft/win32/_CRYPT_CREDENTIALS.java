// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_CREDENTIALS {
 *     DWORD cbSize;
 *     LPCSTR pszCredentialsOid;
 *     LPVOID pvCredentials;
 * };
 * }
 */
public class _CRYPT_CREDENTIALS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszCredentialsOid"),
        Constants$root.C_POINTER$LAYOUT.withName("pvCredentials")
    ).withName("_CRYPT_CREDENTIALS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_CREDENTIALS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_CREDENTIALS.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_CREDENTIALS.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CRYPT_CREDENTIALS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_CREDENTIALS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_CREDENTIALS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszCredentialsOid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszCredentialsOid"));
    public static VarHandle pszCredentialsOid$VH() {
        return _CRYPT_CREDENTIALS.pszCredentialsOid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pszCredentialsOid;
     * }
     */
    public static MemorySegment pszCredentialsOid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CREDENTIALS.pszCredentialsOid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pszCredentialsOid;
     * }
     */
    public static void pszCredentialsOid$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_CREDENTIALS.pszCredentialsOid$VH.set(seg, x);
    }
    public static MemorySegment pszCredentialsOid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CREDENTIALS.pszCredentialsOid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCredentialsOid$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_CREDENTIALS.pszCredentialsOid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvCredentials$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvCredentials"));
    public static VarHandle pvCredentials$VH() {
        return _CRYPT_CREDENTIALS.pvCredentials$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID pvCredentials;
     * }
     */
    public static MemorySegment pvCredentials$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CREDENTIALS.pvCredentials$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID pvCredentials;
     * }
     */
    public static void pvCredentials$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_CREDENTIALS.pvCredentials$VH.set(seg, x);
    }
    public static MemorySegment pvCredentials$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CREDENTIALS.pvCredentials$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvCredentials$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_CREDENTIALS.pvCredentials$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


