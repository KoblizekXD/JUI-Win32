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
 *     RPC_WSTR ProtSeq;
 *     RPC_WSTR Endpoint;
 *     void* SecurityDescriptor;
 *     unsigned long Backlog;
 * };
 * }
 */
public class RPC_ENDPOINT_TEMPLATEW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ProtSeq"),
        Constants$root.C_POINTER$LAYOUT.withName("Endpoint"),
        Constants$root.C_POINTER$LAYOUT.withName("SecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("Backlog"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_ENDPOINT_TEMPLATEW.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return RPC_ENDPOINT_TEMPLATEW.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        RPC_ENDPOINT_TEMPLATEW.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        RPC_ENDPOINT_TEMPLATEW.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProtSeq$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProtSeq"));
    public static VarHandle ProtSeq$VH() {
        return RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_WSTR ProtSeq;
     * }
     */
    public static MemorySegment ProtSeq$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_WSTR ProtSeq;
     * }
     */
    public static void ProtSeq$set(MemorySegment seg, MemorySegment x) {
        RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.set(seg, x);
    }
    public static MemorySegment ProtSeq$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProtSeq$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_ENDPOINT_TEMPLATEW.ProtSeq$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Endpoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Endpoint"));
    public static VarHandle Endpoint$VH() {
        return RPC_ENDPOINT_TEMPLATEW.Endpoint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * RPC_WSTR Endpoint;
     * }
     */
    public static MemorySegment Endpoint$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * RPC_WSTR Endpoint;
     * }
     */
    public static void Endpoint$set(MemorySegment seg, MemorySegment x) {
        RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.set(seg, x);
    }
    public static MemorySegment Endpoint$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Endpoint$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_ENDPOINT_TEMPLATEW.Endpoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityDescriptor"));
    public static VarHandle SecurityDescriptor$VH() {
        return RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* SecurityDescriptor;
     * }
     */
    public static MemorySegment SecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* SecurityDescriptor;
     * }
     */
    public static void SecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.set(seg, x);
    }
    public static MemorySegment SecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        RPC_ENDPOINT_TEMPLATEW.SecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Backlog$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Backlog"));
    public static VarHandle Backlog$VH() {
        return RPC_ENDPOINT_TEMPLATEW.Backlog$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Backlog;
     * }
     */
    public static int Backlog$get(MemorySegment seg) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Backlog$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Backlog;
     * }
     */
    public static void Backlog$set(MemorySegment seg, int x) {
        RPC_ENDPOINT_TEMPLATEW.Backlog$VH.set(seg, x);
    }
    public static int Backlog$get(MemorySegment seg, long index) {
        return (int)RPC_ENDPOINT_TEMPLATEW.Backlog$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Backlog$set(MemorySegment seg, long index, int x) {
        RPC_ENDPOINT_TEMPLATEW.Backlog$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


