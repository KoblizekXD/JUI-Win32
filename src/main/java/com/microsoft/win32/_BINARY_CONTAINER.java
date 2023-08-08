// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BINARY_CONTAINER {
 *     DWORD cbBuf;
 *     LPBYTE pData;
 * };
 * }
 */
public class _BINARY_CONTAINER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbBuf"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pData")
    ).withName("_BINARY_CONTAINER");
    public static MemoryLayout $LAYOUT() {
        return _BINARY_CONTAINER.$struct$LAYOUT;
    }
    static final VarHandle cbBuf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbBuf"));
    public static VarHandle cbBuf$VH() {
        return _BINARY_CONTAINER.cbBuf$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbBuf;
     * }
     */
    public static int cbBuf$get(MemorySegment seg) {
        return (int)_BINARY_CONTAINER.cbBuf$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbBuf;
     * }
     */
    public static void cbBuf$set(MemorySegment seg, int x) {
        _BINARY_CONTAINER.cbBuf$VH.set(seg, x);
    }
    public static int cbBuf$get(MemorySegment seg, long index) {
        return (int)_BINARY_CONTAINER.cbBuf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBuf$set(MemorySegment seg, long index, int x) {
        _BINARY_CONTAINER.cbBuf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pData"));
    public static VarHandle pData$VH() {
        return _BINARY_CONTAINER.pData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPBYTE pData;
     * }
     */
    public static MemorySegment pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_BINARY_CONTAINER.pData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPBYTE pData;
     * }
     */
    public static void pData$set(MemorySegment seg, MemorySegment x) {
        _BINARY_CONTAINER.pData$VH.set(seg, x);
    }
    public static MemorySegment pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_BINARY_CONTAINER.pData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemorySegment x) {
        _BINARY_CONTAINER.pData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

