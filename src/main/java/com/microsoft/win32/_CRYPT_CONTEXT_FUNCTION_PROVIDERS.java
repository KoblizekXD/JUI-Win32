// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_CONTEXT_FUNCTION_PROVIDERS {
 *     ULONG cProviders;
 *     PWSTR* rgpszProviders;
 * };
 * }
 */
public class _CRYPT_CONTEXT_FUNCTION_PROVIDERS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cProviders"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszProviders")
    ).withName("_CRYPT_CONTEXT_FUNCTION_PROVIDERS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_CONTEXT_FUNCTION_PROVIDERS.$struct$LAYOUT;
    }
    static final VarHandle cProviders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cProviders"));
    public static VarHandle cProviders$VH() {
        return _CRYPT_CONTEXT_FUNCTION_PROVIDERS.cProviders$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cProviders;
     * }
     */
    public static int cProviders$get(MemorySegment seg) {
        return (int)_CRYPT_CONTEXT_FUNCTION_PROVIDERS.cProviders$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cProviders;
     * }
     */
    public static void cProviders$set(MemorySegment seg, int x) {
        _CRYPT_CONTEXT_FUNCTION_PROVIDERS.cProviders$VH.set(seg, x);
    }
    public static int cProviders$get(MemorySegment seg, long index) {
        return (int)_CRYPT_CONTEXT_FUNCTION_PROVIDERS.cProviders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cProviders$set(MemorySegment seg, long index, int x) {
        _CRYPT_CONTEXT_FUNCTION_PROVIDERS.cProviders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszProviders$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszProviders"));
    public static VarHandle rgpszProviders$VH() {
        return _CRYPT_CONTEXT_FUNCTION_PROVIDERS.rgpszProviders$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR* rgpszProviders;
     * }
     */
    public static MemorySegment rgpszProviders$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CONTEXT_FUNCTION_PROVIDERS.rgpszProviders$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR* rgpszProviders;
     * }
     */
    public static void rgpszProviders$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_CONTEXT_FUNCTION_PROVIDERS.rgpszProviders$VH.set(seg, x);
    }
    public static MemorySegment rgpszProviders$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_CONTEXT_FUNCTION_PROVIDERS.rgpszProviders$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszProviders$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_CONTEXT_FUNCTION_PROVIDERS.rgpszProviders$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


