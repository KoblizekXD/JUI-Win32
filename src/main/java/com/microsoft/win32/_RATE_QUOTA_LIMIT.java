// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _RATE_QUOTA_LIMIT {
 *     DWORD RateData;
 *     struct {
 *          *         DWORD RatePercent;
 *         DWORD Reserved0;
 *     };
 * };
 * }
 */
public class _RATE_QUOTA_LIMIT {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_LONG$LAYOUT.withName("RateData"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(32)
        ).withName("$anon$0")
    ).withName("_RATE_QUOTA_LIMIT");
    public static MemoryLayout $LAYOUT() {
        return _RATE_QUOTA_LIMIT.$union$LAYOUT;
    }
    static final VarHandle RateData$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RateData"));
    public static VarHandle RateData$VH() {
        return _RATE_QUOTA_LIMIT.RateData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RateData;
     * }
     */
    public static int RateData$get(MemorySegment seg) {
        return (int)_RATE_QUOTA_LIMIT.RateData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RateData;
     * }
     */
    public static void RateData$set(MemorySegment seg, int x) {
        _RATE_QUOTA_LIMIT.RateData$VH.set(seg, x);
    }
    public static int RateData$get(MemorySegment seg, long index) {
        return (int)_RATE_QUOTA_LIMIT.RateData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RateData$set(MemorySegment seg, long index, int x) {
        _RATE_QUOTA_LIMIT.RateData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

