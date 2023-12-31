// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCRYPTION_CERTIFICATE_LIST {
 *     DWORD nUsers;
 *     PENCRYPTION_CERTIFICATE* pUsers;
 * };
 * }
 */
public class _ENCRYPTION_CERTIFICATE_LIST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("nUsers"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pUsers")
    ).withName("_ENCRYPTION_CERTIFICATE_LIST");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTION_CERTIFICATE_LIST.$struct$LAYOUT;
    }
    static final VarHandle nUsers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nUsers"));
    public static VarHandle nUsers$VH() {
        return _ENCRYPTION_CERTIFICATE_LIST.nUsers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nUsers;
     * }
     */
    public static int nUsers$get(MemorySegment seg) {
        return (int)_ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nUsers;
     * }
     */
    public static void nUsers$set(MemorySegment seg, int x) {
        _ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.set(seg, x);
    }
    public static int nUsers$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nUsers$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUsers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUsers"));
    public static VarHandle pUsers$VH() {
        return _ENCRYPTION_CERTIFICATE_LIST.pUsers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PENCRYPTION_CERTIFICATE* pUsers;
     * }
     */
    public static MemorySegment pUsers$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PENCRYPTION_CERTIFICATE* pUsers;
     * }
     */
    public static void pUsers$set(MemorySegment seg, MemorySegment x) {
        _ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.set(seg, x);
    }
    public static MemorySegment pUsers$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUsers$set(MemorySegment seg, long index, MemorySegment x) {
        _ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


