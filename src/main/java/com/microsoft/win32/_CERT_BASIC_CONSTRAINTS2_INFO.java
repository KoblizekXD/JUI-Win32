// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_BASIC_CONSTRAINTS2_INFO {
 *     BOOL fCA;
 *     BOOL fPathLenConstraint;
 *     DWORD dwPathLenConstraint;
 * };
 * }
 */
public class _CERT_BASIC_CONSTRAINTS2_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fCA"),
        Constants$root.C_LONG$LAYOUT.withName("fPathLenConstraint"),
        Constants$root.C_LONG$LAYOUT.withName("dwPathLenConstraint")
    ).withName("_CERT_BASIC_CONSTRAINTS2_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.$struct$LAYOUT;
    }
    static final VarHandle fCA$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fCA"));
    public static VarHandle fCA$VH() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fCA;
     * }
     */
    public static int fCA$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fCA;
     * }
     */
    public static void fCA$set(MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.set(seg, x);
    }
    public static int fCA$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fCA$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fCA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fPathLenConstraint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fPathLenConstraint"));
    public static VarHandle fPathLenConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fPathLenConstraint;
     * }
     */
    public static int fPathLenConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fPathLenConstraint;
     * }
     */
    public static void fPathLenConstraint$set(MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.set(seg, x);
    }
    public static int fPathLenConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fPathLenConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.fPathLenConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPathLenConstraint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPathLenConstraint"));
    public static VarHandle dwPathLenConstraint$VH() {
        return _CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPathLenConstraint;
     * }
     */
    public static int dwPathLenConstraint$get(MemorySegment seg) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPathLenConstraint;
     * }
     */
    public static void dwPathLenConstraint$set(MemorySegment seg, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.set(seg, x);
    }
    public static int dwPathLenConstraint$get(MemorySegment seg, long index) {
        return (int)_CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPathLenConstraint$set(MemorySegment seg, long index, int x) {
        _CERT_BASIC_CONSTRAINTS2_INFO.dwPathLenConstraint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


