// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCM_PD_PASSTHROUGH_INPUT {
 *     DWORD Version;
 *     DWORD Size;
 *     GUID ProtocolGuid;
 *     DWORD DataSize;
 *     BYTE Data[1];
 * };
 * }
 */
public class _SCM_PD_PASSTHROUGH_INPUT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("ProtocolGuid"),
        Constants$root.C_LONG$LAYOUT.withName("DataSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    ).withName("_SCM_PD_PASSTHROUGH_INPUT");
    public static MemoryLayout $LAYOUT() {
        return _SCM_PD_PASSTHROUGH_INPUT.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _SCM_PD_PASSTHROUGH_INPUT.Version$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)_SCM_PD_PASSTHROUGH_INPUT.Version$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        _SCM_PD_PASSTHROUGH_INPUT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PASSTHROUGH_INPUT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PASSTHROUGH_INPUT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SCM_PD_PASSTHROUGH_INPUT.Size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)_SCM_PD_PASSTHROUGH_INPUT.Size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        _SCM_PD_PASSTHROUGH_INPUT.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PASSTHROUGH_INPUT.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PASSTHROUGH_INPUT.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProtocolGuid$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle DataSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataSize"));
    public static VarHandle DataSize$VH() {
        return _SCM_PD_PASSTHROUGH_INPUT.DataSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DataSize;
     * }
     */
    public static int DataSize$get(MemorySegment seg) {
        return (int)_SCM_PD_PASSTHROUGH_INPUT.DataSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DataSize;
     * }
     */
    public static void DataSize$set(MemorySegment seg, int x) {
        _SCM_PD_PASSTHROUGH_INPUT.DataSize$VH.set(seg, x);
    }
    public static int DataSize$get(MemorySegment seg, long index) {
        return (int)_SCM_PD_PASSTHROUGH_INPUT.DataSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSize$set(MemorySegment seg, long index, int x) {
        _SCM_PD_PASSTHROUGH_INPUT.DataSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(28, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


