// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST {
 *     DWORD RequestLevel;
 *     DWORD RequestFlags;
 * };
 * }
 */
public class _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("RequestLevel"),
        Constants$root.C_LONG$LAYOUT.withName("RequestFlags")
    ).withName("_STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle RequestLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RequestLevel"));
    public static VarHandle RequestLevel$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestLevel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RequestLevel;
     * }
     */
    public static int RequestLevel$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestLevel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RequestLevel;
     * }
     */
    public static void RequestLevel$set(MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestLevel$VH.set(seg, x);
    }
    public static int RequestLevel$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestLevel$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RequestFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RequestFlags"));
    public static VarHandle RequestFlags$VH() {
        return _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RequestFlags;
     * }
     */
    public static int RequestFlags$get(MemorySegment seg) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RequestFlags;
     * }
     */
    public static void RequestFlags$set(MemorySegment seg, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestFlags$VH.set(seg, x);
    }
    public static int RequestFlags$get(MemorySegment seg, long index) {
        return (int)_STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestFlags$set(MemorySegment seg, long index, int x) {
        _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST.RequestFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


