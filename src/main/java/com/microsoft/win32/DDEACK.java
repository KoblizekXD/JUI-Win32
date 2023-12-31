// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *      *     unsigned short bAppReturnCode;
 *     unsigned short reserved;
 *     unsigned short fBusy;
 *     unsigned short fAck;
 * };
 * }
 */
public class DDEACK {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(16)
    );
    public static MemoryLayout $LAYOUT() {
        return DDEACK.$struct$LAYOUT;
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


