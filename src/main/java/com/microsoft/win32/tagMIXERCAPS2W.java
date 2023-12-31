// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMIXERCAPS2W {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     WCHAR szPname[32];
 *     DWORD fdwSupport;
 *     DWORD cDestinations;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * };
 * }
 */
public class tagMIXERCAPS2W {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wMid"),
        Constants$root.C_SHORT$LAYOUT.withName("wPid"),
        Constants$root.C_LONG$LAYOUT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("szPname"),
        Constants$root.C_LONG$LAYOUT.withName("fdwSupport"),
        Constants$root.C_LONG$LAYOUT.withName("cDestinations"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ManufacturerGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProductGuid"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("NameGuid")
    ).withName("tagMIXERCAPS2W");
    public static MemoryLayout $LAYOUT() {
        return tagMIXERCAPS2W.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIXERCAPS2W.wMid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIXERCAPS2W.wMid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wMid;
     * }
     */
    public static void wMid$set(MemorySegment seg, short x) {
        tagMIXERCAPS2W.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIXERCAPS2W.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIXERCAPS2W.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIXERCAPS2W.wPid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIXERCAPS2W.wPid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wPid;
     * }
     */
    public static void wPid$set(MemorySegment seg, short x) {
        tagMIXERCAPS2W.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIXERCAPS2W.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIXERCAPS2W.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIXERCAPS2W.vDriverVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIXERCAPS2W.vDriverVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MMVERSION vDriverVersion;
     * }
     */
    public static void vDriverVersion$set(MemorySegment seg, int x) {
        tagMIXERCAPS2W.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPS2W.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPS2W.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle fdwSupport$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fdwSupport"));
    public static VarHandle fdwSupport$VH() {
        return tagMIXERCAPS2W.fdwSupport$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fdwSupport;
     * }
     */
    public static int fdwSupport$get(MemorySegment seg) {
        return (int)tagMIXERCAPS2W.fdwSupport$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fdwSupport;
     * }
     */
    public static void fdwSupport$set(MemorySegment seg, int x) {
        tagMIXERCAPS2W.fdwSupport$VH.set(seg, x);
    }
    public static int fdwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPS2W.fdwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fdwSupport$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPS2W.fdwSupport$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cDestinations$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDestinations"));
    public static VarHandle cDestinations$VH() {
        return tagMIXERCAPS2W.cDestinations$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cDestinations;
     * }
     */
    public static int cDestinations$get(MemorySegment seg) {
        return (int)tagMIXERCAPS2W.cDestinations$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cDestinations;
     * }
     */
    public static void cDestinations$set(MemorySegment seg, int x) {
        tagMIXERCAPS2W.cDestinations$VH.set(seg, x);
    }
    public static int cDestinations$get(MemorySegment seg, long index) {
        return (int)tagMIXERCAPS2W.cDestinations$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDestinations$set(MemorySegment seg, long index, int x) {
        tagMIXERCAPS2W.cDestinations$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ManufacturerGuid$slice(MemorySegment seg) {
        return seg.asSlice(80, 16);
    }
    public static MemorySegment ProductGuid$slice(MemorySegment seg) {
        return seg.asSlice(96, 16);
    }
    public static MemorySegment NameGuid$slice(MemorySegment seg) {
        return seg.asSlice(112, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


