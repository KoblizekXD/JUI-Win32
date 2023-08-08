// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_KEY_USAGE_RESTRICTION_INFO {
 *     DWORD cCertPolicyId;
 *     PCERT_POLICY_ID rgCertPolicyId;
 *     CRYPT_BIT_BLOB RestrictedKeyUsage;
 * };
 * }
 */
public class _CERT_KEY_USAGE_RESTRICTION_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cCertPolicyId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgCertPolicyId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("RestrictedKeyUsage")
    ).withName("_CERT_KEY_USAGE_RESTRICTION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_KEY_USAGE_RESTRICTION_INFO.$struct$LAYOUT;
    }
    static final VarHandle cCertPolicyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cCertPolicyId"));
    public static VarHandle cCertPolicyId$VH() {
        return _CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cCertPolicyId;
     * }
     */
    public static int cCertPolicyId$get(MemorySegment seg) {
        return (int)_CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cCertPolicyId;
     * }
     */
    public static void cCertPolicyId$set(MemorySegment seg, int x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.set(seg, x);
    }
    public static int cCertPolicyId$get(MemorySegment seg, long index) {
        return (int)_CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cCertPolicyId$set(MemorySegment seg, long index, int x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.cCertPolicyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgCertPolicyId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgCertPolicyId"));
    public static VarHandle rgCertPolicyId$VH() {
        return _CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_POLICY_ID rgCertPolicyId;
     * }
     */
    public static MemorySegment rgCertPolicyId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_POLICY_ID rgCertPolicyId;
     * }
     */
    public static void rgCertPolicyId$set(MemorySegment seg, MemorySegment x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.set(seg, x);
    }
    public static MemorySegment rgCertPolicyId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCertPolicyId$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_KEY_USAGE_RESTRICTION_INFO.rgCertPolicyId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RestrictedKeyUsage$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

