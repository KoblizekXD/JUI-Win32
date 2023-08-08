// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_FAILURE_ACTIONSA {
 *     DWORD dwResetPeriod;
 *     LPSTR lpRebootMsg;
 *     LPSTR lpCommand;
 *     DWORD cActions;
 *     SC_ACTION* lpsaActions;
 * };
 * }
 */
public class _SERVICE_FAILURE_ACTIONSA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwResetPeriod"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpRebootMsg"),
        Constants$root.C_POINTER$LAYOUT.withName("lpCommand"),
        Constants$root.C_LONG$LAYOUT.withName("cActions"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpsaActions")
    ).withName("_SERVICE_FAILURE_ACTIONSA");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_FAILURE_ACTIONSA.$struct$LAYOUT;
    }
    static final VarHandle dwResetPeriod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwResetPeriod"));
    public static VarHandle dwResetPeriod$VH() {
        return _SERVICE_FAILURE_ACTIONSA.dwResetPeriod$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwResetPeriod;
     * }
     */
    public static int dwResetPeriod$get(MemorySegment seg) {
        return (int)_SERVICE_FAILURE_ACTIONSA.dwResetPeriod$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwResetPeriod;
     * }
     */
    public static void dwResetPeriod$set(MemorySegment seg, int x) {
        _SERVICE_FAILURE_ACTIONSA.dwResetPeriod$VH.set(seg, x);
    }
    public static int dwResetPeriod$get(MemorySegment seg, long index) {
        return (int)_SERVICE_FAILURE_ACTIONSA.dwResetPeriod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResetPeriod$set(MemorySegment seg, long index, int x) {
        _SERVICE_FAILURE_ACTIONSA.dwResetPeriod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpRebootMsg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpRebootMsg"));
    public static VarHandle lpRebootMsg$VH() {
        return _SERVICE_FAILURE_ACTIONSA.lpRebootMsg$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpRebootMsg;
     * }
     */
    public static MemorySegment lpRebootMsg$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_FAILURE_ACTIONSA.lpRebootMsg$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpRebootMsg;
     * }
     */
    public static void lpRebootMsg$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_FAILURE_ACTIONSA.lpRebootMsg$VH.set(seg, x);
    }
    public static MemorySegment lpRebootMsg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_FAILURE_ACTIONSA.lpRebootMsg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRebootMsg$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_FAILURE_ACTIONSA.lpRebootMsg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCommand$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpCommand"));
    public static VarHandle lpCommand$VH() {
        return _SERVICE_FAILURE_ACTIONSA.lpCommand$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpCommand;
     * }
     */
    public static MemorySegment lpCommand$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_FAILURE_ACTIONSA.lpCommand$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpCommand;
     * }
     */
    public static void lpCommand$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_FAILURE_ACTIONSA.lpCommand$VH.set(seg, x);
    }
    public static MemorySegment lpCommand$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_FAILURE_ACTIONSA.lpCommand$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCommand$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_FAILURE_ACTIONSA.lpCommand$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cActions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cActions"));
    public static VarHandle cActions$VH() {
        return _SERVICE_FAILURE_ACTIONSA.cActions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cActions;
     * }
     */
    public static int cActions$get(MemorySegment seg) {
        return (int)_SERVICE_FAILURE_ACTIONSA.cActions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cActions;
     * }
     */
    public static void cActions$set(MemorySegment seg, int x) {
        _SERVICE_FAILURE_ACTIONSA.cActions$VH.set(seg, x);
    }
    public static int cActions$get(MemorySegment seg, long index) {
        return (int)_SERVICE_FAILURE_ACTIONSA.cActions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cActions$set(MemorySegment seg, long index, int x) {
        _SERVICE_FAILURE_ACTIONSA.cActions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpsaActions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpsaActions"));
    public static VarHandle lpsaActions$VH() {
        return _SERVICE_FAILURE_ACTIONSA.lpsaActions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SC_ACTION* lpsaActions;
     * }
     */
    public static MemorySegment lpsaActions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_SERVICE_FAILURE_ACTIONSA.lpsaActions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SC_ACTION* lpsaActions;
     * }
     */
    public static void lpsaActions$set(MemorySegment seg, MemorySegment x) {
        _SERVICE_FAILURE_ACTIONSA.lpsaActions$VH.set(seg, x);
    }
    public static MemorySegment lpsaActions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_SERVICE_FAILURE_ACTIONSA.lpsaActions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpsaActions$set(MemorySegment seg, long index, MemorySegment x) {
        _SERVICE_FAILURE_ACTIONSA.lpsaActions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


