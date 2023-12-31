// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagPOINTER_DEVICE_INFO {
 *     DWORD displayOrientation;
 *     HANDLE device;
 *     POINTER_DEVICE_TYPE pointerDeviceType;
 *     HMONITOR monitor;
 *     ULONG startingCursorId;
 *     USHORT maxActiveContacts;
 *     WCHAR productString[520];
 * };
 * }
 */
public class tagPOINTER_DEVICE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("displayOrientation"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("device"),
        Constants$root.C_LONG$LAYOUT.withName("pointerDeviceType"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("monitor"),
        Constants$root.C_LONG$LAYOUT.withName("startingCursorId"),
        Constants$root.C_SHORT$LAYOUT.withName("maxActiveContacts"),
        MemoryLayout.sequenceLayout(520, Constants$root.C_SHORT$LAYOUT).withName("productString"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagPOINTER_DEVICE_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagPOINTER_DEVICE_INFO.$struct$LAYOUT;
    }
    static final VarHandle displayOrientation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("displayOrientation"));
    public static VarHandle displayOrientation$VH() {
        return tagPOINTER_DEVICE_INFO.displayOrientation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD displayOrientation;
     * }
     */
    public static int displayOrientation$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_INFO.displayOrientation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD displayOrientation;
     * }
     */
    public static void displayOrientation$set(MemorySegment seg, int x) {
        tagPOINTER_DEVICE_INFO.displayOrientation$VH.set(seg, x);
    }
    public static int displayOrientation$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_INFO.displayOrientation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void displayOrientation$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_INFO.displayOrientation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle device$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("device"));
    public static VarHandle device$VH() {
        return tagPOINTER_DEVICE_INFO.device$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE device;
     * }
     */
    public static MemorySegment device$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_DEVICE_INFO.device$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE device;
     * }
     */
    public static void device$set(MemorySegment seg, MemorySegment x) {
        tagPOINTER_DEVICE_INFO.device$VH.set(seg, x);
    }
    public static MemorySegment device$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_DEVICE_INFO.device$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void device$set(MemorySegment seg, long index, MemorySegment x) {
        tagPOINTER_DEVICE_INFO.device$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pointerDeviceType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pointerDeviceType"));
    public static VarHandle pointerDeviceType$VH() {
        return tagPOINTER_DEVICE_INFO.pointerDeviceType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * POINTER_DEVICE_TYPE pointerDeviceType;
     * }
     */
    public static int pointerDeviceType$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_INFO.pointerDeviceType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * POINTER_DEVICE_TYPE pointerDeviceType;
     * }
     */
    public static void pointerDeviceType$set(MemorySegment seg, int x) {
        tagPOINTER_DEVICE_INFO.pointerDeviceType$VH.set(seg, x);
    }
    public static int pointerDeviceType$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_INFO.pointerDeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerDeviceType$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_INFO.pointerDeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle monitor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("monitor"));
    public static VarHandle monitor$VH() {
        return tagPOINTER_DEVICE_INFO.monitor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HMONITOR monitor;
     * }
     */
    public static MemorySegment monitor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_DEVICE_INFO.monitor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HMONITOR monitor;
     * }
     */
    public static void monitor$set(MemorySegment seg, MemorySegment x) {
        tagPOINTER_DEVICE_INFO.monitor$VH.set(seg, x);
    }
    public static MemorySegment monitor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagPOINTER_DEVICE_INFO.monitor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void monitor$set(MemorySegment seg, long index, MemorySegment x) {
        tagPOINTER_DEVICE_INFO.monitor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle startingCursorId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("startingCursorId"));
    public static VarHandle startingCursorId$VH() {
        return tagPOINTER_DEVICE_INFO.startingCursorId$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG startingCursorId;
     * }
     */
    public static int startingCursorId$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_INFO.startingCursorId$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG startingCursorId;
     * }
     */
    public static void startingCursorId$set(MemorySegment seg, int x) {
        tagPOINTER_DEVICE_INFO.startingCursorId$VH.set(seg, x);
    }
    public static int startingCursorId$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_INFO.startingCursorId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void startingCursorId$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_INFO.startingCursorId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle maxActiveContacts$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("maxActiveContacts"));
    public static VarHandle maxActiveContacts$VH() {
        return tagPOINTER_DEVICE_INFO.maxActiveContacts$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USHORT maxActiveContacts;
     * }
     */
    public static short maxActiveContacts$get(MemorySegment seg) {
        return (short)tagPOINTER_DEVICE_INFO.maxActiveContacts$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USHORT maxActiveContacts;
     * }
     */
    public static void maxActiveContacts$set(MemorySegment seg, short x) {
        tagPOINTER_DEVICE_INFO.maxActiveContacts$VH.set(seg, x);
    }
    public static short maxActiveContacts$get(MemorySegment seg, long index) {
        return (short)tagPOINTER_DEVICE_INFO.maxActiveContacts$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void maxActiveContacts$set(MemorySegment seg, long index, short x) {
        tagPOINTER_DEVICE_INFO.maxActiveContacts$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment productString$slice(MemorySegment seg) {
        return seg.asSlice(38, 1040);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


