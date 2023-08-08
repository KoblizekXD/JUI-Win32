// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _tagpropertykey {
 *     GUID fmtid;
 *     DWORD pid;
 * };
 * }
 */
public class _tagpropertykey {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("fmtid"),
        Constants$root.C_LONG$LAYOUT.withName("pid")
    ).withName("_tagpropertykey");
    public static MemoryLayout $LAYOUT() {
        return _tagpropertykey.$struct$LAYOUT;
    }
    public static MemorySegment fmtid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle pid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pid"));
    public static VarHandle pid$VH() {
        return _tagpropertykey.pid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD pid;
     * }
     */
    public static int pid$get(MemorySegment seg) {
        return (int)_tagpropertykey.pid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD pid;
     * }
     */
    public static void pid$set(MemorySegment seg, int x) {
        _tagpropertykey.pid$VH.set(seg, x);
    }
    public static int pid$get(MemorySegment seg, long index) {
        return (int)_tagpropertykey.pid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pid$set(MemorySegment seg, long index, int x) {
        _tagpropertykey.pid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


