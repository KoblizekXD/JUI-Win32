// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESS_HEAP_ENTRY {
 *     PVOID lpData;
 *     DWORD cbData;
 *     BYTE cbOverhead;
 *     BYTE iRegionIndex;
 *     WORD wFlags;
 *     union {
 *         struct  Block;
 *         struct  Region;
 *     };
 * };
 * }
 */
public class _PROCESS_HEAP_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpData"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        Constants$root.C_CHAR$LAYOUT.withName("cbOverhead"),
        Constants$root.C_CHAR$LAYOUT.withName("iRegionIndex"),
        Constants$root.C_SHORT$LAYOUT.withName("wFlags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("hMem"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_LONG$LAYOUT).withName("dwReserved"),
                MemoryLayout.paddingLayout(32)
            ).withName("Block"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwCommittedSize"),
                Constants$root.C_LONG$LAYOUT.withName("dwUnCommittedSize"),
                Constants$root.C_POINTER$LAYOUT.withName("lpFirstBlock"),
                Constants$root.C_POINTER$LAYOUT.withName("lpLastBlock")
            ).withName("Region")
        ).withName("$anon$0")
    ).withName("_PROCESS_HEAP_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _PROCESS_HEAP_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle lpData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpData"));
    public static VarHandle lpData$VH() {
        return _PROCESS_HEAP_ENTRY.lpData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID lpData;
     * }
     */
    public static MemorySegment lpData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PROCESS_HEAP_ENTRY.lpData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID lpData;
     * }
     */
    public static void lpData$set(MemorySegment seg, MemorySegment x) {
        _PROCESS_HEAP_ENTRY.lpData$VH.set(seg, x);
    }
    public static MemorySegment lpData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PROCESS_HEAP_ENTRY.lpData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpData$set(MemorySegment seg, long index, MemorySegment x) {
        _PROCESS_HEAP_ENTRY.lpData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _PROCESS_HEAP_ENTRY.cbData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)_PROCESS_HEAP_ENTRY.cbData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        _PROCESS_HEAP_ENTRY.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)_PROCESS_HEAP_ENTRY.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        _PROCESS_HEAP_ENTRY.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbOverhead$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbOverhead"));
    public static VarHandle cbOverhead$VH() {
        return _PROCESS_HEAP_ENTRY.cbOverhead$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE cbOverhead;
     * }
     */
    public static byte cbOverhead$get(MemorySegment seg) {
        return (byte)_PROCESS_HEAP_ENTRY.cbOverhead$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE cbOverhead;
     * }
     */
    public static void cbOverhead$set(MemorySegment seg, byte x) {
        _PROCESS_HEAP_ENTRY.cbOverhead$VH.set(seg, x);
    }
    public static byte cbOverhead$get(MemorySegment seg, long index) {
        return (byte)_PROCESS_HEAP_ENTRY.cbOverhead$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbOverhead$set(MemorySegment seg, long index, byte x) {
        _PROCESS_HEAP_ENTRY.cbOverhead$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iRegionIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iRegionIndex"));
    public static VarHandle iRegionIndex$VH() {
        return _PROCESS_HEAP_ENTRY.iRegionIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE iRegionIndex;
     * }
     */
    public static byte iRegionIndex$get(MemorySegment seg) {
        return (byte)_PROCESS_HEAP_ENTRY.iRegionIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE iRegionIndex;
     * }
     */
    public static void iRegionIndex$set(MemorySegment seg, byte x) {
        _PROCESS_HEAP_ENTRY.iRegionIndex$VH.set(seg, x);
    }
    public static byte iRegionIndex$get(MemorySegment seg, long index) {
        return (byte)_PROCESS_HEAP_ENTRY.iRegionIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iRegionIndex$set(MemorySegment seg, long index, byte x) {
        _PROCESS_HEAP_ENTRY.iRegionIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFlags"));
    public static VarHandle wFlags$VH() {
        return _PROCESS_HEAP_ENTRY.wFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wFlags;
     * }
     */
    public static short wFlags$get(MemorySegment seg) {
        return (short)_PROCESS_HEAP_ENTRY.wFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wFlags;
     * }
     */
    public static void wFlags$set(MemorySegment seg, short x) {
        _PROCESS_HEAP_ENTRY.wFlags$VH.set(seg, x);
    }
    public static short wFlags$get(MemorySegment seg, long index) {
        return (short)_PROCESS_HEAP_ENTRY.wFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFlags$set(MemorySegment seg, long index, short x) {
        _PROCESS_HEAP_ENTRY.wFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *     HANDLE hMem;
     *     DWORD dwReserved[3];
     * };
     * }
     */
    public static final class Block {

        // Suppresses default constructor, ensuring non-instantiability.
        private Block() {}
        static final StructLayout Block$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hMem"),
            MemoryLayout.sequenceLayout(3, Constants$root.C_LONG$LAYOUT).withName("dwReserved"),
            MemoryLayout.paddingLayout(32)
        );
        public static MemoryLayout $LAYOUT() {
            return Block.Block$struct$LAYOUT;
        }
        static final VarHandle hMem$VH = Block$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hMem"));
        public static VarHandle hMem$VH() {
            return Block.hMem$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * HANDLE hMem;
         * }
         */
        public static MemorySegment hMem$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Block.hMem$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * HANDLE hMem;
         * }
         */
        public static void hMem$set(MemorySegment seg, MemorySegment x) {
            Block.hMem$VH.set(seg, x);
        }
        public static MemorySegment hMem$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Block.hMem$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void hMem$set(MemorySegment seg, long index, MemorySegment x) {
            Block.hMem$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment dwReserved$slice(MemorySegment seg) {
            return seg.asSlice(8, 12);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Block$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    /**
     * {@snippet :
     * struct {
     *     DWORD dwCommittedSize;
     *     DWORD dwUnCommittedSize;
     *     LPVOID lpFirstBlock;
     *     LPVOID lpLastBlock;
     * };
     * }
     */
    public static final class Region {

        // Suppresses default constructor, ensuring non-instantiability.
        private Region() {}
        static final StructLayout Region$struct$LAYOUT = MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwCommittedSize"),
            Constants$root.C_LONG$LAYOUT.withName("dwUnCommittedSize"),
            Constants$root.C_POINTER$LAYOUT.withName("lpFirstBlock"),
            Constants$root.C_POINTER$LAYOUT.withName("lpLastBlock")
        );
        public static MemoryLayout $LAYOUT() {
            return Region.Region$struct$LAYOUT;
        }
        static final VarHandle dwCommittedSize$VH = Region$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCommittedSize"));
        public static VarHandle dwCommittedSize$VH() {
            return Region.dwCommittedSize$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD dwCommittedSize;
         * }
         */
        public static int dwCommittedSize$get(MemorySegment seg) {
            return (int)Region.dwCommittedSize$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD dwCommittedSize;
         * }
         */
        public static void dwCommittedSize$set(MemorySegment seg, int x) {
            Region.dwCommittedSize$VH.set(seg, x);
        }
        public static int dwCommittedSize$get(MemorySegment seg, long index) {
            return (int)Region.dwCommittedSize$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwCommittedSize$set(MemorySegment seg, long index, int x) {
            Region.dwCommittedSize$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle dwUnCommittedSize$VH = Region$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwUnCommittedSize"));
        public static VarHandle dwUnCommittedSize$VH() {
            return Region.dwUnCommittedSize$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * DWORD dwUnCommittedSize;
         * }
         */
        public static int dwUnCommittedSize$get(MemorySegment seg) {
            return (int)Region.dwUnCommittedSize$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * DWORD dwUnCommittedSize;
         * }
         */
        public static void dwUnCommittedSize$set(MemorySegment seg, int x) {
            Region.dwUnCommittedSize$VH.set(seg, x);
        }
        public static int dwUnCommittedSize$get(MemorySegment seg, long index) {
            return (int)Region.dwUnCommittedSize$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void dwUnCommittedSize$set(MemorySegment seg, long index, int x) {
            Region.dwUnCommittedSize$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle lpFirstBlock$VH = Region$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpFirstBlock"));
        public static VarHandle lpFirstBlock$VH() {
            return Region.lpFirstBlock$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * LPVOID lpFirstBlock;
         * }
         */
        public static MemorySegment lpFirstBlock$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Region.lpFirstBlock$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * LPVOID lpFirstBlock;
         * }
         */
        public static void lpFirstBlock$set(MemorySegment seg, MemorySegment x) {
            Region.lpFirstBlock$VH.set(seg, x);
        }
        public static MemorySegment lpFirstBlock$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Region.lpFirstBlock$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void lpFirstBlock$set(MemorySegment seg, long index, MemorySegment x) {
            Region.lpFirstBlock$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle lpLastBlock$VH = Region$struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpLastBlock"));
        public static VarHandle lpLastBlock$VH() {
            return Region.lpLastBlock$VH;
        }
        /**
         * Getter for field:
         * {@snippet :
         * LPVOID lpLastBlock;
         * }
         */
        public static MemorySegment lpLastBlock$get(MemorySegment seg) {
            return (java.lang.foreign.MemorySegment)Region.lpLastBlock$VH.get(seg);
        }
        /**
         * Setter for field:
         * {@snippet :
         * LPVOID lpLastBlock;
         * }
         */
        public static void lpLastBlock$set(MemorySegment seg, MemorySegment x) {
            Region.lpLastBlock$VH.set(seg, x);
        }
        public static MemorySegment lpLastBlock$get(MemorySegment seg, long index) {
            return (java.lang.foreign.MemorySegment)Region.lpLastBlock$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void lpLastBlock$set(MemorySegment seg, long index, MemorySegment x) {
            Region.lpLastBlock$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment Region$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


