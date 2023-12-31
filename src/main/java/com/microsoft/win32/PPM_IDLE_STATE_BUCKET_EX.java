// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD64 TotalTimeUs;
 *     DWORD MinTimeUs;
 *     DWORD MaxTimeUs;
 *     DWORD Count;
 * };
 * }
 */
public class PPM_IDLE_STATE_BUCKET_EX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("TotalTimeUs"),
        Constants$root.C_LONG$LAYOUT.withName("MinTimeUs"),
        Constants$root.C_LONG$LAYOUT.withName("MaxTimeUs"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return PPM_IDLE_STATE_BUCKET_EX.$struct$LAYOUT;
    }
    static final VarHandle TotalTimeUs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TotalTimeUs"));
    public static VarHandle TotalTimeUs$VH() {
        return PPM_IDLE_STATE_BUCKET_EX.TotalTimeUs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 TotalTimeUs;
     * }
     */
    public static long TotalTimeUs$get(MemorySegment seg) {
        return (long)PPM_IDLE_STATE_BUCKET_EX.TotalTimeUs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 TotalTimeUs;
     * }
     */
    public static void TotalTimeUs$set(MemorySegment seg, long x) {
        PPM_IDLE_STATE_BUCKET_EX.TotalTimeUs$VH.set(seg, x);
    }
    public static long TotalTimeUs$get(MemorySegment seg, long index) {
        return (long)PPM_IDLE_STATE_BUCKET_EX.TotalTimeUs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalTimeUs$set(MemorySegment seg, long index, long x) {
        PPM_IDLE_STATE_BUCKET_EX.TotalTimeUs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinTimeUs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinTimeUs"));
    public static VarHandle MinTimeUs$VH() {
        return PPM_IDLE_STATE_BUCKET_EX.MinTimeUs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MinTimeUs;
     * }
     */
    public static int MinTimeUs$get(MemorySegment seg) {
        return (int)PPM_IDLE_STATE_BUCKET_EX.MinTimeUs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MinTimeUs;
     * }
     */
    public static void MinTimeUs$set(MemorySegment seg, int x) {
        PPM_IDLE_STATE_BUCKET_EX.MinTimeUs$VH.set(seg, x);
    }
    public static int MinTimeUs$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_STATE_BUCKET_EX.MinTimeUs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinTimeUs$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_STATE_BUCKET_EX.MinTimeUs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MaxTimeUs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MaxTimeUs"));
    public static VarHandle MaxTimeUs$VH() {
        return PPM_IDLE_STATE_BUCKET_EX.MaxTimeUs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxTimeUs;
     * }
     */
    public static int MaxTimeUs$get(MemorySegment seg) {
        return (int)PPM_IDLE_STATE_BUCKET_EX.MaxTimeUs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxTimeUs;
     * }
     */
    public static void MaxTimeUs$set(MemorySegment seg, int x) {
        PPM_IDLE_STATE_BUCKET_EX.MaxTimeUs$VH.set(seg, x);
    }
    public static int MaxTimeUs$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_STATE_BUCKET_EX.MaxTimeUs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxTimeUs$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_STATE_BUCKET_EX.MaxTimeUs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return PPM_IDLE_STATE_BUCKET_EX.Count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)PPM_IDLE_STATE_BUCKET_EX.Count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        PPM_IDLE_STATE_BUCKET_EX.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)PPM_IDLE_STATE_BUCKET_EX.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        PPM_IDLE_STATE_BUCKET_EX.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


