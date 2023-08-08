// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_BINDING_HANDLE_SECURITY_V1_A {
 *     unsigned long Version;
 *     unsigned char* ServerPrincName;
 *     unsigned long AuthnLevel;
 *     unsigned long AuthnSvc;
 *     SEC_WINNT_AUTH_IDENTITY_A* AuthIdentity;
 *     RPC_SECURITY_QOS* SecurityQos;
 * };
 * }
 */
public class _RPC_BINDING_HANDLE_SECURITY_V1_A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ServerPrincName"),
        Constants$root.C_LONG$LAYOUT.withName("AuthnLevel"),
        Constants$root.C_LONG$LAYOUT.withName("AuthnSvc"),
        Constants$root.C_POINTER$LAYOUT.withName("AuthIdentity"),
        Constants$root.C_POINTER$LAYOUT.withName("SecurityQos")
    ).withName("_RPC_BINDING_HANDLE_SECURITY_V1_A");
    public static MemoryLayout $LAYOUT() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_RPC_BINDING_HANDLE_SECURITY_V1_A.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_RPC_BINDING_HANDLE_SECURITY_V1_A.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPrincName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerPrincName"));
    public static VarHandle ServerPrincName$VH() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.ServerPrincName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* ServerPrincName;
     * }
     */
    public static MemorySegment ServerPrincName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_SECURITY_V1_A.ServerPrincName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* ServerPrincName;
     * }
     */
    public static void ServerPrincName$set(MemorySegment seg, MemorySegment x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.ServerPrincName$VH.set(seg, x);
    }
    public static MemorySegment ServerPrincName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_SECURITY_V1_A.ServerPrincName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincName$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.ServerPrincName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthnLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthnLevel"));
    public static VarHandle AuthnLevel$VH() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnLevel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long AuthnLevel;
     * }
     */
    public static int AuthnLevel$get(MemorySegment seg) {
        return (int)_RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnLevel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long AuthnLevel;
     * }
     */
    public static void AuthnLevel$set(MemorySegment seg, int x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnLevel$VH.set(seg, x);
    }
    public static int AuthnLevel$get(MemorySegment seg, long index) {
        return (int)_RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthnLevel$set(MemorySegment seg, long index, int x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthnSvc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthnSvc"));
    public static VarHandle AuthnSvc$VH() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnSvc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long AuthnSvc;
     * }
     */
    public static int AuthnSvc$get(MemorySegment seg) {
        return (int)_RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnSvc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long AuthnSvc;
     * }
     */
    public static void AuthnSvc$set(MemorySegment seg, int x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnSvc$VH.set(seg, x);
    }
    public static int AuthnSvc$get(MemorySegment seg, long index) {
        return (int)_RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnSvc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthnSvc$set(MemorySegment seg, long index, int x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthnSvc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthIdentity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthIdentity"));
    public static VarHandle AuthIdentity$VH() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthIdentity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SEC_WINNT_AUTH_IDENTITY_A* AuthIdentity;
     * }
     */
    public static MemorySegment AuthIdentity$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_SECURITY_V1_A.AuthIdentity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SEC_WINNT_AUTH_IDENTITY_A* AuthIdentity;
     * }
     */
    public static void AuthIdentity$set(MemorySegment seg, MemorySegment x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthIdentity$VH.set(seg, x);
    }
    public static MemorySegment AuthIdentity$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_SECURITY_V1_A.AuthIdentity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthIdentity$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.AuthIdentity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityQos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityQos"));
    public static VarHandle SecurityQos$VH() {
        return _RPC_BINDING_HANDLE_SECURITY_V1_A.SecurityQos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_SECURITY_QOS* SecurityQos;
     * }
     */
    public static MemorySegment SecurityQos$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_SECURITY_V1_A.SecurityQos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_SECURITY_QOS* SecurityQos;
     * }
     */
    public static void SecurityQos$set(MemorySegment seg, MemorySegment x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.SecurityQos$VH.set(seg, x);
    }
    public static MemorySegment SecurityQos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_BINDING_HANDLE_SECURITY_V1_A.SecurityQos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityQos$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_BINDING_HANDLE_SECURITY_V1_A.SecurityQos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

