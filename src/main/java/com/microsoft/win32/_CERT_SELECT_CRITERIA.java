// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_SELECT_CRITERIA {
 *     DWORD dwType;
 *     DWORD cPara;
 *     void** ppPara;
 * };
 * }
 */
public class _CERT_SELECT_CRITERIA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        Constants$root.C_LONG$LAYOUT.withName("cPara"),
        Constants$root.C_POINTER$LAYOUT.withName("ppPara")
    ).withName("_CERT_SELECT_CRITERIA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_SELECT_CRITERIA.$struct$LAYOUT;
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return _CERT_SELECT_CRITERIA.dwType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static int dwType$get(MemorySegment seg) {
        return (int)_CERT_SELECT_CRITERIA.dwType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static void dwType$set(MemorySegment seg, int x) {
        _CERT_SELECT_CRITERIA.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)_CERT_SELECT_CRITERIA.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        _CERT_SELECT_CRITERIA.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cPara$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cPara"));
    public static VarHandle cPara$VH() {
        return _CERT_SELECT_CRITERIA.cPara$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cPara;
     * }
     */
    public static int cPara$get(MemorySegment seg) {
        return (int)_CERT_SELECT_CRITERIA.cPara$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cPara;
     * }
     */
    public static void cPara$set(MemorySegment seg, int x) {
        _CERT_SELECT_CRITERIA.cPara$VH.set(seg, x);
    }
    public static int cPara$get(MemorySegment seg, long index) {
        return (int)_CERT_SELECT_CRITERIA.cPara$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cPara$set(MemorySegment seg, long index, int x) {
        _CERT_SELECT_CRITERIA.cPara$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ppPara$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ppPara"));
    public static VarHandle ppPara$VH() {
        return _CERT_SELECT_CRITERIA.ppPara$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void** ppPara;
     * }
     */
    public static MemorySegment ppPara$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CRITERIA.ppPara$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void** ppPara;
     * }
     */
    public static void ppPara$set(MemorySegment seg, MemorySegment x) {
        _CERT_SELECT_CRITERIA.ppPara$VH.set(seg, x);
    }
    public static MemorySegment ppPara$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_SELECT_CRITERIA.ppPara$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ppPara$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_SELECT_CRITERIA.ppPara$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

