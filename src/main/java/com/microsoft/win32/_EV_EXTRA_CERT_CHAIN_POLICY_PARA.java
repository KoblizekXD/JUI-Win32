// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EV_EXTRA_CERT_CHAIN_POLICY_PARA {
 *     DWORD cbSize;
 *     DWORD dwRootProgramQualifierFlags;
 * };
 * }
 */
public class _EV_EXTRA_CERT_CHAIN_POLICY_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwRootProgramQualifierFlags")
    ).withName("_EV_EXTRA_CERT_CHAIN_POLICY_PARA");
    public static MemoryLayout $LAYOUT() {
        return _EV_EXTRA_CERT_CHAIN_POLICY_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _EV_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_EV_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _EV_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_EV_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _EV_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRootProgramQualifierFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRootProgramQualifierFlags"));
    public static VarHandle dwRootProgramQualifierFlags$VH() {
        return _EV_EXTRA_CERT_CHAIN_POLICY_PARA.dwRootProgramQualifierFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwRootProgramQualifierFlags;
     * }
     */
    public static int dwRootProgramQualifierFlags$get(MemorySegment seg) {
        return (int)_EV_EXTRA_CERT_CHAIN_POLICY_PARA.dwRootProgramQualifierFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwRootProgramQualifierFlags;
     * }
     */
    public static void dwRootProgramQualifierFlags$set(MemorySegment seg, int x) {
        _EV_EXTRA_CERT_CHAIN_POLICY_PARA.dwRootProgramQualifierFlags$VH.set(seg, x);
    }
    public static int dwRootProgramQualifierFlags$get(MemorySegment seg, long index) {
        return (int)_EV_EXTRA_CERT_CHAIN_POLICY_PARA.dwRootProgramQualifierFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRootProgramQualifierFlags$set(MemorySegment seg, long index, int x) {
        _EV_EXTRA_CERT_CHAIN_POLICY_PARA.dwRootProgramQualifierFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


