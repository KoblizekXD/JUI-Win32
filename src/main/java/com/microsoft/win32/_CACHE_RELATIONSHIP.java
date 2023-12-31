// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CACHE_RELATIONSHIP {
 *     BYTE Level;
 *     BYTE Associativity;
 *     WORD LineSize;
 *     DWORD CacheSize;
 *     PROCESSOR_CACHE_TYPE Type;
 *     BYTE Reserved[18];
 *     WORD GroupCount;
 *     union {
 *         GROUP_AFFINITY GroupMask;
 *         GROUP_AFFINITY GroupMasks[1];
 *     };
 * };
 * }
 */
public class _CACHE_RELATIONSHIP {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Level"),
        Constants$root.C_CHAR$LAYOUT.withName("Associativity"),
        Constants$root.C_SHORT$LAYOUT.withName("LineSize"),
        Constants$root.C_LONG$LAYOUT.withName("CacheSize"),
        Constants$root.C_LONG$LAYOUT.withName("Type"),
        MemoryLayout.sequenceLayout(18, Constants$root.C_CHAR$LAYOUT).withName("Reserved"),
        Constants$root.C_SHORT$LAYOUT.withName("GroupCount"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                Constants$root.C_SHORT$LAYOUT.withName("Group"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
            ).withName("GroupMask"),
            MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
                Constants$root.C_SHORT$LAYOUT.withName("Group"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("Reserved")
            ).withName("_GROUP_AFFINITY")).withName("GroupMasks")
        ).withName("$anon$0")
    ).withName("_CACHE_RELATIONSHIP");
    public static MemoryLayout $LAYOUT() {
        return _CACHE_RELATIONSHIP.$struct$LAYOUT;
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _CACHE_RELATIONSHIP.Level$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Level;
     * }
     */
    public static byte Level$get(MemorySegment seg) {
        return (byte)_CACHE_RELATIONSHIP.Level$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Level;
     * }
     */
    public static void Level$set(MemorySegment seg, byte x) {
        _CACHE_RELATIONSHIP.Level$VH.set(seg, x);
    }
    public static byte Level$get(MemorySegment seg, long index) {
        return (byte)_CACHE_RELATIONSHIP.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, byte x) {
        _CACHE_RELATIONSHIP.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Associativity$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Associativity"));
    public static VarHandle Associativity$VH() {
        return _CACHE_RELATIONSHIP.Associativity$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Associativity;
     * }
     */
    public static byte Associativity$get(MemorySegment seg) {
        return (byte)_CACHE_RELATIONSHIP.Associativity$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Associativity;
     * }
     */
    public static void Associativity$set(MemorySegment seg, byte x) {
        _CACHE_RELATIONSHIP.Associativity$VH.set(seg, x);
    }
    public static byte Associativity$get(MemorySegment seg, long index) {
        return (byte)_CACHE_RELATIONSHIP.Associativity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Associativity$set(MemorySegment seg, long index, byte x) {
        _CACHE_RELATIONSHIP.Associativity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LineSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LineSize"));
    public static VarHandle LineSize$VH() {
        return _CACHE_RELATIONSHIP.LineSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LineSize;
     * }
     */
    public static short LineSize$get(MemorySegment seg) {
        return (short)_CACHE_RELATIONSHIP.LineSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LineSize;
     * }
     */
    public static void LineSize$set(MemorySegment seg, short x) {
        _CACHE_RELATIONSHIP.LineSize$VH.set(seg, x);
    }
    public static short LineSize$get(MemorySegment seg, long index) {
        return (short)_CACHE_RELATIONSHIP.LineSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LineSize$set(MemorySegment seg, long index, short x) {
        _CACHE_RELATIONSHIP.LineSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CacheSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CacheSize"));
    public static VarHandle CacheSize$VH() {
        return _CACHE_RELATIONSHIP.CacheSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CacheSize;
     * }
     */
    public static int CacheSize$get(MemorySegment seg) {
        return (int)_CACHE_RELATIONSHIP.CacheSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CacheSize;
     * }
     */
    public static void CacheSize$set(MemorySegment seg, int x) {
        _CACHE_RELATIONSHIP.CacheSize$VH.set(seg, x);
    }
    public static int CacheSize$get(MemorySegment seg, long index) {
        return (int)_CACHE_RELATIONSHIP.CacheSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CacheSize$set(MemorySegment seg, long index, int x) {
        _CACHE_RELATIONSHIP.CacheSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _CACHE_RELATIONSHIP.Type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PROCESSOR_CACHE_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)_CACHE_RELATIONSHIP.Type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PROCESSOR_CACHE_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        _CACHE_RELATIONSHIP.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_CACHE_RELATIONSHIP.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _CACHE_RELATIONSHIP.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(12, 18);
    }
    static final VarHandle GroupCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GroupCount"));
    public static VarHandle GroupCount$VH() {
        return _CACHE_RELATIONSHIP.GroupCount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static short GroupCount$get(MemorySegment seg) {
        return (short)_CACHE_RELATIONSHIP.GroupCount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static void GroupCount$set(MemorySegment seg, short x) {
        _CACHE_RELATIONSHIP.GroupCount$VH.set(seg, x);
    }
    public static short GroupCount$get(MemorySegment seg, long index) {
        return (short)_CACHE_RELATIONSHIP.GroupCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupCount$set(MemorySegment seg, long index, short x) {
        _CACHE_RELATIONSHIP.GroupCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment GroupMask$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment GroupMasks$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


