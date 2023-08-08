// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_GET_METADATA_INFO_OUT {
 *     struct  TxfFileId;
 *     GUID LockingTransaction;
 *     DWORDLONG LastLsn;
 *     DWORD TransactionState;
 * };
 * }
 */
public class _TXFS_GET_METADATA_INFO_OUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("HighPart")
        ).withName("TxfFileId"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("LockingTransaction"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("LastLsn"),
        Constants$root.C_LONG$LAYOUT.withName("TransactionState"),
        MemoryLayout.paddingLayout(32)
    ).withName("_TXFS_GET_METADATA_INFO_OUT");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_GET_METADATA_INFO_OUT.$struct$LAYOUT;
    }
    /**
     * {@snippet :
     * struct {
     *     LONGLONG LowPart;
     *     LONGLONG HighPart;
     * };
     * }
     */
    public static final class TxfFileId {

        // Suppresses default constructor, ensuring non-instantiability.
        private TxfFileId() {}
        static final StructLayout TxfFileId$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("HighPart")
        );
        public static MemoryLayout $LAYOUT() {
            return TxfFileId.TxfFileId$struct$LAYOUT;
        }
        static final VarHandle LowPart$VH = TxfFileId$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LowPart"));
        public static VarHandle LowPart$VH() {
            return TxfFileId.LowPart$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * LONGLONG LowPart;
         * }
         */
        public static long LowPart$get(MemorySegment seg) {
            return (long)TxfFileId.LowPart$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * LONGLONG LowPart;
         * }
         */
        public static void LowPart$set(MemorySegment seg, long x) {
            TxfFileId.LowPart$VH.set(seg, x);
        }
        public static long LowPart$get(MemorySegment seg, long index) {
            return (long)TxfFileId.LowPart$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void LowPart$set(MemorySegment seg, long index, long x) {
            TxfFileId.LowPart$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle HighPart$VH = TxfFileId$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("HighPart"));
        public static VarHandle HighPart$VH() {
            return TxfFileId.HighPart$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * LONGLONG HighPart;
         * }
         */
        public static long HighPart$get(MemorySegment seg) {
            return (long)TxfFileId.HighPart$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * LONGLONG HighPart;
         * }
         */
        public static void HighPart$set(MemorySegment seg, long x) {
            TxfFileId.HighPart$VH.set(seg, x);
        }
        public static long HighPart$get(MemorySegment seg, long index) {
            return (long)TxfFileId.HighPart$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void HighPart$set(MemorySegment seg, long index, long x) {
            TxfFileId.HighPart$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment TxfFileId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment LockingTransaction$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle LastLsn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LastLsn"));
    public static VarHandle LastLsn$VH() {
        return _TXFS_GET_METADATA_INFO_OUT.LastLsn$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG LastLsn;
     * }
     */
    public static long LastLsn$get(MemorySegment seg) {
        return (long)_TXFS_GET_METADATA_INFO_OUT.LastLsn$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG LastLsn;
     * }
     */
    public static void LastLsn$set(MemorySegment seg, long x) {
        _TXFS_GET_METADATA_INFO_OUT.LastLsn$VH.set(seg, x);
    }
    public static long LastLsn$get(MemorySegment seg, long index) {
        return (long)_TXFS_GET_METADATA_INFO_OUT.LastLsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LastLsn$set(MemorySegment seg, long index, long x) {
        _TXFS_GET_METADATA_INFO_OUT.LastLsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransactionState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionState"));
    public static VarHandle TransactionState$VH() {
        return _TXFS_GET_METADATA_INFO_OUT.TransactionState$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TransactionState;
     * }
     */
    public static int TransactionState$get(MemorySegment seg) {
        return (int)_TXFS_GET_METADATA_INFO_OUT.TransactionState$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TransactionState;
     * }
     */
    public static void TransactionState$set(MemorySegment seg, int x) {
        _TXFS_GET_METADATA_INFO_OUT.TransactionState$VH.set(seg, x);
    }
    public static int TransactionState$get(MemorySegment seg, long index) {
        return (int)_TXFS_GET_METADATA_INFO_OUT.TransactionState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionState$set(MemorySegment seg, long index, int x) {
        _TXFS_GET_METADATA_INFO_OUT.TransactionState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


