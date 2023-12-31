// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOB_INFO_1W {
 *     DWORD JobId;
 *     LPWSTR pPrinterName;
 *     LPWSTR pMachineName;
 *     LPWSTR pUserName;
 *     LPWSTR pDocument;
 *     LPWSTR pDatatype;
 *     LPWSTR pStatus;
 *     DWORD Status;
 *     DWORD Priority;
 *     DWORD Position;
 *     DWORD TotalPages;
 *     DWORD PagesPrinted;
 *     SYSTEMTIME Submitted;
 * };
 * }
 */
public class _JOB_INFO_1W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("JobId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pMachineName"),
        Constants$root.C_POINTER$LAYOUT.withName("pUserName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDocument"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_POINTER$LAYOUT.withName("pStatus"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        Constants$root.C_LONG$LAYOUT.withName("Priority"),
        Constants$root.C_LONG$LAYOUT.withName("Position"),
        Constants$root.C_LONG$LAYOUT.withName("TotalPages"),
        Constants$root.C_LONG$LAYOUT.withName("PagesPrinted"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("Submitted"),
        MemoryLayout.paddingLayout(32)
    ).withName("_JOB_INFO_1W");
    public static MemoryLayout $LAYOUT() {
        return _JOB_INFO_1W.$struct$LAYOUT;
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _JOB_INFO_1W.JobId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_1W.JobId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        _JOB_INFO_1W.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_1W.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_1W.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _JOB_INFO_1W.pPrinterName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static MemorySegment pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pPrinterName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static void pPrinterName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_1W.pPrinterName$VH.set(seg, x);
    }
    public static MemorySegment pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_1W.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMachineName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMachineName"));
    public static VarHandle pMachineName$VH() {
        return _JOB_INFO_1W.pMachineName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pMachineName;
     * }
     */
    public static MemorySegment pMachineName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pMachineName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pMachineName;
     * }
     */
    public static void pMachineName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_1W.pMachineName$VH.set(seg, x);
    }
    public static MemorySegment pMachineName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pMachineName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMachineName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_1W.pMachineName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUserName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUserName"));
    public static VarHandle pUserName$VH() {
        return _JOB_INFO_1W.pUserName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pUserName;
     * }
     */
    public static MemorySegment pUserName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pUserName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pUserName;
     * }
     */
    public static void pUserName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_1W.pUserName$VH.set(seg, x);
    }
    public static MemorySegment pUserName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pUserName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_1W.pUserName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDocument$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDocument"));
    public static VarHandle pDocument$VH() {
        return _JOB_INFO_1W.pDocument$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDocument;
     * }
     */
    public static MemorySegment pDocument$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pDocument$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDocument;
     * }
     */
    public static void pDocument$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_1W.pDocument$VH.set(seg, x);
    }
    public static MemorySegment pDocument$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pDocument$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocument$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_1W.pDocument$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _JOB_INFO_1W.pDatatype$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pDatatype$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_1W.pDatatype$VH.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_1W.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pStatus"));
    public static VarHandle pStatus$VH() {
        return _JOB_INFO_1W.pStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pStatus;
     * }
     */
    public static MemorySegment pStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pStatus;
     * }
     */
    public static void pStatus$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_1W.pStatus$VH.set(seg, x);
    }
    public static MemorySegment pStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_1W.pStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStatus$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_1W.pStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _JOB_INFO_1W.Status$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static int Status$get(MemorySegment seg) {
        return (int)_JOB_INFO_1W.Status$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static void Status$set(MemorySegment seg, int x) {
        _JOB_INFO_1W.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_1W.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_1W.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Priority"));
    public static VarHandle Priority$VH() {
        return _JOB_INFO_1W.Priority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static int Priority$get(MemorySegment seg) {
        return (int)_JOB_INFO_1W.Priority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static void Priority$set(MemorySegment seg, int x) {
        _JOB_INFO_1W.Priority$VH.set(seg, x);
    }
    public static int Priority$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_1W.Priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Priority$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_1W.Priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Position"));
    public static VarHandle Position$VH() {
        return _JOB_INFO_1W.Position$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Position;
     * }
     */
    public static int Position$get(MemorySegment seg) {
        return (int)_JOB_INFO_1W.Position$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Position;
     * }
     */
    public static void Position$set(MemorySegment seg, int x) {
        _JOB_INFO_1W.Position$VH.set(seg, x);
    }
    public static int Position$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_1W.Position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Position$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_1W.Position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalPages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalPages"));
    public static VarHandle TotalPages$VH() {
        return _JOB_INFO_1W.TotalPages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalPages;
     * }
     */
    public static int TotalPages$get(MemorySegment seg) {
        return (int)_JOB_INFO_1W.TotalPages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalPages;
     * }
     */
    public static void TotalPages$set(MemorySegment seg, int x) {
        _JOB_INFO_1W.TotalPages$VH.set(seg, x);
    }
    public static int TotalPages$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_1W.TotalPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalPages$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_1W.TotalPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PagesPrinted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagesPrinted"));
    public static VarHandle PagesPrinted$VH() {
        return _JOB_INFO_1W.PagesPrinted$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PagesPrinted;
     * }
     */
    public static int PagesPrinted$get(MemorySegment seg) {
        return (int)_JOB_INFO_1W.PagesPrinted$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PagesPrinted;
     * }
     */
    public static void PagesPrinted$set(MemorySegment seg, int x) {
        _JOB_INFO_1W.PagesPrinted$VH.set(seg, x);
    }
    public static int PagesPrinted$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_1W.PagesPrinted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagesPrinted$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_1W.PagesPrinted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Submitted$slice(MemorySegment seg) {
        return seg.asSlice(76, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


