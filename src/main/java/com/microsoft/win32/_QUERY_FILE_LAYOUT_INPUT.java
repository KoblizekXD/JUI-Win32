// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _QUERY_FILE_LAYOUT_INPUT {
 *     union {
 *         DWORD FilterEntryCount;
 *         DWORD NumberOfPairs;
 *     };
 *     DWORD Flags;
 *     QUERY_FILE_LAYOUT_FILTER_TYPE FilterType;
 *     DWORD Reserved;
 *     union  Filter;
 * };
 * }
 */
public class _QUERY_FILE_LAYOUT_INPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("FilterEntryCount"),
            Constants$root.C_LONG$LAYOUT.withName("NumberOfPairs")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("FilterType"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved"),
        MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("$anon$0"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("u"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
                ).withName("StartingCluster"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("$anon$0"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("u"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
                ).withName("ClusterCount")
            ).withName("_CLUSTER_RANGE")).withName("ClusterRanges"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("StartingFileReferenceNumber"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("EndingFileReferenceNumber")
            ).withName("_FILE_REFERENCE_RANGE")).withName("FileReferenceRanges"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("StorageReserveIds")
        ).withName("Filter")
    ).withName("_QUERY_FILE_LAYOUT_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _QUERY_FILE_LAYOUT_INPUT.$struct$LAYOUT;
    }
    static final VarHandle FilterEntryCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("FilterEntryCount"));
    public static VarHandle FilterEntryCount$VH() {
        return _QUERY_FILE_LAYOUT_INPUT.FilterEntryCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FilterEntryCount;
     * }
     */
    public static int FilterEntryCount$get(MemorySegment seg) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.FilterEntryCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FilterEntryCount;
     * }
     */
    public static void FilterEntryCount$set(MemorySegment seg, int x) {
        _QUERY_FILE_LAYOUT_INPUT.FilterEntryCount$VH.set(seg, x);
    }
    public static int FilterEntryCount$get(MemorySegment seg, long index) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.FilterEntryCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FilterEntryCount$set(MemorySegment seg, long index, int x) {
        _QUERY_FILE_LAYOUT_INPUT.FilterEntryCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfPairs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("NumberOfPairs"));
    public static VarHandle NumberOfPairs$VH() {
        return _QUERY_FILE_LAYOUT_INPUT.NumberOfPairs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfPairs;
     * }
     */
    public static int NumberOfPairs$get(MemorySegment seg) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.NumberOfPairs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfPairs;
     * }
     */
    public static void NumberOfPairs$set(MemorySegment seg, int x) {
        _QUERY_FILE_LAYOUT_INPUT.NumberOfPairs$VH.set(seg, x);
    }
    public static int NumberOfPairs$get(MemorySegment seg, long index) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.NumberOfPairs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfPairs$set(MemorySegment seg, long index, int x) {
        _QUERY_FILE_LAYOUT_INPUT.NumberOfPairs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _QUERY_FILE_LAYOUT_INPUT.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _QUERY_FILE_LAYOUT_INPUT.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _QUERY_FILE_LAYOUT_INPUT.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FilterType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FilterType"));
    public static VarHandle FilterType$VH() {
        return _QUERY_FILE_LAYOUT_INPUT.FilterType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * QUERY_FILE_LAYOUT_FILTER_TYPE FilterType;
     * }
     */
    public static int FilterType$get(MemorySegment seg) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.FilterType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * QUERY_FILE_LAYOUT_FILTER_TYPE FilterType;
     * }
     */
    public static void FilterType$set(MemorySegment seg, int x) {
        _QUERY_FILE_LAYOUT_INPUT.FilterType$VH.set(seg, x);
    }
    public static int FilterType$get(MemorySegment seg, long index) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.FilterType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FilterType$set(MemorySegment seg, long index, int x) {
        _QUERY_FILE_LAYOUT_INPUT.FilterType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _QUERY_FILE_LAYOUT_INPUT.Reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.Reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        _QUERY_FILE_LAYOUT_INPUT.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_QUERY_FILE_LAYOUT_INPUT.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _QUERY_FILE_LAYOUT_INPUT.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * union {
     *     CLUSTER_RANGE ClusterRanges[1];
     *     FILE_REFERENCE_RANGE FileReferenceRanges[1];
     *     STORAGE_RESERVE_ID StorageReserveIds[1];
     * };
     * }
     */
    public static final class Filter {

        // Suppresses default constructor, ensuring non-instantiability.
        private Filter() {}
        static final UnionLayout Filter$union$LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("$anon$0"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("u"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
                ).withName("StartingCluster"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("$anon$0"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                        Constants$root.C_LONG$LAYOUT.withName("HighPart")
                    ).withName("u"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
                ).withName("ClusterCount")
            ).withName("_CLUSTER_RANGE")).withName("ClusterRanges"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("StartingFileReferenceNumber"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("EndingFileReferenceNumber")
            ).withName("_FILE_REFERENCE_RANGE")).withName("FileReferenceRanges"),
            MemoryLayout.sequenceLayout(1, Constants$root.C_LONG$LAYOUT).withName("StorageReserveIds")
        );
        public static MemoryLayout $LAYOUT() {
            return Filter.Filter$union$LAYOUT;
        }
        public static MemorySegment ClusterRanges$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment FileReferenceRanges$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static MemorySegment StorageReserveIds$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Filter$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


