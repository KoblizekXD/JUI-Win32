// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS {
 *     DWORD cbSize;
 *     BOOL fCommercial;
 * };
 * }
 */
public class _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("fCommercial")
    ).withName("_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fCommercial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fCommercial"));
    public static VarHandle fCommercial$VH() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.fCommercial$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fCommercial;
     * }
     */
    public static int fCommercial$get(MemorySegment seg) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.fCommercial$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fCommercial;
     * }
     */
    public static void fCommercial$set(MemorySegment seg, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.fCommercial$VH.set(seg, x);
    }
    public static int fCommercial$get(MemorySegment seg, long index) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.fCommercial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fCommercial$set(MemorySegment seg, long index, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_STATUS.fCommercial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


