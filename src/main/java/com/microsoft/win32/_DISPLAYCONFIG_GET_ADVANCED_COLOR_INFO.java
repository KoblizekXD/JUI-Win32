// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     union {
 *         struct {
 *              *             UINT32 advancedColorSupported;
 *             UINT32 advancedColorEnabled;
 *             UINT32 wideColorEnforced;
 *             UINT32 advancedColorForceDisabled;
 *             UINT32 reserved;
 *         };
 *         UINT32 value;
 *     };
 *     DISPLAYCONFIG_COLOR_ENCODING colorEncoding;
 *     UINT32 bitsPerColorChannel;
 * };
 * }
 */
public class _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("type"),
            Constants$root.C_LONG$LAYOUT.withName("size"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("adapterId"),
            Constants$root.C_LONG$LAYOUT.withName("id")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("value")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("colorEncoding"),
        Constants$root.C_LONG$LAYOUT.withName("bitsPerColorChannel")
    ).withName("_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO");
    public static MemoryLayout $LAYOUT() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 value;
     * }
     */
    public static int value$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 value;
     * }
     */
    public static void value$set(MemorySegment seg, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle colorEncoding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("colorEncoding"));
    public static VarHandle colorEncoding$VH() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPLAYCONFIG_COLOR_ENCODING colorEncoding;
     * }
     */
    public static int colorEncoding$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPLAYCONFIG_COLOR_ENCODING colorEncoding;
     * }
     */
    public static void colorEncoding$set(MemorySegment seg, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.set(seg, x);
    }
    public static int colorEncoding$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void colorEncoding$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.colorEncoding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bitsPerColorChannel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bitsPerColorChannel"));
    public static VarHandle bitsPerColorChannel$VH() {
        return _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 bitsPerColorChannel;
     * }
     */
    public static int bitsPerColorChannel$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 bitsPerColorChannel;
     * }
     */
    public static void bitsPerColorChannel$set(MemorySegment seg, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.set(seg, x);
    }
    public static int bitsPerColorChannel$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bitsPerColorChannel$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO.bitsPerColorChannel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


