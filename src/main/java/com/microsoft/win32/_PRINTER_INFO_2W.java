// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_INFO_2W {
 *     LPWSTR pServerName;
 *     LPWSTR pPrinterName;
 *     LPWSTR pShareName;
 *     LPWSTR pPortName;
 *     LPWSTR pDriverName;
 *     LPWSTR pComment;
 *     LPWSTR pLocation;
 *     LPDEVMODEW pDevMode;
 *     LPWSTR pSepFile;
 *     LPWSTR pPrintProcessor;
 *     LPWSTR pDatatype;
 *     LPWSTR pParameters;
 *     PSECURITY_DESCRIPTOR pSecurityDescriptor;
 *     DWORD Attributes;
 *     DWORD Priority;
 *     DWORD DefaultPriority;
 *     DWORD StartTime;
 *     DWORD UntilTime;
 *     DWORD Status;
 *     DWORD cJobs;
 *     DWORD AveragePPM;
 * };
 * }
 */
public class _PRINTER_INFO_2W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pServerName"),
        Constants$root.C_POINTER$LAYOUT.withName("pPrinterName"),
        Constants$root.C_POINTER$LAYOUT.withName("pShareName"),
        Constants$root.C_POINTER$LAYOUT.withName("pPortName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverName"),
        Constants$root.C_POINTER$LAYOUT.withName("pComment"),
        Constants$root.C_POINTER$LAYOUT.withName("pLocation"),
        Constants$root.C_POINTER$LAYOUT.withName("pDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("pSepFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pPrintProcessor"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_POINTER$LAYOUT.withName("pParameters"),
        Constants$root.C_POINTER$LAYOUT.withName("pSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("Attributes"),
        Constants$root.C_LONG$LAYOUT.withName("Priority"),
        Constants$root.C_LONG$LAYOUT.withName("DefaultPriority"),
        Constants$root.C_LONG$LAYOUT.withName("StartTime"),
        Constants$root.C_LONG$LAYOUT.withName("UntilTime"),
        Constants$root.C_LONG$LAYOUT.withName("Status"),
        Constants$root.C_LONG$LAYOUT.withName("cJobs"),
        Constants$root.C_LONG$LAYOUT.withName("AveragePPM")
    ).withName("_PRINTER_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle pServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pServerName"));
    public static VarHandle pServerName$VH() {
        return _PRINTER_INFO_2W.pServerName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pServerName;
     * }
     */
    public static MemorySegment pServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pServerName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pServerName;
     * }
     */
    public static void pServerName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pServerName$VH.set(seg, x);
    }
    public static MemorySegment pServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pServerName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrinterName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    public static VarHandle pPrinterName$VH() {
        return _PRINTER_INFO_2W.pPrinterName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static MemorySegment pPrinterName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pPrinterName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrinterName;
     * }
     */
    public static void pPrinterName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pPrinterName$VH.set(seg, x);
    }
    public static MemorySegment pPrinterName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pPrinterName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrinterName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pPrinterName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pShareName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pShareName"));
    public static VarHandle pShareName$VH() {
        return _PRINTER_INFO_2W.pShareName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pShareName;
     * }
     */
    public static MemorySegment pShareName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pShareName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pShareName;
     * }
     */
    public static void pShareName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pShareName$VH.set(seg, x);
    }
    public static MemorySegment pShareName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pShareName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pShareName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pShareName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    public static VarHandle pPortName$VH() {
        return _PRINTER_INFO_2W.pPortName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPortName;
     * }
     */
    public static MemorySegment pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pPortName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPortName;
     * }
     */
    public static void pPortName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pPortName$VH.set(seg, x);
    }
    public static MemorySegment pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverName"));
    public static VarHandle pDriverName$VH() {
        return _PRINTER_INFO_2W.pDriverName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDriverName;
     * }
     */
    public static MemorySegment pDriverName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pDriverName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDriverName;
     * }
     */
    public static void pDriverName$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pDriverName$VH.set(seg, x);
    }
    public static MemorySegment pDriverName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pDriverName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverName$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pDriverName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pComment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pComment"));
    public static VarHandle pComment$VH() {
        return _PRINTER_INFO_2W.pComment$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pComment;
     * }
     */
    public static MemorySegment pComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pComment$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pComment;
     * }
     */
    public static void pComment$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pComment$VH.set(seg, x);
    }
    public static MemorySegment pComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pComment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pComment$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pComment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pLocation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pLocation"));
    public static VarHandle pLocation$VH() {
        return _PRINTER_INFO_2W.pLocation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pLocation;
     * }
     */
    public static MemorySegment pLocation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pLocation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pLocation;
     * }
     */
    public static void pLocation$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pLocation$VH.set(seg, x);
    }
    public static MemorySegment pLocation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pLocation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pLocation$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pLocation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    public static VarHandle pDevMode$VH() {
        return _PRINTER_INFO_2W.pDevMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static MemorySegment pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pDevMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static void pDevMode$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pDevMode$VH.set(seg, x);
    }
    public static MemorySegment pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSepFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSepFile"));
    public static VarHandle pSepFile$VH() {
        return _PRINTER_INFO_2W.pSepFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pSepFile;
     * }
     */
    public static MemorySegment pSepFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pSepFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pSepFile;
     * }
     */
    public static void pSepFile$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pSepFile$VH.set(seg, x);
    }
    public static MemorySegment pSepFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pSepFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSepFile$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pSepFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPrintProcessor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPrintProcessor"));
    public static VarHandle pPrintProcessor$VH() {
        return _PRINTER_INFO_2W.pPrintProcessor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPrintProcessor;
     * }
     */
    public static MemorySegment pPrintProcessor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pPrintProcessor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPrintProcessor;
     * }
     */
    public static void pPrintProcessor$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pPrintProcessor$VH.set(seg, x);
    }
    public static MemorySegment pPrintProcessor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pPrintProcessor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPrintProcessor$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pPrintProcessor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _PRINTER_INFO_2W.pDatatype$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pDatatype$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pDatatype$VH.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pParameters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pParameters"));
    public static VarHandle pParameters$VH() {
        return _PRINTER_INFO_2W.pParameters$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pParameters;
     * }
     */
    public static MemorySegment pParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pParameters$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pParameters;
     * }
     */
    public static void pParameters$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pParameters$VH.set(seg, x);
    }
    public static MemorySegment pParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pParameters$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSecurityDescriptor"));
    public static VarHandle pSecurityDescriptor$VH() {
        return _PRINTER_INFO_2W.pSecurityDescriptor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pSecurityDescriptor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static void pSecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_2W.pSecurityDescriptor$VH.set(seg, x);
    }
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_2W.pSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_2W.pSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _PRINTER_INFO_2W.Attributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Attributes;
     * }
     */
    public static int Attributes$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.Attributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Attributes;
     * }
     */
    public static void Attributes$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.Attributes$VH.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Priority"));
    public static VarHandle Priority$VH() {
        return _PRINTER_INFO_2W.Priority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static int Priority$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.Priority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Priority;
     * }
     */
    public static void Priority$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.Priority$VH.set(seg, x);
    }
    public static int Priority$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.Priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Priority$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.Priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DefaultPriority"));
    public static VarHandle DefaultPriority$VH() {
        return _PRINTER_INFO_2W.DefaultPriority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DefaultPriority;
     * }
     */
    public static int DefaultPriority$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.DefaultPriority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DefaultPriority;
     * }
     */
    public static void DefaultPriority$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.DefaultPriority$VH.set(seg, x);
    }
    public static int DefaultPriority$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.DefaultPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultPriority$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.DefaultPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StartTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StartTime"));
    public static VarHandle StartTime$VH() {
        return _PRINTER_INFO_2W.StartTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StartTime;
     * }
     */
    public static int StartTime$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.StartTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StartTime;
     * }
     */
    public static void StartTime$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.StartTime$VH.set(seg, x);
    }
    public static int StartTime$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.StartTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StartTime$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.StartTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UntilTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UntilTime"));
    public static VarHandle UntilTime$VH() {
        return _PRINTER_INFO_2W.UntilTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UntilTime;
     * }
     */
    public static int UntilTime$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.UntilTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UntilTime;
     * }
     */
    public static void UntilTime$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.UntilTime$VH.set(seg, x);
    }
    public static int UntilTime$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.UntilTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UntilTime$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.UntilTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Status"));
    public static VarHandle Status$VH() {
        return _PRINTER_INFO_2W.Status$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static int Status$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.Status$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static void Status$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.Status$VH.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.Status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.Status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cJobs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cJobs"));
    public static VarHandle cJobs$VH() {
        return _PRINTER_INFO_2W.cJobs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cJobs;
     * }
     */
    public static int cJobs$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.cJobs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cJobs;
     * }
     */
    public static void cJobs$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.cJobs$VH.set(seg, x);
    }
    public static int cJobs$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.cJobs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cJobs$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.cJobs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AveragePPM$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AveragePPM"));
    public static VarHandle AveragePPM$VH() {
        return _PRINTER_INFO_2W.AveragePPM$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AveragePPM;
     * }
     */
    public static int AveragePPM$get(MemorySegment seg) {
        return (int)_PRINTER_INFO_2W.AveragePPM$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AveragePPM;
     * }
     */
    public static void AveragePPM$set(MemorySegment seg, int x) {
        _PRINTER_INFO_2W.AveragePPM$VH.set(seg, x);
    }
    public static int AveragePPM$get(MemorySegment seg, long index) {
        return (int)_PRINTER_INFO_2W.AveragePPM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AveragePPM$set(MemorySegment seg, long index, int x) {
        _PRINTER_INFO_2W.AveragePPM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


