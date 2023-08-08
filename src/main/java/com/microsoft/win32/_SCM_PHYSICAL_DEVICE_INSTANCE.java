// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_PHYSICAL_DEVICE_INSTANCE {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD NfitHandle;
 *     WCHAR SymbolicLink[256];
 * };
 * }
 */
public class _SCM_PHYSICAL_DEVICE_INSTANCE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("NfitHandle"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_SHORT$LAYOUT).withName("SymbolicLink")
    ).withName("_SCM_PHYSICAL_DEVICE_INSTANCE");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PHYSICAL_DEVICE_INSTANCE.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PHYSICAL_DEVICE_INSTANCE.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PHYSICAL_DEVICE_INSTANCE.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _SCM_PHYSICAL_DEVICE_INSTANCE.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PHYSICAL_DEVICE_INSTANCE.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PHYSICAL_DEVICE_INSTANCE.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PHYSICAL_DEVICE_INSTANCE.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PHYSICAL_DEVICE_INSTANCE.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCM_PHYSICAL_DEVICE_INSTANCE.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PHYSICAL_DEVICE_INSTANCE.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PHYSICAL_DEVICE_INSTANCE.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NfitHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NfitHandle"));
    public static VarHandle NfitHandle$VH() {
        return _SCM_PHYSICAL_DEVICE_INSTANCE.NfitHandle$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NfitHandle;
     * }
     */
    public static int NfitHandle$get(MemorySegment seg) {
        return (int)_SCM_PHYSICAL_DEVICE_INSTANCE.NfitHandle$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NfitHandle;
     * }
     */
    public static void NfitHandle$set(MemorySegment seg, int x) {
        _SCM_PHYSICAL_DEVICE_INSTANCE.NfitHandle$VH.set(seg, x);
    }
    public static int NfitHandle$get(MemorySegment seg, long index) {
        return (int)_SCM_PHYSICAL_DEVICE_INSTANCE.NfitHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NfitHandle$set(MemorySegment seg, long index, int x) {
        _SCM_PHYSICAL_DEVICE_INSTANCE.NfitHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SymbolicLink$slice(MemorySegment seg) {
        return seg.asSlice(12, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


