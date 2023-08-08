// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_EXTENSIONS {
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * };
 * }
 */
public class _CERT_EXTENSIONS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cExtension"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgExtension")
    ).withName("_CERT_EXTENSIONS");
    public static MemoryLayout $LAYOUT() {
        return _CERT_EXTENSIONS.$struct$LAYOUT;
    }
    static final VarHandle cExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
    public static VarHandle cExtension$VH() {
        return _CERT_EXTENSIONS.cExtension$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static int cExtension$get(MemorySegment seg) {
        return (int)_CERT_EXTENSIONS.cExtension$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static void cExtension$set(MemorySegment seg, int x) {
        _CERT_EXTENSIONS.cExtension$VH.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)_CERT_EXTENSIONS.cExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        _CERT_EXTENSIONS.cExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgExtension$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    public static VarHandle rgExtension$VH() {
        return _CERT_EXTENSIONS.rgExtension$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static MemorySegment rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CERT_EXTENSIONS.rgExtension$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static void rgExtension$set(MemorySegment seg, MemorySegment x) {
        _CERT_EXTENSIONS.rgExtension$VH.set(seg, x);
    }
    public static MemorySegment rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CERT_EXTENSIONS.rgExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemorySegment x) {
        _CERT_EXTENSIONS.rgExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


