// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DOC_INFO_2A {
 *     LPSTR pDocName;
 *     LPSTR pOutputFile;
 *     LPSTR pDatatype;
 *     DWORD dwMode;
 *     DWORD JobId;
 * };
 * }
 */
public class _DOC_INFO_2A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pDocName"),
        Constants$root.C_POINTER$LAYOUT.withName("pOutputFile"),
        Constants$root.C_POINTER$LAYOUT.withName("pDatatype"),
        Constants$root.C_LONG$LAYOUT.withName("dwMode"),
        Constants$root.C_LONG$LAYOUT.withName("JobId")
    ).withName("_DOC_INFO_2A");
    public static MemoryLayout $LAYOUT() {
        return _DOC_INFO_2A.$struct$LAYOUT;
    }
    static final VarHandle pDocName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDocName"));
    public static VarHandle pDocName$VH() {
        return _DOC_INFO_2A.pDocName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDocName;
     * }
     */
    public static MemorySegment pDocName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_2A.pDocName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDocName;
     * }
     */
    public static void pDocName$set(MemorySegment seg, MemorySegment x) {
        _DOC_INFO_2A.pDocName$VH.set(seg, x);
    }
    public static MemorySegment pDocName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_2A.pDocName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocName$set(MemorySegment seg, long index, MemorySegment x) {
        _DOC_INFO_2A.pDocName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pOutputFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pOutputFile"));
    public static VarHandle pOutputFile$VH() {
        return _DOC_INFO_2A.pOutputFile$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pOutputFile;
     * }
     */
    public static MemorySegment pOutputFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_2A.pOutputFile$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pOutputFile;
     * }
     */
    public static void pOutputFile$set(MemorySegment seg, MemorySegment x) {
        _DOC_INFO_2A.pOutputFile$VH.set(seg, x);
    }
    public static MemorySegment pOutputFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_2A.pOutputFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOutputFile$set(MemorySegment seg, long index, MemorySegment x) {
        _DOC_INFO_2A.pOutputFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    public static VarHandle pDatatype$VH() {
        return _DOC_INFO_2A.pDatatype$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_2A.pDatatype$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        _DOC_INFO_2A.pDatatype$VH.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_DOC_INFO_2A.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        _DOC_INFO_2A.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMode"));
    public static VarHandle dwMode$VH() {
        return _DOC_INFO_2A.dwMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMode;
     * }
     */
    public static int dwMode$get(MemorySegment seg) {
        return (int)_DOC_INFO_2A.dwMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMode;
     * }
     */
    public static void dwMode$set(MemorySegment seg, int x) {
        _DOC_INFO_2A.dwMode$VH.set(seg, x);
    }
    public static int dwMode$get(MemorySegment seg, long index) {
        return (int)_DOC_INFO_2A.dwMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMode$set(MemorySegment seg, long index, int x) {
        _DOC_INFO_2A.dwMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _DOC_INFO_2A.JobId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)_DOC_INFO_2A.JobId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        _DOC_INFO_2A.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_DOC_INFO_2A.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _DOC_INFO_2A.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

