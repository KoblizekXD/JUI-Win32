// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagRID_DEVICE_INFO_KEYBOARD {
 *     DWORD dwType;
 *     DWORD dwSubType;
 *     DWORD dwKeyboardMode;
 *     DWORD dwNumberOfFunctionKeys;
 *     DWORD dwNumberOfIndicators;
 *     DWORD dwNumberOfKeysTotal;
 * };
 * }
 */
public class tagRID_DEVICE_INFO_KEYBOARD {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwType"),
        Constants$root.C_LONG$LAYOUT.withName("dwSubType"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeyboardMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfFunctionKeys"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfIndicators"),
        Constants$root.C_LONG$LAYOUT.withName("dwNumberOfKeysTotal")
    ).withName("tagRID_DEVICE_INFO_KEYBOARD");
    public static MemoryLayout $LAYOUT() {
        return tagRID_DEVICE_INFO_KEYBOARD.$struct$LAYOUT;
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return tagRID_DEVICE_INFO_KEYBOARD.dwType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static int dwType$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwType;
     * }
     */
    public static void dwType$set(MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSubType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSubType"));
    public static VarHandle dwSubType$VH() {
        return tagRID_DEVICE_INFO_KEYBOARD.dwSubType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSubType;
     * }
     */
    public static int dwSubType$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwSubType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSubType;
     * }
     */
    public static void dwSubType$set(MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwSubType$VH.set(seg, x);
    }
    public static int dwSubType$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwSubType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSubType$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwSubType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeyboardMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeyboardMode"));
    public static VarHandle dwKeyboardMode$VH() {
        return tagRID_DEVICE_INFO_KEYBOARD.dwKeyboardMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeyboardMode;
     * }
     */
    public static int dwKeyboardMode$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwKeyboardMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeyboardMode;
     * }
     */
    public static void dwKeyboardMode$set(MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwKeyboardMode$VH.set(seg, x);
    }
    public static int dwKeyboardMode$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwKeyboardMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeyboardMode$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwKeyboardMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfFunctionKeys$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfFunctionKeys"));
    public static VarHandle dwNumberOfFunctionKeys$VH() {
        return tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfFunctionKeys$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfFunctionKeys;
     * }
     */
    public static int dwNumberOfFunctionKeys$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfFunctionKeys$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfFunctionKeys;
     * }
     */
    public static void dwNumberOfFunctionKeys$set(MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfFunctionKeys$VH.set(seg, x);
    }
    public static int dwNumberOfFunctionKeys$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfFunctionKeys$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfFunctionKeys$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfFunctionKeys$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfIndicators$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfIndicators"));
    public static VarHandle dwNumberOfIndicators$VH() {
        return tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfIndicators$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfIndicators;
     * }
     */
    public static int dwNumberOfIndicators$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfIndicators$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfIndicators;
     * }
     */
    public static void dwNumberOfIndicators$set(MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfIndicators$VH.set(seg, x);
    }
    public static int dwNumberOfIndicators$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfIndicators$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfIndicators$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfIndicators$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfKeysTotal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwNumberOfKeysTotal"));
    public static VarHandle dwNumberOfKeysTotal$VH() {
        return tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfKeysTotal$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfKeysTotal;
     * }
     */
    public static int dwNumberOfKeysTotal$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfKeysTotal$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfKeysTotal;
     * }
     */
    public static void dwNumberOfKeysTotal$set(MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfKeysTotal$VH.set(seg, x);
    }
    public static int dwNumberOfKeysTotal$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfKeysTotal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfKeysTotal$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_KEYBOARD.dwNumberOfKeysTotal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


