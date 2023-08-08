// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _OPEN_PRINTER_PROPS_INFOA {
 *     DWORD dwSize;
 *     LPSTR pszSheetName;
 *     UINT uSheetIndex;
 *     DWORD dwFlags;
 *     BOOL bModal;
 * };
 * }
 */
public class _OPEN_PRINTER_PROPS_INFOA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszSheetName"),
        Constants$root.C_LONG$LAYOUT.withName("uSheetIndex"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("bModal"),
        MemoryLayout.paddingLayout(32)
    ).withName("_OPEN_PRINTER_PROPS_INFOA");
    public static MemoryLayout $LAYOUT() {
        return _OPEN_PRINTER_PROPS_INFOA.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _OPEN_PRINTER_PROPS_INFOA.dwSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.dwSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        _OPEN_PRINTER_PROPS_INFOA.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _OPEN_PRINTER_PROPS_INFOA.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszSheetName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszSheetName"));
    public static VarHandle pszSheetName$VH() {
        return _OPEN_PRINTER_PROPS_INFOA.pszSheetName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszSheetName;
     * }
     */
    public static MemorySegment pszSheetName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_OPEN_PRINTER_PROPS_INFOA.pszSheetName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszSheetName;
     * }
     */
    public static void pszSheetName$set(MemorySegment seg, MemorySegment x) {
        _OPEN_PRINTER_PROPS_INFOA.pszSheetName$VH.set(seg, x);
    }
    public static MemorySegment pszSheetName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_OPEN_PRINTER_PROPS_INFOA.pszSheetName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszSheetName$set(MemorySegment seg, long index, MemorySegment x) {
        _OPEN_PRINTER_PROPS_INFOA.pszSheetName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uSheetIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("uSheetIndex"));
    public static VarHandle uSheetIndex$VH() {
        return _OPEN_PRINTER_PROPS_INFOA.uSheetIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uSheetIndex;
     * }
     */
    public static int uSheetIndex$get(MemorySegment seg) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.uSheetIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uSheetIndex;
     * }
     */
    public static void uSheetIndex$set(MemorySegment seg, int x) {
        _OPEN_PRINTER_PROPS_INFOA.uSheetIndex$VH.set(seg, x);
    }
    public static int uSheetIndex$get(MemorySegment seg, long index) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.uSheetIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uSheetIndex$set(MemorySegment seg, long index, int x) {
        _OPEN_PRINTER_PROPS_INFOA.uSheetIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _OPEN_PRINTER_PROPS_INFOA.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _OPEN_PRINTER_PROPS_INFOA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _OPEN_PRINTER_PROPS_INFOA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bModal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bModal"));
    public static VarHandle bModal$VH() {
        return _OPEN_PRINTER_PROPS_INFOA.bModal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL bModal;
     * }
     */
    public static int bModal$get(MemorySegment seg) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.bModal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL bModal;
     * }
     */
    public static void bModal$set(MemorySegment seg, int x) {
        _OPEN_PRINTER_PROPS_INFOA.bModal$VH.set(seg, x);
    }
    public static int bModal$get(MemorySegment seg, long index) {
        return (int)_OPEN_PRINTER_PROPS_INFOA.bModal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bModal$set(MemorySegment seg, long index, int x) {
        _OPEN_PRINTER_PROPS_INFOA.bModal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


