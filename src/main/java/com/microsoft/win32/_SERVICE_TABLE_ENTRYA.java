// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_TABLE_ENTRYA {
 *     LPSTR lpServiceName;
 *     LPSERVICE_MAIN_FUNCTIONA lpServiceProc;
 * };
 * }
 */
public class _SERVICE_TABLE_ENTRYA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpServiceName"),
        Constants$root.C_POINTER$LAYOUT.withName("lpServiceProc")
    ).withName("_SERVICE_TABLE_ENTRYA");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_TABLE_ENTRYA.$struct$LAYOUT;
    }
    static final VarHandle lpServiceName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpServiceName"));
    public static VarHandle lpServiceName$VH() {
        return _SERVICE_TABLE_ENTRYA.lpServiceName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpServiceName;
     * }
     */
    public static MemorySegment lpServiceName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_TABLE_ENTRYA.lpServiceName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpServiceName;
     * }
     */
    public static void lpServiceName$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_TABLE_ENTRYA.lpServiceName$VH.set(seg, x);
    }
    public static MemorySegment lpServiceName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_TABLE_ENTRYA.lpServiceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceName$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_TABLE_ENTRYA.lpServiceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpServiceProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpServiceProc"));
    public static VarHandle lpServiceProc$VH() {
        return _SERVICE_TABLE_ENTRYA.lpServiceProc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSERVICE_MAIN_FUNCTIONA lpServiceProc;
     * }
     */
    public static MemorySegment lpServiceProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_TABLE_ENTRYA.lpServiceProc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSERVICE_MAIN_FUNCTIONA lpServiceProc;
     * }
     */
    public static void lpServiceProc$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_TABLE_ENTRYA.lpServiceProc$VH.set(seg, x);
    }
    public static MemorySegment lpServiceProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_TABLE_ENTRYA.lpServiceProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceProc$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_TABLE_ENTRYA.lpServiceProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPSERVICE_MAIN_FUNCTIONA lpServiceProc(MemorySegment segment, SegmentScope scope) {
        return LPSERVICE_MAIN_FUNCTIONA.ofAddress(lpServiceProc$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


