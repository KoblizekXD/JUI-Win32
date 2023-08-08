// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DOC_INFO_1W {
 *     LPWSTR pDocName;
 *     LPWSTR pOutputFile;
 *     LPWSTR pDatatype;
 * };
 * }
 */
public class _DOC_INFO_1W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pDocName"),
        Constants$root.C_POINTER$LAYOUT.withName("pOutputFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype")
    ).withName("_DOC_INFO_1W");
    public static MemoryLayout $LAYOUT() {
        return _DOC_INFO_1W.$struct$LAYOUT;
    }
    static final VarHandle pDocName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDocName"));
    public static VarHandle pDocName$VH() {
        return _DOC_INFO_1W.pDocName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDocName;
     * }
     */
    public static MemorySegment pDocName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_1W.pDocName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDocName;
     * }
     */
    public static void pDocName$set(MemorySegment seg, MemorySegment x) {
        _DOC_INFO_1W.pDocName$VH.set(seg, x);
    }
    public static MemorySegment pDocName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_1W.pDocName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocName$set(MemorySegment seg, long index, MemorySegment x) {
        _DOC_INFO_1W.pDocName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pOutputFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOutputFile"));
    public static VarHandle pOutputFile$VH() {
        return _DOC_INFO_1W.pOutputFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pOutputFile;
     * }
     */
    public static MemorySegment pOutputFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_1W.pOutputFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pOutputFile;
     * }
     */
    public static void pOutputFile$set(MemorySegment seg, MemorySegment x) {
        _DOC_INFO_1W.pOutputFile$VH.set(seg, x);
    }
    public static MemorySegment pOutputFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_1W.pOutputFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOutputFile$set(MemorySegment seg, long index, MemorySegment x) {
        _DOC_INFO_1W.pOutputFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _DOC_INFO_1W.pDatatype$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_1W.pDatatype$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        _DOC_INFO_1W.pDatatype$VH.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_1W.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        _DOC_INFO_1W.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


