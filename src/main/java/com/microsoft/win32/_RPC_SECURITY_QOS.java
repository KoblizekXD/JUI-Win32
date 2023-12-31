// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_SECURITY_QOS {
 *     unsigned long Version;
 *     unsigned long Capabilities;
 *     unsigned long IdentityTracking;
 *     unsigned long ImpersonationType;
 * };
 * }
 */
public class _RPC_SECURITY_QOS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Capabilities"),
        Constants$root.C_LONG$LAYOUT.withName("IdentityTracking"),
        Constants$root.C_LONG$LAYOUT.withName("ImpersonationType")
    ).withName("_RPC_SECURITY_QOS");
    public static MemoryLayout $LAYOUT() {
        return _RPC_SECURITY_QOS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _RPC_SECURITY_QOS.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Capabilities$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Capabilities"));
    public static VarHandle Capabilities$VH() {
        return _RPC_SECURITY_QOS.Capabilities$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Capabilities;
     * }
     */
    public static int Capabilities$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.Capabilities$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Capabilities;
     * }
     */
    public static void Capabilities$set(MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.Capabilities$VH.set(seg, x);
    }
    public static int Capabilities$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.Capabilities$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Capabilities$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.Capabilities$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdentityTracking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdentityTracking"));
    public static VarHandle IdentityTracking$VH() {
        return _RPC_SECURITY_QOS.IdentityTracking$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long IdentityTracking;
     * }
     */
    public static int IdentityTracking$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.IdentityTracking$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long IdentityTracking;
     * }
     */
    public static void IdentityTracking$set(MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.IdentityTracking$VH.set(seg, x);
    }
    public static int IdentityTracking$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.IdentityTracking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdentityTracking$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.IdentityTracking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImpersonationType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImpersonationType"));
    public static VarHandle ImpersonationType$VH() {
        return _RPC_SECURITY_QOS.ImpersonationType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ImpersonationType;
     * }
     */
    public static int ImpersonationType$get(MemorySegment seg) {
        return (int)_RPC_SECURITY_QOS.ImpersonationType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ImpersonationType;
     * }
     */
    public static void ImpersonationType$set(MemorySegment seg, int x) {
        _RPC_SECURITY_QOS.ImpersonationType$VH.set(seg, x);
    }
    public static int ImpersonationType$get(MemorySegment seg, long index) {
        return (int)_RPC_SECURITY_QOS.ImpersonationType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonationType$set(MemorySegment seg, long index, int x) {
        _RPC_SECURITY_QOS.ImpersonationType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


