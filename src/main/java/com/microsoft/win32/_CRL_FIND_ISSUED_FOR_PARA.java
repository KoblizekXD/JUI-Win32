// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRL_FIND_ISSUED_FOR_PARA {
 *     PCCERT_CONTEXT pSubjectCert;
 *     PCCERT_CONTEXT pIssuerCert;
 * };
 * }
 */
public class _CRL_FIND_ISSUED_FOR_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pSubjectCert"),
        Constants$root.C_POINTER$LAYOUT.withName("pIssuerCert")
    ).withName("_CRL_FIND_ISSUED_FOR_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRL_FIND_ISSUED_FOR_PARA.$struct$LAYOUT;
    }
    static final VarHandle pSubjectCert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSubjectCert"));
    public static VarHandle pSubjectCert$VH() {
        return _CRL_FIND_ISSUED_FOR_PARA.pSubjectCert$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCERT_CONTEXT pSubjectCert;
     * }
     */
    public static MemorySegment pSubjectCert$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRL_FIND_ISSUED_FOR_PARA.pSubjectCert$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCERT_CONTEXT pSubjectCert;
     * }
     */
    public static void pSubjectCert$set(MemorySegment seg, MemorySegment x) {
        _CRL_FIND_ISSUED_FOR_PARA.pSubjectCert$VH.set(seg, x);
    }
    public static MemorySegment pSubjectCert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRL_FIND_ISSUED_FOR_PARA.pSubjectCert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSubjectCert$set(MemorySegment seg, long index, MemorySegment x) {
        _CRL_FIND_ISSUED_FOR_PARA.pSubjectCert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pIssuerCert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pIssuerCert"));
    public static VarHandle pIssuerCert$VH() {
        return _CRL_FIND_ISSUED_FOR_PARA.pIssuerCert$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCERT_CONTEXT pIssuerCert;
     * }
     */
    public static MemorySegment pIssuerCert$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRL_FIND_ISSUED_FOR_PARA.pIssuerCert$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCERT_CONTEXT pIssuerCert;
     * }
     */
    public static void pIssuerCert$set(MemorySegment seg, MemorySegment x) {
        _CRL_FIND_ISSUED_FOR_PARA.pIssuerCert$VH.set(seg, x);
    }
    public static MemorySegment pIssuerCert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRL_FIND_ISSUED_FOR_PARA.pIssuerCert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pIssuerCert$set(MemorySegment seg, long index, MemorySegment x) {
        _CRL_FIND_ISSUED_FOR_PARA.pIssuerCert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


