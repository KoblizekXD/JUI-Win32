// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JIT_DEBUG_INFO {
 *     DWORD dwSize;
 *     DWORD dwProcessorArchitecture;
 *     DWORD dwThreadID;
 *     DWORD dwReserved0;
 *     ULONG64 lpExceptionAddress;
 *     ULONG64 lpExceptionRecord;
 *     ULONG64 lpContextRecord;
 * };
 * }
 */
public class _JIT_DEBUG_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwProcessorArchitecture"),
        Constants$root.C_LONG$LAYOUT.withName("dwThreadID"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved0"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lpExceptionAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lpExceptionRecord"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lpContextRecord")
    ).withName("_JIT_DEBUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _JIT_DEBUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _JIT_DEBUG_INFO.dwSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProcessorArchitecture$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProcessorArchitecture"));
    public static VarHandle dwProcessorArchitecture$VH() {
        return _JIT_DEBUG_INFO.dwProcessorArchitecture$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProcessorArchitecture;
     * }
     */
    public static int dwProcessorArchitecture$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwProcessorArchitecture$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProcessorArchitecture;
     * }
     */
    public static void dwProcessorArchitecture$set(MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwProcessorArchitecture$VH.set(seg, x);
    }
    public static int dwProcessorArchitecture$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwProcessorArchitecture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProcessorArchitecture$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwProcessorArchitecture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwThreadID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwThreadID"));
    public static VarHandle dwThreadID$VH() {
        return _JIT_DEBUG_INFO.dwThreadID$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwThreadID;
     * }
     */
    public static int dwThreadID$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwThreadID$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwThreadID;
     * }
     */
    public static void dwThreadID$set(MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwThreadID$VH.set(seg, x);
    }
    public static int dwThreadID$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwThreadID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwThreadID$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwThreadID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved0"));
    public static VarHandle dwReserved0$VH() {
        return _JIT_DEBUG_INFO.dwReserved0$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved0;
     * }
     */
    public static int dwReserved0$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwReserved0$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved0;
     * }
     */
    public static void dwReserved0$set(MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwReserved0$VH.set(seg, x);
    }
    public static int dwReserved0$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwReserved0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved0$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwReserved0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpExceptionAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpExceptionAddress"));
    public static VarHandle lpExceptionAddress$VH() {
        return _JIT_DEBUG_INFO.lpExceptionAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 lpExceptionAddress;
     * }
     */
    public static long lpExceptionAddress$get(MemorySegment seg) {
        return (long)_JIT_DEBUG_INFO.lpExceptionAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 lpExceptionAddress;
     * }
     */
    public static void lpExceptionAddress$set(MemorySegment seg, long x) {
        _JIT_DEBUG_INFO.lpExceptionAddress$VH.set(seg, x);
    }
    public static long lpExceptionAddress$get(MemorySegment seg, long index) {
        return (long)_JIT_DEBUG_INFO.lpExceptionAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpExceptionAddress$set(MemorySegment seg, long index, long x) {
        _JIT_DEBUG_INFO.lpExceptionAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpExceptionRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpExceptionRecord"));
    public static VarHandle lpExceptionRecord$VH() {
        return _JIT_DEBUG_INFO.lpExceptionRecord$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 lpExceptionRecord;
     * }
     */
    public static long lpExceptionRecord$get(MemorySegment seg) {
        return (long)_JIT_DEBUG_INFO.lpExceptionRecord$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 lpExceptionRecord;
     * }
     */
    public static void lpExceptionRecord$set(MemorySegment seg, long x) {
        _JIT_DEBUG_INFO.lpExceptionRecord$VH.set(seg, x);
    }
    public static long lpExceptionRecord$get(MemorySegment seg, long index) {
        return (long)_JIT_DEBUG_INFO.lpExceptionRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpExceptionRecord$set(MemorySegment seg, long index, long x) {
        _JIT_DEBUG_INFO.lpExceptionRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpContextRecord$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpContextRecord"));
    public static VarHandle lpContextRecord$VH() {
        return _JIT_DEBUG_INFO.lpContextRecord$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 lpContextRecord;
     * }
     */
    public static long lpContextRecord$get(MemorySegment seg) {
        return (long)_JIT_DEBUG_INFO.lpContextRecord$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 lpContextRecord;
     * }
     */
    public static void lpContextRecord$set(MemorySegment seg, long x) {
        _JIT_DEBUG_INFO.lpContextRecord$VH.set(seg, x);
    }
    public static long lpContextRecord$get(MemorySegment seg, long index) {
        return (long)_JIT_DEBUG_INFO.lpContextRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpContextRecord$set(MemorySegment seg, long index, long x) {
        _JIT_DEBUG_INFO.lpContextRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


