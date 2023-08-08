// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct val_context {
 *     int valuelen;
 *     LPVOID value_context;
 *     LPVOID val_buff_ptr;
 * };
 * }
 */
public class val_context {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("valuelen"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("value_context"),
        Constants$root.C_POINTER$LAYOUT.withName("val_buff_ptr")
    ).withName("val_context");
    public static MemoryLayout $LAYOUT() {
        return val_context.$struct$LAYOUT;
    }
    static final VarHandle valuelen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("valuelen"));
    public static VarHandle valuelen$VH() {
        return val_context.valuelen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int valuelen;
     * }
     */
    public static int valuelen$get(MemorySegment seg) {
        return (int)val_context.valuelen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int valuelen;
     * }
     */
    public static void valuelen$set(MemorySegment seg, int x) {
        val_context.valuelen$VH.set(seg, x);
    }
    public static int valuelen$get(MemorySegment seg, long index) {
        return (int)val_context.valuelen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void valuelen$set(MemorySegment seg, long index, int x) {
        val_context.valuelen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value_context$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_context"));
    public static VarHandle value_context$VH() {
        return val_context.value_context$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID value_context;
     * }
     */
    public static MemorySegment value_context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)val_context.value_context$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID value_context;
     * }
     */
    public static void value_context$set(MemorySegment seg, MemorySegment x) {
        val_context.value_context$VH.set(seg, x);
    }
    public static MemorySegment value_context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)val_context.value_context$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_context$set(MemorySegment seg, long index, MemorySegment x) {
        val_context.value_context$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle val_buff_ptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("val_buff_ptr"));
    public static VarHandle val_buff_ptr$VH() {
        return val_context.val_buff_ptr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID val_buff_ptr;
     * }
     */
    public static MemorySegment val_buff_ptr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)val_context.val_buff_ptr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID val_buff_ptr;
     * }
     */
    public static void val_buff_ptr$set(MemorySegment seg, MemorySegment x) {
        val_context.val_buff_ptr$VH.set(seg, x);
    }
    public static MemorySegment val_buff_ptr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)val_context.val_buff_ptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void val_buff_ptr$set(MemorySegment seg, long index, MemorySegment x) {
        val_context.val_buff_ptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

