// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_POLICY_ID {
 *     DWORD cCertPolicyElementId;
 *     LPSTR* rgpszCertPolicyElementId;
 * };
 * }
 */
public class _CERT_POLICY_ID {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cCertPolicyElementId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszCertPolicyElementId")
    ).withName("_CERT_POLICY_ID");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_ID.$struct$LAYOUT;
    }
    static final VarHandle cCertPolicyElementId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCertPolicyElementId"));
    public static VarHandle cCertPolicyElementId$VH() {
        return _CERT_POLICY_ID.cCertPolicyElementId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cCertPolicyElementId;
     * }
     */
    public static int cCertPolicyElementId$get(MemorySegment seg) {
        return (int)_CERT_POLICY_ID.cCertPolicyElementId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cCertPolicyElementId;
     * }
     */
    public static void cCertPolicyElementId$set(MemorySegment seg, int x) {
        _CERT_POLICY_ID.cCertPolicyElementId$VH.set(seg, x);
    }
    public static int cCertPolicyElementId$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICY_ID.cCertPolicyElementId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCertPolicyElementId$set(MemorySegment seg, long index, int x) {
        _CERT_POLICY_ID.cCertPolicyElementId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszCertPolicyElementId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszCertPolicyElementId"));
    public static VarHandle rgpszCertPolicyElementId$VH() {
        return _CERT_POLICY_ID.rgpszCertPolicyElementId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR* rgpszCertPolicyElementId;
     * }
     */
    public static MemorySegment rgpszCertPolicyElementId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICY_ID.rgpszCertPolicyElementId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR* rgpszCertPolicyElementId;
     * }
     */
    public static void rgpszCertPolicyElementId$set(MemorySegment seg, MemorySegment x) {
        _CERT_POLICY_ID.rgpszCertPolicyElementId$VH.set(seg, x);
    }
    public static MemorySegment rgpszCertPolicyElementId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICY_ID.rgpszCertPolicyElementId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszCertPolicyElementId$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_POLICY_ID.rgpszCertPolicyElementId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


