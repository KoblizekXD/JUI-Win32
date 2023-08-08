// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_PROTSEQ_ENDPOINT {
 *     unsigned char* RpcProtocolSequence;
 *     unsigned char* Endpoint;
 * };
 * }
 */
public class _RPC_PROTSEQ_ENDPOINT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("RpcProtocolSequence"),
        Constants$root.C_POINTER$LAYOUT.withName("Endpoint")
    ).withName("_RPC_PROTSEQ_ENDPOINT");
    public static MemoryLayout $LAYOUT() {
        return _RPC_PROTSEQ_ENDPOINT.$struct$LAYOUT;
    }
    static final VarHandle RpcProtocolSequence$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProtocolSequence"));
    public static VarHandle RpcProtocolSequence$VH() {
        return _RPC_PROTSEQ_ENDPOINT.RpcProtocolSequence$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* RpcProtocolSequence;
     * }
     */
    public static MemorySegment RpcProtocolSequence$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_PROTSEQ_ENDPOINT.RpcProtocolSequence$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* RpcProtocolSequence;
     * }
     */
    public static void RpcProtocolSequence$set(MemorySegment seg, MemorySegment x) {
        _RPC_PROTSEQ_ENDPOINT.RpcProtocolSequence$VH.set(seg, x);
    }
    public static MemorySegment RpcProtocolSequence$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_PROTSEQ_ENDPOINT.RpcProtocolSequence$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProtocolSequence$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_PROTSEQ_ENDPOINT.RpcProtocolSequence$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Endpoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Endpoint"));
    public static VarHandle Endpoint$VH() {
        return _RPC_PROTSEQ_ENDPOINT.Endpoint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char* Endpoint;
     * }
     */
    public static MemorySegment Endpoint$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_PROTSEQ_ENDPOINT.Endpoint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char* Endpoint;
     * }
     */
    public static void Endpoint$set(MemorySegment seg, MemorySegment x) {
        _RPC_PROTSEQ_ENDPOINT.Endpoint$VH.set(seg, x);
    }
    public static MemorySegment Endpoint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_PROTSEQ_ENDPOINT.Endpoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Endpoint$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_PROTSEQ_ENDPOINT.Endpoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

