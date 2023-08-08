// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagOLEVERB {
 *     LONG lVerb;
 *     LPOLESTR lpszVerbName;
 *     DWORD fuFlags;
 *     DWORD grfAttribs;
 * };
 * }
 */
public class tagOLEVERB {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lVerb"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpszVerbName"),
        Constants$root.C_LONG$LAYOUT.withName("fuFlags"),
        Constants$root.C_LONG$LAYOUT.withName("grfAttribs")
    ).withName("tagOLEVERB");
    public static MemoryLayout $LAYOUT() {
        return tagOLEVERB.$struct$LAYOUT;
    }
    static final VarHandle lVerb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lVerb"));
    public static VarHandle lVerb$VH() {
        return tagOLEVERB.lVerb$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG lVerb;
     * }
     */
    public static int lVerb$get(MemorySegment seg) {
        return (int)tagOLEVERB.lVerb$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG lVerb;
     * }
     */
    public static void lVerb$set(MemorySegment seg, int x) {
        tagOLEVERB.lVerb$VH.set(seg, x);
    }
    public static int lVerb$get(MemorySegment seg, long index) {
        return (int)tagOLEVERB.lVerb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lVerb$set(MemorySegment seg, long index, int x) {
        tagOLEVERB.lVerb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszVerbName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpszVerbName"));
    public static VarHandle lpszVerbName$VH() {
        return tagOLEVERB.lpszVerbName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPOLESTR lpszVerbName;
     * }
     */
    public static MemorySegment lpszVerbName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagOLEVERB.lpszVerbName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPOLESTR lpszVerbName;
     * }
     */
    public static void lpszVerbName$set(MemorySegment seg, MemorySegment x) {
        tagOLEVERB.lpszVerbName$VH.set(seg, x);
    }
    public static MemorySegment lpszVerbName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagOLEVERB.lpszVerbName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszVerbName$set(MemorySegment seg, long index, MemorySegment x) {
        tagOLEVERB.lpszVerbName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fuFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fuFlags"));
    public static VarHandle fuFlags$VH() {
        return tagOLEVERB.fuFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD fuFlags;
     * }
     */
    public static int fuFlags$get(MemorySegment seg) {
        return (int)tagOLEVERB.fuFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD fuFlags;
     * }
     */
    public static void fuFlags$set(MemorySegment seg, int x) {
        tagOLEVERB.fuFlags$VH.set(seg, x);
    }
    public static int fuFlags$get(MemorySegment seg, long index) {
        return (int)tagOLEVERB.fuFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fuFlags$set(MemorySegment seg, long index, int x) {
        tagOLEVERB.fuFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfAttribs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grfAttribs"));
    public static VarHandle grfAttribs$VH() {
        return tagOLEVERB.grfAttribs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD grfAttribs;
     * }
     */
    public static int grfAttribs$get(MemorySegment seg) {
        return (int)tagOLEVERB.grfAttribs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD grfAttribs;
     * }
     */
    public static void grfAttribs$set(MemorySegment seg, int x) {
        tagOLEVERB.grfAttribs$VH.set(seg, x);
    }
    public static int grfAttribs$get(MemorySegment seg, long index) {
        return (int)tagOLEVERB.grfAttribs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfAttribs$set(MemorySegment seg, long index, int x) {
        tagOLEVERB.grfAttribs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

