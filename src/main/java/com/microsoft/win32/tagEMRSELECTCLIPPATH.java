// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRSELECTCLIPPATH {
 *     EMR emr;
 *     DWORD iMode;
 * };
 * }
 */
public class tagEMRSELECTCLIPPATH {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        Constants$root.C_LONG$LAYOUT.withName("iMode")
    ).withName("tagEMRSELECTCLIPPATH");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSELECTCLIPPATH.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle iMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMode"));
    public static VarHandle iMode$VH() {
        return tagEMRSELECTCLIPPATH.iMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iMode;
     * }
     */
    public static int iMode$get(MemorySegment seg) {
        return (int)tagEMRSELECTCLIPPATH.iMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iMode;
     * }
     */
    public static void iMode$set(MemorySegment seg, int x) {
        tagEMRSELECTCLIPPATH.iMode$VH.set(seg, x);
    }
    public static int iMode$get(MemorySegment seg, long index) {
        return (int)tagEMRSELECTCLIPPATH.iMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMode$set(MemorySegment seg, long index, int x) {
        tagEMRSELECTCLIPPATH.iMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

