// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE {
 *     DWORD cbSize;
 *     PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET pfnGet;
 *     PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE pfnRelease;
 *     PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD pfnFreePassword;
 *     PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE pfnFree;
 *     PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER pfnFreeIdentifier;
 * };
 * }
 */
public class _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pfnGet"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnRelease"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFreePassword"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFree"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnFreeIdentifier")
    ).withName("_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnGet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnGet"));
    public static VarHandle pfnGet$VH() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnGet$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET pfnGet;
     * }
     */
    public static MemorySegment pfnGet$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnGet$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET pfnGet;
     * }
     */
    public static void pfnGet$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnGet$VH.set(seg, x);
    }
    public static MemorySegment pfnGet$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnGet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnGet$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnGet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET pfnGet(MemorySegment segment, SegmentScope scope) {
        return PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_GET.ofAddress(pfnGet$get(segment), scope);
    }
    static final VarHandle pfnRelease$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnRelease"));
    public static VarHandle pfnRelease$VH() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnRelease$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE pfnRelease;
     * }
     */
    public static MemorySegment pfnRelease$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnRelease$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE pfnRelease;
     * }
     */
    public static void pfnRelease$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnRelease$VH.set(seg, x);
    }
    public static MemorySegment pfnRelease$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnRelease$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnRelease$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnRelease$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE pfnRelease(MemorySegment segment, SegmentScope scope) {
        return PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_RELEASE.ofAddress(pfnRelease$get(segment), scope);
    }
    static final VarHandle pfnFreePassword$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFreePassword"));
    public static VarHandle pfnFreePassword$VH() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreePassword$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD pfnFreePassword;
     * }
     */
    public static MemorySegment pfnFreePassword$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreePassword$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD pfnFreePassword;
     * }
     */
    public static void pfnFreePassword$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreePassword$VH.set(seg, x);
    }
    public static MemorySegment pfnFreePassword$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreePassword$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFreePassword$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreePassword$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD pfnFreePassword(MemorySegment segment, SegmentScope scope) {
        return PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_PASSWORD.ofAddress(pfnFreePassword$get(segment), scope);
    }
    static final VarHandle pfnFree$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    public static VarHandle pfnFree$VH() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFree$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE pfnFree;
     * }
     */
    public static MemorySegment pfnFree$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFree$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE pfnFree;
     * }
     */
    public static void pfnFree$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFree$VH.set(seg, x);
    }
    public static MemorySegment pfnFree$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE pfnFree(MemorySegment segment, SegmentScope scope) {
        return PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE.ofAddress(pfnFree$get(segment), scope);
    }
    static final VarHandle pfnFreeIdentifier$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnFreeIdentifier"));
    public static VarHandle pfnFreeIdentifier$VH() {
        return _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreeIdentifier$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER pfnFreeIdentifier;
     * }
     */
    public static MemorySegment pfnFreeIdentifier$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreeIdentifier$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER pfnFreeIdentifier;
     * }
     */
    public static void pfnFreeIdentifier$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreeIdentifier$VH.set(seg, x);
    }
    public static MemorySegment pfnFreeIdentifier$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreeIdentifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFreeIdentifier$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_OBJECT_LOCATOR_PROVIDER_TABLE.pfnFreeIdentifier$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER pfnFreeIdentifier(MemorySegment segment, SegmentScope scope) {
        return PFN_CRYPT_OBJECT_LOCATOR_PROVIDER_FREE_IDENTIFIER.ofAddress(pfnFreeIdentifier$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


