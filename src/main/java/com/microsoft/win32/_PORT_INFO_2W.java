// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PORT_INFO_2W {
 *     LPWSTR pPortName;
 *     LPWSTR pMonitorName;
 *     LPWSTR pDescription;
 *     DWORD fPortType;
 *     DWORD Reserved;
 * };
 * }
 */
public class _PORT_INFO_2W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pPortName"),
        Constants$root.C_POINTER$LAYOUT.withName("pMonitorName"),
        Constants$root.C_POINTER$LAYOUT.withName("pDescription"),
        Constants$root.C_LONG$LAYOUT.withName("fPortType"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved")
    ).withName("_PORT_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _PORT_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle pPortName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    public static VarHandle pPortName$VH() {
        return _PORT_INFO_2W.pPortName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pPortName;
     * }
     */
    public static MemorySegment pPortName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PORT_INFO_2W.pPortName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pPortName;
     * }
     */
    public static void pPortName$set(MemorySegment seg, MemorySegment x) {
        _PORT_INFO_2W.pPortName$VH.set(seg, x);
    }
    public static MemorySegment pPortName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PORT_INFO_2W.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemorySegment x) {
        _PORT_INFO_2W.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMonitorName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMonitorName"));
    public static VarHandle pMonitorName$VH() {
        return _PORT_INFO_2W.pMonitorName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pMonitorName;
     * }
     */
    public static MemorySegment pMonitorName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PORT_INFO_2W.pMonitorName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pMonitorName;
     * }
     */
    public static void pMonitorName$set(MemorySegment seg, MemorySegment x) {
        _PORT_INFO_2W.pMonitorName$VH.set(seg, x);
    }
    public static MemorySegment pMonitorName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PORT_INFO_2W.pMonitorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemorySegment x) {
        _PORT_INFO_2W.pMonitorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDescription$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDescription"));
    public static VarHandle pDescription$VH() {
        return _PORT_INFO_2W.pDescription$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDescription;
     * }
     */
    public static MemorySegment pDescription$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PORT_INFO_2W.pDescription$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDescription;
     * }
     */
    public static void pDescription$set(MemorySegment seg, MemorySegment x) {
        _PORT_INFO_2W.pDescription$VH.set(seg, x);
    }
    public static MemorySegment pDescription$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PORT_INFO_2W.pDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDescription$set(MemorySegment seg, long index, MemorySegment x) {
        _PORT_INFO_2W.pDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fPortType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fPortType"));
    public static VarHandle fPortType$VH() {
        return _PORT_INFO_2W.fPortType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fPortType;
     * }
     */
    public static int fPortType$get(MemorySegment seg) {
        return (int)_PORT_INFO_2W.fPortType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fPortType;
     * }
     */
    public static void fPortType$set(MemorySegment seg, int x) {
        _PORT_INFO_2W.fPortType$VH.set(seg, x);
    }
    public static int fPortType$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_2W.fPortType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fPortType$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_2W.fPortType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PORT_INFO_2W.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_PORT_INFO_2W.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _PORT_INFO_2W.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_2W.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_2W.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


