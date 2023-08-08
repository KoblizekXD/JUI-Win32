// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct LIST_ENTRY32 {
 *     DWORD Flink;
 *     DWORD Blink;
 * };
 * }
 */
public class LIST_ENTRY32 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flink"),
        Constants$root.C_LONG$LAYOUT.withName("Blink")
    ).withName("LIST_ENTRY32");
    public static MemoryLayout $LAYOUT() {
        return LIST_ENTRY32.$struct$LAYOUT;
    }
    static final VarHandle Flink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flink"));
    public static VarHandle Flink$VH() {
        return LIST_ENTRY32.Flink$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flink;
     * }
     */
    public static int Flink$get(MemorySegment seg) {
        return (int)LIST_ENTRY32.Flink$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flink;
     * }
     */
    public static void Flink$set(MemorySegment seg, int x) {
        LIST_ENTRY32.Flink$VH.set(seg, x);
    }
    public static int Flink$get(MemorySegment seg, long index) {
        return (int)LIST_ENTRY32.Flink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flink$set(MemorySegment seg, long index, int x) {
        LIST_ENTRY32.Flink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Blink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Blink"));
    public static VarHandle Blink$VH() {
        return LIST_ENTRY32.Blink$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Blink;
     * }
     */
    public static int Blink$get(MemorySegment seg) {
        return (int)LIST_ENTRY32.Blink$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Blink;
     * }
     */
    public static void Blink$set(MemorySegment seg, int x) {
        LIST_ENTRY32.Blink$VH.set(seg, x);
    }
    public static int Blink$get(MemorySegment seg, long index) {
        return (int)LIST_ENTRY32.Blink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Blink$set(MemorySegment seg, long index, int x) {
        LIST_ENTRY32.Blink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


