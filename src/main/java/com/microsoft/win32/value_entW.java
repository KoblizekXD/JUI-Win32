// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct value_entW {
 *     LPWSTR ve_valuename;
 *     DWORD ve_valuelen;
 *     DWORD_PTR ve_valueptr;
 *     DWORD ve_type;
 * };
 * }
 */
public class value_entW {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("ve_valuename"),
        Constants$root.C_LONG$LAYOUT.withName("ve_valuelen"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("ve_valueptr"),
        Constants$root.C_LONG$LAYOUT.withName("ve_type"),
        MemoryLayout.paddingLayout(32)
    ).withName("value_entW");
    public static MemoryLayout $LAYOUT() {
        return value_entW.$struct$LAYOUT;
    }
    static final VarHandle ve_valuename$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ve_valuename"));
    public static VarHandle ve_valuename$VH() {
        return value_entW.ve_valuename$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR ve_valuename;
     * }
     */
    public static MemorySegment ve_valuename$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)value_entW.ve_valuename$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR ve_valuename;
     * }
     */
    public static void ve_valuename$set(MemorySegment seg, MemorySegment x) {
        value_entW.ve_valuename$VH.set(seg, x);
    }
    public static MemorySegment ve_valuename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)value_entW.ve_valuename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ve_valuename$set(MemorySegment seg, long index, MemorySegment x) {
        value_entW.ve_valuename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ve_valuelen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ve_valuelen"));
    public static VarHandle ve_valuelen$VH() {
        return value_entW.ve_valuelen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ve_valuelen;
     * }
     */
    public static int ve_valuelen$get(MemorySegment seg) {
        return (int)value_entW.ve_valuelen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ve_valuelen;
     * }
     */
    public static void ve_valuelen$set(MemorySegment seg, int x) {
        value_entW.ve_valuelen$VH.set(seg, x);
    }
    public static int ve_valuelen$get(MemorySegment seg, long index) {
        return (int)value_entW.ve_valuelen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ve_valuelen$set(MemorySegment seg, long index, int x) {
        value_entW.ve_valuelen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ve_valueptr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ve_valueptr"));
    public static VarHandle ve_valueptr$VH() {
        return value_entW.ve_valueptr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR ve_valueptr;
     * }
     */
    public static long ve_valueptr$get(MemorySegment seg) {
        return (long)value_entW.ve_valueptr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR ve_valueptr;
     * }
     */
    public static void ve_valueptr$set(MemorySegment seg, long x) {
        value_entW.ve_valueptr$VH.set(seg, x);
    }
    public static long ve_valueptr$get(MemorySegment seg, long index) {
        return (long)value_entW.ve_valueptr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ve_valueptr$set(MemorySegment seg, long index, long x) {
        value_entW.ve_valueptr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ve_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ve_type"));
    public static VarHandle ve_type$VH() {
        return value_entW.ve_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ve_type;
     * }
     */
    public static int ve_type$get(MemorySegment seg) {
        return (int)value_entW.ve_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ve_type;
     * }
     */
    public static void ve_type$set(MemorySegment seg, int x) {
        value_entW.ve_type$VH.set(seg, x);
    }
    public static int ve_type$get(MemorySegment seg, long index) {
        return (int)value_entW.ve_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ve_type$set(MemorySegment seg, long index, int x) {
        value_entW.ve_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


