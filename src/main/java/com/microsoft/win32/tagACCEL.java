// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagACCEL {
 *     BYTE fVirt;
 *     WORD key;
 *     WORD cmd;
 * };
 * }
 */
public class tagACCEL {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("fVirt"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_SHORT$LAYOUT.withName("key"),
        Constants$root.C_SHORT$LAYOUT.withName("cmd")
    ).withName("tagACCEL");
    public static MemoryLayout $LAYOUT() {
        return tagACCEL.$struct$LAYOUT;
    }
    static final VarHandle fVirt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fVirt"));
    public static VarHandle fVirt$VH() {
        return tagACCEL.fVirt$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE fVirt;
     * }
     */
    public static byte fVirt$get(MemorySegment seg) {
        return (byte)tagACCEL.fVirt$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE fVirt;
     * }
     */
    public static void fVirt$set(MemorySegment seg, byte x) {
        tagACCEL.fVirt$VH.set(seg, x);
    }
    public static byte fVirt$get(MemorySegment seg, long index) {
        return (byte)tagACCEL.fVirt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fVirt$set(MemorySegment seg, long index, byte x) {
        tagACCEL.fVirt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key"));
    public static VarHandle key$VH() {
        return tagACCEL.key$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD key;
     * }
     */
    public static short key$get(MemorySegment seg) {
        return (short)tagACCEL.key$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD key;
     * }
     */
    public static void key$set(MemorySegment seg, short x) {
        tagACCEL.key$VH.set(seg, x);
    }
    public static short key$get(MemorySegment seg, long index) {
        return (short)tagACCEL.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, short x) {
        tagACCEL.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cmd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cmd"));
    public static VarHandle cmd$VH() {
        return tagACCEL.cmd$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD cmd;
     * }
     */
    public static short cmd$get(MemorySegment seg) {
        return (short)tagACCEL.cmd$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD cmd;
     * }
     */
    public static void cmd$set(MemorySegment seg, short x) {
        tagACCEL.cmd$VH.set(seg, x);
    }
    public static short cmd$get(MemorySegment seg, long index) {
        return (short)tagACCEL.cmd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cmd$set(MemorySegment seg, long index, short x) {
        tagACCEL.cmd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


