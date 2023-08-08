// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BIN_COUNT {
 *     BIN_RANGE BinRange;
 *     DWORD BinCount;
 * };
 * }
 */
public class _BIN_COUNT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
        ).withName("BinRange"),
        Constants$root.C_LONG$LAYOUT.withName("BinCount"),
        MemoryLayout.paddingLayout(32)
    ).withName("_BIN_COUNT");
    public static MemoryLayout $LAYOUT() {
        return _BIN_COUNT.$struct$LAYOUT;
    }
    public static MemorySegment BinRange$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle BinCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BinCount"));
    public static VarHandle BinCount$VH() {
        return _BIN_COUNT.BinCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BinCount;
     * }
     */
    public static int BinCount$get(MemorySegment seg) {
        return (int)_BIN_COUNT.BinCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BinCount;
     * }
     */
    public static void BinCount$set(MemorySegment seg, int x) {
        _BIN_COUNT.BinCount$VH.set(seg, x);
    }
    public static int BinCount$get(MemorySegment seg, long index) {
        return (int)_BIN_COUNT.BinCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BinCount$set(MemorySegment seg, long index, int x) {
        _BIN_COUNT.BinCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


