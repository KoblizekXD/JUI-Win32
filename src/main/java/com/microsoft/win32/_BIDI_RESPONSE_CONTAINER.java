// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BIDI_RESPONSE_CONTAINER {
 *     DWORD Version;
 *     DWORD Flags;
 *     DWORD Count;
 *     BIDI_RESPONSE_DATA aData[1];
 * };
 * }
 */
public class _BIDI_RESPONSE_CONTAINER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("Count"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("dwResult"),
            Constants$root.C_LONG$LAYOUT.withName("dwReqNumber"),
            Constants$root.C_POINTER$LAYOUT.withName("pSchema"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("dwBidiType"),
                MemoryLayout.paddingLayout(32),
                MemoryLayout.unionLayout(
                    Constants$root.C_LONG$LAYOUT.withName("bData"),
                    Constants$root.C_LONG$LAYOUT.withName("iData"),
                    Constants$root.C_POINTER$LAYOUT.withName("sData"),
                    Constants$root.C_FLOAT$LAYOUT.withName("fData"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cbBuf"),
                        MemoryLayout.paddingLayout(32),
                        Constants$root.C_POINTER$LAYOUT.withName("pData")
                    ).withName("biData")
                ).withName("u")
            ).withName("data")
        ).withName("_BIDI_RESPONSE_DATA")).withName("aData")
    ).withName("_BIDI_RESPONSE_CONTAINER");
    public static MemoryLayout $LAYOUT() {
        return _BIDI_RESPONSE_CONTAINER.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _BIDI_RESPONSE_CONTAINER.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_BIDI_RESPONSE_CONTAINER.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _BIDI_RESPONSE_CONTAINER.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_BIDI_RESPONSE_CONTAINER.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _BIDI_RESPONSE_CONTAINER.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _BIDI_RESPONSE_CONTAINER.Flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)_BIDI_RESPONSE_CONTAINER.Flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        _BIDI_RESPONSE_CONTAINER.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_BIDI_RESPONSE_CONTAINER.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _BIDI_RESPONSE_CONTAINER.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _BIDI_RESPONSE_CONTAINER.Count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)_BIDI_RESPONSE_CONTAINER.Count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        _BIDI_RESPONSE_CONTAINER.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_BIDI_RESPONSE_CONTAINER.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _BIDI_RESPONSE_CONTAINER.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment aData$slice(MemorySegment seg) {
        return seg.asSlice(16, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


