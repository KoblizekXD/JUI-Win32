// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W {
 *     RPC_AUTH_IDENTITY_HANDLE TransportCredentials;
 *     unsigned long Flags;
 *     unsigned long AuthenticationTarget;
 *     unsigned long NumberOfAuthnSchemes;
 *     unsigned long* AuthnSchemes;
 *     unsigned short* ServerCertificateSubject;
 *     RPC_AUTH_IDENTITY_HANDLE ProxyCredentials;
 *     unsigned long NumberOfProxyAuthnSchemes;
 *     unsigned long* ProxyAuthnSchemes;
 * };
 * }
 */
public class _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("TransportCredentials"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("AuthenticationTarget"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfAuthnSchemes"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("AuthnSchemes"),
        Constants$root.C_POINTER$LAYOUT.withName("ServerCertificateSubject"),
        Constants$root.C_POINTER$LAYOUT.withName("ProxyCredentials"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfProxyAuthnSchemes"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ProxyAuthnSchemes")
    ).withName("_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W");
    public static MemoryLayout $LAYOUT() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.$struct$LAYOUT;
    }
    static final VarHandle TransportCredentials$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransportCredentials"));
    public static VarHandle TransportCredentials$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.TransportCredentials$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_AUTH_IDENTITY_HANDLE TransportCredentials;
     * }
     */
    public static MemorySegment TransportCredentials$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.TransportCredentials$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_AUTH_IDENTITY_HANDLE TransportCredentials;
     * }
     */
    public static void TransportCredentials$set(MemorySegment seg, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.TransportCredentials$VH.set(seg, x);
    }
    public static MemorySegment TransportCredentials$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.TransportCredentials$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransportCredentials$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.TransportCredentials$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthenticationTarget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthenticationTarget"));
    public static VarHandle AuthenticationTarget$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthenticationTarget$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long AuthenticationTarget;
     * }
     */
    public static int AuthenticationTarget$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthenticationTarget$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long AuthenticationTarget;
     * }
     */
    public static void AuthenticationTarget$set(MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthenticationTarget$VH.set(seg, x);
    }
    public static int AuthenticationTarget$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthenticationTarget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthenticationTarget$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthenticationTarget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfAuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfAuthnSchemes"));
    public static VarHandle NumberOfAuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfAuthnSchemes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long NumberOfAuthnSchemes;
     * }
     */
    public static int NumberOfAuthnSchemes$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfAuthnSchemes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long NumberOfAuthnSchemes;
     * }
     */
    public static void NumberOfAuthnSchemes$set(MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfAuthnSchemes$VH.set(seg, x);
    }
    public static int NumberOfAuthnSchemes$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfAuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfAuthnSchemes$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfAuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AuthnSchemes"));
    public static VarHandle AuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthnSchemes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long* AuthnSchemes;
     * }
     */
    public static MemorySegment AuthnSchemes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthnSchemes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long* AuthnSchemes;
     * }
     */
    public static void AuthnSchemes$set(MemorySegment seg, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthnSchemes$VH.set(seg, x);
    }
    public static MemorySegment AuthnSchemes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthnSchemes$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.AuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerCertificateSubject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ServerCertificateSubject"));
    public static VarHandle ServerCertificateSubject$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ServerCertificateSubject$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short* ServerCertificateSubject;
     * }
     */
    public static MemorySegment ServerCertificateSubject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ServerCertificateSubject$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short* ServerCertificateSubject;
     * }
     */
    public static void ServerCertificateSubject$set(MemorySegment seg, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ServerCertificateSubject$VH.set(seg, x);
    }
    public static MemorySegment ServerCertificateSubject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ServerCertificateSubject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerCertificateSubject$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ServerCertificateSubject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProxyCredentials$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProxyCredentials"));
    public static VarHandle ProxyCredentials$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyCredentials$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_AUTH_IDENTITY_HANDLE ProxyCredentials;
     * }
     */
    public static MemorySegment ProxyCredentials$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyCredentials$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_AUTH_IDENTITY_HANDLE ProxyCredentials;
     * }
     */
    public static void ProxyCredentials$set(MemorySegment seg, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyCredentials$VH.set(seg, x);
    }
    public static MemorySegment ProxyCredentials$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyCredentials$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProxyCredentials$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyCredentials$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfProxyAuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfProxyAuthnSchemes"));
    public static VarHandle NumberOfProxyAuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfProxyAuthnSchemes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long NumberOfProxyAuthnSchemes;
     * }
     */
    public static int NumberOfProxyAuthnSchemes$get(MemorySegment seg) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfProxyAuthnSchemes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long NumberOfProxyAuthnSchemes;
     * }
     */
    public static void NumberOfProxyAuthnSchemes$set(MemorySegment seg, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfProxyAuthnSchemes$VH.set(seg, x);
    }
    public static int NumberOfProxyAuthnSchemes$get(MemorySegment seg, long index) {
        return (int)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfProxyAuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfProxyAuthnSchemes$set(MemorySegment seg, long index, int x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.NumberOfProxyAuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProxyAuthnSchemes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProxyAuthnSchemes"));
    public static VarHandle ProxyAuthnSchemes$VH() {
        return _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyAuthnSchemes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long* ProxyAuthnSchemes;
     * }
     */
    public static MemorySegment ProxyAuthnSchemes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyAuthnSchemes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long* ProxyAuthnSchemes;
     * }
     */
    public static void ProxyAuthnSchemes$set(MemorySegment seg, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyAuthnSchemes$VH.set(seg, x);
    }
    public static MemorySegment ProxyAuthnSchemes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyAuthnSchemes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProxyAuthnSchemes$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_W.ProxyAuthnSchemes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

