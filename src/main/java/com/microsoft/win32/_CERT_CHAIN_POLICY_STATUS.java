// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_CHAIN_POLICY_STATUS {
 *     DWORD cbSize;
 *     DWORD dwError;
 *     LONG lChainIndex;
 *     LONG lElementIndex;
 *     void* pvExtraPolicyStatus;
 * };
 * }
 */
public class _CERT_CHAIN_POLICY_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwError"),
        Constants$root.C_LONG$LAYOUT.withName("lChainIndex"),
        Constants$root.C_LONG$LAYOUT.withName("lElementIndex"),
        Constants$root.C_POINTER$LAYOUT.withName("pvExtraPolicyStatus")
    ).withName("_CERT_CHAIN_POLICY_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _CERT_CHAIN_POLICY_STATUS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_CHAIN_POLICY_STATUS.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_POLICY_STATUS.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CERT_CHAIN_POLICY_STATUS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_POLICY_STATUS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_POLICY_STATUS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwError"));
    public static VarHandle dwError$VH() {
        return _CERT_CHAIN_POLICY_STATUS.dwError$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwError;
     * }
     */
    public static int dwError$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_POLICY_STATUS.dwError$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwError;
     * }
     */
    public static void dwError$set(MemorySegment seg, int x) {
        _CERT_CHAIN_POLICY_STATUS.dwError$VH.set(seg, x);
    }
    public static int dwError$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_POLICY_STATUS.dwError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwError$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_POLICY_STATUS.dwError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lChainIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lChainIndex"));
    public static VarHandle lChainIndex$VH() {
        return _CERT_CHAIN_POLICY_STATUS.lChainIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lChainIndex;
     * }
     */
    public static int lChainIndex$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_POLICY_STATUS.lChainIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lChainIndex;
     * }
     */
    public static void lChainIndex$set(MemorySegment seg, int x) {
        _CERT_CHAIN_POLICY_STATUS.lChainIndex$VH.set(seg, x);
    }
    public static int lChainIndex$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_POLICY_STATUS.lChainIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lChainIndex$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_POLICY_STATUS.lChainIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lElementIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lElementIndex"));
    public static VarHandle lElementIndex$VH() {
        return _CERT_CHAIN_POLICY_STATUS.lElementIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lElementIndex;
     * }
     */
    public static int lElementIndex$get(MemorySegment seg) {
        return (int)_CERT_CHAIN_POLICY_STATUS.lElementIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lElementIndex;
     * }
     */
    public static void lElementIndex$set(MemorySegment seg, int x) {
        _CERT_CHAIN_POLICY_STATUS.lElementIndex$VH.set(seg, x);
    }
    public static int lElementIndex$get(MemorySegment seg, long index) {
        return (int)_CERT_CHAIN_POLICY_STATUS.lElementIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lElementIndex$set(MemorySegment seg, long index, int x) {
        _CERT_CHAIN_POLICY_STATUS.lElementIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvExtraPolicyStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvExtraPolicyStatus"));
    public static VarHandle pvExtraPolicyStatus$VH() {
        return _CERT_CHAIN_POLICY_STATUS.pvExtraPolicyStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvExtraPolicyStatus;
     * }
     */
    public static MemorySegment pvExtraPolicyStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_CHAIN_POLICY_STATUS.pvExtraPolicyStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvExtraPolicyStatus;
     * }
     */
    public static void pvExtraPolicyStatus$set(MemorySegment seg, MemorySegment x) {
        _CERT_CHAIN_POLICY_STATUS.pvExtraPolicyStatus$VH.set(seg, x);
    }
    public static MemorySegment pvExtraPolicyStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_CHAIN_POLICY_STATUS.pvExtraPolicyStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvExtraPolicyStatus$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_CHAIN_POLICY_STATUS.pvExtraPolicyStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


