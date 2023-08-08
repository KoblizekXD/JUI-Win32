// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTION_NOTIFICATION {
 *     PVOID TransactionKey;
 *     ULONG TransactionNotification;
 *     LARGE_INTEGER TmVirtualClock;
 *     ULONG ArgumentLength;
 * };
 * }
 */
public class _TRANSACTION_NOTIFICATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("TransactionKey"),
        Constants$root.C_LONG$LAYOUT.withName("TransactionNotification"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("TmVirtualClock"),
        Constants$root.C_LONG$LAYOUT.withName("ArgumentLength"),
        MemoryLayout.paddingLayout(32)
    ).withName("_TRANSACTION_NOTIFICATION");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_NOTIFICATION.$struct$LAYOUT;
    }
    static final VarHandle TransactionKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionKey"));
    public static VarHandle TransactionKey$VH() {
        return _TRANSACTION_NOTIFICATION.TransactionKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID TransactionKey;
     * }
     */
    public static MemorySegment TransactionKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_TRANSACTION_NOTIFICATION.TransactionKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID TransactionKey;
     * }
     */
    public static void TransactionKey$set(MemorySegment seg, MemorySegment x) {
        _TRANSACTION_NOTIFICATION.TransactionKey$VH.set(seg, x);
    }
    public static MemorySegment TransactionKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_TRANSACTION_NOTIFICATION.TransactionKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionKey$set(MemorySegment seg, long index, MemorySegment x) {
        _TRANSACTION_NOTIFICATION.TransactionKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransactionNotification$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionNotification"));
    public static VarHandle TransactionNotification$VH() {
        return _TRANSACTION_NOTIFICATION.TransactionNotification$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG TransactionNotification;
     * }
     */
    public static int TransactionNotification$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION.TransactionNotification$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG TransactionNotification;
     * }
     */
    public static void TransactionNotification$set(MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION.TransactionNotification$VH.set(seg, x);
    }
    public static int TransactionNotification$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION.TransactionNotification$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionNotification$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION.TransactionNotification$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TmVirtualClock$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle ArgumentLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ArgumentLength"));
    public static VarHandle ArgumentLength$VH() {
        return _TRANSACTION_NOTIFICATION.ArgumentLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ArgumentLength;
     * }
     */
    public static int ArgumentLength$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION.ArgumentLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ArgumentLength;
     * }
     */
    public static void ArgumentLength$set(MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION.ArgumentLength$VH.set(seg, x);
    }
    public static int ArgumentLength$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION.ArgumentLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArgumentLength$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION.ArgumentLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

