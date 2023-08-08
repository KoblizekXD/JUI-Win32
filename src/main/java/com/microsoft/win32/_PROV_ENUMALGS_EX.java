// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROV_ENUMALGS_EX {
 *     ALG_ID aiAlgid;
 *     DWORD dwDefaultLen;
 *     DWORD dwMinLen;
 *     DWORD dwMaxLen;
 *     DWORD dwProtocols;
 *     DWORD dwNameLen;
 *     CHAR szName[20];
 *     DWORD dwLongNameLen;
 *     CHAR szLongName[40];
 * };
 * }
 */
public class _PROV_ENUMALGS_EX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("aiAlgid"),
        Constants$root.C_LONG$LAYOUT.withName("dwDefaultLen"),
        Constants$root.C_LONG$LAYOUT.withName("dwMinLen"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxLen"),
        Constants$root.C_LONG$LAYOUT.withName("dwProtocols"),
        Constants$root.C_LONG$LAYOUT.withName("dwNameLen"),
        MemoryLayout.sequenceLayout(20, Constants$root.C_CHAR$LAYOUT).withName("szName"),
        Constants$root.C_LONG$LAYOUT.withName("dwLongNameLen"),
        MemoryLayout.sequenceLayout(40, Constants$root.C_CHAR$LAYOUT).withName("szLongName")
    ).withName("_PROV_ENUMALGS_EX");
    public static MemoryLayout $LAYOUT() {
        return _PROV_ENUMALGS_EX.$struct$LAYOUT;
    }
    static final VarHandle aiAlgid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("aiAlgid"));
    public static VarHandle aiAlgid$VH() {
        return _PROV_ENUMALGS_EX.aiAlgid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ALG_ID aiAlgid;
     * }
     */
    public static int aiAlgid$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.aiAlgid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ALG_ID aiAlgid;
     * }
     */
    public static void aiAlgid$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.aiAlgid$VH.set(seg, x);
    }
    public static int aiAlgid$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.aiAlgid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aiAlgid$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.aiAlgid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDefaultLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDefaultLen"));
    public static VarHandle dwDefaultLen$VH() {
        return _PROV_ENUMALGS_EX.dwDefaultLen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDefaultLen;
     * }
     */
    public static int dwDefaultLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.dwDefaultLen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDefaultLen;
     * }
     */
    public static void dwDefaultLen$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.dwDefaultLen$VH.set(seg, x);
    }
    public static int dwDefaultLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.dwDefaultLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDefaultLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.dwDefaultLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMinLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMinLen"));
    public static VarHandle dwMinLen$VH() {
        return _PROV_ENUMALGS_EX.dwMinLen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMinLen;
     * }
     */
    public static int dwMinLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.dwMinLen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMinLen;
     * }
     */
    public static void dwMinLen$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.dwMinLen$VH.set(seg, x);
    }
    public static int dwMinLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.dwMinLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.dwMinLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxLen"));
    public static VarHandle dwMaxLen$VH() {
        return _PROV_ENUMALGS_EX.dwMaxLen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMaxLen;
     * }
     */
    public static int dwMaxLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.dwMaxLen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMaxLen;
     * }
     */
    public static void dwMaxLen$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.dwMaxLen$VH.set(seg, x);
    }
    public static int dwMaxLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.dwMaxLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.dwMaxLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProtocols$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProtocols"));
    public static VarHandle dwProtocols$VH() {
        return _PROV_ENUMALGS_EX.dwProtocols$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProtocols;
     * }
     */
    public static int dwProtocols$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.dwProtocols$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProtocols;
     * }
     */
    public static void dwProtocols$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.dwProtocols$VH.set(seg, x);
    }
    public static int dwProtocols$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.dwProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProtocols$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.dwProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNameLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNameLen"));
    public static VarHandle dwNameLen$VH() {
        return _PROV_ENUMALGS_EX.dwNameLen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNameLen;
     * }
     */
    public static int dwNameLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.dwNameLen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNameLen;
     * }
     */
    public static void dwNameLen$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.dwNameLen$VH.set(seg, x);
    }
    public static int dwNameLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.dwNameLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNameLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.dwNameLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szName$slice(MemorySegment seg) {
        return seg.asSlice(24, 20);
    }
    static final VarHandle dwLongNameLen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLongNameLen"));
    public static VarHandle dwLongNameLen$VH() {
        return _PROV_ENUMALGS_EX.dwLongNameLen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwLongNameLen;
     * }
     */
    public static int dwLongNameLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS_EX.dwLongNameLen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwLongNameLen;
     * }
     */
    public static void dwLongNameLen$set(MemorySegment seg, int x) {
        _PROV_ENUMALGS_EX.dwLongNameLen$VH.set(seg, x);
    }
    public static int dwLongNameLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS_EX.dwLongNameLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLongNameLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS_EX.dwLongNameLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szLongName$slice(MemorySegment seg) {
        return seg.asSlice(48, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


