// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_POLICIES_INFO {
 *     DWORD cPolicyInfo;
 *     CERT_POLICY_INFO* rgPolicyInfo;
 * };
 * }
 */
public class _CERT_POLICIES_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cPolicyInfo"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgPolicyInfo")
    ).withName("_CERT_POLICIES_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICIES_INFO.$struct$LAYOUT;
    }
    static final VarHandle cPolicyInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cPolicyInfo"));
    public static VarHandle cPolicyInfo$VH() {
        return _CERT_POLICIES_INFO.cPolicyInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cPolicyInfo;
     * }
     */
    public static int cPolicyInfo$get(MemorySegment seg) {
        return (int)_CERT_POLICIES_INFO.cPolicyInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cPolicyInfo;
     * }
     */
    public static void cPolicyInfo$set(MemorySegment seg, int x) {
        _CERT_POLICIES_INFO.cPolicyInfo$VH.set(seg, x);
    }
    public static int cPolicyInfo$get(MemorySegment seg, long index) {
        return (int)_CERT_POLICIES_INFO.cPolicyInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cPolicyInfo$set(MemorySegment seg, long index, int x) {
        _CERT_POLICIES_INFO.cPolicyInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgPolicyInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgPolicyInfo"));
    public static VarHandle rgPolicyInfo$VH() {
        return _CERT_POLICIES_INFO.rgPolicyInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * CERT_POLICY_INFO* rgPolicyInfo;
     * }
     */
    public static MemorySegment rgPolicyInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICIES_INFO.rgPolicyInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * CERT_POLICY_INFO* rgPolicyInfo;
     * }
     */
    public static void rgPolicyInfo$set(MemorySegment seg, MemorySegment x) {
        _CERT_POLICIES_INFO.rgPolicyInfo$VH.set(seg, x);
    }
    public static MemorySegment rgPolicyInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_POLICIES_INFO.rgPolicyInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgPolicyInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_POLICIES_INFO.rgPolicyInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


