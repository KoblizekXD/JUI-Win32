// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPROPSPEC {
 *     ULONG ulKind;
 *     union {
 *         PROPID propid;
 *         LPOLESTR lpwstr;
 *     };
 * };
 * }
 */
public class tagPROPSPEC {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulKind"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("propid"),
            Constants$root.C_POINTER$LAYOUT.withName("lpwstr")
        ).withName("$anon$0")
    ).withName("tagPROPSPEC");
    public static MemoryLayout $LAYOUT() {
        return tagPROPSPEC.$struct$LAYOUT;
    }
    static final VarHandle ulKind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulKind"));
    public static VarHandle ulKind$VH() {
        return tagPROPSPEC.ulKind$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ulKind;
     * }
     */
    public static int ulKind$get(MemorySegment seg) {
        return (int)tagPROPSPEC.ulKind$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ulKind;
     * }
     */
    public static void ulKind$set(MemorySegment seg, int x) {
        tagPROPSPEC.ulKind$VH.set(seg, x);
    }
    public static int ulKind$get(MemorySegment seg, long index) {
        return (int)tagPROPSPEC.ulKind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulKind$set(MemorySegment seg, long index, int x) {
        tagPROPSPEC.ulKind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle propid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("propid"));
    public static VarHandle propid$VH() {
        return tagPROPSPEC.propid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PROPID propid;
     * }
     */
    public static int propid$get(MemorySegment seg) {
        return (int)tagPROPSPEC.propid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PROPID propid;
     * }
     */
    public static void propid$set(MemorySegment seg, int x) {
        tagPROPSPEC.propid$VH.set(seg, x);
    }
    public static int propid$get(MemorySegment seg, long index) {
        return (int)tagPROPSPEC.propid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void propid$set(MemorySegment seg, long index, int x) {
        tagPROPSPEC.propid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpwstr$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lpwstr"));
    public static VarHandle lpwstr$VH() {
        return tagPROPSPEC.lpwstr$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOLESTR lpwstr;
     * }
     */
    public static MemorySegment lpwstr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPROPSPEC.lpwstr$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOLESTR lpwstr;
     * }
     */
    public static void lpwstr$set(MemorySegment seg, MemorySegment x) {
        tagPROPSPEC.lpwstr$VH.set(seg, x);
    }
    public static MemorySegment lpwstr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPROPSPEC.lpwstr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpwstr$set(MemorySegment seg, long index, MemorySegment x) {
        tagPROPSPEC.lpwstr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


