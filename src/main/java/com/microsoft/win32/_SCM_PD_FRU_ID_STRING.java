// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_PD_FRU_ID_STRING {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD IdentifierSize;
 *     BYTE Identifier[1];
 * };
 * }
 */
public class _SCM_PD_FRU_ID_STRING {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("IdentifierSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Identifier"),
        MemoryLayout.paddingLayout(24)
    ).withName("_SCM_PD_FRU_ID_STRING");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_FRU_ID_STRING.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PD_FRU_ID_STRING.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PD_FRU_ID_STRING.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _SCM_PD_FRU_ID_STRING.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_FRU_ID_STRING.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PD_FRU_ID_STRING.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PD_FRU_ID_STRING.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PD_FRU_ID_STRING.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCM_PD_FRU_ID_STRING.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_FRU_ID_STRING.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PD_FRU_ID_STRING.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdentifierSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdentifierSize"));
    public static VarHandle IdentifierSize$VH() {
        return _SCM_PD_FRU_ID_STRING.IdentifierSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD IdentifierSize;
     * }
     */
    public static int IdentifierSize$get(MemorySegment seg) {
        return (int)_SCM_PD_FRU_ID_STRING.IdentifierSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD IdentifierSize;
     * }
     */
    public static void IdentifierSize$set(MemorySegment seg, int x) {
        _SCM_PD_FRU_ID_STRING.IdentifierSize$VH.set(seg, x);
    }
    public static int IdentifierSize$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_FRU_ID_STRING.IdentifierSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdentifierSize$set(MemorySegment seg, long index, int x) {
        _SCM_PD_FRU_ID_STRING.IdentifierSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Identifier$slice(MemorySegment seg) {
        return seg.asSlice(12, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


