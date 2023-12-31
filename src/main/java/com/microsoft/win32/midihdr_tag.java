// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct midihdr_tag {
 *     LPSTR lpData;
 *     DWORD dwBufferLength;
 *     DWORD dwBytesRecorded;
 *     DWORD_PTR dwUser;
 *     DWORD dwFlags;
 *     struct midihdr_tag* lpNext;
 *     DWORD_PTR reserved;
 *     DWORD dwOffset;
 *     DWORD_PTR dwReserved[8];
 * };
 * }
 */
public class midihdr_tag {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpData"),
        Constants$root.C_LONG$LAYOUT.withName("dwBufferLength"),
        Constants$root.C_LONG$LAYOUT.withName("dwBytesRecorded"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwUser"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpNext"),
        Constants$root.C_LONG_LONG$LAYOUT.withBitAlignment(32).withName("reserved"),
        Constants$root.C_LONG$LAYOUT.withName("dwOffset"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_LONG_LONG$LAYOUT).withName("dwReserved")
    ).withName("midihdr_tag");
    public static MemoryLayout $LAYOUT() {
        return midihdr_tag.$struct$LAYOUT;
    }
    static final VarHandle lpData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpData"));
    public static VarHandle lpData$VH() {
        return midihdr_tag.lpData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpData;
     * }
     */
    public static MemorySegment lpData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)midihdr_tag.lpData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpData;
     * }
     */
    public static void lpData$set(MemorySegment seg, MemorySegment x) {
        midihdr_tag.lpData$VH.set(seg, x);
    }
    public static MemorySegment lpData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)midihdr_tag.lpData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpData$set(MemorySegment seg, long index, MemorySegment x) {
        midihdr_tag.lpData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBufferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBufferLength"));
    public static VarHandle dwBufferLength$VH() {
        return midihdr_tag.dwBufferLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBufferLength;
     * }
     */
    public static int dwBufferLength$get(MemorySegment seg) {
        return (int)midihdr_tag.dwBufferLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBufferLength;
     * }
     */
    public static void dwBufferLength$set(MemorySegment seg, int x) {
        midihdr_tag.dwBufferLength$VH.set(seg, x);
    }
    public static int dwBufferLength$get(MemorySegment seg, long index) {
        return (int)midihdr_tag.dwBufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBufferLength$set(MemorySegment seg, long index, int x) {
        midihdr_tag.dwBufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBytesRecorded$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBytesRecorded"));
    public static VarHandle dwBytesRecorded$VH() {
        return midihdr_tag.dwBytesRecorded$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBytesRecorded;
     * }
     */
    public static int dwBytesRecorded$get(MemorySegment seg) {
        return (int)midihdr_tag.dwBytesRecorded$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBytesRecorded;
     * }
     */
    public static void dwBytesRecorded$set(MemorySegment seg, int x) {
        midihdr_tag.dwBytesRecorded$VH.set(seg, x);
    }
    public static int dwBytesRecorded$get(MemorySegment seg, long index) {
        return (int)midihdr_tag.dwBytesRecorded$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBytesRecorded$set(MemorySegment seg, long index, int x) {
        midihdr_tag.dwBytesRecorded$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwUser$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwUser"));
    public static VarHandle dwUser$VH() {
        return midihdr_tag.dwUser$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwUser;
     * }
     */
    public static long dwUser$get(MemorySegment seg) {
        return (long)midihdr_tag.dwUser$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwUser;
     * }
     */
    public static void dwUser$set(MemorySegment seg, long x) {
        midihdr_tag.dwUser$VH.set(seg, x);
    }
    public static long dwUser$get(MemorySegment seg, long index) {
        return (long)midihdr_tag.dwUser$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwUser$set(MemorySegment seg, long index, long x) {
        midihdr_tag.dwUser$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return midihdr_tag.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)midihdr_tag.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        midihdr_tag.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)midihdr_tag.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        midihdr_tag.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpNext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpNext"));
    public static VarHandle lpNext$VH() {
        return midihdr_tag.lpNext$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct midihdr_tag* lpNext;
     * }
     */
    public static MemorySegment lpNext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)midihdr_tag.lpNext$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct midihdr_tag* lpNext;
     * }
     */
    public static void lpNext$set(MemorySegment seg, MemorySegment x) {
        midihdr_tag.lpNext$VH.set(seg, x);
    }
    public static MemorySegment lpNext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)midihdr_tag.lpNext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpNext$set(MemorySegment seg, long index, MemorySegment x) {
        midihdr_tag.lpNext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return midihdr_tag.reserved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR reserved;
     * }
     */
    public static long reserved$get(MemorySegment seg) {
        return (long)midihdr_tag.reserved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR reserved;
     * }
     */
    public static void reserved$set(MemorySegment seg, long x) {
        midihdr_tag.reserved$VH.set(seg, x);
    }
    public static long reserved$get(MemorySegment seg, long index) {
        return (long)midihdr_tag.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, long x) {
        midihdr_tag.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOffset"));
    public static VarHandle dwOffset$VH() {
        return midihdr_tag.dwOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOffset;
     * }
     */
    public static int dwOffset$get(MemorySegment seg) {
        return (int)midihdr_tag.dwOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOffset;
     * }
     */
    public static void dwOffset$set(MemorySegment seg, int x) {
        midihdr_tag.dwOffset$VH.set(seg, x);
    }
    public static int dwOffset$get(MemorySegment seg, long index) {
        return (int)midihdr_tag.dwOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOffset$set(MemorySegment seg, long index, int x) {
        midihdr_tag.dwOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dwReserved$slice(MemorySegment seg) {
        return seg.asSlice(48, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


