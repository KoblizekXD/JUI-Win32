// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DRIVER_INFO_6A {
 *     DWORD cVersion;
 *     LPSTR pName;
 *     LPSTR pEnvironment;
 *     LPSTR pDriverPath;
 *     LPSTR pDataFile;
 *     LPSTR pConfigFile;
 *     LPSTR pHelpFile;
 *     LPSTR pDependentFiles;
 *     LPSTR pMonitorName;
 *     LPSTR pDefaultDataType;
 *     LPSTR pszzPreviousNames;
 *     FILETIME ftDriverDate;
 *     DWORDLONG dwlDriverVersion;
 *     LPSTR pszMfgName;
 *     LPSTR pszOEMUrl;
 *     LPSTR pszHardwareID;
 *     LPSTR pszProvider;
 * };
 * }
 */
public class _DRIVER_INFO_6A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pName"),
        Constants$root.C_POINTER$LAYOUT.withName("pEnvironment"),
        Constants$root.C_POINTER$LAYOUT.withName("pDriverPath"),
        Constants$root.C_POINTER$LAYOUT.withName("pDataFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pConfigFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pHelpFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pDependentFiles"),
        Constants$root.C_POINTER$LAYOUT.withName("pMonitorName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDefaultDataType"),
        Constants$root.C_POINTER$LAYOUT.withName("pszzPreviousNames"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwLowDateTime"),
            Constants$root.C_LONG$LAYOUT.withName("dwHighDateTime")
        ).withName("ftDriverDate"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwlDriverVersion"),
        Constants$root.C_POINTER$LAYOUT.withName("pszMfgName"),
        Constants$root.C_POINTER$LAYOUT.withName("pszOEMUrl"),
        Constants$root.C_POINTER$LAYOUT.withName("pszHardwareID"),
        Constants$root.C_POINTER$LAYOUT.withName("pszProvider")
    ).withName("_DRIVER_INFO_6A");
    public static MemoryLayout $LAYOUT() {
        return _DRIVER_INFO_6A.$struct$LAYOUT;
    }
    static final VarHandle cVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cVersion"));
    public static VarHandle cVersion$VH() {
        return _DRIVER_INFO_6A.cVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cVersion;
     * }
     */
    public static int cVersion$get(MemorySegment seg) {
        return (int)_DRIVER_INFO_6A.cVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cVersion;
     * }
     */
    public static void cVersion$set(MemorySegment seg, int x) {
        _DRIVER_INFO_6A.cVersion$VH.set(seg, x);
    }
    public static int cVersion$get(MemorySegment seg, long index) {
        return (int)_DRIVER_INFO_6A.cVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cVersion$set(MemorySegment seg, long index, int x) {
        _DRIVER_INFO_6A.cVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _DRIVER_INFO_6A.pName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pName;
     * }
     */
    public static MemorySegment pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pName;
     * }
     */
    public static void pName$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pName$VH.set(seg, x);
    }
    public static MemorySegment pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEnvironment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEnvironment"));
    public static VarHandle pEnvironment$VH() {
        return _DRIVER_INFO_6A.pEnvironment$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pEnvironment;
     * }
     */
    public static MemorySegment pEnvironment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pEnvironment$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pEnvironment;
     * }
     */
    public static void pEnvironment$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pEnvironment$VH.set(seg, x);
    }
    public static MemorySegment pEnvironment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pEnvironment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEnvironment$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pEnvironment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDriverPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDriverPath"));
    public static VarHandle pDriverPath$VH() {
        return _DRIVER_INFO_6A.pDriverPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDriverPath;
     * }
     */
    public static MemorySegment pDriverPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDriverPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDriverPath;
     * }
     */
    public static void pDriverPath$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pDriverPath$VH.set(seg, x);
    }
    public static MemorySegment pDriverPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDriverPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDriverPath$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pDriverPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDataFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDataFile"));
    public static VarHandle pDataFile$VH() {
        return _DRIVER_INFO_6A.pDataFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDataFile;
     * }
     */
    public static MemorySegment pDataFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDataFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDataFile;
     * }
     */
    public static void pDataFile$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pDataFile$VH.set(seg, x);
    }
    public static MemorySegment pDataFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDataFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDataFile$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pDataFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pConfigFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pConfigFile"));
    public static VarHandle pConfigFile$VH() {
        return _DRIVER_INFO_6A.pConfigFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pConfigFile;
     * }
     */
    public static MemorySegment pConfigFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pConfigFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pConfigFile;
     * }
     */
    public static void pConfigFile$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pConfigFile$VH.set(seg, x);
    }
    public static MemorySegment pConfigFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pConfigFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pConfigFile$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pConfigFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pHelpFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pHelpFile"));
    public static VarHandle pHelpFile$VH() {
        return _DRIVER_INFO_6A.pHelpFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pHelpFile;
     * }
     */
    public static MemorySegment pHelpFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pHelpFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pHelpFile;
     * }
     */
    public static void pHelpFile$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pHelpFile$VH.set(seg, x);
    }
    public static MemorySegment pHelpFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pHelpFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pHelpFile$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pHelpFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDependentFiles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDependentFiles"));
    public static VarHandle pDependentFiles$VH() {
        return _DRIVER_INFO_6A.pDependentFiles$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDependentFiles;
     * }
     */
    public static MemorySegment pDependentFiles$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDependentFiles$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDependentFiles;
     * }
     */
    public static void pDependentFiles$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pDependentFiles$VH.set(seg, x);
    }
    public static MemorySegment pDependentFiles$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDependentFiles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDependentFiles$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pDependentFiles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMonitorName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMonitorName"));
    public static VarHandle pMonitorName$VH() {
        return _DRIVER_INFO_6A.pMonitorName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pMonitorName;
     * }
     */
    public static MemorySegment pMonitorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pMonitorName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pMonitorName;
     * }
     */
    public static void pMonitorName$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pMonitorName$VH.set(seg, x);
    }
    public static MemorySegment pMonitorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pMonitorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pMonitorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDefaultDataType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDefaultDataType"));
    public static VarHandle pDefaultDataType$VH() {
        return _DRIVER_INFO_6A.pDefaultDataType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDefaultDataType;
     * }
     */
    public static MemorySegment pDefaultDataType$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDefaultDataType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDefaultDataType;
     * }
     */
    public static void pDefaultDataType$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pDefaultDataType$VH.set(seg, x);
    }
    public static MemorySegment pDefaultDataType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pDefaultDataType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDefaultDataType$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pDefaultDataType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszzPreviousNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszzPreviousNames"));
    public static VarHandle pszzPreviousNames$VH() {
        return _DRIVER_INFO_6A.pszzPreviousNames$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszzPreviousNames;
     * }
     */
    public static MemorySegment pszzPreviousNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszzPreviousNames$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszzPreviousNames;
     * }
     */
    public static void pszzPreviousNames$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pszzPreviousNames$VH.set(seg, x);
    }
    public static MemorySegment pszzPreviousNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszzPreviousNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszzPreviousNames$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pszzPreviousNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ftDriverDate$slice(MemorySegment seg) {
        return seg.asSlice(88, 8);
    }
    static final VarHandle dwlDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwlDriverVersion"));
    public static VarHandle dwlDriverVersion$VH() {
        return _DRIVER_INFO_6A.dwlDriverVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG dwlDriverVersion;
     * }
     */
    public static long dwlDriverVersion$get(MemorySegment seg) {
        return (long)_DRIVER_INFO_6A.dwlDriverVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG dwlDriverVersion;
     * }
     */
    public static void dwlDriverVersion$set(MemorySegment seg, long x) {
        _DRIVER_INFO_6A.dwlDriverVersion$VH.set(seg, x);
    }
    public static long dwlDriverVersion$get(MemorySegment seg, long index) {
        return (long)_DRIVER_INFO_6A.dwlDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwlDriverVersion$set(MemorySegment seg, long index, long x) {
        _DRIVER_INFO_6A.dwlDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszMfgName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszMfgName"));
    public static VarHandle pszMfgName$VH() {
        return _DRIVER_INFO_6A.pszMfgName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszMfgName;
     * }
     */
    public static MemorySegment pszMfgName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszMfgName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszMfgName;
     * }
     */
    public static void pszMfgName$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pszMfgName$VH.set(seg, x);
    }
    public static MemorySegment pszMfgName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszMfgName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszMfgName$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pszMfgName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszOEMUrl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOEMUrl"));
    public static VarHandle pszOEMUrl$VH() {
        return _DRIVER_INFO_6A.pszOEMUrl$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszOEMUrl;
     * }
     */
    public static MemorySegment pszOEMUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszOEMUrl$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszOEMUrl;
     * }
     */
    public static void pszOEMUrl$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pszOEMUrl$VH.set(seg, x);
    }
    public static MemorySegment pszOEMUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszOEMUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOEMUrl$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pszOEMUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszHardwareID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszHardwareID"));
    public static VarHandle pszHardwareID$VH() {
        return _DRIVER_INFO_6A.pszHardwareID$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszHardwareID;
     * }
     */
    public static MemorySegment pszHardwareID$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszHardwareID$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszHardwareID;
     * }
     */
    public static void pszHardwareID$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pszHardwareID$VH.set(seg, x);
    }
    public static MemorySegment pszHardwareID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszHardwareID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszHardwareID$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pszHardwareID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszProvider$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszProvider"));
    public static VarHandle pszProvider$VH() {
        return _DRIVER_INFO_6A.pszProvider$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszProvider;
     * }
     */
    public static MemorySegment pszProvider$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszProvider$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszProvider;
     * }
     */
    public static void pszProvider$set(MemorySegment seg, MemorySegment x) {
        _DRIVER_INFO_6A.pszProvider$VH.set(seg, x);
    }
    public static MemorySegment pszProvider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DRIVER_INFO_6A.pszProvider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszProvider$set(MemorySegment seg, long index, MemorySegment x) {
        _DRIVER_INFO_6A.pszProvider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

