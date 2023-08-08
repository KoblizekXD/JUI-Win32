// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SD_GLOBAL_CHANGE_INPUT {
 *     DWORD Flags;
 *     DWORD ChangeType;
 *     union {
 *         SD_CHANGE_MACHINE_SID_INPUT SdChange;
 *         SD_QUERY_STATS_INPUT SdQueryStats;
 *         SD_ENUM_SDS_INPUT SdEnumSds;
 *     };
 * };
 * }
 */
public class _SD_GLOBAL_CHANGE_INPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("ChangeType"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_SHORT$LAYOUT.withName("CurrentMachineSIDOffset"),
                Constants$root.C_SHORT$LAYOUT.withName("CurrentMachineSIDLength"),
                Constants$root.C_SHORT$LAYOUT.withName("NewMachineSIDOffset"),
                Constants$root.C_SHORT$LAYOUT.withName("NewMachineSIDLength")
            ).withName("SdChange"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Reserved")
            ).withName("SdQueryStats"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("StartingOffset"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("MaxSDEntriesToReturn")
            ).withName("SdEnumSds")
        ).withName("$anon$0")
    ).withName("_SD_GLOBAL_CHANGE_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _SD_GLOBAL_CHANGE_INPUT.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _SD_GLOBAL_CHANGE_INPUT.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_SD_GLOBAL_CHANGE_INPUT.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _SD_GLOBAL_CHANGE_INPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_SD_GLOBAL_CHANGE_INPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _SD_GLOBAL_CHANGE_INPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ChangeType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ChangeType"));
    public static VarHandle ChangeType$VH() {
        return _SD_GLOBAL_CHANGE_INPUT.ChangeType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ChangeType;
     * }
     */
    public static int ChangeType$get(MemorySegment seg) {
        return (int)_SD_GLOBAL_CHANGE_INPUT.ChangeType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ChangeType;
     * }
     */
    public static void ChangeType$set(MemorySegment seg, int x) {
        _SD_GLOBAL_CHANGE_INPUT.ChangeType$VH.set(seg, x);
    }
    public static int ChangeType$get(MemorySegment seg, long index) {
        return (int)_SD_GLOBAL_CHANGE_INPUT.ChangeType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ChangeType$set(MemorySegment seg, long index, int x) {
        _SD_GLOBAL_CHANGE_INPUT.ChangeType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SdChange$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment SdQueryStats$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static MemorySegment SdEnumSds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


