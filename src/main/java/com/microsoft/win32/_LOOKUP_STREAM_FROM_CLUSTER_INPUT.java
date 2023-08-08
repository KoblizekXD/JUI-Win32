// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _LOOKUP_STREAM_FROM_CLUSTER_INPUT {
 *     DWORD Flags;
 *     DWORD NumberOfClusters;
 *     LARGE_INTEGER Cluster[1];
 * };
 * }
 */
public class _LOOKUP_STREAM_FROM_CLUSTER_INPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfClusters"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("_LARGE_INTEGER")).withName("Cluster")
    ).withName("_LOOKUP_STREAM_FROM_CLUSTER_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _LOOKUP_STREAM_FROM_CLUSTER_INPUT.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_INPUT.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_INPUT.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_INPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_INPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_INPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfClusters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfClusters"));
    public static VarHandle NumberOfClusters$VH() {
        return _LOOKUP_STREAM_FROM_CLUSTER_INPUT.NumberOfClusters$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfClusters;
     * }
     */
    public static int NumberOfClusters$get(MemorySegment seg) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_INPUT.NumberOfClusters$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfClusters;
     * }
     */
    public static void NumberOfClusters$set(MemorySegment seg, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_INPUT.NumberOfClusters$VH.set(seg, x);
    }
    public static int NumberOfClusters$get(MemorySegment seg, long index) {
        return (int)_LOOKUP_STREAM_FROM_CLUSTER_INPUT.NumberOfClusters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfClusters$set(MemorySegment seg, long index, int x) {
        _LOOKUP_STREAM_FROM_CLUSTER_INPUT.NumberOfClusters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Cluster$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


