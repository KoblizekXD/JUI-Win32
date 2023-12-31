// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_SELECT_CHAIN_PARA {
 *     HCERTCHAINENGINE hChainEngine;
 *     PFILETIME pTime;
 *     HCERTSTORE hAdditionalStore;
 *     PCERT_CHAIN_PARA pChainPara;
 *     DWORD dwFlags;
 * };
 * }
 */
public class _CERT_SELECT_CHAIN_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hChainEngine"),
        Constants$root.C_POINTER$LAYOUT.withName("pTime"),
        Constants$root.C_POINTER$LAYOUT.withName("hAdditionalStore"),
        Constants$root.C_POINTER$LAYOUT.withName("pChainPara"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CERT_SELECT_CHAIN_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_SELECT_CHAIN_PARA.$struct$LAYOUT;
    }
    static final VarHandle hChainEngine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hChainEngine"));
    public static VarHandle hChainEngine$VH() {
        return _CERT_SELECT_CHAIN_PARA.hChainEngine$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCERTCHAINENGINE hChainEngine;
     * }
     */
    public static MemorySegment hChainEngine$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.hChainEngine$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCERTCHAINENGINE hChainEngine;
     * }
     */
    public static void hChainEngine$set(MemorySegment seg, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.hChainEngine$VH.set(seg, x);
    }
    public static MemorySegment hChainEngine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.hChainEngine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hChainEngine$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.hChainEngine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTime"));
    public static VarHandle pTime$VH() {
        return _CERT_SELECT_CHAIN_PARA.pTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFILETIME pTime;
     * }
     */
    public static MemorySegment pTime$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.pTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFILETIME pTime;
     * }
     */
    public static void pTime$set(MemorySegment seg, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.pTime$VH.set(seg, x);
    }
    public static MemorySegment pTime$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.pTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTime$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.pTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hAdditionalStore$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hAdditionalStore"));
    public static VarHandle hAdditionalStore$VH() {
        return _CERT_SELECT_CHAIN_PARA.hAdditionalStore$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCERTSTORE hAdditionalStore;
     * }
     */
    public static MemorySegment hAdditionalStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.hAdditionalStore$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCERTSTORE hAdditionalStore;
     * }
     */
    public static void hAdditionalStore$set(MemorySegment seg, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.hAdditionalStore$VH.set(seg, x);
    }
    public static MemorySegment hAdditionalStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.hAdditionalStore$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hAdditionalStore$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.hAdditionalStore$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pChainPara$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pChainPara"));
    public static VarHandle pChainPara$VH() {
        return _CERT_SELECT_CHAIN_PARA.pChainPara$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_CHAIN_PARA pChainPara;
     * }
     */
    public static MemorySegment pChainPara$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.pChainPara$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_CHAIN_PARA pChainPara;
     * }
     */
    public static void pChainPara$set(MemorySegment seg, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.pChainPara$VH.set(seg, x);
    }
    public static MemorySegment pChainPara$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CHAIN_PARA.pChainPara$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pChainPara$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SELECT_CHAIN_PARA.pChainPara$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CERT_SELECT_CHAIN_PARA.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CERT_SELECT_CHAIN_PARA.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _CERT_SELECT_CHAIN_PARA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_SELECT_CHAIN_PARA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CERT_SELECT_CHAIN_PARA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


