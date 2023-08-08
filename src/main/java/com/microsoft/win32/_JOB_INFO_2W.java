// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOB_INFO_2W {
 *     DWORD JobId;
 *     LPWSTR pPrinterName;
 *     LPWSTR pMachineName;
 *     LPWSTR pUserName;
 *     LPWSTR pDocument;
 *     LPWSTR pNotifyName;
 *     LPWSTR pDatatype;
 *     LPWSTR pPrintProcessor;
 *     LPWSTR pParameters;
 *     LPWSTR pDriverName;
 *     LPDEVMODEW pDevMode;
 *     LPWSTR pStatus;
 *     PSECURITY_DESCRIPTOR pSecurityDescriptor;
 *     DWORD Status;
 *     DWORD Priority;
 *     DWORD Position;
 *     DWORD StartTime;
 *     DWORD UntilTime;
 *     DWORD TotalPages;
 *     DWORD Size;
 *     SYSTEMTIME Submitted;
 *     DWORD Time;
 *     DWORD PagesPrinted;
 * };
 * }
 */
public class _JOB_INFO_2W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("JobId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pMachineName"),
        Constants$root.C_POINTER$LAYOUT.withName("pUserName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDocument"),
        Constants$root.C_POINTER$LAYOUT.withName("pNotifyName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_POINTER$LAYOUT.withName("pPrintProcessor"),
        Constants$root.C_POINTER$LAYOUT.withName("pParameters"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("pStatus"),
        Constants$root.C_POINTER$LAYOUT.withName("pSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        Constants$root.C_LONG$LAYOUT.withName("Priority"),
        Constants$root.C_LONG$LAYOUT.withName("Position"),
        Constants$root.C_LONG$LAYOUT.withName("StartTime"),
        Constants$root.C_LONG$LAYOUT.withName("UntilTime"),
        Constants$root.C_LONG$LAYOUT.withName("TotalPages"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
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
        Constants$root.C_LONG$LAYOUT.withName("Time"),
        Constants$root.C_LONG$LAYOUT.withName("PagesPrinted"),
        MemoryLayout.paddingLayout(32)
    ).withName("_JOB_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _JOB_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _JOB_INFO_2W.JobId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.JobId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _JOB_INFO_2W.pPrinterName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static MemorySegment pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pPrinterName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static void pPrinterName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pPrinterName$VH.set(seg, x);
    }
    public static MemorySegment pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMachineName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMachineName"));
    public static VarHandle pMachineName$VH() {
        return _JOB_INFO_2W.pMachineName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pMachineName;
     * }
     */
    public static MemorySegment pMachineName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pMachineName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pMachineName;
     * }
     */
    public static void pMachineName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pMachineName$VH.set(seg, x);
    }
    public static MemorySegment pMachineName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pMachineName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMachineName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pMachineName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUserName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUserName"));
    public static VarHandle pUserName$VH() {
        return _JOB_INFO_2W.pUserName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pUserName;
     * }
     */
    public static MemorySegment pUserName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pUserName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pUserName;
     * }
     */
    public static void pUserName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pUserName$VH.set(seg, x);
    }
    public static MemorySegment pUserName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pUserName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pUserName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDocument$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDocument"));
    public static VarHandle pDocument$VH() {
        return _JOB_INFO_2W.pDocument$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDocument;
     * }
     */
    public static MemorySegment pDocument$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDocument$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDocument;
     * }
     */
    public static void pDocument$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pDocument$VH.set(seg, x);
    }
    public static MemorySegment pDocument$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDocument$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocument$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pDocument$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pNotifyName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pNotifyName"));
    public static VarHandle pNotifyName$VH() {
        return _JOB_INFO_2W.pNotifyName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pNotifyName;
     * }
     */
    public static MemorySegment pNotifyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pNotifyName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pNotifyName;
     * }
     */
    public static void pNotifyName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pNotifyName$VH.set(seg, x);
    }
    public static MemorySegment pNotifyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pNotifyName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pNotifyName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pNotifyName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _JOB_INFO_2W.pDatatype$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDatatype$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pDatatype$VH.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrintProcessor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrintProcessor"));
    public static VarHandle pPrintProcessor$VH() {
        return _JOB_INFO_2W.pPrintProcessor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrintProcessor;
     * }
     */
    public static MemorySegment pPrintProcessor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pPrintProcessor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrintProcessor;
     * }
     */
    public static void pPrintProcessor$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pPrintProcessor$VH.set(seg, x);
    }
    public static MemorySegment pPrintProcessor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pPrintProcessor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrintProcessor$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pPrintProcessor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pParameters"));
    public static VarHandle pParameters$VH() {
        return _JOB_INFO_2W.pParameters$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pParameters;
     * }
     */
    public static MemorySegment pParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pParameters$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pParameters;
     * }
     */
    public static void pParameters$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pParameters$VH.set(seg, x);
    }
    public static MemorySegment pParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pParameters$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverName"));
    public static VarHandle pDriverName$VH() {
        return _JOB_INFO_2W.pDriverName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDriverName;
     * }
     */
    public static MemorySegment pDriverName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDriverName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDriverName;
     * }
     */
    public static void pDriverName$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pDriverName$VH.set(seg, x);
    }
    public static MemorySegment pDriverName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDriverName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverName$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pDriverName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    public static VarHandle pDevMode$VH() {
        return _JOB_INFO_2W.pDevMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static MemorySegment pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDevMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static void pDevMode$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pDevMode$VH.set(seg, x);
    }
    public static MemorySegment pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pStatus"));
    public static VarHandle pStatus$VH() {
        return _JOB_INFO_2W.pStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pStatus;
     * }
     */
    public static MemorySegment pStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pStatus;
     * }
     */
    public static void pStatus$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pStatus$VH.set(seg, x);
    }
    public static MemorySegment pStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStatus$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSecurityDescriptor"));
    public static VarHandle pSecurityDescriptor$VH() {
        return _JOB_INFO_2W.pSecurityDescriptor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pSecurityDescriptor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static void pSecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        _JOB_INFO_2W.pSecurityDescriptor$VH.set(seg, x);
    }
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_JOB_INFO_2W.pSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        _JOB_INFO_2W.pSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _JOB_INFO_2W.Status$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static int Status$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.Status$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static void Status$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Priority"));
    public static VarHandle Priority$VH() {
        return _JOB_INFO_2W.Priority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static int Priority$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.Priority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static void Priority$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.Priority$VH.set(seg, x);
    }
    public static int Priority$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.Priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Priority$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.Priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Position"));
    public static VarHandle Position$VH() {
        return _JOB_INFO_2W.Position$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Position;
     * }
     */
    public static int Position$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.Position$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Position;
     * }
     */
    public static void Position$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.Position$VH.set(seg, x);
    }
    public static int Position$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.Position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Position$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.Position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StartTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartTime"));
    public static VarHandle StartTime$VH() {
        return _JOB_INFO_2W.StartTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StartTime;
     * }
     */
    public static int StartTime$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.StartTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StartTime;
     * }
     */
    public static void StartTime$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.StartTime$VH.set(seg, x);
    }
    public static int StartTime$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.StartTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartTime$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.StartTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UntilTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UntilTime"));
    public static VarHandle UntilTime$VH() {
        return _JOB_INFO_2W.UntilTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UntilTime;
     * }
     */
    public static int UntilTime$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.UntilTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UntilTime;
     * }
     */
    public static void UntilTime$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.UntilTime$VH.set(seg, x);
    }
    public static int UntilTime$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.UntilTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UntilTime$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.UntilTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalPages$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalPages"));
    public static VarHandle TotalPages$VH() {
        return _JOB_INFO_2W.TotalPages$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalPages;
     * }
     */
    public static int TotalPages$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.TotalPages$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalPages;
     * }
     */
    public static void TotalPages$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.TotalPages$VH.set(seg, x);
    }
    public static int TotalPages$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.TotalPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalPages$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.TotalPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _JOB_INFO_2W.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Submitted$slice(MemorySegment seg) {
        return seg.asSlice(132, 16);
    }
    static final VarHandle Time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Time"));
    public static VarHandle Time$VH() {
        return _JOB_INFO_2W.Time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Time;
     * }
     */
    public static int Time$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.Time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Time;
     * }
     */
    public static void Time$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.Time$VH.set(seg, x);
    }
    public static int Time$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.Time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Time$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.Time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PagesPrinted$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PagesPrinted"));
    public static VarHandle PagesPrinted$VH() {
        return _JOB_INFO_2W.PagesPrinted$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PagesPrinted;
     * }
     */
    public static int PagesPrinted$get(MemorySegment seg) {
        return (int)_JOB_INFO_2W.PagesPrinted$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PagesPrinted;
     * }
     */
    public static void PagesPrinted$set(MemorySegment seg, int x) {
        _JOB_INFO_2W.PagesPrinted$VH.set(seg, x);
    }
    public static int PagesPrinted$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_2W.PagesPrinted$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PagesPrinted$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_2W.PagesPrinted$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


