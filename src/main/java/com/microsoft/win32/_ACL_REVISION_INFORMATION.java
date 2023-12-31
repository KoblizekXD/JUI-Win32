// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ACL_REVISION_INFORMATION {
 *     DWORD AclRevision;
 * };
 * }
 */
public class _ACL_REVISION_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("AclRevision")
    ).withName("_ACL_REVISION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ACL_REVISION_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle AclRevision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AclRevision"));
    public static VarHandle AclRevision$VH() {
        return _ACL_REVISION_INFORMATION.AclRevision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AclRevision;
     * }
     */
    public static int AclRevision$get(MemorySegment seg) {
        return (int)_ACL_REVISION_INFORMATION.AclRevision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AclRevision;
     * }
     */
    public static void AclRevision$set(MemorySegment seg, int x) {
        _ACL_REVISION_INFORMATION.AclRevision$VH.set(seg, x);
    }
    public static int AclRevision$get(MemorySegment seg, long index) {
        return (int)_ACL_REVISION_INFORMATION.AclRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AclRevision$set(MemorySegment seg, long index, int x) {
        _ACL_REVISION_INFORMATION.AclRevision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


