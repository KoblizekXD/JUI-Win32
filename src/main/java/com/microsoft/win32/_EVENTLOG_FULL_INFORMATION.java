// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EVENTLOG_FULL_INFORMATION {
 *     DWORD dwFull;
 * };
 * }
 */
public class _EVENTLOG_FULL_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFull")
    ).withName("_EVENTLOG_FULL_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _EVENTLOG_FULL_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle dwFull$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFull"));
    public static VarHandle dwFull$VH() {
        return _EVENTLOG_FULL_INFORMATION.dwFull$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFull;
     * }
     */
    public static int dwFull$get(MemorySegment seg) {
        return (int)_EVENTLOG_FULL_INFORMATION.dwFull$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFull;
     * }
     */
    public static void dwFull$set(MemorySegment seg, int x) {
        _EVENTLOG_FULL_INFORMATION.dwFull$VH.set(seg, x);
    }
    public static int dwFull$get(MemorySegment seg, long index) {
        return (int)_EVENTLOG_FULL_INFORMATION.dwFull$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFull$set(MemorySegment seg, long index, int x) {
        _EVENTLOG_FULL_INFORMATION.dwFull$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


