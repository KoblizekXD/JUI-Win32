// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SESSION_HEADER {
 *     UCHAR sess_name;
 *     UCHAR num_sess;
 *     UCHAR rcv_dg_outstanding;
 *     UCHAR rcv_any_outstanding;
 * };
 * }
 */
public class _SESSION_HEADER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("sess_name"),
        Constants$root.C_CHAR$LAYOUT.withName("num_sess"),
        Constants$root.C_CHAR$LAYOUT.withName("rcv_dg_outstanding"),
        Constants$root.C_CHAR$LAYOUT.withName("rcv_any_outstanding")
    ).withName("_SESSION_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _SESSION_HEADER.$struct$LAYOUT;
    }
    static final VarHandle sess_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("sess_name"));
    public static VarHandle sess_name$VH() {
        return _SESSION_HEADER.sess_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR sess_name;
     * }
     */
    public static byte sess_name$get(MemorySegment seg) {
        return (byte)_SESSION_HEADER.sess_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR sess_name;
     * }
     */
    public static void sess_name$set(MemorySegment seg, byte x) {
        _SESSION_HEADER.sess_name$VH.set(seg, x);
    }
    public static byte sess_name$get(MemorySegment seg, long index) {
        return (byte)_SESSION_HEADER.sess_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sess_name$set(MemorySegment seg, long index, byte x) {
        _SESSION_HEADER.sess_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_sess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_sess"));
    public static VarHandle num_sess$VH() {
        return _SESSION_HEADER.num_sess$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR num_sess;
     * }
     */
    public static byte num_sess$get(MemorySegment seg) {
        return (byte)_SESSION_HEADER.num_sess$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR num_sess;
     * }
     */
    public static void num_sess$set(MemorySegment seg, byte x) {
        _SESSION_HEADER.num_sess$VH.set(seg, x);
    }
    public static byte num_sess$get(MemorySegment seg, long index) {
        return (byte)_SESSION_HEADER.num_sess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_sess$set(MemorySegment seg, long index, byte x) {
        _SESSION_HEADER.num_sess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rcv_dg_outstanding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rcv_dg_outstanding"));
    public static VarHandle rcv_dg_outstanding$VH() {
        return _SESSION_HEADER.rcv_dg_outstanding$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR rcv_dg_outstanding;
     * }
     */
    public static byte rcv_dg_outstanding$get(MemorySegment seg) {
        return (byte)_SESSION_HEADER.rcv_dg_outstanding$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR rcv_dg_outstanding;
     * }
     */
    public static void rcv_dg_outstanding$set(MemorySegment seg, byte x) {
        _SESSION_HEADER.rcv_dg_outstanding$VH.set(seg, x);
    }
    public static byte rcv_dg_outstanding$get(MemorySegment seg, long index) {
        return (byte)_SESSION_HEADER.rcv_dg_outstanding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rcv_dg_outstanding$set(MemorySegment seg, long index, byte x) {
        _SESSION_HEADER.rcv_dg_outstanding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rcv_any_outstanding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rcv_any_outstanding"));
    public static VarHandle rcv_any_outstanding$VH() {
        return _SESSION_HEADER.rcv_any_outstanding$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UCHAR rcv_any_outstanding;
     * }
     */
    public static byte rcv_any_outstanding$get(MemorySegment seg) {
        return (byte)_SESSION_HEADER.rcv_any_outstanding$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UCHAR rcv_any_outstanding;
     * }
     */
    public static void rcv_any_outstanding$set(MemorySegment seg, byte x) {
        _SESSION_HEADER.rcv_any_outstanding$VH.set(seg, x);
    }
    public static byte rcv_any_outstanding$get(MemorySegment seg, long index) {
        return (byte)_SESSION_HEADER.rcv_any_outstanding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rcv_any_outstanding$set(MemorySegment seg, long index, byte x) {
        _SESSION_HEADER.rcv_any_outstanding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


