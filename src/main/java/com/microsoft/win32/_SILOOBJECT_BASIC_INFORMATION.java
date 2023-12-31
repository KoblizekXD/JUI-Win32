// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SILOOBJECT_BASIC_INFORMATION {
 *     DWORD SiloId;
 *     DWORD SiloParentId;
 *     DWORD NumberOfProcesses;
 *     BOOLEAN IsInServerSilo;
 *     BYTE Reserved[3];
 * };
 * }
 */
public class _SILOOBJECT_BASIC_INFORMATION {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SiloId"),
        Constants$root.C_LONG$LAYOUT.withName("SiloParentId"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfProcesses"),
        Constants$root.C_CHAR$LAYOUT.withName("IsInServerSilo"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_CHAR$LAYOUT).withName("Reserved")
    ).withName("_SILOOBJECT_BASIC_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _SILOOBJECT_BASIC_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle SiloId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SiloId"));
    public static VarHandle SiloId$VH() {
        return _SILOOBJECT_BASIC_INFORMATION.SiloId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SiloId;
     * }
     */
    public static int SiloId$get(MemorySegment seg) {
        return (int)_SILOOBJECT_BASIC_INFORMATION.SiloId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SiloId;
     * }
     */
    public static void SiloId$set(MemorySegment seg, int x) {
        _SILOOBJECT_BASIC_INFORMATION.SiloId$VH.set(seg, x);
    }
    public static int SiloId$get(MemorySegment seg, long index) {
        return (int)_SILOOBJECT_BASIC_INFORMATION.SiloId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SiloId$set(MemorySegment seg, long index, int x) {
        _SILOOBJECT_BASIC_INFORMATION.SiloId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SiloParentId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SiloParentId"));
    public static VarHandle SiloParentId$VH() {
        return _SILOOBJECT_BASIC_INFORMATION.SiloParentId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SiloParentId;
     * }
     */
    public static int SiloParentId$get(MemorySegment seg) {
        return (int)_SILOOBJECT_BASIC_INFORMATION.SiloParentId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SiloParentId;
     * }
     */
    public static void SiloParentId$set(MemorySegment seg, int x) {
        _SILOOBJECT_BASIC_INFORMATION.SiloParentId$VH.set(seg, x);
    }
    public static int SiloParentId$get(MemorySegment seg, long index) {
        return (int)_SILOOBJECT_BASIC_INFORMATION.SiloParentId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SiloParentId$set(MemorySegment seg, long index, int x) {
        _SILOOBJECT_BASIC_INFORMATION.SiloParentId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfProcesses$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfProcesses"));
    public static VarHandle NumberOfProcesses$VH() {
        return _SILOOBJECT_BASIC_INFORMATION.NumberOfProcesses$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfProcesses;
     * }
     */
    public static int NumberOfProcesses$get(MemorySegment seg) {
        return (int)_SILOOBJECT_BASIC_INFORMATION.NumberOfProcesses$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfProcesses;
     * }
     */
    public static void NumberOfProcesses$set(MemorySegment seg, int x) {
        _SILOOBJECT_BASIC_INFORMATION.NumberOfProcesses$VH.set(seg, x);
    }
    public static int NumberOfProcesses$get(MemorySegment seg, long index) {
        return (int)_SILOOBJECT_BASIC_INFORMATION.NumberOfProcesses$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfProcesses$set(MemorySegment seg, long index, int x) {
        _SILOOBJECT_BASIC_INFORMATION.NumberOfProcesses$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IsInServerSilo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsInServerSilo"));
    public static VarHandle IsInServerSilo$VH() {
        return _SILOOBJECT_BASIC_INFORMATION.IsInServerSilo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN IsInServerSilo;
     * }
     */
    public static byte IsInServerSilo$get(MemorySegment seg) {
        return (byte)_SILOOBJECT_BASIC_INFORMATION.IsInServerSilo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN IsInServerSilo;
     * }
     */
    public static void IsInServerSilo$set(MemorySegment seg, byte x) {
        _SILOOBJECT_BASIC_INFORMATION.IsInServerSilo$VH.set(seg, x);
    }
    public static byte IsInServerSilo$get(MemorySegment seg, long index) {
        return (byte)_SILOOBJECT_BASIC_INFORMATION.IsInServerSilo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsInServerSilo$set(MemorySegment seg, long index, byte x) {
        _SILOOBJECT_BASIC_INFORMATION.IsInServerSilo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(13, 3);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


