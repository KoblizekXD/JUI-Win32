// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR {
 *     unsigned long BufferSize;
 *     char* Buffer;
 * };
 * }
 */
public class _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("BufferSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Buffer")
    ).withName("_RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle BufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
    public static VarHandle BufferSize$VH() {
        return _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.BufferSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long BufferSize;
     * }
     */
    public static int BufferSize$get(MemorySegment seg) {
        return (int)_RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.BufferSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long BufferSize;
     * }
     */
    public static void BufferSize$set(MemorySegment seg, int x) {
        _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.BufferSize$VH.set(seg, x);
    }
    public static int BufferSize$get(MemorySegment seg, long index) {
        return (int)_RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.BufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, int x) {
        _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.BufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.Buffer$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* Buffer;
     * }
     */
    public static MemorySegment Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.Buffer$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* Buffer;
     * }
     */
    public static void Buffer$set(MemorySegment seg, MemorySegment x) {
        _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.Buffer$VH.set(seg, x);
    }
    public static MemorySegment Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemorySegment x) {
        _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

