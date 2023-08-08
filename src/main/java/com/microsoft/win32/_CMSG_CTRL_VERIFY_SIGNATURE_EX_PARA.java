// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA {
 *     DWORD cbSize;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     DWORD dwSignerIndex;
 *     DWORD dwSignerType;
 *     void* pvSigner;
 * };
 * }
 */
public class _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
        Constants$root.C_LONG$LAYOUT.withName("dwSignerIndex"),
        Constants$root.C_LONG$LAYOUT.withName("dwSignerType"),
        Constants$root.C_POINTER$LAYOUT.withName("pvSigner")
    ).withName("_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSignerIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignerIndex"));
    public static VarHandle dwSignerIndex$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSignerIndex;
     * }
     */
    public static int dwSignerIndex$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSignerIndex;
     * }
     */
    public static void dwSignerIndex$set(MemorySegment seg, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.set(seg, x);
    }
    public static int dwSignerIndex$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignerIndex$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSignerType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignerType"));
    public static VarHandle dwSignerType$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSignerType;
     * }
     */
    public static int dwSignerType$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSignerType;
     * }
     */
    public static void dwSignerType$set(MemorySegment seg, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.set(seg, x);
    }
    public static int dwSignerType$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignerType$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvSigner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvSigner"));
    public static VarHandle pvSigner$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvSigner;
     * }
     */
    public static MemorySegment pvSigner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvSigner;
     * }
     */
    public static void pvSigner$set(MemorySegment seg, MemorySegment x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.set(seg, x);
    }
    public static MemorySegment pvSigner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvSigner$set(MemorySegment seg, long index, MemorySegment x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

