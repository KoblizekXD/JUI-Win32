// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TOKEN_ACCESS_INFORMATION {
 *     PSID_AND_ATTRIBUTES_HASH SidHash;
 *     PSID_AND_ATTRIBUTES_HASH RestrictedSidHash;
 *     PTOKEN_PRIVILEGES Privileges;
 *     LUID AuthenticationId;
 *     TOKEN_TYPE TokenType;
 *     SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
 *     TOKEN_MANDATORY_POLICY MandatoryPolicy;
 *     DWORD Flags;
 *     DWORD AppContainerNumber;
 *     PSID PackageSid;
 *     PSID_AND_ATTRIBUTES_HASH CapabilitiesHash;
 *     PSID TrustLevelSid;
 *     PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes;
 * };
 * }
 */
public class _TOKEN_ACCESS_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("SidHash"),
        Constants$root.C_POINTER$LAYOUT.withName("RestrictedSidHash"),
        Constants$root.C_POINTER$LAYOUT.withName("Privileges"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("AuthenticationId"),
        Constants$root.C_LONG$LAYOUT.withName("TokenType"),
        Constants$root.C_LONG$LAYOUT.withName("ImpersonationLevel"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Policy")
        ).withName("MandatoryPolicy"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("AppContainerNumber"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("PackageSid"),
        Constants$root.C_POINTER$LAYOUT.withName("CapabilitiesHash"),
        Constants$root.C_POINTER$LAYOUT.withName("TrustLevelSid"),
        Constants$root.C_POINTER$LAYOUT.withName("SecurityAttributes")
    ).withName("_TOKEN_ACCESS_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_ACCESS_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle SidHash$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidHash"));
    public static VarHandle SidHash$VH() {
        return _TOKEN_ACCESS_INFORMATION.SidHash$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES_HASH SidHash;
     * }
     */
    public static MemorySegment SidHash$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.SidHash$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES_HASH SidHash;
     * }
     */
    public static void SidHash$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.SidHash$VH.set(seg, x);
    }
    public static MemorySegment SidHash$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.SidHash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidHash$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.SidHash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RestrictedSidHash$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RestrictedSidHash"));
    public static VarHandle RestrictedSidHash$VH() {
        return _TOKEN_ACCESS_INFORMATION.RestrictedSidHash$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES_HASH RestrictedSidHash;
     * }
     */
    public static MemorySegment RestrictedSidHash$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.RestrictedSidHash$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES_HASH RestrictedSidHash;
     * }
     */
    public static void RestrictedSidHash$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.RestrictedSidHash$VH.set(seg, x);
    }
    public static MemorySegment RestrictedSidHash$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.RestrictedSidHash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RestrictedSidHash$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.RestrictedSidHash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Privileges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Privileges"));
    public static VarHandle Privileges$VH() {
        return _TOKEN_ACCESS_INFORMATION.Privileges$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PTOKEN_PRIVILEGES Privileges;
     * }
     */
    public static MemorySegment Privileges$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.Privileges$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PTOKEN_PRIVILEGES Privileges;
     * }
     */
    public static void Privileges$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.Privileges$VH.set(seg, x);
    }
    public static MemorySegment Privileges$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.Privileges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Privileges$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.Privileges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AuthenticationId$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    static final VarHandle TokenType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TokenType"));
    public static VarHandle TokenType$VH() {
        return _TOKEN_ACCESS_INFORMATION.TokenType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * TOKEN_TYPE TokenType;
     * }
     */
    public static int TokenType$get(MemorySegment seg) {
        return (int)_TOKEN_ACCESS_INFORMATION.TokenType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * TOKEN_TYPE TokenType;
     * }
     */
    public static void TokenType$set(MemorySegment seg, int x) {
        _TOKEN_ACCESS_INFORMATION.TokenType$VH.set(seg, x);
    }
    public static int TokenType$get(MemorySegment seg, long index) {
        return (int)_TOKEN_ACCESS_INFORMATION.TokenType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TokenType$set(MemorySegment seg, long index, int x) {
        _TOKEN_ACCESS_INFORMATION.TokenType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImpersonationLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImpersonationLevel"));
    public static VarHandle ImpersonationLevel$VH() {
        return _TOKEN_ACCESS_INFORMATION.ImpersonationLevel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
     * }
     */
    public static int ImpersonationLevel$get(MemorySegment seg) {
        return (int)_TOKEN_ACCESS_INFORMATION.ImpersonationLevel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
     * }
     */
    public static void ImpersonationLevel$set(MemorySegment seg, int x) {
        _TOKEN_ACCESS_INFORMATION.ImpersonationLevel$VH.set(seg, x);
    }
    public static int ImpersonationLevel$get(MemorySegment seg, long index) {
        return (int)_TOKEN_ACCESS_INFORMATION.ImpersonationLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonationLevel$set(MemorySegment seg, long index, int x) {
        _TOKEN_ACCESS_INFORMATION.ImpersonationLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment MandatoryPolicy$slice(MemorySegment seg) {
        return seg.asSlice(40, 4);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _TOKEN_ACCESS_INFORMATION.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_TOKEN_ACCESS_INFORMATION.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _TOKEN_ACCESS_INFORMATION.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_TOKEN_ACCESS_INFORMATION.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _TOKEN_ACCESS_INFORMATION.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AppContainerNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AppContainerNumber"));
    public static VarHandle AppContainerNumber$VH() {
        return _TOKEN_ACCESS_INFORMATION.AppContainerNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AppContainerNumber;
     * }
     */
    public static int AppContainerNumber$get(MemorySegment seg) {
        return (int)_TOKEN_ACCESS_INFORMATION.AppContainerNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AppContainerNumber;
     * }
     */
    public static void AppContainerNumber$set(MemorySegment seg, int x) {
        _TOKEN_ACCESS_INFORMATION.AppContainerNumber$VH.set(seg, x);
    }
    public static int AppContainerNumber$get(MemorySegment seg, long index) {
        return (int)_TOKEN_ACCESS_INFORMATION.AppContainerNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AppContainerNumber$set(MemorySegment seg, long index, int x) {
        _TOKEN_ACCESS_INFORMATION.AppContainerNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PackageSid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PackageSid"));
    public static VarHandle PackageSid$VH() {
        return _TOKEN_ACCESS_INFORMATION.PackageSid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID PackageSid;
     * }
     */
    public static MemorySegment PackageSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.PackageSid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID PackageSid;
     * }
     */
    public static void PackageSid$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.PackageSid$VH.set(seg, x);
    }
    public static MemorySegment PackageSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.PackageSid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PackageSid$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.PackageSid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CapabilitiesHash$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CapabilitiesHash"));
    public static VarHandle CapabilitiesHash$VH() {
        return _TOKEN_ACCESS_INFORMATION.CapabilitiesHash$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES_HASH CapabilitiesHash;
     * }
     */
    public static MemorySegment CapabilitiesHash$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.CapabilitiesHash$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES_HASH CapabilitiesHash;
     * }
     */
    public static void CapabilitiesHash$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.CapabilitiesHash$VH.set(seg, x);
    }
    public static MemorySegment CapabilitiesHash$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.CapabilitiesHash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CapabilitiesHash$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.CapabilitiesHash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TrustLevelSid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TrustLevelSid"));
    public static VarHandle TrustLevelSid$VH() {
        return _TOKEN_ACCESS_INFORMATION.TrustLevelSid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID TrustLevelSid;
     * }
     */
    public static MemorySegment TrustLevelSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.TrustLevelSid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID TrustLevelSid;
     * }
     */
    public static void TrustLevelSid$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.TrustLevelSid$VH.set(seg, x);
    }
    public static MemorySegment TrustLevelSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.TrustLevelSid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TrustLevelSid$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.TrustLevelSid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityAttributes"));
    public static VarHandle SecurityAttributes$VH() {
        return _TOKEN_ACCESS_INFORMATION.SecurityAttributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes;
     * }
     */
    public static MemorySegment SecurityAttributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.SecurityAttributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes;
     * }
     */
    public static void SecurityAttributes$set(MemorySegment seg, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.SecurityAttributes$VH.set(seg, x);
    }
    public static MemorySegment SecurityAttributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TOKEN_ACCESS_INFORMATION.SecurityAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityAttributes$set(MemorySegment seg, long index, MemorySegment x) {
        _TOKEN_ACCESS_INFORMATION.SecurityAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


