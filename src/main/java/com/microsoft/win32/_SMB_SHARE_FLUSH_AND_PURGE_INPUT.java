// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SMB_SHARE_FLUSH_AND_PURGE_INPUT {
 *     WORD Version;
 * };
 * }
 */
public class _SMB_SHARE_FLUSH_AND_PURGE_INPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Version")
    ).withName("_SMB_SHARE_FLUSH_AND_PURGE_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _SMB_SHARE_FLUSH_AND_PURGE_INPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SMB_SHARE_FLUSH_AND_PURGE_INPUT.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)_SMB_SHARE_FLUSH_AND_PURGE_INPUT.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        _SMB_SHARE_FLUSH_AND_PURGE_INPUT.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)_SMB_SHARE_FLUSH_AND_PURGE_INPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        _SMB_SHARE_FLUSH_AND_PURGE_INPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


