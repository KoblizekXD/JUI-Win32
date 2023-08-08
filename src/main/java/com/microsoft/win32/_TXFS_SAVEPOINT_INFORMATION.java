// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_SAVEPOINT_INFORMATION {
 *     HANDLE KtmTransaction;
 *     DWORD ActionCode;
 *     DWORD SavepointId;
 * };
 * }
 */
public class _TXFS_SAVEPOINT_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("KtmTransaction"),
        Constants$root.C_LONG$LAYOUT.withName("ActionCode"),
        Constants$root.C_LONG$LAYOUT.withName("SavepointId")
    ).withName("_TXFS_SAVEPOINT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_SAVEPOINT_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle KtmTransaction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KtmTransaction"));
    public static VarHandle KtmTransaction$VH() {
        return _TXFS_SAVEPOINT_INFORMATION.KtmTransaction$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE KtmTransaction;
     * }
     */
    public static MemorySegment KtmTransaction$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TXFS_SAVEPOINT_INFORMATION.KtmTransaction$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE KtmTransaction;
     * }
     */
    public static void KtmTransaction$set(MemorySegment seg, MemorySegment x) {
        _TXFS_SAVEPOINT_INFORMATION.KtmTransaction$VH.set(seg, x);
    }
    public static MemorySegment KtmTransaction$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TXFS_SAVEPOINT_INFORMATION.KtmTransaction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KtmTransaction$set(MemorySegment seg, long index, MemorySegment x) {
        _TXFS_SAVEPOINT_INFORMATION.KtmTransaction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ActionCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ActionCode"));
    public static VarHandle ActionCode$VH() {
        return _TXFS_SAVEPOINT_INFORMATION.ActionCode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ActionCode;
     * }
     */
    public static int ActionCode$get(MemorySegment seg) {
        return (int)_TXFS_SAVEPOINT_INFORMATION.ActionCode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ActionCode;
     * }
     */
    public static void ActionCode$set(MemorySegment seg, int x) {
        _TXFS_SAVEPOINT_INFORMATION.ActionCode$VH.set(seg, x);
    }
    public static int ActionCode$get(MemorySegment seg, long index) {
        return (int)_TXFS_SAVEPOINT_INFORMATION.ActionCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ActionCode$set(MemorySegment seg, long index, int x) {
        _TXFS_SAVEPOINT_INFORMATION.ActionCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SavepointId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SavepointId"));
    public static VarHandle SavepointId$VH() {
        return _TXFS_SAVEPOINT_INFORMATION.SavepointId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SavepointId;
     * }
     */
    public static int SavepointId$get(MemorySegment seg) {
        return (int)_TXFS_SAVEPOINT_INFORMATION.SavepointId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SavepointId;
     * }
     */
    public static void SavepointId$set(MemorySegment seg, int x) {
        _TXFS_SAVEPOINT_INFORMATION.SavepointId$VH.set(seg, x);
    }
    public static int SavepointId$get(MemorySegment seg, long index) {
        return (int)_TXFS_SAVEPOINT_INFORMATION.SavepointId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SavepointId$set(MemorySegment seg, long index, int x) {
        _TXFS_SAVEPOINT_INFORMATION.SavepointId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


