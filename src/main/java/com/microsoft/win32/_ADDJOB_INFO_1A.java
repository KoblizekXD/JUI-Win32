// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ADDJOB_INFO_1A {
 *     LPSTR Path;
 *     DWORD JobId;
 * };
 * }
 */
public class _ADDJOB_INFO_1A {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Path"),
        Constants$root.C_LONG$LAYOUT.withName("JobId"),
        MemoryLayout.paddingLayout(32)
    ).withName("_ADDJOB_INFO_1A");
    public static MemoryLayout $LAYOUT() {
        return _ADDJOB_INFO_1A.$struct$LAYOUT;
    }
    static final VarHandle Path$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Path"));
    public static VarHandle Path$VH() {
        return _ADDJOB_INFO_1A.Path$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR Path;
     * }
     */
    public static MemorySegment Path$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ADDJOB_INFO_1A.Path$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR Path;
     * }
     */
    public static void Path$set(MemorySegment seg, MemorySegment x) {
        _ADDJOB_INFO_1A.Path$VH.set(seg, x);
    }
    public static MemorySegment Path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ADDJOB_INFO_1A.Path$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Path$set(MemorySegment seg, long index, MemorySegment x) {
        _ADDJOB_INFO_1A.Path$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _ADDJOB_INFO_1A.JobId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)_ADDJOB_INFO_1A.JobId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        _ADDJOB_INFO_1A.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_ADDJOB_INFO_1A.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _ADDJOB_INFO_1A.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


