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
 *     GUID PowerSetting;
 *     DWORD DataLength;
 *     UCHAR Data[1];
 * };
 * }
 */
public class POWERBROADCAST_SETTING {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("PowerSetting"),
        Constants$root.C_LONG$LAYOUT.withName("DataLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    );
    public static MemoryLayout $LAYOUT() {
        return POWERBROADCAST_SETTING.$struct$LAYOUT;
    }
    public static MemorySegment PowerSetting$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle DataLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataLength"));
    public static VarHandle DataLength$VH() {
        return POWERBROADCAST_SETTING.DataLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DataLength;
     * }
     */
    public static int DataLength$get(MemorySegment seg) {
        return (int)POWERBROADCAST_SETTING.DataLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DataLength;
     * }
     */
    public static void DataLength$set(MemorySegment seg, int x) {
        POWERBROADCAST_SETTING.DataLength$VH.set(seg, x);
    }
    public static int DataLength$get(MemorySegment seg, long index) {
        return (int)POWERBROADCAST_SETTING.DataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataLength$set(MemorySegment seg, long index, int x) {
        POWERBROADCAST_SETTING.DataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


