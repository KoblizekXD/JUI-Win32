// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_INFO_3 {
 *     PSECURITY_DESCRIPTOR pSecurityDescriptor;
 * };
 * }
 */
public class _PRINTER_INFO_3 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pSecurityDescriptor")
    ).withName("_PRINTER_INFO_3");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_3.$struct$LAYOUT;
    }
    static final VarHandle pSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSecurityDescriptor"));
    public static VarHandle pSecurityDescriptor$VH() {
        return _PRINTER_INFO_3.pSecurityDescriptor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_3.pSecurityDescriptor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSECURITY_DESCRIPTOR pSecurityDescriptor;
     * }
     */
    public static void pSecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_INFO_3.pSecurityDescriptor$VH.set(seg, x);
    }
    public static MemorySegment pSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_INFO_3.pSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_INFO_3.pSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


