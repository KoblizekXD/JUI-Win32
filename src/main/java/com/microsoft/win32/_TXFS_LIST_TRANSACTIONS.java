// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_LIST_TRANSACTIONS {
 *     DWORDLONG NumberOfTransactions;
 *     DWORDLONG BufferSizeRequired;
 * };
 * }
 */
public class _TXFS_LIST_TRANSACTIONS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("NumberOfTransactions"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("BufferSizeRequired")
    ).withName("_TXFS_LIST_TRANSACTIONS");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_LIST_TRANSACTIONS.$struct$LAYOUT;
    }
    static final VarHandle NumberOfTransactions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfTransactions"));
    public static VarHandle NumberOfTransactions$VH() {
        return _TXFS_LIST_TRANSACTIONS.NumberOfTransactions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG NumberOfTransactions;
     * }
     */
    public static long NumberOfTransactions$get(MemorySegment seg) {
        return (long)_TXFS_LIST_TRANSACTIONS.NumberOfTransactions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG NumberOfTransactions;
     * }
     */
    public static void NumberOfTransactions$set(MemorySegment seg, long x) {
        _TXFS_LIST_TRANSACTIONS.NumberOfTransactions$VH.set(seg, x);
    }
    public static long NumberOfTransactions$get(MemorySegment seg, long index) {
        return (long)_TXFS_LIST_TRANSACTIONS.NumberOfTransactions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfTransactions$set(MemorySegment seg, long index, long x) {
        _TXFS_LIST_TRANSACTIONS.NumberOfTransactions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferSizeRequired$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferSizeRequired"));
    public static VarHandle BufferSizeRequired$VH() {
        return _TXFS_LIST_TRANSACTIONS.BufferSizeRequired$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BufferSizeRequired;
     * }
     */
    public static long BufferSizeRequired$get(MemorySegment seg) {
        return (long)_TXFS_LIST_TRANSACTIONS.BufferSizeRequired$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BufferSizeRequired;
     * }
     */
    public static void BufferSizeRequired$set(MemorySegment seg, long x) {
        _TXFS_LIST_TRANSACTIONS.BufferSizeRequired$VH.set(seg, x);
    }
    public static long BufferSizeRequired$get(MemorySegment seg, long index) {
        return (long)_TXFS_LIST_TRANSACTIONS.BufferSizeRequired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSizeRequired$set(MemorySegment seg, long index, long x) {
        _TXFS_LIST_TRANSACTIONS.BufferSizeRequired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


