// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STARTUPINFOEXA {
 *     STARTUPINFOA StartupInfo;
 *     LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList;
 * };
 * }
 */
public class _STARTUPINFOEXA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cb"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("lpReserved"),
            Constants$root.C_POINTER$LAYOUT.withName("lpDesktop"),
            Constants$root.C_POINTER$LAYOUT.withName("lpTitle"),
            Constants$root.C_LONG$LAYOUT.withName("dwX"),
            Constants$root.C_LONG$LAYOUT.withName("dwY"),
            Constants$root.C_LONG$LAYOUT.withName("dwXSize"),
            Constants$root.C_LONG$LAYOUT.withName("dwYSize"),
            Constants$root.C_LONG$LAYOUT.withName("dwXCountChars"),
            Constants$root.C_LONG$LAYOUT.withName("dwYCountChars"),
            Constants$root.C_LONG$LAYOUT.withName("dwFillAttribute"),
            Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
            Constants$root.C_SHORT$LAYOUT.withName("wShowWindow"),
            Constants$root.C_SHORT$LAYOUT.withName("cbReserved2"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("lpReserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("hStdInput"),
            Constants$root.C_POINTER$LAYOUT.withName("hStdOutput"),
            Constants$root.C_POINTER$LAYOUT.withName("hStdError")
        ).withName("StartupInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("lpAttributeList")
    ).withName("_STARTUPINFOEXA");
    public static MemoryLayout $LAYOUT() {
        return _STARTUPINFOEXA.$struct$LAYOUT;
    }
    public static MemorySegment StartupInfo$slice(MemorySegment seg) {
        return seg.asSlice(0, 104);
    }
    static final VarHandle lpAttributeList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpAttributeList"));
    public static VarHandle lpAttributeList$VH() {
        return _STARTUPINFOEXA.lpAttributeList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList;
     * }
     */
    public static MemorySegment lpAttributeList$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOEXA.lpAttributeList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPPROC_THREAD_ATTRIBUTE_LIST lpAttributeList;
     * }
     */
    public static void lpAttributeList$set(MemorySegment seg, MemorySegment x) {
        _STARTUPINFOEXA.lpAttributeList$VH.set(seg, x);
    }
    public static MemorySegment lpAttributeList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_STARTUPINFOEXA.lpAttributeList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpAttributeList$set(MemorySegment seg, long index, MemorySegment x) {
        _STARTUPINFOEXA.lpAttributeList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


