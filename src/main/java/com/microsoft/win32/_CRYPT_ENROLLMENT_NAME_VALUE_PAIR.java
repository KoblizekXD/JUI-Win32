// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_ENROLLMENT_NAME_VALUE_PAIR {
 *     LPWSTR pwszName;
 *     LPWSTR pwszValue;
 * };
 * }
 */
public class _CRYPT_ENROLLMENT_NAME_VALUE_PAIR {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pwszName"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszValue")
    ).withName("_CRYPT_ENROLLMENT_NAME_VALUE_PAIR");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.$struct$LAYOUT;
    }
    static final VarHandle pwszName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszName"));
    public static VarHandle pwszName$VH() {
        return _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszName;
     * }
     */
    public static MemorySegment pwszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszName;
     * }
     */
    public static void pwszName$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszName$VH.set(seg, x);
    }
    public static MemorySegment pwszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszName$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszValue"));
    public static VarHandle pwszValue$VH() {
        return _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszValue$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszValue;
     * }
     */
    public static MemorySegment pwszValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszValue$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszValue;
     * }
     */
    public static void pwszValue$set(MemorySegment seg, MemorySegment x) {
        _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszValue$VH.set(seg, x);
    }
    public static MemorySegment pwszValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszValue$set(MemorySegment seg, long index, MemorySegment x) {
        _CRYPT_ENROLLMENT_NAME_VALUE_PAIR.pwszValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


