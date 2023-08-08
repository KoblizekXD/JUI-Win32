// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_CREATE_MINIVERSION_INFO {
 *     WORD StructureVersion;
 *     WORD StructureLength;
 *     DWORD BaseVersion;
 *     WORD MiniVersion;
 * };
 * }
 */
public class _TXFS_CREATE_MINIVERSION_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("StructureVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("StructureLength"),
        Constants$root.C_LONG$LAYOUT.withName("BaseVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MiniVersion"),
        MemoryLayout.paddingLayout(16)
    ).withName("_TXFS_CREATE_MINIVERSION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_CREATE_MINIVERSION_INFO.$struct$LAYOUT;
    }
    static final VarHandle StructureVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StructureVersion"));
    public static VarHandle StructureVersion$VH() {
        return _TXFS_CREATE_MINIVERSION_INFO.StructureVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD StructureVersion;
     * }
     */
    public static short StructureVersion$get(MemorySegment seg) {
        return (short)_TXFS_CREATE_MINIVERSION_INFO.StructureVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD StructureVersion;
     * }
     */
    public static void StructureVersion$set(MemorySegment seg, short x) {
        _TXFS_CREATE_MINIVERSION_INFO.StructureVersion$VH.set(seg, x);
    }
    public static short StructureVersion$get(MemorySegment seg, long index) {
        return (short)_TXFS_CREATE_MINIVERSION_INFO.StructureVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureVersion$set(MemorySegment seg, long index, short x) {
        _TXFS_CREATE_MINIVERSION_INFO.StructureVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StructureLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StructureLength"));
    public static VarHandle StructureLength$VH() {
        return _TXFS_CREATE_MINIVERSION_INFO.StructureLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD StructureLength;
     * }
     */
    public static short StructureLength$get(MemorySegment seg) {
        return (short)_TXFS_CREATE_MINIVERSION_INFO.StructureLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD StructureLength;
     * }
     */
    public static void StructureLength$set(MemorySegment seg, short x) {
        _TXFS_CREATE_MINIVERSION_INFO.StructureLength$VH.set(seg, x);
    }
    public static short StructureLength$get(MemorySegment seg, long index) {
        return (short)_TXFS_CREATE_MINIVERSION_INFO.StructureLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StructureLength$set(MemorySegment seg, long index, short x) {
        _TXFS_CREATE_MINIVERSION_INFO.StructureLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BaseVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BaseVersion"));
    public static VarHandle BaseVersion$VH() {
        return _TXFS_CREATE_MINIVERSION_INFO.BaseVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BaseVersion;
     * }
     */
    public static int BaseVersion$get(MemorySegment seg) {
        return (int)_TXFS_CREATE_MINIVERSION_INFO.BaseVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BaseVersion;
     * }
     */
    public static void BaseVersion$set(MemorySegment seg, int x) {
        _TXFS_CREATE_MINIVERSION_INFO.BaseVersion$VH.set(seg, x);
    }
    public static int BaseVersion$get(MemorySegment seg, long index) {
        return (int)_TXFS_CREATE_MINIVERSION_INFO.BaseVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseVersion$set(MemorySegment seg, long index, int x) {
        _TXFS_CREATE_MINIVERSION_INFO.BaseVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MiniVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MiniVersion"));
    public static VarHandle MiniVersion$VH() {
        return _TXFS_CREATE_MINIVERSION_INFO.MiniVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MiniVersion;
     * }
     */
    public static short MiniVersion$get(MemorySegment seg) {
        return (short)_TXFS_CREATE_MINIVERSION_INFO.MiniVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MiniVersion;
     * }
     */
    public static void MiniVersion$set(MemorySegment seg, short x) {
        _TXFS_CREATE_MINIVERSION_INFO.MiniVersion$VH.set(seg, x);
    }
    public static short MiniVersion$get(MemorySegment seg, long index) {
        return (short)_TXFS_CREATE_MINIVERSION_INFO.MiniVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MiniVersion$set(MemorySegment seg, long index, short x) {
        _TXFS_CREATE_MINIVERSION_INFO.MiniVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

