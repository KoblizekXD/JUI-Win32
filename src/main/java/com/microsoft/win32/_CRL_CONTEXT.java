// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRL_CONTEXT {
 *     DWORD dwCertEncodingType;
 *     BYTE* pbCrlEncoded;
 *     DWORD cbCrlEncoded;
 *     PCRL_INFO pCrlInfo;
 *     HCERTSTORE hCertStore;
 * };
 * }
 */
public class _CRL_CONTEXT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwCertEncodingType"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pbCrlEncoded"),
        Constants$root.C_LONG$LAYOUT.withName("cbCrlEncoded"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pCrlInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("hCertStore")
    ).withName("_CRL_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return _CRL_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle dwCertEncodingType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCertEncodingType"));
    public static VarHandle dwCertEncodingType$VH() {
        return _CRL_CONTEXT.dwCertEncodingType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCertEncodingType;
     * }
     */
    public static int dwCertEncodingType$get(MemorySegment seg) {
        return (int)_CRL_CONTEXT.dwCertEncodingType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCertEncodingType;
     * }
     */
    public static void dwCertEncodingType$set(MemorySegment seg, int x) {
        _CRL_CONTEXT.dwCertEncodingType$VH.set(seg, x);
    }
    public static int dwCertEncodingType$get(MemorySegment seg, long index) {
        return (int)_CRL_CONTEXT.dwCertEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCertEncodingType$set(MemorySegment seg, long index, int x) {
        _CRL_CONTEXT.dwCertEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbCrlEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pbCrlEncoded"));
    public static VarHandle pbCrlEncoded$VH() {
        return _CRL_CONTEXT.pbCrlEncoded$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbCrlEncoded;
     * }
     */
    public static MemorySegment pbCrlEncoded$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRL_CONTEXT.pbCrlEncoded$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbCrlEncoded;
     * }
     */
    public static void pbCrlEncoded$set(MemorySegment seg, MemorySegment x) {
        _CRL_CONTEXT.pbCrlEncoded$VH.set(seg, x);
    }
    public static MemorySegment pbCrlEncoded$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRL_CONTEXT.pbCrlEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbCrlEncoded$set(MemorySegment seg, long index, MemorySegment x) {
        _CRL_CONTEXT.pbCrlEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbCrlEncoded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbCrlEncoded"));
    public static VarHandle cbCrlEncoded$VH() {
        return _CRL_CONTEXT.cbCrlEncoded$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbCrlEncoded;
     * }
     */
    public static int cbCrlEncoded$get(MemorySegment seg) {
        return (int)_CRL_CONTEXT.cbCrlEncoded$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbCrlEncoded;
     * }
     */
    public static void cbCrlEncoded$set(MemorySegment seg, int x) {
        _CRL_CONTEXT.cbCrlEncoded$VH.set(seg, x);
    }
    public static int cbCrlEncoded$get(MemorySegment seg, long index) {
        return (int)_CRL_CONTEXT.cbCrlEncoded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbCrlEncoded$set(MemorySegment seg, long index, int x) {
        _CRL_CONTEXT.cbCrlEncoded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pCrlInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pCrlInfo"));
    public static VarHandle pCrlInfo$VH() {
        return _CRL_CONTEXT.pCrlInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRL_INFO pCrlInfo;
     * }
     */
    public static MemorySegment pCrlInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRL_CONTEXT.pCrlInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRL_INFO pCrlInfo;
     * }
     */
    public static void pCrlInfo$set(MemorySegment seg, MemorySegment x) {
        _CRL_CONTEXT.pCrlInfo$VH.set(seg, x);
    }
    public static MemorySegment pCrlInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRL_CONTEXT.pCrlInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CRL_CONTEXT.pCrlInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCertStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCertStore"));
    public static VarHandle hCertStore$VH() {
        return _CRL_CONTEXT.hCertStore$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCERTSTORE hCertStore;
     * }
     */
    public static MemorySegment hCertStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRL_CONTEXT.hCertStore$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCERTSTORE hCertStore;
     * }
     */
    public static void hCertStore$set(MemorySegment seg, MemorySegment x) {
        _CRL_CONTEXT.hCertStore$VH.set(seg, x);
    }
    public static MemorySegment hCertStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRL_CONTEXT.hCertStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCertStore$set(MemorySegment seg, long index, MemorySegment x) {
        _CRL_CONTEXT.hCertStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


