// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CONSOLE_SCREEN_BUFFER_INFO {
 *     COORD dwSize;
 *     COORD dwCursorPosition;
 *     WORD wAttributes;
 *     SMALL_RECT srWindow;
 *     COORD dwMaximumWindowSize;
 * };
 * }
 */
public class _CONSOLE_SCREEN_BUFFER_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("dwSize"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("dwCursorPosition"),
        Constants$root.C_SHORT$LAYOUT.withName("wAttributes"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Left"),
            Constants$root.C_SHORT$LAYOUT.withName("Top"),
            Constants$root.C_SHORT$LAYOUT.withName("Right"),
            Constants$root.C_SHORT$LAYOUT.withName("Bottom")
        ).withName("srWindow"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("X"),
            Constants$root.C_SHORT$LAYOUT.withName("Y")
        ).withName("dwMaximumWindowSize")
    ).withName("_CONSOLE_SCREEN_BUFFER_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CONSOLE_SCREEN_BUFFER_INFO.$struct$LAYOUT;
    }
    public static MemorySegment dwSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment dwCursorPosition$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    static final VarHandle wAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wAttributes"));
    public static VarHandle wAttributes$VH() {
        return _CONSOLE_SCREEN_BUFFER_INFO.wAttributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wAttributes;
     * }
     */
    public static short wAttributes$get(MemorySegment seg) {
        return (short)_CONSOLE_SCREEN_BUFFER_INFO.wAttributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wAttributes;
     * }
     */
    public static void wAttributes$set(MemorySegment seg, short x) {
        _CONSOLE_SCREEN_BUFFER_INFO.wAttributes$VH.set(seg, x);
    }
    public static short wAttributes$get(MemorySegment seg, long index) {
        return (short)_CONSOLE_SCREEN_BUFFER_INFO.wAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wAttributes$set(MemorySegment seg, long index, short x) {
        _CONSOLE_SCREEN_BUFFER_INFO.wAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment srWindow$slice(MemorySegment seg) {
        return seg.asSlice(10, 8);
    }
    public static MemorySegment dwMaximumWindowSize$slice(MemorySegment seg) {
        return seg.asSlice(18, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


