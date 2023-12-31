// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDEC {
 *     USHORT wReserved;
 *     union {
 *         struct {
 *             BYTE scale;
 *             BYTE sign;
 *         };
 *         USHORT signscale;
 *     };
 *     ULONG Hi32;
 *     union {
 *         struct {
 *             ULONG Lo32;
 *             ULONG Mid32;
 *         };
 *         ULONGLONG Lo64;
 *     };
 * };
 * }
 */
public class tagDEC {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("wReserved"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_CHAR$LAYOUT.withName("scale"),
                Constants$root.C_CHAR$LAYOUT.withName("sign")
            ).withName("$anon$0"),
            Constants$root.C_SHORT$LAYOUT.withName("signscale")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("Hi32"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Lo32"),
                Constants$root.C_LONG$LAYOUT.withName("Mid32")
            ).withName("$anon$0"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("Lo64")
        ).withName("$anon$1")
    ).withName("tagDEC");
    public static MemoryLayout $LAYOUT() {
        return tagDEC.$struct$LAYOUT;
    }
    static final VarHandle wReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
    public static VarHandle wReserved$VH() {
        return tagDEC.wReserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT wReserved;
     * }
     */
    public static short wReserved$get(MemorySegment seg) {
        return (short)tagDEC.wReserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT wReserved;
     * }
     */
    public static void wReserved$set(MemorySegment seg, short x) {
        tagDEC.wReserved$VH.set(seg, x);
    }
    public static short wReserved$get(MemorySegment seg, long index) {
        return (short)tagDEC.wReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved$set(MemorySegment seg, long index, short x) {
        tagDEC.wReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle scale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("scale"));
    public static VarHandle scale$VH() {
        return tagDEC.scale$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE scale;
     * }
     */
    public static byte scale$get(MemorySegment seg) {
        return (byte)tagDEC.scale$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE scale;
     * }
     */
    public static void scale$set(MemorySegment seg, byte x) {
        tagDEC.scale$VH.set(seg, x);
    }
    public static byte scale$get(MemorySegment seg, long index) {
        return (byte)tagDEC.scale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scale$set(MemorySegment seg, long index, byte x) {
        tagDEC.scale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sign$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("sign"));
    public static VarHandle sign$VH() {
        return tagDEC.sign$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE sign;
     * }
     */
    public static byte sign$get(MemorySegment seg) {
        return (byte)tagDEC.sign$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE sign;
     * }
     */
    public static void sign$set(MemorySegment seg, byte x) {
        tagDEC.sign$VH.set(seg, x);
    }
    public static byte sign$get(MemorySegment seg, long index) {
        return (byte)tagDEC.sign$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sign$set(MemorySegment seg, long index, byte x) {
        tagDEC.sign$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signscale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("signscale"));
    public static VarHandle signscale$VH() {
        return tagDEC.signscale$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT signscale;
     * }
     */
    public static short signscale$get(MemorySegment seg) {
        return (short)tagDEC.signscale$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT signscale;
     * }
     */
    public static void signscale$set(MemorySegment seg, short x) {
        tagDEC.signscale$VH.set(seg, x);
    }
    public static short signscale$get(MemorySegment seg, long index) {
        return (short)tagDEC.signscale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signscale$set(MemorySegment seg, long index, short x) {
        tagDEC.signscale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Hi32$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Hi32"));
    public static VarHandle Hi32$VH() {
        return tagDEC.Hi32$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Hi32;
     * }
     */
    public static int Hi32$get(MemorySegment seg) {
        return (int)tagDEC.Hi32$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Hi32;
     * }
     */
    public static void Hi32$set(MemorySegment seg, int x) {
        tagDEC.Hi32$VH.set(seg, x);
    }
    public static int Hi32$get(MemorySegment seg, long index) {
        return (int)tagDEC.Hi32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hi32$set(MemorySegment seg, long index, int x) {
        tagDEC.Hi32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Lo32$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Lo32"));
    public static VarHandle Lo32$VH() {
        return tagDEC.Lo32$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Lo32;
     * }
     */
    public static int Lo32$get(MemorySegment seg) {
        return (int)tagDEC.Lo32$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Lo32;
     * }
     */
    public static void Lo32$set(MemorySegment seg, int x) {
        tagDEC.Lo32$VH.set(seg, x);
    }
    public static int Lo32$get(MemorySegment seg, long index) {
        return (int)tagDEC.Lo32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lo32$set(MemorySegment seg, long index, int x) {
        tagDEC.Lo32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Mid32$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Mid32"));
    public static VarHandle Mid32$VH() {
        return tagDEC.Mid32$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Mid32;
     * }
     */
    public static int Mid32$get(MemorySegment seg) {
        return (int)tagDEC.Mid32$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Mid32;
     * }
     */
    public static void Mid32$set(MemorySegment seg, int x) {
        tagDEC.Mid32$VH.set(seg, x);
    }
    public static int Mid32$get(MemorySegment seg, long index) {
        return (int)tagDEC.Mid32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mid32$set(MemorySegment seg, long index, int x) {
        tagDEC.Mid32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Lo64$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("Lo64"));
    public static VarHandle Lo64$VH() {
        return tagDEC.Lo64$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG Lo64;
     * }
     */
    public static long Lo64$get(MemorySegment seg) {
        return (long)tagDEC.Lo64$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG Lo64;
     * }
     */
    public static void Lo64$set(MemorySegment seg, long x) {
        tagDEC.Lo64$VH.set(seg, x);
    }
    public static long Lo64$get(MemorySegment seg, long index) {
        return (long)tagDEC.Lo64$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lo64$set(MemorySegment seg, long index, long x) {
        tagDEC.Lo64$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


