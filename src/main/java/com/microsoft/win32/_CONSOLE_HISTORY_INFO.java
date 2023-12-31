// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CONSOLE_HISTORY_INFO {
 *     UINT cbSize;
 *     UINT HistoryBufferSize;
 *     UINT NumberOfHistoryBuffers;
 *     DWORD dwFlags;
 * };
 * }
 */
public class _CONSOLE_HISTORY_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("HistoryBufferSize"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfHistoryBuffers"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags")
    ).withName("_CONSOLE_HISTORY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CONSOLE_HISTORY_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CONSOLE_HISTORY_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CONSOLE_HISTORY_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CONSOLE_HISTORY_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_HISTORY_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CONSOLE_HISTORY_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HistoryBufferSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HistoryBufferSize"));
    public static VarHandle HistoryBufferSize$VH() {
        return _CONSOLE_HISTORY_INFO.HistoryBufferSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT HistoryBufferSize;
     * }
     */
    public static int HistoryBufferSize$get(MemorySegment seg) {
        return (int)_CONSOLE_HISTORY_INFO.HistoryBufferSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT HistoryBufferSize;
     * }
     */
    public static void HistoryBufferSize$set(MemorySegment seg, int x) {
        _CONSOLE_HISTORY_INFO.HistoryBufferSize$VH.set(seg, x);
    }
    public static int HistoryBufferSize$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_HISTORY_INFO.HistoryBufferSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HistoryBufferSize$set(MemorySegment seg, long index, int x) {
        _CONSOLE_HISTORY_INFO.HistoryBufferSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfHistoryBuffers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfHistoryBuffers"));
    public static VarHandle NumberOfHistoryBuffers$VH() {
        return _CONSOLE_HISTORY_INFO.NumberOfHistoryBuffers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT NumberOfHistoryBuffers;
     * }
     */
    public static int NumberOfHistoryBuffers$get(MemorySegment seg) {
        return (int)_CONSOLE_HISTORY_INFO.NumberOfHistoryBuffers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT NumberOfHistoryBuffers;
     * }
     */
    public static void NumberOfHistoryBuffers$set(MemorySegment seg, int x) {
        _CONSOLE_HISTORY_INFO.NumberOfHistoryBuffers$VH.set(seg, x);
    }
    public static int NumberOfHistoryBuffers$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_HISTORY_INFO.NumberOfHistoryBuffers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfHistoryBuffers$set(MemorySegment seg, long index, int x) {
        _CONSOLE_HISTORY_INFO.NumberOfHistoryBuffers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CONSOLE_HISTORY_INFO.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CONSOLE_HISTORY_INFO.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _CONSOLE_HISTORY_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_HISTORY_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CONSOLE_HISTORY_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


