// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ACTIVATION_CONTEXT_DETAILED_INFORMATION {
 *     DWORD dwFlags;
 *     DWORD ulFormatVersion;
 *     DWORD ulAssemblyCount;
 *     DWORD ulRootManifestPathType;
 *     DWORD ulRootManifestPathChars;
 *     DWORD ulRootConfigurationPathType;
 *     DWORD ulRootConfigurationPathChars;
 *     DWORD ulAppDirPathType;
 *     DWORD ulAppDirPathChars;
 *     PCWSTR lpRootManifestPath;
 *     PCWSTR lpRootConfigurationPath;
 *     PCWSTR lpAppDirPath;
 * };
 * }
 */
public class _ACTIVATION_CONTEXT_DETAILED_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("ulFormatVersion"),
        Constants$root.C_LONG$LAYOUT.withName("ulAssemblyCount"),
        Constants$root.C_LONG$LAYOUT.withName("ulRootManifestPathType"),
        Constants$root.C_LONG$LAYOUT.withName("ulRootManifestPathChars"),
        Constants$root.C_LONG$LAYOUT.withName("ulRootConfigurationPathType"),
        Constants$root.C_LONG$LAYOUT.withName("ulRootConfigurationPathChars"),
        Constants$root.C_LONG$LAYOUT.withName("ulAppDirPathType"),
        Constants$root.C_LONG$LAYOUT.withName("ulAppDirPathChars"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpRootManifestPath"),
        Constants$root.C_POINTER$LAYOUT.withName("lpRootConfigurationPath"),
        Constants$root.C_POINTER$LAYOUT.withName("lpAppDirPath")
    ).withName("_ACTIVATION_CONTEXT_DETAILED_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulFormatVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulFormatVersion"));
    public static VarHandle ulFormatVersion$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulFormatVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulFormatVersion;
     * }
     */
    public static int ulFormatVersion$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulFormatVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulFormatVersion;
     * }
     */
    public static void ulFormatVersion$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulFormatVersion$VH.set(seg, x);
    }
    public static int ulFormatVersion$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulFormatVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulFormatVersion$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulFormatVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulAssemblyCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulAssemblyCount"));
    public static VarHandle ulAssemblyCount$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAssemblyCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulAssemblyCount;
     * }
     */
    public static int ulAssemblyCount$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAssemblyCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulAssemblyCount;
     * }
     */
    public static void ulAssemblyCount$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAssemblyCount$VH.set(seg, x);
    }
    public static int ulAssemblyCount$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAssemblyCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulAssemblyCount$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAssemblyCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulRootManifestPathType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulRootManifestPathType"));
    public static VarHandle ulRootManifestPathType$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulRootManifestPathType;
     * }
     */
    public static int ulRootManifestPathType$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulRootManifestPathType;
     * }
     */
    public static void ulRootManifestPathType$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathType$VH.set(seg, x);
    }
    public static int ulRootManifestPathType$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulRootManifestPathType$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulRootManifestPathChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulRootManifestPathChars"));
    public static VarHandle ulRootManifestPathChars$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathChars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulRootManifestPathChars;
     * }
     */
    public static int ulRootManifestPathChars$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathChars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulRootManifestPathChars;
     * }
     */
    public static void ulRootManifestPathChars$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathChars$VH.set(seg, x);
    }
    public static int ulRootManifestPathChars$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulRootManifestPathChars$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootManifestPathChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulRootConfigurationPathType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulRootConfigurationPathType"));
    public static VarHandle ulRootConfigurationPathType$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulRootConfigurationPathType;
     * }
     */
    public static int ulRootConfigurationPathType$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulRootConfigurationPathType;
     * }
     */
    public static void ulRootConfigurationPathType$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathType$VH.set(seg, x);
    }
    public static int ulRootConfigurationPathType$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulRootConfigurationPathType$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulRootConfigurationPathChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulRootConfigurationPathChars"));
    public static VarHandle ulRootConfigurationPathChars$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathChars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulRootConfigurationPathChars;
     * }
     */
    public static int ulRootConfigurationPathChars$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathChars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulRootConfigurationPathChars;
     * }
     */
    public static void ulRootConfigurationPathChars$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathChars$VH.set(seg, x);
    }
    public static int ulRootConfigurationPathChars$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulRootConfigurationPathChars$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulRootConfigurationPathChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulAppDirPathType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulAppDirPathType"));
    public static VarHandle ulAppDirPathType$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulAppDirPathType;
     * }
     */
    public static int ulAppDirPathType$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulAppDirPathType;
     * }
     */
    public static void ulAppDirPathType$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathType$VH.set(seg, x);
    }
    public static int ulAppDirPathType$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulAppDirPathType$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulAppDirPathChars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulAppDirPathChars"));
    public static VarHandle ulAppDirPathChars$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathChars$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ulAppDirPathChars;
     * }
     */
    public static int ulAppDirPathChars$get(MemorySegment seg) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathChars$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ulAppDirPathChars;
     * }
     */
    public static void ulAppDirPathChars$set(MemorySegment seg, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathChars$VH.set(seg, x);
    }
    public static int ulAppDirPathChars$get(MemorySegment seg, long index) {
        return (int)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathChars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulAppDirPathChars$set(MemorySegment seg, long index, int x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.ulAppDirPathChars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRootManifestPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRootManifestPath"));
    public static VarHandle lpRootManifestPath$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootManifestPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR lpRootManifestPath;
     * }
     */
    public static MemorySegment lpRootManifestPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootManifestPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR lpRootManifestPath;
     * }
     */
    public static void lpRootManifestPath$set(MemorySegment seg, MemorySegment x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootManifestPath$VH.set(seg, x);
    }
    public static MemorySegment lpRootManifestPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootManifestPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRootManifestPath$set(MemorySegment seg, long index, MemorySegment x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootManifestPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRootConfigurationPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRootConfigurationPath"));
    public static VarHandle lpRootConfigurationPath$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootConfigurationPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR lpRootConfigurationPath;
     * }
     */
    public static MemorySegment lpRootConfigurationPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootConfigurationPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR lpRootConfigurationPath;
     * }
     */
    public static void lpRootConfigurationPath$set(MemorySegment seg, MemorySegment x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootConfigurationPath$VH.set(seg, x);
    }
    public static MemorySegment lpRootConfigurationPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootConfigurationPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRootConfigurationPath$set(MemorySegment seg, long index, MemorySegment x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpRootConfigurationPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpAppDirPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAppDirPath"));
    public static VarHandle lpAppDirPath$VH() {
        return _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpAppDirPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR lpAppDirPath;
     * }
     */
    public static MemorySegment lpAppDirPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpAppDirPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR lpAppDirPath;
     * }
     */
    public static void lpAppDirPath$set(MemorySegment seg, MemorySegment x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpAppDirPath$VH.set(seg, x);
    }
    public static MemorySegment lpAppDirPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpAppDirPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAppDirPath$set(MemorySegment seg, long index, MemorySegment x) {
        _ACTIVATION_CONTEXT_DETAILED_INFORMATION.lpAppDirPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


