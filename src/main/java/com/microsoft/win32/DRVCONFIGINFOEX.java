// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DRVCONFIGINFOEX {
 *     DWORD dwDCISize;
 *     LPCWSTR lpszDCISectionName;
 *     LPCWSTR lpszDCIAliasName;
 *     DWORD dnDevNode;
 * };
 * }
 */
public class DRVCONFIGINFOEX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwDCISize"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpszDCISectionName"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpszDCIAliasName"),
        Constants$root.C_LONG$LAYOUT.withName("dnDevNode")
    ).withName("DRVCONFIGINFOEX");
    public static MemoryLayout $LAYOUT() {
        return DRVCONFIGINFOEX.$struct$LAYOUT;
    }
    static final VarHandle dwDCISize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDCISize"));
    public static VarHandle dwDCISize$VH() {
        return DRVCONFIGINFOEX.dwDCISize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDCISize;
     * }
     */
    public static int dwDCISize$get(MemorySegment seg) {
        return (int)DRVCONFIGINFOEX.dwDCISize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDCISize;
     * }
     */
    public static void dwDCISize$set(MemorySegment seg, int x) {
        DRVCONFIGINFOEX.dwDCISize$VH.set(seg, x);
    }
    public static int dwDCISize$get(MemorySegment seg, long index) {
        return (int)DRVCONFIGINFOEX.dwDCISize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDCISize$set(MemorySegment seg, long index, int x) {
        DRVCONFIGINFOEX.dwDCISize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDCISectionName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszDCISectionName"));
    public static VarHandle lpszDCISectionName$VH() {
        return DRVCONFIGINFOEX.lpszDCISectionName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpszDCISectionName;
     * }
     */
    public static MemorySegment lpszDCISectionName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)DRVCONFIGINFOEX.lpszDCISectionName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpszDCISectionName;
     * }
     */
    public static void lpszDCISectionName$set(MemorySegment seg, MemorySegment x) {
        DRVCONFIGINFOEX.lpszDCISectionName$VH.set(seg, x);
    }
    public static MemorySegment lpszDCISectionName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)DRVCONFIGINFOEX.lpszDCISectionName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDCISectionName$set(MemorySegment seg, long index, MemorySegment x) {
        DRVCONFIGINFOEX.lpszDCISectionName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDCIAliasName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszDCIAliasName"));
    public static VarHandle lpszDCIAliasName$VH() {
        return DRVCONFIGINFOEX.lpszDCIAliasName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpszDCIAliasName;
     * }
     */
    public static MemorySegment lpszDCIAliasName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)DRVCONFIGINFOEX.lpszDCIAliasName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpszDCIAliasName;
     * }
     */
    public static void lpszDCIAliasName$set(MemorySegment seg, MemorySegment x) {
        DRVCONFIGINFOEX.lpszDCIAliasName$VH.set(seg, x);
    }
    public static MemorySegment lpszDCIAliasName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)DRVCONFIGINFOEX.lpszDCIAliasName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDCIAliasName$set(MemorySegment seg, long index, MemorySegment x) {
        DRVCONFIGINFOEX.lpszDCIAliasName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dnDevNode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dnDevNode"));
    public static VarHandle dnDevNode$VH() {
        return DRVCONFIGINFOEX.dnDevNode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dnDevNode;
     * }
     */
    public static int dnDevNode$get(MemorySegment seg) {
        return (int)DRVCONFIGINFOEX.dnDevNode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dnDevNode;
     * }
     */
    public static void dnDevNode$set(MemorySegment seg, int x) {
        DRVCONFIGINFOEX.dnDevNode$VH.set(seg, x);
    }
    public static int dnDevNode$get(MemorySegment seg, long index) {
        return (int)DRVCONFIGINFOEX.dnDevNode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dnDevNode$set(MemorySegment seg, long index, int x) {
        DRVCONFIGINFOEX.dnDevNode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


