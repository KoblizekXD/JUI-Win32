// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHNAMEMAPPINGW {
 *     LPWSTR pszOldPath;
 *     LPWSTR pszNewPath;
 *     int cchOldPath;
 *     int cchNewPath;
 * };
 * }
 */
public class _SHNAMEMAPPINGW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszOldPath"),
        Constants$root.C_POINTER$LAYOUT.withName("pszNewPath"),
        Constants$root.C_LONG$LAYOUT.withName("cchOldPath"),
        Constants$root.C_LONG$LAYOUT.withName("cchNewPath")
    ).withName("_SHNAMEMAPPINGW");
    public static MemoryLayout $LAYOUT() {
        return _SHNAMEMAPPINGW.$struct$LAYOUT;
    }
    static final VarHandle pszOldPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOldPath"));
    public static VarHandle pszOldPath$VH() {
        return _SHNAMEMAPPINGW.pszOldPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszOldPath;
     * }
     */
    public static MemorySegment pszOldPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHNAMEMAPPINGW.pszOldPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszOldPath;
     * }
     */
    public static void pszOldPath$set(MemorySegment seg, MemorySegment x) {
        _SHNAMEMAPPINGW.pszOldPath$VH.set(seg, x);
    }
    public static MemorySegment pszOldPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHNAMEMAPPINGW.pszOldPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOldPath$set(MemorySegment seg, long index, MemorySegment x) {
        _SHNAMEMAPPINGW.pszOldPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszNewPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszNewPath"));
    public static VarHandle pszNewPath$VH() {
        return _SHNAMEMAPPINGW.pszNewPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszNewPath;
     * }
     */
    public static MemorySegment pszNewPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SHNAMEMAPPINGW.pszNewPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszNewPath;
     * }
     */
    public static void pszNewPath$set(MemorySegment seg, MemorySegment x) {
        _SHNAMEMAPPINGW.pszNewPath$VH.set(seg, x);
    }
    public static MemorySegment pszNewPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SHNAMEMAPPINGW.pszNewPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszNewPath$set(MemorySegment seg, long index, MemorySegment x) {
        _SHNAMEMAPPINGW.pszNewPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cchOldPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchOldPath"));
    public static VarHandle cchOldPath$VH() {
        return _SHNAMEMAPPINGW.cchOldPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cchOldPath;
     * }
     */
    public static int cchOldPath$get(MemorySegment seg) {
        return (int)_SHNAMEMAPPINGW.cchOldPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cchOldPath;
     * }
     */
    public static void cchOldPath$set(MemorySegment seg, int x) {
        _SHNAMEMAPPINGW.cchOldPath$VH.set(seg, x);
    }
    public static int cchOldPath$get(MemorySegment seg, long index) {
        return (int)_SHNAMEMAPPINGW.cchOldPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cchOldPath$set(MemorySegment seg, long index, int x) {
        _SHNAMEMAPPINGW.cchOldPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cchNewPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cchNewPath"));
    public static VarHandle cchNewPath$VH() {
        return _SHNAMEMAPPINGW.cchNewPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int cchNewPath;
     * }
     */
    public static int cchNewPath$get(MemorySegment seg) {
        return (int)_SHNAMEMAPPINGW.cchNewPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int cchNewPath;
     * }
     */
    public static void cchNewPath$set(MemorySegment seg, int x) {
        _SHNAMEMAPPINGW.cchNewPath$VH.set(seg, x);
    }
    public static int cchNewPath$get(MemorySegment seg, long index) {
        return (int)_SHNAMEMAPPINGW.cchNewPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cchNewPath$set(MemorySegment seg, long index, int x) {
        _SHNAMEMAPPINGW.cchNewPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


