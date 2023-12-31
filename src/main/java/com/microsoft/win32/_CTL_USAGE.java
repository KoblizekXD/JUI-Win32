// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CTL_USAGE {
 *     DWORD cUsageIdentifier;
 *     LPSTR* rgpszUsageIdentifier;
 * };
 * }
 */
public class _CTL_USAGE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cUsageIdentifier"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszUsageIdentifier")
    ).withName("_CTL_USAGE");
    public static MemoryLayout $LAYOUT() {
        return _CTL_USAGE.$struct$LAYOUT;
    }
    static final VarHandle cUsageIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cUsageIdentifier"));
    public static VarHandle cUsageIdentifier$VH() {
        return _CTL_USAGE.cUsageIdentifier$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cUsageIdentifier;
     * }
     */
    public static int cUsageIdentifier$get(MemorySegment seg) {
        return (int)_CTL_USAGE.cUsageIdentifier$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cUsageIdentifier;
     * }
     */
    public static void cUsageIdentifier$set(MemorySegment seg, int x) {
        _CTL_USAGE.cUsageIdentifier$VH.set(seg, x);
    }
    public static int cUsageIdentifier$get(MemorySegment seg, long index) {
        return (int)_CTL_USAGE.cUsageIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cUsageIdentifier$set(MemorySegment seg, long index, int x) {
        _CTL_USAGE.cUsageIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszUsageIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszUsageIdentifier"));
    public static VarHandle rgpszUsageIdentifier$VH() {
        return _CTL_USAGE.rgpszUsageIdentifier$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR* rgpszUsageIdentifier;
     * }
     */
    public static MemorySegment rgpszUsageIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CTL_USAGE.rgpszUsageIdentifier$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR* rgpszUsageIdentifier;
     * }
     */
    public static void rgpszUsageIdentifier$set(MemorySegment seg, MemorySegment x) {
        _CTL_USAGE.rgpszUsageIdentifier$VH.set(seg, x);
    }
    public static MemorySegment rgpszUsageIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CTL_USAGE.rgpszUsageIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszUsageIdentifier$set(MemorySegment seg, long index, MemorySegment x) {
        _CTL_USAGE.rgpszUsageIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


