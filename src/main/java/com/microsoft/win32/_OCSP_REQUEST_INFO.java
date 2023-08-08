// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _OCSP_REQUEST_INFO {
 *     DWORD dwVersion;
 *     PCERT_ALT_NAME_ENTRY pRequestorName;
 *     DWORD cRequestEntry;
 *     POCSP_REQUEST_ENTRY rgRequestEntry;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * };
 * }
 */
public class _OCSP_REQUEST_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pRequestorName"),
        Constants$root.C_LONG$LAYOUT.withName("cRequestEntry"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgRequestEntry"),
        Constants$root.C_LONG$LAYOUT.withName("cExtension"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgExtension")
    ).withName("_OCSP_REQUEST_INFO");
    public static MemoryLayout $LAYOUT() {
        return _OCSP_REQUEST_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _OCSP_REQUEST_INFO.dwVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_OCSP_REQUEST_INFO.dwVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        _OCSP_REQUEST_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_OCSP_REQUEST_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _OCSP_REQUEST_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pRequestorName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pRequestorName"));
    public static VarHandle pRequestorName$VH() {
        return _OCSP_REQUEST_INFO.pRequestorName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_ALT_NAME_ENTRY pRequestorName;
     * }
     */
    public static MemorySegment pRequestorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_OCSP_REQUEST_INFO.pRequestorName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_ALT_NAME_ENTRY pRequestorName;
     * }
     */
    public static void pRequestorName$set(MemorySegment seg, MemorySegment x) {
        _OCSP_REQUEST_INFO.pRequestorName$VH.set(seg, x);
    }
    public static MemorySegment pRequestorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_OCSP_REQUEST_INFO.pRequestorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pRequestorName$set(MemorySegment seg, long index, MemorySegment x) {
        _OCSP_REQUEST_INFO.pRequestorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRequestEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRequestEntry"));
    public static VarHandle cRequestEntry$VH() {
        return _OCSP_REQUEST_INFO.cRequestEntry$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cRequestEntry;
     * }
     */
    public static int cRequestEntry$get(MemorySegment seg) {
        return (int)_OCSP_REQUEST_INFO.cRequestEntry$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cRequestEntry;
     * }
     */
    public static void cRequestEntry$set(MemorySegment seg, int x) {
        _OCSP_REQUEST_INFO.cRequestEntry$VH.set(seg, x);
    }
    public static int cRequestEntry$get(MemorySegment seg, long index) {
        return (int)_OCSP_REQUEST_INFO.cRequestEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRequestEntry$set(MemorySegment seg, long index, int x) {
        _OCSP_REQUEST_INFO.cRequestEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgRequestEntry$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgRequestEntry"));
    public static VarHandle rgRequestEntry$VH() {
        return _OCSP_REQUEST_INFO.rgRequestEntry$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POCSP_REQUEST_ENTRY rgRequestEntry;
     * }
     */
    public static MemorySegment rgRequestEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_OCSP_REQUEST_INFO.rgRequestEntry$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POCSP_REQUEST_ENTRY rgRequestEntry;
     * }
     */
    public static void rgRequestEntry$set(MemorySegment seg, MemorySegment x) {
        _OCSP_REQUEST_INFO.rgRequestEntry$VH.set(seg, x);
    }
    public static MemorySegment rgRequestEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_OCSP_REQUEST_INFO.rgRequestEntry$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgRequestEntry$set(MemorySegment seg, long index, MemorySegment x) {
        _OCSP_REQUEST_INFO.rgRequestEntry$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
    public static VarHandle cExtension$VH() {
        return _OCSP_REQUEST_INFO.cExtension$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static int cExtension$get(MemorySegment seg) {
        return (int)_OCSP_REQUEST_INFO.cExtension$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static void cExtension$set(MemorySegment seg, int x) {
        _OCSP_REQUEST_INFO.cExtension$VH.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)_OCSP_REQUEST_INFO.cExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        _OCSP_REQUEST_INFO.cExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    public static VarHandle rgExtension$VH() {
        return _OCSP_REQUEST_INFO.rgExtension$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static MemorySegment rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_OCSP_REQUEST_INFO.rgExtension$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static void rgExtension$set(MemorySegment seg, MemorySegment x) {
        _OCSP_REQUEST_INFO.rgExtension$VH.set(seg, x);
    }
    public static MemorySegment rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_OCSP_REQUEST_INFO.rgExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemorySegment x) {
        _OCSP_REQUEST_INFO.rgExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

