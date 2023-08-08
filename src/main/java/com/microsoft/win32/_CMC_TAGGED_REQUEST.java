// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMC_TAGGED_REQUEST {
 *     DWORD dwTaggedRequestChoice;
 *     union {
 *         PCMC_TAGGED_CERT_REQUEST pTaggedCertRequest;
 *     };
 * };
 * }
 */
public class _CMC_TAGGED_REQUEST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwTaggedRequestChoice"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pTaggedCertRequest")
        ).withName("$anon$0")
    ).withName("_CMC_TAGGED_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _CMC_TAGGED_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle dwTaggedRequestChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTaggedRequestChoice"));
    public static VarHandle dwTaggedRequestChoice$VH() {
        return _CMC_TAGGED_REQUEST.dwTaggedRequestChoice$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwTaggedRequestChoice;
     * }
     */
    public static int dwTaggedRequestChoice$get(MemorySegment seg) {
        return (int)_CMC_TAGGED_REQUEST.dwTaggedRequestChoice$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwTaggedRequestChoice;
     * }
     */
    public static void dwTaggedRequestChoice$set(MemorySegment seg, int x) {
        _CMC_TAGGED_REQUEST.dwTaggedRequestChoice$VH.set(seg, x);
    }
    public static int dwTaggedRequestChoice$get(MemorySegment seg, long index) {
        return (int)_CMC_TAGGED_REQUEST.dwTaggedRequestChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTaggedRequestChoice$set(MemorySegment seg, long index, int x) {
        _CMC_TAGGED_REQUEST.dwTaggedRequestChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTaggedCertRequest$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pTaggedCertRequest"));
    public static VarHandle pTaggedCertRequest$VH() {
        return _CMC_TAGGED_REQUEST.pTaggedCertRequest$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMC_TAGGED_CERT_REQUEST pTaggedCertRequest;
     * }
     */
    public static MemorySegment pTaggedCertRequest$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMC_TAGGED_REQUEST.pTaggedCertRequest$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMC_TAGGED_CERT_REQUEST pTaggedCertRequest;
     * }
     */
    public static void pTaggedCertRequest$set(MemorySegment seg, MemorySegment x) {
        _CMC_TAGGED_REQUEST.pTaggedCertRequest$VH.set(seg, x);
    }
    public static MemorySegment pTaggedCertRequest$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMC_TAGGED_REQUEST.pTaggedCertRequest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTaggedCertRequest$set(MemorySegment seg, long index, MemorySegment x) {
        _CMC_TAGGED_REQUEST.pTaggedCertRequest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

