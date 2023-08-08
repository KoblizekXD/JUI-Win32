// Generated by jextract

package com.microsoft.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagACTCTX_SECTION_KEYED_DATA_2600 {
 *     ULONG cbSize;
 *     ULONG ulDataFormatVersion;
 *     PVOID lpData;
 *     ULONG ulLength;
 *     PVOID lpSectionGlobalData;
 *     ULONG ulSectionGlobalDataLength;
 *     PVOID lpSectionBase;
 *     ULONG ulSectionTotalLength;
 *     HANDLE hActCtx;
 *     ULONG ulAssemblyRosterIndex;
 * };
 * }
 */
public class tagACTCTX_SECTION_KEYED_DATA_2600 {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("ulDataFormatVersion"),
        Constants$root.C_POINTER$LAYOUT.withName("lpData"),
        Constants$root.C_LONG$LAYOUT.withName("ulLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpSectionGlobalData"),
        Constants$root.C_LONG$LAYOUT.withName("ulSectionGlobalDataLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpSectionBase"),
        Constants$root.C_LONG$LAYOUT.withName("ulSectionTotalLength"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hActCtx"),
        Constants$root.C_LONG$LAYOUT.withName("ulAssemblyRosterIndex"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagACTCTX_SECTION_KEYED_DATA_2600");
    public static MemoryLayout $LAYOUT() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.cbSize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.cbSize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulDataFormatVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulDataFormatVersion"));
    public static VarHandle ulDataFormatVersion$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.ulDataFormatVersion$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ulDataFormatVersion;
     * }
     */
    public static int ulDataFormatVersion$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulDataFormatVersion$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ulDataFormatVersion;
     * }
     */
    public static void ulDataFormatVersion$set(MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulDataFormatVersion$VH.set(seg, x);
    }
    public static int ulDataFormatVersion$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulDataFormatVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulDataFormatVersion$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulDataFormatVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpData"));
    public static VarHandle lpData$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.lpData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID lpData;
     * }
     */
    public static MemorySegment lpData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.lpData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID lpData;
     * }
     */
    public static void lpData$set(MemorySegment seg, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.lpData$VH.set(seg, x);
    }
    public static MemorySegment lpData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.lpData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpData$set(MemorySegment seg, long index, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.lpData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulLength"));
    public static VarHandle ulLength$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.ulLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ulLength;
     * }
     */
    public static int ulLength$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ulLength;
     * }
     */
    public static void ulLength$set(MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulLength$VH.set(seg, x);
    }
    public static int ulLength$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulLength$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSectionGlobalData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSectionGlobalData"));
    public static VarHandle lpSectionGlobalData$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionGlobalData$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID lpSectionGlobalData;
     * }
     */
    public static MemorySegment lpSectionGlobalData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionGlobalData$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID lpSectionGlobalData;
     * }
     */
    public static void lpSectionGlobalData$set(MemorySegment seg, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionGlobalData$VH.set(seg, x);
    }
    public static MemorySegment lpSectionGlobalData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionGlobalData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSectionGlobalData$set(MemorySegment seg, long index, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionGlobalData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulSectionGlobalDataLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSectionGlobalDataLength"));
    public static VarHandle ulSectionGlobalDataLength$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionGlobalDataLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ulSectionGlobalDataLength;
     * }
     */
    public static int ulSectionGlobalDataLength$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionGlobalDataLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ulSectionGlobalDataLength;
     * }
     */
    public static void ulSectionGlobalDataLength$set(MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionGlobalDataLength$VH.set(seg, x);
    }
    public static int ulSectionGlobalDataLength$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionGlobalDataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSectionGlobalDataLength$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionGlobalDataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpSectionBase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpSectionBase"));
    public static VarHandle lpSectionBase$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionBase$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID lpSectionBase;
     * }
     */
    public static MemorySegment lpSectionBase$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionBase$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID lpSectionBase;
     * }
     */
    public static void lpSectionBase$set(MemorySegment seg, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionBase$VH.set(seg, x);
    }
    public static MemorySegment lpSectionBase$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSectionBase$set(MemorySegment seg, long index, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.lpSectionBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulSectionTotalLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSectionTotalLength"));
    public static VarHandle ulSectionTotalLength$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionTotalLength$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ulSectionTotalLength;
     * }
     */
    public static int ulSectionTotalLength$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionTotalLength$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ulSectionTotalLength;
     * }
     */
    public static void ulSectionTotalLength$set(MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionTotalLength$VH.set(seg, x);
    }
    public static int ulSectionTotalLength$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionTotalLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSectionTotalLength$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulSectionTotalLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hActCtx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hActCtx"));
    public static VarHandle hActCtx$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.hActCtx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hActCtx;
     * }
     */
    public static MemorySegment hActCtx$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.hActCtx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hActCtx;
     * }
     */
    public static void hActCtx$set(MemorySegment seg, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.hActCtx$VH.set(seg, x);
    }
    public static MemorySegment hActCtx$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)tagACTCTX_SECTION_KEYED_DATA_2600.hActCtx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hActCtx$set(MemorySegment seg, long index, MemorySegment x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.hActCtx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulAssemblyRosterIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulAssemblyRosterIndex"));
    public static VarHandle ulAssemblyRosterIndex$VH() {
        return tagACTCTX_SECTION_KEYED_DATA_2600.ulAssemblyRosterIndex$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ulAssemblyRosterIndex;
     * }
     */
    public static int ulAssemblyRosterIndex$get(MemorySegment seg) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulAssemblyRosterIndex$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ulAssemblyRosterIndex;
     * }
     */
    public static void ulAssemblyRosterIndex$set(MemorySegment seg, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulAssemblyRosterIndex$VH.set(seg, x);
    }
    public static int ulAssemblyRosterIndex$get(MemorySegment seg, long index) {
        return (int)tagACTCTX_SECTION_KEYED_DATA_2600.ulAssemblyRosterIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulAssemblyRosterIndex$set(MemorySegment seg, long index, int x) {
        tagACTCTX_SECTION_KEYED_DATA_2600.ulAssemblyRosterIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

