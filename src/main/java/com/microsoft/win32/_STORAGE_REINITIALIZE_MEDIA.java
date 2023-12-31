// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_REINITIALIZE_MEDIA {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD TimeoutInSeconds;
 *     struct  SanitizeOption;
 * };
 * }
 */
public class _STORAGE_REINITIALIZE_MEDIA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("TimeoutInSeconds"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(32)
        ).withName("SanitizeOption")
    ).withName("_STORAGE_REINITIALIZE_MEDIA");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_REINITIALIZE_MEDIA.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_REINITIALIZE_MEDIA.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_REINITIALIZE_MEDIA.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _STORAGE_REINITIALIZE_MEDIA.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_REINITIALIZE_MEDIA.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_REINITIALIZE_MEDIA.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_REINITIALIZE_MEDIA.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_REINITIALIZE_MEDIA.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _STORAGE_REINITIALIZE_MEDIA.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_REINITIALIZE_MEDIA.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_REINITIALIZE_MEDIA.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeoutInSeconds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TimeoutInSeconds"));
    public static VarHandle TimeoutInSeconds$VH() {
        return _STORAGE_REINITIALIZE_MEDIA.TimeoutInSeconds$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeoutInSeconds;
     * }
     */
    public static int TimeoutInSeconds$get(MemorySegment seg) {
        return (int)_STORAGE_REINITIALIZE_MEDIA.TimeoutInSeconds$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeoutInSeconds;
     * }
     */
    public static void TimeoutInSeconds$set(MemorySegment seg, int x) {
        _STORAGE_REINITIALIZE_MEDIA.TimeoutInSeconds$VH.set(seg, x);
    }
    public static int TimeoutInSeconds$get(MemorySegment seg, long index) {
        return (int)_STORAGE_REINITIALIZE_MEDIA.TimeoutInSeconds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeoutInSeconds$set(MemorySegment seg, long index, int x) {
        _STORAGE_REINITIALIZE_MEDIA.TimeoutInSeconds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *          *     DWORD SanitizeMethod;
     *     DWORD DisallowUnrestrictedSanitizeExit;
     *     DWORD Reserved;
     * };
     * }
     */
    public static final class SanitizeOption {

        // Suppresses default constructor, ensuring non-instantiability.
        private SanitizeOption() {}
        static final StructLayout SanitizeOption$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(32)
        );
        public static MemoryLayout $LAYOUT() {
            return SanitizeOption.SanitizeOption$struct$LAYOUT;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment SanitizeOption$slice(MemorySegment seg) {
        return seg.asSlice(12, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


