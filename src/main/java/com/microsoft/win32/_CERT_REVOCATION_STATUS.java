// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_REVOCATION_STATUS {
 *     DWORD cbSize;
 *     DWORD dwIndex;
 *     DWORD dwError;
 *     DWORD dwReason;
 *     BOOL fHasFreshnessTime;
 *     DWORD dwFreshnessTime;
 * };
 * }
 */
public class _CERT_REVOCATION_STATUS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwIndex"),
        Constants$root.C_LONG$LAYOUT.withName("dwError"),
        Constants$root.C_LONG$LAYOUT.withName("dwReason"),
        Constants$root.C_LONG$LAYOUT.withName("fHasFreshnessTime"),
        Constants$root.C_LONG$LAYOUT.withName("dwFreshnessTime")
    ).withName("_CERT_REVOCATION_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _CERT_REVOCATION_STATUS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_REVOCATION_STATUS.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwIndex"));
    public static VarHandle dwIndex$VH() {
        return _CERT_REVOCATION_STATUS.dwIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwIndex;
     * }
     */
    public static int dwIndex$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwIndex;
     * }
     */
    public static void dwIndex$set(MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwIndex$VH.set(seg, x);
    }
    public static int dwIndex$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwIndex$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwError$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwError"));
    public static VarHandle dwError$VH() {
        return _CERT_REVOCATION_STATUS.dwError$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwError;
     * }
     */
    public static int dwError$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwError$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwError;
     * }
     */
    public static void dwError$set(MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwError$VH.set(seg, x);
    }
    public static int dwError$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwError$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwError$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwError$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReason"));
    public static VarHandle dwReason$VH() {
        return _CERT_REVOCATION_STATUS.dwReason$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReason;
     * }
     */
    public static int dwReason$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwReason$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReason;
     * }
     */
    public static void dwReason$set(MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwReason$VH.set(seg, x);
    }
    public static int dwReason$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwReason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReason$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwReason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fHasFreshnessTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fHasFreshnessTime"));
    public static VarHandle fHasFreshnessTime$VH() {
        return _CERT_REVOCATION_STATUS.fHasFreshnessTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fHasFreshnessTime;
     * }
     */
    public static int fHasFreshnessTime$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fHasFreshnessTime;
     * }
     */
    public static void fHasFreshnessTime$set(MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.set(seg, x);
    }
    public static int fHasFreshnessTime$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fHasFreshnessTime$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.fHasFreshnessTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFreshnessTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFreshnessTime"));
    public static VarHandle dwFreshnessTime$VH() {
        return _CERT_REVOCATION_STATUS.dwFreshnessTime$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFreshnessTime;
     * }
     */
    public static int dwFreshnessTime$get(MemorySegment seg) {
        return (int)_CERT_REVOCATION_STATUS.dwFreshnessTime$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFreshnessTime;
     * }
     */
    public static void dwFreshnessTime$set(MemorySegment seg, int x) {
        _CERT_REVOCATION_STATUS.dwFreshnessTime$VH.set(seg, x);
    }
    public static int dwFreshnessTime$get(MemorySegment seg, long index) {
        return (int)_CERT_REVOCATION_STATUS.dwFreshnessTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFreshnessTime$set(MemorySegment seg, long index, int x) {
        _CERT_REVOCATION_STATUS.dwFreshnessTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

