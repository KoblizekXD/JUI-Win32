// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _OBJECT_TYPE_LIST {
 *     WORD Level;
 *     WORD Sbz;
 *     GUID* ObjectType;
 * };
 * }
 */
public class _OBJECT_TYPE_LIST {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Level"),
        Constants$root.C_SHORT$LAYOUT.withName("Sbz"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ObjectType")
    ).withName("_OBJECT_TYPE_LIST");
    public static MemoryLayout $LAYOUT() {
        return _OBJECT_TYPE_LIST.$struct$LAYOUT;
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _OBJECT_TYPE_LIST.Level$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Level;
     * }
     */
    public static short Level$get(MemorySegment seg) {
        return (short)_OBJECT_TYPE_LIST.Level$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Level;
     * }
     */
    public static void Level$set(MemorySegment seg, short x) {
        _OBJECT_TYPE_LIST.Level$VH.set(seg, x);
    }
    public static short Level$get(MemorySegment seg, long index) {
        return (short)_OBJECT_TYPE_LIST.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, short x) {
        _OBJECT_TYPE_LIST.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sbz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sbz"));
    public static VarHandle Sbz$VH() {
        return _OBJECT_TYPE_LIST.Sbz$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Sbz;
     * }
     */
    public static short Sbz$get(MemorySegment seg) {
        return (short)_OBJECT_TYPE_LIST.Sbz$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Sbz;
     * }
     */
    public static void Sbz$set(MemorySegment seg, short x) {
        _OBJECT_TYPE_LIST.Sbz$VH.set(seg, x);
    }
    public static short Sbz$get(MemorySegment seg, long index) {
        return (short)_OBJECT_TYPE_LIST.Sbz$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sbz$set(MemorySegment seg, long index, short x) {
        _OBJECT_TYPE_LIST.Sbz$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ObjectType"));
    public static VarHandle ObjectType$VH() {
        return _OBJECT_TYPE_LIST.ObjectType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GUID* ObjectType;
     * }
     */
    public static MemorySegment ObjectType$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_OBJECT_TYPE_LIST.ObjectType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GUID* ObjectType;
     * }
     */
    public static void ObjectType$set(MemorySegment seg, MemorySegment x) {
        _OBJECT_TYPE_LIST.ObjectType$VH.set(seg, x);
    }
    public static MemorySegment ObjectType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_OBJECT_TYPE_LIST.ObjectType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectType$set(MemorySegment seg, long index, MemorySegment x) {
        _OBJECT_TYPE_LIST.ObjectType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


