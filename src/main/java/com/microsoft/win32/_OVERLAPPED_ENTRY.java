// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _OVERLAPPED_ENTRY {
 *     ULONG_PTR lpCompletionKey;
 *     LPOVERLAPPED lpOverlapped;
 *     ULONG_PTR Internal;
 *     DWORD dwNumberOfBytesTransferred;
 * };
 * }
 */
public class _OVERLAPPED_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("lpCompletionKey"),
        Constants$root.C_POINTER$LAYOUT.withName("lpOverlapped"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Internal"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfBytesTransferred"),
        MemoryLayout.paddingLayout(32)
    ).withName("_OVERLAPPED_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _OVERLAPPED_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle lpCompletionKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCompletionKey"));
    public static VarHandle lpCompletionKey$VH() {
        return _OVERLAPPED_ENTRY.lpCompletionKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR lpCompletionKey;
     * }
     */
    public static long lpCompletionKey$get(MemorySegment seg) {
        return (long)_OVERLAPPED_ENTRY.lpCompletionKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR lpCompletionKey;
     * }
     */
    public static void lpCompletionKey$set(MemorySegment seg, long x) {
        _OVERLAPPED_ENTRY.lpCompletionKey$VH.set(seg, x);
    }
    public static long lpCompletionKey$get(MemorySegment seg, long index) {
        return (long)_OVERLAPPED_ENTRY.lpCompletionKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCompletionKey$set(MemorySegment seg, long index, long x) {
        _OVERLAPPED_ENTRY.lpCompletionKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpOverlapped$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOverlapped"));
    public static VarHandle lpOverlapped$VH() {
        return _OVERLAPPED_ENTRY.lpOverlapped$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOVERLAPPED lpOverlapped;
     * }
     */
    public static MemorySegment lpOverlapped$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_OVERLAPPED_ENTRY.lpOverlapped$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOVERLAPPED lpOverlapped;
     * }
     */
    public static void lpOverlapped$set(MemorySegment seg, MemorySegment x) {
        _OVERLAPPED_ENTRY.lpOverlapped$VH.set(seg, x);
    }
    public static MemorySegment lpOverlapped$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_OVERLAPPED_ENTRY.lpOverlapped$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpOverlapped$set(MemorySegment seg, long index, MemorySegment x) {
        _OVERLAPPED_ENTRY.lpOverlapped$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Internal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Internal"));
    public static VarHandle Internal$VH() {
        return _OVERLAPPED_ENTRY.Internal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR Internal;
     * }
     */
    public static long Internal$get(MemorySegment seg) {
        return (long)_OVERLAPPED_ENTRY.Internal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR Internal;
     * }
     */
    public static void Internal$set(MemorySegment seg, long x) {
        _OVERLAPPED_ENTRY.Internal$VH.set(seg, x);
    }
    public static long Internal$get(MemorySegment seg, long index) {
        return (long)_OVERLAPPED_ENTRY.Internal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Internal$set(MemorySegment seg, long index, long x) {
        _OVERLAPPED_ENTRY.Internal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfBytesTransferred$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfBytesTransferred"));
    public static VarHandle dwNumberOfBytesTransferred$VH() {
        return _OVERLAPPED_ENTRY.dwNumberOfBytesTransferred$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfBytesTransferred;
     * }
     */
    public static int dwNumberOfBytesTransferred$get(MemorySegment seg) {
        return (int)_OVERLAPPED_ENTRY.dwNumberOfBytesTransferred$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfBytesTransferred;
     * }
     */
    public static void dwNumberOfBytesTransferred$set(MemorySegment seg, int x) {
        _OVERLAPPED_ENTRY.dwNumberOfBytesTransferred$VH.set(seg, x);
    }
    public static int dwNumberOfBytesTransferred$get(MemorySegment seg, long index) {
        return (int)_OVERLAPPED_ENTRY.dwNumberOfBytesTransferred$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfBytesTransferred$set(MemorySegment seg, long index, int x) {
        _OVERLAPPED_ENTRY.dwNumberOfBytesTransferred$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

