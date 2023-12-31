// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DISPLAYCONFIG_PATH_TARGET_INFO {
 *     LUID adapterId;
 *     UINT32 id;
 *     union {
 *         UINT32 modeInfoIdx;
 *         struct {
 *              *             UINT32 desktopModeInfoIdx;
 *             UINT32 targetModeInfoIdx;
 *         };
 *     };
 *     DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology;
 *     DISPLAYCONFIG_ROTATION rotation;
 *     DISPLAYCONFIG_SCALING scaling;
 *     DISPLAYCONFIG_RATIONAL refreshRate;
 *     DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering;
 *     BOOL targetAvailable;
 *     UINT32 statusFlags;
 * };
 * }
 */
public class DISPLAYCONFIG_PATH_TARGET_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("adapterId"),
        Constants$root.C_LONG$LAYOUT.withName("id"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("modeInfoIdx"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32)
            ).withName("$anon$0")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("outputTechnology"),
        Constants$root.C_LONG$LAYOUT.withName("rotation"),
        Constants$root.C_LONG$LAYOUT.withName("scaling"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Numerator"),
            Constants$root.C_LONG$LAYOUT.withName("Denominator")
        ).withName("refreshRate"),
        Constants$root.C_LONG$LAYOUT.withName("scanLineOrdering"),
        Constants$root.C_LONG$LAYOUT.withName("targetAvailable"),
        Constants$root.C_LONG$LAYOUT.withName("statusFlags")
    ).withName("DISPLAYCONFIG_PATH_TARGET_INFO");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.$struct$LAYOUT;
    }
    public static MemorySegment adapterId$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle modeInfoIdx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("modeInfoIdx"));
    public static VarHandle modeInfoIdx$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.modeInfoIdx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 modeInfoIdx;
     * }
     */
    public static int modeInfoIdx$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.modeInfoIdx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 modeInfoIdx;
     * }
     */
    public static void modeInfoIdx$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.modeInfoIdx$VH.set(seg, x);
    }
    public static int modeInfoIdx$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.modeInfoIdx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void modeInfoIdx$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.modeInfoIdx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle outputTechnology$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("outputTechnology"));
    public static VarHandle outputTechnology$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.outputTechnology$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology;
     * }
     */
    public static int outputTechnology$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.outputTechnology$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology;
     * }
     */
    public static void outputTechnology$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.outputTechnology$VH.set(seg, x);
    }
    public static int outputTechnology$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.outputTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void outputTechnology$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.outputTechnology$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rotation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rotation"));
    public static VarHandle rotation$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.rotation$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPLAYCONFIG_ROTATION rotation;
     * }
     */
    public static int rotation$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.rotation$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPLAYCONFIG_ROTATION rotation;
     * }
     */
    public static void rotation$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.rotation$VH.set(seg, x);
    }
    public static int rotation$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.rotation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rotation$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.rotation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle scaling$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scaling"));
    public static VarHandle scaling$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.scaling$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPLAYCONFIG_SCALING scaling;
     * }
     */
    public static int scaling$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.scaling$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPLAYCONFIG_SCALING scaling;
     * }
     */
    public static void scaling$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.scaling$VH.set(seg, x);
    }
    public static int scaling$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.scaling$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scaling$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.scaling$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment refreshRate$slice(MemorySegment seg) {
        return seg.asSlice(28, 8);
    }
    static final VarHandle scanLineOrdering$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scanLineOrdering"));
    public static VarHandle scanLineOrdering$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.scanLineOrdering$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering;
     * }
     */
    public static int scanLineOrdering$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.scanLineOrdering$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPLAYCONFIG_SCANLINE_ORDERING scanLineOrdering;
     * }
     */
    public static void scanLineOrdering$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.scanLineOrdering$VH.set(seg, x);
    }
    public static int scanLineOrdering$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.scanLineOrdering$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scanLineOrdering$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.scanLineOrdering$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle targetAvailable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("targetAvailable"));
    public static VarHandle targetAvailable$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.targetAvailable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL targetAvailable;
     * }
     */
    public static int targetAvailable$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.targetAvailable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL targetAvailable;
     * }
     */
    public static void targetAvailable$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.targetAvailable$VH.set(seg, x);
    }
    public static int targetAvailable$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.targetAvailable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void targetAvailable$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.targetAvailable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle statusFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("statusFlags"));
    public static VarHandle statusFlags$VH() {
        return DISPLAYCONFIG_PATH_TARGET_INFO.statusFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 statusFlags;
     * }
     */
    public static int statusFlags$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.statusFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 statusFlags;
     * }
     */
    public static void statusFlags$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.statusFlags$VH.set(seg, x);
    }
    public static int statusFlags$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_PATH_TARGET_INFO.statusFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void statusFlags$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_PATH_TARGET_INFO.statusFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


