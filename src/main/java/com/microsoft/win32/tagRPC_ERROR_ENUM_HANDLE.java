// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagRPC_ERROR_ENUM_HANDLE {
 *     ULONG Signature;
 *     void* CurrentPos;
 *     void* Head;
 * };
 * }
 */
public class tagRPC_ERROR_ENUM_HANDLE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Signature"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("CurrentPos"),
        Constants$root.C_POINTER$LAYOUT.withName("Head")
    ).withName("tagRPC_ERROR_ENUM_HANDLE");
    public static MemoryLayout $LAYOUT() {
        return tagRPC_ERROR_ENUM_HANDLE.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return tagRPC_ERROR_ENUM_HANDLE.Signature$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Signature;
     * }
     */
    public static int Signature$get(MemorySegment seg) {
        return (int)tagRPC_ERROR_ENUM_HANDLE.Signature$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Signature;
     * }
     */
    public static void Signature$set(MemorySegment seg, int x) {
        tagRPC_ERROR_ENUM_HANDLE.Signature$VH.set(seg, x);
    }
    public static int Signature$get(MemorySegment seg, long index) {
        return (int)tagRPC_ERROR_ENUM_HANDLE.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, int x) {
        tagRPC_ERROR_ENUM_HANDLE.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CurrentPos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentPos"));
    public static VarHandle CurrentPos$VH() {
        return tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* CurrentPos;
     * }
     */
    public static MemorySegment CurrentPos$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* CurrentPos;
     * }
     */
    public static void CurrentPos$set(MemorySegment seg, MemorySegment x) {
        tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.set(seg, x);
    }
    public static MemorySegment CurrentPos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentPos$set(MemorySegment seg, long index, MemorySegment x) {
        tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Head"));
    public static VarHandle Head$VH() {
        return tagRPC_ERROR_ENUM_HANDLE.Head$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* Head;
     * }
     */
    public static MemorySegment Head$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagRPC_ERROR_ENUM_HANDLE.Head$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* Head;
     * }
     */
    public static void Head$set(MemorySegment seg, MemorySegment x) {
        tagRPC_ERROR_ENUM_HANDLE.Head$VH.set(seg, x);
    }
    public static MemorySegment Head$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagRPC_ERROR_ENUM_HANDLE.Head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Head$set(MemorySegment seg, long index, MemorySegment x) {
        tagRPC_ERROR_ENUM_HANDLE.Head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


