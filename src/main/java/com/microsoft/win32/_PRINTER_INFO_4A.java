// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_INFO_4A {
 *     LPSTR pPrinterName;
 *     LPSTR pServerName;
 *     DWORD Attributes;
 * };
 * }
 */
public class _PRINTER_INFO_4A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pServerName"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_INFO_4A");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_4A.$struct$LAYOUT;
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _PRINTER_INFO_4A.pPrinterName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pPrinterName;
     * }
     */
    public static MemorySegment pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_4A.pPrinterName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pPrinterName;
     * }
     */
    public static void pPrinterName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_4A.pPrinterName$VH.set(seg, x);
    }
    public static MemorySegment pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_4A.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_4A.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pServerName"));
    public static VarHandle pServerName$VH() {
        return _PRINTER_INFO_4A.pServerName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pServerName;
     * }
     */
    public static MemorySegment pServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_4A.pServerName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pServerName;
     * }
     */
    public static void pServerName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_4A.pServerName$VH.set(seg, x);
    }
    public static MemorySegment pServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_4A.pServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pServerName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_4A.pServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _PRINTER_INFO_4A.Attributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Attributes;
     * }
     */
    public static int Attributes$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_4A.Attributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Attributes;
     * }
     */
    public static void Attributes$set(MemorySegment seg, int x) {
        _PRINTER_INFO_4A.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_4A.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_4A.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


