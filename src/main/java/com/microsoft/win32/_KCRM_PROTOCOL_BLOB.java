// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _KCRM_PROTOCOL_BLOB {
 *     CRM_PROTOCOL_ID ProtocolId;
 *     ULONG StaticInfoLength;
 *     ULONG TransactionIdInfoLength;
 *     ULONG Unused1;
 *     ULONG Unused2;
 * };
 * }
 */
public class _KCRM_PROTOCOL_BLOB {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProtocolId"),
        Constants$root.C_LONG$LAYOUT.withName("StaticInfoLength"),
        Constants$root.C_LONG$LAYOUT.withName("TransactionIdInfoLength"),
        Constants$root.C_LONG$LAYOUT.withName("Unused1"),
        Constants$root.C_LONG$LAYOUT.withName("Unused2")
    ).withName("_KCRM_PROTOCOL_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _KCRM_PROTOCOL_BLOB.$struct$LAYOUT;
    }
    public static MemorySegment ProtocolId$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle StaticInfoLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StaticInfoLength"));
    public static VarHandle StaticInfoLength$VH() {
        return _KCRM_PROTOCOL_BLOB.StaticInfoLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG StaticInfoLength;
     * }
     */
    public static int StaticInfoLength$get(MemorySegment seg) {
        return (int)_KCRM_PROTOCOL_BLOB.StaticInfoLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG StaticInfoLength;
     * }
     */
    public static void StaticInfoLength$set(MemorySegment seg, int x) {
        _KCRM_PROTOCOL_BLOB.StaticInfoLength$VH.set(seg, x);
    }
    public static int StaticInfoLength$get(MemorySegment seg, long index) {
        return (int)_KCRM_PROTOCOL_BLOB.StaticInfoLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StaticInfoLength$set(MemorySegment seg, long index, int x) {
        _KCRM_PROTOCOL_BLOB.StaticInfoLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransactionIdInfoLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransactionIdInfoLength"));
    public static VarHandle TransactionIdInfoLength$VH() {
        return _KCRM_PROTOCOL_BLOB.TransactionIdInfoLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG TransactionIdInfoLength;
     * }
     */
    public static int TransactionIdInfoLength$get(MemorySegment seg) {
        return (int)_KCRM_PROTOCOL_BLOB.TransactionIdInfoLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG TransactionIdInfoLength;
     * }
     */
    public static void TransactionIdInfoLength$set(MemorySegment seg, int x) {
        _KCRM_PROTOCOL_BLOB.TransactionIdInfoLength$VH.set(seg, x);
    }
    public static int TransactionIdInfoLength$get(MemorySegment seg, long index) {
        return (int)_KCRM_PROTOCOL_BLOB.TransactionIdInfoLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionIdInfoLength$set(MemorySegment seg, long index, int x) {
        _KCRM_PROTOCOL_BLOB.TransactionIdInfoLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unused1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unused1"));
    public static VarHandle Unused1$VH() {
        return _KCRM_PROTOCOL_BLOB.Unused1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Unused1;
     * }
     */
    public static int Unused1$get(MemorySegment seg) {
        return (int)_KCRM_PROTOCOL_BLOB.Unused1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Unused1;
     * }
     */
    public static void Unused1$set(MemorySegment seg, int x) {
        _KCRM_PROTOCOL_BLOB.Unused1$VH.set(seg, x);
    }
    public static int Unused1$get(MemorySegment seg, long index) {
        return (int)_KCRM_PROTOCOL_BLOB.Unused1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unused1$set(MemorySegment seg, long index, int x) {
        _KCRM_PROTOCOL_BLOB.Unused1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unused2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unused2"));
    public static VarHandle Unused2$VH() {
        return _KCRM_PROTOCOL_BLOB.Unused2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Unused2;
     * }
     */
    public static int Unused2$get(MemorySegment seg) {
        return (int)_KCRM_PROTOCOL_BLOB.Unused2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Unused2;
     * }
     */
    public static void Unused2$set(MemorySegment seg, int x) {
        _KCRM_PROTOCOL_BLOB.Unused2$VH.set(seg, x);
    }
    public static int Unused2$get(MemorySegment seg, long index) {
        return (int)_KCRM_PROTOCOL_BLOB.Unused2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unused2$set(MemorySegment seg, long index, int x) {
        _KCRM_PROTOCOL_BLOB.Unused2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


