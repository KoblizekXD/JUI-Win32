// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GET_FILTER_FILE_IDENTIFIER_INPUT {
 *     WORD AltitudeLength;
 *     WCHAR Altitude[1];
 * };
 * }
 */
public class _GET_FILTER_FILE_IDENTIFIER_INPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("AltitudeLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("Altitude")
    ).withName("_GET_FILTER_FILE_IDENTIFIER_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _GET_FILTER_FILE_IDENTIFIER_INPUT.$struct$LAYOUT;
    }
    static final VarHandle AltitudeLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AltitudeLength"));
    public static VarHandle AltitudeLength$VH() {
        return _GET_FILTER_FILE_IDENTIFIER_INPUT.AltitudeLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD AltitudeLength;
     * }
     */
    public static short AltitudeLength$get(MemorySegment seg) {
        return (short)_GET_FILTER_FILE_IDENTIFIER_INPUT.AltitudeLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD AltitudeLength;
     * }
     */
    public static void AltitudeLength$set(MemorySegment seg, short x) {
        _GET_FILTER_FILE_IDENTIFIER_INPUT.AltitudeLength$VH.set(seg, x);
    }
    public static short AltitudeLength$get(MemorySegment seg, long index) {
        return (short)_GET_FILTER_FILE_IDENTIFIER_INPUT.AltitudeLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AltitudeLength$set(MemorySegment seg, long index, short x) {
        _GET_FILTER_FILE_IDENTIFIER_INPUT.AltitudeLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Altitude$slice(MemorySegment seg) {
        return seg.asSlice(2, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


