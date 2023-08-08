// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA {
 *     DWORD cbSize;
 *     DWORD dwReserved;
 *     PCWSTR pwszServerName;
 * };
 * }
 */
public class _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszServerName")
    ).withName("_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA");
    public static MemoryLayout $LAYOUT() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static void dwReserved$set(MemorySegment seg, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszServerName"));
    public static VarHandle pwszServerName$VH() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCWSTR pwszServerName;
     * }
     */
    public static MemorySegment pwszServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCWSTR pwszServerName;
     * }
     */
    public static void pwszServerName$set(MemorySegment seg, MemorySegment x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.set(seg, x);
    }
    public static MemorySegment pwszServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszServerName$set(MemorySegment seg, long index, MemorySegment x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

