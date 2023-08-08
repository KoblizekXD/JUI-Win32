// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _REDIRECTION_FUNCTION_DESCRIPTOR {
 *     PCSTR DllName;
 *     PCSTR FunctionName;
 *     PVOID RedirectionTarget;
 * };
 * }
 */
public class _REDIRECTION_FUNCTION_DESCRIPTOR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("DllName"),
        Constants$root.C_POINTER$LAYOUT.withName("FunctionName"),
        Constants$root.C_POINTER$LAYOUT.withName("RedirectionTarget")
    ).withName("_REDIRECTION_FUNCTION_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _REDIRECTION_FUNCTION_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle DllName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DllName"));
    public static VarHandle DllName$VH() {
        return _REDIRECTION_FUNCTION_DESCRIPTOR.DllName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCSTR DllName;
     * }
     */
    public static MemorySegment DllName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REDIRECTION_FUNCTION_DESCRIPTOR.DllName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCSTR DllName;
     * }
     */
    public static void DllName$set(MemorySegment seg, MemorySegment x) {
        _REDIRECTION_FUNCTION_DESCRIPTOR.DllName$VH.set(seg, x);
    }
    public static MemorySegment DllName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REDIRECTION_FUNCTION_DESCRIPTOR.DllName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DllName$set(MemorySegment seg, long index, MemorySegment x) {
        _REDIRECTION_FUNCTION_DESCRIPTOR.DllName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FunctionName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FunctionName"));
    public static VarHandle FunctionName$VH() {
        return _REDIRECTION_FUNCTION_DESCRIPTOR.FunctionName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCSTR FunctionName;
     * }
     */
    public static MemorySegment FunctionName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REDIRECTION_FUNCTION_DESCRIPTOR.FunctionName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCSTR FunctionName;
     * }
     */
    public static void FunctionName$set(MemorySegment seg, MemorySegment x) {
        _REDIRECTION_FUNCTION_DESCRIPTOR.FunctionName$VH.set(seg, x);
    }
    public static MemorySegment FunctionName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REDIRECTION_FUNCTION_DESCRIPTOR.FunctionName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FunctionName$set(MemorySegment seg, long index, MemorySegment x) {
        _REDIRECTION_FUNCTION_DESCRIPTOR.FunctionName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RedirectionTarget$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RedirectionTarget"));
    public static VarHandle RedirectionTarget$VH() {
        return _REDIRECTION_FUNCTION_DESCRIPTOR.RedirectionTarget$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID RedirectionTarget;
     * }
     */
    public static MemorySegment RedirectionTarget$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REDIRECTION_FUNCTION_DESCRIPTOR.RedirectionTarget$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID RedirectionTarget;
     * }
     */
    public static void RedirectionTarget$set(MemorySegment seg, MemorySegment x) {
        _REDIRECTION_FUNCTION_DESCRIPTOR.RedirectionTarget$VH.set(seg, x);
    }
    public static MemorySegment RedirectionTarget$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REDIRECTION_FUNCTION_DESCRIPTOR.RedirectionTarget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RedirectionTarget$set(MemorySegment seg, long index, MemorySegment x) {
        _REDIRECTION_FUNCTION_DESCRIPTOR.RedirectionTarget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


