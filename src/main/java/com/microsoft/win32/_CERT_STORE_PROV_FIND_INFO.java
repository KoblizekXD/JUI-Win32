// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_STORE_PROV_FIND_INFO {
 *     DWORD cbSize;
 *     DWORD dwMsgAndCertEncodingType;
 *     DWORD dwFindFlags;
 *     DWORD dwFindType;
 *     void* pvFindPara;
 * };
 * }
 */
public class _CERT_STORE_PROV_FIND_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwMsgAndCertEncodingType"),
        Constants$root.C_LONG$LAYOUT.withName("dwFindFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwFindType"),
        Constants$root.C_POINTER$LAYOUT.withName("pvFindPara")
    ).withName("_CERT_STORE_PROV_FIND_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_STORE_PROV_FIND_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_STORE_PROV_FIND_INFO.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMsgAndCertEncodingType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMsgAndCertEncodingType"));
    public static VarHandle dwMsgAndCertEncodingType$VH() {
        return _CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMsgAndCertEncodingType;
     * }
     */
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMsgAndCertEncodingType;
     * }
     */
    public static void dwMsgAndCertEncodingType$set(MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.set(seg, x);
    }
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgAndCertEncodingType$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwMsgAndCertEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFindFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFindFlags"));
    public static VarHandle dwFindFlags$VH() {
        return _CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFindFlags;
     * }
     */
    public static int dwFindFlags$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFindFlags;
     * }
     */
    public static void dwFindFlags$set(MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.set(seg, x);
    }
    public static int dwFindFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFindFlags$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFindType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFindType"));
    public static VarHandle dwFindType$VH() {
        return _CERT_STORE_PROV_FIND_INFO.dwFindType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFindType;
     * }
     */
    public static int dwFindType$get(MemorySegment seg) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFindType;
     * }
     */
    public static void dwFindType$set(MemorySegment seg, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindType$VH.set(seg, x);
    }
    public static int dwFindType$get(MemorySegment seg, long index) {
        return (int)_CERT_STORE_PROV_FIND_INFO.dwFindType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFindType$set(MemorySegment seg, long index, int x) {
        _CERT_STORE_PROV_FIND_INFO.dwFindType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvFindPara$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvFindPara"));
    public static VarHandle pvFindPara$VH() {
        return _CERT_STORE_PROV_FIND_INFO.pvFindPara$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvFindPara;
     * }
     */
    public static MemorySegment pvFindPara$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvFindPara;
     * }
     */
    public static void pvFindPara$set(MemorySegment seg, MemorySegment x) {
        _CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.set(seg, x);
    }
    public static MemorySegment pvFindPara$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvFindPara$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_STORE_PROV_FIND_INFO.pvFindPara$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


