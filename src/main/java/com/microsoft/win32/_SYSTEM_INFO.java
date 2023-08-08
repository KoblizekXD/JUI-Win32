// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SYSTEM_INFO {
 *     union {
 *         DWORD dwOemId;
 *         struct {
 *             WORD wProcessorArchitecture;
 *             WORD wReserved;
 *         };
 *     };
 *     DWORD dwPageSize;
 *     LPVOID lpMinimumApplicationAddress;
 *     LPVOID lpMaximumApplicationAddress;
 *     DWORD_PTR dwActiveProcessorMask;
 *     DWORD dwNumberOfProcessors;
 *     DWORD dwProcessorType;
 *     DWORD dwAllocationGranularity;
 *     WORD wProcessorLevel;
 *     WORD wProcessorRevision;
 * };
 * }
 */
public class _SYSTEM_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwOemId"),
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("wProcessorArchitecture"),
                Constants$root.C_SHORT$LAYOUT.withName("wReserved")
            ).withName("$anon$0")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwPageSize"),
        Constants$root.C_POINTER$LAYOUT.withName("lpMinimumApplicationAddress"),
        Constants$root.C_POINTER$LAYOUT.withName("lpMaximumApplicationAddress"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwActiveProcessorMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfProcessors"),
        Constants$root.C_LONG$LAYOUT.withName("dwProcessorType"),
        Constants$root.C_LONG$LAYOUT.withName("dwAllocationGranularity"),
        Constants$root.C_SHORT$LAYOUT.withName("wProcessorLevel"),
        Constants$root.C_SHORT$LAYOUT.withName("wProcessorRevision")
    ).withName("_SYSTEM_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwOemId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwOemId"));
    public static VarHandle dwOemId$VH() {
        return _SYSTEM_INFO.dwOemId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOemId;
     * }
     */
    public static int dwOemId$get(MemorySegment seg) {
        return (int)_SYSTEM_INFO.dwOemId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOemId;
     * }
     */
    public static void dwOemId$set(MemorySegment seg, int x) {
        _SYSTEM_INFO.dwOemId$VH.set(seg, x);
    }
    public static int dwOemId$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_INFO.dwOemId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOemId$set(MemorySegment seg, long index, int x) {
        _SYSTEM_INFO.dwOemId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wProcessorArchitecture$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("wProcessorArchitecture"));
    public static VarHandle wProcessorArchitecture$VH() {
        return _SYSTEM_INFO.wProcessorArchitecture$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wProcessorArchitecture;
     * }
     */
    public static short wProcessorArchitecture$get(MemorySegment seg) {
        return (short)_SYSTEM_INFO.wProcessorArchitecture$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wProcessorArchitecture;
     * }
     */
    public static void wProcessorArchitecture$set(MemorySegment seg, short x) {
        _SYSTEM_INFO.wProcessorArchitecture$VH.set(seg, x);
    }
    public static short wProcessorArchitecture$get(MemorySegment seg, long index) {
        return (short)_SYSTEM_INFO.wProcessorArchitecture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wProcessorArchitecture$set(MemorySegment seg, long index, short x) {
        _SYSTEM_INFO.wProcessorArchitecture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return _SYSTEM_INFO.wReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static short wReserved$get(MemorySegment seg) {
        return (short)_SYSTEM_INFO.wReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReserved;
     * }
     */
    public static void wReserved$set(MemorySegment seg, short x) {
        _SYSTEM_INFO.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)_SYSTEM_INFO.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        _SYSTEM_INFO.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPageSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPageSize"));
    public static VarHandle dwPageSize$VH() {
        return _SYSTEM_INFO.dwPageSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPageSize;
     * }
     */
    public static int dwPageSize$get(MemorySegment seg) {
        return (int)_SYSTEM_INFO.dwPageSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPageSize;
     * }
     */
    public static void dwPageSize$set(MemorySegment seg, int x) {
        _SYSTEM_INFO.dwPageSize$VH.set(seg, x);
    }
    public static int dwPageSize$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_INFO.dwPageSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPageSize$set(MemorySegment seg, long index, int x) {
        _SYSTEM_INFO.dwPageSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpMinimumApplicationAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpMinimumApplicationAddress"));
    public static VarHandle lpMinimumApplicationAddress$VH() {
        return _SYSTEM_INFO.lpMinimumApplicationAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID lpMinimumApplicationAddress;
     * }
     */
    public static MemorySegment lpMinimumApplicationAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SYSTEM_INFO.lpMinimumApplicationAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID lpMinimumApplicationAddress;
     * }
     */
    public static void lpMinimumApplicationAddress$set(MemorySegment seg, MemorySegment x) {
        _SYSTEM_INFO.lpMinimumApplicationAddress$VH.set(seg, x);
    }
    public static MemorySegment lpMinimumApplicationAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SYSTEM_INFO.lpMinimumApplicationAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpMinimumApplicationAddress$set(MemorySegment seg, long index, MemorySegment x) {
        _SYSTEM_INFO.lpMinimumApplicationAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpMaximumApplicationAddress$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpMaximumApplicationAddress"));
    public static VarHandle lpMaximumApplicationAddress$VH() {
        return _SYSTEM_INFO.lpMaximumApplicationAddress$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID lpMaximumApplicationAddress;
     * }
     */
    public static MemorySegment lpMaximumApplicationAddress$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SYSTEM_INFO.lpMaximumApplicationAddress$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID lpMaximumApplicationAddress;
     * }
     */
    public static void lpMaximumApplicationAddress$set(MemorySegment seg, MemorySegment x) {
        _SYSTEM_INFO.lpMaximumApplicationAddress$VH.set(seg, x);
    }
    public static MemorySegment lpMaximumApplicationAddress$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SYSTEM_INFO.lpMaximumApplicationAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpMaximumApplicationAddress$set(MemorySegment seg, long index, MemorySegment x) {
        _SYSTEM_INFO.lpMaximumApplicationAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwActiveProcessorMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwActiveProcessorMask"));
    public static VarHandle dwActiveProcessorMask$VH() {
        return _SYSTEM_INFO.dwActiveProcessorMask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwActiveProcessorMask;
     * }
     */
    public static long dwActiveProcessorMask$get(MemorySegment seg) {
        return (long)_SYSTEM_INFO.dwActiveProcessorMask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwActiveProcessorMask;
     * }
     */
    public static void dwActiveProcessorMask$set(MemorySegment seg, long x) {
        _SYSTEM_INFO.dwActiveProcessorMask$VH.set(seg, x);
    }
    public static long dwActiveProcessorMask$get(MemorySegment seg, long index) {
        return (long)_SYSTEM_INFO.dwActiveProcessorMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActiveProcessorMask$set(MemorySegment seg, long index, long x) {
        _SYSTEM_INFO.dwActiveProcessorMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfProcessors$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfProcessors"));
    public static VarHandle dwNumberOfProcessors$VH() {
        return _SYSTEM_INFO.dwNumberOfProcessors$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfProcessors;
     * }
     */
    public static int dwNumberOfProcessors$get(MemorySegment seg) {
        return (int)_SYSTEM_INFO.dwNumberOfProcessors$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfProcessors;
     * }
     */
    public static void dwNumberOfProcessors$set(MemorySegment seg, int x) {
        _SYSTEM_INFO.dwNumberOfProcessors$VH.set(seg, x);
    }
    public static int dwNumberOfProcessors$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_INFO.dwNumberOfProcessors$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfProcessors$set(MemorySegment seg, long index, int x) {
        _SYSTEM_INFO.dwNumberOfProcessors$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProcessorType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProcessorType"));
    public static VarHandle dwProcessorType$VH() {
        return _SYSTEM_INFO.dwProcessorType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProcessorType;
     * }
     */
    public static int dwProcessorType$get(MemorySegment seg) {
        return (int)_SYSTEM_INFO.dwProcessorType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProcessorType;
     * }
     */
    public static void dwProcessorType$set(MemorySegment seg, int x) {
        _SYSTEM_INFO.dwProcessorType$VH.set(seg, x);
    }
    public static int dwProcessorType$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_INFO.dwProcessorType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProcessorType$set(MemorySegment seg, long index, int x) {
        _SYSTEM_INFO.dwProcessorType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAllocationGranularity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAllocationGranularity"));
    public static VarHandle dwAllocationGranularity$VH() {
        return _SYSTEM_INFO.dwAllocationGranularity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwAllocationGranularity;
     * }
     */
    public static int dwAllocationGranularity$get(MemorySegment seg) {
        return (int)_SYSTEM_INFO.dwAllocationGranularity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwAllocationGranularity;
     * }
     */
    public static void dwAllocationGranularity$set(MemorySegment seg, int x) {
        _SYSTEM_INFO.dwAllocationGranularity$VH.set(seg, x);
    }
    public static int dwAllocationGranularity$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_INFO.dwAllocationGranularity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAllocationGranularity$set(MemorySegment seg, long index, int x) {
        _SYSTEM_INFO.dwAllocationGranularity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wProcessorLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wProcessorLevel"));
    public static VarHandle wProcessorLevel$VH() {
        return _SYSTEM_INFO.wProcessorLevel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wProcessorLevel;
     * }
     */
    public static short wProcessorLevel$get(MemorySegment seg) {
        return (short)_SYSTEM_INFO.wProcessorLevel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wProcessorLevel;
     * }
     */
    public static void wProcessorLevel$set(MemorySegment seg, short x) {
        _SYSTEM_INFO.wProcessorLevel$VH.set(seg, x);
    }
    public static short wProcessorLevel$get(MemorySegment seg, long index) {
        return (short)_SYSTEM_INFO.wProcessorLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wProcessorLevel$set(MemorySegment seg, long index, short x) {
        _SYSTEM_INFO.wProcessorLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wProcessorRevision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wProcessorRevision"));
    public static VarHandle wProcessorRevision$VH() {
        return _SYSTEM_INFO.wProcessorRevision$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wProcessorRevision;
     * }
     */
    public static short wProcessorRevision$get(MemorySegment seg) {
        return (short)_SYSTEM_INFO.wProcessorRevision$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wProcessorRevision;
     * }
     */
    public static void wProcessorRevision$set(MemorySegment seg, short x) {
        _SYSTEM_INFO.wProcessorRevision$VH.set(seg, x);
    }
    public static short wProcessorRevision$get(MemorySegment seg, long index) {
        return (short)_SYSTEM_INFO.wProcessorRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wProcessorRevision$set(MemorySegment seg, long index, short x) {
        _SYSTEM_INFO.wProcessorRevision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


