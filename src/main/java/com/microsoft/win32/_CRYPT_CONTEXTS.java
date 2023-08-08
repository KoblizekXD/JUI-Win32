// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_CONTEXTS {
 *     ULONG cContexts;
 *     PWSTR* rgpszContexts;
 * };
 * }
 */
public class _CRYPT_CONTEXTS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cContexts"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszContexts")
    ).withName("_CRYPT_CONTEXTS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_CONTEXTS.$struct$LAYOUT;
    }
    static final VarHandle cContexts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cContexts"));
    public static VarHandle cContexts$VH() {
        return _CRYPT_CONTEXTS.cContexts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cContexts;
     * }
     */
    public static int cContexts$get(MemorySegment seg) {
        return (int)_CRYPT_CONTEXTS.cContexts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cContexts;
     * }
     */
    public static void cContexts$set(MemorySegment seg, int x) {
        _CRYPT_CONTEXTS.cContexts$VH.set(seg, x);
    }
    public static int cContexts$get(MemorySegment seg, long index) {
        return (int)_CRYPT_CONTEXTS.cContexts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cContexts$set(MemorySegment seg, long index, int x) {
        _CRYPT_CONTEXTS.cContexts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszContexts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszContexts"));
    public static VarHandle rgpszContexts$VH() {
        return _CRYPT_CONTEXTS.rgpszContexts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR* rgpszContexts;
     * }
     */
    public static MemorySegment rgpszContexts$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CONTEXTS.rgpszContexts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR* rgpszContexts;
     * }
     */
    public static void rgpszContexts$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_CONTEXTS.rgpszContexts$VH.set(seg, x);
    }
    public static MemorySegment rgpszContexts$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CONTEXTS.rgpszContexts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszContexts$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_CONTEXTS.rgpszContexts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


