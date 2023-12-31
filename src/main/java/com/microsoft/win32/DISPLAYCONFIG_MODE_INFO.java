// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DISPLAYCONFIG_MODE_INFO {
 *     DISPLAYCONFIG_MODE_INFO_TYPE infoType;
 *     UINT32 id;
 *     LUID adapterId;
 *     union {
 *         DISPLAYCONFIG_TARGET_MODE targetMode;
 *         DISPLAYCONFIG_SOURCE_MODE sourceMode;
 *         DISPLAYCONFIG_DESKTOP_IMAGE_INFO desktopImageInfo;
 *     };
 * };
 * }
 */
public class DISPLAYCONFIG_MODE_INFO {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("infoType"),
        Constants$root.C_LONG$LAYOUT.withName("id"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("adapterId"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("pixelRate"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("Numerator"),
                        Constants$root.C_LONG$LAYOUT.withName("Denominator")
                    ).withName("hSyncFreq"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("Numerator"),
                        Constants$root.C_LONG$LAYOUT.withName("Denominator")
                    ).withName("vSyncFreq"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cx"),
                        Constants$root.C_LONG$LAYOUT.withName("cy")
                    ).withName("activeSize"),
                    MemoryLayout.structLayout(
                        Constants$root.C_LONG$LAYOUT.withName("cx"),
                        Constants$root.C_LONG$LAYOUT.withName("cy")
                    ).withName("totalSize"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.paddingLayout(32)
                        ).withName("AdditionalSignalInfo"),
                        Constants$root.C_LONG$LAYOUT.withName("videoStandard")
                    ).withName("$anon$0"),
                    Constants$root.C_LONG$LAYOUT.withName("scanLineOrdering")
                ).withName("targetVideoSignalInfo")
            ).withName("targetMode"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("width"),
                Constants$root.C_LONG$LAYOUT.withName("height"),
                Constants$root.C_LONG$LAYOUT.withName("pixelFormat"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("x"),
                    Constants$root.C_LONG$LAYOUT.withName("y")
                ).withName("position")
            ).withName("sourceMode"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("x"),
                    Constants$root.C_LONG$LAYOUT.withName("y")
                ).withName("PathSourceSize"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("left"),
                    Constants$root.C_LONG$LAYOUT.withName("top"),
                    Constants$root.C_LONG$LAYOUT.withName("right"),
                    Constants$root.C_LONG$LAYOUT.withName("bottom")
                ).withName("DesktopImageRegion"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG$LAYOUT.withName("left"),
                    Constants$root.C_LONG$LAYOUT.withName("top"),
                    Constants$root.C_LONG$LAYOUT.withName("right"),
                    Constants$root.C_LONG$LAYOUT.withName("bottom")
                ).withName("DesktopImageClip")
            ).withName("desktopImageInfo")
        ).withName("$anon$0")
    ).withName("DISPLAYCONFIG_MODE_INFO");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_MODE_INFO.$struct$LAYOUT;
    }
    static final VarHandle infoType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("infoType"));
    public static VarHandle infoType$VH() {
        return DISPLAYCONFIG_MODE_INFO.infoType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DISPLAYCONFIG_MODE_INFO_TYPE infoType;
     * }
     */
    public static int infoType$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_MODE_INFO.infoType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DISPLAYCONFIG_MODE_INFO_TYPE infoType;
     * }
     */
    public static void infoType$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_MODE_INFO.infoType$VH.set(seg, x);
    }
    public static int infoType$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_MODE_INFO.infoType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void infoType$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_MODE_INFO.infoType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("id"));
    public static VarHandle id$VH() {
        return DISPLAYCONFIG_MODE_INFO.id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 id;
     * }
     */
    public static int id$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_MODE_INFO.id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 id;
     * }
     */
    public static void id$set(MemorySegment seg, int x) {
        DISPLAYCONFIG_MODE_INFO.id$VH.set(seg, x);
    }
    public static int id$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_MODE_INFO.id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void id$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_MODE_INFO.id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment adapterId$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment targetMode$slice(MemorySegment seg) {
        return seg.asSlice(16, 48);
    }
    public static MemorySegment sourceMode$slice(MemorySegment seg) {
        return seg.asSlice(16, 20);
    }
    public static MemorySegment desktopImageInfo$slice(MemorySegment seg) {
        return seg.asSlice(16, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


