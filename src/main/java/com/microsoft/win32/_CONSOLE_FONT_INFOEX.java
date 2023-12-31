// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CONSOLE_FONT_INFOEX {
 *     ULONG cbSize;
 *     DWORD nFont;
 *     COORD dwFontSize;
 *     UINT FontFamily;
 *     UINT FontWeight;
 *     WCHAR FaceName[32];
 * };
 * }
 */
public class _CONSOLE_FONT_INFOEX {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("nFont"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("dwFontSize"),
        Constants$root.C_LONG$LAYOUT.withName("FontFamily"),
        Constants$root.C_LONG$LAYOUT.withName("FontWeight"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_SHORT$LAYOUT).withName("FaceName")
    ).withName("_CONSOLE_FONT_INFOEX");
    public static MemoryLayout $LAYOUT() {
        return _CONSOLE_FONT_INFOEX.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CONSOLE_FONT_INFOEX.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CONSOLE_FONT_INFOEX.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        _CONSOLE_FONT_INFOEX.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_FONT_INFOEX.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CONSOLE_FONT_INFOEX.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFont$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nFont"));
    public static VarHandle nFont$VH() {
        return _CONSOLE_FONT_INFOEX.nFont$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFont;
     * }
     */
    public static int nFont$get(MemorySegment seg) {
        return (int)_CONSOLE_FONT_INFOEX.nFont$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFont;
     * }
     */
    public static void nFont$set(MemorySegment seg, int x) {
        _CONSOLE_FONT_INFOEX.nFont$VH.set(seg, x);
    }
    public static int nFont$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_FONT_INFOEX.nFont$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFont$set(MemorySegment seg, long index, int x) {
        _CONSOLE_FONT_INFOEX.nFont$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dwFontSize$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    static final VarHandle FontFamily$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FontFamily"));
    public static VarHandle FontFamily$VH() {
        return _CONSOLE_FONT_INFOEX.FontFamily$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT FontFamily;
     * }
     */
    public static int FontFamily$get(MemorySegment seg) {
        return (int)_CONSOLE_FONT_INFOEX.FontFamily$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT FontFamily;
     * }
     */
    public static void FontFamily$set(MemorySegment seg, int x) {
        _CONSOLE_FONT_INFOEX.FontFamily$VH.set(seg, x);
    }
    public static int FontFamily$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_FONT_INFOEX.FontFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FontFamily$set(MemorySegment seg, long index, int x) {
        _CONSOLE_FONT_INFOEX.FontFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FontWeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FontWeight"));
    public static VarHandle FontWeight$VH() {
        return _CONSOLE_FONT_INFOEX.FontWeight$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT FontWeight;
     * }
     */
    public static int FontWeight$get(MemorySegment seg) {
        return (int)_CONSOLE_FONT_INFOEX.FontWeight$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT FontWeight;
     * }
     */
    public static void FontWeight$set(MemorySegment seg, int x) {
        _CONSOLE_FONT_INFOEX.FontWeight$VH.set(seg, x);
    }
    public static int FontWeight$get(MemorySegment seg, long index) {
        return (int)_CONSOLE_FONT_INFOEX.FontWeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FontWeight$set(MemorySegment seg, long index, int x) {
        _CONSOLE_FONT_INFOEX.FontWeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FaceName$slice(MemorySegment seg) {
        return seg.asSlice(20, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


