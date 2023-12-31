// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MIDL_INTERFACE_METHOD_PROPERTIES {
 *     unsigned short MethodCount;
 *     const MIDL_METHOD_PROPERTY_MAP** MethodProperties;
 * };
 * }
 */
public class _MIDL_INTERFACE_METHOD_PROPERTIES {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("MethodCount"),
        MemoryLayout.paddingLayout(48),
        Constants$root.C_POINTER$LAYOUT.withName("MethodProperties")
    ).withName("_MIDL_INTERFACE_METHOD_PROPERTIES");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_INTERFACE_METHOD_PROPERTIES.$struct$LAYOUT;
    }
    static final VarHandle MethodCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MethodCount"));
    public static VarHandle MethodCount$VH() {
        return _MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short MethodCount;
     * }
     */
    public static short MethodCount$get(MemorySegment seg) {
        return (short)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short MethodCount;
     * }
     */
    public static void MethodCount$set(MemorySegment seg, short x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.set(seg, x);
    }
    public static short MethodCount$get(MemorySegment seg, long index) {
        return (short)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MethodCount$set(MemorySegment seg, long index, short x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MethodProperties$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MethodProperties"));
    public static VarHandle MethodProperties$VH() {
        return _MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const MIDL_METHOD_PROPERTY_MAP** MethodProperties;
     * }
     */
    public static MemorySegment MethodProperties$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const MIDL_METHOD_PROPERTY_MAP** MethodProperties;
     * }
     */
    public static void MethodProperties$set(MemorySegment seg, MemorySegment x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.set(seg, x);
    }
    public static MemorySegment MethodProperties$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MethodProperties$set(MemorySegment seg, long index, MemorySegment x) {
        _MIDL_INTERFACE_METHOD_PROPERTIES.MethodProperties$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


