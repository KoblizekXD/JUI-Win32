// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     ACCESS_MASK DesiredAccess;
 *     DWORD SecurityIds[1];
 * };
 * }
 */
public class BULK_SECURITY_TEST_DATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DesiredAccess"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("SecurityIds")
    );
    public static MemoryLayout $LAYOUT() {
        return BULK_SECURITY_TEST_DATA.$struct$LAYOUT;
    }
    static final VarHandle DesiredAccess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DesiredAccess"));
    public static VarHandle DesiredAccess$VH() {
        return BULK_SECURITY_TEST_DATA.DesiredAccess$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK DesiredAccess;
     * }
     */
    public static int DesiredAccess$get(MemorySegment seg) {
        return (int)BULK_SECURITY_TEST_DATA.DesiredAccess$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK DesiredAccess;
     * }
     */
    public static void DesiredAccess$set(MemorySegment seg, int x) {
        BULK_SECURITY_TEST_DATA.DesiredAccess$VH.set(seg, x);
    }
    public static int DesiredAccess$get(MemorySegment seg, long index) {
        return (int)BULK_SECURITY_TEST_DATA.DesiredAccess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DesiredAccess$set(MemorySegment seg, long index, int x) {
        BULK_SECURITY_TEST_DATA.DesiredAccess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SecurityIds$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

