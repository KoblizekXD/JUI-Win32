// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DIAGNOSTIC_REQUEST {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD Flags;
 *     STORAGE_DIAGNOSTIC_TARGET_TYPE TargetType;
 *     STORAGE_DIAGNOSTIC_LEVEL Level;
 * };
 * }
 */
public class _STORAGE_DIAGNOSTIC_REQUEST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("TargetType"),
        Constants$root.C_LONG$LAYOUT.withName("Level")
    ).withName("_STORAGE_DIAGNOSTIC_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_DIAGNOSTIC_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetType"));
    public static VarHandle TargetType$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_TARGET_TYPE TargetType;
     * }
     */
    public static int TargetType$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_TARGET_TYPE TargetType;
     * }
     */
    public static void TargetType$set(MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.set(seg, x);
    }
    public static int TargetType$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetType$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.TargetType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _STORAGE_DIAGNOSTIC_REQUEST.Level$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_LEVEL Level;
     * }
     */
    public static int Level$get(MemorySegment seg) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Level$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_DIAGNOSTIC_LEVEL Level;
     * }
     */
    public static void Level$set(MemorySegment seg, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Level$VH.set(seg, x);
    }
    public static int Level$get(MemorySegment seg, long index) {
        return (int)_STORAGE_DIAGNOSTIC_REQUEST.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, int x) {
        _STORAGE_DIAGNOSTIC_REQUEST.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


