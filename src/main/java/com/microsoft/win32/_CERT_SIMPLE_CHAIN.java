// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_SIMPLE_CHAIN {
 *     DWORD cbSize;
 *     CERT_TRUST_STATUS TrustStatus;
 *     DWORD cElement;
 *     PCERT_CHAIN_ELEMENT* rgpElement;
 *     PCERT_TRUST_LIST_INFO pTrustListInfo;
 *     BOOL fHasRevocationFreshnessTime;
 *     DWORD dwRevocationFreshnessTime;
 * };
 * }
 */
public class _CERT_SIMPLE_CHAIN {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwErrorStatus"),
            Constants$root.C_LONG$LAYOUT.withName("dwInfoStatus")
        ).withName("TrustStatus"),
        Constants$root.C_LONG$LAYOUT.withName("cElement"),
        Constants$root.C_POINTER$LAYOUT.withName("rgpElement"),
        Constants$root.C_POINTER$LAYOUT.withName("pTrustListInfo"),
        Constants$root.C_LONG$LAYOUT.withName("fHasRevocationFreshnessTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwRevocationFreshnessTime")
    ).withName("_CERT_SIMPLE_CHAIN");
    public static MemoryLayout $LAYOUT() {
        return _CERT_SIMPLE_CHAIN.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_SIMPLE_CHAIN.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_SIMPLE_CHAIN.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CERT_SIMPLE_CHAIN.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_SIMPLE_CHAIN.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_SIMPLE_CHAIN.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TrustStatus$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    static final VarHandle cElement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cElement"));
    public static VarHandle cElement$VH() {
        return _CERT_SIMPLE_CHAIN.cElement$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cElement;
     * }
     */
    public static int cElement$get(MemorySegment seg) {
        return (int)_CERT_SIMPLE_CHAIN.cElement$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cElement;
     * }
     */
    public static void cElement$set(MemorySegment seg, int x) {
        _CERT_SIMPLE_CHAIN.cElement$VH.set(seg, x);
    }
    public static int cElement$get(MemorySegment seg, long index) {
        return (int)_CERT_SIMPLE_CHAIN.cElement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElement$set(MemorySegment seg, long index, int x) {
        _CERT_SIMPLE_CHAIN.cElement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpElement$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpElement"));
    public static VarHandle rgpElement$VH() {
        return _CERT_SIMPLE_CHAIN.rgpElement$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_CHAIN_ELEMENT* rgpElement;
     * }
     */
    public static MemorySegment rgpElement$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SIMPLE_CHAIN.rgpElement$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_CHAIN_ELEMENT* rgpElement;
     * }
     */
    public static void rgpElement$set(MemorySegment seg, MemorySegment x) {
        _CERT_SIMPLE_CHAIN.rgpElement$VH.set(seg, x);
    }
    public static MemorySegment rgpElement$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SIMPLE_CHAIN.rgpElement$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpElement$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SIMPLE_CHAIN.rgpElement$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTrustListInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTrustListInfo"));
    public static VarHandle pTrustListInfo$VH() {
        return _CERT_SIMPLE_CHAIN.pTrustListInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_TRUST_LIST_INFO pTrustListInfo;
     * }
     */
    public static MemorySegment pTrustListInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SIMPLE_CHAIN.pTrustListInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_TRUST_LIST_INFO pTrustListInfo;
     * }
     */
    public static void pTrustListInfo$set(MemorySegment seg, MemorySegment x) {
        _CERT_SIMPLE_CHAIN.pTrustListInfo$VH.set(seg, x);
    }
    public static MemorySegment pTrustListInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SIMPLE_CHAIN.pTrustListInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTrustListInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SIMPLE_CHAIN.pTrustListInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fHasRevocationFreshnessTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fHasRevocationFreshnessTime"));
    public static VarHandle fHasRevocationFreshnessTime$VH() {
        return _CERT_SIMPLE_CHAIN.fHasRevocationFreshnessTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fHasRevocationFreshnessTime;
     * }
     */
    public static int fHasRevocationFreshnessTime$get(MemorySegment seg) {
        return (int)_CERT_SIMPLE_CHAIN.fHasRevocationFreshnessTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fHasRevocationFreshnessTime;
     * }
     */
    public static void fHasRevocationFreshnessTime$set(MemorySegment seg, int x) {
        _CERT_SIMPLE_CHAIN.fHasRevocationFreshnessTime$VH.set(seg, x);
    }
    public static int fHasRevocationFreshnessTime$get(MemorySegment seg, long index) {
        return (int)_CERT_SIMPLE_CHAIN.fHasRevocationFreshnessTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fHasRevocationFreshnessTime$set(MemorySegment seg, long index, int x) {
        _CERT_SIMPLE_CHAIN.fHasRevocationFreshnessTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRevocationFreshnessTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRevocationFreshnessTime"));
    public static VarHandle dwRevocationFreshnessTime$VH() {
        return _CERT_SIMPLE_CHAIN.dwRevocationFreshnessTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwRevocationFreshnessTime;
     * }
     */
    public static int dwRevocationFreshnessTime$get(MemorySegment seg) {
        return (int)_CERT_SIMPLE_CHAIN.dwRevocationFreshnessTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwRevocationFreshnessTime;
     * }
     */
    public static void dwRevocationFreshnessTime$set(MemorySegment seg, int x) {
        _CERT_SIMPLE_CHAIN.dwRevocationFreshnessTime$VH.set(seg, x);
    }
    public static int dwRevocationFreshnessTime$get(MemorySegment seg, long index) {
        return (int)_CERT_SIMPLE_CHAIN.dwRevocationFreshnessTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRevocationFreshnessTime$set(MemorySegment seg, long index, int x) {
        _CERT_SIMPLE_CHAIN.dwRevocationFreshnessTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

