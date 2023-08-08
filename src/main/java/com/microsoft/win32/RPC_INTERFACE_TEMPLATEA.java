// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     unsigned long Version;
 *     RPC_IF_HANDLE IfSpec;
 *     UUID* MgrTypeUuid;
 *     void* MgrEpv;
 *     unsigned int Flags;
 *     unsigned int MaxCalls;
 *     unsigned int MaxRpcSize;
 *     RPC_STATUS (*IfCallback)(RPC_IF_HANDLE,void*);
 *     UUID_VECTOR* UuidVector;
 *     RPC_CSTR Annotation;
 *     void* SecurityDescriptor;
 * };
 * }
 */
public class RPC_INTERFACE_TEMPLATEA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("IfSpec"),
        Constants$root.C_POINTER$LAYOUT.withName("MgrTypeUuid"),
        Constants$root.C_POINTER$LAYOUT.withName("MgrEpv"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("MaxCalls"),
        Constants$root.C_LONG$LAYOUT.withName("MaxRpcSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("IfCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("UuidVector"),
        Constants$root.C_POINTER$LAYOUT.withName("Annotation"),
        Constants$root.C_POINTER$LAYOUT.withName("SecurityDescriptor")
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_INTERFACE_TEMPLATEA.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return RPC_INTERFACE_TEMPLATEA.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEA.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEA.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEA.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEA.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IfSpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IfSpec"));
    public static VarHandle IfSpec$VH() {
        return RPC_INTERFACE_TEMPLATEA.IfSpec$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_IF_HANDLE IfSpec;
     * }
     */
    public static MemorySegment IfSpec$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.IfSpec$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_IF_HANDLE IfSpec;
     * }
     */
    public static void IfSpec$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.IfSpec$VH.set(seg, x);
    }
    public static MemorySegment IfSpec$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.IfSpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IfSpec$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.IfSpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MgrTypeUuid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MgrTypeUuid"));
    public static VarHandle MgrTypeUuid$VH() {
        return RPC_INTERFACE_TEMPLATEA.MgrTypeUuid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UUID* MgrTypeUuid;
     * }
     */
    public static MemorySegment MgrTypeUuid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.MgrTypeUuid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UUID* MgrTypeUuid;
     * }
     */
    public static void MgrTypeUuid$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.MgrTypeUuid$VH.set(seg, x);
    }
    public static MemorySegment MgrTypeUuid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.MgrTypeUuid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MgrTypeUuid$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.MgrTypeUuid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MgrEpv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MgrEpv"));
    public static VarHandle MgrEpv$VH() {
        return RPC_INTERFACE_TEMPLATEA.MgrEpv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* MgrEpv;
     * }
     */
    public static MemorySegment MgrEpv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.MgrEpv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* MgrEpv;
     * }
     */
    public static void MgrEpv$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.MgrEpv$VH.set(seg, x);
    }
    public static MemorySegment MgrEpv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.MgrEpv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MgrEpv$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.MgrEpv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return RPC_INTERFACE_TEMPLATEA.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEA.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxCalls$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxCalls"));
    public static VarHandle MaxCalls$VH() {
        return RPC_INTERFACE_TEMPLATEA.MaxCalls$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int MaxCalls;
     * }
     */
    public static int MaxCalls$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEA.MaxCalls$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int MaxCalls;
     * }
     */
    public static void MaxCalls$set(MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEA.MaxCalls$VH.set(seg, x);
    }
    public static int MaxCalls$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEA.MaxCalls$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCalls$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEA.MaxCalls$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxRpcSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxRpcSize"));
    public static VarHandle MaxRpcSize$VH() {
        return RPC_INTERFACE_TEMPLATEA.MaxRpcSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int MaxRpcSize;
     * }
     */
    public static int MaxRpcSize$get(MemorySegment seg) {
        return (int)RPC_INTERFACE_TEMPLATEA.MaxRpcSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int MaxRpcSize;
     * }
     */
    public static void MaxRpcSize$set(MemorySegment seg, int x) {
        RPC_INTERFACE_TEMPLATEA.MaxRpcSize$VH.set(seg, x);
    }
    public static int MaxRpcSize$get(MemorySegment seg, long index) {
        return (int)RPC_INTERFACE_TEMPLATEA.MaxRpcSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxRpcSize$set(MemorySegment seg, long index, int x) {
        RPC_INTERFACE_TEMPLATEA.MaxRpcSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor IfCallback$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor IfCallback_UP$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IfCallback_UP$MH = RuntimeHelper.upcallHandle(IfCallback.class, "apply", RPC_INTERFACE_TEMPLATEA.IfCallback_UP$FUNC);
    static final FunctionDescriptor IfCallback_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IfCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        RPC_INTERFACE_TEMPLATEA.IfCallback_DOWN$FUNC
    );
    /**
     * {@snippet :
 * RPC_STATUS (*IfCallback)(RPC_IF_HANDLE,void*);
     * }
     */
    public interface IfCallback {

        int apply(java.lang.foreign.MemorySegment InterfaceUuid, java.lang.foreign.MemorySegment Context);
        static MemorySegment allocate(IfCallback fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(RPC_INTERFACE_TEMPLATEA.IfCallback_UP$MH, fi, RPC_INTERFACE_TEMPLATEA.IfCallback$FUNC, scope);
        }
        static IfCallback ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _InterfaceUuid, java.lang.foreign.MemorySegment _Context) -> {
                try {
                    return (int)RPC_INTERFACE_TEMPLATEA.IfCallback_DOWN$MH.invokeExact(symbol, _InterfaceUuid, _Context);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IfCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IfCallback"));
    public static VarHandle IfCallback$VH() {
        return RPC_INTERFACE_TEMPLATEA.IfCallback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_STATUS (*IfCallback)(RPC_IF_HANDLE,void*);
     * }
     */
    public static MemorySegment IfCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.IfCallback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_STATUS (*IfCallback)(RPC_IF_HANDLE,void*);
     * }
     */
    public static void IfCallback$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.IfCallback$VH.set(seg, x);
    }
    public static MemorySegment IfCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.IfCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IfCallback$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.IfCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IfCallback IfCallback(MemorySegment segment, SegmentScope scope) {
        return IfCallback.ofAddress(IfCallback$get(segment), scope);
    }
    static final VarHandle UuidVector$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UuidVector"));
    public static VarHandle UuidVector$VH() {
        return RPC_INTERFACE_TEMPLATEA.UuidVector$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UUID_VECTOR* UuidVector;
     * }
     */
    public static MemorySegment UuidVector$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.UuidVector$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UUID_VECTOR* UuidVector;
     * }
     */
    public static void UuidVector$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.UuidVector$VH.set(seg, x);
    }
    public static MemorySegment UuidVector$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.UuidVector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UuidVector$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.UuidVector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Annotation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Annotation"));
    public static VarHandle Annotation$VH() {
        return RPC_INTERFACE_TEMPLATEA.Annotation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_CSTR Annotation;
     * }
     */
    public static MemorySegment Annotation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.Annotation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_CSTR Annotation;
     * }
     */
    public static void Annotation$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.Annotation$VH.set(seg, x);
    }
    public static MemorySegment Annotation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.Annotation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Annotation$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.Annotation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityDescriptor"));
    public static VarHandle SecurityDescriptor$VH() {
        return RPC_INTERFACE_TEMPLATEA.SecurityDescriptor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* SecurityDescriptor;
     * }
     */
    public static MemorySegment SecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.SecurityDescriptor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* SecurityDescriptor;
     * }
     */
    public static void SecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.SecurityDescriptor$VH.set(seg, x);
    }
    public static MemorySegment SecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_INTERFACE_TEMPLATEA.SecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_INTERFACE_TEMPLATEA.SecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


