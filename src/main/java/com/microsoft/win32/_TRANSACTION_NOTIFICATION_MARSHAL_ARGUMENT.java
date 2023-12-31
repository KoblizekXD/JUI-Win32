// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT {
 *     ULONG MarshalCookie;
 *     GUID UOW;
 * };
 * }
 */
public class _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("MarshalCookie"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("UOW")
    ).withName("_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.$struct$LAYOUT;
    }
    static final VarHandle MarshalCookie$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MarshalCookie"));
    public static VarHandle MarshalCookie$VH() {
        return _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG MarshalCookie;
     * }
     */
    public static int MarshalCookie$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG MarshalCookie;
     * }
     */
    public static void MarshalCookie$set(MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.set(seg, x);
    }
    public static int MarshalCookie$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MarshalCookie$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment UOW$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


