// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagI_RpcProxyCallbackInterface {
 *     I_RpcProxyIsValidMachineFn IsValidMachineFn;
 *     I_RpcProxyGetClientAddressFn GetClientAddressFn;
 *     I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn;
 *     I_RpcPerformCalloutFn PerformCalloutFn;
 *     I_RpcFreeCalloutStateFn FreeCalloutStateFn;
 *     I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn;
 *     I_RpcProxyFilterIfFn ProxyFilterIfFn;
 *     I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn;
 *     I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn;
 * };
 * }
 */
public class tagI_RpcProxyCallbackInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("IsValidMachineFn"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClientAddressFn"),
        Constants$root.C_POINTER$LAYOUT.withName("GetConnectionTimeoutFn"),
        Constants$root.C_POINTER$LAYOUT.withName("PerformCalloutFn"),
        Constants$root.C_POINTER$LAYOUT.withName("FreeCalloutStateFn"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClientSessionAndResourceUUIDFn"),
        Constants$root.C_POINTER$LAYOUT.withName("ProxyFilterIfFn"),
        Constants$root.C_POINTER$LAYOUT.withName("RpcProxyUpdatePerfCounterFn"),
        Constants$root.C_POINTER$LAYOUT.withName("RpcProxyUpdatePerfCounterBackendServerFn")
    ).withName("tagI_RpcProxyCallbackInterface");
    public static MemoryLayout $LAYOUT() {
        return tagI_RpcProxyCallbackInterface.$struct$LAYOUT;
    }
    static final VarHandle IsValidMachineFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsValidMachineFn"));
    public static VarHandle IsValidMachineFn$VH() {
        return tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyIsValidMachineFn IsValidMachineFn;
     * }
     */
    public static MemorySegment IsValidMachineFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyIsValidMachineFn IsValidMachineFn;
     * }
     */
    public static void IsValidMachineFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.set(seg, x);
    }
    public static MemorySegment IsValidMachineFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsValidMachineFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyIsValidMachineFn IsValidMachineFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyIsValidMachineFn.ofAddress(IsValidMachineFn$get(segment), scope);
    }
    static final VarHandle GetClientAddressFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClientAddressFn"));
    public static VarHandle GetClientAddressFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyGetClientAddressFn GetClientAddressFn;
     * }
     */
    public static MemorySegment GetClientAddressFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyGetClientAddressFn GetClientAddressFn;
     * }
     */
    public static void GetClientAddressFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.set(seg, x);
    }
    public static MemorySegment GetClientAddressFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClientAddressFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetClientAddressFn GetClientAddressFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyGetClientAddressFn.ofAddress(GetClientAddressFn$get(segment), scope);
    }
    static final VarHandle GetConnectionTimeoutFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetConnectionTimeoutFn"));
    public static VarHandle GetConnectionTimeoutFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn;
     * }
     */
    public static MemorySegment GetConnectionTimeoutFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn;
     * }
     */
    public static void GetConnectionTimeoutFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.set(seg, x);
    }
    public static MemorySegment GetConnectionTimeoutFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetConnectionTimeoutFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyGetConnectionTimeoutFn.ofAddress(GetConnectionTimeoutFn$get(segment), scope);
    }
    static final VarHandle PerformCalloutFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PerformCalloutFn"));
    public static VarHandle PerformCalloutFn$VH() {
        return tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcPerformCalloutFn PerformCalloutFn;
     * }
     */
    public static MemorySegment PerformCalloutFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcPerformCalloutFn PerformCalloutFn;
     * }
     */
    public static void PerformCalloutFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.set(seg, x);
    }
    public static MemorySegment PerformCalloutFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PerformCalloutFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcPerformCalloutFn PerformCalloutFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcPerformCalloutFn.ofAddress(PerformCalloutFn$get(segment), scope);
    }
    static final VarHandle FreeCalloutStateFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FreeCalloutStateFn"));
    public static VarHandle FreeCalloutStateFn$VH() {
        return tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcFreeCalloutStateFn FreeCalloutStateFn;
     * }
     */
    public static MemorySegment FreeCalloutStateFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcFreeCalloutStateFn FreeCalloutStateFn;
     * }
     */
    public static void FreeCalloutStateFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.set(seg, x);
    }
    public static MemorySegment FreeCalloutStateFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeCalloutStateFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcFreeCalloutStateFn FreeCalloutStateFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcFreeCalloutStateFn.ofAddress(FreeCalloutStateFn$get(segment), scope);
    }
    static final VarHandle GetClientSessionAndResourceUUIDFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClientSessionAndResourceUUIDFn"));
    public static VarHandle GetClientSessionAndResourceUUIDFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn;
     * }
     */
    public static MemorySegment GetClientSessionAndResourceUUIDFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn;
     * }
     */
    public static void GetClientSessionAndResourceUUIDFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.set(seg, x);
    }
    public static MemorySegment GetClientSessionAndResourceUUIDFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClientSessionAndResourceUUIDFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyGetClientSessionAndResourceUUID.ofAddress(GetClientSessionAndResourceUUIDFn$get(segment), scope);
    }
    static final VarHandle ProxyFilterIfFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProxyFilterIfFn"));
    public static VarHandle ProxyFilterIfFn$VH() {
        return tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyFilterIfFn ProxyFilterIfFn;
     * }
     */
    public static MemorySegment ProxyFilterIfFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyFilterIfFn ProxyFilterIfFn;
     * }
     */
    public static void ProxyFilterIfFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.set(seg, x);
    }
    public static MemorySegment ProxyFilterIfFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProxyFilterIfFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyFilterIfFn ProxyFilterIfFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyFilterIfFn.ofAddress(ProxyFilterIfFn$get(segment), scope);
    }
    static final VarHandle RpcProxyUpdatePerfCounterFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProxyUpdatePerfCounterFn"));
    public static VarHandle RpcProxyUpdatePerfCounterFn$VH() {
        return tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn;
     * }
     */
    public static MemorySegment RpcProxyUpdatePerfCounterFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn;
     * }
     */
    public static void RpcProxyUpdatePerfCounterFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.set(seg, x);
    }
    public static MemorySegment RpcProxyUpdatePerfCounterFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProxyUpdatePerfCounterFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyUpdatePerfCounterFn.ofAddress(RpcProxyUpdatePerfCounterFn$get(segment), scope);
    }
    static final VarHandle RpcProxyUpdatePerfCounterBackendServerFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProxyUpdatePerfCounterBackendServerFn"));
    public static VarHandle RpcProxyUpdatePerfCounterBackendServerFn$VH() {
        return tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn;
     * }
     */
    public static MemorySegment RpcProxyUpdatePerfCounterBackendServerFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn;
     * }
     */
    public static void RpcProxyUpdatePerfCounterBackendServerFn$set(MemorySegment seg, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.set(seg, x);
    }
    public static MemorySegment RpcProxyUpdatePerfCounterBackendServerFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProxyUpdatePerfCounterBackendServerFn$set(MemorySegment seg, long index, MemorySegment x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn(MemorySegment segment, SegmentScope scope) {
        return I_RpcProxyUpdatePerfCounterBackendServerFn.ofAddress(RpcProxyUpdatePerfCounterBackendServerFn$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


