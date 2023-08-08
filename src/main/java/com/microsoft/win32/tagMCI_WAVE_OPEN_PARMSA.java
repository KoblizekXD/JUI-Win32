// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMCI_WAVE_OPEN_PARMSA {
 *     DWORD_PTR dwCallback;
 *     MCIDEVICEID wDeviceID;
 *     LPCSTR lpstrDeviceType;
 *     LPCSTR lpstrElementName;
 *     LPCSTR lpstrAlias;
 *     DWORD dwBufferSeconds;
 * };
 * }
 */
public class tagMCI_WAVE_OPEN_PARMSA {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("dwCallback"),
        Constants$root.C_LONG$LAYOUT.withName("wDeviceID"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpstrDeviceType"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpstrElementName"),
        Constants$root.C_POINTER$LAYOUT.withBitAlignment(32).withName("lpstrAlias"),
        Constants$root.C_LONG$LAYOUT.withName("dwBufferSeconds")
    ).withName("tagMCI_WAVE_OPEN_PARMSA");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_WAVE_OPEN_PARMSA.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_WAVE_OPEN_PARMSA.dwCallback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_WAVE_OPEN_PARMSA.dwCallback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static void dwCallback$set(MemorySegment seg, long x) {
        tagMCI_WAVE_OPEN_PARMSA.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_WAVE_OPEN_PARMSA.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_WAVE_OPEN_PARMSA.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDeviceID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDeviceID"));
    public static VarHandle wDeviceID$VH() {
        return tagMCI_WAVE_OPEN_PARMSA.wDeviceID$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MCIDEVICEID wDeviceID;
     * }
     */
    public static int wDeviceID$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_OPEN_PARMSA.wDeviceID$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MCIDEVICEID wDeviceID;
     * }
     */
    public static void wDeviceID$set(MemorySegment seg, int x) {
        tagMCI_WAVE_OPEN_PARMSA.wDeviceID$VH.set(seg, x);
    }
    public static int wDeviceID$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_OPEN_PARMSA.wDeviceID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDeviceID$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_OPEN_PARMSA.wDeviceID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrDeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrDeviceType"));
    public static VarHandle lpstrDeviceType$VH() {
        return tagMCI_WAVE_OPEN_PARMSA.lpstrDeviceType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrDeviceType;
     * }
     */
    public static MemorySegment lpstrDeviceType$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMCI_WAVE_OPEN_PARMSA.lpstrDeviceType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrDeviceType;
     * }
     */
    public static void lpstrDeviceType$set(MemorySegment seg, MemorySegment x) {
        tagMCI_WAVE_OPEN_PARMSA.lpstrDeviceType$VH.set(seg, x);
    }
    public static MemorySegment lpstrDeviceType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMCI_WAVE_OPEN_PARMSA.lpstrDeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrDeviceType$set(MemorySegment seg, long index, MemorySegment x) {
        tagMCI_WAVE_OPEN_PARMSA.lpstrDeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrElementName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrElementName"));
    public static VarHandle lpstrElementName$VH() {
        return tagMCI_WAVE_OPEN_PARMSA.lpstrElementName$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrElementName;
     * }
     */
    public static MemorySegment lpstrElementName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMCI_WAVE_OPEN_PARMSA.lpstrElementName$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrElementName;
     * }
     */
    public static void lpstrElementName$set(MemorySegment seg, MemorySegment x) {
        tagMCI_WAVE_OPEN_PARMSA.lpstrElementName$VH.set(seg, x);
    }
    public static MemorySegment lpstrElementName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMCI_WAVE_OPEN_PARMSA.lpstrElementName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrElementName$set(MemorySegment seg, long index, MemorySegment x) {
        tagMCI_WAVE_OPEN_PARMSA.lpstrElementName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrAlias$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrAlias"));
    public static VarHandle lpstrAlias$VH() {
        return tagMCI_WAVE_OPEN_PARMSA.lpstrAlias$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpstrAlias;
     * }
     */
    public static MemorySegment lpstrAlias$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagMCI_WAVE_OPEN_PARMSA.lpstrAlias$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpstrAlias;
     * }
     */
    public static void lpstrAlias$set(MemorySegment seg, MemorySegment x) {
        tagMCI_WAVE_OPEN_PARMSA.lpstrAlias$VH.set(seg, x);
    }
    public static MemorySegment lpstrAlias$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagMCI_WAVE_OPEN_PARMSA.lpstrAlias$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrAlias$set(MemorySegment seg, long index, MemorySegment x) {
        tagMCI_WAVE_OPEN_PARMSA.lpstrAlias$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBufferSeconds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBufferSeconds"));
    public static VarHandle dwBufferSeconds$VH() {
        return tagMCI_WAVE_OPEN_PARMSA.dwBufferSeconds$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBufferSeconds;
     * }
     */
    public static int dwBufferSeconds$get(MemorySegment seg) {
        return (int)tagMCI_WAVE_OPEN_PARMSA.dwBufferSeconds$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBufferSeconds;
     * }
     */
    public static void dwBufferSeconds$set(MemorySegment seg, int x) {
        tagMCI_WAVE_OPEN_PARMSA.dwBufferSeconds$VH.set(seg, x);
    }
    public static int dwBufferSeconds$get(MemorySegment seg, long index) {
        return (int)tagMCI_WAVE_OPEN_PARMSA.dwBufferSeconds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBufferSeconds$set(MemorySegment seg, long index, int x) {
        tagMCI_WAVE_OPEN_PARMSA.dwBufferSeconds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


