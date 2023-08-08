// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_ENUM_VALUESW {
 *     LPWSTR pValueName;
 *     DWORD cbValueName;
 *     DWORD dwType;
 *     LPBYTE pData;
 *     DWORD cbData;
 * };
 * }
 */
public class _PRINTER_ENUM_VALUESW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pValueName"),
        Constants$root.C_LONG$LAYOUT.withName("cbValueName"),
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        Constants$root.C_POINTER$LAYOUT.withName("pData"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_ENUM_VALUESW");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_ENUM_VALUESW.$struct$LAYOUT;
    }
    static final VarHandle pValueName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pValueName"));
    public static VarHandle pValueName$VH() {
        return _PRINTER_ENUM_VALUESW.pValueName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pValueName;
     * }
     */
    public static MemorySegment pValueName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_ENUM_VALUESW.pValueName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pValueName;
     * }
     */
    public static void pValueName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_ENUM_VALUESW.pValueName$VH.set(seg, x);
    }
    public static MemorySegment pValueName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_ENUM_VALUESW.pValueName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pValueName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_ENUM_VALUESW.pValueName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbValueName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbValueName"));
    public static VarHandle cbValueName$VH() {
        return _PRINTER_ENUM_VALUESW.cbValueName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbValueName;
     * }
     */
    public static int cbValueName$get(MemorySegment seg) {
        return (int)_PRINTER_ENUM_VALUESW.cbValueName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbValueName;
     * }
     */
    public static void cbValueName$set(MemorySegment seg, int x) {
        _PRINTER_ENUM_VALUESW.cbValueName$VH.set(seg, x);
    }
    public static int cbValueName$get(MemorySegment seg, long index) {
        return (int)_PRINTER_ENUM_VALUESW.cbValueName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbValueName$set(MemorySegment seg, long index, int x) {
        _PRINTER_ENUM_VALUESW.cbValueName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return _PRINTER_ENUM_VALUESW.dwType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static int dwType$get(MemorySegment seg) {
        return (int)_PRINTER_ENUM_VALUESW.dwType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static void dwType$set(MemorySegment seg, int x) {
        _PRINTER_ENUM_VALUESW.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)_PRINTER_ENUM_VALUESW.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        _PRINTER_ENUM_VALUESW.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return _PRINTER_ENUM_VALUESW.pData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPBYTE pData;
     * }
     */
    public static MemorySegment pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_ENUM_VALUESW.pData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPBYTE pData;
     * }
     */
    public static void pData$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_ENUM_VALUESW.pData$VH.set(seg, x);
    }
    public static MemorySegment pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_ENUM_VALUESW.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_ENUM_VALUESW.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _PRINTER_ENUM_VALUESW.cbData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)_PRINTER_ENUM_VALUESW.cbData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        _PRINTER_ENUM_VALUESW.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)_PRINTER_ENUM_VALUESW.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        _PRINTER_ENUM_VALUESW.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


