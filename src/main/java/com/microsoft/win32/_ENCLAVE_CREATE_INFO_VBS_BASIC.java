// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCLAVE_CREATE_INFO_VBS_BASIC {
 *     DWORD Flags;
 *     BYTE OwnerID[32];
 * };
 * }
 */
public class _ENCLAVE_CREATE_INFO_VBS_BASIC {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("OwnerID")
    ).withName("_ENCLAVE_CREATE_INFO_VBS_BASIC");
    public static MemoryLayout $LAYOUT() {
        return _ENCLAVE_CREATE_INFO_VBS_BASIC.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _ENCLAVE_CREATE_INFO_VBS_BASIC.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_ENCLAVE_CREATE_INFO_VBS_BASIC.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _ENCLAVE_CREATE_INFO_VBS_BASIC.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_ENCLAVE_CREATE_INFO_VBS_BASIC.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _ENCLAVE_CREATE_INFO_VBS_BASIC.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OwnerID$slice(MemorySegment seg) {
        return seg.asSlice(4, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


