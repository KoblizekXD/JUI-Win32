// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTION_BASIC_INFORMATION {
 *     GUID TransactionId;
 *     DWORD State;
 *     DWORD Outcome;
 * };
 * }
 */
public class _TRANSACTION_BASIC_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("TransactionId"),
        Constants$root.C_LONG$LAYOUT.withName("State"),
        Constants$root.C_LONG$LAYOUT.withName("Outcome")
    ).withName("_TRANSACTION_BASIC_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_BASIC_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment TransactionId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle State$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("State"));
    public static VarHandle State$VH() {
        return _TRANSACTION_BASIC_INFORMATION.State$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD State;
     * }
     */
    public static int State$get(MemorySegment seg) {
        return (int)_TRANSACTION_BASIC_INFORMATION.State$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD State;
     * }
     */
    public static void State$set(MemorySegment seg, int x) {
        _TRANSACTION_BASIC_INFORMATION.State$VH.set(seg, x);
    }
    public static int State$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_BASIC_INFORMATION.State$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void State$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_BASIC_INFORMATION.State$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Outcome$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Outcome"));
    public static VarHandle Outcome$VH() {
        return _TRANSACTION_BASIC_INFORMATION.Outcome$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Outcome;
     * }
     */
    public static int Outcome$get(MemorySegment seg) {
        return (int)_TRANSACTION_BASIC_INFORMATION.Outcome$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Outcome;
     * }
     */
    public static void Outcome$set(MemorySegment seg, int x) {
        _TRANSACTION_BASIC_INFORMATION.Outcome$VH.set(seg, x);
    }
    public static int Outcome$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_BASIC_INFORMATION.Outcome$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Outcome$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_BASIC_INFORMATION.Outcome$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


