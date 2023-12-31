// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISK_PARTITION_INFO {
 *     DWORD SizeOfPartitionInfo;
 *     PARTITION_STYLE PartitionStyle;
 *     union {
 *         struct  Mbr;
 *         struct  Gpt;
 *     };
 * };
 * }
 */
public class _DISK_PARTITION_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("SizeOfPartitionInfo"),
        Constants$root.C_LONG$LAYOUT.withName("PartitionStyle"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Signature"),
                Constants$root.C_LONG$LAYOUT.withName("CheckSum")
            ).withName("Mbr"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("Data1"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                    Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                    MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
                ).withName("DiskId")
            ).withName("Gpt")
        ).withName("$anon$0")
    ).withName("_DISK_PARTITION_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DISK_PARTITION_INFO.$struct$LAYOUT;
    }
    static final VarHandle SizeOfPartitionInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SizeOfPartitionInfo"));
    public static VarHandle SizeOfPartitionInfo$VH() {
        return _DISK_PARTITION_INFO.SizeOfPartitionInfo$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfPartitionInfo;
     * }
     */
    public static int SizeOfPartitionInfo$get(MemorySegment seg) {
        return (int)_DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfPartitionInfo;
     * }
     */
    public static void SizeOfPartitionInfo$set(MemorySegment seg, int x) {
        _DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.set(seg, x);
    }
    public static int SizeOfPartitionInfo$get(MemorySegment seg, long index) {
        return (int)_DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfPartitionInfo$set(MemorySegment seg, long index, int x) {
        _DISK_PARTITION_INFO.SizeOfPartitionInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PartitionStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PartitionStyle"));
    public static VarHandle PartitionStyle$VH() {
        return _DISK_PARTITION_INFO.PartitionStyle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PARTITION_STYLE PartitionStyle;
     * }
     */
    public static int PartitionStyle$get(MemorySegment seg) {
        return (int)_DISK_PARTITION_INFO.PartitionStyle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PARTITION_STYLE PartitionStyle;
     * }
     */
    public static void PartitionStyle$set(MemorySegment seg, int x) {
        _DISK_PARTITION_INFO.PartitionStyle$VH.set(seg, x);
    }
    public static int PartitionStyle$get(MemorySegment seg, long index) {
        return (int)_DISK_PARTITION_INFO.PartitionStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PartitionStyle$set(MemorySegment seg, long index, int x) {
        _DISK_PARTITION_INFO.PartitionStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     DWORD Signature;
     *     DWORD CheckSum;
     * };
     * }
     */
    public static final class Mbr {

        // Suppresses default constructor, ensuring non-instantiability.
        private Mbr() {}
        static final StructLayout Mbr$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Signature"),
            Constants$root.C_LONG$LAYOUT.withName("CheckSum")
        );
        public static MemoryLayout $LAYOUT() {
            return Mbr.Mbr$struct$LAYOUT;
        }
        static final VarHandle Signature$VH = Mbr$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
        public static VarHandle Signature$VH() {
            return Mbr.Signature$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD Signature;
         * }
         */
        public static int Signature$get(MemorySegment seg) {
            return (int)Mbr.Signature$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD Signature;
         * }
         */
        public static void Signature$set(MemorySegment seg, int x) {
            Mbr.Signature$VH.set(seg, x);
        }
        public static int Signature$get(MemorySegment seg, long index) {
            return (int)Mbr.Signature$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void Signature$set(MemorySegment seg, long index, int x) {
            Mbr.Signature$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle CheckSum$VH = Mbr$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CheckSum"));
        public static VarHandle CheckSum$VH() {
            return Mbr.CheckSum$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD CheckSum;
         * }
         */
        public static int CheckSum$get(MemorySegment seg) {
            return (int)Mbr.CheckSum$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD CheckSum;
         * }
         */
        public static void CheckSum$set(MemorySegment seg, int x) {
            Mbr.CheckSum$VH.set(seg, x);
        }
        public static int CheckSum$get(MemorySegment seg, long index) {
            return (int)Mbr.CheckSum$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void CheckSum$set(MemorySegment seg, long index, int x) {
            Mbr.CheckSum$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Mbr$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    /**
     * {@snippet :
     * struct {
     *     GUID DiskId;
     * };
     * }
     */
    public static final class Gpt {

        // Suppresses default constructor, ensuring non-instantiability.
        private Gpt() {}
        static final StructLayout Gpt$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Data1"),
                Constants$root.C_SHORT$LAYOUT.withName("Data2"),
                Constants$root.C_SHORT$LAYOUT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
            ).withName("DiskId")
        );
        public static MemoryLayout $LAYOUT() {
            return Gpt.Gpt$struct$LAYOUT;
        }
        public static MemorySegment DiskId$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Gpt$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


