// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PLEX_READ_DATA_REQUEST {
 *     LARGE_INTEGER ByteOffset;
 *     DWORD ByteLength;
 *     DWORD PlexNumber;
 * };
 * }
 */
public class _PLEX_READ_DATA_REQUEST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("ByteOffset"),
        Constants$root.C_LONG$LAYOUT.withName("ByteLength"),
        Constants$root.C_LONG$LAYOUT.withName("PlexNumber")
    ).withName("_PLEX_READ_DATA_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _PLEX_READ_DATA_REQUEST.$struct$LAYOUT;
    }
    public static MemorySegment ByteOffset$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ByteLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ByteLength"));
    public static VarHandle ByteLength$VH() {
        return _PLEX_READ_DATA_REQUEST.ByteLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ByteLength;
     * }
     */
    public static int ByteLength$get(MemorySegment seg) {
        return (int)_PLEX_READ_DATA_REQUEST.ByteLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ByteLength;
     * }
     */
    public static void ByteLength$set(MemorySegment seg, int x) {
        _PLEX_READ_DATA_REQUEST.ByteLength$VH.set(seg, x);
    }
    public static int ByteLength$get(MemorySegment seg, long index) {
        return (int)_PLEX_READ_DATA_REQUEST.ByteLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ByteLength$set(MemorySegment seg, long index, int x) {
        _PLEX_READ_DATA_REQUEST.ByteLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PlexNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PlexNumber"));
    public static VarHandle PlexNumber$VH() {
        return _PLEX_READ_DATA_REQUEST.PlexNumber$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PlexNumber;
     * }
     */
    public static int PlexNumber$get(MemorySegment seg) {
        return (int)_PLEX_READ_DATA_REQUEST.PlexNumber$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PlexNumber;
     * }
     */
    public static void PlexNumber$set(MemorySegment seg, int x) {
        _PLEX_READ_DATA_REQUEST.PlexNumber$VH.set(seg, x);
    }
    public static int PlexNumber$get(MemorySegment seg, long index) {
        return (int)_PLEX_READ_DATA_REQUEST.PlexNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PlexNumber$set(MemorySegment seg, long index, int x) {
        _PLEX_READ_DATA_REQUEST.PlexNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


