// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_INFO_5W {
 *     LPWSTR pPrinterName;
 *     LPWSTR pPortName;
 *     DWORD Attributes;
 *     DWORD DeviceNotSelectedTimeout;
 *     DWORD TransmissionRetryTimeout;
 * };
 * }
 */
public class _PRINTER_INFO_5W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pPortName"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes"),
        Constants$root.C_LONG$LAYOUT.withName("DeviceNotSelectedTimeout"),
        Constants$root.C_LONG$LAYOUT.withName("TransmissionRetryTimeout"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PRINTER_INFO_5W");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_5W.$struct$LAYOUT;
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _PRINTER_INFO_5W.pPrinterName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static MemorySegment pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_5W.pPrinterName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static void pPrinterName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_5W.pPrinterName$VH.set(seg, x);
    }
    public static MemorySegment pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_5W.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_5W.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    public static VarHandle pPortName$VH() {
        return _PRINTER_INFO_5W.pPortName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPortName;
     * }
     */
    public static MemorySegment pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_5W.pPortName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPortName;
     * }
     */
    public static void pPortName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_5W.pPortName$VH.set(seg, x);
    }
    public static MemorySegment pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_5W.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_5W.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _PRINTER_INFO_5W.Attributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Attributes;
     * }
     */
    public static int Attributes$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_5W.Attributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Attributes;
     * }
     */
    public static void Attributes$set(MemorySegment seg, int x) {
        _PRINTER_INFO_5W.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_5W.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_5W.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DeviceNotSelectedTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DeviceNotSelectedTimeout"));
    public static VarHandle DeviceNotSelectedTimeout$VH() {
        return _PRINTER_INFO_5W.DeviceNotSelectedTimeout$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DeviceNotSelectedTimeout;
     * }
     */
    public static int DeviceNotSelectedTimeout$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_5W.DeviceNotSelectedTimeout$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DeviceNotSelectedTimeout;
     * }
     */
    public static void DeviceNotSelectedTimeout$set(MemorySegment seg, int x) {
        _PRINTER_INFO_5W.DeviceNotSelectedTimeout$VH.set(seg, x);
    }
    public static int DeviceNotSelectedTimeout$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_5W.DeviceNotSelectedTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceNotSelectedTimeout$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_5W.DeviceNotSelectedTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransmissionRetryTimeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransmissionRetryTimeout"));
    public static VarHandle TransmissionRetryTimeout$VH() {
        return _PRINTER_INFO_5W.TransmissionRetryTimeout$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TransmissionRetryTimeout;
     * }
     */
    public static int TransmissionRetryTimeout$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_5W.TransmissionRetryTimeout$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TransmissionRetryTimeout;
     * }
     */
    public static void TransmissionRetryTimeout$set(MemorySegment seg, int x) {
        _PRINTER_INFO_5W.TransmissionRetryTimeout$VH.set(seg, x);
    }
    public static int TransmissionRetryTimeout$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_5W.TransmissionRetryTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransmissionRetryTimeout$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_5W.TransmissionRetryTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


