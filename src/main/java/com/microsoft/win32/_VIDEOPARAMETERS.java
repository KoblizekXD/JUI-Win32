// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _VIDEOPARAMETERS {
 *     GUID Guid;
 *     ULONG dwOffset;
 *     ULONG dwCommand;
 *     ULONG dwFlags;
 *     ULONG dwMode;
 *     ULONG dwTVStandard;
 *     ULONG dwAvailableModes;
 *     ULONG dwAvailableTVStandard;
 *     ULONG dwFlickerFilter;
 *     ULONG dwOverScanX;
 *     ULONG dwOverScanY;
 *     ULONG dwMaxUnscaledX;
 *     ULONG dwMaxUnscaledY;
 *     ULONG dwPositionX;
 *     ULONG dwPositionY;
 *     ULONG dwBrightness;
 *     ULONG dwContrast;
 *     ULONG dwCPType;
 *     ULONG dwCPCommand;
 *     ULONG dwCPStandard;
 *     ULONG dwCPKey;
 *     ULONG bCP_APSTriggerBits;
 *     UCHAR bOEMCopyProtection[256];
 * };
 * }
 */
public class _VIDEOPARAMETERS {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("Guid"),
        Constants$root.C_LONG$LAYOUT.withName("dwOffset"),
        Constants$root.C_LONG$LAYOUT.withName("dwCommand"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwMode"),
        Constants$root.C_LONG$LAYOUT.withName("dwTVStandard"),
        Constants$root.C_LONG$LAYOUT.withName("dwAvailableModes"),
        Constants$root.C_LONG$LAYOUT.withName("dwAvailableTVStandard"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlickerFilter"),
        Constants$root.C_LONG$LAYOUT.withName("dwOverScanX"),
        Constants$root.C_LONG$LAYOUT.withName("dwOverScanY"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxUnscaledX"),
        Constants$root.C_LONG$LAYOUT.withName("dwMaxUnscaledY"),
        Constants$root.C_LONG$LAYOUT.withName("dwPositionX"),
        Constants$root.C_LONG$LAYOUT.withName("dwPositionY"),
        Constants$root.C_LONG$LAYOUT.withName("dwBrightness"),
        Constants$root.C_LONG$LAYOUT.withName("dwContrast"),
        Constants$root.C_LONG$LAYOUT.withName("dwCPType"),
        Constants$root.C_LONG$LAYOUT.withName("dwCPCommand"),
        Constants$root.C_LONG$LAYOUT.withName("dwCPStandard"),
        Constants$root.C_LONG$LAYOUT.withName("dwCPKey"),
        Constants$root.C_LONG$LAYOUT.withName("bCP_APSTriggerBits"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_CHAR$LAYOUT).withName("bOEMCopyProtection")
    ).withName("_VIDEOPARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _VIDEOPARAMETERS.$struct$LAYOUT;
    }
    public static MemorySegment Guid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle dwOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOffset"));
    public static VarHandle dwOffset$VH() {
        return _VIDEOPARAMETERS.dwOffset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOffset;
     * }
     */
    public static int dwOffset$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwOffset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOffset;
     * }
     */
    public static void dwOffset$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwOffset$VH.set(seg, x);
    }
    public static int dwOffset$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOffset$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCommand$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCommand"));
    public static VarHandle dwCommand$VH() {
        return _VIDEOPARAMETERS.dwCommand$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCommand;
     * }
     */
    public static int dwCommand$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwCommand$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCommand;
     * }
     */
    public static void dwCommand$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwCommand$VH.set(seg, x);
    }
    public static int dwCommand$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwCommand$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCommand$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwCommand$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _VIDEOPARAMETERS.dwFlags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwFlags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMode"));
    public static VarHandle dwMode$VH() {
        return _VIDEOPARAMETERS.dwMode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMode;
     * }
     */
    public static int dwMode$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwMode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMode;
     * }
     */
    public static void dwMode$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwMode$VH.set(seg, x);
    }
    public static int dwMode$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMode$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTVStandard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTVStandard"));
    public static VarHandle dwTVStandard$VH() {
        return _VIDEOPARAMETERS.dwTVStandard$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwTVStandard;
     * }
     */
    public static int dwTVStandard$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwTVStandard$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwTVStandard;
     * }
     */
    public static void dwTVStandard$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwTVStandard$VH.set(seg, x);
    }
    public static int dwTVStandard$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwTVStandard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTVStandard$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwTVStandard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAvailableModes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAvailableModes"));
    public static VarHandle dwAvailableModes$VH() {
        return _VIDEOPARAMETERS.dwAvailableModes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwAvailableModes;
     * }
     */
    public static int dwAvailableModes$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwAvailableModes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwAvailableModes;
     * }
     */
    public static void dwAvailableModes$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwAvailableModes$VH.set(seg, x);
    }
    public static int dwAvailableModes$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwAvailableModes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAvailableModes$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwAvailableModes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwAvailableTVStandard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAvailableTVStandard"));
    public static VarHandle dwAvailableTVStandard$VH() {
        return _VIDEOPARAMETERS.dwAvailableTVStandard$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwAvailableTVStandard;
     * }
     */
    public static int dwAvailableTVStandard$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwAvailableTVStandard$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwAvailableTVStandard;
     * }
     */
    public static void dwAvailableTVStandard$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwAvailableTVStandard$VH.set(seg, x);
    }
    public static int dwAvailableTVStandard$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwAvailableTVStandard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAvailableTVStandard$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwAvailableTVStandard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlickerFilter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlickerFilter"));
    public static VarHandle dwFlickerFilter$VH() {
        return _VIDEOPARAMETERS.dwFlickerFilter$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlickerFilter;
     * }
     */
    public static int dwFlickerFilter$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwFlickerFilter$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlickerFilter;
     * }
     */
    public static void dwFlickerFilter$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwFlickerFilter$VH.set(seg, x);
    }
    public static int dwFlickerFilter$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwFlickerFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlickerFilter$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwFlickerFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOverScanX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOverScanX"));
    public static VarHandle dwOverScanX$VH() {
        return _VIDEOPARAMETERS.dwOverScanX$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOverScanX;
     * }
     */
    public static int dwOverScanX$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwOverScanX$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOverScanX;
     * }
     */
    public static void dwOverScanX$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwOverScanX$VH.set(seg, x);
    }
    public static int dwOverScanX$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwOverScanX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOverScanX$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwOverScanX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOverScanY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOverScanY"));
    public static VarHandle dwOverScanY$VH() {
        return _VIDEOPARAMETERS.dwOverScanY$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwOverScanY;
     * }
     */
    public static int dwOverScanY$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwOverScanY$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwOverScanY;
     * }
     */
    public static void dwOverScanY$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwOverScanY$VH.set(seg, x);
    }
    public static int dwOverScanY$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwOverScanY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOverScanY$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwOverScanY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxUnscaledX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxUnscaledX"));
    public static VarHandle dwMaxUnscaledX$VH() {
        return _VIDEOPARAMETERS.dwMaxUnscaledX$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledX;
     * }
     */
    public static int dwMaxUnscaledX$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwMaxUnscaledX$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledX;
     * }
     */
    public static void dwMaxUnscaledX$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwMaxUnscaledX$VH.set(seg, x);
    }
    public static int dwMaxUnscaledX$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwMaxUnscaledX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxUnscaledX$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwMaxUnscaledX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMaxUnscaledY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMaxUnscaledY"));
    public static VarHandle dwMaxUnscaledY$VH() {
        return _VIDEOPARAMETERS.dwMaxUnscaledY$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledY;
     * }
     */
    public static int dwMaxUnscaledY$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwMaxUnscaledY$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwMaxUnscaledY;
     * }
     */
    public static void dwMaxUnscaledY$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwMaxUnscaledY$VH.set(seg, x);
    }
    public static int dwMaxUnscaledY$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwMaxUnscaledY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMaxUnscaledY$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwMaxUnscaledY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPositionX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPositionX"));
    public static VarHandle dwPositionX$VH() {
        return _VIDEOPARAMETERS.dwPositionX$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwPositionX;
     * }
     */
    public static int dwPositionX$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwPositionX$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwPositionX;
     * }
     */
    public static void dwPositionX$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwPositionX$VH.set(seg, x);
    }
    public static int dwPositionX$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwPositionX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPositionX$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwPositionX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPositionY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPositionY"));
    public static VarHandle dwPositionY$VH() {
        return _VIDEOPARAMETERS.dwPositionY$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwPositionY;
     * }
     */
    public static int dwPositionY$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwPositionY$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwPositionY;
     * }
     */
    public static void dwPositionY$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwPositionY$VH.set(seg, x);
    }
    public static int dwPositionY$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwPositionY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPositionY$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwPositionY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBrightness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwBrightness"));
    public static VarHandle dwBrightness$VH() {
        return _VIDEOPARAMETERS.dwBrightness$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwBrightness;
     * }
     */
    public static int dwBrightness$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwBrightness$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwBrightness;
     * }
     */
    public static void dwBrightness$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwBrightness$VH.set(seg, x);
    }
    public static int dwBrightness$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwBrightness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBrightness$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwBrightness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwContrast$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwContrast"));
    public static VarHandle dwContrast$VH() {
        return _VIDEOPARAMETERS.dwContrast$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwContrast;
     * }
     */
    public static int dwContrast$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwContrast$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwContrast;
     * }
     */
    public static void dwContrast$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwContrast$VH.set(seg, x);
    }
    public static int dwContrast$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwContrast$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContrast$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwContrast$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCPType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCPType"));
    public static VarHandle dwCPType$VH() {
        return _VIDEOPARAMETERS.dwCPType$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPType;
     * }
     */
    public static int dwCPType$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwCPType$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPType;
     * }
     */
    public static void dwCPType$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwCPType$VH.set(seg, x);
    }
    public static int dwCPType$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwCPType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPType$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwCPType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCPCommand$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCPCommand"));
    public static VarHandle dwCPCommand$VH() {
        return _VIDEOPARAMETERS.dwCPCommand$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPCommand;
     * }
     */
    public static int dwCPCommand$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwCPCommand$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPCommand;
     * }
     */
    public static void dwCPCommand$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwCPCommand$VH.set(seg, x);
    }
    public static int dwCPCommand$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwCPCommand$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPCommand$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwCPCommand$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCPStandard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCPStandard"));
    public static VarHandle dwCPStandard$VH() {
        return _VIDEOPARAMETERS.dwCPStandard$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPStandard;
     * }
     */
    public static int dwCPStandard$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwCPStandard$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPStandard;
     * }
     */
    public static void dwCPStandard$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwCPStandard$VH.set(seg, x);
    }
    public static int dwCPStandard$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwCPStandard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPStandard$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwCPStandard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCPKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCPKey"));
    public static VarHandle dwCPKey$VH() {
        return _VIDEOPARAMETERS.dwCPKey$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwCPKey;
     * }
     */
    public static int dwCPKey$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.dwCPKey$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwCPKey;
     * }
     */
    public static void dwCPKey$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.dwCPKey$VH.set(seg, x);
    }
    public static int dwCPKey$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.dwCPKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCPKey$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.dwCPKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bCP_APSTriggerBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bCP_APSTriggerBits"));
    public static VarHandle bCP_APSTriggerBits$VH() {
        return _VIDEOPARAMETERS.bCP_APSTriggerBits$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG bCP_APSTriggerBits;
     * }
     */
    public static int bCP_APSTriggerBits$get(MemorySegment seg) {
        return (int)_VIDEOPARAMETERS.bCP_APSTriggerBits$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG bCP_APSTriggerBits;
     * }
     */
    public static void bCP_APSTriggerBits$set(MemorySegment seg, int x) {
        _VIDEOPARAMETERS.bCP_APSTriggerBits$VH.set(seg, x);
    }
    public static int bCP_APSTriggerBits$get(MemorySegment seg, long index) {
        return (int)_VIDEOPARAMETERS.bCP_APSTriggerBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bCP_APSTriggerBits$set(MemorySegment seg, long index, int x) {
        _VIDEOPARAMETERS.bCP_APSTriggerBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bOEMCopyProtection$slice(MemorySegment seg) {
        return seg.asSlice(100, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

