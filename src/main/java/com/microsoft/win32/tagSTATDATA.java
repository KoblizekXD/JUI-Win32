// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagSTATDATA {
 *     FORMATETC formatetc;
 *     DWORD advf;
 *     IAdviseSink* pAdvSink;
 *     DWORD dwConnection;
 * };
 * }
 */
public class tagSTATDATA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("cfFormat"),
            MemoryLayout.paddingLayout(48),
            Constants$root.C_POINTER$LAYOUT.withName("ptd"),
            Constants$root.C_LONG$LAYOUT.withName("dwAspect"),
            Constants$root.C_LONG$LAYOUT.withName("lindex"),
            Constants$root.C_LONG$LAYOUT.withName("tymed"),
            MemoryLayout.paddingLayout(32)
        ).withName("formatetc"),
        Constants$root.C_LONG$LAYOUT.withName("advf"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pAdvSink"),
        Constants$root.C_LONG$LAYOUT.withName("dwConnection"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagSTATDATA");
    public static MemoryLayout $LAYOUT() {
        return tagSTATDATA.$struct$LAYOUT;
    }
    public static MemorySegment formatetc$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle advf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("advf"));
    public static VarHandle advf$VH() {
        return tagSTATDATA.advf$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD advf;
     * }
     */
    public static int advf$get(MemorySegment seg) {
        return (int)tagSTATDATA.advf$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD advf;
     * }
     */
    public static void advf$set(MemorySegment seg, int x) {
        tagSTATDATA.advf$VH.set(seg, x);
    }
    public static int advf$get(MemorySegment seg, long index) {
        return (int)tagSTATDATA.advf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void advf$set(MemorySegment seg, long index, int x) {
        tagSTATDATA.advf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pAdvSink$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pAdvSink"));
    public static VarHandle pAdvSink$VH() {
        return tagSTATDATA.pAdvSink$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * IAdviseSink* pAdvSink;
     * }
     */
    public static MemorySegment pAdvSink$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagSTATDATA.pAdvSink$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * IAdviseSink* pAdvSink;
     * }
     */
    public static void pAdvSink$set(MemorySegment seg, MemorySegment x) {
        tagSTATDATA.pAdvSink$VH.set(seg, x);
    }
    public static MemorySegment pAdvSink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagSTATDATA.pAdvSink$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pAdvSink$set(MemorySegment seg, long index, MemorySegment x) {
        tagSTATDATA.pAdvSink$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwConnection$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwConnection"));
    public static VarHandle dwConnection$VH() {
        return tagSTATDATA.dwConnection$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwConnection;
     * }
     */
    public static int dwConnection$get(MemorySegment seg) {
        return (int)tagSTATDATA.dwConnection$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwConnection;
     * }
     */
    public static void dwConnection$set(MemorySegment seg, int x) {
        tagSTATDATA.dwConnection$VH.set(seg, x);
    }
    public static int dwConnection$get(MemorySegment seg, long index) {
        return (int)tagSTATDATA.dwConnection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwConnection$set(MemorySegment seg, long index, int x) {
        tagSTATDATA.dwConnection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

