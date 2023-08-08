// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_IDENTIFIER {
 *     STORAGE_IDENTIFIER_CODE_SET CodeSet;
 *     STORAGE_IDENTIFIER_TYPE Type;
 *     WORD IdentifierSize;
 *     WORD NextOffset;
 *     STORAGE_ASSOCIATION_TYPE Association;
 *     BYTE Identifier[1];
 * };
 * }
 */
public class _STORAGE_IDENTIFIER {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("CodeSet"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        Constants$root.C_SHORT$LAYOUT.withName("IdentifierSize"),
        Constants$root.C_SHORT$LAYOUT.withName("NextOffset"),
        Constants$root.C_LONG$LAYOUT.withName("Association"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Identifier"),
        MemoryLayout.paddingLayout(24)
    ).withName("_STORAGE_IDENTIFIER");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_IDENTIFIER.$struct$LAYOUT;
    }
    static final VarHandle CodeSet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CodeSet"));
    public static VarHandle CodeSet$VH() {
        return _STORAGE_IDENTIFIER.CodeSet$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_IDENTIFIER_CODE_SET CodeSet;
     * }
     */
    public static int CodeSet$get(MemorySegment seg) {
        return (int)_STORAGE_IDENTIFIER.CodeSet$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_IDENTIFIER_CODE_SET CodeSet;
     * }
     */
    public static void CodeSet$set(MemorySegment seg, int x) {
        _STORAGE_IDENTIFIER.CodeSet$VH.set(seg, x);
    }
    public static int CodeSet$get(MemorySegment seg, long index) {
        return (int)_STORAGE_IDENTIFIER.CodeSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CodeSet$set(MemorySegment seg, long index, int x) {
        _STORAGE_IDENTIFIER.CodeSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _STORAGE_IDENTIFIER.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_IDENTIFIER_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)_STORAGE_IDENTIFIER.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_IDENTIFIER_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        _STORAGE_IDENTIFIER.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_STORAGE_IDENTIFIER.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _STORAGE_IDENTIFIER.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle IdentifierSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IdentifierSize"));
    public static VarHandle IdentifierSize$VH() {
        return _STORAGE_IDENTIFIER.IdentifierSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD IdentifierSize;
     * }
     */
    public static short IdentifierSize$get(MemorySegment seg) {
        return (short)_STORAGE_IDENTIFIER.IdentifierSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD IdentifierSize;
     * }
     */
    public static void IdentifierSize$set(MemorySegment seg, short x) {
        _STORAGE_IDENTIFIER.IdentifierSize$VH.set(seg, x);
    }
    public static short IdentifierSize$get(MemorySegment seg, long index) {
        return (short)_STORAGE_IDENTIFIER.IdentifierSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IdentifierSize$set(MemorySegment seg, long index, short x) {
        _STORAGE_IDENTIFIER.IdentifierSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NextOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextOffset"));
    public static VarHandle NextOffset$VH() {
        return _STORAGE_IDENTIFIER.NextOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NextOffset;
     * }
     */
    public static short NextOffset$get(MemorySegment seg) {
        return (short)_STORAGE_IDENTIFIER.NextOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NextOffset;
     * }
     */
    public static void NextOffset$set(MemorySegment seg, short x) {
        _STORAGE_IDENTIFIER.NextOffset$VH.set(seg, x);
    }
    public static short NextOffset$get(MemorySegment seg, long index) {
        return (short)_STORAGE_IDENTIFIER.NextOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextOffset$set(MemorySegment seg, long index, short x) {
        _STORAGE_IDENTIFIER.NextOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Association$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Association"));
    public static VarHandle Association$VH() {
        return _STORAGE_IDENTIFIER.Association$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_ASSOCIATION_TYPE Association;
     * }
     */
    public static int Association$get(MemorySegment seg) {
        return (int)_STORAGE_IDENTIFIER.Association$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_ASSOCIATION_TYPE Association;
     * }
     */
    public static void Association$set(MemorySegment seg, int x) {
        _STORAGE_IDENTIFIER.Association$VH.set(seg, x);
    }
    public static int Association$get(MemorySegment seg, long index) {
        return (int)_STORAGE_IDENTIFIER.Association$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Association$set(MemorySegment seg, long index, int x) {
        _STORAGE_IDENTIFIER.Association$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Identifier$slice(MemorySegment seg) {
        return seg.asSlice(16, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


