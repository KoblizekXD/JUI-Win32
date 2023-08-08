// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTPROCESSOR_CAPS_1 {
 *     DWORD dwLevel;
 *     DWORD dwNupOptions;
 *     DWORD dwPageOrderFlags;
 *     DWORD dwNumberOfCopies;
 * };
 * }
 */
public class _PRINTPROCESSOR_CAPS_1 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwLevel"),
        Constants$root.C_LONG$LAYOUT.withName("dwNupOptions"),
        Constants$root.C_LONG$LAYOUT.withName("dwPageOrderFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfCopies")
    ).withName("_PRINTPROCESSOR_CAPS_1");
    public static MemoryLayout $LAYOUT() {
        return _PRINTPROCESSOR_CAPS_1.$struct$LAYOUT;
    }
    static final VarHandle dwLevel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLevel"));
    public static VarHandle dwLevel$VH() {
        return _PRINTPROCESSOR_CAPS_1.dwLevel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwLevel;
     * }
     */
    public static int dwLevel$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwLevel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwLevel;
     * }
     */
    public static void dwLevel$set(MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_1.dwLevel$VH.set(seg, x);
    }
    public static int dwLevel$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLevel$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_1.dwLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNupOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNupOptions"));
    public static VarHandle dwNupOptions$VH() {
        return _PRINTPROCESSOR_CAPS_1.dwNupOptions$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNupOptions;
     * }
     */
    public static int dwNupOptions$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwNupOptions$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNupOptions;
     * }
     */
    public static void dwNupOptions$set(MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_1.dwNupOptions$VH.set(seg, x);
    }
    public static int dwNupOptions$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwNupOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNupOptions$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_1.dwNupOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPageOrderFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPageOrderFlags"));
    public static VarHandle dwPageOrderFlags$VH() {
        return _PRINTPROCESSOR_CAPS_1.dwPageOrderFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwPageOrderFlags;
     * }
     */
    public static int dwPageOrderFlags$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwPageOrderFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwPageOrderFlags;
     * }
     */
    public static void dwPageOrderFlags$set(MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_1.dwPageOrderFlags$VH.set(seg, x);
    }
    public static int dwPageOrderFlags$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwPageOrderFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPageOrderFlags$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_1.dwPageOrderFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfCopies$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfCopies"));
    public static VarHandle dwNumberOfCopies$VH() {
        return _PRINTPROCESSOR_CAPS_1.dwNumberOfCopies$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfCopies;
     * }
     */
    public static int dwNumberOfCopies$get(MemorySegment seg) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwNumberOfCopies$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfCopies;
     * }
     */
    public static void dwNumberOfCopies$set(MemorySegment seg, int x) {
        _PRINTPROCESSOR_CAPS_1.dwNumberOfCopies$VH.set(seg, x);
    }
    public static int dwNumberOfCopies$get(MemorySegment seg, long index) {
        return (int)_PRINTPROCESSOR_CAPS_1.dwNumberOfCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfCopies$set(MemorySegment seg, long index, int x) {
        _PRINTPROCESSOR_CAPS_1.dwNumberOfCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


