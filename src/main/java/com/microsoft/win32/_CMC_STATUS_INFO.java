// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMC_STATUS_INFO {
 *     DWORD dwStatus;
 *     DWORD cBodyList;
 *     DWORD* rgdwBodyList;
 *     LPWSTR pwszStatusString;
 *     DWORD dwOtherInfoChoice;
 *     union {
 *         DWORD dwFailInfo;
 *         PCMC_PEND_INFO pPendInfo;
 *     };
 * };
 * }
 */
public class _CMC_STATUS_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStatus"),
        Constants$root.C_LONG$LAYOUT.withName("cBodyList"),
        Constants$root.C_POINTER$LAYOUT.withName("rgdwBodyList"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszStatusString"),
        Constants$root.C_LONG$LAYOUT.withName("dwOtherInfoChoice"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwFailInfo"),
            Constants$root.C_POINTER$LAYOUT.withName("pPendInfo")
        ).withName("$anon$0")
    ).withName("_CMC_STATUS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMC_STATUS_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    public static VarHandle dwStatus$VH() {
        return _CMC_STATUS_INFO.dwStatus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwStatus;
     * }
     */
    public static int dwStatus$get(MemorySegment seg) {
        return (int)_CMC_STATUS_INFO.dwStatus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwStatus;
     * }
     */
    public static void dwStatus$set(MemorySegment seg, int x) {
        _CMC_STATUS_INFO.dwStatus$VH.set(seg, x);
    }
    public static int dwStatus$get(MemorySegment seg, long index) {
        return (int)_CMC_STATUS_INFO.dwStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStatus$set(MemorySegment seg, long index, int x) {
        _CMC_STATUS_INFO.dwStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cBodyList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBodyList"));
    public static VarHandle cBodyList$VH() {
        return _CMC_STATUS_INFO.cBodyList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cBodyList;
     * }
     */
    public static int cBodyList$get(MemorySegment seg) {
        return (int)_CMC_STATUS_INFO.cBodyList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cBodyList;
     * }
     */
    public static void cBodyList$set(MemorySegment seg, int x) {
        _CMC_STATUS_INFO.cBodyList$VH.set(seg, x);
    }
    public static int cBodyList$get(MemorySegment seg, long index) {
        return (int)_CMC_STATUS_INFO.cBodyList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBodyList$set(MemorySegment seg, long index, int x) {
        _CMC_STATUS_INFO.cBodyList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgdwBodyList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgdwBodyList"));
    public static VarHandle rgdwBodyList$VH() {
        return _CMC_STATUS_INFO.rgdwBodyList$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD* rgdwBodyList;
     * }
     */
    public static MemorySegment rgdwBodyList$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMC_STATUS_INFO.rgdwBodyList$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD* rgdwBodyList;
     * }
     */
    public static void rgdwBodyList$set(MemorySegment seg, MemorySegment x) {
        _CMC_STATUS_INFO.rgdwBodyList$VH.set(seg, x);
    }
    public static MemorySegment rgdwBodyList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMC_STATUS_INFO.rgdwBodyList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgdwBodyList$set(MemorySegment seg, long index, MemorySegment x) {
        _CMC_STATUS_INFO.rgdwBodyList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszStatusString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszStatusString"));
    public static VarHandle pwszStatusString$VH() {
        return _CMC_STATUS_INFO.pwszStatusString$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszStatusString;
     * }
     */
    public static MemorySegment pwszStatusString$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMC_STATUS_INFO.pwszStatusString$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszStatusString;
     * }
     */
    public static void pwszStatusString$set(MemorySegment seg, MemorySegment x) {
        _CMC_STATUS_INFO.pwszStatusString$VH.set(seg, x);
    }
    public static MemorySegment pwszStatusString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMC_STATUS_INFO.pwszStatusString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszStatusString$set(MemorySegment seg, long index, MemorySegment x) {
        _CMC_STATUS_INFO.pwszStatusString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOtherInfoChoice$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOtherInfoChoice"));
    public static VarHandle dwOtherInfoChoice$VH() {
        return _CMC_STATUS_INFO.dwOtherInfoChoice$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOtherInfoChoice;
     * }
     */
    public static int dwOtherInfoChoice$get(MemorySegment seg) {
        return (int)_CMC_STATUS_INFO.dwOtherInfoChoice$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOtherInfoChoice;
     * }
     */
    public static void dwOtherInfoChoice$set(MemorySegment seg, int x) {
        _CMC_STATUS_INFO.dwOtherInfoChoice$VH.set(seg, x);
    }
    public static int dwOtherInfoChoice$get(MemorySegment seg, long index) {
        return (int)_CMC_STATUS_INFO.dwOtherInfoChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOtherInfoChoice$set(MemorySegment seg, long index, int x) {
        _CMC_STATUS_INFO.dwOtherInfoChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFailInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwFailInfo"));
    public static VarHandle dwFailInfo$VH() {
        return _CMC_STATUS_INFO.dwFailInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFailInfo;
     * }
     */
    public static int dwFailInfo$get(MemorySegment seg) {
        return (int)_CMC_STATUS_INFO.dwFailInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFailInfo;
     * }
     */
    public static void dwFailInfo$set(MemorySegment seg, int x) {
        _CMC_STATUS_INFO.dwFailInfo$VH.set(seg, x);
    }
    public static int dwFailInfo$get(MemorySegment seg, long index) {
        return (int)_CMC_STATUS_INFO.dwFailInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFailInfo$set(MemorySegment seg, long index, int x) {
        _CMC_STATUS_INFO.dwFailInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pPendInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pPendInfo"));
    public static VarHandle pPendInfo$VH() {
        return _CMC_STATUS_INFO.pPendInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMC_PEND_INFO pPendInfo;
     * }
     */
    public static MemorySegment pPendInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CMC_STATUS_INFO.pPendInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMC_PEND_INFO pPendInfo;
     * }
     */
    public static void pPendInfo$set(MemorySegment seg, MemorySegment x) {
        _CMC_STATUS_INFO.pPendInfo$VH.set(seg, x);
    }
    public static MemorySegment pPendInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CMC_STATUS_INFO.pPendInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPendInfo$set(MemorySegment seg, long index, MemorySegment x) {
        _CMC_STATUS_INFO.pPendInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

