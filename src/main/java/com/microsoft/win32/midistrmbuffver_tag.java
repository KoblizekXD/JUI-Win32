// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct midistrmbuffver_tag {
 *     DWORD dwVersion;
 *     DWORD dwMid;
 *     DWORD dwOEMVersion;
 * };
 * }
 */
public class midistrmbuffver_tag {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwMid"),
        Constants$root.C_LONG$LAYOUT.withName("dwOEMVersion")
    ).withName("midistrmbuffver_tag");
    public static MemoryLayout $LAYOUT() {
        return midistrmbuffver_tag.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return midistrmbuffver_tag.dwVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)midistrmbuffver_tag.dwVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        midistrmbuffver_tag.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)midistrmbuffver_tag.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        midistrmbuffver_tag.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMid"));
    public static VarHandle dwMid$VH() {
        return midistrmbuffver_tag.dwMid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMid;
     * }
     */
    public static int dwMid$get(MemorySegment seg) {
        return (int)midistrmbuffver_tag.dwMid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMid;
     * }
     */
    public static void dwMid$set(MemorySegment seg, int x) {
        midistrmbuffver_tag.dwMid$VH.set(seg, x);
    }
    public static int dwMid$get(MemorySegment seg, long index) {
        return (int)midistrmbuffver_tag.dwMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMid$set(MemorySegment seg, long index, int x) {
        midistrmbuffver_tag.dwMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOEMVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOEMVersion"));
    public static VarHandle dwOEMVersion$VH() {
        return midistrmbuffver_tag.dwOEMVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOEMVersion;
     * }
     */
    public static int dwOEMVersion$get(MemorySegment seg) {
        return (int)midistrmbuffver_tag.dwOEMVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOEMVersion;
     * }
     */
    public static void dwOEMVersion$set(MemorySegment seg, int x) {
        midistrmbuffver_tag.dwOEMVersion$VH.set(seg, x);
    }
    public static int dwOEMVersion$get(MemorySegment seg, long index) {
        return (int)midistrmbuffver_tag.dwOEMVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOEMVersion$set(MemorySegment seg, long index, int x) {
        midistrmbuffver_tag.dwOEMVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


