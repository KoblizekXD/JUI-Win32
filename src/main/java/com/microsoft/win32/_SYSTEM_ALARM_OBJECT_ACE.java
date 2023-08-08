// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SYSTEM_ALARM_OBJECT_ACE {
 *     ACE_HEADER Header;
 *     ACCESS_MASK Mask;
 *     DWORD Flags;
 *     GUID ObjectType;
 *     GUID InheritedObjectType;
 *     DWORD SidStart;
 * };
 * }
 */
public class _SYSTEM_ALARM_OBJECT_ACE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("AceType"),
            Constants$root.C_CHAR$LAYOUT.withName("AceFlags"),
            Constants$root.C_SHORT$LAYOUT.withName("AceSize")
        ).withName("Header"),
        Constants$root.C_LONG$LAYOUT.withName("Mask"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ObjectType"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("InheritedObjectType"),
        Constants$root.C_LONG$LAYOUT.withName("SidStart")
    ).withName("_SYSTEM_ALARM_OBJECT_ACE");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_ALARM_OBJECT_ACE.$struct$LAYOUT;
    }
    public static MemorySegment Header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    static final VarHandle Mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    public static VarHandle Mask$VH() {
        return _SYSTEM_ALARM_OBJECT_ACE.Mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK Mask;
     * }
     */
    public static int Mask$get(MemorySegment seg) {
        return (int)_SYSTEM_ALARM_OBJECT_ACE.Mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK Mask;
     * }
     */
    public static void Mask$set(MemorySegment seg, int x) {
        _SYSTEM_ALARM_OBJECT_ACE.Mask$VH.set(seg, x);
    }
    public static int Mask$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_ALARM_OBJECT_ACE.Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mask$set(MemorySegment seg, long index, int x) {
        _SYSTEM_ALARM_OBJECT_ACE.Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SYSTEM_ALARM_OBJECT_ACE.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_SYSTEM_ALARM_OBJECT_ACE.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _SYSTEM_ALARM_OBJECT_ACE.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_ALARM_OBJECT_ACE.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SYSTEM_ALARM_OBJECT_ACE.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ObjectType$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static MemorySegment InheritedObjectType$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    static final VarHandle SidStart$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SidStart"));
    public static VarHandle SidStart$VH() {
        return _SYSTEM_ALARM_OBJECT_ACE.SidStart$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SidStart;
     * }
     */
    public static int SidStart$get(MemorySegment seg) {
        return (int)_SYSTEM_ALARM_OBJECT_ACE.SidStart$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SidStart;
     * }
     */
    public static void SidStart$set(MemorySegment seg, int x) {
        _SYSTEM_ALARM_OBJECT_ACE.SidStart$VH.set(seg, x);
    }
    public static int SidStart$get(MemorySegment seg, long index) {
        return (int)_SYSTEM_ALARM_OBJECT_ACE.SidStart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SidStart$set(MemorySegment seg, long index, int x) {
        _SYSTEM_ALARM_OBJECT_ACE.SidStart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


