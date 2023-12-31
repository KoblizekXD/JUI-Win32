// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_LAUNCH_PROTECTED_INFO {
 *     DWORD dwLaunchProtected;
 * };
 * }
 */
public class _SERVICE_LAUNCH_PROTECTED_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwLaunchProtected")
    ).withName("_SERVICE_LAUNCH_PROTECTED_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_LAUNCH_PROTECTED_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwLaunchProtected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLaunchProtected"));
    public static VarHandle dwLaunchProtected$VH() {
        return _SERVICE_LAUNCH_PROTECTED_INFO.dwLaunchProtected$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwLaunchProtected;
     * }
     */
    public static int dwLaunchProtected$get(MemorySegment seg) {
        return (int)_SERVICE_LAUNCH_PROTECTED_INFO.dwLaunchProtected$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwLaunchProtected;
     * }
     */
    public static void dwLaunchProtected$set(MemorySegment seg, int x) {
        _SERVICE_LAUNCH_PROTECTED_INFO.dwLaunchProtected$VH.set(seg, x);
    }
    public static int dwLaunchProtected$get(MemorySegment seg, long index) {
        return (int)_SERVICE_LAUNCH_PROTECTED_INFO.dwLaunchProtected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLaunchProtected$set(MemorySegment seg, long index, int x) {
        _SERVICE_LAUNCH_PROTECTED_INFO.dwLaunchProtected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


