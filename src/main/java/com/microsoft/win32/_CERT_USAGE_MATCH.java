// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_USAGE_MATCH {
 *     DWORD dwType;
 *     CERT_ENHKEY_USAGE Usage;
 * };
 * }
 */
public class _CERT_USAGE_MATCH {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cUsageIdentifier"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("rgpszUsageIdentifier")
        ).withName("Usage")
    ).withName("_CERT_USAGE_MATCH");
    public static MemoryLayout $LAYOUT() {
        return _CERT_USAGE_MATCH.$struct$LAYOUT;
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return _CERT_USAGE_MATCH.dwType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static int dwType$get(MemorySegment seg) {
        return (int)_CERT_USAGE_MATCH.dwType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static void dwType$set(MemorySegment seg, int x) {
        _CERT_USAGE_MATCH.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)_CERT_USAGE_MATCH.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        _CERT_USAGE_MATCH.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Usage$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


