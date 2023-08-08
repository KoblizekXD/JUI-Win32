// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MEMORY_BASIC_INFORMATION64 {
 *     ULONGLONG BaseAddress;
 *     ULONGLONG AllocationBase;
 *     DWORD AllocationProtect;
 *     DWORD __alignment1;
 *     ULONGLONG RegionSize;
 *     DWORD State;
 *     DWORD Protect;
 *     DWORD Type;
 *     DWORD __alignment2;
 * };
 * }
 */
public class _MEMORY_BASIC_INFORMATION64 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("BaseAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("AllocationBase"),
        Constants$root.C_LONG$LAYOUT.withName("AllocationProtect"),
        Constants$root.C_LONG$LAYOUT.withName("__alignment1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("RegionSize"),
        Constants$root.C_LONG$LAYOUT.withName("State"),
        Constants$root.C_LONG$LAYOUT.withName("Protect"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_LONG$LAYOUT.withName("__alignment2")
    ).withName("_MEMORY_BASIC_INFORMATION64");
    public static MemoryLayout $LAYOUT() {
        return _MEMORY_BASIC_INFORMATION64.$struct$LAYOUT;
    }
    static final VarHandle BaseAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseAddress"));
    public static VarHandle BaseAddress$VH() {
        return _MEMORY_BASIC_INFORMATION64.BaseAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG BaseAddress;
     * }
     */
    public static long BaseAddress$get(MemorySegment seg) {
        return (long)_MEMORY_BASIC_INFORMATION64.BaseAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG BaseAddress;
     * }
     */
    public static void BaseAddress$set(MemorySegment seg, long x) {
        _MEMORY_BASIC_INFORMATION64.BaseAddress$VH.set(seg, x);
    }
    public static long BaseAddress$get(MemorySegment seg, long index) {
        return (long)_MEMORY_BASIC_INFORMATION64.BaseAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseAddress$set(MemorySegment seg, long index, long x) {
        _MEMORY_BASIC_INFORMATION64.BaseAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationBase"));
    public static VarHandle AllocationBase$VH() {
        return _MEMORY_BASIC_INFORMATION64.AllocationBase$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG AllocationBase;
     * }
     */
    public static long AllocationBase$get(MemorySegment seg) {
        return (long)_MEMORY_BASIC_INFORMATION64.AllocationBase$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG AllocationBase;
     * }
     */
    public static void AllocationBase$set(MemorySegment seg, long x) {
        _MEMORY_BASIC_INFORMATION64.AllocationBase$VH.set(seg, x);
    }
    public static long AllocationBase$get(MemorySegment seg, long index) {
        return (long)_MEMORY_BASIC_INFORMATION64.AllocationBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationBase$set(MemorySegment seg, long index, long x) {
        _MEMORY_BASIC_INFORMATION64.AllocationBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AllocationProtect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AllocationProtect"));
    public static VarHandle AllocationProtect$VH() {
        return _MEMORY_BASIC_INFORMATION64.AllocationProtect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AllocationProtect;
     * }
     */
    public static int AllocationProtect$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION64.AllocationProtect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AllocationProtect;
     * }
     */
    public static void AllocationProtect$set(MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION64.AllocationProtect$VH.set(seg, x);
    }
    public static int AllocationProtect$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION64.AllocationProtect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AllocationProtect$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION64.AllocationProtect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __alignment1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__alignment1"));
    public static VarHandle __alignment1$VH() {
        return _MEMORY_BASIC_INFORMATION64.__alignment1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD __alignment1;
     * }
     */
    public static int __alignment1$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION64.__alignment1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD __alignment1;
     * }
     */
    public static void __alignment1$set(MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION64.__alignment1$VH.set(seg, x);
    }
    public static int __alignment1$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION64.__alignment1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __alignment1$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION64.__alignment1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RegionSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RegionSize"));
    public static VarHandle RegionSize$VH() {
        return _MEMORY_BASIC_INFORMATION64.RegionSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG RegionSize;
     * }
     */
    public static long RegionSize$get(MemorySegment seg) {
        return (long)_MEMORY_BASIC_INFORMATION64.RegionSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG RegionSize;
     * }
     */
    public static void RegionSize$set(MemorySegment seg, long x) {
        _MEMORY_BASIC_INFORMATION64.RegionSize$VH.set(seg, x);
    }
    public static long RegionSize$get(MemorySegment seg, long index) {
        return (long)_MEMORY_BASIC_INFORMATION64.RegionSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RegionSize$set(MemorySegment seg, long index, long x) {
        _MEMORY_BASIC_INFORMATION64.RegionSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("State"));
    public static VarHandle State$VH() {
        return _MEMORY_BASIC_INFORMATION64.State$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD State;
     * }
     */
    public static int State$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION64.State$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD State;
     * }
     */
    public static void State$set(MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION64.State$VH.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION64.State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION64.State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Protect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Protect"));
    public static VarHandle Protect$VH() {
        return _MEMORY_BASIC_INFORMATION64.Protect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Protect;
     * }
     */
    public static int Protect$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION64.Protect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Protect;
     * }
     */
    public static void Protect$set(MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION64.Protect$VH.set(seg, x);
    }
    public static int Protect$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION64.Protect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Protect$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION64.Protect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _MEMORY_BASIC_INFORMATION64.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION64.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION64.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION64.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION64.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __alignment2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__alignment2"));
    public static VarHandle __alignment2$VH() {
        return _MEMORY_BASIC_INFORMATION64.__alignment2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD __alignment2;
     * }
     */
    public static int __alignment2$get(MemorySegment seg) {
        return (int)_MEMORY_BASIC_INFORMATION64.__alignment2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD __alignment2;
     * }
     */
    public static void __alignment2$set(MemorySegment seg, int x) {
        _MEMORY_BASIC_INFORMATION64.__alignment2$VH.set(seg, x);
    }
    public static int __alignment2$get(MemorySegment seg, long index) {
        return (int)_MEMORY_BASIC_INFORMATION64.__alignment2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __alignment2$set(MemorySegment seg, long index, int x) {
        _MEMORY_BASIC_INFORMATION64.__alignment2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

