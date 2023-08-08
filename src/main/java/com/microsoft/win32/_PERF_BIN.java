// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PERF_BIN {
 *     DWORD NumberOfBins;
 *     DWORD TypeOfBin;
 *     BIN_RANGE BinsRanges[1];
 * };
 * }
 */
public class _PERF_BIN {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfBins"),
        Constants$root.C_LONG$LAYOUT.withName("TypeOfBin"),
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
            ).withName("StartValue"),
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
            ).withName("Length")
        ).withName("_BIN_RANGE")).withName("BinsRanges")
    ).withName("_PERF_BIN");
    public static MemoryLayout $LAYOUT() {
        return _PERF_BIN.$struct$LAYOUT;
    }
    static final VarHandle NumberOfBins$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfBins"));
    public static VarHandle NumberOfBins$VH() {
        return _PERF_BIN.NumberOfBins$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfBins;
     * }
     */
    public static int NumberOfBins$get(MemorySegment seg) {
        return (int)_PERF_BIN.NumberOfBins$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfBins;
     * }
     */
    public static void NumberOfBins$set(MemorySegment seg, int x) {
        _PERF_BIN.NumberOfBins$VH.set(seg, x);
    }
    public static int NumberOfBins$get(MemorySegment seg, long index) {
        return (int)_PERF_BIN.NumberOfBins$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBins$set(MemorySegment seg, long index, int x) {
        _PERF_BIN.NumberOfBins$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TypeOfBin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TypeOfBin"));
    public static VarHandle TypeOfBin$VH() {
        return _PERF_BIN.TypeOfBin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TypeOfBin;
     * }
     */
    public static int TypeOfBin$get(MemorySegment seg) {
        return (int)_PERF_BIN.TypeOfBin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TypeOfBin;
     * }
     */
    public static void TypeOfBin$set(MemorySegment seg, int x) {
        _PERF_BIN.TypeOfBin$VH.set(seg, x);
    }
    public static int TypeOfBin$get(MemorySegment seg, long index) {
        return (int)_PERF_BIN.TypeOfBin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TypeOfBin$set(MemorySegment seg, long index, int x) {
        _PERF_BIN.TypeOfBin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BinsRanges$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


