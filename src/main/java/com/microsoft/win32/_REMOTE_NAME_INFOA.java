// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _REMOTE_NAME_INFOA {
 *     LPSTR lpUniversalName;
 *     LPSTR lpConnectionName;
 *     LPSTR lpRemainingPath;
 * };
 * }
 */
public class _REMOTE_NAME_INFOA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpUniversalName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpConnectionName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpRemainingPath")
    ).withName("_REMOTE_NAME_INFOA");
    public static MemoryLayout $LAYOUT() {
        return _REMOTE_NAME_INFOA.$struct$LAYOUT;
    }
    static final VarHandle lpUniversalName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpUniversalName"));
    public static VarHandle lpUniversalName$VH() {
        return _REMOTE_NAME_INFOA.lpUniversalName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpUniversalName;
     * }
     */
    public static MemorySegment lpUniversalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REMOTE_NAME_INFOA.lpUniversalName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpUniversalName;
     * }
     */
    public static void lpUniversalName$set(MemorySegment seg, MemorySegment x) {
        _REMOTE_NAME_INFOA.lpUniversalName$VH.set(seg, x);
    }
    public static MemorySegment lpUniversalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REMOTE_NAME_INFOA.lpUniversalName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpUniversalName$set(MemorySegment seg, long index, MemorySegment x) {
        _REMOTE_NAME_INFOA.lpUniversalName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpConnectionName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpConnectionName"));
    public static VarHandle lpConnectionName$VH() {
        return _REMOTE_NAME_INFOA.lpConnectionName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpConnectionName;
     * }
     */
    public static MemorySegment lpConnectionName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REMOTE_NAME_INFOA.lpConnectionName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpConnectionName;
     * }
     */
    public static void lpConnectionName$set(MemorySegment seg, MemorySegment x) {
        _REMOTE_NAME_INFOA.lpConnectionName$VH.set(seg, x);
    }
    public static MemorySegment lpConnectionName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REMOTE_NAME_INFOA.lpConnectionName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpConnectionName$set(MemorySegment seg, long index, MemorySegment x) {
        _REMOTE_NAME_INFOA.lpConnectionName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRemainingPath$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRemainingPath"));
    public static VarHandle lpRemainingPath$VH() {
        return _REMOTE_NAME_INFOA.lpRemainingPath$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpRemainingPath;
     * }
     */
    public static MemorySegment lpRemainingPath$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_REMOTE_NAME_INFOA.lpRemainingPath$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpRemainingPath;
     * }
     */
    public static void lpRemainingPath$set(MemorySegment seg, MemorySegment x) {
        _REMOTE_NAME_INFOA.lpRemainingPath$VH.set(seg, x);
    }
    public static MemorySegment lpRemainingPath$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_REMOTE_NAME_INFOA.lpRemainingPath$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRemainingPath$set(MemorySegment seg, long index, MemorySegment x) {
        _REMOTE_NAME_INFOA.lpRemainingPath$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


