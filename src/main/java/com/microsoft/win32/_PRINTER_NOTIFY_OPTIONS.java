// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_NOTIFY_OPTIONS {
 *     DWORD Version;
 *     DWORD Flags;
 *     DWORD Count;
 *     PPRINTER_NOTIFY_OPTIONS_TYPE pTypes;
 * };
 * }
 */
public class _PRINTER_NOTIFY_OPTIONS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pTypes")
    ).withName("_PRINTER_NOTIFY_OPTIONS");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_NOTIFY_OPTIONS.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _PRINTER_NOTIFY_OPTIONS.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _PRINTER_NOTIFY_OPTIONS.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_OPTIONS.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _PRINTER_NOTIFY_OPTIONS.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _PRINTER_NOTIFY_OPTIONS.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_OPTIONS.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _PRINTER_NOTIFY_OPTIONS.Count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        _PRINTER_NOTIFY_OPTIONS.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_PRINTER_NOTIFY_OPTIONS.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _PRINTER_NOTIFY_OPTIONS.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTypes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTypes"));
    public static VarHandle pTypes$VH() {
        return _PRINTER_NOTIFY_OPTIONS.pTypes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PPRINTER_NOTIFY_OPTIONS_TYPE pTypes;
     * }
     */
    public static MemorySegment pTypes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PRINTER_NOTIFY_OPTIONS.pTypes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PPRINTER_NOTIFY_OPTIONS_TYPE pTypes;
     * }
     */
    public static void pTypes$set(MemorySegment seg, MemorySegment x) {
        _PRINTER_NOTIFY_OPTIONS.pTypes$VH.set(seg, x);
    }
    public static MemorySegment pTypes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PRINTER_NOTIFY_OPTIONS.pTypes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTypes$set(MemorySegment seg, long index, MemorySegment x) {
        _PRINTER_NOTIFY_OPTIONS.pTypes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

